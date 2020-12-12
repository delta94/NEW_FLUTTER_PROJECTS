import 'package:flutter/widgets.dart';
import 'package:seabird.weekendfashion/enums/ItemType.dart';
import 'package:seabird.weekendfashion/enums/SubItemType.dart';
import 'package:seabird.weekendfashion/helpers/GameProvider.dart';
import 'package:seabird.weekendfashion/helpers/Helper.dart';

class FashionGirl0 extends StatelessWidget {
  const FashionGirl0({
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
            subItemType: null, girlIndex: 0)),
        // sub treasure
        Helper.getSubItem(gameProvider.getGirlSelectedItem(ItemType.TREASURE,
            subItemType: SubItemType.BAG, girlIndex: 0)),
        // body
        Positioned(
          right: 120,
          bottom: 0,
          child: Image.asset("images/CreatedObject7_71.png", width: 140),
        ),
        // head
        Positioned(
          right: 165,
          bottom: 250,
          child: Image.asset(
            "images/CreatedObject7_72.png",
            width: 55,
          ),
        ),
        // short
        Helper.getItem(gameProvider.getGirlSelectedItem(ItemType.SHORT,
            subItemType: null, girlIndex: 0)),
        // shirt
        Helper.getInsideItem(
            gameProvider.getGirlSelectedItem(ItemType.SHIRT,
                subItemType: null, girlIndex: 0),
            gameProvider),
        // Jacket
        Helper.getItem(gameProvider.getGirlSelectedItem(ItemType.JACKET,
            subItemType: null, girlIndex: 0)),
        // Treasure 1
        Helper.getItem(gameProvider.getGirlSelectedItem(ItemType.TREASURE,
            subItemType: SubItemType.BAG, girlIndex: 0)),
        // Treasure 2
        Helper.getItem(gameProvider.getGirlSelectedItem(ItemType.TREASURE,
            subItemType: SubItemType.EARING, girlIndex: 0)),
        // Treasure 3
        Helper.getItem(gameProvider.getGirlSelectedItem(ItemType.TREASURE,
            subItemType: SubItemType.NECKLET, girlIndex: 0)),
        // Treasure 4
        Helper.getItem(gameProvider.getGirlSelectedItem(ItemType.TREASURE,
            subItemType: SubItemType.PHONE, girlIndex: 0)),
        // Treasure 5
        Helper.getItem(gameProvider.getGirlSelectedItem(ItemType.TREASURE,
            subItemType: SubItemType.GLASS, girlIndex: 0)),
        // hair
        Helper.getItem(gameProvider.getGirlSelectedItem(ItemType.HAIR,
            subItemType: null, girlIndex: 0)),

        // hand
        Positioned(
          right: 190,
          bottom: 163,
          child: Image.asset(
            "images/CreatedObject7_73.png",
            width: 30,
          ),
        ),
      ],
    );
  }
}
