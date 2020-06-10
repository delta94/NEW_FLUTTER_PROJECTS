import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/Girl1CabinItem.dart';

class Girl1CabinShortItems extends StatelessWidget {
  const Girl1CabinShortItems({
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
            top: gameProvider.deviceSize.height * 0.165,
            child: Image.asset(
              'images/CreatedObject7_46.png',
              width: gameProvider.deviceSize.width * 0.38,
            ),
          ),
          //0
          Girl1CabinItem(
            left: 0,
            top: gameProvider.deviceSize.height * 0.15,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_170",
            itemType: itemType,
          ),
          //1
          Girl1CabinItem(
            left: gameProvider.deviceSize.width * 0.08,
            top: gameProvider.deviceSize.height * 0.15,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_171",
            itemType: itemType,
          ),
          //2
          Girl1CabinItem(
            left: gameProvider.deviceSize.width * 0.16,
            top: gameProvider.deviceSize.height * 0.15,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_172",
            itemType: itemType,
          ),
          //3
          Girl1CabinItem(
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
          Girl1CabinItem(
            left: 0,
            top: gameProvider.deviceSize.height * 0.5,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_175",
            itemType: itemType,
          ),
          //5
          Girl1CabinItem(
            left: gameProvider.deviceSize.width * 0.08,
            top: gameProvider.deviceSize.height * 0.5,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_176",
            itemType: itemType,
          ),
          //6
          Girl1CabinItem(
            left: gameProvider.deviceSize.width * 0.16,
            top: gameProvider.deviceSize.height * 0.5,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_177",
            itemType: itemType,
          ),
          //7
          Girl1CabinItem(
            left: gameProvider.deviceSize.width * 0.25,
            top: gameProvider.deviceSize.height * 0.5,
            width: gameProvider.deviceSize.width * 0.12,
            image: "CreatedObject7_174",
            itemType: itemType,
          ),
        ],
      ),
    );
  }
}
