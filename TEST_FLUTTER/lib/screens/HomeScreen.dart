import 'package:app_review/app_review.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.disctest/QuestionProvider.dart';
import 'package:seab1ird.disctest/helpers/Ads.dart';
import 'package:seab1ird.disctest/helpers/Helpers.dart';
import 'package:seab1ird.disctest/helpers/EndLoopController.dart';
import 'package:seab1ird.disctest/helpers/ShadowText.dart';
import 'package:seab1ird.disctest/models/UserChoice.dart';

class HomeScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final EndLoopController _starLoopController =
        EndLoopController('Untitled', 1);
    final EndLoopController _logoHeadLoopController =
        EndLoopController('Untitled', 4);
    QuestionProvider questionProvider =
        Provider.of<QuestionProvider>(context, listen: false);
    questionProvider.userChoices = new List<UserChoice>();

    return new WillPopScope(
        onWillPop: () {
          Helpers.onWillPop(context);
          return Future<bool>.value(false);
        },
        child: Scaffold(
            appBar: AppBar(
              leading: IconButton(
                icon: Image.asset(
                  'images/exit.png',
                  height: 40,
                ),
                onPressed: () => Helpers.onWillPop(context),
              ),
              title: Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: <Widget>[
                    Container(
                        width: 40,
                        height: 40,
                        child: ClipRRect(
                          borderRadius: BorderRadius.circular(5),
                          child: FlareActor(
                            "images/logo_head.flr",
                            alignment: Alignment.center,
                            controller: _logoHeadLoopController,
                          ),
                        )),
                    SizedBox(width: 10),
                    FittedBox(
                        fit: BoxFit.fitWidth,
                        child: Text(
                          "DISC TEST",
                          style: TextStyle(
                            fontWeight: FontWeight.bold,
                            color: Colors.yellowAccent,
                            decoration: TextDecoration.underline,
                            decorationColor: Colors.greenAccent,
                            decorationStyle: TextDecorationStyle.solid,
                            shadows: [
                              Shadow(
                                color: Colors.black,
                                blurRadius: 10.0,
                                offset: Offset(5.0, 5.0),
                              ),
                            ],
                          ),
                        )),
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
                  },
                )
              ],
            ),
            body: BodyWidget()));
  }
}

class BodyWidget extends StatelessWidget {
  final EndLoopController _logoLoopController =
      EndLoopController('Untitled', 10);
  final EndLoopController _resultLoopController =
      EndLoopController('Untitled', 4);

  @override
  Widget build(BuildContext context) {
    double marginTop = 0;
    if (Ads.isReleaseMode()) {
      // is Release Mode ??
      Ads.showBannerAd();
      marginTop = 60;
    }

    return new Stack(children: <Widget>[
      new Container(
        decoration: new BoxDecoration(
          image: new DecorationImage(
            image: new AssetImage('images/bg.png'),
            fit: BoxFit.cover,
          ),
        ),
      ),
      new Container(
          margin: EdgeInsets.only(top: marginTop),
          padding: EdgeInsets.only(left: 10, right: 10),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: <Widget>[
              Container(
                decoration: new BoxDecoration(
                    border: Border.all(width: 5),
                    borderRadius: new BorderRadius.all(Radius.circular(20.0)),
                    shape: BoxShape.rectangle,
                    color: Colors.white12),
                child: new ClipRRect(
                  borderRadius: new BorderRadius.circular(10.0),
                  child: Image.asset('images/banner.png',
                      height: Helpers.getDeviceSize(context).height / 6),
                ),
              ),
              SizedBox(height: 20),
              Container(
                child: Expanded(
                    child: Container(
                        padding: EdgeInsets.only(top: 10),
                        child: ListView(children: <Widget>[
                          Helpers.getMenuBox(
                              Row(
                                mainAxisAlignment: MainAxisAlignment.center,
                                children: <Widget>[
                                  Image.asset('images/info.png',
                                      height: 30, width: 30),
                                  SizedBox(width: 10),
                                  Text(
                                    "Introduction",
                                    style: TextStyle(
                                      fontSize: 25,
                                      fontWeight: FontWeight.bold,
                                      color: Color.fromRGBO(0, 255, 255, 1),
                                    ),
                                  ),
                                ],
                              ),
                              context,
                              '/intro'),
                          Helpers.getMenuBox(
                              Row(
                                mainAxisAlignment: MainAxisAlignment.center,
                                children: <Widget>[
                                  Container(
                                    width: 40,
                                    height: 40,
                                    child: FlareActor(
                                      "images/disc.flr",
                                      alignment: Alignment.center,
                                      controller: _logoLoopController,
                                    ),
                                  ),
                                  SizedBox(width: 10),
                                  Text(
                                    "DISC Types",
                                    style: TextStyle(
                                      fontSize: 25,
                                      fontWeight: FontWeight.bold,
                                      color: Colors.lightGreenAccent,
                                    ),
                                  ),
                                ],
                              ),
                              context,
                              '/discTypes'),
                          Helpers.getMenuBox(
                              Row(
                                mainAxisAlignment: MainAxisAlignment.center,
                                children: <Widget>[
                                  Container(
                                    width: 70,
                                    height: 60,
                                    child: FlareActor(
                                      "images/result.flr",
                                      alignment: Alignment.center,
                                      controller: _resultLoopController,
                                    ),
                                  ),
                                  SizedBox(width: 10),
                                  Container(
                                    child: ShadowText(
                                      "Begin Test",
                                      style: TextStyle(
                                        fontSize: 40,
                                        fontWeight: FontWeight.bold,
                                        color: Colors.deepOrangeAccent,
                                        decoration: TextDecoration.underline,
                                        decorationColor: Colors.limeAccent,
                                        decorationStyle:
                                            TextDecorationStyle.solid,
                                      ),
                                    ),
                                  )
                                ],
                              ),
                              context,
                              '/startTest',
                              '0'),
                          Container(
                              padding: EdgeInsets.only(
                                  left: 10, top: 10, bottom: 10),
                              margin: EdgeInsets.only(bottom: 5),
                              alignment: Alignment.center,
                              decoration: Helpers.boxDecoration(),
                              child: GestureDetector(
                                child: Row(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: <Widget>[
                                    Image.asset('images/star.png',
                                        height: 30, width: 30),
                                    SizedBox(width: 10),
                                    Text(
                                      "Rate 5 stars",
                                      style: TextStyle(
                                          fontSize: 25,
                                          fontWeight: FontWeight.bold,
                                          color: Colors.limeAccent),
                                    ),
                                  ],
                                ),
                                onTap: () {
                                  AppReview.storeListing.then((onValue) {});
                                },
                              )),
                          Container(
                              padding: EdgeInsets.only(
                                  left: 10, top: 10, bottom: 10),
                              margin: EdgeInsets.only(bottom: 5),
                              alignment: Alignment.center,
                              decoration: Helpers.boxDecoration(),
                              child: GestureDetector(
                                child: Row(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: <Widget>[
                                    Image.asset('images/exit.png',
                                        height: 30, width: 30),
                                    SizedBox(width: 10),
                                    Text(
                                      "Exit",
                                      style: TextStyle(
                                          fontSize: 25,
                                          fontWeight: FontWeight.bold,
                                          color: Colors.red),
                                    ),
                                  ],
                                ),
                                onTap: () {
                                  return Helpers.onWillPop(context);
                                },
                              )),
                        ]))),
              )
            ],
          ))
    ]);
  }
}
