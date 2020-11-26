import 'package:assets_audio_player/assets_audio_player.dart';
import 'package:flutter/material.dart';
import 'package:seabird.disctest/data/Questions.dart';
import 'package:seabird.disctest/models/Answer.dart';
import 'package:seabird.disctest/models/RadioModel.dart';
import 'package:seabird.disctest/models/UserChoice.dart';
import '../AppProvider.dart';

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

  static getQuestionNumber(int id) {
    return (id + 1);
  }

  static setAnswersList(List<List<RadioModel>> answersList, int questionId,
      AppProvider appProvider) {
    answersList.add(new List<RadioModel>());
    answersList.add(new List<RadioModel>());

    UserChoice currUserChoice =
        appProvider.getCurrentUserAnswersByQuestionId(questionId);

    answersList[0].add(new RadioModel(
        _getRadioValue(0, questions[questionId].answers[0], currUserChoice),
        'A',
        questions[questionId].answers[0].text));
    answersList[0].add(new RadioModel(
        _getRadioValue(0, questions[questionId].answers[1], currUserChoice),
        'B',
        questions[questionId].answers[1].text));
    answersList[0].add(new RadioModel(
        _getRadioValue(0, questions[questionId].answers[2], currUserChoice),
        'C',
        questions[questionId].answers[2].text));
    answersList[0].add(new RadioModel(
        _getRadioValue(0, questions[questionId].answers[3], currUserChoice),
        'D',
        questions[questionId].answers[3].text));

    answersList[1].add(new RadioModel(
        _getRadioValue(1, questions[questionId].answers[0], currUserChoice),
        'A',
        questions[questionId].answers[0].text));
    answersList[1].add(new RadioModel(
        _getRadioValue(1, questions[questionId].answers[1], currUserChoice),
        'B',
        questions[questionId].answers[1].text));
    answersList[1].add(new RadioModel(
        _getRadioValue(1, questions[questionId].answers[2], currUserChoice),
        'C',
        questions[questionId].answers[2].text));
    answersList[1].add(new RadioModel(
        _getRadioValue(1, questions[questionId].answers[3], currUserChoice),
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
}

backToHomeScreen(BuildContext context) {
  // Ads.createInterstitial();
  Helpers.tapButtonSound();
  Navigator.of(context).popUntil(ModalRoute.withName('/home'));
}
