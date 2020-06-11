import 'package:flutter/widgets.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/GirlCabinItem.dart';

import 'GirlCabintems.dart';

class GirlCabinShortItems extends GirlCabinItems {
  const GirlCabinShortItems({
    @required this.animation,
    @required this.girlIndex,
    @required this.itemType
  }) : super(animation: animation, girlIndex: girlIndex, itemType: itemType);

  final Animation<double> animation;
  final int girlIndex;
  final ItemType itemType;

  @override
  List<Widget> getGirl0Items(GameProvider gameProvider, ItemType itemType) {
    return <Widget>[
      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.155,
        child: Image.asset(
          'images/CreatedObject7_46.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      //0
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 0,
        top: gameProvider.deviceSize.height * 0.15,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_38",
        itemType: itemType,
      ),
      //1
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.08,
        top: gameProvider.deviceSize.height * 0.15,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_39",
        itemType: itemType,
      ),
      //2
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.18,
        top: gameProvider.deviceSize.height * 0.15,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_40",
        itemType: itemType,
      ),
      //3
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.27,
        top: gameProvider.deviceSize.height * 0.15,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_41",
        itemType: itemType,
      ),
      // SHORT row 2
      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.51,
        child: Image.asset(
          'images/CreatedObject7_46.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      //4
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 0,
        top: gameProvider.deviceSize.height * 0.5,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_42",
        itemType: itemType,
      ),
      //5
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.1,
        top: gameProvider.deviceSize.height * 0.5,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_43",
        itemType: itemType,
      ),
      //6
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.2,
        top: gameProvider.deviceSize.height * 0.5,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_44",
        itemType: itemType,
      ),
      //7
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.27,
        top: gameProvider.deviceSize.height * 0.5,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_45",
        itemType: itemType,
      ),
    ];
  }

  @override
  List<Widget> getGirl1Items(GameProvider gameProvider, ItemType itemType) {
    return <Widget>[
      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.165,
        child: Image.asset(
          'images/CreatedObject7_46.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      //0
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 0,
        top: gameProvider.deviceSize.height * 0.15,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_170",
        itemType: itemType,
      ),
      //1
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.08,
        top: gameProvider.deviceSize.height * 0.15,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_171",
        itemType: itemType,
      ),
      //2
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.16,
        top: gameProvider.deviceSize.height * 0.15,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_172",
        itemType: itemType,
      ),
      //3
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.25,
        top: gameProvider.deviceSize.height * 0.15,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_173",
        itemType: itemType,
      ),
      // SHORT row 2
      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.51,
        child: Image.asset(
          'images/CreatedObject7_46.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      //4
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 0,
        top: gameProvider.deviceSize.height * 0.5,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_175",
        itemType: itemType,
      ),
      //5
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.08,
        top: gameProvider.deviceSize.height * 0.5,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_176",
        itemType: itemType,
      ),
      //6
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.16,
        top: gameProvider.deviceSize.height * 0.5,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_177",
        itemType: itemType,
      ),
      //7
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.25,
        top: gameProvider.deviceSize.height * 0.5,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_174",
        itemType: itemType,
      ),
    ];
  }
}
