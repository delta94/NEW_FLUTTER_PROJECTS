import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seabi1rd.weekendfashion/routers.dart';
import 'package:seabi1rd.weekendfashion/widgets/AdHelpers.dart';

class SplashScreen extends StatefulWidget {
  @override
  _SplashScreenState createState() => new _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen> {
  @override
  void initState() {
    startTime();
    AdHelpers.initialize();
    Future.delayed(Duration(seconds: 5), () {
      AdHelpers.showInterAd(needAdmob: false);
    });
    super.initState();
  }

  void navigationPage() {
    Navigator.of(context).pushReplacementNamed(Routers.INIT);
  }

  startTime() async {
    var _duration = new Duration(seconds: 8);
    return new Timer(_duration, navigationPage);
  }

  @override
  Widget build(BuildContext context) {
    return new Scaffold(
      body: new Container(
        decoration: BoxDecoration(
          image: DecorationImage(
            image: AssetImage('images/bg.png'),
            fit: BoxFit.cover,
          ),
        ),
      ),
    );
  }
}
