import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/Girl1CabinItem.dart';

class Girl1CabinHairItems extends StatelessWidget {
  const Girl1CabinHairItems({
    @required this.animation,
  });

  final Animation<double> animation;

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    ItemType itemType = ItemType.HAIR;
    return Transform.translate(
      offset: Offset(animation.value, 0),
                child: Stack(
        children: <Widget>[
          Girl1CabinItem(
              left: 10,
              top: gameProvider.deviceSize.height * 0.15,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_148",
              itemType: itemType),
          Girl1CabinItem(
              left: gameProvider.deviceSize.width * 0.1 + 15,
              top: gameProvider.deviceSize.height * 0.15,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_149",
              itemType: itemType),
          Girl1CabinItem(
              left: gameProvider.deviceSize.width * 0.2 + 20,
              top: gameProvider.deviceSize.height * 0.15,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_150",
              itemType: itemType),
          // Hair row 2
          Girl1CabinItem(
              left: 10,
              top: gameProvider.deviceSize.height * 0.43,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_151",
              itemType: itemType),
          Girl1CabinItem(
              left: gameProvider.deviceSize.width * 0.1 + 15,
              top: gameProvider.deviceSize.height * 0.43,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_152",
              itemType: itemType),
          Girl1CabinItem(
              left: gameProvider.deviceSize.width * 0.2 + 20,
              top: gameProvider.deviceSize.height * 0.43,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_153",
              itemType: itemType),
          // Hair row 3
          Girl1CabinItem(
              left: gameProvider.deviceSize.width * 0.08,
              top: gameProvider.deviceSize.height * 0.7,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_154",
              itemType: itemType),
          Girl1CabinItem(
              left: gameProvider.deviceSize.width * 0.19,
              top: gameProvider.deviceSize.height * 0.7,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_155",
              itemType: itemType),
        ],
      ),
    );
  }
}
