import 'package:flutter/widgets.dart';
import 'package:seab1ird.disctest/models/PercentType.dart';
import 'package:seab1ird.disctest/models/Types.dart';
import 'package:seab1ird.disctest/models/UserAnswer.dart';
import 'package:seab1ird.disctest/models/UserChoice.dart';
import 'package:shared_preferences/shared_preferences.dart';

import 'data/Questions.dart';
import 'helpers/Helpers.dart';
import 'models/PercentTypes.dart';

class QuestionProvider extends ChangeNotifier {
  List<UserChoice> userChoices = new List<UserChoice>();
  PercentTypes percentTypes;
  double maxPercent = 0;
  PercentType maxPercentType;
  String themeColorName;

  init() {
    getThemeFromShareReference();
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

  getThemeFromShareReference() async {
    SharedPreferences prefs = await SharedPreferences.getInstance();
    String savedThemeColorName = prefs.getString('themeColorName');
    savedThemeColorName =
        savedThemeColorName ?? Helpers.getGameColors()[0].colorName;

    themeColorName = savedThemeColorName;
  }

  setThemeColorName(String colorName) async {
    var _prefs = await SharedPreferences.getInstance();
    _prefs.setString('themeColorName', '$colorName');
    themeColorName = colorName;
    notifyListeners();
  }
}
