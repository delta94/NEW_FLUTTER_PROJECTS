import 'dart:async';

import 'package:flare_flutter/flare_actor.dart';
import 'package:flare_flutter/flare_controls.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';
import 'package:seab1ird.showyourself/helpers/AnimationHelper.dart';
import 'package:seab1ird.showyourself/helpers/EndlessController.dart';
import 'package:seab1ird.showyourself/helpers/Helper.dart';

import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/routers.dart';
import 'package:seab1ird.showyourself/widgets/AnimatedButton.dart';
import 'package:seab1ird.showyourself/widgets/ChangingScreenAnimation.dart';

import 'Cabin/Girl1/Girl1CabinDressItems.dart';
import 'Cabin/Girl1/Girl1CabinHairItems.dart';
import 'Cabin/Girl1/Girl1CabinJacketItems.dart';
import 'Cabin/Girl1/Girl1CabinShirtItems.dart';
import 'Cabin/Girl1/Girl1CabinShortItems.dart';
import 'Cabin/Girl1/Girl1CabinTreasureItems.dart';


class Girl1MakeupScreen extends StatefulWidget {
  Girl1MakeupScreen({Key key}) : super(key: key);
  Girl1MakeupScreenState createState() => Girl1MakeupScreenState();
}

class Girl1MakeupScreenState extends State<Girl1MakeupScreen>
    with TickerProviderStateMixin {
  Animation<double> initScreenAnimation;
  Animation<double> changingScreenAnimation;
  Animation<double> hairAnimation;
  Animation<double> shirtAnimation;
  Animation<double> shortAnimation;
  Animation<double> dressAnimation;
  Animation<double> jacketAnimation;
  Animation<double> treasureAnimation;

  AnimationController initScreenController;
  AnimationController changingScreenController;

  AnimationController hairController;
  AnimationController shirtController;
  AnimationController shortController;
  AnimationController dressController;
  AnimationController jacketController;
  AnimationController treasureController;

  final FlareControls changingItemFlareControl = FlareControls();

  Map<ItemType, AnimationController> itemTypeListMap =
      new Map<ItemType, AnimationController>();
  ItemType currItemListType = ItemType.values[0];
  ItemType oldItemListType;

  bool show = true;

  Future<bool> _onWillPop() {
    Navigator.pop(context);
    return Future<bool>.value(false);
  }

  final EndlessController previousButton = EndlessController('Untitled', 2);
  final EndlessController nextButton = EndlessController('Untitled', 2);

  @override
  void initState() {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);

    initScreenController = AnimationHelper.getAnimationController(this);
    initScreenAnimation =
        Tween<double>(begin: 0, end: 0 - gameProvider.deviceSize.height)
            .animate(initScreenController)
              ..addListener(() {
                setState(() {});
              });

    hairController = AnimationHelper.getAnimationController(this, 800);
    hairAnimation =
        Tween<double>(begin: gameProvider.deviceSize.width, end: gameProvider.deviceSize.width - gameProvider.deviceSize.width * 0.4)
            .animate(hairController)
              ..addListener(() {
                setState(() {});
              });

    shirtController = AnimationHelper.getAnimationController(this, 800);
    shirtAnimation =
        Tween<double>(begin: gameProvider.deviceSize.width, end: gameProvider.deviceSize.width - gameProvider.deviceSize.width * 0.4)
            .animate(shirtController)
              ..addListener(() {
                setState(() {});
              });

    shortController = AnimationHelper.getAnimationController(this, 800);
    shortAnimation =
        Tween<double>(begin: gameProvider.deviceSize.width, end: gameProvider.deviceSize.width - gameProvider.deviceSize.width * 0.4)
            .animate(shortController)
              ..addListener(() {
                setState(() {});
              });

    dressController = AnimationHelper.getAnimationController(this, 800);
    dressAnimation =
        Tween<double>(begin: gameProvider.deviceSize.width, end: gameProvider.deviceSize.width - gameProvider.deviceSize.width * 0.4)
            .animate(dressController)
              ..addListener(() {
                setState(() {});
              });

    jacketController = AnimationHelper.getAnimationController(this, 800);
    jacketAnimation =
        Tween<double>(begin: gameProvider.deviceSize.width, end: gameProvider.deviceSize.width - gameProvider.deviceSize.width * 0.4)
            .animate(jacketController)
              ..addListener(() {
                setState(() {});
              });

    treasureController = AnimationHelper.getAnimationController(this, 800);
    treasureAnimation =
        Tween<double>(begin: gameProvider.deviceSize.width, end: gameProvider.deviceSize.width - gameProvider.deviceSize.width * 0.4)
            .animate(treasureController)
              ..addListener(() {
                setState(() {});
              });

    itemTypeListMap[ItemType.HAIR] = hairController;
    itemTypeListMap[ItemType.SHIRT] = shirtController;
    itemTypeListMap[ItemType.DRESS] = dressController;
    itemTypeListMap[ItemType.SHORT] = shortController;
    itemTypeListMap[ItemType.JACKET] = jacketController;
    itemTypeListMap[ItemType.TREASURE] = treasureController;

    gameProvider.selectedItemGirl1Map[ItemType.HAIR] = <SubItemType, String>{
      null: 'CreatedObject7_148'
    };
    gameProvider.selectedItemGirl1Map[ItemType.SHIRT] = <SubItemType, String>{
      null: null
    };
    gameProvider.selectedItemGirl1Map[ItemType.DRESS] = <SubItemType, String>{
      null: null
    };
    gameProvider.selectedItemGirl1Map[ItemType.SHORT] = <SubItemType, String>{
      null: null
    };
    // gameProvider.selectedItemGirl1Map[ItemType.JACKET] = <SubItemType, String>{
    //   null: null
    // };
    // gameProvider.selectedItemGirl1Map[ItemType.TREASURE] = <SubItemType, String>{
    //   SubItemType.BAG: null
    // };
    // gameProvider.selectedItemGirl1Map[ItemType.TREASURE] = <SubItemType, String>{
    //   SubItemType.EARING: null
    // };
    // gameProvider.selectedItemGirl1Map[ItemType.TREASURE] = <SubItemType, String>{
    //   SubItemType.NECKLET: null
    // };
    // gameProvider.selectedItemGirl1Map[ItemType.TREASURE] = <SubItemType, String>{
    //   SubItemType.PHONE: null
    // };
    // gameProvider.selectedItemGirl1Map[ItemType.TREASURE] = <SubItemType, String>{
    //   SubItemType.GLASS: null
    // };

    super.initState();
  }

  void _playChangeItemAnimation() {
    changingItemFlareControl.play('Untitled');
  }

  @override
  void dispose() {
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    gameProvider.init();
    _playChangeItemAnimation();

    initScreenController.forward();

    changingScreenController =
        AnimationHelper.getAnimationController(this, 500);
    changingScreenAnimation =
        Tween<double>(begin: 0 - gameProvider.deviceSize.height, end: 0)
            .animate(changingScreenController)
              ..addListener(() {
                setState(() {});
              });

    if (oldItemListType != null) {
      itemTypeListMap[oldItemListType].reverse();
      oldItemListType = null;
    } else {
      itemTypeListMap[currItemListType].forward();
    }

    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));

    return WillPopScope(
      onWillPop: _onWillPop,
      child: Scaffold(
        body: Stack(children: <Widget>[
          Container(
            decoration: BoxDecoration(
              image: DecorationImage(
                image: AssetImage('images/CreatedObject7_142.png'),
                fit: BoxFit.fitWidth,
              ),
            ),
          ),
          // Cabin
          Positioned(
            right: 4,
            bottom: 10,
            child: Image.asset(
              "images/CreatedObject7_143.png",
              width: gameProvider.deviceSize.width * 0.4,
            ),
          ),

          // HAIR PRESENT
          Girl1CabinHairItems(animation: hairAnimation),
          // SHIRT PRESENT
          Girl1CabinShirtItems(animation: shirtAnimation),
          // SHORT PRESENT
          Girl1CabinShortItems(animation: shortAnimation),
          // SKIRT PRESENT
          Girl1CabinDressItems(animation: dressAnimation),
          // // JACKET PRESENT
          // Girl1CabinJacketItems(animation: jacketAnimation),
          // // TREASURE PRESENT
          // Girl1CabinTreasureItems(animation: treasureAnimation),
          //----------------------------------------------------------
          // sub hair
          Helper.getSubItem(gameProvider.getGirl1SelectedItem(ItemType.HAIR)),
          // // sub treasure
          // Helper.getSubItem(
          //     gameProvider.getGirl1SelectedItem(ItemType.TREASURE, SubItemType.BAG)),
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
          // shirt
          Helper.getItem(gameProvider.getGirl1SelectedItem(ItemType.SHIRT)),
          // short
          Helper.getItem(gameProvider.getGirl1SelectedItem(ItemType.SHORT)),
          // skirt
          Helper.getItem(gameProvider.getGirl1SelectedItem(ItemType.DRESS)),
          // // Jacket
          // Helper.getItem(gameProvider.getGirl1SelectedItem(ItemType.JACKET)),
          // // Treasure 1
          // Helper.getItem(
          //     gameProvider.getGirl1SelectedItem(ItemType.TREASURE, SubItemType.BAG)),
          // // Treasure 2
          // Helper.getItem(gameProvider.getGirl1SelectedItem(
          //     ItemType.TREASURE, SubItemType.EARING)),
          // // Treasure 3
          // Helper.getItem(gameProvider.getGirl1SelectedItem(
          //     ItemType.TREASURE, SubItemType.NECKLET)),
          // // Treasure 4
          // Helper.getItem(gameProvider.getGirl1SelectedItem(
          //     ItemType.TREASURE, SubItemType.PHONE)),
          // // Treasure 5
          // Helper.getItem(gameProvider.getGirl1SelectedItem(
          //     ItemType.TREASURE, SubItemType.GLASS)),
          // hair
          Helper.getItem(gameProvider.getGirl1SelectedItem(ItemType.HAIR)),

          Positioned(
            left: 40,
            top: gameProvider.deviceSize.height * 0.1,
            height: gameProvider.deviceSize.height * 0.9,
            width: gameProvider.deviceSize.width * 0.5,
            child: FlareActor(
              "images/changing_item.flr",
              fit: BoxFit.contain,
              animation: "Untitled",
              controller: changingItemFlareControl,
            ),
          ),

          Positioned(
            left: gameProvider.deviceSize.width * 0.3,
            bottom: 10,
            height: gameProvider.deviceSize.height * 0.2,
            width: gameProvider.deviceSize.height * 0.4,
            child: Container(
              child: FlatButton(
                color: Colors.transparent,
                onPressed: () {
                  setState(() {
                    oldItemListType = currItemListType;
                    currItemListType = ItemType.values[Helper.getItemTypeIndex(
                        ItemType.values.indexOf(oldItemListType) - 1,
                        ItemType.values.length)];
                  });
                },
                child: FlareActor(
                  "images/previous_item_list.flr",
                  controller: previousButton,
                ),
              ),
            ),
          ),

          Positioned(
            left: gameProvider.deviceSize.width * 0.45,
            bottom: 10,
            height: gameProvider.deviceSize.height * 0.2,
            width: gameProvider.deviceSize.height * 0.4,
            child: Container(
              child: FlatButton(
                color: Colors.transparent,
                onPressed: () {
                  setState(() {
                    oldItemListType = currItemListType;
                    currItemListType = ItemType.values[Helper.getItemTypeIndex(
                        ItemType.values.indexOf(oldItemListType) + 1,
                        ItemType.values.length)];
                  });
                },
                child: FlareActor(
                  "images/next_item_list.flr",
                  controller: nextButton,
                ),
              ),
            ),
          ),

          // Visibility(
          //   visible:  isValid(gameProvider),
          //   child: Positioned(
          //     left: gameProvider.deviceSize.width * 0.02,
          //     bottom: 10,
          //     child: AnimatedButton(
          //       image: "images/nextButton.png",
          //       width: gameProvider.deviceSize.width * 0.1,
          //       callback: () {
          //         gameProvider.currentGirlIndex = 1;
          //         Navigator.pushNamed(context, Routers.GIRL_OPTIONS);
          //       },
          //     ),
          //   ),
          // ),

          ChangingScreenAnimation(changingScreenAnimation: initScreenAnimation),
          ChangingScreenAnimation(
              changingScreenAnimation: changingScreenAnimation),
        ]),
      ),
    );
  }

  // isValid(GameProvider gameProvider){
  //   bool isValid = true;
  //   isValid &= gameProvider.selectedItemGirl1Map[ItemType.SHIRT][null] != null;
  //   isValid &= gameProvider.selectedItemGirl1Map[ItemType.SHORT][null] != null;
  //   return isValid;
  // }
}
