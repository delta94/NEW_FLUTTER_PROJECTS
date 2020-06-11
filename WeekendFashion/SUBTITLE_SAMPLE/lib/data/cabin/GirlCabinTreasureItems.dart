import 'package:flutter/widgets.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/GirlCabinItem.dart';

import 'GirlCabintems.dart';

class GirlCabinTreasureItems extends GirlCabinItems {
  const GirlCabinTreasureItems({
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
      // ROW 1
      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.29,
        child: Image.asset(
          'images/CreatedObject7_56.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      // Wire bag
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 10,
        top: gameProvider.deviceSize.height * 0.18,
        width: gameProvider.deviceSize.width * 0.07,
        image: "CreatedObject7_59",
        itemType: itemType,
        subItemType: SubItemType.BAG,
      ),
      // Hand bag
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.09,
        top: gameProvider.deviceSize.height * 0.13,
        width: gameProvider.deviceSize.width * 0.1,
        image: "CreatedObject7_60",
        itemType: itemType,
        subItemType: SubItemType.BAG,
      ),
      // bow
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.19,
        top: gameProvider.deviceSize.height * 0.12,
        width: gameProvider.deviceSize.width * 0.08,
        image: "CreatedObject7_61",
        itemType: itemType,
        subItemType: SubItemType.NECKLET,
      ),
      // Necklet
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.28,
        top: gameProvider.deviceSize.height * 0.12,
        width: gameProvider.deviceSize.width * 0.08,
        image: "CreatedObject7_62",
        itemType: itemType,
        subItemType: SubItemType.NECKLET,
      ),
      // ROW 2

      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.51,
        child: Image.asset(
          'images/CreatedObject7_56.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      // Hand bag
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 10,
        top: gameProvider.deviceSize.height * 0.35,
        width: gameProvider.deviceSize.width * 0.08,
        image: "CreatedObject7_63",
        itemType: itemType,
        subItemType: SubItemType.BAG,
      ),
      // wire bag
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.09,
        top: gameProvider.deviceSize.height * 0.39,
        width: gameProvider.deviceSize.width * 0.09,
        image: "CreatedObject7_64",
        itemType: itemType,
        subItemType: SubItemType.BAG,
      ),
      // Hand bag
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.18,
        top: gameProvider.deviceSize.height * 0.35,
        width: gameProvider.deviceSize.width * 0.1,
        image: "CreatedObject7_65",
        itemType: itemType,
        subItemType: SubItemType.BAG,
      ),
      // earring
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.29,
        top: gameProvider.deviceSize.height * 0.38,
        width: gameProvider.deviceSize.width * 0.07,
        image: "CreatedObject7_66",
        itemType: itemType,
        subItemType: SubItemType.EARING,
      ),
      //ROW 3
      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.72,
        child: Image.asset(
          'images/CreatedObject7_56.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      //earring
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 10,
        top: gameProvider.deviceSize.height * 0.58,
        width: gameProvider.deviceSize.width * 0.07,
        image: "CreatedObject7_67",
        itemType: itemType,
        subItemType: SubItemType.EARING,
      ),
      //phone
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.09,
        top: gameProvider.deviceSize.height * 0.58,
        width: gameProvider.deviceSize.width * 0.05,
        image: "CreatedObject7_68",
        itemType: itemType,
        subItemType: SubItemType.PHONE,
      ),
      // wire bag
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.17,
        top: gameProvider.deviceSize.height * 0.59,
        width: gameProvider.deviceSize.width * 0.1,
        image: "CreatedObject7_69",
        itemType: itemType,
        subItemType: SubItemType.BAG,
      ),
      // glass
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.28,
        top: gameProvider.deviceSize.height * 0.66,
        width: gameProvider.deviceSize.width * 0.09,
        image: "CreatedObject7_70",
        itemType: itemType,
        subItemType: SubItemType.GLASS,
      ),
    ];
  }

  @override
  List<Widget> getGirl1Items(GameProvider gameProvider, ItemType itemType) {
    return <Widget>[
      // ROW 1
      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.29,
        child: Image.asset(
          'images/CreatedObject7_56.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      // Wire bag
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 10,
        top: gameProvider.deviceSize.height * 0.18,
        width: gameProvider.deviceSize.width * 0.07,
        image: "CreatedObject7_59",
        itemType: itemType,
        subItemType: SubItemType.BAG,
      ),
      // Hand bag
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.09,
        top: gameProvider.deviceSize.height * 0.13,
        width: gameProvider.deviceSize.width * 0.1,
        image: "CreatedObject7_60",
        itemType: itemType,
        subItemType: SubItemType.BAG,
      ),
      // bow
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.19,
        top: gameProvider.deviceSize.height * 0.12,
        width: gameProvider.deviceSize.width * 0.08,
        image: "CreatedObject7_61",
        itemType: itemType,
        subItemType: SubItemType.NECKLET,
      ),
      // Necklet
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.28,
        top: gameProvider.deviceSize.height * 0.12,
        width: gameProvider.deviceSize.width * 0.08,
        image: "CreatedObject7_62",
        itemType: itemType,
        subItemType: SubItemType.NECKLET,
      ),
      // ROW 2

      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.51,
        child: Image.asset(
          'images/CreatedObject7_56.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      // Hand bag
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 10,
        top: gameProvider.deviceSize.height * 0.35,
        width: gameProvider.deviceSize.width * 0.08,
        image: "CreatedObject7_63",
        itemType: itemType,
        subItemType: SubItemType.BAG,
      ),
      // wire bag
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.09,
        top: gameProvider.deviceSize.height * 0.39,
        width: gameProvider.deviceSize.width * 0.09,
        image: "CreatedObject7_64",
        itemType: itemType,
        subItemType: SubItemType.BAG,
      ),
      // Hand bag
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.18,
        top: gameProvider.deviceSize.height * 0.35,
        width: gameProvider.deviceSize.width * 0.1,
        image: "CreatedObject7_65",
        itemType: itemType,
        subItemType: SubItemType.BAG,
      ),
      // earring
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.29,
        top: gameProvider.deviceSize.height * 0.38,
        width: gameProvider.deviceSize.width * 0.07,
        image: "CreatedObject7_66",
        itemType: itemType,
        subItemType: SubItemType.EARING,
      ),
      //ROW 3
      Positioned(
        left: 3,
        top: gameProvider.deviceSize.height * 0.72,
        child: Image.asset(
          'images/CreatedObject7_56.png',
          width: gameProvider.deviceSize.width * 0.38,
        ),
      ),
      //earring
      GirlCabinItem(
        girlIndex: girlIndex,
        left: 10,
        top: gameProvider.deviceSize.height * 0.58,
        width: gameProvider.deviceSize.width * 0.07,
        image: "CreatedObject7_67",
        itemType: itemType,
        subItemType: SubItemType.EARING,
      ),
      //phone
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.09,
        top: gameProvider.deviceSize.height * 0.58,
        width: gameProvider.deviceSize.width * 0.05,
        image: "CreatedObject7_68",
        itemType: itemType,
        subItemType: SubItemType.PHONE,
      ),
      // wire bag
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.17,
        top: gameProvider.deviceSize.height * 0.59,
        width: gameProvider.deviceSize.width * 0.1,
        image: "CreatedObject7_69",
        itemType: itemType,
        subItemType: SubItemType.BAG,
      ),
      // glass
      GirlCabinItem(
        girlIndex: girlIndex,
        left: gameProvider.deviceSize.width * 0.28,
        top: gameProvider.deviceSize.height * 0.66,
        width: gameProvider.deviceSize.width * 0.09,
        image: "CreatedObject7_70",
        itemType: itemType,
        subItemType: SubItemType.GLASS,
      ),
    ];
  }
}
