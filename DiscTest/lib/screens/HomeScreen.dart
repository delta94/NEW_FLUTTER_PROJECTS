import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:in_app_review/in_app_review.dart';
import 'package:provider/provider.dart';
import 'package:seabird.disctest/AppProvider.dart';
import 'package:seabird.disctest/helpers/UiUtils.dart';
import 'package:seabird.disctest/widgets/AdBannerTemplate.dart';
import 'package:seabird.disctest/widgets/BackgroundWidget.dart';
import 'package:seabird.disctest/helpers/Helpers.dart';
import 'package:seabird.disctest/helpers/EndLoopController.dart';
import 'package:seabird.disctest/models/UserChoice.dart';
import 'package:shimmer/shimmer.dart';

class HomeScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    Helpers.deviceSize = MediaQuery.of(context).size;
    final EndLoopController _logoHeadLoopController =
        EndLoopController('Untitled', 4);
    AppProvider appProvider = Provider.of<AppProvider>(context, listen: false);
    appProvider.userChoices = new List<UserChoice>();

    return new WillPopScope(
      onWillPop: () {
        UiUtils.onWillPop(context);
        return Future<bool>.value(false);
      },
      child: Scaffold(
        appBar: AppBar(
          leading: IconButton(
            icon: Image.asset(
              'images/exit.png',
              height: Helpers.isIpad() ? Helpers.ipadIconSize() : 40,
            ),
            onPressed: () => UiUtils.onWillPop(context),
          ),
          title: Row(mainAxisAlignment: MainAxisAlignment.center, children: <
              Widget>[
            Container(
                width: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.8 : 30,
                height: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.8 : 30,
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
              child: Shimmer.fromColors(
                baseColor: Colors.orange,
                highlightColor: Colors.yellowAccent,
                child: Text(
                  "DISC TEST",
                  style: TextStyle(
                    fontWeight: FontWeight.bold,
                    color: Colors.yellowAccent,
                    decoration: TextDecoration.underline,
                    decorationColor: Colors.greenAccent,
                    decorationStyle: TextDecorationStyle.solid,
                    fontSize: Helpers.isIpad() ? Helpers.ipadFontSize() : 20,
                    shadows: [
                      Shadow(
                        color: Colors.black,
                        blurRadius: 10.0,
                        offset: Offset(5.0, 5.0),
                      ),
                    ],
                  ),
                ),
              ),
            ),
          ]),
          iconTheme: new IconThemeData(color: Colors.yellowAccent),
          backgroundColor: Colors.black87,
          actions: <Widget>[Container(width: 30)],
        ),
        body: BodyWidget(),
      ),
    );
  }
}

// ignore: must_be_immutable
class BodyWidget extends StatelessWidget {
  double marginTop = 0;
  AppProvider appProvider;

  final EndLoopController _logoLoopController =
      EndLoopController('Untitled', 10);

  final EndLoopController _resultLoopController =
      EndLoopController('Untitled', 4);

  final EndLoopController _starLoopController =
      EndLoopController('Untitled', 1);

