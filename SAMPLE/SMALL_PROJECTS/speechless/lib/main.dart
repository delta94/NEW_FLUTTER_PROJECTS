import 'package:app_review/app_review.dart';
import 'package:chewie/chewie.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:swxxx.speechless/Ads.dart';
import 'package:swxxx.speechless/EndLoopController.dart';
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

    _videoPlayerController = VideoPlayerController.network('https://haiyentruong1776.github.io/Public_Video/Speechless.mp4')
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
              'Speechless - Video Subtitle', 
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
                          "\nHere comes a wave \n" +
                          "Meant to wash me away \n" +
                          "A tide that is taking me under \n \n" +

                          "Swallowing sand \n" +
                          "Left with nothing to say \n" +
                          "My voice drowned out in the thunder \n \n" +

                          "But I won't cry \n" +
                          "And I won't start to crumble \n" +
                          "Whenever they try \n" +
                          "To shut me or cut me down \n \n" +

                          "I won't be silenced \n" +
                          "You can't keep me quiet \n" +
                          "Won't tremble when you try it \n" +
                          "All I know is I won't go speechless \n \n" +

                          "'Cause I'll breathe \n" +
                          "When they try to suffocate me \n" +
                          "Don't you underestimate me \n" +
                          "'Cause I know that I won't go speechless \n \n" +

                          "Written in stone \n" +
                          "Every rule, every word \n" +
                          "Centuries old and unbending \n" +
                          "Stay in your place \n" +
                          "Better seen and not heard \n" +
                          "But now that story is ending \n \n" +

                          "'Cause I \n" +
                          "I cannot start to crumble \n" +
                          "So come on and try \n" +
                          "Try to shut me and cut me down \n \n" +

                          "I won't be silenced \n" +
                          "You can't keep me quiet \n" +
                          "Won't tremble when you try it \n" +
                          "All I know is I won't go speechless \n" +
                          "Speechless \n \n" +
                          
                          "Let the storm in \n" +
                          "I cannot be broken \n" +
                          "No, I won't live unspoken \n" +
                          "'Cause I know that I won't go speechless \n \n" +
                          
                          "Try to lock me in this cage \n" +
                          "I won't just lay me down and die \n" +
                          "I will take these broken wings \n" +
                          "And watch me burn across the sky \n" +
                          "And it echoes saying I \n \n" +
                          
                          "Won't be silenced \n" +
                          "No you will not see me tremble when you try it \n" +
                          "All I know is I won't go speechless \n" +
                          "Speechless \n \n" +
                          
                          "'Cause I'll breathe \n" +
                          "When they try to suffocate me \n" +
                          "Don't you underestimate me \n" +
                          "'Cause I know that I won't go speechless \n" +
                          "All I know is I won't go speechless \n" +
                          "Speechless",
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
