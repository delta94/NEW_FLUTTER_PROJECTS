import 'package:flutter/cupertino.dart';
import 'package:seab1ird.showyourself/data/Data.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';

class Girl0ShortData implements Data {
  @override
  Map<SubItemType, Map<String, List<Positioned>>> itemSubMap;

  Girl0ShortData() {
    itemSubMap = new Map<SubItemType, Map<String, List<Positioned>>>();
    itemSubMap[null] = new Map<String, List<Positioned>>();
    //0
    itemSubMap[null][null] = [
      Positioned(
        right: 153.5,
        bottom: 70,
        child: Image.asset(
          "images/CreatedObject7_75.png",
          width: 77,
        ),
      ),
    ];
    //1
    itemSubMap[null]['CreatedObject7_38'] = [
      Positioned(
        right: 148,
        bottom: 0,
        child: Image.asset(
          "images/CreatedObject7_100.png",
          width: 90,
        ),
      ),
    ];
    //2
    itemSubMap[null]['CreatedObject7_39'] = [
      Positioned(
        right: 153,
        bottom: 81,
        child: Image.asset(
          "images/CreatedObject7_101.png",
          width: 80,
        ),
      ),
    ];
    //3
    itemSubMap[null]['CreatedObject7_40'] = [
      Positioned(
        right: 155,
        bottom: 0,
        child: Image.asset(
          "images/CreatedObject7_102.png",
          width: 72,
        ),
      ),
    ];
    //4
    itemSubMap[null]['CreatedObject7_41'] = [
      Positioned(
        right: 135,
        bottom: 10,
        child: Image.asset(
          "images/CreatedObject7_103.png",
          width: 110,
        ),
      ),
    ];
    //5
    itemSubMap[null]['CreatedObject7_42'] = [
      Positioned(
        right: 154,
        bottom: 0,
        child: Image.asset(
          "images/CreatedObject7_104.png",
          width: 73,
        ),
      ),
    ];
    //6
    itemSubMap[null]['CreatedObject7_43'] = [
      Positioned(
        right: 154,
        bottom: 0,
        child: Image.asset(
          "images/CreatedObject7_105.png",
          width: 73,
        ),
      ),
    ];
    //7
    itemSubMap[null]['CreatedObject7_44'] = [
      Positioned(
        right: 143,
        bottom: 30,
        child: Image.asset(
          "images/CreatedObject7_106.png",
          width: 98,
        ),
      ),
    ];
    //8
    itemSubMap[null]['CreatedObject7_45'] = [
      Positioned(
        right: 142,
        bottom: 0,
        child: Image.asset(
          "images/CreatedObject7_107.png",
          width: 97,
        ),
      ),
    ];
  }
}
