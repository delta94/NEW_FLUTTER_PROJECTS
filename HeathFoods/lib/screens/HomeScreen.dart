import 'package:app_review/app_review.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.disctest/helpers/Ads.dart';
import 'package:seab1ird.disctest/helpers/ReponsiveHelper.dart';
import 'package:seab1ird.disctest/widgets/BackgroundWidget.dart';
import 'package:seab1ird.disctest/helpers/Helpers.dart';
import 'package:seab1ird.disctest/helpers/FlareEndlessController.dart';
import 'package:seab1ird.disctest/widgets/FabCircularMenu.dart';
import 'package:shimmer/shimmer.dart';

class HomeScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    ReponsiveHelper.deviceSize = MediaQuery.of(context).size;
    final FlareEndlessController _logoHeadLoopController =
        FlareEndlessController('Untitled', 4);

    return WillPopScope(
      onWillPop: () {
        Helpers.onWillPop(context);
        return Future<bool>.value(false);
      },
      child: Scaffold(
        appBar: AppBar(
          leading: IconButton(
            icon: Image.asset(
              'images/exit.png',
              height: getXLargeLogoSize(),
            ),
            onPressed: () => Helpers.onWillPop(context),
          ),
          title: Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                Container(
                    width: getLargeLogoSize(),
                    height: getLargeLogoSize(),
                    child: ClipRRect(
                      borderRadius: BorderRadius.circular(5),
                      child: FlareActor(
                        'images/logo_head.flr',
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
                      'RIASEC TEST',
                      style: TextStyle(
                        fontWeight: FontWeight.bold,
                        color: Colors.yellowAccent,
                        decoration: TextDecoration.underline,
                        decorationColor: Colors.greenAccent,
                        decorationStyle: TextDecorationStyle.solid,
                        fontSize: getMediumTextSize(),
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
          iconTheme: IconThemeData(color: Colors.yellowAccent),
          backgroundColor: Colors.black87,
          actions: <Widget>[Container(width: 30)],
        ),
        body: BodyWidget(),
        floatingActionButton: FabCircularMenuCommon(),
      ),
    );
  }
}

class BodyWidget extends StatefulWidget {
  @override
  _BodyWidgetState createState() => _BodyWidgetState();
}

class _BodyWidgetState extends State<BodyWidget> {
  double marginTop = 0;

  final FlareEndlessController _logoLoopController =
      FlareEndlessController('Untitled', 10);

  final FlareEndlessController _resultLoopController =
      FlareEndlessController('Untitled', 4);

  final FlareEndlessController _starLoopController =
      FlareEndlessController('Untitled', 1);

  @override
  void initState() {
    if (Ads.isReleaseMode()) {
      Ads.showBannerAd();
      marginTop = 60;
    }
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Stack(children: <Widget>[
      BackgroundWidget(),
      Container(
          margin: EdgeInsets.only(top: marginTop),
          padding: EdgeInsets.only(left: 10, right: 10, top: 10),
          alignment: Alignment.center,
          child: Column(
            children: <Widget>[
              Container(
                decoration: BoxDecoration(
                    border: Border.all(width: 5),
                    borderRadius: BorderRadius.all(Radius.circular(20.0)),
                    shape: BoxShape.rectangle,
                    color: Colors.white12),
                child: ClipRRect(
                  borderRadius: BorderRadius.circular(10.0),
                  child: Image.asset('images/banner.png',
                      height: getDeviceSize(context).height / 6),
                ),
              ),
              SizedBox(height: 20),
              Expanded(
                child: Container(
                  child: Container(
                      padding: EdgeInsets.symmetric(vertical: 15),
                      child: SingleChildScrollView(
                        child: Column(
                            mainAxisAlignment: MainAxisAlignment.center,
                            children: <Widget>[
                              Helpers.getMenuBox(
                                  Row(
                                    mainAxisAlignment: MainAxisAlignment.center,
                                    children: <Widget>[
                                      Image.asset('images/info.png',
                                          height: getMediumLogoize(),
                                          width: getMediumLogoize()),
                                      SizedBox(width: 10),
                                      Text(
                                        'Introduction',
                                        style: TextStyle(
                                          fontSize: getLargeTextSize(),
                                          fontWeight: FontWeight.bold,
                                          color: Colors.white,
                                        ),
                                      ),
                                    ],
                                  ),
                                  context,
                                  '/intro'),
                              SizedBox(height: getMenuSpaceSize()),
                              Helpers.getMenuBox(
                                  Row(
                                    mainAxisAlignment: MainAxisAlignment.center,
                                    children: <Widget>[
                                      Container(
                                        width: getXLargeLogoSize(),
                                        height: getXLargeLogoSize(),
                                        child: FlareActor(
                                          'images/riasec.flr',
                                          alignment: Alignment.center,
                                          controller: _logoLoopController,
                                        ),
                                      ),
                                      SizedBox(width: 10),
                                      Text(
                                        'RIASEC Types',
                                        style: TextStyle(
                                          fontSize: getLargeTextSize(),
                                          fontWeight: FontWeight.bold,
                                          color: Colors.white,
                                        ),
                                      ),
                                    ],
                                  ),
                                  context,
                                  '/discTypes'),
                              SizedBox(height: getMenuSpaceSize()),
                              Helpers.getMenuBox(
                                  Row(
                                    mainAxisAlignment: MainAxisAlignment.center,
                                    children: <Widget>[
                                      Container(
                                        width: isIpad()
                                            ? ipadIconSize() * 1.5
                                            : 60,
                                        height: isIpad()
                                            ? ipadIconSize() * 1.5
                                            : 50,
                                        child: FlareActor(
                                          'images/result.flr',
                                          alignment: Alignment.center,
                                          controller: _resultLoopController,
                                        ),
                                      ),
                                      SizedBox(width: 10),
                                      Container(
                                        child: Shimmer.fromColors(
                                          baseColor: Colors.orange,
                                          highlightColor: Colors.yellow,
                                          child: Text(
                                            'Begin Test',
                                            textAlign: TextAlign.center,
                                            style: TextStyle(
                                              fontSize: getXXlargeTextSize(),
                                              fontWeight: FontWeight.bold,
                                              color: Colors.lightGreenAccent,
                                              decorationColor:
                                                  Colors.limeAccent,
                                              decorationStyle:
                                                  TextDecorationStyle.solid,
                                            ),
                                          ),
                                        ),
                                      ),
                                    ],
                                  ),
                                  context,
                                  '/startTest',
                                  '0'),
                              SizedBox(height: getMenuSpaceSize()),
                              Container(
                                  padding: EdgeInsets.only(
                                    left: 10,
                                    top: 10,
                                    bottom: 10,
                                  ),
                                  margin: EdgeInsets.only(bottom: 5),
                                  alignment: Alignment.center,
                                  decoration: Helpers.boxDecoration(),
                                  child: GestureDetector(
                                    child: Row(
                                      mainAxisAlignment:
                                          MainAxisAlignment.center,
                                      children: <Widget>[
                                        GestureDetector(
                                          child: Container(
                                              width: getXXlargeTextSize(),
                                              height: getXXlargeTextSize(),
                                              child: FlareActor(
                                                'images/star.flr',
                                                alignment: Alignment.center,
                                                controller: _starLoopController,
                                              )),
                                          onTap: () {
                                            AppReview.storeListing
                                                .then((onValue) {});
                                            // LaunchReview.launch(iOSAppId: '1508870026');
                                          },
                                        ),
                                        SizedBox(width: 10),
                                        Text(
                                          'Rate 5 stars',
                                          style: TextStyle(
                                              fontSize: getLargeTextSize(),
                                              fontWeight: FontWeight.bold,
                                              color: Colors.limeAccent),
                                        ),
                                      ],
                                    ),
                                    onTap: () {
                                      AppReview.storeListing.then((onValue) {});
                                    },
                                  )),
                              SizedBox(height: getMenuSpaceSize()),
                              Container(
                                  padding: EdgeInsets.only(
                                      left: 10, top: 10, bottom: 10),
                                  margin: EdgeInsets.only(bottom: 5),
                                  alignment: Alignment.center,
                                  decoration: Helpers.boxDecoration(),
                                  child: GestureDetector(
                                    child: Row(
                                      mainAxisAlignment:
                                          MainAxisAlignment.center,
                                      children: <Widget>[
                                        Image.asset('images/exit.png',
                                            height: getXlargeTextSize(),
                                            width: getXlargeTextSize()),
                                        SizedBox(width: 10),
                                        Text(
                                          'Exit',
                                          style: TextStyle(
                                              fontSize: getLargeTextSize(),
                                              fontWeight: FontWeight.bold,
                                              color: Colors.red),
                                        ),
                                      ],
                                    ),
                                    onTap: () {
                                      return Helpers.onWillPop(context);
                                    },
                                  )),
                            ]),
                      )),
                ),
              )
            ],
          ))
    ]);
  }
}
