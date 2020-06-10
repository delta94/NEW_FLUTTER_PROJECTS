import 'package:flutter/cupertino.dart';
import 'package:seab1ird.showyourself/data/Data.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';

class Girl1HairData implements Data {
  @override
  Map<SubItemType, Map<String, List<Positioned>>> itemSubMap;

  Girl1HairData() {
    itemSubMap = new Map<SubItemType, Map<String, List<Positioned>>>();
    itemSubMap[null] = new Map<String, List<Positioned>>();
    //0
    itemSubMap[null]['CreatedObject7_148'] = [
      Positioned(
        left: 157,
        bottom: 192,
        child: Image.asset(
          "images/CreatedObject7_208.png",
          width: 75,
        ),
      ),
    ];

    //1
    itemSubMap[null]['CreatedObject7_149'] = [
      Positioned(
        left: 200,
        bottom: 210,
        child: Image.asset(
          "images/CreatedObject7_216.png",
          width: 35,
        ),
      ),
      Positioned(
        left: 160,
        bottom: 255,
        child: Image.asset(
          "images/CreatedObject7_209.png",
          width: 68,
        ),
      ),
    ];

    //2
    itemSubMap[null]['CreatedObject7_150'] = [
      Positioned(
        left: 145,
        bottom: 233,
        child: Image.asset(
          "images/CreatedObject7_217.png",
          width: 95,
        ),
      ),
      Positioned(
        left: 147,
        bottom: 242,
        child: Image.asset(
          "images/CreatedObject7_210.png",
          width: 83,
        ),
      ),
    ];

    //3
    itemSubMap[null]['CreatedObject7_151'] = [
      Positioned(
        left: 152,
        bottom: 264,
        child: Image.asset(
          "images/CreatedObject7_211.png",
          width: 80,
        ),
      )
    ];

    //4
    itemSubMap[null]['CreatedObject7_152'] = [
      Positioned(
        left: 152,
        bottom: 235,
        child: Image.asset(
          "images/CreatedObject7_212.png",
          width: 80,
        ),
      ),
    ];

    //5
    itemSubMap[null]['CreatedObject7_153'] = [
      Positioned(
        left: 161,
        bottom: 194,
        child: Image.asset(
          "images/CreatedObject7_213.png",
          width: 100,
        ),
      )
    ];

    //6
    itemSubMap[null]['CreatedObject7_154'] = [
      Positioned(
        left: 132,
        bottom: 165,
        child: Image.asset(
          "images/CreatedObject7_218.png",
          width: 110,
        ),
      ),
      Positioned(
        left: 150,
        bottom: 165,
        child: Image.asset(
          "images/CreatedObject7_214.png",
          width: 108,
        ),
      )
    ];

    //7
    itemSubMap[null]['CreatedObject7_155'] = [
      Positioned(
        left: 135,
        bottom: 155,
        child: Image.asset(
          "images/CreatedObject7_219.png",
          width: 100,
        ),
      ),
      Positioned(
        left: 136,
        bottom: 215,
        child: Image.asset(
          "images/CreatedObject7_215.png",
          width: 100,
        ),
      )
    ];
  }
}
