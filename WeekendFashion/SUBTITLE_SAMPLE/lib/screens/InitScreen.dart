import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/helpers/Ads.dart';
import 'package:seab1ird.showyourself/helpers/AnimationHelper.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/AnimatedButton.dart';
import 'package:seab1ird.showyourself/widgets/ChangingScreenAnimation.dart';

import '../routers.dart';

class InitScreen extends StatefulWidget {
  InitScreen({Key key}) : super(key: key);
  InitScreenState createState() => InitScreenState();
}

class InitScreenState extends State<InitScreen> with TickerProviderStateMixin {
  Animation<double> changingScreenAnimation;
  AnimationController changingScreenController;

  double height = 0;
  double playButtonWidth;

  Future<bool> _onWillPop() {
    return Future<bool>.value(false);
  }

  @override
  void initState() {
    Ads.showBannerAd();
    Ads.loadInterstitialAd();
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);
    gameProvider.init();

    playButtonWidth = gameProvider.deviceSize.width * 0.2;
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
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);

    gameProvider.currentGirlIndex = 0;

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
                image: AssetImage('images/bg.png'),
                fit: BoxFit.cover,
              ),
            ),
          ),
          Container(
            child: Stack(children: <Widget>[
              Row(
                children: <Widget>[
                  Expanded(
                    child: Container(
                      padding: EdgeInsets.only(
                          top: gameProvider.deviceSize.height * 0.3),
                      alignment: Alignment.center,
                      child: Material(
                        color: Colors.transparent,
                        child: AnimatedButton(
                            image: 'images/play.png',
                            width: playButtonWidth,
                            callback: () => {
                                  AnimationHelper.changeScreenAnimation(
                                      changingScreenController,
                                      Routers.PRESENT,
                                      context),
                                }),
                      ),
                    ),
                  ),
                ],
              ),
            ]),
          ),
          ChangingScreenAnimation(
              changingScreenAnimation: changingScreenAnimation),
        ]),
      ),
    );
  }
}
