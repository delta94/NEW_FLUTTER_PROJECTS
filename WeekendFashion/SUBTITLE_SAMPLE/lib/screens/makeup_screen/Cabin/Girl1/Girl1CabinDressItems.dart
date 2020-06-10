import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/Girl1CabinItem.dart';

class Girl1CabinDressItems extends StatelessWidget {
  const Girl1CabinDressItems({
    @required this.animation,
  });

  final Animation<double> animation;

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    ItemType itemType = ItemType.DRESS;
    return Transform.translate(
      offset: Offset(animation.value, 0),
      child: Stack(
        children: <Widget>[
          Positioned(
            left: 30,
            top: gameProvider.deviceSize.height * 0.16,
            child: Image.asset(
              'images/CreatedObject7_156.png',
              width: gameProvider.deviceSize.width * 0.32,
            ),
          ),
          Girl1CabinItem(
            left: 0,
            top: gameProvider.deviceSize.height * 0.14,
            width: gameProvider.deviceSize.width * 0.13,
            image: "CreatedObject7_180",
            itemType: itemType,
          ),
          Girl1CabinItem(
            left: gameProvider.deviceSize.width * 0.08,
            top: gameProvider.deviceSize.height * 0.14,
            width: gameProvider.deviceSize.width * 0.13,
            image: "CreatedObject7_181",
            itemType: itemType,
          ),
          Girl1CabinItem(
            left: gameProvider.deviceSize.width * 0.17,
            top: gameProvider.deviceSize.height * 0.14,
            width: gameProvider.deviceSize.width * 0.1,
            image: "CreatedObject7_182",
            itemType: itemType,
          ),
          Girl1CabinItem(
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
          Girl1CabinItem(
            left: 0,
            top: gameProvider.deviceSize.height * 0.485,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_184",
            itemType: itemType,
          ),
          Girl1CabinItem(
            left: gameProvider.deviceSize.width * 0.07,
            top: gameProvider.deviceSize.height * 0.485,
            width: gameProvider.deviceSize.width * 0.17,
            image: "CreatedObject7_185",
            itemType: itemType,
          ),
          Girl1CabinItem(
            left: gameProvider.deviceSize.width * 0.17,
            top: gameProvider.deviceSize.height * 0.485,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_186",
            itemType: itemType,
          ),
          Girl1CabinItem(
            left: gameProvider.deviceSize.width * 0.25,
            top: gameProvider.deviceSize.height * 0.485,
            width: gameProvider.deviceSize.width * 0.135,
            image: "CreatedObject7_187",
            itemType: itemType,
          ),
        ],
      ),
    );
  }
}
