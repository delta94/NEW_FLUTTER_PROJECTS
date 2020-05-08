import 'dart:async';

import 'package:assets_audio_player/assets_audio_player.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flare_flutter/flare_cache_builder.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/helpers/Helper.dart';

import 'helpers/EndlessController.dart';
import 'helpers/GameProvider.dart';
import 'widgets/ChangingScreenAnimation.dart';

class Screen2 extends StatefulWidget {
  Screen2({Key key}) : super(key: key);
  Screen2State createState() => Screen2State();
}

class Screen2State extends State<Screen2> with TickerProviderStateMixin {
  final EndlessController _changingScreenController =
      EndlessController('Untitled', 5.0);

  final EndlessController _playButtonController =
      EndlessController('Untitled', 2.25);

  final EndlessController _screenController =
      EndlessController('Untitled', 2.0);

  Animation<double> changingScreenAnimation;
  AnimationController changingScreenController;
  final backgroundAudio = AssetsAudioPlayer();
  final playButtonAudio = AssetsAudioPlayer();

  double height = 0;
  double playButtonWidth;

  Future<bool> _onWillPop() {
    Navigator.pop(context);
    return Future<bool>.value(false);
  }

  @override
  void initState() {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);
    playButtonWidth = gameProvider.deviceSize.width * 0.2;
    changingScreenController =
        AnimationController(vsync: this, duration: Duration(milliseconds: 500));
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
    changingScreenAnimation = changingScreenAnimation =
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
                          Helper.changScreenAnimation(changingScreenController,
                              changingScreenAnimation, '/screen3', context);
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
              changingScreenAnimation: changingScreenAnimation,
              changingScreenController: _changingScreenController),
        ]),
      ),
    );
  }
}
