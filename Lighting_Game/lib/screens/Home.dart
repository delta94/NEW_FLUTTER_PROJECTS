import 'package:app_review/app_review.dart';
import 'package:com.seab1ird.showyourself/model_view/GameProvider.dart';
import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:com.seab1ird.showyourself/widgets/ImageButton.dart';
import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'dart:io';

import 'package:provider/provider.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'package:shimmer/shimmer.dart';

class Home extends StatefulWidget {
  @override
  _HomeState createState() => _HomeState();
}

class _HomeState extends State<Home> {
  GameProvider gameProvider;
  var prefs;
  @override
  void initState() {
    Utils.setHandTouchWidget();
    gameProvider = Provider.of<GameProvider>(context, listen: false);
    gameProvider.init();
    setRound();
    getThemeFromShareReference();
    super.initState();
  }

  getThemeFromShareReference() async {
    prefs = await SharedPreferences.getInstance();
    String savedThemeStr = prefs.getString('theme');
    savedThemeStr = savedThemeStr ?? '255,255,255';
    List<String> savedThemeArr = savedThemeStr.split(',');
    Color theme = Color.fromRGBO(
      int.parse(savedThemeArr[0]),
      int.parse(savedThemeArr[1]),
      int.parse(savedThemeArr[2]),
      1,
    );

    gameProvider.theme = theme;
  }

  setRound() async {
    prefs = await SharedPreferences.getInstance();
    int playableRound = prefs.getInt('playable_round');
    playableRound = playableRound ?? 0;
    gameProvider.playableRoundNum = playableRound;
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: [
          Opacity(
            opacity: 1,
            child: Container(
              decoration: new BoxDecoration(
                image: new DecorationImage(
                  image: new AssetImage('asset/images/bg_blue.png'),
                  fit: BoxFit.fill,
                ),
              ),
            ),
          ),
          Container(
            child: Center(
              child: Column(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: <Widget>[
                  SizedBox(height: 20),
                  Column(
                    children: [
                      Center(
                        child: Shimmer.fromColors(
                          baseColor: Colors.orange,
                          highlightColor: Colors.yellow,
                          child: Text(
                            'Electric Line Game',
                            textAlign: TextAlign.center,
                            style: GoogleFonts.tomorrow(
                              fontWeight: FontWeight.bold,
                              fontSize: 30,
                            ),
                          ),
                        ),
                      ),
                      SizedBox(height: 10),
                      Container(
                        decoration: BoxDecoration(
                          color: Colors.black38,
                          borderRadius: BorderRadius.circular(10),
                          border: Border.all(color: Colors.yellow, width: 5),
                        ),
                        child: Utils.getImage('logo',
                            width: MediaQuery.of(context).size.width / 3),
                      ),
                    ],
                  ),
                  Column(
                    children: [
                      ImageButton(
                        text: 'Play',
                        buttonColor: 'green',
                        onPress: () => Navigator.pushNamed(context, '/rounds'),
                      ),
                      ImageButton(
                        text: 'Rate 5 stars',
                        buttonColor: 'yellow',
                        onPress: () =>
                            AppReview.storeListing.then((onValue) {}),
                      ),
                      ImageButton(
                        text: 'Exit',
                        buttonColor: 'red',
                        onPress: () => exit(0),
                      ),
                    ],
                  ),
                  SizedBox(height: 20),
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }
}
