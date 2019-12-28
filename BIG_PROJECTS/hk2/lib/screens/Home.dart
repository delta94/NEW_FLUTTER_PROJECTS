import 'dart:async';
import 'dart:io';

import 'package:firebase_admob/firebase_admob.dart';
import 'package:hkfilms2/models/Ads.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:hkfilms2/screens/DrawerMenu.dart';

class Home extends StatefulWidget {
  Home({Key key}) : super(key: key);
  HomeState createState() => HomeState();
}

class HomeState extends State<Home> with TickerProviderStateMixin{

  AnimationController _retailFilmController;
  Animation _retailFilmAnimation;

  AnimationController _serieFilmController;
  Animation _serieFilmAnimation;

  Future<bool> _onWillPop() {
    InterstitialAd(
      adUnitId: INTERSTITIAL_ID,
      targetingInfo: Ads.targetingInfo,
    )..load()..show();
    
    return showDialog(
      context: context, 
      builder: (context) => new AlertDialog(
        backgroundColor: Colors.white,
        title: new Text('Bạn có muốn thoát ứng dụng?'),
        content: new Text('Bạn chắc chứ?'),
        actions: <Widget>[
          new FlatButton(
            onPressed: () => Navigator.of(context).pop(false),
            child: new Text('Không'),
          ),
          new FlatButton(
            onPressed: () =>  exit(0),
            child: new Text('Có'),
          ),
        ],
      ),
    ) ?? false;
  }

