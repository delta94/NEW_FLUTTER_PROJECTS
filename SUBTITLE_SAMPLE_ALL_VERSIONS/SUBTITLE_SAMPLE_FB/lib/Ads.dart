import 'package:firebase_admob/firebase_admob.dart';
import 'Input.dart';

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

  static InterstitialAd createInterstitial() {
    return InterstitialAd(
      adUnitId: INTERSTITIAL_ID,
      targetingInfo: targetingInfo,
    );
  }

  static void showBannerAd() {
    if (_bannerAd == null) _bannerAd = _createBannerAd();
    _bannerAd
      ..load()
      ..show(anchorOffset: 85.0, anchorType: AnchorType.top, );
  }

  static void hideBannerAd() async {
    if(_bannerAd != null){
      await _bannerAd.dispose();
      _bannerAd = null;
    }
  }

  static void showInterstitialAd() {
    _interstitialAd = createInterstitial();
    _interstitialAd
      ..load()
      ..show();
  }

  static void hideInterstitialAd() async {
    await _interstitialAd.dispose();
    if(_interstitialAd != null){
      _interstitialAd = null;
    }
  }
}
