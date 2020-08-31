import 'package:firebase_admob/firebase_admob.dart';

const String APP_ID = "ca-app-pub-6420987903580707~2632766224";

const String BANNER_ID = "ca-app-pub-6420987903580707/6622599239";
const String INTERSTITIAL_ID = "ca-app-pub-6420987903580707/9936541175";

// const String APP_ID = "ca-app-pub-8790092287859946~7642266938";

// const String BANNER_ID = "ca-app-pub-8790092287859946/9071108107";
// const String INTERSTITIAL_ID = "ca-app-pub-6420987903580707/9936541175";

class Ads {
  static BannerAd _bannerAd;
  static InterstitialAd _interstitialAd;

  static void initialize() {
    FirebaseAdMob.instance.initialize(appId: APP_ID);
  }

  static const MobileAdTargetingInfo targetingInfo = MobileAdTargetingInfo(
      //childDirected: true,

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
        anchorOffset: 15,
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
    _interstitialAd = _createInterstitial()..load();
  }

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
