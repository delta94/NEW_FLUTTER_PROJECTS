import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.disctest/QuestionProvider.dart';
import 'package:seab1ird.disctest/helpers/ReponsiveHelper.dart';
import 'package:seab1ird.disctest/helpers/Utils.dart';
import 'package:shimmer/shimmer.dart';

class SplashScreen extends StatefulWidget {
  @override
  _SplashScreenState createState() => _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen> {
  @override
  void initState() {
    QuestionProvider questionProvider =
        Provider.of<QuestionProvider>(context, listen: false);
    questionProvider.init();
    navigateToHomeScreen();
    super.initState();
  }

  void navigationPage() {
    Navigator.of(context).pushReplacementNamed('/home');
  }

  navigateToHomeScreen() async {
    var _duration = Duration(seconds: 3);
    return Timer(_duration, navigationPage);
  }

  @override
  Widget build(BuildContext context) {
    ReponsiveHelper.deviceSize = MediaQuery.of(context).size;
    return Scaffold(
      body: Container(
        alignment: Alignment.center,
        decoration: BoxDecoration(
          image: DecorationImage(
            image: AssetImage('images/bg_blue.png'),
            fit: BoxFit.cover,
          ),
        ),
        child: Column(mainAxisAlignment: MainAxisAlignment.center, children: [
          Utils.getImage('logo', width: MediaQuery.of(context).size.width / 4),
          SizedBox(height: 20),
          Center(
            child: Shimmer.fromColors(
              baseColor: Colors.orange,
              highlightColor: Colors.yellow,
              child: Text(
                'RIASEC TEST',
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
