import 'package:firebase_admob/firebase_admob.dart';
import 'package:flutter/widgets.dart';
import 'package:seabi1rd.weekendfashion/helpers/GameProvider.dart';

import 'MyStartApp.dart';

const String ADMOB_APP_ID = "ca-app-pub-8790092287859946~1822449061";

const String ADMOB_INTERSTITIAL_ID = "ca-app-pub-8790092287859946/1583610067";

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

  static void showStartAppInter() async {
    await MyStartApp.showInterstitialAd();
  }

  static void showInterAd({bool needAdmob = true}) {
    if (!isReleaseMode()) return;

    // ADMOB
    if (needAdmob) {
      InterstitialAd(
          adUnitId: ADMOB_INTERSTITIAL_ID,
          targetingInfo: AdHelpers.targetingInfo,
          listener: (MobileAdEvent event) {
            if (event == MobileAdEvent.failedToLoad) showStartAppInter();
          })
        ..load()
        ..show();
    } else {
      showStartAppInter();
    }
  }
}
