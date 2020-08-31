import 'package:flutter/widgets.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/helpers/Helper.dart';

class FashionGirl1 extends StatelessWidget {
  const FashionGirl1({
    Key key,
    @required this.gameProvider,
  }) : super(key: key);

  final GameProvider gameProvider;

  @override
  Widget build(BuildContext context) {
    return Stack(
      children: <Widget>[
        // sub hair
        Helper.getSubItem(gameProvider.getGirlSelectedItem(ItemType.HAIR,
            subItemType: null, girlIndex: 1)),
        // sub treasure
        Helper.getSubItem(gameProvider.getGirlSelectedItem(ItemType.TREASURE,
            subItemType: SubItemType.BAG, girlIndex: 1)),
        // body
        Positioned(
          left: 120,
          bottom: 0,
          child: Image.asset("images/CreatedObject7_207.png", width: 125),
        ),
        // head
        Positioned(
          left: 165,
          bottom: 253,
          child: Image.asset(
            "images/CreatedObject7_206.png",
            width: 55,
          ),
        ),
        // short
        Helper.getItem(gameProvider.getGirlSelectedItem(ItemType.SHORT,
            subItemType: null, girlIndex: 1)),
        // shirt
        Helper.getInsideItem(
            gameProvider.getGirlSelectedItem(ItemType.SHIRT,
                subItemType: null, girlIndex: 1),
            gameProvider),
        // dress
        Helper.getInsideItem(
            gameProvider.getGirlSelectedItem(ItemType.DRESS,
                subItemType: null, girlIndex: 1),
            gameProvider),
        // Jacket
        Helper.getItem(gameProvider.getGirlSelectedItem(ItemType.JACKET,
            subItemType: null, girlIndex: 1)),
        // Treasure 2
        Helper.getItem(gameProvider.getGirlSelectedItem(ItemType.TREASURE,
            subItemType: SubItemType.NECKLACE, girlIndex: 1)),
        // Treasure 3
        Helper.getItem(gameProvider.getGirlSelectedItem(ItemType.TREASURE,
            subItemType: SubItemType.NECKLET, girlIndex: 1)),
        // Treasure 1
        Helper.getItem(gameProvider.getGirlSelectedItem(ItemType.TREASURE,
            subItemType: SubItemType.BAG, girlIndex: 1)),
        // hair
        Helper.getItem(gameProvider.getGirlSelectedItem(ItemType.HAIR,
            subItemType: null, girlIndex: 1)),
      ],
    );
  }
}
