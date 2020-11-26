import 'dart:async';

import 'package:assets_audio_player/assets_audio_player.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabi1rd.weekendfashion/helpers/AnimationHelper.dart';
import 'package:seabi1rd.weekendfashion/helpers/GameProvider.dart';
import 'package:seabi1rd.weekendfashion/routers.dart';
import 'package:seabi1rd.weekendfashion/widgets/AnimatedButton.dart';
import 'package:seabi1rd.weekendfashion/widgets/ChangingScreenAnimation.dart';

class GirlOptionsScreen extends StatefulWidget {
  GirlOptionsScreen({Key key}) : super(key: key);
  GirlOptionsScreenState createState() => GirlOptionsScreenState();
}

class GirlOptionsScreenState extends State<GirlOptionsScreen>
    with TickerProviderStateMixin {
  Animation<double> initScreenAnimation;
  Animation<double> changingScreenAnimation;

  AnimationController initScreenController;
  AnimationController changingScreenController;

  double girlHeight;
  double activeGirlHeight;

  Future<bool> _onWillPop() {
    return Future<bool>.value(false);
  }

  @override
  void initState() {
    // Ads.showInterstitialAd();
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);

    girlHeight = gameProvider.deviceSize.height * 0.84;
    activeGirlHeight = girlHeight;

    initScreenController = AnimationHelper.getAnimationController(this, 500);
    initScreenAnimation =
        Tween<double>(begin: 0, end: 0 - gameProvider.deviceSize.height)
            .animate(initScreenController)
              ..addListener(() {
                setState(() {});
              });

    changingScreenController =
        AnimationHelper.getAnimationController(this, 500);
    final girlSoundAudio = AssetsAudioPlayer();
    new Timer(Duration(milliseconds: 500), () {
      girlSoundAudio.open(Audio('sounds/giggle.ogg'));
    });

    super.initState();
  }

  @override
  void dispose() {
    super.dispose();
  }

  onPress(GameProvider gameProvider) {
    initScreenController.forward();

    AnimationHelper.changeScreenAnimation(
        changingScreenController,
        gameProvider.currentGirlIndex == 0
            ? Routers.GIRL0_MAKEUP
            : Routers.GIRL1_MAKEUP,
        context);
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
            top: gameProvider.deviceSize.height * 0.14,
            height: gameProvider.currentGirlIndex == 0
                ? activeGirlHeight
                : girlHeight,
            child: AnimatedButton(
              image: gameProvider.currentGirlIndex == 0
                  ? "images/LevelChoice_1.png"
                  : "images/lockMc_1.png",
              callback: () {},
            ),
          ),
          // girl 2
          Positioned(
            right: gameProvider.deviceSize.width * 0.12,
            top: gameProvider.deviceSize.height * 0.14,
            height: gameProvider.currentGirlIndex == 1
                ? activeGirlHeight
                : girlHeight,
            child: AnimatedButton(
              image: gameProvider.currentGirlIndex == 1
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
            left: gameProvider.currentGirlIndex == 0 ? 0 : null,
            right: gameProvider.currentGirlIndex == 1 ? 0 : null,
            top: gameProvider.deviceSize.height * 0.1,
            height: gameProvider.deviceSize.height * 0.9,
            width: gameProvider.deviceSize.width * 0.5,
            child: FlareActor("images/changing_item.flr",
                fit: BoxFit.contain, animation: "Untitled"),
          ),
          Positioned(
            left: gameProvider.currentGirlIndex == 0 ? 0 : null,
            right: gameProvider.currentGirlIndex == 1 ? 0 : null,
            height: gameProvider.deviceSize.height,
            width: gameProvider.deviceSize.width * 0.5,
            child: GestureDetector(
              onTap: () => this.onPress(gameProvider),
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
