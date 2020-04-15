
import 'package:firebase_admob/firebase_admob.dart';

const String APP_ID = "ca-app-pub-6420987903580707~9575149990";

const String BANNER_ID = "ca-app-pub-6420987903580707/6948986650";
const String INTERSTITIAL_ID = "ca-app-pub-6420987903580707/8956542202";
const String REWARDED_ID = "";
const String testDevice = 'YOUR_DEVICE_ID';

class Ads {
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

  // SHOW/HIDE INTERSTITIAL
  static void loadInterstitialAd() {
    _interstitialAd = InterstitialAd(
      adUnitId: INTERSTITIAL_ID,
      targetingInfo: targetingInfo,
    );
    
    _interstitialAd
      ..load();
  }

  static void showInterstitialAd() {
    _interstitialAd..show();
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
