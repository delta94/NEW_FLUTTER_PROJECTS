import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:in_app_review/in_app_review.dart';
import 'package:seabird.goutfood/helpers/ReponsiveHelper.dart';
import 'package:seabird.goutfood/helpers/Helpers.dart';
import 'package:seabird.goutfood/helpers/FlareEndlessController.dart';
import 'package:seabird.goutfood/widgets/AdBannerTemplate.dart';
import 'package:seabird.goutfood/widgets/RateButton.dart';
import 'package:shimmer/shimmer.dart';

class HomeScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    ReponsiveHelper.deviceSize = MediaQuery.of(context).size;

    return WillPopScope(
      onWillPop: () {
        Helpers.onWillPop(context);
        return Future<bool>.value(false);
      },
      child: Scaffold(
        appBar: AppBar(
          title: Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                Container(
                    width: getSmallLogoSize(),
                    height: getSmallLogoSize(),
                    child: ClipRRect(
                      borderRadius: BorderRadius.circular(5),
                      child: Image.asset('images/logo.png',
                          height: getSmallLogoSize(),
                          width: getSmallLogoSize()),
                    )),
                SizedBox(width: 10),
                FittedBox(
                  fit: BoxFit.fitWidth,
                  child: Shimmer.fromColors(
                    baseColor: Colors.black,
                    highlightColor: Colors.white,
                    child: Text(
                      'GOUT DIET & URIC TABLE',
                      style: TextStyle(
                        fontWeight: FontWeight.bold,
                        fontSize: getXSSmallTextSize(),
                      ),
                    ),
                  ),
                ),
              ]),
          iconTheme: IconThemeData(color: Colors.yellowAccent),
          backgroundColor: Colors.yellowAccent[100],
          actions: <Widget>[Container(width: 30)],
        ),
        body: BodyWidget(),
      ),
    );
  }
}

class BodyWidget extends StatelessWidget {
  final FlareEndlessController _resultLoopController =
      FlareEndlessController('Untitled', 4);

  @override
  Widget build(BuildContext context) {
    return AdBannerTemplate(
      child: Container(
          color: Colors.grey[100],
          padding: EdgeInsets.only(left: 10, right: 10, top: 10),
          alignment: Alignment.center,
          child: Column(
            children: <Widget>[
              Container(
                decoration: BoxDecoration(
                    border: Border.all(width: 1),
                    borderRadius: BorderRadius.all(Radius.circular(20.0)),
                    shape: BoxShape.rectangle,
                    color: Colors.white12),
                child: ClipRRect(
                  borderRadius: BorderRadius.circular(10.0),
                  child: Image.asset('images/banner.png',
                      height: getDeviceSize(context).height / 6),
                ),
              ),
              SizedBox(height: 10),
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
                                          height: getMediumLogoSize(),
                                          width: getMediumLogoSize()),
                                      SizedBox(width: 10),
                                      Text(
                                        'About Gout',
                                        style: TextStyle(
                                          fontSize: getLargeTextSize(),
                                          fontWeight: FontWeight.bold,
                                          color: Colors.black,
                                        ),
                                      ),
                                    ],
                                  ),
                                  context,
                                  '/about'),
                              SizedBox(height: getMenuSpaceSize()),
                              Helpers.getMenuBox(
                                  Row(
                                    mainAxisAlignment: MainAxisAlignment.center,
                                    children: <Widget>[
                                      Image.asset('images/all.png',
                                          height: getMediumLogoSize(),
                                          width: getMediumLogoSize()),
                                      SizedBox(width: 10),
                                      Text(
                                        'Diet Menu',
                                        style: TextStyle(
                                          fontSize: getLargeTextSize(),
                                          fontWeight: FontWeight.bold,
                                          color: Colors.black,
                                        ),
                                      ),
                                    ],
                                  ),
                                  context,
                                  '/diet'),
                              SizedBox(height: getMenuSpaceSize()),
                              Helpers.getMenuBox(
                                Row(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: <Widget>[
                                    Container(
                                      width: isIpad ? ipadIconSize() * 1.5 : 60,
                                      height:
                                          isIpad ? ipadIconSize() * 1.5 : 30,
                                      child: FlareActor(
                                        'images/result.flr',
                                        alignment: Alignment.center,
                                        controller: _resultLoopController,
                                      ),
                                    ),
                                    SizedBox(width: 10),
                                    Container(
                                      child: Text(
                                        'Acid Uric Table',
                                        textAlign: TextAlign.center,
                                        style: TextStyle(
                                          fontSize: getLargeTextSize(),
                                          fontWeight: FontWeight.bold,
                                          color: Colors.black,
                                          decorationColor: Colors.limeAccent,
                                          decorationStyle:
                                              TextDecorationStyle.solid,
                                        ),
                                      ),
                                    ),
                                  ],
                                ),
                                context,
                                '/foodsScreen',
                              ),
                              SizedBox(height: getMenuSpaceSize()),
                              Container(
                                  padding: EdgeInsets.only(
                                      left: 10, top: 5, bottom: 5),
                                  margin: EdgeInsets.only(bottom: 5),
                                  alignment: Alignment.center,
                                  decoration: Helpers.boxDecoration(),
                                  child: GestureDetector(
                                    child: Row(
                                      mainAxisAlignment:
                                          MainAxisAlignment.center,
                                      children: <Widget>[
                                        RateButton(),
                                        SizedBox(width: 10),
                                        Text(
                                          'Rate 5 stars',
                                          style: TextStyle(
                                              fontSize: getLargeTextSize(),
                                              fontWeight: FontWeight.bold,
                                              color: Colors.black),
                                        ),
                                      ],
                                    ),
                                    onTap: () {
                                      InAppReview.instance.openStoreListing();
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
          )),
    );
  }
}
