import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/CabinItem.dart';

class CabinHairItems extends StatelessWidget {
  const CabinHairItems({
    Key key,
    @required this.hairAnimation,
  }) : super(key: key);

  final Animation<double> hairAnimation;

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    return Transform.translate(
      offset: Offset(hairAnimation.value, 0),
                child: Stack(
        children: <Widget>[
          CabinItem(
              left: 10,
              top: gameProvider.deviceSize.height * 0.15,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_14.png",
              itemType: ItemType.HAIR),
          CabinItem(
              left: gameProvider.deviceSize.width * 0.1 + 15,
              top: gameProvider.deviceSize.height * 0.15,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_15.png",
              itemType: ItemType.HAIR),
          CabinItem(
              left: gameProvider.deviceSize.width * 0.2 + 20,
              top: gameProvider.deviceSize.height * 0.15,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_16.png",
              itemType: ItemType.HAIR),
          // Hair row 2
          CabinItem(
              left: 10,
              top: gameProvider.deviceSize.height * 0.43,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_17.png",
              itemType: ItemType.HAIR),
          CabinItem(
              left: gameProvider.deviceSize.width * 0.1 + 15,
              top: gameProvider.deviceSize.height * 0.43,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_18.png",
              itemType: ItemType.HAIR),
          CabinItem(
              left: gameProvider.deviceSize.width * 0.2 + 20,
              top: gameProvider.deviceSize.height * 0.43,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_19.png",
              itemType: ItemType.HAIR),
          // Hair row 3
          CabinItem(
              left: gameProvider.deviceSize.width * 0.08,
              top: gameProvider.deviceSize.height * 0.7,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_20.png",
              itemType: ItemType.HAIR),
          CabinItem(
              left: gameProvider.deviceSize.width * 0.19,
              top: gameProvider.deviceSize.height * 0.7,
              width: gameProvider.deviceSize.width * 0.1,
              image: "CreatedObject7_21.png",
              itemType: ItemType.HAIR),
        ],
      ),
    );
  }
}
