import 'package:flutter/widgets.dart';
import 'package:seab1ird.disctest/helpers/Utils.dart';
import 'package:shared_preferences/shared_preferences.dart';

class QuestionProvider extends ChangeNotifier {
  String themeColorName;

  init() {
    getThemeFromShareReference();
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
}
