import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:in_app_review/in_app_review.dart';
import 'package:provider/provider.dart';
import 'package:seabird.riasectest/AppProvider.dart';
import 'package:seabird.riasectest/helpers/BackgroundWidget.dart';
import 'package:seabird.riasectest/helpers/Helpers.dart';
import 'package:seabird.riasectest/helpers/FlareEndlessController.dart';
import 'package:seabird.riasectest/utils/Utils.dart';
import 'package:seabird.riasectest/widgets/AdBannerTemplate.dart';
import 'package:shimmer/shimmer.dart';

class HomeScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    Helpers.deviceSize = MediaQuery.of(context).size;
    final FlareEndlessController _logoHeadLoopController =
        FlareEndlessController('Untitled', 4);

    return new WillPopScope(
      onWillPop: () {
        Helpers.onWillPop(context);
        return Future<bool>.value(false);
      },
      child: Scaffold(
        appBar: AppBar(
          leading: IconButton(
            padding: EdgeInsets.zero,
            icon: Image.asset(
              'images/exit.png',
              height: Helpers.isIpad() ? Helpers.ipadIconSize() * 2 : 40,
            ),
            onPressed: () => Helpers.onWillPop(context),
          ),
          title: Row(mainAxisAlignment: MainAxisAlignment.center, children: <
              Widget>[
            Container(
                width: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.8 : 40,
                height: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.8 : 40,
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
                  "RIASEC TEST",
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
  Widget build(BuildContext context) {
    AppProvider appProvider = Provider.of<AppProvider>(context, listen: false);
    return new Stack(children: <Widget>[
      BackgroundWidget(),
      AdBannerTemplate(
        needShowSecondBanner: !appProvider.admobLoaded,
        child: Column(
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
            SizedBox(height: Helpers.isIpad() ? 30 : 20),
            Expanded(
              child: Container(
                child: Container(
                    padding: EdgeInsets.symmetric(
                        vertical: 15, horizontal: Helpers.isIpad() ? 40 : 0),
                    child: SingleChildScrollView(
                      child: Column(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: <Widget>[
                            Helpers.getMenuBox(
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
                                            ? Helpers.ipadFontSize() * 1.2
                                            : 25,
                                        fontWeight: FontWeight.bold,
                                        color: Colors.white,
                                      ),
                                    ),
                                  ],
                                ),
                                context,
                                '/intro'),
                            SizedBox(height: Utils.isIpad() ? 20 : 0),
                            Helpers.getMenuBox(
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
                                        "images/riasec.flr",
                                        alignment: Alignment.center,
                                        controller: _logoLoopController,
                                      ),
                                    ),
                                    SizedBox(width: 10),
                                    Text(
                                      "RIASEC Types",
                                      style: TextStyle(
                                        fontSize: Helpers.isIpad()
                                            ? Helpers.ipadFontSize() * 1.2
                                            : 25,
                                        fontWeight: FontWeight.bold,
                                        color: Colors.white,
                                      ),
                                    ),
                                  ],
                                ),
                                context,
                                '/discTypes'),
                            SizedBox(height: Utils.isIpad() ? 20 : 0),
                            Helpers.getMenuBox(
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
                                              ? Helpers.ipadFontSize() * 1.2
                                              : 30,
                                          fontWeight: FontWeight.bold,
                                          color: Colors.white,
                                          decorationColor: Colors.white,
                                          decorationStyle:
                                              TextDecorationStyle.solid,
                                        ),
                                      ),
                                    ),
                                  ],
                                ),
                                context,
                                '/startTest',
                                '0'),
                            SizedBox(height: Utils.isIpad() ? 20 : 0),
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
                                          // AppReview.storeListing
                                          //     .then((onValue) {});
                                          InAppReview.instance.openStoreListing(
                                              appStoreId: "1535987884");
                                        },
                                      ),
                                      SizedBox(width: 10),
                                      Text(
                                        "Rate 5 stars",
                                        style: TextStyle(
                                            fontSize: Helpers.isIpad()
                                                ? Helpers.ipadFontSize() * 1.2
                                                : 25,
                                            fontWeight: FontWeight.bold,
                                            color: Colors.white),
                                      ),
                                    ],
                                  ),
                                  onTap: () {
                                    // AppReview.storeListing.then((onValue) {});
                                    InAppReview.instance.openStoreListing(
                                        appStoreId: "1535987884");
                                  },
                                )),
                            SizedBox(height: Utils.isIpad() ? 20 : 0),
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
                                                ? Helpers.ipadFontSize() * 1.2
                                                : 25,
                                            fontWeight: FontWeight.bold,
                                            color: Colors.white),
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
        ),
      )
    ]);
  }
}
