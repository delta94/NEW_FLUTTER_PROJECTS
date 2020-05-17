import 'dart:async';

import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/helpers/AnimationHelper.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/routers.dart';
import 'package:seab1ird.showyourself/widgets/ChangingScreenAnimation.dart';


class GirlOptionsScreen extends StatefulWidget {
  GirlOptionsScreen({Key key}) : super(key: key);
  GirlOptionsScreenState createState() => GirlOptionsScreenState();
}

class GirlOptionsScreenState extends State<GirlOptionsScreen> with TickerProviderStateMixin {

  Animation<double> initScreenAnimation;
  Animation<double> changingScreenAnimation;

  AnimationController initScreenController;
  AnimationController changingScreenController;

  double girlHeight;
  double activeGirlHeight;

  Future<bool> _onWillPop() {
    Navigator.pop(context);
    return Future<bool>.value(false);
  }

  @override
  void initState() {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);
    gameProvider.girlsMap[0] = true;
    gameProvider.girlsMap[1] = false;
    girlHeight = gameProvider.deviceSize.height * 0.84;
    activeGirlHeight = girlHeight;

    initScreenController = AnimationHelper.getInitScreenController(this);
    initScreenAnimation =
        Tween<double>(begin: 0, end: 0 - gameProvider.deviceSize.height)
            .animate(initScreenController)
              ..addListener(() {
                setState(() {});
              });

    changingScreenController = AnimationHelper.getInitScreenController(this);
    
    super.initState();
  }

  @override
  void dispose() {
    super.dispose();
  }

  onPress() {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);
    initScreenController.forward();

    setState(() {
      this.activeGirlHeight = gameProvider.deviceSize.height * 0.9;
    });

    Timer(Duration(milliseconds: 100), () {
      setState(() {
        this.activeGirlHeight = girlHeight;
      });
    });

    AnimationHelper.changeScreenAnimation(
        changingScreenController, Routers.MAKEUP, context);
  }

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);

    initScreenController.forward();
    changingScreenAnimation =
        Tween<double>(begin: 0 - gameProvider.deviceSize.height, end: 0)
            .animate(changingScreenController)
              ..addListener(() {
                setState(() {});
              });

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
                image: AssetImage('images/CreatedObjectsStarting10.png'),
                fit: BoxFit.cover,
              ),
            ),
          ),
          // girl 1
          Positioned(
            left: gameProvider.deviceSize.width * 0.12,
            top: gameProvider.deviceSize.height * 0.07,
            height: gameProvider.girlsMap[0] ? activeGirlHeight : girlHeight,
            child: Image.asset(
              gameProvider.girlsMap[0]
                  ? "images/LevelChoice_1.png"
                  : "images/lockMc_1.png",
            ),
          ),
          // girl 2
          Positioned(
            right: gameProvider.deviceSize.width * 0.12,
            top: gameProvider.deviceSize.height * 0.07,
            height: gameProvider.girlsMap[1] ? activeGirlHeight : girlHeight,
            child: Image.asset(
              gameProvider.girlsMap[1]
                  ? "images/LevelChoice_2.png"
                  : "images/lockMc_2.png",
            ),
          ),
          // scene 1
          Scene(
            image: "images/CreatedObject7_7.png",
            left: 0,
            right: null,
          ),
          // scene 2
          Scene(
            image: "images/CreatedObject7_8.png",
            left: null,
            right: 0,
          ),
          // changing item animation
          Positioned(
            left: gameProvider.girlsMap[0] ? 0 : null,
            right: gameProvider.girlsMap[1] ? 0 : null,
            top: gameProvider.deviceSize.height * 0.1,
            height: gameProvider.deviceSize.height * 0.9,
            width: gameProvider.deviceSize.width * 0.5,
            child: FlareActor("images/changing_item.flr",
                fit: BoxFit.contain, animation: "Untitled"),
          ),
          Positioned(
            left: gameProvider.girlsMap[0] ? 0 : null,
            right: gameProvider.girlsMap[1] ? 0 : null,
            height: gameProvider.deviceSize.height,
            width: gameProvider.deviceSize.width * 0.5,
            child: GestureDetector(onTap: ()=>this.onPress(),),
          ),
          ChangingScreenAnimation(
              changingScreenAnimation: initScreenAnimation),
          ChangingScreenAnimation(
              changingScreenAnimation: changingScreenAnimation),
        ]),
      ),
    );
  }
}

class Scene extends StatelessWidget {
  final String image;
  final double left;
  final double right;
  Scene({this.image, this.left, this.right});

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);
    return Positioned(
      left: left,
      right: right,
      height: gameProvider.deviceSize.height,
      child: Image.asset(image, height: gameProvider.deviceSize.height),
    );
  }
}
