import 'package:flutter/cupertino.dart';
import 'package:seab1ird.showyourself/data/Data.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';

class Girl1DressData implements Data {
  @override
  Map<SubItemType, Map<String, List<Positioned>>> itemSubMap;

  Girl1DressData() {
    itemSubMap = new Map<SubItemType, Map<String, List<Positioned>>>();
    itemSubMap[null] = new Map<String, List<Positioned>>();
    //1
    itemSubMap[null]['CreatedObject7_180'] = [
      Positioned(
        left: 142,
        bottom: 128,
        child: Image.asset(
          "images/CreatedObject7_236.png",
          width: 104,
        ),
      ),
    ];

    //2
    itemSubMap[null]['CreatedObject7_181'] = [
      Positioned(
        left: 150,
        bottom: 157,
        child: Image.asset(
          "images/CreatedObject7_237.png",
          width: 97,
        ),
      ),
    ];

    //3
    itemSubMap[null]['CreatedObject7_182'] = [
      Positioned(
        left: 155,
        bottom: 160,
        child: Image.asset(
          "images/CreatedObject7_238.png",
          width: 90,
        ),
      ),
    ];

    //4
    itemSubMap[null]['CreatedObject7_183'] = [
      Positioned(
        left: 142,
        bottom: 128,
        child: Image.asset(
          "images/CreatedObject7_239.png",
          width: 104,
        ),
      ),
    ];
    // ROW 2
    //5
    itemSubMap[null]['CreatedObject7_184'] = [
      Positioned(
        left: 156,
        bottom: 178,
        child: Image.asset(
          "images/CreatedObject7_240.png",
          width: 72,
        ),
      ),
    ];

    //6
    itemSubMap[null]['CreatedObject7_185'] = [
      Positioned(
        left: 155,
        bottom: 121,
        child: Image.asset(
          "images/CreatedObject7_241.png",
          width: 90,
        ),
      ),
    ];

    //7
    itemSubMap[null]['CreatedObject7_186'] = [
      Positioned(
        left: 142,
        bottom: 128,
        child: Image.asset(
          "images/CreatedObject7_242.png",
          width: 104,
        ),
      ),
    ];

    //8
    itemSubMap[null]['CreatedObject7_187'] = [
      Positioned(
        left: 143,
        bottom: 122,
        child: Image.asset(
          "images/CreatedObject7_243.png",
          width: 104,
        ),
      ),
    ];
  }
}
