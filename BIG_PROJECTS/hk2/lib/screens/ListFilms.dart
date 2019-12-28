import 'dart:async';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:hkfilms2/models/Ads.dart';
import 'package:hkfilms2/models/TypeVideo.model.dart';
import 'package:hkfilms2/models/VideoInfo.model.dart';

const THUMBNAIL_URL_ROOT = "https://i3.ytimg.com/vi/";
const THUMNAIL_SUFFIX = "/mqdefault.jpg";

class ListFilms extends StatefulWidget {
  ListFilms({Key key}) : super(key: key);
  ListFilmsState createState() => ListFilmsState();
}

class ListFilmsState extends State<ListFilms> {

  Future<bool> _onWillPop() {
    Navigator.pop(context, true);
  }

  @override
  void initState() {
    super.initState();
    Ads.showInterstitialAd();
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

    final TypeVideoModel args = ModalRoute.of(context).settings.arguments;
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
          new Center(
            child: Column(
              children: <Widget>[
                new Expanded(
                  child:  ListView.builder(
                          scrollDirection: Axis.vertical,
                          shrinkWrap: true,
                          padding: EdgeInsets.only(top: 50, left: 10, right: 10),
                          itemCount: args.filmList.length,
                          itemBuilder: (context, index) {
                            return GestureDetector(
                              onTap: () { Navigator.pushNamed(context, '/detail', arguments: VideoInfoModel(args.filmList[index]['title'], args.filmList[index]['content'], args.filmList[index]['videoKey'])); },
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
                                        Image.network(THUMBNAIL_URL_ROOT + args.filmList[index]['videoKey'] + THUMNAIL_SUFFIX, height: 65, width: 120),
                                        Expanded(
                                          child:
                                            Container(
                                              margin: EdgeInsets.only(left: 5),
                                              child: Text(args.filmList[index]['title'], style: TextStyle(fontWeight: FontWeight.bold, color: Colors.yellow)),
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
          )
        ]
      )
    ));
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