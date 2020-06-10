import 'package:flutter/cupertino.dart';
import 'package:seab1ird.showyourself/data/Data.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';

class Girl1ShortData implements Data {
  @override
  Map<SubItemType, Map<String, List<Positioned>>> itemSubMap;

  Girl1ShortData() {
    itemSubMap = new Map<SubItemType, Map<String, List<Positioned>>>();
    itemSubMap[null] = new Map<String, List<Positioned>>();
    //0
    itemSubMap[null][null] = [
      Positioned(
        left: 176,
        bottom: 109,
        child: Image.asset(
          "images/CreatedObject7_254.png",
          width: 67,
        ),
      ),
    ];
    //1
    itemSubMap[null]['CreatedObject7_170'] = [
      Positioned(
        left: 165.5,
        bottom: 0,
        child: Image.asset(
          "images/CreatedObject7_225.png",
          width: 91,
        ),
      ),
    ];
    //2
    itemSubMap[null]['CreatedObject7_171'] = [
      Positioned(
        left: 171,
        bottom: 0,
        child: Image.asset(
          "images/CreatedObject7_226.png",
          width: 70,
        ),
      ),
    ];
    //3
    itemSubMap[null]['CreatedObject7_172'] = [
      Positioned(
        left: 170,
        bottom: 0,
        child: Image.asset(
          "images/CreatedObject7_227.png",
          width: 78.5,
        ),
      ),
    ];
    //4
    itemSubMap[null]['CreatedObject7_173'] = [
      Positioned(
        left: 173,
        bottom: 0,
        child: Image.asset(
          "images/CreatedObject7_228.png",
          width: 68,
        ),
      ),
    ];
    // ROW 2
    //5
    itemSubMap[null]['CreatedObject7_175'] = [
      Positioned(
        left: 162,
        bottom: 0,
        child: Image.asset(
          "images/CreatedObject7_230.png",
          width: 90,
        ),
      ),
    ];
    //6
    itemSubMap[null]['CreatedObject7_176'] = [
      Positioned(
        left: 172,
        bottom: 0,
        child: Image.asset(
          "images/CreatedObject7_231.png",
          width: 70,
        ),
      ),
    ];
    //7
    itemSubMap[null]['CreatedObject7_177'] = [
      Positioned(
        left: 173.5,
        bottom: 32,
        child: Image.asset(
          "images/CreatedObject7_232.png",
          width: 80,
        ),
      ),
    ];
    //8
    itemSubMap[null]['CreatedObject7_174'] = [
      Positioned(
        left: 169,
        bottom: 0,
        child: Image.asset(
          "images/CreatedObject7_229.png",
          width: 89,
        ),
      ),
    ];
  }
}
