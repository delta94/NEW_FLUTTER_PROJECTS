import 'package:flutter/rendering.dart';

/// Holds the information of a line used in a [RacingLinesBehaviour].
class Line {
  /// The position of the start of this line.
  Offset position;

  /// The speed of this line.
  double speed;

  /// The thickness of this line.
  int thickness;

  /// The color of this line.
  Color color;
}

/// The direction in which the lines should move
enum LineDirection {
  /// Left to Right
  Ltr,

  /// Right to Left
  Rtl,

  /// Top to Bottom
  Ttb,

  /// Bottom to Top
  Btt,
}

/// Renders moving lines on an [AnimatedBackground].
