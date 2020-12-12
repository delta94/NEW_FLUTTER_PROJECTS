import 'dart:async';
import 'dart:io';

import 'package:assets_audio_player/assets_audio_player.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flare_flutter/flare_controls.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:in_app_review/in_app_review.dart';
import 'package:provider/provider.dart';
import 'package:seabird.weekendfashion/enums/ItemType.dart';
import 'package:seabird.weekendfashion/helpers/AnimationHelper.dart';
import 'package:seabird.weekendfashion/helpers/EndlessController.dart';
import 'package:seabird.weekendfashion/helpers/GameProvider.dart';
import 'package:seabird.weekendfashion/widgets/AdHelpers.dart';
import 'package:seabird.weekendfashion/widgets/AnimatedButton.dart';
import 'package:seabird.weekendfashion/widgets/ChangingItemWidget.dart';
import 'package:seabird.weekendfashion/widgets/ChangingScreenAnimation.dart';
import 'package:seabird.weekendfashion/widgets/FashionGirl0.dart';
import 'package:seabird.weekendfashion/widgets/FashionGirl1.dart';
import 'package:seabird.weekendfashion/widgets/RateButton.dart';

import '../routers.dart';

class PresentScreen extends StatefulWidget {
  PresentScreen({Key key}) : super(key: key);
  PresentScreenState createState() => PresentScreenState();
}

