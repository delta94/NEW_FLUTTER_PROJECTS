import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';
import 'package:seabird.disctest/AppProvider.dart';
import 'package:seabird.disctest/helpers/AdHelpers.dart';
import 'package:seabird.disctest/helpers/Helpers.dart';
import 'package:shimmer/shimmer.dart';

class SplashScreen extends StatefulWidget {
  @override
  _SplashScreenState createState() => new _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen> {
  @override
  void initState() {
    var appProvider = Provider.of<AppProvider>(context, listen: false);
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
    Navigator.of(context).pushReplacementNamed('/home');
  }

  navigateToHomeScreen() async {
    var _duration = new Duration(seconds: 10);
    return new Timer(_duration, navigationPage);
  }

  @override
  Widget build(BuildContext context) {
    Helpers.deviceSize = MediaQuery.of(context).size;
    return new Scaffold(
      body: new Container(
        alignment: Alignment.center,
        decoration: BoxDecoration(
          image: DecorationImage(
            image: AssetImage('images/bg_blue.png'),
            fit: BoxFit.cover,
          ),
        ),
        child: Column(mainAxisAlignment: MainAxisAlignment.center, children: [
          Image.asset(
            'images/logo.png',
            width: MediaQuery.of(context).size.width / 4,
          ),
          SizedBox(height: 20),
          Center(
            child: Shimmer.fromColors(
              baseColor: Colors.orange,
              highlightColor: Colors.yellow,
              child: Text(
                'DISC TEST',
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
