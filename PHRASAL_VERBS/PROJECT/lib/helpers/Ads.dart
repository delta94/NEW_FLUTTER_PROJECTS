import 'package:firebase_admob/firebase_admob.dart';

const String APP_ID = "ca-app-pub-1111111111111111~1111111111";

const String BANNER_ID = "ca-app-pub-1111111111111111/1111111111";
const String INTERSTITIAL_ID = "ca-app-pub-1111111111111111/1111111111";
const String testDevice = 'YOUR_DEVICE_ID';

class Ads {
  static BannerAd _bannerAd;
  static InterstitialAd _interstitialAd;
  static bool showedInterstitialAd = false;

  static void initialize() {
    FirebaseAdMob.instance.initialize(appId: APP_ID);
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

  static InterstitialAd _createInterstitial() {
    return InterstitialAd(
      adUnitId: INTERSTITIAL_ID,
      targetingInfo: targetingInfo,
    );
  }

  static void showBannerAd() {
    if (_bannerAd == null) _bannerAd = _createBannerAd();
    _bannerAd
      ..load()
      ..show(
        anchorOffset: 85.0,
        anchorType: AnchorType.top,
      );
  }

  static void hideBannerAd() async {
    if (_bannerAd != null) {
      await _bannerAd.dispose();
      _bannerAd = null;
    }
  }

  static void loadInterstitialAd() {
    if(showedInterstitialAd){
      if (_interstitialAd == null) _interstitialAd = _createInterstitial();
      _interstitialAd..load();
      showedInterstitialAd = false;
    }
  }

  static void showInterstitialAd() {
    showedInterstitialAd = true;
    _interstitialAd..show();
  }

  static void hideInterstitialAd() async {
    await _interstitialAd.dispose();
    if (_interstitialAd != null) {
      _interstitialAd = null;
    }
  }
}