  @override
  Widget build(BuildContext context) {
    appProvider = Provider.of<AppProvider>(context, listen: false);
    return Stack(children: <Widget>[
      BackgroundWidget(),
      AdBannerTemplate(
        needShowSecondBanner: !appProvider.admobLoaded,
        child: Column(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: <Widget>[
            Container(
              decoration: new BoxDecoration(
                  border: Border.all(width: 1),
                  borderRadius: new BorderRadius.all(Radius.circular(20.0)),
                  shape: BoxShape.rectangle,
                  color: Colors.white12),
              child: new ClipRRect(
                borderRadius: new BorderRadius.circular(10.0),
                child: Image.asset('images/banner.png',
                    height: Helpers.getDeviceSize(context).height / 6),
              ),
            ),
            Expanded(
              child: Container(
                padding: EdgeInsets.symmetric(vertical: 15),
                child: SingleChildScrollView(
                  child: Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: <Widget>[
                        UiUtils.getMenuBox(
                            Row(
                              mainAxisAlignment: MainAxisAlignment.center,
                              children: <Widget>[
                                Image.asset('images/info.png',
                                    height: Helpers.isIpad()
                                        ? Helpers.ipadIconSize()
                                        : 30,
                                    width: Helpers.isIpad()
                                        ? Helpers.ipadIconSize()
                                        : 30),
                                SizedBox(width: 10),
                                Text(
                                  "Introduction",
                                  style: TextStyle(
                                    fontSize: Helpers.isIpad()
                                        ? Helpers.ipadIconSize()
                                        : 25,
                                    fontWeight: FontWeight.bold,
                                    color: Colors.white,
                                  ),
                                ),
                              ],
                            ),
                            context,
                            '/intro'),
                        SizedBox(height: Helpers.isIpad() ? 20 : 5),
                        UiUtils.getMenuBox(
                            Row(
                              mainAxisAlignment: MainAxisAlignment.center,
                              children: <Widget>[
                                Container(
                                  width: Helpers.isIpad()
                                      ? Helpers.ipadIconSize()
                                      : 40,
                                  height: Helpers.isIpad()
                                      ? Helpers.ipadIconSize()
                                      : 40,
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
                                    fontSize: Helpers.isIpad()
                                        ? Helpers.ipadIconSize()
                                        : 25,
                                    fontWeight: FontWeight.bold,
                                    color: Colors.white,
                                  ),
                                ),
                              ],
                            ),
                            context,
                            '/discTypes'),
                        SizedBox(height: Helpers.isIpad() ? 20 : 5),
                        UiUtils.getMenuBox(
                            Row(
                              mainAxisAlignment: MainAxisAlignment.center,
                              children: <Widget>[
                                Container(
                                  width: Helpers.isIpad()
                                      ? Helpers.ipadIconSize() * 1.5
                                      : 60,
                                  height: Helpers.isIpad()
                                      ? Helpers.ipadIconSize() * 1.5
                                      : 50,
                                  child: FlareActor(
                                    "images/result.flr",
                                    alignment: Alignment.center,
                                    controller: _resultLoopController,
                                  ),
                                ),
                                SizedBox(width: 10),
                                Container(
                                  child: Text(
                                    'Begin Test',
                                    textAlign: TextAlign.center,
                                    style: TextStyle(
                                      fontSize: Helpers.isIpad()
                                          ? Helpers.ipadIconSize()
                                          : 30,
                                      fontWeight: FontWeight.bold,
                                      color: Colors.white,
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
                        SizedBox(height: Helpers.isIpad() ? 20 : 5),
                        Container(
                            padding:
                                EdgeInsets.only(left: 10, top: 10, bottom: 10),
                            margin: EdgeInsets.only(bottom: 5),
                            alignment: Alignment.center,
                            decoration: UiUtils.boxDecoration(),
                            child: GestureDetector(
                              child: Row(
                                mainAxisAlignment: MainAxisAlignment.center,
                                children: <Widget>[
                                  GestureDetector(
                                    child: Container(
                                        width: Helpers.isIpad()
                                            ? Helpers.ipadIconSize()
                                            : 40,
                                        height: Helpers.isIpad()
                                            ? Helpers.ipadIconSize()
                                            : 40,
                                        child: FlareActor(
                                          "images/star.flr",
                                          alignment: Alignment.center,
                                          controller: _starLoopController,
                                        )),
                                    onTap: () {
                                      InAppReview.instance.openStoreListing();
                                      // LaunchReview.launch(iOSAppId: "1508870026");
                                    },
                                  ),
                                  SizedBox(width: 10),
                                  Text(
                                    "Rate 5 stars",
                                    style: TextStyle(
                                        fontSize: Helpers.isIpad()
                                            ? Helpers.ipadIconSize()
                                            : 25,
                                        fontWeight: FontWeight.bold,
                                        color: Colors.white),
                                  ),
                                ],
                              ),
                              onTap: () {
                                InAppReview.instance.openStoreListing();
                              },
                            )),
                        SizedBox(height: Helpers.isIpad() ? 20 : 5),
                        Container(
                            padding:
                                EdgeInsets.only(left: 10, top: 10, bottom: 10),
                            margin: EdgeInsets.only(bottom: 5),
                            alignment: Alignment.center,
                            decoration: UiUtils.boxDecoration(),
                            child: GestureDetector(
                              child: Row(
                                mainAxisAlignment: MainAxisAlignment.center,
                                children: <Widget>[
                                  Image.asset('images/exit.png',
                                      height: Helpers.isIpad()
                                          ? Helpers.ipadIconSize()
                                          : 30,
                                      width: Helpers.isIpad()
                                          ? Helpers.ipadIconSize()
                                          : 30),
                                  SizedBox(width: 10),
                                  Text(
                                    "Exit",
                                    style: TextStyle(
                                        fontSize: Helpers.isIpad()
                                            ? Helpers.ipadIconSize()
                                            : 25,
                                        fontWeight: FontWeight.bold,
                                        color: Colors.white),
                                  ),
                                ],
                              ),
                              onTap: () {
                                return UiUtils.onWillPop(context);
                              },
                            )),
                      ]),
                ),
              ),
            )
          ],
        ),
      )
    ]);
  }
}
