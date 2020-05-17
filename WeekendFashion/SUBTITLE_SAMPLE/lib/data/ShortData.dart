import 'package:flutter/cupertino.dart';

class ShortData {
  static Map<String, List<Positioned>> shortItemMap =
      new Map<String, List<Positioned>>();
  static init() {
    shortItemMap[null] = [
      Positioned(
        right: 153.5,
        bottom: 70,
        child: Image.asset(
          "images/CreatedObject7_75.png",
          width: 77,
        ),
      ),
    ];
  }
}
