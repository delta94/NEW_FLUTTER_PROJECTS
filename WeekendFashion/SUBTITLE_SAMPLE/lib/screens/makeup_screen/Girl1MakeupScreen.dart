import 'dart:async';

import 'package:flare_flutter/flare_controls.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabi1rd.weekendfashion/data/cabin/GirlCabinDressItems.dart';
import 'package:seabi1rd.weekendfashion/data/cabin/GirlCabinHairItems.dart';
import 'package:seabi1rd.weekendfashion/data/cabin/GirlCabinJacketItems.dart';
import 'package:seabi1rd.weekendfashion/data/cabin/GirlCabinShirtItems.dart';
import 'package:seabi1rd.weekendfashion/data/cabin/GirlCabinShortItems.dart';
import 'package:seabi1rd.weekendfashion/data/cabin/GirlCabinTreasureItems.dart';
import 'package:seabi1rd.weekendfashion/enums/ItemType.dart';
import 'package:seabi1rd.weekendfashion/enums/SubItemType.dart';
import 'package:seabi1rd.weekendfashion/helpers/AnimationHelper.dart';
import 'package:seabi1rd.weekendfashion/helpers/EndlessController.dart';

import 'package:seabi1rd.weekendfashion/helpers/GameProvider.dart';
import 'package:seabi1rd.weekendfashion/routers.dart';
import 'package:seabi1rd.weekendfashion/widgets/Background.dart';
import 'package:seabi1rd.weekendfashion/widgets/ChangingItemWidget.dart';
import 'package:seabi1rd.weekendfashion/widgets/ChangingScreenAnimation.dart';
import 'package:seabi1rd.weekendfashion/widgets/FashionGirl1.dart';
import 'package:seabi1rd.weekendfashion/widgets/FinishButton.dart';
import 'package:seabi1rd.weekendfashion/widgets/NextPreviousButton.dart';

import 'GirlScreen.dart';

class Girl1MakeupScreen extends UnityScreen {
  Girl1MakeupScreen({Key key}) : super(key: key);
  @override
  Girl1MakeupScreenState createState() => Girl1MakeupScreenState();
}

class Girl1MakeupScreenState extends UnityScreenState<Girl1MakeupScreen> {
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
    // Ads.loadInterstitialAd();
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
    hairAnimation = Tween<double>(
            begin: gameProvider.deviceSize.width,
            end: gameProvider.deviceSize.width -
                gameProvider.deviceSize.width * 0.4)
        .animate(hairController)
          ..addListener(() {
            setState(() {});
          });

    shirtController = AnimationHelper.getAnimationController(this, 800);
    shirtAnimation = Tween<double>(
            begin: gameProvider.deviceSize.width,
            end: gameProvider.deviceSize.width -
                gameProvider.deviceSize.width * 0.4)
        .animate(shirtController)
          ..addListener(() {
            setState(() {});
          });

    shortController = AnimationHelper.getAnimationController(this, 800);
    shortAnimation = Tween<double>(
            begin: gameProvider.deviceSize.width,
            end: gameProvider.deviceSize.width -
                gameProvider.deviceSize.width * 0.4)
        .animate(shortController)
          ..addListener(() {
            setState(() {});
          });

    dressController = AnimationHelper.getAnimationController(this, 800);
    dressAnimation = Tween<double>(
            begin: gameProvider.deviceSize.width,
            end: gameProvider.deviceSize.width -
                gameProvider.deviceSize.width * 0.4)
        .animate(dressController)
          ..addListener(() {
            setState(() {});
          });

    jacketController = AnimationHelper.getAnimationController(this, 800);
    jacketAnimation = Tween<double>(
            begin: gameProvider.deviceSize.width,
            end: gameProvider.deviceSize.width -
                gameProvider.deviceSize.width * 0.4)
        .animate(jacketController)
          ..addListener(() {
            setState(() {});
          });

    treasureController = AnimationHelper.getAnimationController(this, 800);
    treasureAnimation = Tween<double>(
            begin: gameProvider.deviceSize.width,
            end: gameProvider.deviceSize.width -
                gameProvider.deviceSize.width * 0.4)
        .animate(treasureController)
          ..addListener(() {
            setState(() {});
          });

    itemTypeListMap[ItemType.HAIR] = hairController;
    itemTypeListMap[ItemType.SHIRT] = shirtController;
    itemTypeListMap[ItemType.SHORT] = shortController;
    itemTypeListMap[ItemType.DRESS] = dressController;
    itemTypeListMap[ItemType.JACKET] = jacketController;
    itemTypeListMap[ItemType.TREASURE] = treasureController;

    gameProvider.selectedItemGirlList[1]
        [ItemType.HAIR] = <SubItemType, String>{null: 'CreatedObject7_148'};
    gameProvider.selectedItemGirlList[1]
        [ItemType.SHIRT] = <SubItemType, String>{null: null};
    gameProvider.selectedItemGirlList[1]
        [ItemType.SHORT] = <SubItemType, String>{null: null};
    gameProvider.selectedItemGirlList[1]
        [ItemType.DRESS] = <SubItemType, String>{null: null};
    gameProvider.selectedItemGirlList[1]
        [ItemType.JACKET] = <SubItemType, String>{null: null};
    gameProvider.selectedItemGirlList[1]
        [ItemType.TREASURE] = <SubItemType, String>{SubItemType.BAG: null};
    gameProvider.selectedItemGirlList[1]
        [ItemType.TREASURE] = <SubItemType, String>{SubItemType.NECKLACE: null};
    gameProvider.selectedItemGirlList[1]
        [ItemType.TREASURE] = <SubItemType, String>{SubItemType.NECKLET: null};

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
          Bacground(image: 'images/CreatedObject7_142.png'),
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
          GirlCabinHairItems(
            animation: hairAnimation,
            girlIndex: 1,
            itemType: ItemType.HAIR,
          ),
          // SHIRT PRESENT
          GirlCabinShirtItems(
            animation: shirtAnimation,
            girlIndex: 1,
            itemType: ItemType.SHIRT,
          ),
          // SHORT PRESENT
          GirlCabinShortItems(
            animation: shortAnimation,
            girlIndex: 1,
            itemType: ItemType.SHORT,
          ),
          // DRESS PRESENT
          GirlCabinDressItems(
            animation: dressAnimation,
            girlIndex: 1,
            itemType: ItemType.DRESS,
          ),
          // JACKET PRESENT
          GirlCabinJacketItems(
            animation: jacketAnimation,
            girlIndex: 1,
            itemType: ItemType.JACKET,
          ),
          // TREASURE PRESENT
          GirlCabinTreasureItems(
              animation: treasureAnimation,
              girlIndex: 1,
              itemType: ItemType.TREASURE),
          //----------------------------------------------------------

          FashionGirl1(gameProvider: gameProvider),

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
              showAd();
              Navigator.popAndPushNamed(context, Routers.PRESENT);
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
        gameProvider.selectedItemGirlList[1][ItemType.SHIRT][null] != null;
    isValid &=
        gameProvider.selectedItemGirlList[1][ItemType.SHORT][null] != null;
    isValid |=
        gameProvider.selectedItemGirlList[1][ItemType.DRESS][null] != null;
    return isValid;
  }
}
