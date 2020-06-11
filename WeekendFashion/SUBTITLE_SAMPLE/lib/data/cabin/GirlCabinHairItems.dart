import 'package:flutter/widgets.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/GirlCabinItem.dart';

import 'GirlCabintems.dart';

class GirlCabinHairItems extends GirlCabinItems {
  const GirlCabinHairItems({
    @required this.animation,
    @required this.girlIndex,
    @required this.itemType
  }) : super(animation: animation, girlIndex: girlIndex, itemType: itemType);

  final Animation<double> animation;
  final int girlIndex;
  final ItemType itemType;

  @override
  getGirl0Items(GameProvider gameProvider, ItemType itemType) {
    return <Widget>[
      GirlCabinItem(
          girlIndex: girlIndex,
          left: 10,
          top: gameProvider.deviceSize.height * 0.15,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_14",
          itemType: itemType),
      GirlCabinItem(
          girlIndex: girlIndex,
          left: gameProvider.deviceSize.width * 0.1 + 15,
          top: gameProvider.deviceSize.height * 0.15,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_15",
          itemType: itemType),
      GirlCabinItem(
          girlIndex: girlIndex,
          left: gameProvider.deviceSize.width * 0.2 + 20,
          top: gameProvider.deviceSize.height * 0.15,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_16",
          itemType: itemType),
      // Hair row 2
      GirlCabinItem(
          girlIndex: girlIndex,
          left: 10,
          top: gameProvider.deviceSize.height * 0.43,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_17",
          itemType: itemType),
      GirlCabinItem(
          girlIndex: girlIndex,
          left: gameProvider.deviceSize.width * 0.1 + 15,
          top: gameProvider.deviceSize.height * 0.43,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_18",
          itemType: itemType),
      GirlCabinItem(
          girlIndex: girlIndex,
          left: gameProvider.deviceSize.width * 0.2 + 20,
          top: gameProvider.deviceSize.height * 0.43,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_19",
          itemType: itemType),
      // Hair row 3
      GirlCabinItem(
          girlIndex: girlIndex,
          left: gameProvider.deviceSize.width * 0.08,
          top: gameProvider.deviceSize.height * 0.7,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_20",
          itemType: itemType),
      GirlCabinItem(
          girlIndex: girlIndex,
          left: gameProvider.deviceSize.width * 0.19,
          top: gameProvider.deviceSize.height * 0.7,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_21",
          itemType: itemType),
    ];
  }

  @override
  getGirl1Items(GameProvider gameProvider, ItemType itemType) {
    return <Widget>[
      GirlCabinItem(
          girlIndex: girlIndex,
          left: 10,
          top: gameProvider.deviceSize.height * 0.15,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_148",
          itemType: itemType),
      GirlCabinItem(
          girlIndex: girlIndex,
          left: gameProvider.deviceSize.width * 0.1 + 15,
          top: gameProvider.deviceSize.height * 0.15,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_149",
          itemType: itemType),
      GirlCabinItem(
          girlIndex: girlIndex,
          left: gameProvider.deviceSize.width * 0.2 + 20,
          top: gameProvider.deviceSize.height * 0.15,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_150",
          itemType: itemType),
      // Hair row 2
      GirlCabinItem(
          girlIndex: girlIndex,
          left: 10,
          top: gameProvider.deviceSize.height * 0.43,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_151",
          itemType: itemType),
      GirlCabinItem(
          girlIndex: girlIndex,
          left: gameProvider.deviceSize.width * 0.1 + 15,
          top: gameProvider.deviceSize.height * 0.43,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_152",
          itemType: itemType),
      GirlCabinItem(
          girlIndex: girlIndex,
          left: gameProvider.deviceSize.width * 0.2 + 20,
          top: gameProvider.deviceSize.height * 0.43,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_153",
          itemType: itemType),
      // Hair row 3
      GirlCabinItem(
          girlIndex: girlIndex,
          left: gameProvider.deviceSize.width * 0.08,
          top: gameProvider.deviceSize.height * 0.7,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_154",
          itemType: itemType),
      GirlCabinItem(
          girlIndex: girlIndex,
          left: gameProvider.deviceSize.width * 0.19,
          top: gameProvider.deviceSize.height * 0.7,
          width: gameProvider.deviceSize.width * 0.1,
          image: "CreatedObject7_155",
          itemType: itemType),
    ];
  }
}
