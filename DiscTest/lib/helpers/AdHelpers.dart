import 'package:flutter/widgets.dart';
import 'package:seabird.disctest/widgets/MyStartApp.dart';

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

  static void showIronInter() async {
    await MyStartApp.showInterstitialAd();
  }

  static void showInterAd() {
    if (!isReleaseMode()) return;
    showIronInter();
  }
}
