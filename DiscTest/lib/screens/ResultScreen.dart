import 'package:app_review/app_review.dart';
import 'package:enum_to_string/enum_to_string.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/widgets.dart';
import 'package:pie_chart/pie_chart.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/QuestionProvider.dart';
import 'package:seab1ird.showyourself/helpers/Ads.dart';
import 'package:seab1ird.showyourself/helpers/EndLoopController.dart';
import 'package:seab1ird.showyourself/models/PercentTypes.dart';

class ResultScreen extends StatefulWidget {
  @override
  _ResultScreenState createState() => _ResultScreenState();
}

class _ResultScreenState extends State<ResultScreen> {
  bool toggle = false;
  double marginTop = 0;
  Map<String, double> dataMap = Map();
  List<Color> colorList = [
    Colors.red,
    Colors.green,
    Colors.blue,
    Colors.yellow,
  ];

  @override
  void initState(){
    if(kReleaseMode){ // is Release Mode ??
      Ads.showInterstitialAd();
      marginTop = 60;
    }

    super.initState();
  }

  Widget build(BuildContext context) {
    QuestionProvider questionProvider = Provider.of<QuestionProvider>(context);
    PercentTypes percentTypes = questionProvider.getTypePercents();
    final EndLoopController _resultLoopController =
        EndLoopController('Untitled', 2);
    final EndLoopController _starLoopController =
        EndLoopController('Untitled', 1);

    dataMap.putIfAbsent("D", () => percentTypes.percentTypeD.percent);
    dataMap.putIfAbsent("I", () => percentTypes.percentTypeI.percent);
    dataMap.putIfAbsent("S", () => percentTypes.percentTypeS.percent);
    dataMap.putIfAbsent("C", () => percentTypes.percentTypeC.percent);

    return Scaffold(
      appBar: AppBar(
        leading: IconButton(
          icon: Image.asset(
            'images/home_icon.png',
            height: 40,
          ),
          onPressed: () => {
            questionProvider.userChoices = [],
            Navigator.of(context)
              .pushNamedAndRemoveUntil('/', ModalRoute.withName('/test'))},
        ),
        title:
            Row(mainAxisAlignment: MainAxisAlignment.center, children: <Widget>[
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
          Text('Result'),
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
                Expanded(
                  child: ListView(
                    children: <Widget>[
                      PieChart(
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
                      ),
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
                                      color: Colors.yellowAccent,
                                      fontSize: 17,
                                      fontWeight: FontWeight.bold)),
                            ),
                          ),
                        ],
                      )
                    ],
                  ),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
