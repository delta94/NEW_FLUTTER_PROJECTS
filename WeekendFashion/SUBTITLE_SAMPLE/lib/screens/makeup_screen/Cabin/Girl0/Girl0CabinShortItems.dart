import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/Girl0CabinItem.dart';

class Girl0CabinShortItems extends StatelessWidget {
  const Girl0CabinShortItems({
    @required this.animation,
  });

  final Animation<double> animation;

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    ItemType itemType = ItemType.SHORT;
    return Transform.translate(
      offset: Offset(animation.value, 0),
      child: Stack(
        children: <Widget>[
          Positioned(
            left: 3,
            top: gameProvider.deviceSize.height * 0.155,
            child: Image.asset(
              'images/CreatedObject7_46.png',
              width: gameProvider.deviceSize.width * 0.38,
            ),
          ),
          //0
          Girl0CabinItem(
            left: 0,
            top: gameProvider.deviceSize.height * 0.15,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_38",
            itemType: itemType,
          ),
          //1
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.08,
            top: gameProvider.deviceSize.height * 0.15,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_39",
            itemType: itemType,
          ),
          //2
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.18,
            top: gameProvider.deviceSize.height * 0.15,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_40",
            itemType: itemType,
          ),
          //3
          Girl0CabinItem(
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
          Girl0CabinItem(
            left: 0,
            top: gameProvider.deviceSize.height * 0.5,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_42",
            itemType: itemType,
          ),
          //5
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.1,
            top: gameProvider.deviceSize.height * 0.5,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_43",
            itemType: itemType,
          ),
          //6
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.2,
            top: gameProvider.deviceSize.height * 0.5,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_44",
            itemType: itemType,
          ),
          //7
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.27,
            top: gameProvider.deviceSize.height * 0.5,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_45",
            itemType: itemType,
          ),
        ],
      ),
    );
  }
}
