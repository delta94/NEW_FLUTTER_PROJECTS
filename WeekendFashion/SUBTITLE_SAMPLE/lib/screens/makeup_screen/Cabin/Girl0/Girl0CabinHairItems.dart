import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/Girl0CabinItem.dart';

class Girl0CabinHairItems extends StatelessWidget {
  const Girl0CabinHairItems({
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
          Girl0CabinItem(
              left: 10,
              top: gameProvider.deviceSize.height * 0.15,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_14",
              itemType: itemType),
          Girl0CabinItem(
              left: gameProvider.deviceSize.width * 0.1 + 15,
              top: gameProvider.deviceSize.height * 0.15,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_15",
              itemType: itemType),
          Girl0CabinItem(
              left: gameProvider.deviceSize.width * 0.2 + 20,
              top: gameProvider.deviceSize.height * 0.15,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_16",
              itemType: itemType),
          // Hair row 2
          Girl0CabinItem(
              left: 10,
              top: gameProvider.deviceSize.height * 0.43,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_17",
              itemType: itemType),
          Girl0CabinItem(
              left: gameProvider.deviceSize.width * 0.1 + 15,
              top: gameProvider.deviceSize.height * 0.43,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_18",
              itemType: itemType),
          Girl0CabinItem(
              left: gameProvider.deviceSize.width * 0.2 + 20,
              top: gameProvider.deviceSize.height * 0.43,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_19",
              itemType: itemType),
          // Hair row 3
          Girl0CabinItem(
              left: gameProvider.deviceSize.width * 0.08,
              top: gameProvider.deviceSize.height * 0.7,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_20",
              itemType: itemType),
          Girl0CabinItem(
              left: gameProvider.deviceSize.width * 0.19,
              top: gameProvider.deviceSize.height * 0.7,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_21",
              itemType: itemType),
        ],
      ),
    );
  }
}
