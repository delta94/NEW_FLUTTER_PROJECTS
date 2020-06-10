import 'package:flutter/cupertino.dart';
import 'package:seab1ird.showyourself/data/Data.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';

class Girl0TreasureData implements Data {
  @override
  Map<SubItemType, Map<String, List<Positioned>>> itemSubMap;

  Girl0TreasureData() {
    itemSubMap = new Map<SubItemType, Map<String, List<Positioned>>>();
    itemSubMap[null] = new Map<String, List<Positioned>>();
    itemSubMap[SubItemType.BAG] = new Map<String, List<Positioned>>();
    itemSubMap[SubItemType.NECKLET] = new Map<String, List<Positioned>>();
    itemSubMap[SubItemType.EARING] = new Map<String, List<Positioned>>();
    itemSubMap[SubItemType.PHONE] = new Map<String, List<Positioned>>();
    itemSubMap[SubItemType.GLASS] = new Map<String, List<Positioned>>();

    itemSubMap[null][null] = [
      Positioned(
        right: 130,
        bottom: 165,
        child: Container(),
      ),
    ];
    itemSubMap[SubItemType.BAG][null] = [
      Positioned(
        right: 130,
        bottom: 165,
        child: Container(),
      ),
    ];
    itemSubMap[SubItemType.EARING][null] = [
      Positioned(
        right: 130,
        bottom: 165,
        child: Container(),
      ),
    ];
    itemSubMap[SubItemType.NECKLET][null] = [
      Positioned(
        right: 130,
        bottom: 165,
        child: Container(),
      ),
    ];
    itemSubMap[SubItemType.PHONE][null] = [
      Positioned(
        right: 130,
        bottom: 165,
        child: Container(),
      ),
    ];
    itemSubMap[SubItemType.GLASS][null] = [
      Positioned(
        right: 130,
        bottom: 165,
        child: Container(),
      ),
    ];
    //1
    itemSubMap[SubItemType.BAG]['CreatedObject7_59'] = [
      Positioned(
        right: 215,
        bottom: 120,
        child: Image.asset(
          "images/CreatedObject7_140.png",
          width: 25,
        ),
      ),
      Positioned(
        right: 195,
        bottom: 102,
        child: Image.asset(
          "images/CreatedObject7_126.png",
          width: 47,
        ),
      ),
    ];
    //2
    itemSubMap[SubItemType.BAG]['CreatedObject7_60'] = [
      Positioned(
        right: 190,
        bottom: 105,
        child: Image.asset(
          "images/CreatedObject7_127.png",
          width: 70,
        ),
      ),
    ];
    //3
    itemSubMap[SubItemType.NECKLET]['CreatedObject7_61'] = [
      Positioned(
        right: 180,
        bottom: 210,
        child: Image.asset(
          "images/CreatedObject7_128.png",
          width: 23,
        ),
      ),
    ];
    //4
    itemSubMap[SubItemType.NECKLET]['CreatedObject7_62'] = [
      Positioned(
        right: 174,
        bottom: 227,
        child: Image.asset(
          "images/CreatedObject7_130.png",
          width: 35,
        ),
      ),
    ];
    // ROW 2
    //5
    itemSubMap[SubItemType.BAG]['CreatedObject7_63'] = [
      Positioned(
        right: 110,
        bottom: 105,
        child: Image.asset(
          "images/CreatedObject7_129.png",
          width: 60,
        ),
      ),
    ];
    //6
    itemSubMap[SubItemType.BAG]['CreatedObject7_64'] = [
      Positioned(
        right: 213,
        bottom: 140,
        child: Image.asset(
          "images/CreatedObject7_139.png",
          width: 30,
        ),
      ),
      Positioned(
        right: 195,
        bottom: 108,
        child: Image.asset(
          "images/CreatedObject7_131.png",
          width: 53,
        ),
      ),
    ];
    //7
    itemSubMap[SubItemType.BAG]['CreatedObject7_65'] = [
      Positioned(
        right: 185,
        bottom: 100,
        child: Image.asset(
          "images/CreatedObject7_132.png",
          width: 65,
        ),
      ),
    ];
    //8
    itemSubMap[SubItemType.EARING]['CreatedObject7_66'] = [
      Positioned(
        right: 178,
        bottom: 245,
        child: Image.asset(
          "images/CreatedObject7_133.png",
          width: 40,
        ),
      ),
    ];
    // ROW 3
    //9
    itemSubMap[SubItemType.EARING]['CreatedObject7_67'] = [
      Positioned(
        right: 178,
        bottom: 252,
        child: Image.asset(
          "images/CreatedObject7_134.png",
          width: 40,
        ),
      ),
    ];
    //10
    itemSubMap[SubItemType.PHONE]['CreatedObject7_68'] = [
      Positioned(
        right: 117,
        bottom: 190,
        child: Image.asset(
          "images/CreatedObject7_135.png",
          width: 25,
        ),
      ),
    ];
    //11
    itemSubMap[SubItemType.BAG]['CreatedObject7_69'] = [
      Positioned(
        right: 210,
        bottom: 155,
        child: Image.asset(
          "images/CreatedObject7_138.png",
          width: 28,
        ),
      ),
      Positioned(
        right: 198,
        bottom: 113,
        child: Image.asset(
          "images/CreatedObject7_136.png",
          width: 50,
        ),
      ),
    ];
    //12
    itemSubMap[SubItemType.GLASS]['CreatedObject7_70'] = [
      Positioned(
        right: 177,
        bottom: 271,
        child: Image.asset(
          "images/CreatedObject7_137.png",
          width: 45,
        ),
      ),
    ];
  }
}
