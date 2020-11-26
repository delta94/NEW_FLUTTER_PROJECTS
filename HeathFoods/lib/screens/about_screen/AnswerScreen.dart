import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seabird.goutfood/data/AboutData.dart';
import 'package:seabird.goutfood/helpers/Ads.dart';
import 'package:seabird.goutfood/helpers/Helpers.dart';
import 'package:seabird.goutfood/helpers/ReponsiveHelper.dart';
import 'package:seabird.goutfood/models/DataInfo.dart';
import 'package:seabird.goutfood/widgets/RateButton.dart';

class AnswerScreen extends StatefulWidget {
  @override
  _AnswerScreenState createState() => _AnswerScreenState();
}

class _AnswerScreenState extends State<AnswerScreen> {
  double marginTop = 0;
  @override
  Widget build(BuildContext context) {
    final int questionId = ModalRoute.of(context).settings.arguments;
    var question = AboutData.aboutData.keys.toList()[questionId];
    if (Ads.isReleaseMode()) {
      // Ads.showInterstitialAd();
      marginTop = 60;
    }

    return SafeArea(
      child: Scaffold(
        appBar: AppBar(
          leading: IconButton(
              icon: Icon(
                Icons.arrow_back,
                color: Colors.black,
              ),
              onPressed: () {
                Helpers.tapButtonSound();
                Navigator.pop(context);
              }),
          title: Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                SizedBox(
                  width: 10,
                ),
                Text(
                  'About Gout - Diet',
                  style: TextStyle(
                    color: Colors.black,
                    fontSize: getMediumTextSize(),
                  ),
                ),
                SizedBox(
                  width: 10,
                ),
              ]),
          iconTheme: IconThemeData(color: Colors.yellowAccent),
          backgroundColor: Colors.yellowAccent[100],
          actions: <Widget>[RateButton()],
        ),
        body: Stack(
          children: <Widget>[
            Container(
              color: Colors.transparent,
              margin: EdgeInsets.only(top: marginTop),
              padding: EdgeInsets.only(left: 10, right: 10, bottom: 10),
              child: Column(
                children: [
                  SizedBox(height: 10),
                  Row(
                    children: [
                      Expanded(
                        child: Container(
                          alignment: Alignment.center,
                          decoration: BoxDecoration(
                            color: Colors.yellow[100],
                            border: Border.all(color: Colors.black),
                            borderRadius: BorderRadius.circular(5),
                          ),
                          padding:
                              EdgeInsets.symmetric(vertical: 10, horizontal: 5),
                          child: Text(
                            '${questionId + 1} $question',
                            style: TextStyle(
                              color: Colors.black,
                              fontWeight: FontWeight.bold,
                              fontSize: getSmallTextSize(),
                            ),
                          ),
                        ),
                      ),
                    ],
                  ),
                  Expanded(
                    child: SingleChildScrollView(
                      child: Column(
                        children: [
                          ...getInfosWidgets(
                              AboutData.aboutData[question].infos)
                        ],
                      ),
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

  List<Widget> getInfosWidgets(List<Info> infos) {
    var widgets = <Widget>[];
    infos.forEach((info) {
      widgets.add(
        Column(
          children: [
            Row(
              children: [
                Container(
                  constraints: BoxConstraints(
                      maxWidth: ReponsiveHelper.deviceSize.width - 20),
                  padding: EdgeInsets.symmetric(vertical: 10, horizontal: 5),
                  child: Column(
                    children: [
                      Text(
                        info.infoText,
                        style: TextStyle(
                          color: Colors.black,
                          fontWeight: info.smallInfos.isEmpty
                              ? FontWeight.normal
                              : FontWeight.bold,
                          fontSize: getSmallTextSize(),
                        ),
                      ),
                      ...getSmallInfos(info.smallInfos)
                    ],
                  ),
                ),
              ],
            ),
          ],
        ),
      );
    });

    return widgets;
  }

  List<Widget> getSmallInfos(List<String> smallInfos) {
    var widgets = <Widget>[];
    smallInfos.forEach((smallInfo) {
      widgets.add(
        Column(
          children: [
            Row(
              children: [
                Container(
                  constraints: BoxConstraints(
                      maxWidth: ReponsiveHelper.deviceSize.width - 40),
                  padding: EdgeInsets.symmetric(vertical: 10, horizontal: 5),
                  child: Column(
                    children: [
                      Text(
                        '- $smallInfo',
                        style: TextStyle(
                          color: Colors.black,
                          fontSize: getSmallTextSize(),
                        ),
                      ),
                    ],
                  ),
                ),
              ],
            ),
          ],
        ),
      );
    });

    return widgets;
  }
}
