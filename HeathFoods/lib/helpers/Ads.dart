import 'package:firebase_admob/firebase_admob.dart';
import 'package:flutter/foundation.dart';

const String APP_ID = 'ca-app-pub-8790092287859946~8656132912';

const String BANNER_ID = 'ca-app-pub-8790092287859946/5515459092';
const String INTERSTITIAL_ID = 'ca-app-pub-8790092287859946/2090724561';
const String testDevice = 'YOUR_DEVICE_ID';

class Ads {
  static BannerAd _bannerAd;
  static InterstitialAd _interstitialAd;

  static void initialize() {
    FirebaseAdMob.instance.initialize(appId: APP_ID);
  }

  static bool isReleaseMode() {
    return kReleaseMode;
  }

  static const MobileAdTargetingInfo targetingInfo = MobileAdTargetingInfo(
    testDevices: testDevice != null ? <String>[testDevice] : null,
  );

  static BannerAd _createBannerAd() {
    return BannerAd(
      adUnitId: BANNER_ID,
      size: AdSize.banner,
      targetingInfo: targetingInfo,
    );
  }

  static void showBannerAd() {
    if (_bannerAd == null) _bannerAd = _createBannerAd();
    _bannerAd
      ..load()
      ..show(
        anchorOffset: 110.0,
        anchorType: AnchorType.top,
      );
  }

  static void hideBannerAd() async {
    if (_bannerAd != null) {
      await _bannerAd.dispose();
      _bannerAd = null;
    }
  }

  static void createInterstitial() {
    _interstitialAd = InterstitialAd(
      adUnitId: INTERSTITIAL_ID,
      targetingInfo: targetingInfo,
    )..load();
  }

  // SHOW/HIDE INTERSTITIAL
  static void showInterstitialAd() {
    _interstitialAd..show();
  }

  static void hideInterstitialAd() async {
    await _interstitialAd.dispose();
    if (_interstitialAd != null) {
      _interstitialAd = null;
    }
  }
}
