import 'dart:async';
import 'package:firebase_admob/firebase_admob.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:dio/dio.dart';
import 'package:seab1ird.vncomedies/helpers/CommonFunctions.dart';
import 'package:seab1ird.vncomedies/helpers/Ads.dart';
import 'package:seab1ird.vncomedies/helpers/EndLoopController.dart';
import 'package:seab1ird.vncomedies/models/MovieInfo.model.dart';
import 'package:seab1ird.vncomedies/models/TypeVideo.model.dart';
import 'package:seab1ird.vncomedies/widgets/views/MovieListItem.dart';
import 'package:seab1ird.vncomedies/widgets/views/RateApp.dart';

class MovieList extends StatefulWidget {
  MovieList({Key key}) : super(key: key);
  MovieListState createState() => MovieListState();
}

class MovieListState extends State<MovieList> {
  final dio = new Dio();
  double marginTop = 0;
  int total = 0;
  String nextPageToken = '';
  bool isLoading = false;
  String youtubePlayListId = '';
  bool isYoutubePlaylistUrl = false;
  List<MovieInfoModel> videoList = new List<MovieInfoModel>();
  String message = 'Đang Tải...';
  ScrollController _scrollController = new ScrollController();

  Future<bool> _onWillPop() {
    Navigator.pop(context, true);
    return null;
  }

  @override
  void initState() {
    super.initState();
    if (true) {
      // is Release Mode ??
      marginTop = 60;
    }

    _scrollController.addListener(() {
      if (_scrollController.position.pixels ==
          _scrollController.position.maxScrollExtent) {
        _getMoreDataFromYoutubeAPI();
      }
    });

    Timer(Duration(seconds: 3), () {
      setState(() {
        message = "Vui lòng kết nối Wifi. Thanks 😘";
      });
    });
  }

  void _getMoreDataFromYoutubeAPI() async {
    if (!isLoading) {
      setState(() {
        isLoading = true;
      });

      if (nextPageToken != null && youtubePlayListId != null) {
        final response = await dio.get(CommonFunctions.getYTPlayListInfoUrl(
            youtubePlayListId, nextPageToken));
        List<MovieInfoModel> tempList = new List();
        total = response.data['pageInfo']['totalResults'];
        nextPageToken = response.data['nextPageToken'];
        for (int i = 0; i < response.data['items'].length; i++) {
          if (response.data['items'][i]['snippet']['thumbnails'] != null) {
            var videoItem = response.data['items'][i];
            tempList.add(new MovieInfoModel(
                videoItem['snippet']['title'],
                videoItem['snippet']['title'],
                videoItem['contentDetails']['videoId']));
          }
        }

        setState(() {
          isLoading = false;
          videoList.addAll(tempList);
        });
      } else {
        isLoading = false;
      }
    }
  }

  void _getDataFromArgument(MovieTypeModel args) {
    if (!isLoading) {
      setState(() {
        isLoading = true;
      });

      if (nextPageToken != null && youtubePlayListId != null) {
        List<MovieInfoModel> tempList = new List();
        for (int i = 0; i < args.movieList.length; i++) {
          var videoItem = args.movieList[i];
          tempList.add(new MovieInfoModel(
              videoItem['title'], videoItem['title'], videoItem['videoId']));
        }

        setState(() {
          isLoading = false;
          videoList.addAll(tempList);
        });
      } else {
        isLoading = false;
      }
    }
  }

  @override
  void dispose() {
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));

    final AnimatedController _movieIconController =
        AnimatedController('Untitled', 3);

    final MovieTypeModel args = ModalRoute.of(context).settings.arguments;
    if (args.movieList.length == 1) {
      isYoutubePlaylistUrl = true;
      youtubePlayListId = args.movieList[0]['videoId'];
      _getMoreDataFromYoutubeAPI();
    } else {
      isYoutubePlaylistUrl = false;
      _getDataFromArgument(args);
    }

    return new WillPopScope(
        onWillPop: _onWillPop,
        child: Scaffold(
            appBar: AppBar(
                title: Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: <Widget>[
                    Container(
                      width: 30,
                      height: 30,
                      margin: EdgeInsets.only(right: 5),
                      child: FlareActor(
                        "images/app_icon.flr",
                        alignment: Alignment.center,
                        controller: _movieIconController,
                      ),
                    ),
                    Text(
                      args.name,
                      style: TextStyle(
                        fontSize: 18,
                        color: Colors.yellow,
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
                  ],
                ),
                iconTheme: new IconThemeData(color: Colors.amber),
                backgroundColor: Color.fromRGBO(50, 50, 50, 1),
                actions: <Widget>[RateApp()]),
            body: new Stack(children: <Widget>[
              new Container(
                decoration: new BoxDecoration(
                  image: new DecorationImage(
                    image: new AssetImage('images/bg.png'),
                    fit: BoxFit.cover,
                  ),
                ),
              ),
              Container(
                  margin: EdgeInsets.only(top: marginTop),
                  child: Column(children: <Widget>[
                    videoList.length > 0
                        ? Expanded(
                            child: ListView.builder(
                                scrollDirection: Axis.vertical,
                                shrinkWrap: true,
                                padding: EdgeInsets.only(left: 10, right: 10),
                                itemCount: videoList.length,
                                itemBuilder: (context, index) {
                                  return MovieListItem(
                                      videoList: videoList, index: index);
                                }))
                        : Container(),
                  ]))
            ])));
  }
}
