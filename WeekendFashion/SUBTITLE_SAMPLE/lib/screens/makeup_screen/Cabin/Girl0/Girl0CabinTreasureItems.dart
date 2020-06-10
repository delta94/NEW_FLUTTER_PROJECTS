import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/Girl0CabinItem.dart';

class Girl0CabinTreasureItems extends StatelessWidget {
  const Girl0CabinTreasureItems({
    @required this.animation,
  });

  final Animation<double> animation;

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    ItemType itemType = ItemType.TREASURE;
    return Transform.translate(
      offset: Offset(animation.value, 0),
      child: Stack(
        children: <Widget>[
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
          Girl0CabinItem(
            left: 10,
            top: gameProvider.deviceSize.height * 0.18,
            width: gameProvider.deviceSize.width * 0.07,
            image: "CreatedObject7_59",
            itemType: itemType,
            subItemType: SubItemType.BAG,
          ),
          // Hand bag
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.09,
            top: gameProvider.deviceSize.height * 0.13,
            width: gameProvider.deviceSize.width * 0.1,
            image: "CreatedObject7_60",
            itemType: itemType,
            subItemType: SubItemType.BAG,
          ),
          // bow
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.19,
            top: gameProvider.deviceSize.height * 0.12,
            width: gameProvider.deviceSize.width * 0.08,
            image: "CreatedObject7_61",
            itemType: itemType,
            subItemType: SubItemType.NECKLET,
          ),
          // Necklet
          Girl0CabinItem(
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
          Girl0CabinItem(
            left: 10,
            top: gameProvider.deviceSize.height * 0.35,
            width: gameProvider.deviceSize.width * 0.08,
            image: "CreatedObject7_63",
            itemType: itemType,
            subItemType: SubItemType.BAG,
          ),
          // wire bag
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.09,
            top: gameProvider.deviceSize.height * 0.39,
            width: gameProvider.deviceSize.width * 0.09,
            image: "CreatedObject7_64",
            itemType: itemType,
            subItemType: SubItemType.BAG,
          ),
          // Hand bag
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.18,
            top: gameProvider.deviceSize.height * 0.35,
            width: gameProvider.deviceSize.width * 0.1,
            image: "CreatedObject7_65",
            itemType: itemType,
            subItemType: SubItemType.BAG,
          ),
          // earring
          Girl0CabinItem(
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
          Girl0CabinItem(
            left: 10,
            top: gameProvider.deviceSize.height * 0.58,
            width: gameProvider.deviceSize.width * 0.07,
            image: "CreatedObject7_67",
            itemType: itemType,
            subItemType: SubItemType.EARING,
          ),
          //phone
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.09,
            top: gameProvider.deviceSize.height * 0.58,
            width: gameProvider.deviceSize.width * 0.05,
            image: "CreatedObject7_68",
            itemType: itemType,
            subItemType: SubItemType.PHONE,
          ),
          // wire bag
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.17,
            top: gameProvider.deviceSize.height * 0.59,
            width: gameProvider.deviceSize.width * 0.1,
            image: "CreatedObject7_69",
            itemType: itemType,
            subItemType: SubItemType.BAG,
          ),
          // glass
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.28,
            top: gameProvider.deviceSize.height * 0.66,
            width: gameProvider.deviceSize.width * 0.09,
            image: "CreatedObject7_70",
            itemType: itemType,
            subItemType: SubItemType.GLASS,
          ),
        ],
      ),
    );
  }
}
