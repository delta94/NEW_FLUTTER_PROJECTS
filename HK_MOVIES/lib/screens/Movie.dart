import 'dart:math';

import 'package:firebase_admob/firebase_admob.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.hkmovies/helpers/Ads.dart';
import 'package:seab1ird.hkmovies/helpers/EndLoopController.dart';
import 'package:seab1ird.hkmovies/models/MovieInfo.model.dart';
import 'package:seab1ird.hkmovies/widgets/views/RateApp.dart';
import 'package:seab1ird.hkmovies/youtube_lib/player/youtube_player.dart';
import 'package:seab1ird.hkmovies/youtube_lib/utils/youtube_player_controller.dart';
import 'package:seab1ird.hkmovies/youtube_lib/utils/youtube_player_flags.dart';
import 'package:seab1ird.hkmovies/youtube_lib/widgets/widgets.dart';

final youtubePlayerKey = GlobalKey<MovieState>();

class Movie extends StatefulWidget {
  final Duration controlsTimeOut = const Duration(seconds: 3);

  MovieState createState() => MovieState();
}

class MovieState extends State<Movie> {
  String videoId = '';

  int currentPosition = 0;
  int totalDuration = 0;
  double loadedFraction = 0;

  String title = '';
  double marginTop = 60;
  Object header;
  bool isFullScreen = false;

  @override
  void initState() {
    InterstitialAd(
      adUnitId: INTERSTITIAL_ID,
      targetingInfo: Ads.targetingInfo,
    )
      ..load()
      ..show();

    super.initState();
  }

  updateView() {
    if (isFullScreen) {
      marginTop = 0;
      header = PreferredSize(
          preferredSize: Size.fromHeight(0),
          child: AppBar(
            // Here we create one to set status bar color
            backgroundColor: Colors.black,
          ));
    } else {
      if (Ads.kReleaseMode) {
        // is Release Mode ??
        marginTop = 60;
      } else {
        marginTop = 0;
      }

      final AnimatedController _playIconController =
          AnimatedController('Untitled', 3);

      header = AppBar(
        title: Row(
          children: <Widget>[
            Container(
              width: 30,
              height: 30,
              margin: EdgeInsets.only(right: 5),
              child: FlareActor(
                "images/play_movie.flr",
                alignment: Alignment.center,
                controller: _playIconController,
              ),
            ),
            SizedBox(width: 10),
            Flexible(
              fit: FlexFit.loose,
              child: Text(
                title,
                overflow: TextOverflow.fade,
                style: TextStyle(
                  color: Colors.yellow,
                  fontWeight: FontWeight.bold,
                  decoration: TextDecoration.underline,
                  decorationColor: Colors.redAccent,
                  decorationStyle: TextDecorationStyle.solid,
                  shadows: [
                    Shadow(
                      color: Colors.blueAccent,
                      blurRadius: 2.0,
                      offset: Offset(3.0, 3.0),
                    ),
                  ],
                ),
              ),
            ),
          ],
        ),
        iconTheme: new IconThemeData(color: Colors.yellowAccent),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
        actions: <Widget>[RateApp()],
      );
    }
  }

  @override
  Widget build(BuildContext context) {
    final MovieInfoModel args = ModalRoute.of(context).settings.arguments;
    setState(() {
      title = args.title;
      updateView();
      videoId = args.videoId;
    });

    final AnimatedController _movieIconController =
        AnimatedController('Untitled', 3);
    YoutubePlayerController _controller = YoutubePlayerController(
      initialVideoId: videoId,
      flags: YoutubePlayerFlags(
        autoPlay: false,
      ),
    );

    _controller.addListener(() {
      if (isFullScreen && !_controller.value.isFullScreen) {
        Ads.showBannerAd();
        InterstitialAd(
          adUnitId: INTERSTITIAL_ID,
          targetingInfo: Ads.targetingInfo,
        )
          ..load()
          ..show();
        setState(() {
          marginTop = 60;
          isFullScreen = _controller.value.isFullScreen;
        });
      } else if (!isFullScreen && _controller.value.isFullScreen) {
        Ads.hideBannerAd();
        setState(() {
          marginTop = 0;
          isFullScreen = _controller.value.isFullScreen;
        });
      }
    });

    return WillPopScope(
      onWillPop: (){
        SystemChrome.setPreferredOrientations([DeviceOrientation.portraitUp]);
        if(!_controller.value.isFullScreen){
          Navigator.of(context).pop();
        }
        return Future<bool>.value(false);
      },
          child: Scaffold(
          appBar: header,
          body: new Stack(children: <Widget>[
            new Container(
              decoration: new BoxDecoration(
                image: new DecorationImage(
                  image: new AssetImage('images/bg.png'),
                  fit: BoxFit.cover,
                ),
              ),
            ),
            new Container(
                padding: EdgeInsets.only(top: marginTop),
                child: Column(
                  children: <Widget>[
                    Container(
                      child: YoutubePlayer(
                        progressColors: ProgressBarColors(
                          playedColor: Colors.amber,
                          handleColor: Colors.amberAccent,
                        ),
                        controller: _controller,
                        showVideoProgressIndicator: true,
                      ),
                    ),
                    Container(
                        margin: EdgeInsets.only(top: 10, bottom: 10),
                        padding: EdgeInsets.only(left: 10, right: 10, top: 10),
                        child: Text(
                          title,
                          style: TextStyle(
                            color: Colors.yellow,
                            fontWeight: FontWeight.bold,
                            fontSize: 25,
                            decoration: TextDecoration.underline,
                            decorationColor: Colors.redAccent,
                            decorationStyle: TextDecorationStyle.solid,
                            shadows: [
                              Shadow(
                                color: Colors.blueAccent,
                                blurRadius: 2.0,
                                offset: Offset(3.0, 3.0),
                              ),
                            ],
                          ),
                        )),
                    Column(
                      mainAxisAlignment: MainAxisAlignment.spaceAround,
                      children: <Widget>[
                        SizedBox(
                          height: 20,
                        ),
                        RaisedButton(
                          color: Colors.white,
                          shape: new RoundedRectangleBorder(
                              borderRadius: BorderRadius.circular(10)),
                          onPressed: () {
                            var rng = new Random();
                            if (rng.nextInt(10) > 5) {
                              InterstitialAd(
                                adUnitId: INTERSTITIAL_ID,
                                targetingInfo: Ads.targetingInfo,
                              )
                                ..load()
                                ..show();
                            }

                            Navigator.pop(context, true);
                          },
                          child: Padding(
                            padding: const EdgeInsets.all(8.0),
                            child: Wrap(
                              children: <Widget>[
                                Container(
                                    width: 30,
                                    height: 30,
                                    margin: EdgeInsets.only(right: 5),
                                    child: FlareActor(
                                      "images/movie_icon.flr",
                                      alignment: Alignment.center,
                                      controller: _movieIconController,
                                    )),
                                Text('Danh sách phim',
                                    style: TextStyle(
                                      color: Colors.red,
                                      fontSize: 25,
                                      fontWeight: FontWeight.bold,
                                      decoration: TextDecoration.underline,
                                      decorationColor: Colors.blueAccent,
                                    )),
                              ],
                            ),
                          ),
                        ),
                      ],
                    )
                  ],
                )),
          ])),
    );
  }

  @override
  void dispose() {
    super.dispose();
  }
}
