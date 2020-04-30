import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/helpers/Helper.dart';

import 'helpers/EndlessController.dart';
import 'helpers/GameProvider.dart';


class Screen2 extends StatefulWidget {
  Screen2({Key key}) : super(key: key);
  Screen2State createState() => Screen2State();
}

class Screen2State extends State<Screen2> with TickerProviderStateMixin{
  final EndlessController _transitionAnimatedController = EndlessController('Untitled', 5.0);

  Animation<double> animationMoveFromTopToCenter;
  AnimationController animationController;

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
    GameProvider gameProvider = Provider.of<GameProvider>(context, listen: false);
    gameProvider.deviceSize = Helper.getDeviceSize(context);

    animationController = AnimationController(vsync: this, duration: Duration(milliseconds: 500));
    animationMoveFromTopToCenter = Tween<double>(begin: 0-gameProvider.deviceSize.height, end: 0).animate(animationController)
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
      child:  Scaffold(
      body: new Stack(
        children: <Widget>[
          new Container(
            decoration: new BoxDecoration(
              image: new DecorationImage(image: new AssetImage('images/bg2.png'), fit: BoxFit.cover,),
            ),
          ),
          new Container(
            height: 1000,
            width: 600,
            child: new Stack(
              children: <Widget>[
                GestureDetector(
                  onTap: () {
                    animationController.forward();

                    animationMoveFromTopToCenter.addStatusListener((status) {
                      if (status == AnimationStatus.completed) {
                        new Timer(Duration(seconds: 1), (){
                          animationController.reverse();
                        });
                      }
                    });

                    new Timer(Duration(milliseconds: 1800), (){
                      Navigator.pushNamed(context, '/screen2');
                    });
                  },
                  child: Container(
                    margin: EdgeInsets.only(left: (MediaQuery.of(context).size.width-170)/2),
                    padding: EdgeInsets.only(top: 60),
                    width: 170,
                    alignment: Alignment.bottomCenter,
                    child: Image.asset('images/play.png')
                  ),
                ),
              ]
            )
          ),
          Align(
            alignment: Alignment.center,
            child: Transform.translate(
              offset: Offset(10, animationMoveFromTopToCenter.value),
              child: Container(
                alignment: Alignment.center,
                child: FlareActor("images/Transition.flr",
                  alignment: Alignment.center,
                  controller: _transitionAnimatedController,
                  fit: BoxFit.cover,
                ),
              ),
            ),
          ),
        ])
    ));
  }
}

