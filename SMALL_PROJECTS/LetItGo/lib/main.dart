import 'package:chewie/chewie.dart';
import 'package:flutter/material.dart';
import 'package:seabird.letitgo/ads.dart';
import 'package:video_player/video_player.dart';

void main() => runApp(MaterialApp(
  debugShowCheckedModeBanner: false,
  home: MyApp(),
));

class MyApp extends StatefulWidget {
  MyAppState createState() => MyAppState();
}

class MyAppState extends State<MyApp> with SingleTickerProviderStateMixin {
  VideoPlayerController _videoPlayerController;
  ChewieController _chewieController;
  String title = 'Let It Go - Video Subtitle';
  bool videoState;

  @override
  void initState() {
    super.initState();

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
        title: Text(title, style: TextStyle(color: Colors.pinkAccent),),
        backgroundColor: Color.fromRGBO(70, 70, 70, 1),
      ),
      body: Column(
            children: <Widget>[
              Container(
                margin: EdgeInsets.only(top: 60),
                color: Colors.black,
                child: Chewie(
                  controller: _chewieController,
                ),
              ),
              Divider(),
              Text('Lyric:', style: TextStyle(color: Colors.pinkAccent, fontWeight: FontWeight.bold),),
              Divider(),
              Expanded(
                child: Container(
                  color: Color.fromRGBO(70, 70, 70, 1),
                  child: ListView.builder(
                    key: UniqueKey(),
                    controller: _scrollController,
                    itemBuilder: (b, i) {
                      return Container(
                        height: 1300,
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
                          style: TextStyle(color: Colors.yellowAccent),
                        ),

                      );
                    },
                    itemCount: 1,
                  )
                )
              )
      ])
    );
  }
}
