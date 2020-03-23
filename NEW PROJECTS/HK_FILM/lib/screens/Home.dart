import 'dart:async';

import 'package:app_review/app_review.dart';
import 'package:firebase_admob/firebase_admob.dart';
import 'package:firebase_admob_example/helpers/Ads.dart';
import 'package:firebase_admob_example/helpers/CommonFunctions.dart';
import 'package:firebase_admob_example/helpers/EndLoopController.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:firebase_admob_example/screens/DrawerMenu.dart';

class Home extends StatefulWidget {
  Home({Key key}) : super(key: key);
  HomeState createState() => HomeState();
}

class HomeState extends State<Home> with TickerProviderStateMixin{

  Future<bool> _onWillPop() {
    InterstitialAd(
      adUnitId: INTERSTITIAL_ID,
      targetingInfo: Ads.targetingInfo,
    )..load()..show();
    
    return CommonFunctions.onWillPop(context);
  }

  @override
  void initState() {
    super.initState();
    Ads.showBannerAd();
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

    final EndLoopController _loopController1 = EndLoopController('Untitled', 3);
    final EndLoopController _loopController2 = EndLoopController('Untitled', 1);
    final EndLoopController _loopController3 = EndLoopController('Untitled', 3);

    return new WillPopScope(
      onWillPop: _onWillPop,
      child:  Scaffold(
      appBar: AppBar(
        title: 
        Row(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: <Widget>[
            Row(
              children: <Widget>[
                Container(
                  width: 40,
                  height: 40,
                  margin: EdgeInsets.only(right: 5),
                  child: FlareActor("images/movie_icon.flr",
                    alignment: Alignment.center,
                    controller: _loopController1,
                  ),
                ),
                Text('Phim Lẻ Hồng Kông', 
                  style: TextStyle(
                    color: Colors.yellow,
                    decoration: TextDecoration.underline,
                    decorationColor: Colors.redAccent,
                    decorationStyle: TextDecorationStyle.solid,
                    shadows: [
                      Shadow(
                        color: Colors.blue,
                        blurRadius: 2.0,
                        offset: Offset(1.0, 1.0),
                      ),
                    ],)
                ),
              ],
            ),
            GestureDetector(
              child: Container(
                width: 40,
                height: 40,
                child: FlareActor("images/Star.flr",
                  alignment: Alignment.center,
                  controller: _loopController2,
                )
              ),
              onTap: () {
                AppReview.storeListing.then((onValue) {});
              },
            )
          ],
        ),
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
            padding: EdgeInsets.only(left: 10, right: 10, top: 40),
            child: Center(
              child: Column(
                children: <Widget>[
                  Image.asset("images/banner.png", height: 140, width: 200),
                  Text(
                    'Phim Lẻ Hồng Kông Hay:', 
                    style: TextStyle(fontSize: 20, color: Colors.orangeAccent, fontWeight: FontWeight.bold)
                  ),
                  Text(
                    'Tổng hợp danh sách các phim hồng kông xưa hay tuyển chọn.', 
                    style: TextStyle(fontStyle: FontStyle.italic, color: Colors.white, fontWeight: FontWeight.normal)
                  ),
                  SizedBox(height: 20),
                  Material(
                    child: RaisedButton(
                      padding: EdgeInsets.all(10),
                      child: Wrap(
                        children: <Widget>[
                          Container(
                            width: 40,
                            height: 40,
                            margin: EdgeInsets.only(right: 5),
                            child: FlareActor("images/play_movie.flr",
                              alignment: Alignment.center,
                              controller: _loopController3,
                            )
                          ),
                          Text(
                            'Xem Phim', 
                            style: TextStyle(
                              color: Colors.lightGreen, 
                              fontWeight: FontWeight.bold,
                              decoration: TextDecoration.underline,
                              decorationColor: Colors.redAccent,
                              fontSize: 30
                            )
                          ),
                        ],
                      ),
                      color: Colors.yellow[300],
                      onPressed: () => Navigator.pushNamed(context, '/typeMovies'),
                    ),
                  ),
                  SizedBox(height: 30),
                  Text(
                    'Giới thiệu:\n' 
                    , style: TextStyle(
                      color: Colors.redAccent, 
                      backgroundColor: Colors.yellow[100],
                      fontSize: 25, 
                      fontWeight: FontWeight.bold,
                      decoration: TextDecoration.underline,
                      decorationColor: Colors.redAccent,
                    ),),
                  Expanded(
                    child: ListView(
                      children: <Widget>[
                        Center(
                          child: Text(
                          'Chúng tôi tạo ứng dụng này nhằm giúp khán giả tìm và xem lại được những phim lẻ hồng kông lồng tiếng xưa hay và đặc sắc một thời làm say mê mỗi chúng ta trong tuổi thơ, kí ức.\n\n'
                          + 'Chúng tôi hệ thống hoá các phim dưới dạng các menu theo danh sách các diễn viên nổi tiếng.\n\n'
                          + 'Chúng tôi đã tuyển chọn các phim với chất lượng và âm thanh tốt để phục vụ các bạn. \n\n\n' 
                          , style: TextStyle(color: Colors.yellowAccent, fontSize: 20)),
                        ),
                        
                        Divider(),
                      ],
                    ),
                  )
                ]
              )
            )
          )
        ])
      )
    );
  }
}

