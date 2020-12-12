import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:in_app_review/in_app_review.dart';
import 'package:seabird.riasectest/helpers/AdHelpers.dart';
import 'package:seabird.riasectest/helpers/BackgroundWidget.dart';
import 'package:seabird.riasectest/helpers/FlareEndlessController.dart';
import 'package:seabird.riasectest/helpers/Helpers.dart';
import 'package:seabird.riasectest/widgets/AdBannerTemplate.dart';
import 'package:seabird.riasectest/widgets/ShadowText.dart';

class IntroScreen extends StatefulWidget {
  @override
  _IntroScreenState createState() => _IntroScreenState();
}

class _IntroScreenState extends State<IntroScreen> {
  @override
  void initState() {
    AdHelpers.showInterAd();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    final FlareEndlessController _logoLoopController =
        FlareEndlessController('Untitled', 10);
    final FlareEndlessController _starLoopController =
        FlareEndlessController('Untitled', 1);

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
                    width: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.8 : 40,
                    height:
                        Helpers.isIpad() ? Helpers.ipadIconSize() * 0.8 : 40,
                    child: FlareActor(
                      "images/riasec.flr",
                      alignment: Alignment.center,
                      controller: _logoLoopController,
                    ),
                  ),
                  SizedBox(width: 10),
                  ShadowText(
                    'Introduction',
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
              AdBannerTemplate(
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: <Widget>[
                    Row(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: <Widget>[
                        Container(
                          margin: EdgeInsets.only(bottom: 10),
                          width: Helpers.getDeviceSize(context).width /
                              (Helpers.isIpad() ? 4 : 3),
                          decoration: new BoxDecoration(
                              border: Border.all(width: 1),
                              borderRadius:
                                  new BorderRadius.all(Radius.circular(20.0)),
                              shape: BoxShape.rectangle,
                              color: Colors.black12),
                          child: new ClipRRect(
                            borderRadius: new BorderRadius.circular(10.0),
                            child: Image.asset('images/logo_head.png'),
                          ),
                        ),
                      ],
                    ),
                    SizedBox(
                      height: 10,
                    ),
                    Container(
                      padding: const EdgeInsets.all(8.0),
                      decoration: BoxDecoration(
                          color: Colors.black54,
                          borderRadius: BorderRadius.circular(10)),
                      child: ShadowText(
                        'What is RIASEC ?',
                        style: TextStyle(
                          fontSize:
                              Helpers.isIpad() ? Helpers.ipadFontSize() : 20,
                          color: Colors.white,
                          fontWeight: FontWeight.bold,
                          //backgroundColor: Colors.black54,
                        ),
                      ),
                    ),
                    Expanded(
                      child: SingleChildScrollView(
                        child: Column(
                          children: [
                            Padding(
                              padding: const EdgeInsets.all(8.0),
                              child: Text(
                                'The Holland Codes or the Holland Occupational Themes (RIASEC) refers to a theory of careers and vocational choice (based upon personality types) that was initially developed by American psychologist John L. Holland.',
                                style: TextStyle(
                                  color: Colors.black,
                                  fontSize: Helpers.isIpad()
                                      ? Helpers.ipadFontSize() * 0.7
                                      : 15,
                                  fontWeight: FontWeight.w500,
                                  //backgroundColor: Colors.black54,
                                ),
                              ),
                            ),
                            Padding(
                              padding: const EdgeInsets.all(8.0),
                              child: Text(
                                'The Holland Occupational Themes is a theory of personality that focuses on career and vocational choice. It groups people on the basis of their suitability for six different categories of occupations. The six types yield the RIASEC acronym, by which the theory is also commonly known. The theory was developed by John L. Holland over the course of his career, starting in the 1950s. The typology has come to dominate the field of career counseling and has been incorporated into most of the popular assessments used in the field.',
                                style: TextStyle(
                                  color: Colors.black,
                                  fontSize: Helpers.isIpad()
                                      ? Helpers.ipadFontSize() * 0.7
                                      : 15,
                                  fontWeight: FontWeight.w500,
                                  //backgroundColor: Colors.black54,
                                ),
                              ),
                            ),
                            Padding(
                              padding: const EdgeInsets.all(8.0),
                              child: Text(
                                'The term Holland Code, Holland Codes and abbreviation RIASEC refer to John Holland\'s six personality types: Realistic (R), Investigative (I), Artistic (A), Social (S), Enterprising (E) and Conventional (C).  According to Holland’s Theory of Career Choice, choosing work or an education program environment that matches, or is similar to your personality, will most likely lead to success and satisfaction.',
                                style: TextStyle(
                                  color: Colors.black,
                                  fontSize: Helpers.isIpad()
                                      ? Helpers.ipadFontSize() * 0.7
                                      : 15,
                                  fontWeight: FontWeight.w500,
                                  //backgroundColor: Colors.black54,
                                ),
                              ),
                            ),
                            Padding(
                              padding: const EdgeInsets.all(8.0),
                              child: Text(
                                'For a description of each type and how you can use personality-career and personality-major match to increase career satisfaction and academic success, visit our article on Holland\'s Theory of Career Choice. Our advice on career change, how to choose a career path and how to choose a major are based on this popular, respected theory.',
                                style: TextStyle(
                                  color: Colors.black,
                                  fontSize: Helpers.isIpad()
                                      ? Helpers.ipadFontSize() * 0.7
                                      : 15,
                                  fontWeight: FontWeight.w500,
                                  //backgroundColor: Colors.black54,
                                ),
                              ),
                            ),
                            Padding(
                              padding: const EdgeInsets.all(8.0),
                              child: Text(
                                'For an accurate assessment of all six Holland Codes, take Career Key\'s career test. Instead of giving results as three-letter codes and alphabetical lists of careers, our unique matching system enables you to identify careers and college majors that match your set of interests, traits, skills and abilities. Career Key organizes and scientifically classifies careers, college majors, career clusters, and career pathways by these personality types.',
                                style: TextStyle(
                                  color: Colors.black,
                                  fontSize: Helpers.isIpad()
                                      ? Helpers.ipadFontSize() * 0.7
                                      : 15,
                                  fontWeight: FontWeight.w500,
                                  //backgroundColor: Colors.black54,
                                ),
                              ),
                            ),
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
      ),
    );
  }
}
