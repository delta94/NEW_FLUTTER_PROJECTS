import 'dart:async';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.hkmovies/helpers/EndLoopController.dart';
import 'package:seab1ird.hkmovies/models/TypeVideo.model.dart';
import 'package:seab1ird.hkmovies/widgets/views/MovieListItem.dart';
import 'package:seab1ird.hkmovies/widgets/views/RateApp.dart';

class MovieList extends StatefulWidget {
  MovieList({Key key}) : super(key: key);
  MovieListState createState() => MovieListState();
}

class MovieListState extends State<MovieList> {
  double marginTop = 0;

  Future<bool> _onWillPop() {
    Navigator.pop(context, true);
    return null;
  }

  @override
  void initState() {
    super.initState();
    if(kReleaseMode){ // is Release Mode ??
      marginTop = 60;
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

    final AnimatedController _movieIconController = AnimatedController('Untitled', 3);


    final MovieTypeModel args = ModalRoute.of(context).settings.arguments;
    return new WillPopScope(
      onWillPop: _onWillPop,
      child:  Scaffold(
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
            Text(args.name, 
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
            margin: EdgeInsets.only(top: marginTop),
            child: Column(
              children: <Widget>[
                new Expanded(
                  child:  ListView.builder(
                    scrollDirection: Axis.vertical,
                    shrinkWrap: true,
                    padding: EdgeInsets.only(left: 10, right: 10),
                    itemCount: args.movieList.length,
                    itemBuilder: (context, index) {
                      return MovieListItem(args: args, index: index,);
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
