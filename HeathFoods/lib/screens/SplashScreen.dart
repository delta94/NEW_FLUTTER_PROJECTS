import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';
import 'package:seabird.goutfood/AppProvider.dart';
import 'package:seabird.goutfood/helpers/Ads.dart';
import 'package:seabird.goutfood/helpers/ReponsiveHelper.dart';
import 'package:shimmer/shimmer.dart';

class SplashScreen extends StatefulWidget {
  @override
  _SplashScreenState createState() => _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen> {
  @override
  void initState() {
    Ads.createInterstitial();
    Ads.showInterstitialAd();
    var appProvider = Provider.of<AppProvider>(context, listen: false);
    appProvider.init();
    navigateToHomeScreen();
    super.initState();
  }

  void navigationPage() {
    Navigator.of(context).pushReplacementNamed('/home');
  }

  Future<Timer> navigateToHomeScreen() async {
    var _duration = Duration(seconds: 3);
    return Timer(_duration, navigationPage);
  }

  @override
  Widget build(BuildContext context) {
    ReponsiveHelper.deviceSize = MediaQuery.of(context).size;
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
              child: Image.asset('images/logo.png',
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
                'GOUT DIET - URIC TABLE',
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
