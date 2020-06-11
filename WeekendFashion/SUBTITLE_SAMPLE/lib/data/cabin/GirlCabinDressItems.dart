import 'package:flutter/widgets.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/GirlCabinItem.dart';

import 'GirlCabintems.dart';

class GirlCabinDressItems extends GirlCabinItems {
  const GirlCabinDressItems({
    @required this.animation,
    @required this.girlIndex,
    @required this.itemType
  }) : super(animation: animation, girlIndex: girlIndex, itemType: itemType);

  final Animation<double> animation;
  final int girlIndex;
  final ItemType itemType;

  @override
  List<Widget> getGirl1Items(GameProvider gameProvider, ItemType itemType) {
    return <Widget>[
      Positioned(
        left: 30,
        top: gameProvider.deviceSize.height * 0.16,
        child: Image.asset(
          'images/CreatedObject7_156.png',
          width: gameProvider.deviceSize.width * 0.32,
        ),
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 0,
        top: gameProvider.deviceSize.height * 0.14,
        width: gameProvider.deviceSize.width * 0.13,
        image: "CreatedObject7_180",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.08,
        top: gameProvider.deviceSize.height * 0.14,
        width: gameProvider.deviceSize.width * 0.13,
        image: "CreatedObject7_181",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.17,
        top: gameProvider.deviceSize.height * 0.14,
        width: gameProvider.deviceSize.width * 0.1,
        image: "CreatedObject7_182",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.24,
        top: gameProvider.deviceSize.height * 0.14,
        width: gameProvider.deviceSize.width * 0.13,
        image: "CreatedObject7_183",
        itemType: itemType,
      ),
      // ROW 2
      Positioned(
        left: 30,
        top: gameProvider.deviceSize.height * 0.5,
        child: Image.asset(
          'images/CreatedObject7_156.png',
          width: gameProvider.deviceSize.width * 0.32,
        ),
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 0,
        top: gameProvider.deviceSize.height * 0.485,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_184",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.07,
        top: gameProvider.deviceSize.height * 0.485,
        width: gameProvider.deviceSize.width * 0.17,
        image: "CreatedObject7_185",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.17,
        top: gameProvider.deviceSize.height * 0.485,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_186",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.25,
        top: gameProvider.deviceSize.height * 0.485,
        width: gameProvider.deviceSize.width * 0.135,
        image: "CreatedObject7_187",
        itemType: itemType,
      ),
    ];
  }
}
