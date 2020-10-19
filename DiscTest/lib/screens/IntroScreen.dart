import 'package:app_review/app_review.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.disctest/helpers/Ads.dart';
import 'package:seab1ird.disctest/widgets/BackgroundWidget.dart';
import 'package:seab1ird.disctest/helpers/EndLoopController.dart';
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

    final EndLoopController _logoLoopController =
        EndLoopController('Untitled', 10);
    final EndLoopController _starLoopController =
        EndLoopController('Untitled', 1);

    return new WillPopScope(
      onWillPop: () {
        backToHomeScreen(context);
        return Future<bool>.value(false);
      },
      child: Scaffold(
        appBar: AppBar(
          leading: IconButton(
            icon: Image.asset(
              'images/home_icon.png',
              height: 30,
            ),
            onPressed: () => backToHomeScreen(context),
          ),
          title: Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                Container(
                  width: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.8 : 40,
                  height: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.8 : 40,
                  child: FlareActor(
                    "images/disc.flr",
                    alignment: Alignment.center,
                    controller: _logoLoopController,
                  ),
                ),
                SizedBox(
                  width: 10,
                ),
                ShadowText(
                  'Introduction',
                  style: TextStyle(
                    fontWeight: FontWeight.bold,
                    color: Colors.lightGreenAccent,
                    decoration: TextDecoration.underline,
                    decorationColor: Colors.red,
                    decorationStyle: TextDecorationStyle.solid,
                    fontSize: Helpers.isIpad() ? Helpers.ipadFontSize() : 20,
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
                  width: 40,
                  height: 40,
                  child: FlareActor(
                    "images/star.flr",
                    alignment: Alignment.center,
                    controller: _starLoopController,
                  )),
              onTap: () {
                AppReview.storeListing.then((onValue) {});
                // LaunchReview.launch(iOSAppId: "1508870026");
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
              padding: EdgeInsets.only(left: 10, right: 10),
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  Expanded(
                      child: ListView(
                    children: <Widget>[
                      Row(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: <Widget>[
                          Container(
                            margin: EdgeInsets.only(top: 10, bottom: 10),
                            width: Helpers.getDeviceSize(context).width / 3,
                            decoration: new BoxDecoration(
                                border: Border.all(width: 5),
                                borderRadius:
                                    new BorderRadius.all(Radius.circular(20.0)),
                                shape: BoxShape.rectangle,
                                color: Colors.white12),
                            child: new ClipRRect(
                                borderRadius: new BorderRadius.circular(10.0),
                                child: Image.asset('images/logo_head.png')),
                          ),
                        ],
                      ),
                      SizedBox(
                        height: 10,
                      ),
                      Padding(
                        padding: const EdgeInsets.all(8.0),
                        child: ShadowText(
                          'What is DiSC?',
                          style: TextStyle(
                            fontSize:
                                Helpers.isIpad() ? Helpers.ipadFontSize() : 20,
                            color: Colors.limeAccent,
                            fontWeight: FontWeight.bold,
                            backgroundColor: Colors.black54,
                          ),
                        ),
                      ),
                      Padding(
                        padding: const EdgeInsets.all(8.0),
                        child: Text(
                          'The DiSC assessment is a non-judgmental tool used for discussion of people\'s behavioral differences. If you participate in a DiSC program, you\'ll be asked to complete a series of questions that produce a detailed report about your personality and behavior. You\'ll also receive tips related to working with people of other styles.',
                          style: TextStyle(
                            color: Colors.white.withOpacity(0.9),
                            fontSize:
                                Helpers.isIpad() ? Helpers.ipadFontSize() : 15,
                            fontWeight: FontWeight.w500,
                            backgroundColor: Colors.black54,
                          ),
                        ),
                      ),
                      Padding(
                        padding: const EdgeInsets.all(8.0),
                        child: Text(
                          'This DISC personality test lets you determine your DISC type and personality profile quickly. Find out how the DISC factors, Dominance, Influence, Steadiness and Caution predict your behavior towards others and the everyday things you do.',
                          style: TextStyle(
                            color: Colors.white.withOpacity(0.9),
                            fontSize:
                                Helpers.isIpad() ? Helpers.ipadFontSize() : 15,
                            fontWeight: FontWeight.w500,
                            backgroundColor: Colors.black54,
                          ),
                        ),
                      ),
                      SizedBox(
                        height: 25,
                      ),
                      Padding(
                        padding: const EdgeInsets.all(8.0),
                        child: ShadowText(
                          'DiSC profiles help you and your team: ',
                          style: TextStyle(
                            fontSize: Helpers.isIpad()
                                ? Helpers.ipadFontSize() * 1.2
                                : 20,
                            color: Colors.limeAccent,
                            fontWeight: FontWeight.bold,
                            backgroundColor: Colors.black54,
                          ),
                        ),
                      ),
                      Padding(
                        padding: const EdgeInsets.all(8.0),
                        child: Text(
                          '1. Increase your self-knowledge: how you respond to conflict, what motivates you, what causes you stress, and how you solve problems',
                          style: TextStyle(
                            color: Colors.white.withOpacity(0.9),
                            fontSize:
                                Helpers.isIpad() ? Helpers.ipadFontSize() : 15,
                            fontWeight: FontWeight.w500,
                            backgroundColor: Colors.black54,
                          ),
                        ),
                      ),
                      Padding(
                        padding: const EdgeInsets.all(8.0),
                        child: Text(
                          '2. Improve working relationships by recognizing the communication needs of team members.',
                          style: TextStyle(
                            color: Colors.white.withOpacity(0.9),
                            fontSize:
                                Helpers.isIpad() ? Helpers.ipadFontSize() : 15,
                            fontWeight: FontWeight.w500,
                            backgroundColor: Colors.black54,
                          ),
                        ),
                      ),
                      Padding(
                        padding: const EdgeInsets.all(8.0),
                        child: Text(
                          '3. Facilitate better teamwork and teach productive conflict.',
                          style: TextStyle(
                            color: Colors.white.withOpacity(0.9),
                            fontSize:
                                Helpers.isIpad() ? Helpers.ipadFontSize() : 15,
                            fontWeight: FontWeight.w500,
                            backgroundColor: Colors.black54,
                          ),
                        ),
                      ),
                      Padding(
                        padding: const EdgeInsets.all(8.0),
                        child: Text(
                          '4. Develop stronger sales skills by identifying and responding to customer styles.',
                          style: TextStyle(
                            color: Colors.white.withOpacity(0.9),
                            fontSize:
                                Helpers.isIpad() ? Helpers.ipadFontSize() : 15,
                            fontWeight: FontWeight.w500,
                            backgroundColor: Colors.black54,
                          ),
                        ),
                      ),
                      Padding(
                        padding: const EdgeInsets.all(8.0),
                        child: Text(
                          '5. Manage more effectively by understanding the dispositions and priorities of employees and team members.',
                          style: TextStyle(
                            color: Colors.white.withOpacity(0.9),
                            fontSize:
                                Helpers.isIpad() ? Helpers.ipadFontSize() : 15,
                            fontWeight: FontWeight.w500,
                            backgroundColor: Colors.black54,
                          ),
                        ),
                      ),
                      SizedBox(height: 20),
                    ],
                  )),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
