import 'package:flutter/widgets.dart';

import 'MyStartApp.dart';

const String testDevice = 'YOUR_DEVICE_ID';

class AdHelpers {
  static double marginTopForAdmobBanner = 0;

  static bool isReleaseMode() {
    return true; // TODO
    // return kReleaseMode;
  }

  static double getMarginTop(bool needShowSecondBanner) {
    if (needShowSecondBanner) return 0;
    return 60;
  }

  static Widget getBannerAd() {
    return Visibility(
      visible: isReleaseMode(),
      child: AdBanner(),
    );
  }

  static void showStartAppInter() async {
    await MyStartApp.showInterstitialAd();
  }

  static void showInterAd() {
    if (!isReleaseMode()) return;

    showStartAppInter();
  }
}
