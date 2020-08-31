import 'package:firebase_admob/firebase_admob.dart';

const String APP_ID = "ca-app-pub-6420987903580707~4647663856";


const String BANNER_ID = "ca-app-pub-6420987903580707/4456092168";
const String INTERSTITIAL_ID = "ca-app-pub-6420987903580707/8203765480";
const String testDevice = 'YOUR_DEVICE_ID';

class Ads {
  static bool kReleaseMode = true;
  static BannerAd _bannerAd;
  static InterstitialAd _interstitialAd;

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
      // listener: (MobileAdEvent event) {
      //   print("--------------->BannerAd event is $event");
      // },
    );
  }

  static InterstitialAd _createInterstitial() {
    return InterstitialAd(
      adUnitId: INTERSTITIAL_ID,
      targetingInfo: targetingInfo,
      // listener: (MobileAdEvent event) {
      //   print("----------------> Inter event is $event");
      // },
    );
  }

  // SHOW/HIDE BANNER
  static void showBannerAd() {
    if (_bannerAd == null) _bannerAd = _createBannerAd();
    _bannerAd
      ..load()
      ..show(anchorOffset: 81.0, anchorType: AnchorType.top, );
  }

  static void hideBannerAd() async {
    await _bannerAd.dispose();
    _bannerAd = null;
  }

  // SHOW/HIDE INTERSTITIAL
  static void showInterstitialAd() {
    if (_interstitialAd == null) _interstitialAd = _createInterstitial();
    _interstitialAd
      ..load()
      ..show();
  }

  static void hideInterstitialAd() async {
    await _interstitialAd.dispose();
    _interstitialAd = null;
  }

}
