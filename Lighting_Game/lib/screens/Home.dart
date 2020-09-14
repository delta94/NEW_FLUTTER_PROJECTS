import 'package:app_review/app_review.dart';
import 'package:com.seab1ird.showyourself/helpers/FlareEndlessController.dart';
import 'package:com.seab1ird.showyourself/model_view/GameProvider.dart';
import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:com.seab1ird.showyourself/widgets/ImageButton.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'dart:io';

import 'package:provider/provider.dart';
import 'package:shimmer/shimmer.dart';

class Home extends StatefulWidget {
  @override
  _HomeState createState() => _HomeState();
}

class _HomeState extends State<Home> {
  var prefs;

  @override
  void initState() {
    Utils.setHandTouchWidget();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    final FlareEndlessController _screenController =
        FlareEndlessController('Untitled', 2);
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    return Scaffold(
      body: Stack(
        children: [
          Opacity(
            opacity: 1,
            child: Container(
              decoration: new BoxDecoration(
                image: new DecorationImage(
                  image: Utils.getBackground(gameProvider.themeColorName),
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
                              fontSize:
                                  Utils.isIpad() ? Utils.ipadFontSize() : 30,
                            ),
                          ),
                        ),
                      ),
                      SizedBox(height: 20),
                      Container(
                        height: Utils.isIpad() ? Utils.ipadIconSize() * 4 : 150,
                        width: Utils.isIpad() ? Utils.ipadIconSize() * 4 : 150,
                        decoration: BoxDecoration(
                          color: Colors.black38,
                          borderRadius: BorderRadius.circular(10),
                          border: Border.all(color: Colors.yellow, width: 5),
                        ),
                        child: FlareActor(
                          "asset/images/logo.flr",
                          alignment: Alignment.center,
                          controller: _screenController,
                        ),
                      ),
                    ],
                  ),
                  Column(
                    children: [
                      ImageButton(
                        text: 'Play',
                        iconName: 'rabbit_smile_1_on',
                        buttonColor: 'green',
                        onPress: () => Navigator.pushNamed(context, '/rounds'),
                      ),
                      ImageButton(
                        text: 'Rate',
                        iconName: 'star',
                        buttonColor: 'yellow',
                        onPress: () =>
                            AppReview.storeListing.then((onValue) {}),
                      ),
                      ImageButton(
                        text: 'Exit',
                        iconName: 'exit',
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
