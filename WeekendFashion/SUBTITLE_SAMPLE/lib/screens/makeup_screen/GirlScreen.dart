import 'package:adsunity/adsunity.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/widgets.dart';

class UnityScreen extends StatefulWidget {
  UnityScreen({Key key}) : super(key: key);
  @override
  UnityScreenState createState() => UnityScreenState();
}

class UnityScreenState<T extends UnityScreen> extends State<T>
    with TickerProviderStateMixin, UnityAdsListener {
  @override
  void initState() {
    UnityAds.initialize('3744629', '', this, testMode: !kReleaseMode);
    super.initState();
  }

  void showAd() {
    UnityAds.show('video');
  }

  @override
  Widget build(BuildContext context) {
    throw UnimplementedError();
  }

  @override
  void onUnityAdsError(UnityAdsError error, String message) {}

  @override
  void onUnityAdsFinish(String placementId, FinishState result) {}

  @override
  void onUnityAdsReady(placementId) {}

  @override
  void onUnityAdsStart(placementId) {}
}
