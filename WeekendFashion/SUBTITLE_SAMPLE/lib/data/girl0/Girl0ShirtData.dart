import 'package:flutter/cupertino.dart';
import 'package:seab1ird.showyourself/data/Data.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';

class Girl0ShirtData implements Data {
  @override
  Map<SubItemType, Map<String, List<Positioned>>> itemSubMap;

  Girl0ShirtData() {
    itemSubMap = new Map<SubItemType, Map<String, List<Positioned>>>();
    itemSubMap[null] = new Map<String, List<Positioned>>();
    //0
    itemSubMap[null][null] = [
      Positioned(
        right: 130,
        bottom: 164,
        child: Image.asset(
          "images/CreatedObject7_74.png",
          width: 110,
        ),
      ),
    ];

    //1
    itemSubMap[null]['CreatedObject7_31'] = [
      Positioned(
        right: 134,
        bottom: 172,
        child: Image.asset(
          "images/CreatedObject7_96.png",
          width: 117,
        ),
      ),
    ];

    //2
    itemSubMap[null]['CreatedObject7_26'] = [
      Positioned(
        right: 130,
        bottom: 167,
        child: Image.asset(
          "images/CreatedObject7_91.png",
          width: 129,
        ),
      ),
    ];

    //3
    itemSubMap[null]['CreatedObject7_27'] = [
      Positioned(
        right: 128,
        bottom: 140,
        child: Image.asset(
          "images/CreatedObject7_92.png",
          width: 132,
        ),
      ),
    ];

    //4
    itemSubMap[null]['CreatedObject7_28'] = [
      Positioned(
        right: 130,
        bottom: 165,
        child: Image.asset(
          "images/CreatedObject7_93.png",
          width: 132,
        ),
      ),
    ];

    //5
    itemSubMap[null]['CreatedObject7_29'] = [
      Positioned(
        right: 150,
        bottom: 180,
        child: Image.asset(
          "images/CreatedObject7_94.png",
          width: 90,
        ),
      ),
    ];

    //6
    itemSubMap[null]['CreatedObject7_30'] = [
      Positioned(
        right: 125,
        bottom: 155,
        child: Image.asset(
          "images/CreatedObject7_95.png",
          width: 133,
        ),
      ),
    ];

    //7
    itemSubMap[null]['CreatedObject7_25'] = [
      Positioned(
        right: 158,
        bottom: 173,
        child: Image.asset(
          "images/CreatedObject7_90.png",
          width: 55,
        ),
      ),
    ];

    //8
    itemSubMap[null]['CreatedObject7_32'] = [
      Positioned(
        right: 148,
        bottom: 172,
        child: Image.asset(
          "images/CreatedObject7_97.png",
          width: 90,
        ),
      ),
    ];

    //9
    itemSubMap[null]['CreatedObject7_33'] = [
      Positioned(
        right: 150,
        bottom: 157,
        child: Image.asset(
          "images/CreatedObject7_98.png",
          width: 70,
        ),
      ),
    ];

    //10
    itemSubMap[null]['CreatedObject7_34'] = [
      Positioned(
        right: 150,
        bottom: 180,
        child: Image.asset(
          "images/CreatedObject7_99.png",
          width: 85,
        ),
      ),
    ];
  }
}
