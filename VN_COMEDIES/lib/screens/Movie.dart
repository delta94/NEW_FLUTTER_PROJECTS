import 'dart:async';
import 'dart:math';

import 'package:firebase_admob/firebase_admob.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.vncomedies/helpers/Ads.dart';
import 'package:seab1ird.vncomedies/helpers/EndLoopController.dart';
import 'package:seab1ird.vncomedies/models/MovieInfo.model.dart';
import 'package:seab1ird.vncomedies/widgets/views/RateApp.dart';
import 'package:seab1ird.vncomedies/widgets/views/VideoBuilder.dart';
import 'package:seab1ird.vncomedies/widgets/youtube_player/youtube_player_controller.dart';
import 'package:ytview/ytview.dart';



final youtubePlayerKey = GlobalKey<MovieState>();

typedef YoutubePlayerControllerCallback(YoutubePlayerController controller);

class Movie extends StatefulWidget {
  final Duration controlsTimeOut = const Duration(seconds: 3);
  YoutubePlayerControllerCallback onPlayerInitialized;

  MovieState createState() => MovieState();
}

class MovieState extends State<Movie> {
  YoutubePlayerController ytController;
  String videoId = '';

  YoutubePlayerController get controller => ytController;

  set controller(YoutubePlayerController c) => ytController = c;

  final _showControls = ValueNotifier<bool>(false);

  int currentPosition = 0;
  int totalDuration = 0;
  double loadedFraction = 0;
  Timer _timer;

  String title = '';
  double marginTop = 60;
  Object header;
  bool isFullScreen = false;
  final textInputController = TextEditingController();

  String _currentVideoId;

  @override
  void initState() {
    super.initState();

    _loadController();
    _currentVideoId = videoId;
    _showControls.addListener(() {
      _timer?.cancel();
      if (_showControls.value)
        _timer =
          Timer(widget.controlsTimeOut, () => _showControls.value = false);
    });
  }

  updateView(){

    if(isFullScreen){
         marginTop = 0;
         header = PreferredSize(
          preferredSize: Size.fromHeight(0),
          child: AppBar( // Here we create one to set status bar color
            backgroundColor: Colors.black, 
          )
        );
       } else {
         if(kReleaseMode){ // is Release Mode ??
           marginTop = 60;
         } else {
           marginTop = 0;
         }

         header =  AppBar(
            title: Text(title, style: TextStyle(
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
              ],)
            ),
            iconTheme: new IconThemeData(color: Colors.yellowAccent),
            backgroundColor: Color.fromRGBO(50, 50, 50, 1),
            actions: <Widget>[
              RateApp()
            ],
          );
       }
  }

   _loadController({WebViewController webController}) {
    controller = YoutubePlayerController(videoId);
    if (webController != null)
      controller.value =
          controller.value.copyWith(webViewController: webController);
    controller.addListener(listener);
    if (widget.onPlayerInitialized != null)
      widget.onPlayerInitialized(controller);
  }

  void listener() async {
    bool isChangeScreen = controller.value.isFullScreen != isFullScreen;
    if(isChangeScreen){
      isFullScreen = controller.value.isFullScreen;
      updateView();
    }

    if (controller.value.isLoaded && mounted) {
      setState(() {
        currentPosition = controller.value.position.inMilliseconds;
        totalDuration = controller.value.duration.inMilliseconds;
        loadedFraction = currentPosition / totalDuration;
        if (loadedFraction > 1) loadedFraction = 1;
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    if (_currentVideoId != videoId) {
      _currentVideoId = videoId;
      _loadController(webController: controller.value.webViewController);
      controller.load();
      Future.delayed(Duration(milliseconds: 500),
          () => controller.seekTo(Duration(seconds: 0)));
    }

    final MovieInfoModel args = ModalRoute.of(context).settings.arguments;
    setState(() {
      title = args.title;
      updateView();
      videoId =  args.videoId;
    });

    final AnimatedController _playIconController = AnimatedController('Untitled', 3);
    final AnimatedController _movieIconController = AnimatedController('Untitled', 3);

    return  Scaffold(
      appBar: header,
      body: new Stack(
        children: <Widget>[
          new Container(
            decoration: new BoxDecoration(
              image: new DecorationImage(image: new AssetImage('images/bg.png'), fit: BoxFit.cover,),
            ),
          ),
          new Container(
            padding: EdgeInsets.only(top: marginTop),
            child: Column(
            children: <Widget>[
              Container(
                child: VideoBuilder.buildPlayer(controller, _showControls),
              ),
              
              Container(
                margin: EdgeInsets.only(top: 10, bottom: 10),
                padding: EdgeInsets.only(left: 10, right: 10,top: 10),
                child: Text(title, 
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
                )
              ),

              Column(
                mainAxisAlignment: MainAxisAlignment.spaceAround,
                children: <Widget>[
                  RaisedButton(
                    color: Colors.lightGreenAccent[100],
                    shape: new RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(10)
                    ),
                    onPressed: () {
                      setState(() {
                        videoId = '';
                      });

                      Timer(Duration(seconds: 1), (){
                        setState(() {
                          videoId = videoId;
                        });
                      });
                    },
                    child: Padding(
                      padding: const EdgeInsets.all(8.0),
                      child: Wrap(
                        children: <Widget>[
                          Container(
                            width: 30,
                            height: 30,
                            margin: EdgeInsets.only(right: 5),
                            child: FlareActor("images/play_movie.flr",
                              alignment: Alignment.center,
                              controller: _playIconController,
                            )
                          ),
                          Text('Play', style: TextStyle(
                            color: Colors.redAccent, 
                            fontSize: 25,
                            fontWeight: FontWeight.bold,
                            decoration: TextDecoration.underline,
                            decorationColor: Colors.redAccent,
                          ),),
                        ],
                      ),
                    ),
                  ),
                  SizedBox(height: 20,),
                  RaisedButton(
                    color: Colors.white,
                    shape: new RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(10)
                    ),
                    onPressed: () {
                      var rng = new Random();
                      if(rng.nextInt(10) > 5){
                        InterstitialAd(
                          adUnitId: INTERSTITIAL_ID,
                          targetingInfo: Ads.targetingInfo,
                        )..load()..show();
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
                            child: FlareActor("images/movie_icon.flr",
                              alignment: Alignment.center,
                              controller: _movieIconController,
                            )
                          ),
                          Text('Danh sách hài', 
                            style: TextStyle(
                              color: Colors.red, 
                              fontSize: 25,
                              fontWeight: FontWeight.bold,
                              decoration: TextDecoration.underline,
                              decorationColor: Colors.blueAccent,
                            )
                          ),
                        ],
                      ),
                    ),
                  ),
                ],
              )
          ],)
        ),
      ])
    );
  }


  @override
  void dispose() {
    super.dispose();
  }
}
