import 'dart:async';

import 'package:dio/dio.dart';
import 'package:firebase_admob/firebase_admob.dart';
import 'package:swswhaitonghop/models/Ads.dart';
import 'package:swswhaitonghop/models/Constant.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:swswhaitonghop/models/TypeVideo.model.dart';
import 'package:swswhaitonghop/models/VideoInfo.model.dart';

const THUMBNAIL_URL_ROOT = "https://i3.ytimg.com/vi/";
const THUMNAIL_SUFFIX = "/mqdefault.jpg";

class ListFilms extends StatefulWidget {
  ListFilms({Key key}) : super(key: key);
  ListFilmsState createState() => ListFilmsState();
}

class ListFilmsState extends State<ListFilms> {
  bool isYTLink = false;
  int total = 0;
  String nextPageToken = '';
  ScrollController _scrollController = new ScrollController();
  bool isLoading = false;
  String title = '';
  String playListId = '';
  List items = new List();
  final dio = new Dio();
  String message = 'Đang Tải...';

  Future<bool> _onWillPop() {
    Navigator.pop(context, true);
  }

  @override
  void initState() {
    super.initState();

    InterstitialAd(
      adUnitId: INTERSTITIAL_ID,
      targetingInfo: Ads.targetingInfo,
    )..load()..show();

    _scrollController.addListener(() {
      if (_scrollController.position.pixels ==
          _scrollController.position.maxScrollExtent) {
        _getMoreData();
      }
    });

    Timer(Duration(seconds: 3), () {
      setState(() {
       message = "Vui lòng kết nối internet. Thanks 😘😘😘";
      });
    });
  }

  @override
  void dispose() {
    super.dispose();
  }

  Widget _buildProgressIndicator() {
    return new Padding(
      padding: const EdgeInsets.all(8.0),
      child: new Center(
        child: new Opacity(
          opacity: isLoading ? 1.0 : 00,
          child: Text(message, style: TextStyle(color: Colors.yellowAccent, fontWeight: FontWeight.bold))
        ),
      ),
    );
  }

  void _getMoreData() async {
    if (!isLoading) {
      setState(() {
        isLoading = true;
      });
 
      if(nextPageToken != null && playListId != null){
        final response = await dio.get(Constant.getYTPlayListItemsLink(playListId, nextPageToken));
        List tempList = new List();
        total = response.data['pageInfo']['totalResults'];
        nextPageToken = response.data['nextPageToken'];
        for (int i = 0; i < response.data['items'].length; i++) {
          if(response.data['items'][i]['snippet']['thumbnails'] != null){
            tempList.add(response.data['items'][i]);
          }
        }

        setState(() {
          isLoading = false;
          items.addAll(tempList);
        });
      } else {
        isLoading = false;
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));

    final TypeVideoModel args = ModalRoute.of(context).settings.arguments;
    if(args.filmList.length == 1){
      isYTLink = true;
      playListId = args.filmList[0].videoKey;
      
      _getMoreData();
    } else {
      isYTLink = false;
    }


    return new WillPopScope(
      onWillPop: _onWillPop,
      child:  Scaffold(
      appBar: AppBar(
        title: Text(args.name, style: TextStyle(color: Color.fromRGBO(210, 255, 77, 1)),),
        iconTheme: new IconThemeData(color: Color.fromRGBO(210, 255, 77, 1)),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
      ),
      body: new Stack(
        children: <Widget>[
          new Container(
            decoration: new BoxDecoration(
              image: new DecorationImage(image: new AssetImage('images/bg.png'), fit: BoxFit.cover,),
            ),
          ),
          getVideos(args)
        ]
      )
    ));
  }

  getVideos(TypeVideoModel args){
    if(isYTLink){
      return new Container(
        padding: EdgeInsets.only(top: 60, bottom: 0),
        child: new ListView.builder(
          //+1 for progressbar
          itemCount: items.length + 1,
          itemBuilder: (BuildContext context, int index) {
            if (index == items.length) {
              return _buildProgressIndicator();
            } else {
              return GestureDetector(
                onTap: () { Navigator.pushNamed(context, '/detail', arguments: VideoInfoModel(items[index]['snippet']['title'], items[index]['snippet']['title'], items[index]['contentDetails']['videoId'])); },
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: <Widget>[
                    Container(
                      padding: EdgeInsets.only(left: 10, top: 10, bottom: 10),
                      alignment: Alignment.center,
                      // color: Colors.yellow,
                      decoration: myBoxDecoration(),
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: <Widget>[
                          Image.network(Constant.getYTThumbnailByVideoId(items[index]['contentDetails']['videoId']), height: 60, width: 110),
                          Expanded(
                            child:
                              Container(
                                margin: EdgeInsets.only(left: 5),
                                child: Text(items[index]['snippet']['title'], style: TextStyle(fontWeight: FontWeight.bold, color: Colors.yellow)),
                              )
                          )
                        ],
                      )
                    ),
                    Divider(height: 10), //  
                  ]
                )
              );
            }
          },
          controller: _scrollController,
        )
      );
    } else {
      return new Center(
        child: Column(
          children: <Widget>[
            new Expanded(
              child:  ListView.builder(
                scrollDirection: Axis.vertical,
                shrinkWrap: true,
                padding: EdgeInsets.only(top: 60, left: 10, right: 10),
                itemCount: args.filmList.length,
                itemBuilder: (context, index) {
                  return GestureDetector(
                    onTap: () { Navigator.pushNamed(context, '/detail', arguments: VideoInfoModel(args.filmList[index].title, args.filmList[index].content, args.filmList[index].videoKey)); },
                    child: Column(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: <Widget>[
                        Container(
                          padding: EdgeInsets.only(left: 10, top: 3, bottom: 3),
                          alignment: Alignment.center,
                          // color: Colors.yellow,
                          decoration: myBoxDecoration(),
                          child: Row(
                            children: <Widget>[
                              Image.network(THUMBNAIL_URL_ROOT + args.filmList[index].videoKey + THUMNAIL_SUFFIX, height: 65, width: 120),
                              Expanded(
                                child:
                                  Container(
                                    margin: EdgeInsets.only(left: 5),
                                    child: Text(args.filmList[index].title, style: TextStyle(fontWeight: FontWeight.bold, color: Colors.yellow)),
                                  )
                              )
                            ],
                          )
                        ),
                        Divider(height: 10), //  
                      ]
                    )
                  );
                }
              )
            ),
        ])
      );
    }
  }
}

BoxDecoration myBoxDecoration() {
  return BoxDecoration(
    color: Color.fromRGBO(50, 50, 50, 1),
    border: Border.all(
      width: 3.0,
    ),
    borderRadius: BorderRadius.all(
        Radius.circular(5.0) //         <--- border radius here
    ),
  );
}

