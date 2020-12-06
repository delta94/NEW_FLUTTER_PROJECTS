import 'package:flutter/material.dart';

import 'package:ironsource/ironsource.dart';

import 'iron.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  final String appKey = "85460dcd";

  bool rewardeVideoAvailable = false,
      showBanner = false,
      interstitialReady = false;

  @override
  void initState() {
    super.initState();
    init();
  }

  void init() async {
    var userId = await IronSource.getAdvertiserId();
    await IronSource.validateIntegration();
    await IronSource.setUserId(userId);
    await IronSource.initialize(appKey: appKey, listener: new IronListener());
    rewardeVideoAvailable = await IronSource.isRewardedVideoAvailable();
    IronSource.loadInterstitial();
    showInterstitial();
  }

  void showInterstitial() async {
    if (await IronSource.isInterstitialReady()) {
      IronSource.showInterstitial();
    } else {
      Future.delayed(Duration(seconds: 3), () => showInterstitial());
    }
  }

  void showRewardedVideo() async {
    if (await IronSource.isRewardedVideoAvailable()) {
      IronSource.showRewardedVideol();
    } else {
      print("RewardedVideo not available");
    }
  }

  void showHideBanner() {
    setState(() {
      showBanner = !showBanner;
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          centerTitle: true,
          title: const Text('IronSource ads demo'),
        ),
        body: Stack(
          children: <Widget>[
            Container(
              padding: EdgeInsets.symmetric(vertical: 50.0),
              alignment: Alignment.center,
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.center,
                children: <Widget>[
                  RaisedButton(
                    child: Text("Show interstitial"),
                    onPressed: interstitialReady ? showInterstitial : null,
                  ),
                  RaisedButton(
                    child: Text("Show Rewarded Video"),
                    onPressed: rewardeVideoAvailable ? showRewardedVideo : null,
                  ),
                  RaisedButton(
                    child: Text(showBanner ? "hide banner" : "Show Banner"),
                    onPressed: showHideBanner,
                  ),
                ],
              ),
            ),
// Banner ad
            showBanner
                ? Align(
                    alignment: Alignment.bottomCenter,
                    child: IronSourceBannerAd(
                        keepAlive: true, listener: BannerAdListener()),
                  )
                : SizedBox()
          ],
        ),
      ),
    );
  }
}
