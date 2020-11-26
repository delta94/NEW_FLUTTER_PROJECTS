import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabi1rd.weekendfashion/enums/ItemType.dart';
import 'package:seabi1rd.weekendfashion/helpers/GameProvider.dart';

class GirlCabinItems extends StatelessWidget {
  const GirlCabinItems(
      {@required this.animation,
      @required this.girlIndex,
      @required this.itemType});

  final Animation<double> animation;
  final int girlIndex;
  final ItemType itemType;

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    return Transform.translate(
      offset: Offset(animation.value, 0),
      child: Stack(
        children: getGirlWidget(gameProvider, itemType),
      ),
    );
  }

  List<Widget> getGirlWidget(GameProvider gameProvider, ItemType itemType) {
    if (girlIndex == 0) {
      return getGirl0Items(gameProvider, itemType);
    } else {
      return getGirl1Items(gameProvider, itemType);
    }
  }

  List<Widget> getGirl0Items(GameProvider gameProvider, ItemType itemType) {
    return new List<Widget>();
  }

  List<Widget> getGirl1Items(GameProvider gameProvider, ItemType itemType) {
    return new List<Widget>();
  }
}
