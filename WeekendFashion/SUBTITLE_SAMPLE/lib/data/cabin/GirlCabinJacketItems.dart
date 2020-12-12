import 'package:flutter/widgets.dart';
import 'package:seabird.weekendfashion/enums/ItemType.dart';
import 'package:seabird.weekendfashion/helpers/GameProvider.dart';
import 'package:seabird.weekendfashion/widgets/GirlCabinItem.dart';

import '../../widgets/GirlCabintems.dart';

class GirlCabinJacketItems extends GirlCabinItems {
  const GirlCabinJacketItems(
      {@required this.animation,
      @required this.girlIndex,
      @required this.itemType})
      : super(animation: animation, girlIndex: girlIndex, itemType: itemType);

  final Animation<double> animation;
  final int girlIndex;
  final ItemType itemType;

  @override
  List<Widget> getGirl0Items(GameProvider gameProvider, ItemType itemType) {
    return <Widget>[
      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.19,
        child: Image.asset(
          'images/CreatedObject7_46.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 0,
        top: gameProvider.deviceSize.height * 0.175,
        width: gameProvider.deviceSize.width * 0.14,
        image: "CreatedObject7_49",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.12,
        top: gameProvider.deviceSize.height * 0.175,
        width: gameProvider.deviceSize.width * 0.14,
        image: "CreatedObject7_50",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.25,
        top: gameProvider.deviceSize.height * 0.175,
        width: gameProvider.deviceSize.width * 0.14,
        image: "CreatedObject7_51",
        itemType: itemType,
      ),
      // ROW 2
      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.46,
        child: Image.asset(
          'images/CreatedObject7_46.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 0,
        top: gameProvider.deviceSize.height * 0.45,
        width: gameProvider.deviceSize.width * 0.14,
        image: "CreatedObject7_52",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.12,
        top: gameProvider.deviceSize.height * 0.45,
        width: gameProvider.deviceSize.width * 0.14,
        image: "CreatedObject7_53",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.25,
        top: gameProvider.deviceSize.height * 0.45,
        width: gameProvider.deviceSize.width * 0.14,
        image: "CreatedObject7_54",
        itemType: itemType,
      ),
    ];
  }

  @override
  List<Widget> getGirl1Items(GameProvider gameProvider, ItemType itemType) {
    return <Widget>[
      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.2,
        child: Image.asset(
          'images/CreatedObject7_46.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 25,
        top: gameProvider.deviceSize.height * 0.18,
        width: gameProvider.deviceSize.width * 0.15,
        image: "CreatedObject7_191",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.18,
        top: gameProvider.deviceSize.height * 0.18,
        width: gameProvider.deviceSize.width * 0.17,
        image: "CreatedObject7_192",
        itemType: itemType,
      ),
      // ROW 2
      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.5,
        child: Image.asset(
          'images/CreatedObject7_46.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 25,
        top: gameProvider.deviceSize.height * 0.48,
        width: gameProvider.deviceSize.width * 0.12,
        image: "CreatedObject7_193",
        itemType: itemType,
      ),
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.18,
        top: gameProvider.deviceSize.height * 0.48,
        width: gameProvider.deviceSize.width * 0.17,
        image: "CreatedObject7_194",
        itemType: itemType,
      ),
    ];
  }
}
