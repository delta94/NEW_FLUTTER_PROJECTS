import 'package:flutter/material.dart';

import 'Ads.dart';

void main() => runApp(MaterialApp(
      debugShowCheckedModeBanner: false,
      home: App(),
    ));

class App extends StatefulWidget {
  AppState createState() => AppState();
}

class AppState extends State<App> with SingleTickerProviderStateMixin {
  @override
  initState() {
    Ads.showBannerAd();
    Ads.showInterstitialAd();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Container();
  }

  @override
  void dispose() {
    super.dispose();
  }
}
