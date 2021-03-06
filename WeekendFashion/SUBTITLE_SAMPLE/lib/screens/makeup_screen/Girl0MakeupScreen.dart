import 'dart:async';

import 'package:flare_flutter/flare_controls.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.weekendfashion/data/cabin/GirlCabinHairItems.dart';
import 'package:seabird.weekendfashion/data/cabin/GirlCabinJacketItems.dart';
import 'package:seabird.weekendfashion/data/cabin/GirlCabinShirtItems.dart';
import 'package:seabird.weekendfashion/data/cabin/GirlCabinShortItems.dart';
import 'package:seabird.weekendfashion/data/cabin/GirlCabinTreasureItems.dart';
import 'package:seabird.weekendfashion/enums/ItemType.dart';
import 'package:seabird.weekendfashion/enums/SubItemType.dart';
import 'package:seabird.weekendfashion/helpers/AnimationHelper.dart';
import 'package:seabird.weekendfashion/helpers/EndlessController.dart';

import 'package:seabird.weekendfashion/helpers/GameProvider.dart';
import 'package:seabird.weekendfashion/routers.dart';
import 'package:seabird.weekendfashion/widgets/AdHelpers.dart';
import 'package:seabird.weekendfashion/widgets/Background.dart';
import 'package:seabird.weekendfashion/widgets/ChangingItemWidget.dart';
import 'package:seabird.weekendfashion/widgets/ChangingScreenAnimation.dart';
import 'package:seabird.weekendfashion/widgets/FashionGirl0.dart';
import 'package:seabird.weekendfashion/widgets/FinishButton.dart';
import 'package:seabird.weekendfashion/widgets/NextPreviousButton.dart';

class Girl0MakeupScreen extends StatefulWidget {
  Girl0MakeupScreen({Key key}) : super(key: key);
  @override
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

  final FlareControls changingItemFlareController = FlareControls();

  Map<ItemType, AnimationController> itemTypeListMap =
      new Map<ItemType, AnimationController>();
  ItemType currItemListType = ItemType.values[0];
  ItemType oldItemListType;

  Future<bool> _onWillPop() {
    return Future<bool>.value(false);
  }

  final EndlessController previousButtonController =
      EndlessController('Untitled', 2);
  final EndlessController nextButtonController =
      EndlessController('Untitled', 2);

  @override
  void initState() {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);

    initScreenController = AnimationHelper.getAnimationController(this, 2000);
    initScreenAnimation =
        Tween<double>(begin: 0, end: 0 - gameProvider.deviceSize.height)
            .animate(initScreenController)
              ..addListener(() {
                setState(() {});
              });

    hairController = AnimationHelper.getAnimationController(this, 800);
    hairAnimation =
        Tween<double>(begin: 0 - gameProvider.deviceSize.width, end: 0)
            .animate(hairController)
              ..addListener(() {
                setState(() {});
              });

    shirtController = AnimationHelper.getAnimationController(this, 800);
    shirtAnimation =
        Tween<double>(begin: 0 - gameProvider.deviceSize.width, end: 0)
            .animate(shirtController)
              ..addListener(() {
                setState(() {});
              });

    shortController = AnimationHelper.getAnimationController(this, 800);
    shortAnimation =
        Tween<double>(begin: 0 - gameProvider.deviceSize.width, end: 0)
            .animate(shortController)
              ..addListener(() {
                setState(() {});
              });

    jacketController = AnimationHelper.getAnimationController(this, 800);
    jacketAnimation =
        Tween<double>(begin: 0 - gameProvider.deviceSize.width, end: 0)
            .animate(jacketController)
              ..addListener(() {
                setState(() {});
              });

    treasureController = AnimationHelper.getAnimationController(this, 800);
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

