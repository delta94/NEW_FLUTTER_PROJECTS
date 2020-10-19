import 'package:app_review/app_review.dart';
import 'package:enum_to_string/enum_to_string.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.disctest/data/Results.dart';
import 'package:seab1ird.disctest/helpers/Ads.dart';
import 'package:seab1ird.disctest/widgets/BackgroundWidget.dart';
import 'package:seab1ird.disctest/helpers/EndLoopController.dart';
import 'package:seab1ird.disctest/helpers/Helpers.dart';
import 'package:seab1ird.disctest/widgets/ShadowText.dart';
import 'package:seab1ird.disctest/models/ResultInfo.dart';

class DiscTypesScreen extends StatefulWidget {
  @override
  _DiscTypesScreenState createState() => _DiscTypesScreenState();
}

class _DiscTypesScreenState extends State<DiscTypesScreen> {
  ResultInfo currentResultInfo = Results.resultInfoD;

  isCurrentResultInfo(ResultInfo resultInfo) {
    return currentResultInfo.type == resultInfo.type;
  }

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

    final List<ResultInfo> resultInfos = Results.getResultInfos();

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
                  width: Helpers.isIpad() ? Helpers.ipadIconSize() : 40,
                  height: Helpers.isIpad() ? Helpers.ipadIconSize() : 40,
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
                  'DISC Types',
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
                  SizedBox(
                    height: 10,
                  ),
                  Expanded(
                    flex: 1,
                    child: ListView.builder(
                        shrinkWrap: true,
                        scrollDirection: Axis.horizontal,
                        itemCount: resultInfos.length,
                        itemBuilder: (content, index) {
                          return ButtonTheme(
                            minWidth: Helpers.deviceSize.width / 5,
                            child: RaisedButton(
                              onPressed: () {
                                Helpers.tapButtonSound();
                                setState(() {
                                  currentResultInfo = resultInfos[index];
                                });
                              },
                              shape: RoundedRectangleBorder(
                                borderRadius: BorderRadius.circular(10),
                              ),
                              color: isCurrentResultInfo(resultInfos[index])
                                  ? Colors.lightGreenAccent
                                  : Colors.grey,
                              child: Container(
                                child: Row(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: <Widget>[
                                    isCurrentResultInfo(resultInfos[index])
                                        ? ShadowText(
                                            EnumToString.parse(
                                                resultInfos[index].type),
                                            style: TextStyle(
                                              color: Colors.redAccent,
                                              fontSize: Helpers.isIpad()
                                                  ? Helpers.ipadFontSize()
                                                  : 25,
                                              fontWeight: FontWeight.bold,
                                            ),
                                          )
                                        : Text(
                                            EnumToString.parse(
                                                resultInfos[index].type),
                                            style: TextStyle(
                                              color: Colors.black,
                                              fontSize: Helpers.isIpad()
                                                  ? Helpers.ipadFontSize()
                                                  : 25,
                                              fontWeight: FontWeight.bold,
                                            ))
                                  ],
                                ),
                              ),
                            ),
                          );
                        }),
                  ),
                  SizedBox(
                    height: 10,
                  ),
                  Container(
                    margin: EdgeInsets.only(top: 10, bottom: 10),
                    width: Helpers.isIpad()
                        ? Helpers.getDeviceSize(context).width / 2
                        : Helpers.getDeviceSize(context).width * 2 / 3,
                    decoration: new BoxDecoration(
                        border: Border.all(width: 5),
                        borderRadius:
                            new BorderRadius.all(Radius.circular(20.0)),
                        shape: BoxShape.rectangle,
                        color: Colors.white12),
                    child: new ClipRRect(
                        borderRadius: new BorderRadius.circular(10.0),
                        child: Image.asset(currentResultInfo.image)),
                  ),
                  SizedBox(
                    height: 10,
                  ),
                  ShadowText(
                    EnumToString.parse(currentResultInfo.type) +
                        ' (${currentResultInfo.name}) :',
                    style: TextStyle(
                        color: currentResultInfo.color,
                        backgroundColor: Colors.black45,
                        decoration: TextDecoration.underline,
                        decorationColor: Colors.white70,
                        fontSize: Helpers.isIpad()
                            ? Helpers.ipadFontSize() * 1.2
                            : 25,
                        fontWeight: FontWeight.bold),
                  ),
                  SizedBox(
                    height: 10,
                  ),
                  Expanded(
                    flex: 8,
                    child: Scrollbar(
                      child: ListView.builder(
                          scrollDirection: Axis.vertical,
                          itemCount: currentResultInfo.texts.length,
                          itemBuilder: (content, index) {
                            return Padding(
                              padding: const EdgeInsets.all(8.0),
                              child: Text(
                                currentResultInfo.texts[index],
                                style: TextStyle(
                                  color: Colors.white,
                                  fontWeight: FontWeight.w500,
                                  backgroundColor: Colors.black54,
                                  fontSize: Helpers.isIpad()
                                      ? Helpers.ipadFontSize()
                                      : 15,
                                ),
                              ),
                            );
                          }),
                    ),
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
