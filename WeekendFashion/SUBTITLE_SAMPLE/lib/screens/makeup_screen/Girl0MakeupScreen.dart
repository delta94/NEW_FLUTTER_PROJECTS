import 'dart:async';

import 'package:flare_flutter/flare_actor.dart';
import 'package:flare_flutter/flare_controls.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/data/cabin/GirlCabinHairItems.dart';
import 'package:seab1ird.showyourself/data/cabin/GirlCabinJacketItems.dart';
import 'package:seab1ird.showyourself/data/cabin/GirlCabinShirtItems.dart';
import 'package:seab1ird.showyourself/data/cabin/GirlCabinShortItems.dart';
import 'package:seab1ird.showyourself/data/cabin/GirlCabinTreasureItems.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';
import 'package:seab1ird.showyourself/helpers/AnimationHelper.dart';
import 'package:seab1ird.showyourself/helpers/EndlessController.dart';
import 'package:seab1ird.showyourself/helpers/Helper.dart';

import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/routers.dart';
import 'package:seab1ird.showyourself/widgets/AnimatedButton.dart';
import 'package:seab1ird.showyourself/widgets/ChangingScreenAnimation.dart';

class Girl0MakeupScreen extends StatefulWidget {
  Girl0MakeupScreen({Key key}) : super(key: key);
  Girl0MakeupScreenState createState() => Girl0MakeupScreenState();
}

