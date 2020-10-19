import 'dart:io';
import 'package:assets_audio_player/assets_audio_player.dart';
import 'package:flutter/material.dart';
import 'package:seab1ird.disctest/data/Questions.dart';
import 'package:seab1ird.disctest/models/Answer.dart';
import 'package:seab1ird.disctest/models/ColorModel.dart';
import 'package:seab1ird.disctest/models/RadioModel.dart';
import 'package:seab1ird.disctest/models/UserChoice.dart';
import '../QuestionProvider.dart';

class Helpers {
  static Size deviceSize;
  static AssetsAudioPlayer animatedAudio = AssetsAudioPlayer();
  static AssetsAudioPlayer winAudio = AssetsAudioPlayer();

  static tapButtonSound() {
    animatedAudio.open(Audio('sounds/btnclick.mp3'));
  }

  static winGameSound() {
    winAudio.open(Audio('sounds/win.mp3'));
  }

  static Future<bool> onWillPop(BuildContext context) {
    // Ads.showInterstitialAd();
    return showDialog(
      context: context,
      builder: (context) => new AlertDialog(
        backgroundColor: Colors.white,
        title: new Text('Quit App ?',
            style: TextStyle(
              color: Colors.red,
              fontSize: 18,
              decoration: TextDecoration.underline,
              decorationColor: Colors.red,
              decorationStyle: TextDecorationStyle.solid,
            )),
        content: Container(
            child: new Text('Are you sure ?',
                style: TextStyle(
                    color: Colors.blue, fontWeight: FontWeight.bold))),
        actions: <Widget>[
          new FlatButton(
            onPressed: () => Navigator.of(context).pop(false),
            child: new Text(
              'No',
              style: TextStyle(
                color: Colors.blue,
                fontWeight: FontWeight.bold,
                decoration: TextDecoration.underline,
                decorationColor: Colors.blue,
                decorationStyle: TextDecorationStyle.solid,
                shadows: [
                  Shadow(
                    color: Colors.greenAccent,
                    blurRadius: 10.0,
                    offset: Offset(5.0, 5.0),
                  ),
                ],
              ),
            ),
          ),
          new FlatButton(
            onPressed: () => exit(0),
            child: new Text(
              'Yes',
              style: TextStyle(
                color: Colors.red,
                fontWeight: FontWeight.bold,
                decoration: TextDecoration.underline,
                decorationColor: Colors.red,
                decorationStyle: TextDecorationStyle.solid,
                shadows: [
                  Shadow(
                    color: Colors.greenAccent,
                    blurRadius: 10.0,
                    offset: Offset(5.0, 5.0),
                  ),
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }

  static BoxDecoration boxDecoration([Color color]) {
    return BoxDecoration(
      color: color != null ? color : Colors.black54,
      border: Border.all(width: 3.0),
      borderRadius: BorderRadius.all(Radius.circular(20.0) //
          ),
    );
  }

  static Container getMenuBox(Row row, BuildContext context, String path,
      [String argument]) {
    return Container(
        padding: EdgeInsets.only(left: 10, top: 10, bottom: 10),
        margin: EdgeInsets.only(bottom: 5),
        alignment: Alignment.center,
        decoration: boxDecoration(),
        child: GestureDetector(
          child: row,
          onTap: () {
            Helpers.tapButtonSound();
            Navigator.pushNamed(context, path, arguments: argument);
          },
        ));
  }

  static getQuestionNumber(int id) {
    return (id + 1);
  }

  static setAnswersList(List<List<RadioModel>> answersList, int questionId,
      QuestionProvider questionProvider) {
    answersList.add(new List<RadioModel>());
    answersList.add(new List<RadioModel>());

    UserChoice currentUserChoice =
        questionProvider.getCurrentUserAnswersByQuestionId(questionId);

    answersList[0].add(new RadioModel(
        _getRadioValue(0, questions[questionId].answers[0], currentUserChoice),
        'A',
        questions[questionId].answers[0].text));
    answersList[0].add(new RadioModel(
        _getRadioValue(0, questions[questionId].answers[1], currentUserChoice),
        'B',
        questions[questionId].answers[1].text));
    answersList[0].add(new RadioModel(
        _getRadioValue(0, questions[questionId].answers[2], currentUserChoice),
        'C',
        questions[questionId].answers[2].text));
    answersList[0].add(new RadioModel(
        _getRadioValue(0, questions[questionId].answers[3], currentUserChoice),
        'D',
        questions[questionId].answers[3].text));

    answersList[1].add(new RadioModel(
        _getRadioValue(1, questions[questionId].answers[0], currentUserChoice),
        'A',
        questions[questionId].answers[0].text));
    answersList[1].add(new RadioModel(
        _getRadioValue(1, questions[questionId].answers[1], currentUserChoice),
        'B',
        questions[questionId].answers[1].text));
    answersList[1].add(new RadioModel(
        _getRadioValue(1, questions[questionId].answers[2], currentUserChoice),
        'C',
        questions[questionId].answers[2].text));
    answersList[1].add(new RadioModel(
        _getRadioValue(1, questions[questionId].answers[3], currentUserChoice),
        'D',
        questions[questionId].answers[3].text));
  }

  static _getRadioValue(
      int answerListOrder, Answer answer, UserChoice currentUserChoice) {
    if (currentUserChoice == null) return false;

    if (answerListOrder == 0) {
      return answer.type == currentUserChoice.userAnswer.likeMost;
    } else {
      return answer.type == currentUserChoice.userAnswer.likeLeast;
    }
  }

  static setQuestionSentencesList(
      List<String> questionSentencesList, int questionId) {
    questionSentencesList.add(questions[questionId].prefixQuestion +
        ' most ' +
        questions[questionId].suffixWords);

    questionSentencesList.add(questions[questionId].prefixQuestion +
        ' least ' +
        questions[questionId].suffixWords);
  }

  static Size getDeviceSize(BuildContext context) {
    return MediaQuery.of(context).size;
  }

  static bool isIpad() {
    return deviceSize.width > 700 &&
        deviceSize.width / deviceSize.height > 0.65;
  }

  static double ipadIconSize() {
    return deviceSize.width / 15;
  }

  static double ipadFontSize() {
    return deviceSize.width / 30;
  }

  static List<ColorModel> getGameColors() {
    return [
      ColorModel.getColor(35, 52, 200, 'blue'),
      ColorModel.getColor(220, 180, 2, 'yellow'),
      ColorModel.getColor(200, 50, 100, 'pink'),
      ColorModel.getColor(30, 150, 23, 'green'),
      ColorModel.getColor(150, 23, 180, 'purple'),
      ColorModel.getColor(200, 30, 10, 'red'),
    ];
  }
}

backToHomeScreen(BuildContext context) {
  Helpers.tapButtonSound();
  Navigator.of(context).popUntil(ModalRoute.withName('/home'));
}
