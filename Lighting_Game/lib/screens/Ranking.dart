import 'dart:math';

import 'package:com.seab1ird.showyourself/model_view/GameProvider.dart';
import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';

const List<String> NAMES = [
  'Niels Bohr',
  'Anne',
  'Carol',
  'Alan',
  'Brian',
  'Zoe',
  'David',
  'Wendy',
  'Victoria',
  'Luke',
  'Victor',
  'Sarah',
  'Owen',
  'Yvonne',
  'Nicholas',
  'Rose',
  'Matt',
  'Sophie',
  'Jason',
  'Jennifer',
  'Nicholas',
  'Warren',
  'Heather',
  'Diana',
  'Lux',
  'Liam',
  'Tim',
  'Sean',
  'Clark',
  'Simon',
  'Ball'
];

// ignore: must_be_immutable
class Ranking extends StatelessWidget {
  Map<String, int> selectedNameScores = {};
  List<String> selectedNames = [];
  List<int> selectedScores = [];

  getPlusndex(int currRoundNum) {
    int plusNum = currRoundNum;
    if (currRoundNum == 0)
      plusNum = 1;
    else if (currRoundNum > 9) {
      plusNum = 10;
    }

    return plusNum;
  }

  updateSelectedScores(int currRoundNum) {
    selectedScores[0] += 1;
  }

  setSelectedScoreNames(GameProvider gameProvider) {
    selectedNameScores = {};
    selectedNames = [];
    selectedScores = [];
    int plusNum = getPlusndex(gameProvider.currRoundNum);

    int index = 1;
    while (selectedNames.length < 10) {
      Random rd = new Random();
      int randomIndex = rd.nextInt(NAMES.length);
      String newName = NAMES[randomIndex];
      if (!selectedNames.contains(newName)) selectedNames.add(newName);
      if (index == 1)
        plusNum += (gameProvider.currRoundNum -
                (gameProvider.currRoundNum / 3).floor())
            .ceil();
      int subNum = ((index * plusNum) / 3).floor();
      selectedScores.add(selectedNames.length + subNum);
      index++;
    }

    updateSelectedScores(gameProvider.currRoundNum);

    int userRank = 0;
    for (int i = 0; i < selectedScores.length; i++) {
      if (gameProvider.time >= selectedScores[i]) {
        userRank = i;
      }
    }

    if (userRank < 10 && userRank >= 0) {
      selectedNames[userRank] = 'You';
      selectedScores[userRank] = gameProvider.time;
    }

    for (int i = 0; i < selectedNames.length; i++) {
      selectedNameScores[selectedNames[i]] = selectedScores[i];
    }
  }

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    setSelectedScoreNames(gameProvider);

    TextStyle _getTextStyle(int index) {
      bool isUser = selectedNameScores.keys.toList()[index] == 'You';
      Color color = Utils.getOppositeColor(gameProvider.theme);
      FontWeight fontWeight = isUser ? FontWeight.bold : FontWeight.normal;
      double fontSize = isUser ? 25 : 20;

      return TextStyle(
          color: color, fontWeight: fontWeight, fontSize: fontSize);
    }

    getRandomRankingImage() {
      Random rd = new Random();
      int num = rd.nextInt(2);
      return 'ranking$num';
    }

    return WillPopScope(
      onWillPop: () {
        Navigator.of(context).popAndPushNamed('/rounds');
        return Future<bool>.value(false);
      },
      child: Material(
        child: SafeArea(
          child: Stack(
            children: [
              Opacity(
                opacity: 1,
                child: Container(
                  decoration: new BoxDecoration(
                    image: new DecorationImage(
                      image: new AssetImage('asset/images/bg_blue.png'),
                      fit: BoxFit.fill,
                    ),
                  ),
                ),
              ),
              Scaffold(
                backgroundColor: Colors.transparent,
                body: Column(
                  children: [
                    Container(
                      padding: EdgeInsets.symmetric(vertical: 10),
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: [
                          Utils.getImage(getRandomRankingImage(), width: 60),
                          SizedBox(width: 10),
                          Text(
                            'Ranking',
                            style: TextStyle(
                              fontWeight: FontWeight.bold,
                              fontSize: 30,
                              color: Colors.yellow,
                            ),
                          ),
                        ],
                      ),
                    ),
                    Expanded(
                      child: Container(
                        alignment: Alignment.center,
                        child: ListView.builder(
                          shrinkWrap: true,
                          itemCount: selectedNameScores.length,
                          itemBuilder: (BuildContext context, int index) =>
                              Container(
                            padding: EdgeInsets.symmetric(
                                vertical: 2,
                                horizontal:
                                    MediaQuery.of(context).size.width / 4),
                            child: Row(
                              mainAxisAlignment: MainAxisAlignment.start,
                              children: [
                                Container(
                                    margin: EdgeInsets.only(right: 5),
                                    width: 25,
                                    child: Utils.getImage(Utils.getLightOnType(
                                            Utils.getLightOffType()) +
                                        '_on')),
                                Text(
                                  selectedNameScores.keys.toList()[index] + ':',
                                  textAlign: TextAlign.center,
                                  style: _getTextStyle(index),
                                ),
                                SizedBox(width: 10),
                                Text(
                                  selectedNameScores.values
                                          .toList()[index]
                                          .toString() +
                                      's',
                                  textAlign: TextAlign.center,
                                  style: _getTextStyle(index),
                                ),
                              ],
                            ),
                          ),
                        ),
                      ),
                    ),
                  ],
                ),
                bottomNavigationBar: RaisedButton(
                  onPressed: () =>
                      Navigator.of(context).popAndPushNamed('/rounds'),
                  child: Container(
                    padding: EdgeInsets.all(10),
                    color: Colors.black,
                    child: Text(
                      'Play',
                      textAlign: TextAlign.center,
                      style: TextStyle(color: Colors.blue),
                    ),
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