class Girl0MakeupScreenState extends State<Girl0MakeupScreen>
    with TickerProviderStateMixin {
  Animation<double> initScreenAnimation;
  Animation<double> changingScreenAnimation;
  Animation<double> hairAnimation;
  Animation<double> shirtAnimation;
  Animation<double> shortAnimation;
  Animation<double> jacketAnimation;
  Animation<double> treasureAnimation;

  AnimationController initScreenController;
  AnimationController changingScreenController;

  AnimationController hairController;
  AnimationController shirtController;
  AnimationController shortController;
  AnimationController jacketController;
  AnimationController treasureController;

  final FlareControls changingItemFlareControl = FlareControls();

  Map<ItemType, AnimationController> itemTypeListMap =
      new Map<ItemType, AnimationController>();
  ItemType currItemListType = ItemType.values[0];
  ItemType oldItemListType;

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

    hairController = AnimationHelper.getAnimationController(this);
    hairAnimation =
        Tween<double>(begin: 0 - gameProvider.deviceSize.width, end: 0)
            .animate(hairController)
              ..addListener(() {
                setState(() {});
              });

    shirtController = AnimationHelper.getAnimationController(this);
    shirtAnimation =
        Tween<double>(begin: 0 - gameProvider.deviceSize.width, end: 0)
            .animate(shirtController)
              ..addListener(() {
                setState(() {});
              });

    shortController = AnimationHelper.getAnimationController(this);
    shortAnimation =
        Tween<double>(begin: 0 - gameProvider.deviceSize.width, end: 0)
            .animate(shortController)
              ..addListener(() {
                setState(() {});
              });

    jacketController = AnimationHelper.getAnimationController(this);
    jacketAnimation =
        Tween<double>(begin: 0 - gameProvider.deviceSize.width, end: 0)
            .animate(jacketController)
              ..addListener(() {
                setState(() {});
              });

    treasureController = AnimationHelper.getAnimationController(this);
    treasureAnimation =
        Tween<double>(begin: 0 - gameProvider.deviceSize.width, end: 0)
            .animate(treasureController)
              ..addListener(() {
                setState(() {});
              });

    itemTypeListMap[ItemType.HAIR] = hairController;
    itemTypeListMap[ItemType.SHIRT] = shirtController;
    itemTypeListMap[ItemType.SHORT] = shortController;
    itemTypeListMap[ItemType.JACKET] = jacketController;
    itemTypeListMap[ItemType.TREASURE] = treasureController;

    gameProvider.selectedItemGirlList[0][ItemType.HAIR] = <SubItemType, String>{
      null: 'CreatedObject7_14'
    };
    gameProvider.selectedItemGirlList[0][ItemType.SHIRT] = <SubItemType, String>{
      null: null
    };
    gameProvider.selectedItemGirlList[0][ItemType.SHORT] = <SubItemType, String>{
      null: null
    };
    gameProvider.selectedItemGirlList[0][ItemType.JACKET] = <SubItemType, String>{
      null: null
    };
    gameProvider.selectedItemGirlList[0][ItemType.TREASURE] = <SubItemType, String>{
      SubItemType.BAG: null
    };
    gameProvider.selectedItemGirlList[0][ItemType.TREASURE] = <SubItemType, String>{
      SubItemType.EARING: null
    };
    gameProvider.selectedItemGirlList[0][ItemType.TREASURE] = <SubItemType, String>{
      SubItemType.NECKLET: null
    };
    gameProvider.selectedItemGirlList[0][ItemType.TREASURE] = <SubItemType, String>{
      SubItemType.PHONE: null
    };
    gameProvider.selectedItemGirlList[0][ItemType.TREASURE] = <SubItemType, String>{
      SubItemType.GLASS: null
    };

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
    // gameProvider.init();
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
                image: AssetImage('images/CreatedObjectsStarting11.png'),
                fit: BoxFit.fitWidth,
              ),
            ),
          ),
          // Cabin
          Positioned(
            left: 4,
            bottom: 10,
            child: Image.asset(
              "images/CreatedObject7_9.png",
              width: gameProvider.deviceSize.width * 0.4,
            ),
          ),

          // HAIR PRESENT
          GirlCabinHairItems(animation: hairAnimation, girlIndex: 0, itemType: ItemType.HAIR,),
          // SHIRT PRESENT
          GirlCabinShirtItems(animation: shirtAnimation, girlIndex: 0, itemType: ItemType.SHIRT,),
          // SHORT PRESENT
          GirlCabinShortItems(animation: shortAnimation, girlIndex: 0, itemType: ItemType.SHORT,),
          // JACKET PRESENT
          GirlCabinJacketItems(animation: jacketAnimation, girlIndex: 0, itemType: ItemType.JACKET,),
          // TREASURE PRESENT
          GirlCabinTreasureItems(animation: treasureAnimation, girlIndex: 0, itemType: ItemType.TREASURE,),
          //----------------------------------------------------------
          // sub hair
          Helper.getSubItem(gameProvider.getGirlSelectedItem(0, ItemType.HAIR)),
          // sub treasure
          Helper.getSubItem(
              gameProvider.getGirlSelectedItem(0, ItemType.TREASURE, SubItemType.BAG)),
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
          Helper.getItem(gameProvider.getGirlSelectedItem(0, ItemType.SHORT)),
          // shirt
          Helper.getItem(gameProvider.getGirlSelectedItem(0, ItemType.SHIRT)),
          // Jacket
          Helper.getItem(gameProvider.getGirlSelectedItem(0, ItemType.JACKET)),
          // Treasure 1
          Helper.getItem(
              gameProvider.getGirlSelectedItem(0, ItemType.TREASURE, SubItemType.BAG)),
          // Treasure 2
          Helper.getItem(gameProvider.getGirlSelectedItem(0, 
              ItemType.TREASURE, SubItemType.EARING)),
          // Treasure 3
          Helper.getItem(gameProvider.getGirlSelectedItem(0, 
              ItemType.TREASURE, SubItemType.NECKLET)),
          // Treasure 4
          Helper.getItem(gameProvider.getGirlSelectedItem(0, 
              ItemType.TREASURE, SubItemType.PHONE)),
          // Treasure 5
          Helper.getItem(gameProvider.getGirlSelectedItem(0, 
              ItemType.TREASURE, SubItemType.GLASS)),
          // hair
          Helper.getItem(gameProvider.getGirlSelectedItem(0, ItemType.HAIR)),

          // hand
          Positioned(
            right: 190,
            bottom: 163,
            child: Image.asset(
              "images/CreatedObject7_73.png",
              width: 30,
            ),
          ),
          Positioned(
            right: 40,
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

          Visibility(
            visible:  isValid(gameProvider),
            child: Positioned(
              left: gameProvider.deviceSize.width * 0.02,
              bottom: 10,
              child: AnimatedButton(
                image: "images/finishButton.png",
                width: gameProvider.deviceSize.width * 0.1,
                callback: () {
                  gameProvider.currentGirlIndex = 1;
                  Navigator.pushNamed(context, Routers.GIRL_OPTIONS);
                },
              ),
            ),
          ),

          ChangingScreenAnimation(changingScreenAnimation: initScreenAnimation),
          ChangingScreenAnimation(
              changingScreenAnimation: changingScreenAnimation),
        ]),
      ),
    );
  }

  isValid(GameProvider gameProvider){
    bool isValid = true;
    isValid &= gameProvider.selectedItemGirlList[0][ItemType.SHIRT][null] != null;
    isValid &= gameProvider.selectedItemGirlList[0][ItemType.SHORT][null] != null;
    return isValid;
  }
}
