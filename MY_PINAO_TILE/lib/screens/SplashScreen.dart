import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.letitgo/SongProvider.dart';
import 'package:seab1ird.letitgo/helpers/AdHelpers.dart';
import 'package:seab1ird.letitgo/helpers/ResponsiveHelper.dart';
import 'package:shimmer/shimmer.dart';

class SplashScreen extends StatefulWidget {
  @override
  _SplashScreenState createState() => _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen> {
  @override
  void initState() {
    var appProvider = Provider.of<SongProvider>(context, listen: false);
    appProvider.init();
    AdHelpers.initialize();
    Future.delayed(Duration(seconds: 5), () {
      AdHelpers.showBanner(appProvider);
      AdHelpers.showInterAd();
    });

    navigateToHomeScreen();
    super.initState();
  }

  void navigationPage() {
    Navigator.of(context).pushNamed('/game');
  }

  Future<Timer> navigateToHomeScreen() async {
    var _duration = Duration(seconds: 10);
    return Timer(_duration, navigationPage);
  }

  @override
  Widget build(BuildContext context) {
    ResponsiveHelper.deviceSize = MediaQuery.of(context).size;
    return Scaffold(
      body: Container(
        alignment: Alignment.center,
        color: Colors.yellow[100],
        child: Column(mainAxisAlignment: MainAxisAlignment.center, children: [
          Container(
            decoration: BoxDecoration(
                border: Border.all(width: 1),
                borderRadius: BorderRadius.all(Radius.circular(20.0)),
                shape: BoxShape.rectangle,
                color: Colors.white12),
            child: ClipRRect(
              borderRadius: BorderRadius.circular(10.0),
              child: Image.asset('assets/images/logo.png',
                  width: MediaQuery.of(context).size.width / 4,
                  height: MediaQuery.of(context).size.width / 4),
            ),
          ),
          SizedBox(height: 20),
          Center(
            child: Shimmer.fromColors(
              baseColor: Colors.orange,
              highlightColor: Colors.yellow,
              child: Text(
                'EDM PIANO TILES',
                textAlign: TextAlign.center,
                style: GoogleFonts.tomorrow(
                  fontWeight: FontWeight.bold,
                  fontSize: 20,
                ),
              ),
            ),
          ),
        ]),
      ),
    );
  }
}
