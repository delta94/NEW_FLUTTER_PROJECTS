import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/helpers/Helper.dart';

import 'helpers/EndlessController.dart';
import 'helpers/GameProvider.dart';
import 'widgets/ChangingScreenAnimation.dart';

class Screen1 extends StatefulWidget {
  Screen1({Key key}) : super(key: key);
  Screen1State createState() => Screen1State();
}

class Screen1State extends State<Screen1> with TickerProviderStateMixin {
  final EndlessController _changingScreenController =
      EndlessController('Untitled', 5.0);

  Animation<double> changingScreenAnimation;
  AnimationController changingScreenController;

  double height = 0;
  double playButtonWidth;

  Future<bool> _onWillPop() {
    Navigator.pop(context);
    return Future<bool>.value(false);
  }

  @override
  void initState() {
    super.initState();
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);
    playButtonWidth = gameProvider.deviceSize.width * 0.2;
    changingScreenController =
        AnimationController(vsync: this, duration: Duration(milliseconds: 500));
  }

  @override
  void dispose() {
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);

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
                      child: GestureDetector(
                          onTap: () {
                            setState(() {
                              playButtonWidth =
                                  gameProvider.deviceSize.width * 0.25;
                            });

                            Timer(Duration(milliseconds: 100), () {
                              setState(() {
                                playButtonWidth =
                                    gameProvider.deviceSize.width * 0.2;
                              });
                            });

                            Helper.changScreenAnimation(
                                changingScreenController,
                                changingScreenAnimation,
                                '/screen2',
                                context);
                          },
                          child: Image.asset(
                            'images/play.png',
                            width: playButtonWidth,
                          )),
                    ),
                  ),
                ],
              ),
            ]),
          ),
          ChangingScreenAnimation(
              changingScreenAnimation: changingScreenAnimation,
              changingScreenController: _changingScreenController),
        ]),
      ),
    );
  }
}
