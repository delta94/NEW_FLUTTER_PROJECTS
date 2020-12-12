import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seabird.goutfood/data/AboutData.dart';
import 'package:seabird.goutfood/helpers/AdHelpers.dart';
import 'package:seabird.goutfood/helpers/ReponsiveHelper.dart';
import 'package:seabird.goutfood/helpers/Helpers.dart';
import 'package:seabird.goutfood/widgets/AdBannerTemplate.dart';
import 'package:seabird.goutfood/widgets/RateButton.dart';

class AboutScreen extends StatefulWidget {
  @override
  _AboutScreenState createState() => _AboutScreenState();
}

class _AboutScreenState extends State<AboutScreen> {
  @override
  void initState() {
    AdHelpers.showInterAd();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return WillPopScope(
      onWillPop: () {
        Helpers.backToHomeScreen(context);
        return Future<bool>.value(false);
      },
      child: SafeArea(
        child: Scaffold(
          appBar: AppBar(
            leading: IconButton(
              icon: Image.asset(
                'images/home_icon.png',
                height: getMediumLogoSize(),
              ),
              onPressed: () => Helpers.backToHomeScreen(context),
            ),
            title: Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  SizedBox(width: 10),
                  Text(
                    'About Gout - Diet',
                    style: TextStyle(
                      color: Colors.black,
                      fontSize: getMediumTextSize(),
                    ),
                  ),
                  SizedBox(width: 10),
                ]),
            iconTheme: IconThemeData(color: Colors.yellowAccent),
            backgroundColor: Colors.yellowAccent[100],
            actions: <Widget>[RateButton()],
          ),
          body: AdBannerTemplate(
            child: Container(
                color: Colors.transparent,
                padding: EdgeInsets.only(left: 10, right: 10, bottom: 10),
                child: SingleChildScrollView(
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.start,
                    children: [
                      SizedBox(height: 10),
                      ...getQuestions(),
                    ],
                  ),
                )),
          ),
        ),
      ),
    );
  }

  List<Widget> getQuestions() {
    var widgets = <Widget>[];
    var questions = AboutData.aboutData.keys.toList();
    for (var i = 0; i < questions.length; i++) {
      widgets.add(
        Column(
          children: [
            Row(
              children: [
                InkWell(
                  onTap: () {
                    Helpers.tapButtonSound();
                    Navigator.of(context)
                        .pushNamed('/aboutAnswer', arguments: i);
                  },
                  child: Container(
                    constraints: BoxConstraints(
                        maxWidth: ReponsiveHelper.deviceSize.width - 50),
                    decoration: BoxDecoration(
                      color: Colors.yellow[50],
                      border: Border.all(
                        color: Colors.black,
                        width: 1,
                      ),
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
                    padding: EdgeInsets.symmetric(vertical: 10, horizontal: 5),
                    child: Text(
                      '${i + 1} ${questions[i]}',
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
            SizedBox(height: 10)
          ],
        ),
      );
    }

    return widgets;
  }
}
