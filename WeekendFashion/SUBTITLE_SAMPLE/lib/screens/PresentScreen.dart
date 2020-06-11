import 'dart:async';

import 'package:assets_audio_player/assets_audio_player.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flare_flutter/flare_cache_builder.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/helpers/AnimationHelper.dart';
import 'package:seab1ird.showyourself/helpers/EndlessController.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/ChangingScreenAnimation.dart';

import '../routers.dart';

class PresentScreen extends StatefulWidget {
  PresentScreen({Key key}) : super(key: key);
  PresentScreenState createState() => PresentScreenState();
}

class PresentScreenState extends State<PresentScreen> with TickerProviderStateMixin {

  final EndlessController _playButtonController =
      EndlessController('Untitled', 2.25);

  final EndlessController _screenController =
      EndlessController('Untitled', 2.0);

  Animation<double> initScreenAnimation;
  Animation<double> changingScreenAnimation;

  AnimationController initScreenController;
  AnimationController changingScreenController;
  final backgroundAudio = AssetsAudioPlayer();
  final playButtonAudio = AssetsAudioPlayer();

  double height = 0;

  Future<bool> _onWillPop() {
    Navigator.pop(context);
    return Future<bool>.value(false);
  }

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

    changingScreenController = AnimationHelper.getAnimationController(this, 500);

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
    backgroundAudio.open( Audio('sounds/music1.ogg'));
    backgroundAudio.play();
    
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
          Positioned(
            height: gameProvider.deviceSize.height,
            width: gameProvider.deviceSize.width,
            child: FlareCacheBuilder(["images/animated_screen2.flr"],
                builder: (BuildContext context, bool isWarm) {
              return !isWarm
                  ? Container(child: Text("Loading..."))
                  : FlareActor(
                      "images/animated_screen2.flr",
                      alignment: Alignment.center,
                      controller: _screenController,
                      fit: BoxFit.fill,
                    );
            }),
          ),
          Positioned(
            left: gameProvider.deviceSize.width * 0.1,
            bottom: gameProvider.deviceSize.height * 0.1,
            height: gameProvider.deviceSize.height * 0.4,
            width: gameProvider.deviceSize.height * 0.4,
            child: FlareCacheBuilder(["images/play_button.flr"],
                builder: (BuildContext context, bool isWarm) {
              return !isWarm
                  ? Container(child: Text("Loading..."))
                  : Container(
                      child: FlatButton(
                        color: Colors.transparent,
                        onPressed: () {
                          backgroundAudio.stop();
                          playButtonAudio.open( Audio('sounds/test.ogg'));
                          playButtonAudio.play();
                          AnimationHelper.changeScreenAnimation(changingScreenController, Routers.GIRL0_MAKEUP, context);
                        },
                        child: FlareActor(
                          "images/play_button.flr",
                          alignment: Alignment.center,
                          controller: _playButtonController,
                        ),
                      ),
                    );
            }),
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