    gameProvider.selectedItemGirlList[0]
        [ItemType.HAIR] = <SubItemType, String>{null: 'CreatedObject7_14'};
    gameProvider.selectedItemGirlList[0]
        [ItemType.SHIRT] = <SubItemType, String>{null: null};
    gameProvider.selectedItemGirlList[0]
        [ItemType.SHORT] = <SubItemType, String>{null: null};
    gameProvider.selectedItemGirlList[0]
        [ItemType.JACKET] = <SubItemType, String>{null: null};
    gameProvider.selectedItemGirlList[0]
        [ItemType.TREASURE] = <SubItemType, String>{SubItemType.BAG: null};
    gameProvider.selectedItemGirlList[0]
        [ItemType.TREASURE] = <SubItemType, String>{SubItemType.EARING: null};
    gameProvider.selectedItemGirlList[0]
        [ItemType.TREASURE] = <SubItemType, String>{SubItemType.NECKLET: null};
    gameProvider.selectedItemGirlList[0]
        [ItemType.TREASURE] = <SubItemType, String>{SubItemType.PHONE: null};
    gameProvider.selectedItemGirlList[0]
        [ItemType.TREASURE] = <SubItemType, String>{SubItemType.GLASS: null};

    changingScreenController =
        AnimationHelper.getAnimationController(this, 500);

    super.initState();
  }

  @override
  void dispose() {
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    void _playChangeItemAnimation() {
      if (gameProvider.changingItemTypeIndex == 0)
        changingItemFlareController.play('Untitled');
    }

    _playChangeItemAnimation();

    initScreenController.forward();

    changingScreenAnimation =
        Tween<double>(begin: 0 - gameProvider.deviceSize.height, end: 0)
            .animate(changingScreenController)
              ..addListener(() {
                setState(() {});
              });

    gameProvider.changingItemTypeIndex--;
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
          Bacground(image: 'images/CreatedObjectsStarting11.png'),
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
          GirlCabinHairItems(
            animation: hairAnimation,
            girlIndex: 0,
            itemType: ItemType.HAIR,
          ),
          // SHIRT PRESENT
          GirlCabinShirtItems(
            animation: shirtAnimation,
            girlIndex: 0,
            itemType: ItemType.SHIRT,
          ),
          // SHORT PRESENT
          GirlCabinShortItems(
            animation: shortAnimation,
            girlIndex: 0,
            itemType: ItemType.SHORT,
          ),
          // JACKET PRESENT
          GirlCabinJacketItems(
            animation: jacketAnimation,
            girlIndex: 0,
            itemType: ItemType.JACKET,
          ),
          // TREASURE PRESENT
          GirlCabinTreasureItems(
            animation: treasureAnimation,
            girlIndex: 0,
            itemType: ItemType.TREASURE,
          ),
          //----------------------------------------------------------
          FashionGirl0(gameProvider: gameProvider),
          ChangingItemWidget(
              changingItemFlareController: changingItemFlareController),

          NextPreviousButton(
            isNext: false,
            controller: previousButtonController,
            voidCallback: () => setState(() {
              oldItemListType = currItemListType;
              currItemListType = gameProvider.changeCabinForNextAndGirlIndex(
                  false, oldItemListType);
            }),
          ),

          NextPreviousButton(
            isNext: true,
            controller: nextButtonController,
            voidCallback: () => setState(() {
              oldItemListType = currItemListType;
              currItemListType = gameProvider.changeCabinForNextAndGirlIndex(
                  true, oldItemListType);
            }),
          ),

          FinishButton(
            isValid: isValid(gameProvider),
            callback: () {
              gameProvider.currentGirlIndex = 1;
              AdHelpers.showInterAd();
              Navigator.popAndPushNamed(context, Routers.GIRL_OPTIONS);
            },
          ),

          ChangingScreenAnimation(changingScreenAnimation: initScreenAnimation),
          ChangingScreenAnimation(
              changingScreenAnimation: changingScreenAnimation),
        ]),
      ),
    );
  }

  isValid(GameProvider gameProvider) {
    bool isValid = true;
    isValid &=
        gameProvider.selectedItemGirlList[0][ItemType.SHIRT][null] != null;
    isValid &=
        gameProvider.selectedItemGirlList[0][ItemType.SHORT][null] != null;
    return isValid;
  }
}
