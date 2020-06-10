import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/Girl0CabinItem.dart';

class Girl0CabinShirtItems extends StatelessWidget {
  const Girl0CabinShirtItems({
    @required this.animation,
  });

  final Animation<double> animation;

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    ItemType itemType = ItemType.SHIRT;
    return Transform.translate(
      offset: Offset(animation.value, 0),
      child: Stack(
        children: <Widget>[
          Positioned(
            left: 3,
            top: gameProvider.deviceSize.height * 0.16,
            child: Image.asset(
              'images/CreatedObject7_46.png',
              width: gameProvider.deviceSize.width * 0.38,
            ),
          ),
          Girl0CabinItem(
            left: -20,
            top: gameProvider.deviceSize.height * 0.15,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_31",
            itemType: itemType,
          ),
           Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.05,
            top: gameProvider.deviceSize.height * 0.15,
            width: gameProvider.deviceSize.width * 0.1,
            image: "CreatedObject7_26",
            itemType: itemType,
          ),
           Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.12,
            top: gameProvider.deviceSize.height * 0.15,
            width: gameProvider.deviceSize.width * 0.1,
            image: "CreatedObject7_27",
            itemType: itemType,
          ),
           Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.18,
            top: gameProvider.deviceSize.height * 0.15,
            width: gameProvider.deviceSize.width * 0.1,
            image: "CreatedObject7_28",
            itemType: itemType,
          ),
           Girl0CabinItem(
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
          Girl0CabinItem(
            left: -5,
            top: gameProvider.deviceSize.height * 0.4,
            width: gameProvider.deviceSize.width * 0.1,
            image: "CreatedObject7_30",
            itemType: itemType,
          ),
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.05,
            top: gameProvider.deviceSize.height * 0.4,
            width: gameProvider.deviceSize.width * 0.1,
            image: "CreatedObject7_25",
            itemType: itemType,
          ),
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.1,
            top: gameProvider.deviceSize.height * 0.4,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_32",
            itemType: itemType,
          ),
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.18,
            top: gameProvider.deviceSize.height * 0.4,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_33",
            itemType: itemType,
          ),
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.25,
            top: gameProvider.deviceSize.height * 0.4,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_34",
            itemType: itemType,
          ),
        ],
      ),
    );
  }
}
