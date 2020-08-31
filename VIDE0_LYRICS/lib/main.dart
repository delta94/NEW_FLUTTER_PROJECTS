import 'dart:async';

import 'package:app_review/app_review.dart';
import 'package:chewie/chewie.dart';
import 'package:firebase_admob/firebase_admob.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:video_player/video_player.dart';

import 'Ads.dart';
import 'EndLoopController.dart';
import 'Input.dart';
import 'LoadingScreen.dart';

void main() => runApp(MaterialApp(
      debugShowCheckedModeBanner: false,
      home: App(),
    ));

class App extends StatefulWidget {
  AppState createState() => AppState();
}

class AppState extends State<App> with SingleTickerProviderStateMixin {
  VideoPlayerController _videoPlayerController;
  ChewieController _chewieController;
  bool videoState = false;
  final EndLoopController _loopController = EndLoopController('Untitled', 1.0);
  final EndLoopController _loopController2 = EndLoopController('Untitled', 1.0);
  AnimationController animationController;
  double marginTop = 0;
  bool showLoadingPage = true;
  bool mainLoadPause = false;
  String message = ' Lyric:';
  String fbToken;

  @override
  initState() {
    if (kReleaseMode) {
      Ads.showBannerAd();
      marginTop = 60;
    }

    showInterstitialAd();
    hideLoadingPageAuto();
    loadDataForVideo();

    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return _chewieController != null
        ? Stack(
            children: [
              Visibility(
                visible: !showLoadingPage,
                child: Scaffold(
                  appBar: AppBar(
                    title: Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: <Widget>[
                        Container(
                          width: 40,
                          height: 40,
                          child: FlareActor(
                            "images/song_icon.flr",
                            alignment: Alignment.center,
                            controller: _loopController,
                          ),
                        ),
                        Flexible(
                          fit: FlexFit.loose,
                          child: Text(
                            TITLE,
                            overflow: TextOverflow.fade,
                            style: TextStyle(
                              color: Colors.yellowAccent,
                              fontWeight: FontWeight.bold,
                              decoration: TextDecoration.underline,
                              decorationColor: Colors.red,
                              decorationStyle: TextDecorationStyle.solid,
                              shadows: [
                                Shadow(
                                  color: Colors.greenAccent,
                                  blurRadius: 10.0,
                                  offset: Offset(5.0, 5.0),
                                ),
                              ],
                            ),
                          ),
                        ),
                        GestureDetector(
                          child: Image.asset('images/star.png',
                              height: 35, width: 35),
                          onTap: () {
                            AppReview.storeListing.then((onValue) {});
                          },
                        )
                      ],
                    ),
                    backgroundColor: Colors.black54,
                  ),
                  body: new Stack(
                    children: <Widget>[
                      Opacity(
                        opacity: 1,
                        child: Container(
                          decoration: new BoxDecoration(
                            image: new DecorationImage(
                              image: new AssetImage('images/bg.png'),
                              fit: BoxFit.fill,
                            ),
                          ),
                        ),
                      ),
                      Container(
                        child: Column(children: <Widget>[
                          Container(
                            margin: EdgeInsets.only(top: marginTop),
                            color: Colors.black,
                            child: Chewie(
                              controller: _chewieController,
                            ),
                          ),
                          Container(
                            color: Colors.black54,
                            padding: EdgeInsets.only(top: 5, bottom: 5),
                            child: Row(
                              mainAxisAlignment: MainAxisAlignment.center,
                              children: <Widget>[
                                Container(
                                    width: 20,
                                    height: 20,
                                    child: FlareActor(
                                      "images/lyric_icon.flr",
                                      alignment: Alignment.center,
                                      controller: _loopController2,
                                    )),
                                Text(
                                  message,
                                  style: TextStyle(
                                      color: Colors.pink[300],
                                      fontWeight: FontWeight.bold,
                                      fontSize: 20),
                                ),
                              ],
                            ),
                          ),
                          Divider(
                            color: Colors.yellowAccent,
                            height: 0,
                            thickness: 0.5,
                          ),
                          Expanded(
                            child: Container(
                              child: Scrollbar(
                                child: ListView(children: <Widget>[
                                  Row(
                                    mainAxisAlignment: MainAxisAlignment.center,
                                    children: <Widget>[
                                      Flexible(
                                        child: Text(
                                          LYRIC,
                                          textAlign: TextAlign.center,
                                          style: TextStyle(
                                              color: Colors.yellow,
                                              fontWeight: FontWeight.bold,
                                              backgroundColor: Colors.black38),
                                        ),
                                      ),
                                    ],
                                  )
                                ]),
                              ),
                            ),
                          ),
                        ]),
                      ),
                    ],
                  ),
                ),
              ),
              Visibility(visible: showLoadingPage, child: LoadingScreen())
            ],
          )
        : Container();
  }

  void loadDataForVideo() async {
    animationController =
        AnimationController(vsync: this, duration: Duration(milliseconds: 500));
    setState(() {
      _videoPlayerController = VideoPlayerController.asset('images/LetItGo.mp4'
          )
        ..addListener(() {
          final bool videoState = _videoPlayerController.value.isPlaying;
          if (this.videoState != videoState) {
            if (this.videoState) {
              mainLoadPause = true;
              if (mainLoadPause) {
                mainLoadPause = false;
                Ads.showInterstitialAd();
              }
            }
            this.videoState = videoState;
          }
        });
    });

    // Wrapper on top of the videoPlayerController
    _chewieController = ChewieController(
      videoPlayerController: _videoPlayerController,
      aspectRatio: 16 / 9,
      // Prepare the video to be played and display the first frame
      autoInitialize: true,
      looping: true,
      allowMuting: true,
      // Errors can occur for example when trying to play a video
      // from a non-existent URL
      errorBuilder: (context, errorMessage) {
        return Center(
          child: Text(
            errorMessage,
            style: TextStyle(color: Colors.white),
          ),
        );
      },
    )..addListener(() {
        if (_chewieController.isFullScreen == true) {
          Ads.hideBannerAd();
        } else {
          Ads.showBannerAd();
        }
      });
  }

  void hideLoadingPageAuto() {
    new Timer(Duration(seconds: 12), () {
      setState(() {
        if (this.showLoadingPage) {
          this.showLoadingPage = false;
        }
      });
    });
  }

  void showInterstitialAd() {
    InterstitialAd(
      adUnitId: INTERSTITIAL_ID,
      targetingInfo: Ads.targetingInfo,
      listener: (MobileAdEvent event) {
        String eventStr = event.toString();
        if (eventStr.contains('closed') || eventStr.contains('clicked')) {
          setState(() {
            this.showLoadingPage = false;
          });
        }
      },
    )
      ..load()
      ..show();
  }

  @override
  void dispose() {
    _videoPlayerController.dispose();
    _chewieController.dispose();
    super.dispose();
  }
}
