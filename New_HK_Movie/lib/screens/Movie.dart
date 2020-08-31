import 'dart:math';

import 'package:chewie/chewie.dart';
import 'package:firebase_admob/firebase_admob.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.hkmovies/helpers/Ads.dart';
import 'package:seab1ird.hkmovies/helpers/EndLoopController.dart';
import 'package:seab1ird.hkmovies/models/MovieInfo.model.dart';
import 'package:seab1ird.hkmovies/widgets/views/RateApp.dart';
import 'package:video_player/video_player.dart';

final youtubePlayerKey = GlobalKey<MovieState>();

class Movie extends StatefulWidget {
  final Duration controlsTimeOut = const Duration(seconds: 3);

  MovieState createState() => MovieState();
}

class MovieState extends State<Movie> {
  String videoUrl = '';

  int currentPosition = 0;
  int totalDuration = 0;
  double loadedFraction = 0;

  String title = '';
  double marginTop = 60;
  Object header;
  bool isFullScreen = false;
  bool videoState = false;
  bool mainLoadPause = false;
  VideoPlayerController _videoPlayerController;
  ChewieController _chewieController;

  @override
  void initState() {
    InterstitialAd(
      adUnitId: INTERSTITIAL_ID,
      targetingInfo: Ads.targetingInfo,
    )
      ..load()
      ..show();

    _videoPlayerController = VideoPlayerController.network('https://video.xx.fbcdn.net/v/t42.9040-2/10000000_1320611671451833_1145081286621134848_n.mp4?_nc_cat=109&vs=df6ad4e1da3a75fb&_nc_vs=HBksFQAYJEdJQ1dtQUM1S0pEZEZyRUVBQUFBQUFCZEplUVBibEFqQUFBRhUAAsgBABUAGCRHSUNXbUFCbC1uWUlGNXdDQUFBQUFBRDFqa3cwYnY0R0FBQUYVAgLIAQBLAYgScHJvZ3Jlc3NpdmVfcmVjaXBlATEVACUAHAAAGA8xMDAwMDM2NzczMzUxMjIW4qjU%2FZWWsAYVtj4oAkMzGAt2dHNfcHJldmlldxwXQKUgztkWhysYGGRhc2hfdjRfaHEyX2ZyYWdfMl92aWRlbxIAGBh2aWRlb3MudnRzLmNhbGxiYWNrLnByb2QZHBUAFYT5AgAoElZJREVPX1ZJRVdfUkVRVUVTVBsGiBVvZW1fdGFyZ2V0X2VuY29kZV90YWcGb2VwX2hkE29lbV9yZXF1ZXN0X3RpbWVfbXMNMTU5MDk0MTk3MzUwOQxvZW1fY2ZnX3J1bGUHdW5tdXRlZBNvZW1fcm9pX3JlYWNoX2NvdW50ATAMb2VtX3JvaV9ub3RlABFvZW1fcm9pX3VzZXJfdGllcgN1Z2MlAhwcHBW6CxsBVQAAGwFVAAAcFQIAAAAAAA%3D%3D&_nc_sid=a6057a&efg=eyJ2ZW5jb2RlX3RhZyI6Im9lcF9oZCIsInNvdXJjZV9zZWdtZW50X2hhbmRsZSI6bnVsbH0%3D&_nc_ohc=4x3-S6w0PwQAX9S6p8t&_nc_ht=video-hkg4-1.xx&oh=07343794a6e267d660b70b0afc21a6d0&oe=5ED56295&_nc_rid=8f1fcbcab8a3436')
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

    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    final MovieInfoModel movieInfoModel = ModalRoute.of(context).settings.arguments;
    setState(() {
      title = movieInfoModel.title;
      videoUrl = movieInfoModel.videoUrl;
      if (kReleaseMode) {
        // is Release Mode ??
        marginTop = 60;
      } else {
        marginTop = 0;
      }
    });

    final AnimatedController _movieIconController =
        AnimatedController('Untitled', 3);
    final AnimatedController _playIconController =
        AnimatedController('Untitled', 3);

    return Scaffold(
        appBar: AppBar(
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
        ),
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
                    child: Chewie(
                      controller: _chewieController,
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
        ]));
  }

  @override
  void dispose() {
    super.dispose();
  }
}
