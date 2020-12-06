import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.goutfood/AppProvider.dart';
import 'package:seabird.goutfood/data/AboutData.dart';
import 'package:seabird.goutfood/helpers/Helpers.dart';
import 'package:seabird.goutfood/helpers/ReponsiveHelper.dart';
import 'package:seabird.goutfood/models/DataInfo.dart';
import 'package:seabird.goutfood/widgets/AdBannerTemplate.dart';
import 'package:seabird.goutfood/widgets/RateButton.dart';

class AnswerScreen extends StatefulWidget {
  @override
  _AnswerScreenState createState() => _AnswerScreenState();
}

class _AnswerScreenState extends State<AnswerScreen> {
  @override
  Widget build(BuildContext context) {
    final int questionId = ModalRoute.of(context).settings.arguments;
    var question = AboutData.aboutData.keys.toList()[questionId];
    var appProvider = Provider.of<AppProvider>(context, listen: false);

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
        body: AdBannerTemplate(
          needShowSecondBanner: !appProvider.admobLoaded,
          child: Container(
            color: Colors.transparent,
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
                          gradient: LinearGradient(
                            begin: Alignment.topLeft,
                            end: Alignment(1,
                                0.0), // 10% of the width, so there are ten blinds.
                            colors: [
                              Colors.yellow[200],
                              Colors.yellow[50],
                            ], // red to yellow
                            tileMode: TileMode
                                .clamp, // repeats the gradient over the canvas
                          ),
                          boxShadow: [
                            BoxShadow(
                              color: Colors.grey,
                              blurRadius: 2,
                              spreadRadius: 2,
                              offset: Offset(5, 5),
                            )
                          ],
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
                        ...getInfosWidgets(AboutData.aboutData[question].infos)
                      ],
                    ),
                  ),
                ),
              ],
            ),
          ),
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
                      maxWidth: ReponsiveHelper.deviceSize.width - 40),
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
                          fontSize: getXSSmallTextSize(),
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
