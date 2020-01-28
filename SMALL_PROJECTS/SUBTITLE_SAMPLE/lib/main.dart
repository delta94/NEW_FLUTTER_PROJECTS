import 'package:app_review/app_review.dart';
import 'package:chewie/chewie.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:seab1ird.letitgo/EndLoopController.dart';
import 'package:video_player/video_player.dart';

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
  bool videoState;
  final EndLoopController _loopController = EndLoopController('Untitled', 1.0);
  final EndLoopController _loopController2 = EndLoopController('Untitled', 1.0);
  AnimationController animationController;

  @override
  void initState() {
    super.initState();
    // Ads.showBannerAd();
    animationController = AnimationController(vsync: this, duration: Duration(milliseconds: 500));

    _videoPlayerController = VideoPlayerController.network('https://phongngo1776.github.io/Videos/GirlLikeYou/GirlLikeYou.mp4')
    ..addListener(() {
        final bool videoState = _videoPlayerController.value.isPlaying;
        if(this.videoState != videoState){
          // Ads.showInterstitialAd();
          this.videoState = videoState;
        }
        // Toast.show(isPlaying.toString(), context);
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
    )
    ..addListener(() {
      if (_chewieController.isFullScreen == true) {
        // Ads.hideBannerAd();
      } else {
        // Ads.showBannerAd();
      }
    });
  }

  @override
  void dispose(){
    _videoPlayerController.dispose();
    _chewieController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    ScrollController _scrollController = ScrollController();
    
    return Scaffold(
      appBar: AppBar(
        title: Row(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: <Widget>[
            Container(
              width: 40,
              height: 40,
              child: FlareActor("images/song_icon.flr",
                alignment: Alignment.center,
                controller: _loopController,
              )
            ),
            Text(
              'Girls Like You', 
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
            GestureDetector(
              child: Image.asset('images/star.png', height: 30, width: 30),
              onTap: () {
                AppReview.storeListing.then((onValue) {});
              },
            )
          ],
        ),
        backgroundColor: Colors.black54,
      ),
      body: Container(
        child: Column(
            children: <Widget>[
              Container(
                margin: EdgeInsets.only(top: 10),
                color: Colors.black,
                child: Chewie(
                  controller: _chewieController,
                ),
              ),
              Container(
                color: Colors.black87,
                //width: double.infinity,
                padding: EdgeInsets.only(top: 5, bottom: 5),
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: <Widget>[
                    //Image.asset('images/QuickLyric.png', height: 20, width: 20),
                    Container(
                      width: 20,
                      height: 20,
                      child: FlareActor("images/lyric_icon.flr",
                        alignment: Alignment.center,
                        controller: _loopController2,
                      )
                    ),
                    Text(' Lyric:', style: TextStyle(color: Colors.pink[300], fontWeight: FontWeight.bold, fontSize: 20),),
                  ],
                )
              ),
              Expanded(
                child: Container(
                  color: Colors.yellow[100],
                  child: ListView.builder(
                    key: UniqueKey(),
                    controller: _scrollController,
                    itemBuilder: (b, i) {
                      return Container(
                        height: 1000,
                        margin: EdgeInsets.only(bottom: 3, left: 10),
                        alignment: Alignment.topCenter,
                        child: Text(
                          "\n Spent 24 hours, I need more hours with you \n " +
                          "You spent the weekend getting even, ooh \n " +
                          "We spent the late nights making things right between us \n " +
                          " \n " +
                          "But now it's all good, babe \n " +
                          "Roll that back wood, babe \n " +
                          "And play me close \n " +
                          " \n " +
                          "'Cause girls like you run 'round with guys like me \n " +
                          "'Til sun down when I come through \n " +
                          "I need a girl like you, yeah yeah \n " +
                          "Girls like you love fun and, yeah, me too \n " +
                          "What I want when I come through \n " +
                          "I need a girl like you, yeah yeah \n " +
                          " \n " +
                          "Yeah yeah yeah, yeah yeah yeah \n " +
                          "I need a girl like you, yeah yeah \n " +
                          "Yeah yeah yeah, yeah yeah yeah \n " +
                          "I need a girl like you \n " +
                          " \n " +
                          "I spent last night on the last flight to you (ey ya) \n " +
                          "Took a whole day up trying to get way up, ooh \n " +
                          "We spent the daylight trying to make things right between us \n " +
                          " \n " +
                          "But now it's all good, babe \n " +
                          "Roll that back wood, babe \n " +
                          "And play me close, yeah \n " +
                          " \n " +
                          "'Cause girls like you run 'round with guys like me \n " +
                          "'Til sun down when I come through \n " +
                          "I need a girl like you, yeah yeah \n " +
                          "Girls like you love fun and, yeah, me too \n " +
                          "What I want when I come through \n " +
                          "I need a girl like you, yeah yeah \n " +
                          " \n " +
                          "Yeah yeah yeah, yeah yeah yeah \n " +
                          "I need a girl like you, yeah yeah \n " +
                          "Yeah yeah yeah, yeah yeah yeah \n " +
                          "I need a girl like you, yeah yeah \n " +
                          "I need a girl like you, yeah yeah \n " +
                          "I need a girl like you \n " +
                          " \n " +
                          "Maybe it's 6:45 \n " +
                          "Maybe I'm barely alive \n " +
                          "Maybe you've taken my shit for the last time, yeah \n " +
                          "Maybe I know that I'm drunk \n " +
                          "Maybe I know you're the one \n " +
                          "Maybe you thinking it's better if you drive \n " +
                          " \n " +
                          "Oh, 'cause girls like you run 'round with guys like me \n " +
                          "'Til sun down when I come through \n " +
                          "I need a girl like you, yeah \n " +
                          " \n " +
                          "'Cause girls like you run 'round with guys like me \n " +
                          "'Til sun down when I come through \n " +
                          "I need a girl like you, yeah yeah \n " +
                          "Girls like you love fun and, yeah, me too \n " +
                          "What I want when I come through \n " +
                          "I need a girl like you, yeah yeah \n " +
                          " \n " +
                          "Yeah yeah yeah, yeah yeah yeah \n " +
                          "I need a girl like you, yeah yeah \n " +
                          "Yeah yeah yeah, yeah yeah yeah \n " +
                          "I need a girl like you \n ",
                          style: TextStyle(color: Colors.pink, fontWeight: FontWeight.bold),
                        ),

                      );
                    },
                    itemCount: 1,
                  )
                )
              )
        ]),
      )
    );
  }
}
