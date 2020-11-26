import 'package:firebase_admob/firebase_admob.dart';

const String APP_ID = "ca-app-pub-8790092287859946~7642266938";

const String BANNER_ID = "ca-app-pub-8790092287859946/9071108107";
const String INTERSTITIAL_ID = "";
const String testDevice = 'YOUR_DEVICE_ID';

class Ads {
  static BannerAd _bannerAd;
  static InterstitialAd _interstitialAd;

  static void initialize() {
    FirebaseAdMob.instance.initialize(appId: APP_ID);
  }

  static bool isReleaseMode() {
    // return kReleaseMode;
    return false;
  }

  static const MobileAdTargetingInfo targetingInfo = MobileAdTargetingInfo(
    testDevices: testDevice != null ? <String>[testDevice] : null,
  );

  static BannerAd _createBannerAd() {
    // return BannerAd(
    //   adUnitId: BANNER_ID,
    //   size: AdSize.banner,
    //   targetingInfo: targetingInfo,
    // );
  }

  static InterstitialAd _createInterstitial() {
    // return InterstitialAd(
    //   adUnitId: INTERSTITIAL_ID,
    //   targetingInfo: targetingInfo,
    // );
  }

  static void showBannerAd() {
    // if (_bannerAd == null) _bannerAd = _createBannerAd();
    // _bannerAd
    //   ..load()
    //   ..show(
    //     anchorOffset: 110.0,
    //     anchorType: AnchorType.top,
    //   );
  }

  static void hideBannerAd() async {
    // if (_bannerAd != null) {
    //   await _bannerAd.dispose();
    //   _bannerAd = null;
    // }
  }

  static InterstitialAd createInterstitial() {
    // return InterstitialAd(
    //   adUnitId: INTERSTITIAL_ID,
    //   targetingInfo: targetingInfo,
    // );
  }

  // SHOW/HIDE INTERSTITIAL
  static void showInterstitialAd() {
    // _interstitialAd = createInterstitial();
    // _interstitialAd
    //   ..load()
    //   ..show();
  }

  static void hideInterstitialAd() async {
    // await _interstitialAd.dispose();
    // if (_interstitialAd != null) {
    //   _interstitialAd = null;
    // }
  }
}
