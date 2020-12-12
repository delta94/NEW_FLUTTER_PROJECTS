import 'dart:math';

import 'package:flutter/widgets.dart';

class Helpers {
  static Random rnd;

  static Image getImage(String imageName) {
    return Image.asset('assets/images/$imageName.png');
  }
}
