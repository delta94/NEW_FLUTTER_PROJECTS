import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';

import 'helpers/EndlessController.dart';
import 'helpers/GameProvider.dart';
import 'widgets/ChangingScreenAnimation.dart';

class Screen4 extends StatefulWidget {
  Screen4({Key key}) : super(key: key);
  Screen4State createState() => Screen4State();
}

class Screen4State extends State<Screen4> with TickerProviderStateMixin {
  final EndlessController _changingScreenController =
      EndlessController('Untitled', 5.0);

  Animation<double> changingScreenAnimation;
  AnimationController changingScreenController;


  Future<bool> _onWillPop() {
    Navigator.pop(context);
    return Future<bool>.value(false);
  }

  @override
  void initState() {
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

    changingScreenController =
        AnimationController(vsync: this, duration: Duration(milliseconds: 500));
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
          ChangingScreenAnimation(
              changingScreenAnimation: changingScreenAnimation,
              changingScreenController: _changingScreenController),
        ]),
      ),
    );
  }
}
