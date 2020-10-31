import 'dart:async';

import 'package:com.seab1ird.showyourself/model_view/GameProvider.dart';
import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';
import 'package:shimmer/shimmer.dart';

class SplashScreen extends StatefulWidget {
  @override
  _SplashScreenState createState() => new _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen> {
  GameProvider gameProvider;
  @override
  void initState() {
    Utils.openBackgroundSound();
    gameProvider =
        Provider.of<GameProvider>(context, listen: false);
    gameProvider.init();
    startTime();
    super.initState();
  }

  void navigationPage() {
    Navigator.of(context).pushReplacementNamed('/home');
  }

  startTime() async {
    var _duration = new Duration(seconds: 2);
    return new Timer(_duration, navigationPage);
  }

  @override
  Widget build(BuildContext context) {
    Utils.deviceSize = MediaQuery.of(context).size;
    return new Scaffold(
      body: new Container(
        alignment: Alignment.center,
        decoration: BoxDecoration(
          image: DecorationImage(
            image: AssetImage('asset/images/bg_blue.png'),
            fit: BoxFit.cover,
          ),
        ),
        child: Column(mainAxisAlignment: MainAxisAlignment.center, children: [
          Utils.getImage(
            'logo',
            width: MediaQuery.of(context).size.width / 4,
          ),
          Center(
            child: Shimmer.fromColors(
              baseColor: Colors.orange,
              highlightColor: Colors.yellow,
              child: Text(
                'Electric Line Game',
                textAlign: TextAlign.center,
                style: GoogleFonts.tomorrow(
                  fontWeight: FontWeight.bold,
                  fontSize: 10,
                ),
              ),
            ),
          ),
        ]),
      ),
    );
  }
}
