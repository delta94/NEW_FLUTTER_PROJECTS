import 'package:firebase_admob/firebase_admob.dart';
import 'package:flutter/widgets.dart';
import 'package:seabird.biometry/AppProvider.dart';
import 'package:startapp/startapp.dart';

const String ADMOB_APP_ID = "ca-app-pub-8790092287859946~9130610364";

const String ADMOB_BANNER_ID = "ca-app-pub-8790092287859946/3914437546";
const String ADMOB_INTERSTITIAL_ID = "ca-app-pub-8790092287859946/2601355877";

const String testDevice = 'YOUR_DEVICE_ID';

class AdHelpers {
  static double marginTopForAdmobBanner = 0;

  static void initialize() async {
    FirebaseAdMob.instance.initialize(appId: ADMOB_APP_ID);
  }

  static bool isReleaseMode() {
    return true; // TODO
    // return kReleaseMode;
  }

  static const MobileAdTargetingInfo targetingInfo = MobileAdTargetingInfo(
    testDevices: testDevice != null ? <String>[testDevice] : null,
  );

  static bool isAdmobBannerLoaded(MobileAdEvent mobileAdEvent) {
    if (mobileAdEvent == MobileAdEvent.failedToLoad) return false;
    return true;
  }

  static double getMarginTop(bool needShowSecondBanner) {
    if (needShowSecondBanner) return 0;
    return 60;
  }

  static Widget getBannerAd(bool needShowSecondBanner) {
    // return Visibility(
    //   visible: needShowSecondBanner && isReleaseMode(),
    //   child: AdBanner(),
    // );

    return Container(height: 20);
  }

  static showBanner(AppProvider appProvider) {
    if (AdHelpers.isReleaseMode()) {
      // ADMOB
      BannerAd(
        adUnitId: ADMOB_BANNER_ID,
        size: AdSize.banner,
        targetingInfo: AdHelpers.targetingInfo,
        listener: (MobileAdEvent event) => appProvider.updateAdState(event),
      )
        ..load()
        ..show();
    }
  }

  static void showIronInter() async {
    await StartApp.showInterstitialAd();
  }

  static void showInterAd() {
    if (!isReleaseMode()) return;

    // ADMOB
    InterstitialAd(
        adUnitId: ADMOB_INTERSTITIAL_ID,
        targetingInfo: AdHelpers.targetingInfo,
        listener: (MobileAdEvent event) {
          if (event == MobileAdEvent.failedToLoad) showIronInter();
        })
      ..load()
      ..show();
  }
}
