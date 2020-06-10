import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/Girl1CabinItem.dart';

class Girl1CabinShirtItems extends StatelessWidget {
  const Girl1CabinShirtItems({
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
            width: gameProvider.deviceSize.width * 0.16,
            image: "CreatedObject7_159",
            itemType: itemType,
          ),
          Girl1CabinItem(
            left: gameProvider.deviceSize.width * 0.08,
            top: gameProvider.deviceSize.height * 0.14,
            width: gameProvider.deviceSize.width * 0.13,
            image: "CreatedObject7_160",
            itemType: itemType,
          ),
          Girl1CabinItem(
            left: gameProvider.deviceSize.width * 0.15,
            top: gameProvider.deviceSize.height * 0.14,
            width: gameProvider.deviceSize.width * 0.13,
            image: "CreatedObject7_161",
            itemType: itemType,
          ),
          Girl1CabinItem(
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
          Girl1CabinItem(
            left: 10,
            top: gameProvider.deviceSize.height * 0.48,
            width: gameProvider.deviceSize.width * 0.11,
            image: "CreatedObject7_163",
            itemType: itemType,
          ),
          Girl1CabinItem(
            left: gameProvider.deviceSize.width * 0.1,
            top: gameProvider.deviceSize.height * 0.48,
            width: gameProvider.deviceSize.width * 0.11,
            image: "CreatedObject7_164",
            itemType: itemType,
          ),
          Girl1CabinItem(
            left: gameProvider.deviceSize.width * 0.17,
            top: gameProvider.deviceSize.height * 0.48,
            width: gameProvider.deviceSize.width * 0.14,
            image: "CreatedObject7_165",
            itemType: itemType,
          ),
          Girl1CabinItem(
            left: gameProvider.deviceSize.width * 0.25,
            top: gameProvider.deviceSize.height * 0.48,
            width: gameProvider.deviceSize.width * 0.14,
            image: "CreatedObject7_166",
            itemType: itemType,
          ),
        ],
      ),
    );
  }
}
