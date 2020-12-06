import 'package:firebase_admob/firebase_admob.dart';
import 'package:flutter/widgets.dart';
import 'package:shared_preferences/shared_preferences.dart';

import 'helpers/AdHelpers.dart';

class AppProvider extends ChangeNotifier {
  bool isFirstUse = true;
  bool admobLoaded = true;

  Future<void> init() async {
    var prefs = await SharedPreferences.getInstance();
    isFirstUse = prefs.getBool('isFirstUse') ?? true;
  }

  void setFirstUseToFalse() async {
    var _prefs = await SharedPreferences.getInstance();
    await _prefs.setBool('isFirstUse', false);
  }

  updateAdState(MobileAdEvent mobileAdEvent) {
    admobLoaded = AdHelpers.isAdmobBannerLoaded(mobileAdEvent);
    notifyListeners();
  }
}
