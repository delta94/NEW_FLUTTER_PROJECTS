import 'dart:async';

import 'package:dio/dio.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.hkmovies/helpers/EndLoopController.dart';
import 'package:seab1ird.hkmovies/widgets/views/RateApp.dart';
import 'package:seab1ird.hkmovies/widgets/views/TypeListItem.dart';
import 'package:seab1ird.hkmovies/helpers/Ads.dart';

class MovieTypes extends StatefulWidget {
  MovieTypes({Key key}) : super(key: key);
  MovieTypesState createState() => MovieTypesState();
}

class MovieTypesState extends State<MovieTypes> {
  String message = 'Đang Tải...';
  final dio = new Dio();
  List objectList = new List();
  bool isLoading = false;
  double marginTop = 0;

  @override
  void initState() {
    super.initState();
    if(Ads.kReleaseMode){ // is Release Mode ??
      marginTop = 60;
    }
    
    this._getData();

    Timer(Duration(seconds: 6), () {
      setState(() {
       message = "Vui lòng kết nối Wifi. Thanks 😘😘😘";
      });
    });

    Timer.periodic(new Duration(seconds: 4), (timer) {
      if(objectList.length == 0){
        _getData();
      }
    });
  }

  void _getData() async {
    setState(() {
      isLoading = true;
    });

    final response = await dio.get('https://portaldata-32e82.firebaseapp.com/api/v1/retailHKMovies');
    
    setState(() {
      isLoading = false;
      objectList = response.data;
      //Toast.show('ddddd: ' + items.length.toString(), context);
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
          opacity: isLoading ? 1.0 : 0,
          child: Text(message, style: TextStyle(color: Colors.yellowAccent, fontWeight: FontWeight.bold),)
        ),
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));

    final AnimatedController _movieIconController = AnimatedController('Untitled', 3);

    return new Scaffold(
      appBar: AppBar(
        title: Row(
          children: <Widget>[
            Container(
              width: 30,
              height: 30,
              margin: EdgeInsets.only(right: 5),
              child: FlareActor("images/app_icon.flr",
                alignment: Alignment.center,
                controller: _movieIconController,
              ),
            ),
            Text('Danh sách Diễn viên', 
              style: TextStyle(
                fontSize: 17,
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
                ],)
              ),
          ],
        ),
        iconTheme: new IconThemeData(color: Colors.amber),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
        actions: <Widget>[RateApp()]
      ),
      body: new Stack(
        children: <Widget>[
          new Container(
            decoration: new BoxDecoration(
              image: new DecorationImage(image: new AssetImage('images/bg.png'), fit: BoxFit.cover,),
            ),
          ),
          new Container(
            padding: EdgeInsets.only(top: this.marginTop),
            child: new GridView.builder(
              itemCount: objectList.length + 1,
              gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                crossAxisCount: 2, 
                childAspectRatio: 1.2,
                mainAxisSpacing: 20
              ),
              itemBuilder: (BuildContext context, int index) {
                if (index == objectList.length) {
                  return _buildProgressIndicator();
                } else {
                  return TypeListItem(objectList: objectList, index: index);
                }
              }
            )
          )
        ]
      )
    );
  }
}
