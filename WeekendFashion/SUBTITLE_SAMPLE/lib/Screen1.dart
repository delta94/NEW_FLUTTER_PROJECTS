import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/helpers/Helper.dart';

import 'helpers/EndlessController.dart';
import 'helpers/GameProvider.dart';

class Screen1 extends StatefulWidget {
  Screen1({Key key}) : super(key: key);
  Screen1State createState() => Screen1State();
}

class Screen1State extends State<Screen1> with TickerProviderStateMixin {
  final EndlessController _transitionAnimatedController =
      EndlessController('Untitled', 5.0);

  Animation<double> animationMoveFromTopToCenter;
  AnimationController animationController;
  double height = 0;

  Future<bool> _onWillPop() {
    Navigator.pop(context);
    return Future<bool>.value(false);
  }

  @override
  void initState() {
    super.initState();
    animationController =
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
    gameProvider.deviceSize = Helper.getDeviceSize(context);
    animationMoveFromTopToCenter =
        Tween<double>(begin: 0 - gameProvider.deviceSize.height, end: 0)
            .animate(animationController)
              ..addListener(() {
                setState(() {});
              });

    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));

    SystemChrome.setPreferredOrientations([
      DeviceOrientation.landscapeRight,
      DeviceOrientation.landscapeLeft,
    ]);

    return new WillPopScope(
        onWillPop: _onWillPop,
        child: Scaffold(
            body: new Stack(children: <Widget>[
          new Container(
            decoration: new BoxDecoration(
              image: new DecorationImage(
                image: new AssetImage('images/bg.png'),
                fit: BoxFit.cover,
              ),
            ),
          ),
          Column(
            mainAxisAlignment: MainAxisAlignment.start,
            children: <Widget>[
              Expanded(
                child: new Container(
                  child: new Stack(children: <Widget>[
                    GestureDetector(
                      onTap: () {
                        print('sssđsq');
                        animationController.forward();

                        animationMoveFromTopToCenter
                            .addStatusListener((status) {
                          if (status == AnimationStatus.completed) {
                            new Timer(Duration(seconds: 1), () {
                              animationController.reverse();
                            });
                          }
                        });

                        new Timer(Duration(milliseconds: 2300), () {
                          Navigator.pushNamed(context, '/screen2');
                        });
                      },
                      child: Container(
                        padding: EdgeInsets.only(top: gameProvider.deviceSize.height * 0.3),
                        margin: EdgeInsets.only(
                            left: (gameProvider.deviceSize.width -
                                    gameProvider.deviceSize.width * 0.3) /
                                2),
                        width: gameProvider.deviceSize.width * 0.3,
                        alignment: Alignment.center,
                        child: Image.asset('images/play.png'),
                      ),
                    ),
                  ]),
                ),
              ),
            ],
          ),
          Align(
            alignment: Alignment.center,
            child: Transform.translate(
              offset: Offset(10, animationMoveFromTopToCenter.value),
              child: Container(
                alignment: Alignment.center,
                child: FlareActor(
                  "images/Transition.flr",
                  alignment: Alignment.center,
                  controller: _transitionAnimatedController,
                  fit: BoxFit.cover,
                ),
              ),
            ),
          ),
        ])));
  }
}