  @override
  void initState() {
    super.initState();
    Ads.showBannerAd();

    _retailFilmController =
        AnimationController(vsync: this, duration: Duration(seconds: 4));

    _retailFilmAnimation = Tween(begin: -1.0, end: 0.0).animate(CurvedAnimation(
      parent: _retailFilmController,
      curve: Curves.fastOutSlowIn,
    ));

    _serieFilmController =
        AnimationController(vsync: this, duration: Duration(seconds: 4));

    _serieFilmAnimation = Tween(begin: 1.0, end: 0.0).animate(CurvedAnimation(
      parent: _retailFilmController,
      curve: Curves.fastOutSlowIn,
    ));

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

    final double width = MediaQuery.of(context).size.width;
    _retailFilmController.forward();
    _serieFilmController.forward();

    return new WillPopScope(
      onWillPop: _onWillPop,
      child:  Scaffold(
      appBar: AppBar(
        title: Text('Phim Hồng Kông Xưa Hay', style: TextStyle(color: Colors.yellow),),
        iconTheme: new IconThemeData(color: Colors.yellow),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
      ),
      drawer: DrawerMenu(),
      body: new Stack(
        children: <Widget>[
          new Container(
            decoration: new BoxDecoration(
              image: new DecorationImage(image: new AssetImage('images/bg.png'), fit: BoxFit.cover,),
            ),
          ),
          new Container(
              padding: EdgeInsets.only(top: 50),
              child: SingleChildScrollView(
                child: Column(children: <Widget>[
                  AnimatedBuilder(
                    animation: _retailFilmController,
                    builder: (BuildContext context, Widget child) {
                      return Transform(
                            transform:
                            Matrix4.translationValues(_retailFilmAnimation.value * width, 0.0, 0.0),
                            child: GestureDetector(
                                onTap: () {
                                  Navigator.pushNamed(context, '/retailfilms');
                                },
                                child:Container(
                                  margin: EdgeInsets.only(top: 10, bottom: 3, left: 70, right: 70),
                                  padding: EdgeInsets.only(top: 5, bottom: 5),
                                  alignment: Alignment.center,
                                  // color: Colors.yellow,
                                  decoration: retailBoxDecoration(),
                                  child: Column(
                                    children: <Widget>[
                                      Image.asset('images/phim_le.png', height: 200, width: 220),
                                      Container(
                                        margin: EdgeInsets.only(bottom: 3),
                                        child: Text("Phim Lẻ", style: TextStyle(fontWeight: FontWeight.bold, color: Colors.pink, fontSize: 25),
                                      )
                                    )],
                                )
                              ),
                            ),
                        );
                      }
                    ),
                    AnimatedBuilder(
                    animation: _serieFilmController,
                    builder: (BuildContext context, Widget child) {
                      return Transform(
                            transform:
                            Matrix4.translationValues(_serieFilmAnimation.value * width, 0.0, 0.0),
                            child: GestureDetector(
                                onTap: () {
                                  Navigator.pushNamed(context, '/seriefilms');
                                },
                                child:Container(
                                  margin: EdgeInsets.only(top: 10, bottom: 3, left: 70, right: 70),
                                  padding: EdgeInsets.only(top: 5, bottom: 5),
                                  alignment: Alignment.center,
                                  // color: Colors.yellow,
                                  decoration: serieBoxDecoration(),
                                  child: Column(
                                      children: <Widget>[
                                        Image.asset('images/phim_bo.png', height: 200, width: 200),
                                        Container(
                                          margin: EdgeInsets.only(top: 5, bottom: 3),
                                          child: Text("Phim Bộ", style: TextStyle(fontWeight: FontWeight.bold, color: Colors.red, fontSize: 25)),
                                        )
                                      ],
                                  )
                              ),
                            ),
                        );
                      }
                    )
                ])
          //     SingleChildScrollView(child: Column(
          //       mainAxisAlignment: MainAxisAlignment.spaceAround,
          //       children: <Widget>[
          //         GestureDetector(
          //             onTap: () {
          //               Navigator.pushNamed(context, '/retailfilms');
          //             },
          //             child:Container(
          //               margin: EdgeInsets.only(top: 10, bottom: 3, left: 70, right: 70),
          //               padding: EdgeInsets.only(top: 5, bottom: 5),
          //               alignment: Alignment.center,
          //               // color: Colors.yellow,
          //               decoration: retailBoxDecoration(),
          //               child: Column(
          //                 children: <Widget>[
          //                   Image.asset('images/phim_le.png', height: 200, width: 220),
          //                   Container(
          //                     margin: EdgeInsets.only(bottom: 3),
          //                     child: Text("Phim Lẻ", style: TextStyle(fontWeight: FontWeight.bold, color: Colors.pink, fontSize: 25),
          //                   )
          //                 )],
          //             )
          //           ),
          //         ),
          //         GestureDetector(
          //             onTap: () {
          //               Navigator.pushNamed(context, '/seriefilms');
          //             },
          //             child: Container(
          //               margin: EdgeInsets.only(top: 10, bottom: 3, left: 70, right: 70),
          //               padding: EdgeInsets.only(top: 10, bottom: 5),
          //               alignment: Alignment.center,
          //               // color: Colors.yellow,
          //               decoration: serieBoxDecoration(),
          //               child: Column(
          //                 children: <Widget>[
          //                   Image.asset('images/phim_bo.png', height: 200, width: 200),
          //                   Container(
          //                     margin: EdgeInsets.only(top: 5, bottom: 3),
          //                     child: Text("Phim Bộ", style: TextStyle(fontWeight: FontWeight.bold, color: Colors.red, fontSize: 25)),
          //                   )
          //                 ],
          //             )
          //           ),
          //         ),
          //         Divider(height: 30), //  
          //       ]
          //     )
          // )
        ),
          )]
    )));
  }
}

BoxDecoration retailBoxDecoration() {
  return BoxDecoration(
    color: Color.fromRGBO(255, 255, 153, 1),
    border: Border.all(
      width: 3.0
    ),
    borderRadius: BorderRadius.all(
        Radius.circular(20.0) //         <--- border radius here
    ),
  );
}

BoxDecoration serieBoxDecoration() {
  return BoxDecoration(
    color: Color.fromRGBO(128, 255, 170, 1),
    border: Border.all(
      width: 3.0
    ),
    borderRadius: BorderRadius.all(
        Radius.circular(20.0) //         <--- border radius here
    ),
  );
}