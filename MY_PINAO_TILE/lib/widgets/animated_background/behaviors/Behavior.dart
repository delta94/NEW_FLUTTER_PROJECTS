import 'package:flutter/widgets.dart';
import 'package:seab1ird.letitgo/widgets/animated_background/AnimatedBackground.dart';

/// Base class for behaviours provided to [AnimatedBackground]
///
/// Implementing this class allows to render new types of backgrounds.
abstract class Behaviour {
  /// The render object of the [AnimatedBackground] this behaviour is provided to.
  @protected
  RenderAnimatedBackground renderObject;

  /// The size of the render object of the [AnimatedBackground] this behaviour is provided to.
  @protected
  Size get size => renderObject?.size;

  /// Gets the initialization state of this behaviour
  bool get isInitialized;

  /// Called when this behaviour should be initialized
  ///
  /// After calling this method any call to [isInitialized] should return true.
  @protected
  void init();

  /// Called when this behaviour should be initialized from an old behaviour.
  @protected
  void initFrom(Behaviour oldBehaviour);

  /// Called each time there is an update from the ticker on the [AnimatedBackground]
  ///
  /// The implementation must return true if there is a need to repaint and
  /// false otherwise.
  @protected
  bool tick(double delta, Duration elapsed);

  /// Called each time the [AnimatedBackground] needs to repaint.
  ///
  /// The canvas provided in the context is already offset by the amount
  /// specified in [offset], however the parameter is provided to make the
  /// signature of the methods uniform.
  @protected
  void paint(PaintingContext context, Offset offset);

  /// Called when the layout needs to be rebuilt.
  ///
  /// Allows the behaviour to include new widgets between the background and
  /// the provided child. (ie. include a [GestureDetector] to make the
  /// background interactive.
  @protected
  @mustCallSuper
  Widget builder(
    BuildContext context,
    BoxConstraints constraints,
    Widget child,
  ) {
    return child;
  }
}
