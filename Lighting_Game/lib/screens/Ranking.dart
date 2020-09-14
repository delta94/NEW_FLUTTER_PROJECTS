import 'dart:math';

import 'package:app_review/app_review.dart';
import 'package:com.seab1ird.showyourself/helpers/Ads.dart';
import 'package:com.seab1ird.showyourself/model_view/GameProvider.dart';
import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:com.seab1ird.showyourself/widgets/ImageButton.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:shimmer/shimmer.dart';

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

    getRandomRankingImage() {
      String themeColorName = gameProvider.themeColorName;
      bool isBlueType = themeColorName == 'green' ||
          themeColorName == 'blue' ||
          themeColorName == 'yellow';
      int num = isBlueType ? 1 : 0;
      return 'ranking$num';
    }

    return WillPopScope(
      onWillPop: () {
        Navigator.of(context).popAndPushNamed('/rounds');
        return Future<bool>.value(false);
      },
      child: Material(
        child: Stack(
          children: [
            Opacity(
              opacity: 1,
              child: Container(
                decoration: new BoxDecoration(
                  image: new DecorationImage(
                    image: Utils.getBackground(gameProvider.themeColorName),
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
                    padding: EdgeInsets.symmetric(vertical: 30, horizontal: 5),
                    child: Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: [
                        InkWell(
                          onTap: () =>
                              Navigator.popAndPushNamed(context, '/home'),
                          child: Utils.getImage('home_icon',
                              width:
                                  Utils.isIpad() ? Utils.ipadIconSize() : 40),
                        ),
                        Row(
                          children: [
                            Utils.getImage(getRandomRankingImage(),
                                width:
                                    Utils.isIpad() ? Utils.ipadIconSize() : 50),
                            SizedBox(width: 10),
                            Shimmer.fromColors(
                              baseColor: Colors.green,
                              highlightColor: Colors.yellow,
                              child: Text(
                                'Ranking',
                                style: TextStyle(
                                  fontWeight: FontWeight.bold,
                                  fontSize: Utils.isIpad()
                                      ? Utils.ipadFontSize()
                                      : 25,
                                  color: Colors.yellow,
                                ),
                              ),
                            ),
                            SizedBox(width: 10),
                          ],
                        ),
                        InkWell(
                          onTap: () =>
                              AppReview.storeListing.then((onValue) {}),
                          child: Utils.getImage('star',
                              width:
                                  Utils.isIpad() ? Utils.ipadIconSize() : 40),
                        ),
                      ],
                    ),
                  ),
                  Expanded(
                    child: Container(
                      padding:
                          EdgeInsets.only(left: Utils.deviceSize.width / 4),
                      alignment: Alignment.center,
                      child: ListView.builder(
                        shrinkWrap: true,
                        itemCount: selectedNameScores.length,
                        itemBuilder: (BuildContext context, int index) =>
                            Container(
                          child: Wrap(
                            children: [
                              Container(
                                color: Colors.black,
                                margin: EdgeInsets.only(
                                    right: 5, bottom: Utils.isIpad() ? 20 : 5),
                                width:
                                    Utils.isIpad() ? Utils.ipadIconSize() : 30,
                                child: gameProvider.getUserAvatars(
                                    selectedNameScores.keys.toList()[index]),
                              ),
                              Container(
                                padding: EdgeInsets.symmetric(horizontal: 5),
                                color: Colors.black,
                                child: Wrap(
                                  children: [
                                    selectedNameScores.keys.toList()[index] ==
                                            'You'
                                        ? Shimmer.fromColors(
                                            baseColor: Colors.orange,
                                            highlightColor: Colors.yellow,
                                            child: NameScore(
                                              index: index,
                                              selectedNameScores:
                                                  selectedNameScores,
                                            ),
                                          )
                                        : NameScore(
                                            index: index,
                                            selectedNameScores:
                                                selectedNameScores),
                                  ],
                                ),
                              ),
                            ],
                          ),
                        ),
                      ),
                    ),
                  ),
                ],
              ),
              bottomNavigationBar: Container(
                margin: EdgeInsets.only(bottom: 20),
                height: 120,
                child: ImageButton(
                  text: 'Next Round',
                  buttonColor: 'green',
                  onPress: () => Navigator.popAndPushNamed(context, '/rounds'),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}

class NameScore extends StatelessWidget {
  const NameScore({
    Key key,
    @required this.selectedNameScores,
    this.index,
  }) : super(key: key);

  final int index;
  final Map<String, int> selectedNameScores;

  @override
  Widget build(BuildContext context) {
    TextStyle _getTextStyle(int index) {
      bool isUser = selectedNameScores.keys.toList()[index] == 'You';
      Color color = isUser ? Colors.yellow : Colors.white;
      FontWeight fontWeight = isUser ? FontWeight.bold : FontWeight.normal;
      double fontSize =
          Utils.isIpad() ? Utils.ipadIconSize() : isUser ? 25 : 20;

      return TextStyle(
        color: color,
        fontWeight: fontWeight,
        fontSize: fontSize,
        backgroundColor: isUser ? null : Colors.black,
      );
    }

    return Text(
      selectedNameScores.keys.toList()[index] +
          ':  ' +
          selectedNameScores.values.toList()[index].toString() +
          's',
      textAlign: TextAlign.center,
      style: _getTextStyle(index),
    );
  }
}
