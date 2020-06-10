import 'package:flutter/cupertino.dart';
import 'package:seab1ird.showyourself/data/Data.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';

class Girl0HairData implements Data {
  @override
  Map<SubItemType, Map<String, List<Positioned>>> itemSubMap;

  Girl0HairData() {
    itemSubMap = new Map<SubItemType, Map<String, List<Positioned>>>();
    itemSubMap[null] = new Map<String, List<Positioned>>();
    //0
    itemSubMap[null]['CreatedObject7_14'] = [
      Positioned(
        right: 140,
        bottom: 195,
        child: Image.asset(
          "images/CreatedObject7_84.png",
          width: 95,
        ),
      ),
      Positioned(
        right: 140,
        bottom: 218,
        child: Image.asset(
          "images/CreatedObject7_76.png",
          width: 95,
        ),
      )
    ];

    //1
    itemSubMap[null]['CreatedObject7_15'] = [
      Positioned(
        right: 160,
        bottom: 257,
        child: Image.asset(
          "images/CreatedObject7_85.png",
          width: 68,
        ),
      ),
      Positioned(
        right: 162,
        bottom: 250,
        child: Image.asset(
          "images/CreatedObject7_77.png",
          width: 65,
        ),
      ),
    ];

    //2
    itemSubMap[null]['CreatedObject7_16'] = [
      Positioned(
        right: 165,
        bottom: 230,
        child: Image.asset(
          "images/CreatedObject7_86.png",
          width: 60,
        ),
      ),
      Positioned(
        right: 140,
        bottom: 228,
        child: Image.asset(
          "images/CreatedObject7_78.png",
          width: 95,
        ),
      )
    ];

    //3
    itemSubMap[null]['CreatedObject7_17'] = [
      Positioned(
        right: 150,
        bottom: 233,
        child: Image.asset(
          "images/CreatedObject7_79.png",
          width: 75,
        ),
      )
    ];

    //4
    itemSubMap[null]['CreatedObject7_18'] = [
      Positioned(
        right: 175,
        bottom: 252,
        child: Image.asset(
          "images/CreatedObject7_87.png",
          width: 55,
        ),
      ),
      Positioned(
        right: 95,
        bottom: 252,
        child: Image.asset(
          "images/CreatedObject7_80.png",
          width: 135,
        ),
      )
    ];

    //5
    itemSubMap[null]['CreatedObject7_19'] = [
      Positioned(
        right: 164,
        bottom: 205,
        child: Image.asset(
          "images/CreatedObject7_81.png",
          width: 60,
        ),
      )
    ];

    //6
    itemSubMap[null]['CreatedObject7_20'] = [
      Positioned(
        right: 158,
        bottom: 180,
        child: Image.asset(
          "images/CreatedObject7_88.png",
          width: 75,
        ),
      ),
      Positioned(
        right: 152,
        bottom: 200,
        child: Image.asset(
          "images/CreatedObject7_82.png",
          width: 80,
        ),
      )
    ];

    //7
    itemSubMap[null]['CreatedObject7_21'] = [
      Positioned(
        right: 114,
        bottom: 158,
        child: Image.asset(
          "images/CreatedObject7_89.png",
          width: 130,
        ),
      ),
      Positioned(
        right: 163,
        bottom: 275,
        child: Image.asset(
          "images/CreatedObject7_83.png",
          width: 65,
        ),
      )
    ];
  }
}
