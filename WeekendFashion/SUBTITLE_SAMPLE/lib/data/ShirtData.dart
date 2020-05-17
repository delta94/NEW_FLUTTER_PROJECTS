import 'package:flutter/cupertino.dart';

class ShirtData {
  static Map<String, List<Positioned>> shirtItemMap =
      new Map<String, List<Positioned>>();
  static init() {
    shirtItemMap[null] = [
      Positioned(
        right: 130,
        bottom: 164,
        child: Image.asset(
          "images/CreatedObject7_74.png",
          width: 110,
        ),
      ),
    ];
  }
}
