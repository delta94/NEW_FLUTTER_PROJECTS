import 'package:adcolony/adcolony.dart';
import 'package:adcolony/banner.dart';
import 'package:adsunity/adsunity.dart';
import 'package:firebase_admob/firebase_admob.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/widgets.dart';
import 'package:seabird.disctest/AppProvider.dart';

const String ADMOB_APP_ID = "ca-app-pub-8790092287859946~7642266938";
const String ADCOLONY_APP_ID = "appd024006b595e4cce80";

const String ADMOB_BANNER_ID = "ca-app-pub-8790092287859946/9071108107";
const String ADCOLONY_BANNER_ID = "vz6dbdd6d18fca4d19b8";

const String ADMOB_INTERSTITIAL_ID = "ca-app-pub-8790092287859946/4647892761";
const String UNITY_INTERSTITIAL_ID = "3744629";
const String ADCOLONY_INTERSTITIAL_ID = "vz3b19bef410df4f7683";

const String testDevice = 'YOUR_DEVICE_ID';

class AdHelpers {
  static double marginTopForAdmobBanner = 0;
  static void initialize() {
    FirebaseAdMob.instance.initialize(appId: ADMOB_APP_ID);
  }

  static bool isReleaseMode() {
    // return true; // TODO
    return kReleaseMode;
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

  static Widget showBannerAd(bool needShowSecondBanner) {
    return Visibility(
      visible: needShowSecondBanner && isReleaseMode(),
      child: BannerView(
          (AdColonyAdListener event) => print('============================='),
          BannerSizes.banner,
          ADCOLONY_BANNER_ID),
    );
  }

  static showBanner(AppProvider appProvider) {
    if (AdHelpers.isReleaseMode()) {
      // ADCOLONY
      AdColony.init(
          AdColonyOptions(ADCOLONY_APP_ID, '0', [ADCOLONY_BANNER_ID]));

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

  static void showInterAd() {
    if (!isReleaseMode()) return;

    // ADMOB
    InterstitialAd(
        adUnitId: ADMOB_INTERSTITIAL_ID,
        targetingInfo: AdHelpers.targetingInfo,
        listener: (MobileAdEvent event) {
          if (event == MobileAdEvent.failedToLoad) {
            // UNITY
            UnityAds.initialize(UNITY_INTERSTITIAL_ID, '', UnityListener(),
                testMode: !kReleaseMode);
            Future.delayed(Duration(seconds: 5), () => UnityAds.show('video'));
          }
        })
      ..load()
      ..show();
  }
}

class UnityListener extends UnityAdsListener {
  UnityListener();

  // ADCOLONY
  @override
  void onUnityAdsError(UnityAdsError error, String message) {
    AdColony.request(ADCOLONY_INTERSTITIAL_ID, (AdColonyAdListener event) {
      if (event == AdColonyAdListener.onRequestFilled) AdColony.show();
    });
  }

  @override
  void onUnityAdsFinish(String placementId, FinishState result) {}

  @override
  void onUnityAdsReady(placementId) {}

  @override
  void onUnityAdsStart(placementId) {}
}
