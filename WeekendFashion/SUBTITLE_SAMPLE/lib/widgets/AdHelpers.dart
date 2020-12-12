import 'MyStartApp.dart';

const String ADMOB_APP_ID = "ca-app-pub-8790092287859946~1822449061";

const String ADMOB_INTERSTITIAL_ID = "ca-app-pub-8790092287859946/1583610067";

const String testDevice = 'YOUR_DEVICE_ID';

class AdHelpers {
  static double marginTopForAdmobBanner = 0;

  static bool isReleaseMode() {
    return true; // TODO
    // return kReleaseMode;
  }

  static void showStartAppInter() async {
    await MyStartApp.showInterstitialAd();
  }

  static void showInterAd({bool needAdmob = true}) {
    if (!isReleaseMode()) return;
    showStartAppInter();
  }
}
