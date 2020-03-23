import 'dart:async';
import 'package:firebase_admob_example/helpers/CommonFunctions.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:firebase_admob_example/models/TypeVideo.model.dart';
import 'package:firebase_admob_example/models/VideoInfo.model.dart';

class ListMovies extends StatefulWidget {
  ListMovies({Key key}) : super(key: key);
  ListMoviesState createState() => ListMoviesState();
}

class ListMoviesState extends State<ListMovies> {

  Future<bool> _onWillPop() {
    Navigator.pop(context, true);
  }

  @override
  void initState() {
    super.initState();
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
          new Container(
            margin: EdgeInsets.only(top: 10),
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
                              onTap: () { Navigator.pushNamed(context, '/movie', arguments: MovieInfoModel(args.filmList[index]['title'], args.filmList[index]['content'], args.filmList[index]['videoKey'])); },
                              child: Column(
                                children: <Widget>[
                                  Container(
                                    padding: EdgeInsets.only(left: 10, top: 3, bottom: 3),
                                    alignment: Alignment.center,
                                    decoration: CommonFunctions.boxDecoration(),
                                    child: Row(
                                      children: <Widget>[
                                        Image.network(CommonFunctions.getImageUrl(args.filmList[index]['videoKey']), height: 65, width: 120),
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