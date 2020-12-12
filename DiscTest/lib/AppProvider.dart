import 'dart:async';

import 'package:flutter/widgets.dart';
import 'package:seabird.disctest/models/PercentType.dart';
import 'package:seabird.disctest/models/Types.dart';
import 'package:seabird.disctest/models/UserAnswer.dart';
import 'package:seabird.disctest/models/UserChoice.dart';
import 'package:shared_preferences/shared_preferences.dart';

import 'data/Questions.dart';
import 'models/PercentTypes.dart';
import 'models/RadioModel.dart';

class AppProvider extends ChangeNotifier {
  List<UserChoice> userChoices = new List<UserChoice>();
  PercentTypes percentTypes;
  double maxPercent = 0;
  PercentType maxPercentType;
  bool isFirstUse = true;

  // Current state
  bool needFirstQuestionHighLight = false;
  bool needSecondQuestionHighLight = false;

  List<List<RadioModel>> radioModelsList = new List<List<RadioModel>>();

  init() async {
    var prefs = await SharedPreferences.getInstance();
    isFirstUse = prefs.getBool('isFirstUse') ?? true;
  }

  setHighlightQuestions(bool needFirstHighLight, bool needSecondHighLight) {
    needFirstQuestionHighLight = needFirstHighLight;
    needSecondQuestionHighLight = needSecondHighLight;

    notifyListeners();

    Timer(const Duration(milliseconds: 300), () {
      needFirstQuestionHighLight = false;
      needSecondQuestionHighLight = false;

      notifyListeners();
    });
  }

  void setFirstUseToFalse() async {
    var _prefs = await SharedPreferences.getInstance();
    await _prefs.setBool('isFirstUse', false);
  }

  updateUserChoice(int questionId, Types likeMost, Types likeLeast) {
    bool isUserChoiceExisting = false;
    for (var i = 0; i < userChoices.length; i++) {
      if (userChoices[i].questionId == questionId) {
        isUserChoiceExisting = true;
        userChoices[i].userAnswer.likeMost = likeMost;
        userChoices[i].userAnswer.likeLeast = likeLeast;
      }
    }

    if (!isUserChoiceExisting) {
      UserChoice userChoice =
          new UserChoice(questionId, new UserAnswer(likeMost, likeLeast));
      userChoices.add(userChoice);
    }

    notifyListeners();
  }

  getCurrentUserAnswersByQuestionId(int questionId) {
    UserChoice currentUserChoice = userChoices.firstWhere(
        (item) => item.questionId == questionId,
        orElse: () => null);
    return currentUserChoice;
  }

  getTypePercents() {
    return new PercentTypes(
        new PercentType(Types.D, _getTotalType(Types.D)),
        new PercentType(Types.I, _getTotalType(Types.I)),
        new PercentType(Types.S, _getTotalType(Types.S)),
        new PercentType(Types.C, _getTotalType(Types.C)));
  }

  _getTotalType(Types type) {
    double percent = userChoices
            .where((userChoice) => userChoice.userAnswer.likeMost == type)
            .toList()
            .length /
        questions.length *
        10;

    if (percent >= maxPercent) {
      maxPercent = percent;
      maxPercentType = new PercentType(type, maxPercent);
    }

    return percent;
  }

  updateAnswer(int questionOrder, int answerId) {
    radioModelsList[questionOrder][answerId].isSelected = false;
    if (questionOrder == 0) {
      needFirstQuestionHighLight = true;
    } else {
      needSecondQuestionHighLight = true;
    }

    new Timer(const Duration(milliseconds: 300), () {
      if (questionOrder == 0) {
        needFirstQuestionHighLight = false;
      } else {
        needSecondQuestionHighLight = false;
      }

      notifyListeners();
    });

    notifyListeners();
  }
}
