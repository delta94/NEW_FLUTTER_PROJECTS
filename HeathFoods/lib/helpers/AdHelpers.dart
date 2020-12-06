import 'package:adcolony/adcolony.dart';
import 'package:adsunity/adsunity.dart';
import 'package:firebase_admob/firebase_admob.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/widgets.dart';
import 'package:seabird.goutfood/AppProvider.dart';
import 'package:startapp/startapp.dart';

const String ADMOB_APP_ID = 'ca-app-pub-8790092287859946~8656132912';
const String ADCOLONY_APP_ID = 'appda22e3137d61401f98';

const String ADMOB_BANNER_ID = 'ca-app-pub-8790092287859946/5515459092';
const String ADCOLONY_BANNER_ID = 'vz86a1d78e260d47c38c';

const String ADMOB_INTERSTITIAL_ID = 'ca-app-pub-8790092287859946/2090724561';
const String UNITY_INTERSTITIAL_ID = '3916601';
const String ADCOLONY_INTERSTITIAL_ID = 'vz245fd4f7bcad4c4394';

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
      child: AdBanner(),
    );
  }

  static void showBanner(AppProvider appProvider) {
    if (AdHelpers.isReleaseMode()) {
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

  static void showIronInter() async {
    await StartApp.showInterstitialAd();
  }

  static void showInterAd() {
    if (!isReleaseMode()) return;

    // ADMOB
    InterstitialAd(
        adUnitId: ADMOB_INTERSTITIAL_ID,
        targetingInfo: AdHelpers.targetingInfo,
        listener: (MobileAdEvent event) {
          if (event == MobileAdEvent.failedToLoad) showIronInter();
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
