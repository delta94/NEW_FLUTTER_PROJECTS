import 'package:flutter/widgets.dart';
import 'package:seab1ird.letitgo/widgets/animated_background/AnimatedBackground.dart';
import 'package:seab1ird.letitgo/widgets/animated_background/ImageHelper.dart';
import 'dart:ui' as ui;
import 'Behavior.dart';
import 'ParticleOptions.dart';
import 'Particles.dart';

/// The base for behaviours that render particles on an [AnimatedBackground].
abstract class ParticleBehaviour extends Behaviour {
  /// The list of particles used by the particle behaviour to hold the spawned particles.
  @protected
  List<Particle> particles = [];

  @override
  bool get isInitialized => particles != null && particles.isNotEmpty;

  List<Rect> _particleImageSrcs = [];

  List<ui.Image> _particleImages = [];
  List<Function> _pendingConversions = [];

  Paint _paint;
  Paint get particlePaint => _paint;
  set particlePaint(Paint value) {
    if (value == null) {
      _paint = Paint()
        ..strokeCap = StrokeCap.round
        ..style = PaintingStyle.fill
        ..strokeWidth = 1.0;
    } else {
      _paint = value;
    }

    if (_paint.strokeWidth <= 0) _paint.strokeWidth = 1.0;
  }

  ParticleOptions _options;

  /// Gets the particle options used to configure this behaviour.
  ParticleOptions get options => _options;

  /// Set the particle options used to configure this behaviour.
  ///
  /// Changing this value will cause the currently spawned particles to update.
  set options(ParticleOptions value) {
    assert(value != null);
    if (value == _options) return;
    ParticleOptions oldOptions = _options;
    _options = value;

    if (_options.images == null)
      _particleImages = null;
    else if (_particleImages == null || oldOptions.images != _options.images)
      for (var i = 0; i < options.images.length; i++) {
        _convertImage(options.images, i);
      }

    onOptionsUpdate(oldOptions);
  }

  /// Creates a new particle behaviour.
  ///
  /// Default values will be assigned to the parameters if not specified.
  ParticleBehaviour({
    ParticleOptions options = const ParticleOptions(),
    Paint paint,
  }) : assert(options != null) {
    _options = options;
    this.particlePaint = paint;
    if (options.images != null) {
      for (var i = 0; i < options.images.length; i++) {
        _convertImage(options.images, i);
      }
    }
  }

  @override
  void init() {
    particles = generateParticles(options.particleCount);
  }

  @override
  void initFrom(Behaviour oldBehaviour) {
    if (oldBehaviour is ParticleBehaviour) {
      particles = oldBehaviour.particles;

      // keep old image if waiting for a new one
      if (options.images != null &&
          (_particleImages == null || _particleImages.isEmpty)) {
        _particleImages = oldBehaviour._particleImages;
        _particleImageSrcs = oldBehaviour._particleImageSrcs;
      }

      onOptionsUpdate(oldBehaviour.options);
    }
  }

  @override
  bool tick(double delta, Duration elapsed) {
    if (particles == null) return false;

    for (Particle particle in particles) {
      if (!size.contains(Offset(particle.cx, particle.cy))) {
        initParticle(particle);
        continue;
      }

      updateParticle(particle, delta, elapsed);
    }

    return true;
  }

  @override
  void paint(PaintingContext context, Offset offset) {
    final Canvas canvas = context.canvas;
    for (Particle particle in particles) {
      int imageIndex;
      try {
        imageIndex = particle.index % options.images.length;
        if (particle.alpha == 0.0) continue;
        _paint.color = options.baseColor.withOpacity(particle.alpha);

        if (_particleImages != null) {
          Rect dst = Rect.fromLTRB(
            particle.cx - particle.radius,
            particle.cy - particle.radius,
            particle.cx + particle.radius,
            particle.cy + particle.radius,
          );

          // canvas.rotate(particle.radians * 0.1 * math.pi / 180);
          // canvas.drawImage(_particleImage, dst.topLeft, _paint);
          if (_particleImages.isNotEmpty && _particleImageSrcs.isNotEmpty)
            canvas.drawImageRect(_particleImages[imageIndex],
                _particleImageSrcs[imageIndex], dst, _paint);
        } else
          canvas.drawCircle(
            Offset(particle.cx, particle.cy),
            particle.radius,
            _paint,
          );
      } catch (e) {
        print(e);
        print(
            '----------------------------------particle.index: ${particle.index}, options.images.length: ${options.images.length}, imageIndex: $imageIndex, _particleImages: ${_particleImages.length}, _particleImageSrcs: ${_particleImageSrcs.length}');
      }
    }
  }

  /// Generates an amount of particles and initializes them.
  ///
  /// This can be used to generate the initial particles or new particles when
  /// the options change
  @protected
  List<Particle> generateParticles(int numParticles) {
    return List.generate(numParticles, (i) => i).map((i) {
      Particle p = Particle();
      initParticle(p);
      return p;
    }).toList();
  }

  @protected
  void initParticle(Particle particle);

  @protected
  void updateParticle(Particle particle, double delta, Duration elapsed) {
    particle.cx += particle.dx * delta;
    particle.cy += particle.dy * delta;
    if (options.opacityChangeRate > 0 &&
            particle.alpha < particle.targetAlpha ||
        options.opacityChangeRate < 0 &&
            particle.alpha > particle.targetAlpha) {
      particle.alpha = particle.alpha + delta * options.opacityChangeRate;

      if (options.opacityChangeRate > 0 &&
              particle.alpha > particle.targetAlpha ||
          options.opacityChangeRate < 0 &&
              particle.alpha < particle.targetAlpha)
        particle.alpha = particle.targetAlpha;
    }
  }

  @protected
  @mustCallSuper
  void onOptionsUpdate(ParticleOptions oldOptions) {
    if (particles == null) return;
    if (particles.length > options.particleCount)
      particles.removeRange(0, particles.length - options.particleCount);
    else if (particles.length < options.particleCount) {
      final int particlesToSpawn = options.particleCount - particles.length;
      final newParticles = generateParticles(particlesToSpawn);
      particles.addAll(newParticles);
    }
  }

  void _convertImage(List<Image> images, int index) async {
    if (_pendingConversions != null && _pendingConversions.length >= index + 1)
      _pendingConversions[index]();
    _pendingConversions ??= [];
    _pendingConversions.add(convertImage(images[index], (ui.Image outImage) {
      _pendingConversions = null;
      if (outImage != null) {
        _particleImageSrcs.add(Rect.fromLTRB(
          0.0,
          0.0,
          outImage.width.toDouble(),
          outImage.height.toDouble(),
        ));

        _particleImages.add(outImage);
      }
    }));
  }
}
