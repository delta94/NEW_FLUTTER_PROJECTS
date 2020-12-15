import 'dart:math';

import 'package:flutter/widgets.dart';

class Helpers {
  static Random rnd;

  static Image getImage(String imageName, {double width, double height}) {
    return Image.asset(
      'assets/images/$imageName.png',
      width: width,
      height: height,
    );
  }
}
