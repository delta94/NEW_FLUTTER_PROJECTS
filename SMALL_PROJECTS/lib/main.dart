import 'package:app_review/app_review.dart';
import 'package:chewie/chewie.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:seabird.lovemelikeyoudo/Ads.dart';
import 'package:seabird.lovemelikeyoudo/EndLoopController.dart';
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
    Ads.showBannerAd();
    animationController = AnimationController(vsync: this, duration: Duration(milliseconds: 500));

    _videoPlayerController = VideoPlayerController.network('https://haiyentruong1776.github.io/Public_Video/LoveMeLoveYou.mp4')
    ..addListener(() {
        final bool videoState = _videoPlayerController.value.isPlaying;
        if(this.videoState != videoState){
          Ads.showInterstitialAd();
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
        Ads.hideBannerAd();
      } else {
        Ads.showBannerAd();
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
              'Love Me Like You Do', 
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
                margin: EdgeInsets.only(top: 60),
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
                        height: 1500,
                        margin: EdgeInsets.only(bottom: 3, left: 10),
                        alignment: Alignment.topCenter,
                        child: Text(
                          "\nYou're the light, you're the night \n" +
                          "You're the colour of my blood \n" +
                          "You're the cure, you're the pain \n" +
                          " \n" +
                          "You're the only thing I wanna touch \n" +
                          "Never knew that it could mean so much, so much \n" +
                          " \n" +
                          "You're the fear, I don't care \n" +
                          "'Cause I've never been so high \n" +
                          "Follow me through the dark \n" +
                          "Let me take you past our satellites \n" +
                          "You can see the world you brought to life, to life \n" +
                          " \n" +
                          "So love me like you do, la-la-love me like you do \n" +
                          "Love me like you do, la-la-love me like you do \n" +
                          "Touch me like you do, ta-ta-touch me like you do \n" +
                          "What are you waiting for? \n" +
                          " \n" +
                          "Fading in, fading out \n" +
                          "On the edge of paradise \n" +
                          "Every inch of your skin is a Holy Grail I've got to find \n" +
                          "Only you can set my heart on fire, on fire \n" +
                          "Yeah \n" +
                          " \n" +
                          "I'll let you set the pace \n" +
                          "'Cause I'm not thinking straight \n" +
                          "My head's spinning around, I can't see clear no more \n" +
                          "What are you waiting for? \n" +
                          " \n" +
                          "Love me like you do, la-la-love me like you do (Like you do) \n" +
                          "Love me like you do, la-la-love me like you do \n" +
                          "Touch me like you do, ta-ta-touch me like you do \n" +
                          "What are you waiting for? \n" +
                          "Love me like you do, la-la-love me like you do (Like you do) \n" +
                          "Love me like you do, la-la-love me like you do (Yeah) \n" +
                          "Touch me like you do, ta-ta-touch me like you do \n" +
                          "What are you waiting for? \n" +
                          " \n" +
                          "I'll let you set the pace \n" +
                          "'Cause I'm not thinking straight \n" +
                          "My head's spinning around, I can't see clear no more \n" +
                          "What are you waiting for? \n" +
                          " \n" +
                          "Love me like you do, la-la-love me like you do (Like you do) \n" +
                          "Love me like you do, la-la-love me like you do (Yeah) \n" +
                          "Touch me like you do, ta-ta-touch me like you do \n" +
                          "What are you waiting for? \n" +
                          "Love me like you do, la-la-love me like you do (Like you do) \n" +
                          "Love me like you do, la-la-love me like you do (Oh) \n" +
                          "Touch me like you do, ta-ta-touch me like you do \n" +
                          "What are you waiting for?",
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
