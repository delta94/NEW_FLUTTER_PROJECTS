import 'package:enum_to_string/enum_to_string.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:in_app_review/in_app_review.dart';
import 'package:seab1ird.disctest/data/RiasecTypes.dart';
import 'package:seab1ird.disctest/helpers/Ads.dart';
import 'package:seab1ird.disctest/helpers/BackgroundWidget.dart';
import 'package:seab1ird.disctest/helpers/FlareEndlessController.dart';
import 'package:seab1ird.disctest/helpers/Helpers.dart';
import 'package:seab1ird.disctest/widgets/ShadowText.dart';
import 'package:seab1ird.disctest/models/TypeInfo.dart';

class RiasecTypesScreen extends StatefulWidget {
  @override
  _RiasecTypesScreenState createState() => _RiasecTypesScreenState();
}

class _RiasecTypesScreenState extends State<RiasecTypesScreen> {
  TypeInfo currentResultInfo = RiasecTypes.resultInfoR;

  isCurrentResultInfo(TypeInfo resultInfo) {
    return currentResultInfo.type == resultInfo.type;
  }

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

    final List<TypeInfo> resultInfos = RiasecTypes.getInfos();

    return new WillPopScope(
      onWillPop: () {
        Helpers.backToHomeScreen(context);
        return Future<bool>.value(false);
      },
      child: SafeArea(
        child: Scaffold(
          appBar: AppBar(
            leading: IconButton(
              padding: EdgeInsets.zero,
              iconSize: Helpers.isIpad() ? Helpers.ipadIconSize() * 1.1 : 35,
              icon: Image.asset(
                'images/home_icon.png',
                width: Helpers.isIpad() ? Helpers.ipadIconSize() * 1.1 : 35,
              ),
              onPressed: () => Helpers.backToHomeScreen(context),
            ),
            title: Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  Container(
                    width: Helpers.isIpad() ? Helpers.ipadIconSize() : 40,
                    height: Helpers.isIpad() ? Helpers.ipadIconSize() : 40,
                    child: FlareActor(
                      "images/riasec.flr",
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
                    width: Helpers.isIpad() ? Helpers.ipadIconSize() : 40,
                    height: Helpers.isIpad() ? Helpers.ipadIconSize() : 40,
                    child: FlareActor(
                      "images/star.flr",
                      alignment: Alignment.center,
                      controller: _starLoopController,
                    )),
                onTap: () {
                  // AppReview.storeListing.then((onValue) {});
                  InAppReview.instance
                      .openStoreListing(appStoreId: "1535987884");
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
                    SizedBox(height: 10),
                    Expanded(
                      flex: 1,
                      child: ListView.builder(
                          shrinkWrap: true,
                          scrollDirection: Axis.horizontal,
                          itemCount: resultInfos.length,
                          itemBuilder: (content, index) {
                            return ButtonTheme(
                              minWidth: Helpers.deviceSize.width / 7,
                              child: RaisedButton(
                                color: isCurrentResultInfo(resultInfos[index])
                                    ? Colors.black
                                    : Colors.grey,
                                shape: RoundedRectangleBorder(
                                  borderRadius: BorderRadius.circular(10),
                                  side: isCurrentResultInfo(resultInfos[index])
                                      ? BorderSide(
                                          color: resultInfos[index].color,
                                          width: 5,
                                        )
                                      : BorderSide.none,
                                ),
                                onPressed: () {
                                  Helpers.tapButtonSound();
                                  setState(() {
                                    currentResultInfo = resultInfos[index];
                                  });
                                },
                                child: Row(
                                  mainAxisAlignment: MainAxisAlignment.center,
                                  children: <Widget>[
                                    isCurrentResultInfo(resultInfos[index])
                                        ? ShadowText(
                                            EnumToString.parse(
                                              resultInfos[index].type,
                                            ),
                                            style: TextStyle(
                                              color: resultInfos[index].color,
                                              fontSize: Helpers.isIpad()
                                                  ? Helpers.ipadFontSize() * 1.2
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
                                                  ? Helpers.ipadFontSize() * 1.2
                                                  : 20,
                                              fontWeight: FontWeight.bold,
                                            ))
                                  ],
                                ),
                              ),
                            );
                          }),
                    ),
                    SizedBox(height: 10),
                    Container(
                      margin: EdgeInsets.only(top: 10, bottom: 10),
                      width: Helpers.isIpad()
                          ? Helpers.getDeviceSize(context).width / 2
                          : Helpers.getDeviceSize(context).width * 2 / 3,
                      height: Helpers.isIpad()
                          ? Helpers.getDeviceSize(context).width / 2 * (4 / 7)
                          : Helpers.getDeviceSize(context).width *
                              (2 / 3) *
                              (4 / 7),
                      decoration: new BoxDecoration(
                          border: Border.all(width: 1),
                          borderRadius:
                              new BorderRadius.all(Radius.circular(20.0)),
                          shape: BoxShape.rectangle,
                          color: Colors.black12),
                      child: new ClipRRect(
                          borderRadius: new BorderRadius.circular(10.0),
                          child: Image.asset(currentResultInfo.image)),
                    ),
                    SizedBox(height: 10),
                    Container(
                      padding: EdgeInsets.all(5),
                      decoration: BoxDecoration(
                        color: Colors.black,
                        borderRadius: BorderRadius.circular(5),
                      ),
                      child: ShadowText(
                        EnumToString.parse(currentResultInfo.type) +
                            ': ${currentResultInfo.name} :',
                        style: TextStyle(
                            color: currentResultInfo.color,
                            decoration: TextDecoration.underline,
                            fontSize: Helpers.isIpad()
                                ? Helpers.ipadFontSize() * 1.2
                                : 20,
                            fontWeight: FontWeight.bold),
                      ),
                    ),
                    SizedBox(height: 10),
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
                                    color: Colors.black,
                                    fontWeight: FontWeight.w500,
                                    //backgroundColor: Colors.black54,
                                    fontSize: Helpers.isIpad()
                                        ? Helpers.ipadFontSize() * 0.7
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
      ),
    );
  }
}
