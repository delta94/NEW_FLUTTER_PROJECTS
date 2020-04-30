import 'dart:io';
import 'dart:math';
import 'package:flutter/material.dart';
import 'package:seab1ird.showyourself/data/Questions.dart';
import 'package:seab1ird.showyourself/models/Answer.dart';
import 'package:seab1ird.showyourself/models/RadioModel.dart';
import 'package:seab1ird.showyourself/models/UserChoice.dart';
import '../QuestionProvider.dart';
import 'Ads.dart';

class Helpers {
  static Future<bool> onWillPop(BuildContext context) {
    Ads.showInterstitialAd();
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
      color: color != null ? color : Color.fromRGBO(80, 80, 80, 1),
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

}
