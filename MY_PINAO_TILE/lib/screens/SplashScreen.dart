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
      // AdHelpers.showBanner(appProvider);
      // AdHelpers.showInterAd();
    });

    navigateToHomeScreen();
    super.initState();
  }

  void navigationPage() {
    Navigator.of(context).pushNamed('/game');
  }

  Future<Timer> navigateToHomeScreen() async {
    var _duration = Duration(seconds: 3);
    return Timer(_duration, navigationPage);
  }

  @override
  Widget build(BuildContext context) {
    ResponsiveHelper.deviceSize = MediaQuery.of(context).size;
    return Scaffold(
      body: Stack(
        children: [
          Container(
            decoration: new BoxDecoration(
              image: new DecorationImage(
                image: new AssetImage('assets/images/splash_background.png'),
                fit: BoxFit.fill,
              ),
            ),
          ),
          Container(
            alignment: Alignment.center,
            child:
                Column(mainAxisAlignment: MainAxisAlignment.center, children: [
              Container(
                decoration: BoxDecoration(
                    border: Border.all(width: 1, color: Colors.yellow),
                    borderRadius: BorderRadius.all(Radius.circular(20.0)),
                    shape: BoxShape.rectangle,
                    color: Colors.white12),
                child: ClipRRect(
                  borderRadius: BorderRadius.circular(10.0),
                  child: Image.asset('assets/images/splash_logo.png',
                      width: MediaQuery.of(context).size.width / 4,
                      height: MediaQuery.of(context).size.width / 4),
                ),
              ),
              SizedBox(height: 20),
              Padding(
                padding: const EdgeInsets.all(8.0),
                child: Center(
                  child: Column(
                    children: [
                      Text(
                        'Use headphone for best experience',
                        textAlign: TextAlign.center,
                        style: GoogleFonts.tomorrow(
                            fontWeight: FontWeight.bold,
                            fontSize: 20,
                            color: Colors.yellow),
                      ),
                      SizedBox(height: 50),
                      Shimmer.fromColors(
                        baseColor: Color.fromRGBO(49, 200, 1, 1),
                        highlightColor: Colors.yellow,
                        child: Text(
                          'Loading...',
                          textAlign: TextAlign.center,
                          style: GoogleFonts.tomorrow(
                            fontWeight: FontWeight.bold,
                            fontSize: 20,
                          ),
                        ),
                      ),
                    ],
                  ),
                ),
              ),
            ]),
          ),
        ],
      ),
    );
  }
}
