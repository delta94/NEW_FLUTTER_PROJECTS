import 'package:flutter/cupertino.dart';
import 'package:seab1ird.showyourself/data/Data.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';

class Girl1JacketData implements Data {
  @override
  Map<SubItemType, Map<String, List<Positioned>>> itemSubMap;

  Girl1JacketData() {
    itemSubMap = new Map<SubItemType, Map<String, List<Positioned>>>();
    itemSubMap[null] = new Map<String, List<Positioned>>();
    //0
    itemSubMap[null][null] = [
      Positioned(
        right: 130,
        bottom: 165,
        child: Container(),
      ),
    ];
    //1
    itemSubMap[null]['CreatedObject7_49'] = [
      Positioned(
        right: 130,
        bottom: 165,
        child: Image.asset(
          "images/CreatedObject7_109.png",
          width: 132,
        ),
      ),
    ];
    //2
    itemSubMap[null]['CreatedObject7_50'] = [
      Positioned(
        right: 130,
        bottom: 165,
        child: Image.asset(
          "images/CreatedObject7_110.png",
          width: 132,
        ),
      ),
    ];
    //3
    itemSubMap[null]['CreatedObject7_51'] = [
      Positioned(
        right: 127,
        bottom: 165,
        child: Image.asset(
          "images/CreatedObject7_111.png",
          width: 132,
        ),
      ),
    ];
    //4
    itemSubMap[null]['CreatedObject7_52'] = [
      Positioned(
        right: 128,
        bottom: 100,
        child: Image.asset(
          "images/CreatedObject7_112.png",
          width: 132,
        ),
      ),
    ];
    //5
    itemSubMap[null]['CreatedObject7_53'] = [
      Positioned(
        right: 130,
        bottom: 125,
        child: Image.asset(
          "images/CreatedObject7_113.png",
          width: 132,
        ),
      ),
    ];
    //6
    itemSubMap[null]['CreatedObject7_54'] = [
      Positioned(
        right: 130,
        bottom: 145,
        child: Image.asset(
          "images/CreatedObject7_114.png",
          width: 135,
        ),
      ),
    ];
  }
}
