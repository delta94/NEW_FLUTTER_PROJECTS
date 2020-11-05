import 'package:app_review/app_review.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.disctest/helpers/Ads.dart';
import 'package:seab1ird.disctest/helpers/ReponsiveHelper.dart';
import 'package:seab1ird.disctest/widgets/BackgroundWidget.dart';
import 'package:seab1ird.disctest/helpers/FlareEndlessController.dart';
import 'package:seab1ird.disctest/helpers/Helpers.dart';
import 'package:seab1ird.disctest/widgets/ShadowText.dart';

class IntroScreen extends StatefulWidget {
  @override
  _IntroScreenState createState() => _IntroScreenState();
}

class _IntroScreenState extends State<IntroScreen> {
  Widget build(BuildContext context) {
    double marginTop = 0;
    if (Ads.isReleaseMode()) {
      // Ads.showInterstitialAd();
      marginTop = 60;
    }

    final FlareEndlessController _logoLoopController =
        FlareEndlessController('Untitled', 10);
    final FlareEndlessController _starLoopController =
        FlareEndlessController('Untitled', 1);

    return new WillPopScope(
      onWillPop: () {
        Helpers.backToHomeScreen(context);
        return Future<bool>.value(false);
      },
      child: SafeArea(
        child: Scaffold(
          appBar: AppBar(
            leading: IconButton(
              icon: Image.asset(
                'images/home_icon.png',
                height: getMediumLogoize(),
              ),
              onPressed: () => Helpers.backToHomeScreen(context),
            ),
            title: Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  Container(
                    width: getXXlargeTextSize(),
                    height: getXXlargeTextSize(),
                    child: FlareActor(
                      'images/riasec.flr',
                      alignment: Alignment.center,
                      controller: _logoLoopController,
                    ),
                  ),
                  SizedBox(
                    width: 10,
                  ),
                  ShadowText(
                    'RIASEC Types',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.lightGreenAccent,
                      decoration: TextDecoration.underline,
                      decorationColor: Colors.red,
                      decorationStyle: TextDecorationStyle.solid,
                      fontSize: getMediumTextSize(),
                      shadows: [
                        Shadow(
                          color: Colors.red,
                          blurRadius: 10.0,
                          offset: Offset(2.0, 2.0),
                        ),
                      ],
                    ),
                  ),
                  SizedBox(
                    width: 50,
                  ),
                ]),
            iconTheme: new IconThemeData(color: Colors.yellowAccent),
            backgroundColor: Colors.black87,
            actions: <Widget>[
              GestureDetector(
                child: Container(
                    width: getXLargeLogoSize(),
                    height: getXLargeLogoSize(),
                    child: FlareActor(
                      'images/star.flr',
                      alignment: Alignment.center,
                      controller: _starLoopController,
                    )),
                onTap: () {
                  AppReview.storeListing.then((onValue) {});
                  // LaunchReview.launch(iOSAppId: '1508870026');
                },
              )
            ],
          ),
          body: Stack(
            children: <Widget>[
              BackgroundWidget(),
              Container(
                color: Colors.transparent,
                margin: EdgeInsets.only(top: marginTop),
                padding: EdgeInsets.only(left: 10, right: 10, bottom: 10),
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: <Widget>[
                    SizedBox(
                      height: 10,
                    ),
                    SizedBox(
                      height: 10,
                    ),
                    SizedBox(
                      height: 10,
                    ),
                    SizedBox(
                      height: 10,
                    ),
                  ],
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
