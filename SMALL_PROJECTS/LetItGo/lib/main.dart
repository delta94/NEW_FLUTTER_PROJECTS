import 'package:chewie/chewie.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:seabird.letitgo/Ads.dart';
import 'package:seabird.letitgo/EndLoopController.dart';
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

    _videoPlayerController = VideoPlayerController.network('https://phongngo1776.github.io/Videos/LetItGo/LetItGo.mp4')
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
              'Let It Go - Video Subtitle', 
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
          ],
        ),
        backgroundColor: Colors.black54,
      ),
      body: Container(
        child: Column(
            children: <Widget>[
              Container(
                margin: EdgeInsets.only(top: 0),
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
                          "\nThe snow blows white on the mountain tonight \n " +
                          "Not a footprint to be seen \n " +
                          "A kingdom of isolation, and it looks like I'm the queen \n " +
                          "The wind is howling like the swirling storm inside \n " +
                          "Couldn't keep it in \n " +
                          "Heaven knows I tried \n " +
                          " \n " +
                          "Don't let them in, don't let them see \n " +
                          "Be the good girl, you always have to be \n " +
                          "Conceal, don't feel, don't let them know \n " +
                          "Well, now they know \n " +
                          " \n " +
                          "Let it go, let it go \n " +
                          "Can't hold it back anymore \n " +
                          "Let it go, let it go \n " +
                          "Turn my back and slam the door \n " +
                          " \n " +
                          "And here I stand \n " +
                          "And here I'll stay \n " +
                          "Let it go, let it go \n " +
                          "The cold never bothered me anyway \n " +
                          " \n " +
                          "It's funny how some distance makes everything seem small \n " +
                          "And the fears that once controlled me, can't get to me at all \n " +
                          "Up here in the cold, thin air I finally can breathe \n " +
                          "I know I left a life behind, but I'm too relieved to grieve \n " +
                          " \n " +
                          "Let it go, let it go \n " +
                          "Can't hold it back anymore \n " +
                          "Let it go, let it go \n " +
                          "Turn my back, and slam the door \n " +
                          " \n " +
                          "And here I stand \n " +
                          "And here I'll stay \n " +
                          "Let it go, let it go \n " +
                          "The cold never bothered me anyway \n " +
                          " \n " +
                          "Standing frozen in the life I've chosen \n " +
                          "You won't find me, the past is so behind me \n " +
                          "Buried in the snow \n " +
                          " \n " +
                          "Let it go, let it go \n " +
                          "Can't hold it back anymore \n " +
                          "Let it go, let it go \n " +
                          "Turn my back and slam the door \n " +
                          " \n " +
                          "And here I stand \n " +
                          "And here I'll stay \n " +
                          "Let it go, let it go \n " +
                          "The cold never bothered me anyway \n " +
                          " \n ",
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
