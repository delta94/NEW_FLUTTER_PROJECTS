import 'dart:async';

import 'package:flare_flutter/flare_actor.dart';
import 'package:flare_flutter/flare_controls.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/data/HairData.dart';
import 'package:seab1ird.showyourself/data/ShirtData.dart';
import 'package:seab1ird.showyourself/data/ShortData.dart';
import 'package:seab1ird.showyourself/helpers/AnimationHelper.dart';
import 'package:seab1ird.showyourself/helpers/Helper.dart';

import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/ChangingScreenAnimation.dart';

import 'CabinHairItems.dart';

class MakeupScreen extends StatefulWidget {
  MakeupScreen({Key key}) : super(key: key);
  MakeupScreenState createState() => MakeupScreenState();
}

class MakeupScreenState extends State<MakeupScreen> with TickerProviderStateMixin {
  Animation<double> initScreenAnimation;
  Animation<double> changingScreenAnimation;
  Animation<double> hairAnimation;

  AnimationController initScreenController;
  AnimationController changingScreenController;
  AnimationController hairController;
  final FlareControls flareControl = FlareControls();
  bool show = true;

  Future<bool> _onWillPop() {
    Navigator.pop(context);
    return Future<bool>.value(false);
  }

  @override
  void initState() {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);
    gameProvider.init();
    gameProvider.selectedItems[ItemType.HAIR] = 'CreatedObject7_14.png';
    gameProvider.selectedItems[ItemType.SHIRT] = null;
    gameProvider.selectedItems[ItemType.SHORT] = null;

    initScreenController = AnimationHelper.getInitScreenController(this);
    initScreenAnimation =
        Tween<double>(begin: 0, end: 0 - gameProvider.deviceSize.height)
            .animate(initScreenController)
              ..addListener(() {
                setState(() {});
              });

    hairController = AnimationHelper.getInitScreenController(this);
    hairAnimation =
        Tween<double>(begin: 0 - gameProvider.deviceSize.width, end: 0)
            .animate(hairController)
              ..addListener(() {
                setState(() {});
              });

    gameProvider.init();
    super.initState();
  }

  void _playChangeItemAnimation(){
    flareControl.play('Untitled');
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

    changingScreenController = AnimationHelper.getInitScreenController(this);
    changingScreenAnimation =
        Tween<double>(begin: 0 - gameProvider.deviceSize.height, end: 0)
            .animate(changingScreenController)
              ..addListener(() {
                setState(() {});
              });

    if(show){
      hairController.forward();
    } else {
      hairController.reverse();
    }
    
    
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));

    return WillPopScope(
      onWillPop: _onWillPop,
      child: Scaffold(
        floatingActionButton: FloatingActionButton(onPressed: ()=>setState((){
          show = false;
        })),
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
              height: gameProvider.deviceSize.height - 10,
            ),
          ),
          // HAIR PRESENT
          CabinHairItems(hairAnimation: hairAnimation),

          //----------------------------------------------------------
          // sub hair
          Helper.getSubItem(
              HairData.hairItemMap[gameProvider.selectedItems[ItemType.HAIR]]),
          // body
          Positioned(
            right: 120,
            bottom: 0,
            child: Image.asset("images/CreatedObject7_71.png", width: 140),
          ),
          // head
          Positioned(
            right: 170,
            bottom: 255,
            child: Image.asset(
              "images/CreatedObject7_72.png",
              width: 50,
            ),
          ),
          // shirt
          ShirtData.shirtItemMap[gameProvider.selectedItems[ItemType.SHIRT]][0],
          // hair
          Helper.getItem(
              HairData.hairItemMap[gameProvider.selectedItems[ItemType.HAIR]]),
          // short
          ShortData.shortItemMap[gameProvider.selectedItems[ItemType.SHORT]][0],
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
            child: FlareActor("images/changing_item.flr",
                fit: BoxFit.contain, animation: "Untitled",
                controller: flareControl,),
          ),

          ChangingScreenAnimation(changingScreenAnimation: initScreenAnimation),
          ChangingScreenAnimation(changingScreenAnimation: changingScreenAnimation),
        ]),
      ),
    );
  }
}
