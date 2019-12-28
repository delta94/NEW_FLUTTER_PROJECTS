
import 'package:firebase_admob/firebase_admob.dart';

const String APP_ID = "ca-app-pub-6420987903580707~5901331277";

const String BANNER_ID = "ca-app-pub-6420987903580707/9273600076";
const String BANNER1_ID = "ca-app-pub-6420987903580707/4121345742";
const String BANNER2_ID = "ca-app-pub-6420987903580707/9182100731";
const String BANNER3_ID = "ca-app-pub-6420987903580707/8192306908";
const String INTERSTITIAL_ID = "ca-app-pub-6420987903580707/6424075451";
const String REWARDED_ID = "ca-app-pub-6420987903580707/8669769304";
const String testDevice = 'YOUR_DEVICE_ID';

class Ads {
  static BannerAd _bannerAd;
  static BannerAd _banner1Ad;
  static BannerAd _banner2Ad;
  static BannerAd _banner3Ad;
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
    );
  }

  static BannerAd _createBanner1Ad() {
    return BannerAd(
      adUnitId: BANNER1_ID,
      size: AdSize.banner,
      targetingInfo: targetingInfo,
    );
  }

  static BannerAd _createBanner2Ad() {
    return BannerAd(
      adUnitId: BANNER2_ID,
      size: AdSize.banner,
      targetingInfo: targetingInfo,
    );
  }

  static BannerAd _createBanner3Ad() {
    return BannerAd(
      adUnitId: BANNER3_ID,
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

  // SHOW/HIDE BANNER
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

  // SHOW/HIDE BANNER 1
  static void showBanner1Ad() {
    if (_banner1Ad == null) _banner1Ad = _createBanner1Ad();
    _banner1Ad
      ..load()
      ..show(anchorOffset: 85.0, anchorType: AnchorType.top, );
  }

  static void hideBanner1Ad() async {
    if(_banner1Ad != null){
      await _banner1Ad.dispose();
      _banner1Ad = null;
    }
  }

  // SHOW/HIDE BANNER 2
  static void showBanner2Ad() {
    if (_banner2Ad == null) _banner2Ad = _createBanner2Ad();
    _banner2Ad
      ..load()
      ..show(anchorOffset: 85.0, anchorType: AnchorType.top, );
  }

  static void hideBanner2Ad() async {
    if(_banner2Ad != null){
      await _banner2Ad.dispose();
      _banner2Ad = null;
    }
  }

  // SHOW/HIDE BANNER 3
  static void showBanner3Ad() {
    if (_banner3Ad == null) _banner3Ad = _createBanner3Ad();
    _banner3Ad
      ..load()
      ..show(anchorOffset: 85.0, anchorType: AnchorType.top, );
  }

  static void hideBanner3Ad() async {
    if(_banner3Ad != null){
      await _banner3Ad.dispose();
      _banner3Ad = null;
    }
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

  // SHOW/HIDE REWARED VIDEO
  static void showRewaredVideoAd(){
    RewardedVideoAd.instance.load(adUnitId: REWARDED_ID, targetingInfo: targetingInfo);
      RewardedVideoAd.instance.listener = (RewardedVideoAdEvent event, {String rewardType, int rewardAmount}) {
        if (event == RewardedVideoAdEvent.loaded) {
          RewardedVideoAd.instance.show();
        }
      };
  }

}
