import 'package:flutter/cupertino.dart';
import 'package:seab1ird.showyourself/data/Data.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';

class Girl1ShirtData implements Data {
  @override
  Map<SubItemType, Map<String, List<Positioned>>> itemSubMap;

  Girl1ShirtData() {
    itemSubMap = new Map<SubItemType, Map<String, List<Positioned>>>();
    itemSubMap[null] = new Map<String, List<Positioned>>();
    //0
    itemSubMap[null][null] = [
      Positioned(
        left: 157,
        bottom: 183,
        child: Image.asset(
          "images/CreatedObject7_253.png",
          width: 70,
        ),
      ),
    ];

    //1
    itemSubMap[null]['CreatedObject7_159'] = [
      Positioned(
        left: 142,
        bottom: 128,
        child: Image.asset(
          "images/CreatedObject7_220.png",
          width: 104,
        ),
      ),
    ];

    //2
    itemSubMap[null]['CreatedObject7_160'] = [
      Positioned(
        left: 150,
        bottom: 157,
        child: Image.asset(
          "images/CreatedObject7_221.png",
          width: 97,
        ),
      ),
    ];

    //3
    itemSubMap[null]['CreatedObject7_161'] = [
      Positioned(
        left: 155,
        bottom: 160,
        child: Image.asset(
          "images/CreatedObject7_222.png",
          width: 90,
        ),
      ),
    ];

    //4
    itemSubMap[null]['CreatedObject7_162'] = [
      Positioned(
        left: 142,
        bottom: 128,
        child: Image.asset(
          "images/CreatedObject7_223.png",
          width: 104,
        ),
      ),
    ];
    // ROW 2
    //5
    itemSubMap[null]['CreatedObject7_163'] = [
      Positioned(
        left: 156,
        bottom: 178,
        child: Image.asset(
          "images/CreatedObject7_224.png",
          width: 72,
        ),
      ),
    ];

    //6
    itemSubMap[null]['CreatedObject7_164'] = [
      Positioned(
        left: 155,
        bottom: 121,
        child: Image.asset(
          "images/CreatedObject7_233.png",
          width: 90,
        ),
      ),
    ];

    //7
    itemSubMap[null]['CreatedObject7_165'] = [
      Positioned(
        left: 142,
        bottom: 128,
        child: Image.asset(
          "images/CreatedObject7_234.png",
          width: 104,
        ),
      ),
    ];

    //8
    itemSubMap[null]['CreatedObject7_166'] = [
      Positioned(
        left: 143,
        bottom: 122,
        child: Image.asset(
          "images/CreatedObject7_235.png",
          width: 104,
        ),
      ),
    ];
  }
}
