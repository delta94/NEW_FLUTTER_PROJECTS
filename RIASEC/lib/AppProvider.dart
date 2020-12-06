import 'package:firebase_admob/firebase_admob.dart';
import 'package:flutter/widgets.dart';
import 'package:seabird.riasectest/models/PercentType.dart';
import 'package:seabird.riasectest/models/Types.dart';
import 'package:seabird.riasectest/utils/Utils.dart';
import 'package:shared_preferences/shared_preferences.dart';

import 'data/Questions.dart';
import 'helpers/AdHelpers.dart';
import 'models/PercentTypes.dart';
import 'models/Question.dart';

class AppProvider extends ChangeNotifier {
  PercentTypes percentTypes;
  double maxPercent = 0;
  PercentType maxPercentType;
  String themeColorName;
  bool isFirstUse = true;
  bool admobLoaded = true;

  init() async {
    var prefs = await SharedPreferences.getInstance();
    isFirstUse = prefs.getBool('isFirstUse') ?? true;
    getThemeFromShareReference();
  }

  void setIsFirstUse() async {
    var _prefs = await SharedPreferences.getInstance();
    await _prefs.setBool('isFirstUse', false);
  }

  updateUserChoice(int id, bool checked) {
    bool isUserChoiceExisting = false;
    for (var i = 0; i < questions.length; i++) {
      if (questions[i].id == id) {
        isUserChoiceExisting = true;
        questions[i].checked = checked;
      }
    }

    if (!isUserChoiceExisting) {
      questions.add(Question(id: id, checked: checked));
    }

    notifyListeners();
  }

  getCurrentUserAnswersByQuestionId(int id) {
    Question currentUserChoice =
        questions.firstWhere((item) => item.id == id, orElse: () => null);
    return currentUserChoice;
  }

  getTypePercents() {
    return new PercentTypes(
      new PercentType(Types.R, _getTotalType(Types.R)),
      new PercentType(Types.I, _getTotalType(Types.I)),
      new PercentType(Types.A, _getTotalType(Types.A)),
      new PercentType(Types.S, _getTotalType(Types.S)),
      new PercentType(Types.E, _getTotalType(Types.E)),
      new PercentType(Types.C, _getTotalType(Types.C)),
    );
  }

  _getTotalType(Types type) {
    int totalCheckedItems =
        questions.where((element) => element.checked).toList().length;
    double percent = questions
            .where((question) => question.checked && question.type == type)
            .toList()
            .length /
        totalCheckedItems *
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
        savedThemeColorName ?? Utils.getGameColors()[0].colorName;

    themeColorName = savedThemeColorName;
  }

  setThemeColorName(String colorName) async {
    var _prefs = await SharedPreferences.getInstance();
    _prefs.setString('themeColorName', '$colorName');
    themeColorName = colorName;
    notifyListeners();
  }

  updateAdState(MobileAdEvent mobileAdEvent) {
    admobLoaded = AdHelpers.isAdmobBannerLoaded(mobileAdEvent);
    notifyListeners();
  }
}
