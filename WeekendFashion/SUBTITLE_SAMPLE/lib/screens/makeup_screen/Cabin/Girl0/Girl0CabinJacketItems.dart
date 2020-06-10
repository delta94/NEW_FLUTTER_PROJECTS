import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/Girl0CabinItem.dart';

class Girl0CabinJacketItems extends StatelessWidget {
  const Girl0CabinJacketItems({
    @required this.animation,
  });

  final Animation<double> animation;

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    ItemType itemType = ItemType.JACKET;
    return Transform.translate(
      offset: Offset(animation.value, 0),
      child: Stack(
        children: <Widget>[
          Positioned(
            left: 3,
            top: gameProvider.deviceSize.height * 0.125,
            child: Image.asset(
              'images/CreatedObject7_46.png',
              width: gameProvider.deviceSize.width * 0.38,
            ),
          ),
          Girl0CabinItem(
            left: 0,
            top: gameProvider.deviceSize.height * 0.11,
            width: gameProvider.deviceSize.width * 0.14,
            image: "CreatedObject7_49",
            itemType: itemType,
          ),
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.12,
            top: gameProvider.deviceSize.height * 0.11,
            width: gameProvider.deviceSize.width * 0.14,
            image: "CreatedObject7_50",
            itemType: itemType,
          ),
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.25,
            top: gameProvider.deviceSize.height * 0.11,
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
          Girl0CabinItem(
            left: 0,
            top: gameProvider.deviceSize.height * 0.45,
            width: gameProvider.deviceSize.width * 0.14,
            image: "CreatedObject7_52",
            itemType: itemType,
          ),
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.12,
            top: gameProvider.deviceSize.height * 0.45,
            width: gameProvider.deviceSize.width * 0.14,
            image: "CreatedObject7_53",
            itemType: itemType,
          ),
          Girl0CabinItem(
            left: gameProvider.deviceSize.width * 0.25,
            top: gameProvider.deviceSize.height * 0.45,
            width: gameProvider.deviceSize.width * 0.14,
            image: "CreatedObject7_54",
            itemType: itemType,
          ),
        ],
      ),
    );
  }
}