class PresentScreenState extends State<PresentScreen>
    with TickerProviderStateMixin {
  final EndlessController _playButtonController =
      EndlessController('Untitled', 2.25);
  final EndlessController _replayButtonController =
      EndlessController('Untitled', 2);
  final EndlessController _twinkleController = EndlessController('Untitled', 2);

  final EndlessController _screenController =
      EndlessController('Untitled', 2.0);

  final FlareControls changingItemFlareController = FlareControls();

  Animation<double> initScreenAnimation;
  Animation<double> changingScreenAnimation;

  AnimationController initScreenController;
  AnimationController changingScreenController;

  double height = 0;

  Future<bool> _onWillPop() {
    return Future<bool>.value(false);
  }

  @override
  void initState() {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);

    if (gameProvider.currentGirlIndex == 1 && gameProvider.isFirstUse) {
      gameProvider.isFirstUse = false;
      gameProvider.setFirstUseToFalse();
      InAppReview.instance.requestReview();
    }

    initScreenController = AnimationHelper.getAnimationController(this, 2000);
    initScreenAnimation =
        Tween<double>(begin: 0, end: 0 - gameProvider.deviceSize.height)
            .animate(initScreenController)
              ..addListener(() {
                setState(() {});
              });

    changingScreenController =
        AnimationHelper.getAnimationController(this, 500);

    final girlSoundAudio = AssetsAudioPlayer();
    if (gameProvider.selectedItemGirlList[0][ItemType.SHIRT] != null) {
      gameProvider.currentGirlIndex = 0;
      new Timer(Duration(seconds: 1), () {
        changingItemFlareController.play('Untitled');
        girlSoundAudio.open(Audio('sounds/giggle.ogg'));
      });
    }
    super.initState();
  }

  @override
  void dispose() {
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: true);
    bool isPresent =
        gameProvider.selectedItemGirlList[0][ItemType.SHIRT] != null;

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
                image: AssetImage('images/bg2.png'),
                fit: BoxFit.cover,
              ),
            ),
          ),
          Visibility(
            visible: !isPresent,
            child: Positioned(
                height: gameProvider.deviceSize.height,
                width: gameProvider.deviceSize.width,
                child: FlareActor(
                  "images/animated_screen2.flr",
                  alignment: Alignment.center,
                  controller: _screenController,
                  fit: BoxFit.fill,
                )),
          ),
          Visibility(
            visible: !isPresent,
            child: Positioned(
              left: gameProvider.deviceSize.width * 0.1,
              bottom: gameProvider.deviceSize.height * 0.1,
              height: gameProvider.deviceSize.height * 0.4,
              width: gameProvider.deviceSize.height * 0.4,
              child: Container(
                child: FlatButton(
                  color: Colors.transparent,
                  onPressed: () {
                    AdHelpers.showInterAd();
                    AnimationHelper.changeScreenAnimation(
                        changingScreenController,
                        Routers.GIRL_OPTIONS,
                        context);
                  },
                  child: FlareActor(
                    "images/play_button.flr",
                    alignment: Alignment.center,
                    controller: _playButtonController,
                  ),
                ),
              ),
            ),
          ),
          Visibility(
            visible: isPresent,
            child: Positioned(
              left: gameProvider.deviceSize.width * 0.2,
              bottom: gameProvider.deviceSize.height * 0.2,
              height: gameProvider.deviceSize.height * 0.4,
              width: gameProvider.deviceSize.height * 0.4,
              child: Container(
                child: FlareActor(
                  "images/twinkle.flr",
                  alignment: Alignment.center,
                  controller: _twinkleController,
                ),
              ),
            ),
          ),
          Visibility(
            visible: isPresent,
            child: Positioned(
              left: gameProvider.deviceSize.width * 0.01,
              bottom: gameProvider.deviceSize.height * 0.01,
              height: gameProvider.deviceSize.height * 0.5,
              width: gameProvider.deviceSize.height * 0.5,
              child: Container(
                child: FlatButton(
                  color: Colors.transparent,
                  onPressed: () {
                    gameProvider.currentGirlIndex = 0;
                    AnimationHelper.changeScreenAnimation(
                        changingScreenController,
                        Routers.GIRL_OPTIONS,
                        context);
                  },
                  child: FlareActor(
                    "images/replay.flr",
                    alignment: Alignment.center,
                    controller: _replayButtonController,
                  ),
                ),
              ),
            ),
          ),
          isPresent
              ? Stack(
                  children: <Widget>[
                    //----------------GIRL 1------------------------
                    FashionGirl0(gameProvider: gameProvider),

                    //----------------GIRL 2------------------------
                    Positioned(
                      right: 220,
                      width: 300,
                      bottom: -15,
                      height: gameProvider.deviceSize.height + 20,
                      child: FashionGirl1(gameProvider: gameProvider),
                    )
                  ],
                )
              : Container(),
          Visibility(
            visible: isPresent,
            child: ChangingItemWidget(
                changingItemFlareController: changingItemFlareController),
          ),
          Visibility(
            visible: isPresent,
            child: Positioned(
              right: gameProvider.deviceSize.width * 0.14,
              top: gameProvider.deviceSize.height * 0.07,
              height: gameProvider.deviceSize.height * 0.2,
              width: gameProvider.deviceSize.height * 0.2,
              child: Material(
                color: Colors.transparent,
                child: RateButton(),
              ),
            ),
          ),
          Visibility(
            visible: isPresent,
            child: Positioned(
              right: gameProvider.deviceSize.width * 0.02,
              top: gameProvider.deviceSize.height * 0.07,
              height: gameProvider.deviceSize.height * 0.2,
              width: gameProvider.deviceSize.height * 0.2,
              child: Material(
                color: Colors.transparent,
                child: AnimatedButton(
                  image: 'images/ExitButton.png',
                  width: gameProvider.deviceSize.height * 0.2,
                  callback: () => showDialog(
                    context: context,
                    builder: (context) => new AlertDialog(
                      backgroundColor: Colors.pink[50],
                      title: new Text('Quit Game ?',
                          style: TextStyle(
                            color: Colors.red,
                            fontSize: 18,
                            decoration: TextDecoration.underline,
                            decorationColor: Colors.red,
                            decorationStyle: TextDecorationStyle.solid,
                          )),
                      content: Container(
                          child: new Text('Are you sure ?',
                              style: TextStyle(
                                  color: Colors.blue,
                                  fontWeight: FontWeight.bold))),
                      actions: <Widget>[
                        new FlatButton(
                          onPressed: () => Navigator.of(context).pop(false),
                          child: new Text(
                            'No',
                            style: TextStyle(
                              color: Colors.blue,
                              fontWeight: FontWeight.bold,
                              decoration: TextDecoration.underline,
                              decorationColor: Colors.blue,
                              decorationStyle: TextDecorationStyle.solid,
                              shadows: [
                                Shadow(
                                  color: Colors.greenAccent,
                                  blurRadius: 10.0,
                                  offset: Offset(5.0, 5.0),
                                ),
                              ],
                            ),
                          ),
                        ),
                        new FlatButton(
                          onPressed: () => exit(0),
                          child: new Text(
                            'Yes',
                            style: TextStyle(
                              color: Colors.red,
                              fontWeight: FontWeight.bold,
                              decoration: TextDecoration.underline,
                              decorationColor: Colors.red,
                              decorationStyle: TextDecorationStyle.solid,
                              shadows: [
                                Shadow(
                                  color: Colors.greenAccent,
                                  blurRadius: 10.0,
                                  offset: Offset(5.0, 5.0),
                                ),
                              ],
                            ),
                          ),
                        ),
                      ],
                    ),
                  ),
                ),
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
}
