import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

/// Holds the particle configuration information for a [ParticleBehaviour].
class ParticleOptions {
  /// The image used by the particle. It is mutually exclusive with [baseColor].
  final List<Image> images;

  /// The color used by the particle. It is mutually exclusive with [images].
  final Color baseColor;

  /// The minimum radius of a spawned particle. Changing this value should cause
  /// the particles to update, in case their current radius is smaller than the
  /// new value. The concrete effects depends on the instance of
  /// [ParticleBehaviour] used.
  final double spawnMinRadius;

  /// The maximum radius of a spawned particle. Changing this value should cause
  /// the particles to update, in case their current radius is bigger than the
  /// new value. The concrete effects depends on the instance of
  /// [ParticleBehaviour] used.
  final double spawnMaxRadius;

  /// The minimum speed of a spawned particle. Changing this value should cause
  /// the particles to update, in case their current speed is smaller than the
  /// new value. The concrete effects depends on the instance of
  /// [ParticleBehaviour] used.
  final double spawnMinSpeed;

  /// The maximum speed of a spawned particle. Changing this value should cause
  /// the particles to update, in case their current speed is bigger than the
  /// new value. The concrete effects depends on the instance of
  /// [ParticleBehaviour] used.
  final double spawnMaxSpeed;

  /// The opacity of a spawned particle.
  final double spawnOpacity;

  /// The minimum opacity of a particle. It is used to compute the target
  /// opacity after spawning. Implementation may differ by [ParticleBehaviour].
  final double minOpacity;

  /// The maximum opacity of a particle. It is used to compute the target
  /// opacity after spawning. Implementation may differ by [ParticleBehaviour].
  final double maxOpacity;

  /// The opacity change rate of a particle over its lifetime.
  final double opacityChangeRate;

  /// The total count of particles that should be spawned.
  final int particleCount;

  /// Creates a [ParticleOptions] given a set of preferred values.
  ///
  /// Default values are assigned for arguments that are omitted.
  const ParticleOptions({
    this.images,
    this.baseColor = Colors.yellow,
    this.spawnMinRadius = 1.0,
    this.spawnMaxRadius = 10.0,
    this.spawnMinSpeed = 250.0,
    this.spawnMaxSpeed = 500.0,
    this.spawnOpacity = 0.0,
    this.minOpacity = 0.1,
    this.maxOpacity = 0.4,
    this.opacityChangeRate = 0.25,
    this.particleCount = 100,
  })  : assert(baseColor != null),
        assert(spawnMinRadius != null),
        assert(spawnMaxRadius != null),
        assert(spawnMinSpeed != null),
        assert(spawnMaxSpeed != null),
        assert(spawnOpacity != null),
        assert(minOpacity != null),
        assert(maxOpacity != null),
        assert(opacityChangeRate != null),
        assert(particleCount != null),
        assert(spawnMaxRadius >= spawnMinRadius),
        assert(spawnMinRadius >= 1.0),
        assert(spawnMaxRadius >= 1.0),
        assert(spawnOpacity >= 0.0),
        assert(spawnOpacity <= 1.0),
        assert(maxOpacity >= minOpacity),
        assert(minOpacity >= 0.0),
        assert(minOpacity <= 1.0),
        assert(maxOpacity >= 0.0),
        assert(maxOpacity <= 1.0),
        assert(spawnMaxSpeed >= spawnMinSpeed),
        assert(spawnMinSpeed >= 0.0),
        assert(spawnMaxSpeed >= 0.0),
        assert(particleCount >= 0);

  /// Creates a copy of this [ParticleOptions] but with the given fields
  /// replaced with new values.
  ParticleOptions copyWith({
    List<Image> images,
    Color baseColor,
    double spawnMinRadius,
    double spawnMaxRadius,
    double spawnMinSpeed,
    double spawnMaxSpeed,
    double spawnOpacity,
    double minOpacity,
    double maxOpacity,
    double opacityChangeRate,
    int particleCount,
  }) {
    return ParticleOptions(
      images: images ?? this.images,
      baseColor: baseColor ?? this.baseColor,
      spawnMinRadius: spawnMinRadius ?? this.spawnMinRadius,
      spawnMaxRadius: spawnMaxRadius ?? this.spawnMaxRadius,
      spawnMinSpeed: spawnMinSpeed ?? this.spawnMinSpeed,
      spawnMaxSpeed: spawnMaxSpeed ?? this.spawnMaxSpeed,
      spawnOpacity: spawnOpacity ?? this.spawnOpacity,
      minOpacity: minOpacity ?? this.minOpacity,
      maxOpacity: maxOpacity ?? this.maxOpacity,
      opacityChangeRate: opacityChangeRate ?? this.opacityChangeRate,
      particleCount: particleCount ?? this.particleCount,
    );
  }
}
