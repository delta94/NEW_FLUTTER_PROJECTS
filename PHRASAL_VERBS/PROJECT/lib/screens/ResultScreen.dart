import 'package:app_review/app_review.dart';
import 'package:enum_to_string/enum_to_string.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:pie_chart/pie_chart.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/QuestionProvider.dart';
import 'package:seab1ird.showyourself/data/Results.dart';
import 'package:seab1ird.showyourself/helpers/Ads.dart';
import 'package:seab1ird.showyourself/helpers/EndLoopController.dart';
import 'package:seab1ird.showyourself/helpers/Helpers.dart';
import 'package:seab1ird.showyourself/models/PercentTypes.dart';
import 'package:seab1ird.showyourself/models/ResultInfo.dart';
import 'package:seab1ird.showyourself/models/Types.dart';

class ResultScreen extends StatelessWidget {
  final Map<String, double> dataMap = Map();
  final List<Color> colorList = [
    Results.resultInfoD.color,
    Results.resultInfoI.color,
    Results.resultInfoS.color,
    Results.resultInfoC.color,
  ];

  backToHomeScreen(BuildContext context) {
    Navigator.of(context)
        .pushNamedAndRemoveUntil('/', ModalRoute.withName('/result'));
  }

  Widget build(BuildContext context) {
    double marginTop = 0;
    if (kReleaseMode) {
      Ads.showInterstitialAd();
      marginTop = 60;
    }

    QuestionProvider questionProvider =
        Provider.of<QuestionProvider>(context, listen: false);
    PercentTypes percentTypes = questionProvider.getTypePercents();
    Types userType = questionProvider.maxPercentType.type;
    ResultInfo userResultInfo = Results.getResultInfoByType(userType);

    final EndLoopController _resultLoopController =
        EndLoopController('Untitled', 4);
    final EndLoopController _starLoopController =
        EndLoopController('Untitled', 1);

    dataMap.putIfAbsent("D", () => percentTypes.percentTypeD.percent);
    dataMap.putIfAbsent("I", () => percentTypes.percentTypeI.percent);
    dataMap.putIfAbsent("S", () => percentTypes.percentTypeS.percent);
    dataMap.putIfAbsent("C", () => percentTypes.percentTypeC.percent);

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
                Text(
                  'Result',
                  style: TextStyle(
                    fontWeight: FontWeight.bold,
                    color: Colors.lightGreenAccent,
                    decoration: TextDecoration.underline,
                    decorationColor: Colors.red,
                    decorationStyle: TextDecorationStyle.solid,
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
              },
            )
          ],
        ),
        body: Stack(
          children: <Widget>[
            Container(
              decoration: new BoxDecoration(
                image: new DecorationImage(
                  image: new AssetImage('images/bg.png'),
                  fit: BoxFit.cover,
                ),
              ),
            ),
            Container(
              margin: EdgeInsets.only(top: marginTop),
              padding: EdgeInsets.only(left: 10, right: 10),
              child: Column(
                children: <Widget>[
                  SizedBox(
                    height: 10,
                  ),
                  Row(
                    children: <Widget>[
                      Expanded(
                        child: Center(
                          child: Text(
                            'The test show that you mostly like: ' +
                                EnumToString.parse(
                                    questionProvider.maxPercentType.type),
                            style: TextStyle(
                                color: userResultInfo.color,
                                fontSize: 17,
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
                              border: Border.all(width: 5),
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
                  Text(
                    EnumToString.parse(questionProvider.maxPercentType.type) +
                        ' (' +
                        userResultInfo.name +
                        ') :',
                    style: TextStyle(
                        color: userResultInfo.color,
                        fontSize: 17,
                        decoration: TextDecoration.underline,
                        decorationColor: Colors.red,
                        fontWeight: FontWeight.bold),
                  ),
                  SizedBox(
                    height: 10,
                  ),
                  new Expanded(
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
                                  color: Colors.white,
                                  fontWeight: FontWeight.w500,
                                  backgroundColor: Colors.black54,
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
      legendStyle: TextStyle(color: Colors.white),
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
