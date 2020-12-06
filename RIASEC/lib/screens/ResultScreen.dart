import 'package:enum_to_string/enum_to_string.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:in_app_review/in_app_review.dart';
import 'package:pie_chart/pie_chart.dart';
import 'package:provider/provider.dart';
import 'package:seabird.riasectest/AppProvider.dart';
import 'package:seabird.riasectest/data/Results.dart';
import 'package:seabird.riasectest/helpers/BackgroundWidget.dart';
import 'package:seabird.riasectest/helpers/FlareEndlessController.dart';
import 'package:seabird.riasectest/helpers/Helpers.dart';
import 'package:seabird.riasectest/models/PercentTypes.dart';
import 'package:seabird.riasectest/models/TypeInfo.dart';
import 'package:seabird.riasectest/models/Types.dart';
import 'package:seabird.riasectest/widgets/AdBannerTemplate.dart';
import 'package:shimmer/shimmer.dart';

class ResultScreen extends StatefulWidget {
  @override
  _ResultScreenState createState() => _ResultScreenState();
}

class _ResultScreenState extends State<ResultScreen> {
  final Map<String, double> dataMap = Map();

  void initState() {
    AppProvider questionProvider =
        Provider.of<AppProvider>(context, listen: false);

    if (questionProvider.isFirstUse) {
      questionProvider.isFirstUse = false;
      questionProvider.setIsFirstUse();
      Future.delayed(
          Duration(seconds: 30), () => InAppReview.instance.requestReview());
    }
    super.initState();
  }

  final List<Color> colorList = [
    Results.resultInfoR.color,
    Results.resultInfoI.color,
    Results.resultInfoA.color,
    Results.resultInfoS.color,
    Results.resultInfoE.color,
    Results.resultInfoC.color,
  ];

  Widget build(BuildContext context) {
    AppProvider questionProvider =
        Provider.of<AppProvider>(context, listen: false);

    PercentTypes percentTypes = questionProvider.getTypePercents();
    Types userType = questionProvider.maxPercentType.type;
    TypeInfo userResultInfo = Results.getResultInfoByType(userType);

    final FlareEndlessController _resultLoopController =
        FlareEndlessController('Untitled', 4);
    final FlareEndlessController _starLoopController =
        FlareEndlessController('Untitled', 1);

    dataMap.putIfAbsent("R", () => percentTypes.percentTypeR.percent);
    dataMap.putIfAbsent("I", () => percentTypes.percentTypeI.percent);
    dataMap.putIfAbsent("A", () => percentTypes.percentTypeA.percent);
    dataMap.putIfAbsent("S", () => percentTypes.percentTypeS.percent);
    dataMap.putIfAbsent("E", () => percentTypes.percentTypeE.percent);
    dataMap.putIfAbsent("C", () => percentTypes.percentTypeC.percent);

    Helpers.winGameSound();

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
              iconSize: Helpers.isIpad() ? Helpers.ipadIconSize() * 1.2 : 24,
              icon: Image.asset(
                'images/home_icon.png',
                width: Helpers.isIpad() ? Helpers.ipadIconSize() * 1.2 : 24,
              ),
              onPressed: () => Helpers.backToHomeScreen(context),
            ),
            title: Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  Container(
                    width: Helpers.isIpad() ? Helpers.ipadIconSize() * 1.2 : 50,
                    height:
                        Helpers.isIpad() ? Helpers.ipadIconSize() * 1.2 : 50,
                    child: FlareActor(
                      "images/result.flr",
                      alignment: Alignment.center,
                      controller: _resultLoopController,
                    ),
                  ),
                  SizedBox(width: 10),
                  Shimmer.fromColors(
                    baseColor: Colors.yellowAccent,
                    highlightColor: Colors.white,
                    child: Text(
                      'Result',
                      style: TextStyle(
                        fontWeight: FontWeight.bold,
                        color: Colors.lightGreenAccent,
                        decoration: TextDecoration.underline,
                        decorationColor: Colors.red,
                        decorationStyle: TextDecorationStyle.solid,
                        fontSize: Helpers.isIpad()
                            ? Helpers.ipadFontSize() * 1.2
                            : 20,
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
                    width: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.9 : 40,
                    height:
                        Helpers.isIpad() ? Helpers.ipadIconSize() * 0.9 : 40,
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
                needShowSecondBanner: !questionProvider.admobLoaded,
                child: Column(
                  children: <Widget>[
                    Row(
                      children: <Widget>[
                        Expanded(
                          child: Center(
                            child: Text(
                              'The test show you mostly like: ' +
                                  EnumToString.parse(
                                      questionProvider.maxPercentType.type),
                              style: TextStyle(
                                  color: Colors.black,
                                  fontSize: Helpers.isIpad()
                                      ? Helpers.ipadFontSize()
                                      : 20,
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
                            decoration: new BoxDecoration(
                                border: Border.all(width: 1),
                                borderRadius:
                                    new BorderRadius.all(Radius.circular(20.0)),
                                shape: BoxShape.rectangle,
                                color: Colors.white12),
                            child: new ClipRRect(
                              borderRadius: new BorderRadius.circular(10.0),
                              child: Image.asset(
                                userResultInfo.image,
                                width: Helpers.getDeviceSize(context).width *
                                    (Helpers.isIpad() ? 0.5 : 2 / 3),
                              ),
                            ),
                          ),
                        ),
                      ],
                    ),
                    SizedBox(height: 10),
                    Shimmer.fromColors(
                      baseColor: userResultInfo.color,
                      highlightColor: Colors.black,
                      child: Text(
                        EnumToString.parse(
                                questionProvider.maxPercentType.type) +
                            ' - ${userResultInfo.name} :',
                        style: TextStyle(
                            color: userResultInfo.color,
                            fontSize: Helpers.isIpad()
                                ? Helpers.ipadFontSize() * 1.2
                                : 20,
                            decoration: TextDecoration.underline,
                            decorationColor: Colors.yellow,
                            fontWeight: FontWeight.bold),
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
                                  (index == 0 ? '' : '◦ ') +
                                      userResultInfo.texts[index],
                                  style: TextStyle(
                                      color: Colors.black,
                                      fontWeight: FontWeight.w500,
                                      fontSize: Helpers.isIpad()
                                          ? Helpers.ipadFontSize() * 0.7
                                          : 20),
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
      chartRadius:
          MediaQuery.of(context).size.width / (Helpers.isIpad() ? 5 : 2.7),
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
