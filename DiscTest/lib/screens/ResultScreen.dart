import 'package:enum_to_string/enum_to_string.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:in_app_review/in_app_review.dart';
import 'package:pie_chart/pie_chart.dart';
import 'package:provider/provider.dart';
import 'package:seabird.disctest/AppProvider.dart';
import 'package:seabird.disctest/data/Results.dart';
import 'package:seabird.disctest/widgets/AdBannerTemplate.dart';
import 'package:seabird.disctest/widgets/BackgroundWidget.dart';
import 'package:seabird.disctest/helpers/EndLoopController.dart';
import 'package:seabird.disctest/helpers/Helpers.dart';
import 'package:seabird.disctest/models/PercentTypes.dart';
import 'package:seabird.disctest/models/ResultInfo.dart';
import 'package:seabird.disctest/models/Types.dart';
import 'package:shimmer/shimmer.dart';

// ignore: must_be_immutable
class ResultScreen extends StatelessWidget {
  InAppReview inAppReview;

  final Map<String, double> dataMap = Map();

  final List<Color> colorList = [
    Results.resultInfoD.color,
    Results.resultInfoI.color,
    Results.resultInfoS.color,
    Results.resultInfoC.color,
  ];

  Widget build(BuildContext context) {
    inAppReview = InAppReview.instance;
    var appProvider = Provider.of<AppProvider>(context, listen: false);
    if (appProvider.isFirstUse) {
      appProvider.isFirstUse = false;
      appProvider.setFirstUseToFalse();
      Future.delayed(Duration(seconds: 10), () => inAppReview.requestReview());
    }

    PercentTypes percentTypes = appProvider.getTypePercents();
    Types userType = appProvider.maxPercentType.type;
    ResultInfo userResultInfo = Results.getResultInfoByType(userType);

    final EndLoopController _resultLoopController =
        EndLoopController('Untitled', 4);
    final EndLoopController _starLoopController =
        EndLoopController('Untitled', 1);

    dataMap.putIfAbsent("D", () => percentTypes.percentTypeD.percent);
    dataMap.putIfAbsent("I", () => percentTypes.percentTypeI.percent);
    dataMap.putIfAbsent("S", () => percentTypes.percentTypeS.percent);
    dataMap.putIfAbsent("C", () => percentTypes.percentTypeC.percent);
    Helpers.winGameSound();

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
                  width: 50,
                  height: 50,
                  child: FlareActor(
                    "images/result.flr",
                    alignment: Alignment.center,
                    controller: _resultLoopController,
                  ),
                ),
                SizedBox(
                  width: 10,
                ),
                Shimmer.fromColors(
                  baseColor: Colors.yellowAccent,
                  highlightColor: Colors.white,
                  child: Text(
                    'Result',
                    style: TextStyle(
                      fontWeight: FontWeight.bold,
                      decoration: TextDecoration.underline,
                      decorationColor: Colors.red,
                      decorationStyle: TextDecorationStyle.solid,
                      fontSize:
                          Helpers.isIpad() ? Helpers.ipadFontSize() * 1.2 : 20,
                      shadows: [
                        Shadow(
                          color: Colors.red,
                          blurRadius: 10.0,
                          offset: Offset(2.0, 2.0),
                        ),
                      ],
                    ),
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
                InAppReview.instance.openStoreListing();
                // LaunchReview.launch(iOSAppId: "1508870026");
              },
            )
          ],
        ),
        body: Stack(
          children: <Widget>[
            BackgroundWidget(),
            AdBannerTemplate(
              needShowSecondBanner: !appProvider.admobLoaded,
              child: Column(
                children: <Widget>[
                  SizedBox(height: 10),
                  Row(
                    children: <Widget>[
                      Expanded(
                        child: Center(
                          child: Text(
                            'The test show that you mostly like: ' +
                                EnumToString.convertToString(
                                    appProvider.maxPercentType.type),
                            style: TextStyle(
                                color: Colors.black,
                                fontSize: Helpers.isIpad()
                                    ? Helpers.ipadFontSize() * 1.2
                                    : 20,
                                decoration: TextDecoration.underline,
                                decorationColor: Colors.red,
                                fontWeight: FontWeight.bold),
                          ),
                        ),
                      ),
                    ],
                  ),
                  Row(
                    children: <Widget>[
                      Expanded(
                        child: TypesPieChart(
                          dataMap: dataMap,
                          colorList: colorList,
                        ),
                      ),
                      Expanded(
                        child: Container(
                          margin: EdgeInsets.only(top: 10, bottom: 10),
                          width: Helpers.getDeviceSize(context).width * 2 / 3,
                          decoration: new BoxDecoration(
                              border: Border.all(width: 1),
                              borderRadius:
                                  new BorderRadius.all(Radius.circular(20.0)),
                              shape: BoxShape.rectangle,
                              color: Colors.white12),
                          child: new ClipRRect(
                              borderRadius: new BorderRadius.circular(10.0),
                              child: Image.asset(userResultInfo.image)),
                        ),
                      ),
                    ],
                  ),
                  SizedBox(
                    height: 10,
                  ),
                  Container(
                    padding: EdgeInsets.all(5),
                    decoration: BoxDecoration(
                      color: Colors.white,
                      borderRadius: BorderRadius.circular(10),
                    ),
                    child: Shimmer.fromColors(
                      baseColor: userResultInfo.color,
                      highlightColor: Colors.black,
                      child: Text(
                        EnumToString.convertToString(
                                appProvider.maxPercentType.type) +
                            ' (${userResultInfo.name}) :',
                        style: TextStyle(
                          fontSize: Helpers.isIpad()
                              ? Helpers.ipadFontSize() * 1.2
                              : 20,
                          decoration: TextDecoration.underline,
                          decorationColor: Colors.red,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                    ),
                  ),
                  SizedBox(height: 10),
                  Expanded(
                    child: Scrollbar(
                      child: ListView.builder(
                          scrollDirection: Axis.vertical,
                          itemCount: userResultInfo.texts.length,
                          itemBuilder: (content, index) {
                            return Padding(
                              padding: const EdgeInsets.all(8.0),
                              child: Text(
                                userResultInfo.texts[index],
                                style: TextStyle(
                                  color: Colors.black,
                                  fontWeight: FontWeight.w500,
                                  // backgroundColor: Colors.black54,
                                  fontSize: Helpers.isIpad()
                                      ? Helpers.ipadFontSize()
                                      : 15,
                                ),
                              ),
                            );
                          }),
                    ),
                  ),
                  SizedBox(height: 10),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}

class TypesPieChart extends StatelessWidget {
  const TypesPieChart({
    Key key,
    @required this.dataMap,
    @required this.colorList,
  }) : super(key: key);

  final Map<String, double> dataMap;
  final List<Color> colorList;

  @override
  Widget build(BuildContext context) {
    return PieChart(
      dataMap: dataMap,
      animationDuration: Duration(milliseconds: 800),
      chartLegendSpacing: 32.0,
      chartRadius: MediaQuery.of(context).size.width / 2.7,
      showChartValuesInPercentage: true,
      showChartValues: true,
      legendStyle: TextStyle(color: Colors.black, fontWeight: FontWeight.bold),
      showChartValuesOutside: false,
      chartValueBackgroundColor: Colors.grey[200],
      colorList: colorList,
      showLegends: true,
      legendPosition: LegendPosition.right,
      decimalPlaces: 1,
      showChartValueLabel: true,
      initialAngle: 0,
      chartValueStyle: defaultChartValueStyle.copyWith(
        color: Colors.blueGrey[900].withOpacity(0.9),
      ),
      chartType: ChartType.disc,
    );
  }
}
