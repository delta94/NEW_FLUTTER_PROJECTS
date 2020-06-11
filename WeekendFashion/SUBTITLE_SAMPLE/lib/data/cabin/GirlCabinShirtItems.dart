import 'package:flutter/widgets.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/GirlCabinItem.dart';

import 'GirlCabintems.dart';

class GirlCabinShirtItems extends GirlCabinItems {
  const GirlCabinShirtItems({
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
      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.16,
        child: Image.asset(
          'images/CreatedObject7_46.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: -20,
        top: gameProvider.deviceSize.height * 0.15,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_31",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.05,
        top: gameProvider.deviceSize.height * 0.15,
        width: gameProvider.deviceSize.width * 0.1,
        image: "CreatedObject7_26",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.12,
        top: gameProvider.deviceSize.height * 0.15,
        width: gameProvider.deviceSize.width * 0.1,
        image: "CreatedObject7_27",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.18,
        top: gameProvider.deviceSize.height * 0.15,
        width: gameProvider.deviceSize.width * 0.1,
        image: "CreatedObject7_28",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.24,
        top: gameProvider.deviceSize.height * 0.145,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_29",
        itemType: itemType,
      ),
      // SHIRT row 2
      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.412,
        child: Image.asset(
          'images/CreatedObject7_46.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: -5,
        top: gameProvider.deviceSize.height * 0.4,
        width: gameProvider.deviceSize.width * 0.1,
        image: "CreatedObject7_30",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.05,
        top: gameProvider.deviceSize.height * 0.4,
        width: gameProvider.deviceSize.width * 0.1,
        image: "CreatedObject7_25",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.1,
        top: gameProvider.deviceSize.height * 0.4,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_32",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.18,
        top: gameProvider.deviceSize.height * 0.4,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_33",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.25,
        top: gameProvider.deviceSize.height * 0.4,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_34",
        itemType: itemType,
      ),
    ];
  }

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
        width: gameProvider.deviceSize.width * 0.16,
        image: "CreatedObject7_159",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.08,
        top: gameProvider.deviceSize.height * 0.14,
        width: gameProvider.deviceSize.width * 0.13,
        image: "CreatedObject7_160",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.15,
        top: gameProvider.deviceSize.height * 0.14,
        width: gameProvider.deviceSize.width * 0.13,
        image: "CreatedObject7_161",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.23,
        top: gameProvider.deviceSize.height * 0.14,
        width: gameProvider.deviceSize.width * 0.13,
        image: "CreatedObject7_162",
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
        left: 10,
        top: gameProvider.deviceSize.height * 0.48,
        width: gameProvider.deviceSize.width * 0.11,
        image: "CreatedObject7_163",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.1,
        top: gameProvider.deviceSize.height * 0.48,
        width: gameProvider.deviceSize.width * 0.11,
        image: "CreatedObject7_164",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.17,
        top: gameProvider.deviceSize.height * 0.48,
        width: gameProvider.deviceSize.width * 0.14,
        image: "CreatedObject7_165",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.25,
        top: gameProvider.deviceSize.height * 0.48,
        width: gameProvider.deviceSize.width * 0.14,
        image: "CreatedObject7_166",
        itemType: itemType,
      ),
    ];
  }
}
