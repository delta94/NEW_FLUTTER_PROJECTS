import 'dart:async';

import 'package:firebase_admob/firebase_admob.dart';
import 'package:flutter/foundation.dart';
import 'package:seab1ird.vncomedies/helpers/Ads.dart';
import 'package:seab1ird.vncomedies/helpers/CommonFunctions.dart';
import 'package:seab1ird.vncomedies/helpers/EndLoopController.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.vncomedies/screens/DrawerMenu.dart';
import 'package:seab1ird.vncomedies/widgets/views/RateApp.dart';

class Home extends StatefulWidget {
  Home({Key key}) : super(key: key);
  HomeState createState() => HomeState();
}

class HomeState extends State<Home> with TickerProviderStateMixin{
  double marginTop = 0;

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
    if(kReleaseMode){ // is Release Mode ??
      Ads.showBannerAd();
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
    final AnimatedController _playIconController = AnimatedController('Untitled', 3);

    return new WillPopScope(
      onWillPop: _onWillPop,
      child:  Scaffold(
      appBar: AppBar(
        title: 
        Row(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: <Widget>[
            Expanded(
              child: Row(
                mainAxisAlignment: MainAxisAlignment.center,
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
                  Text('Hài Việt Hay', 
                    style: TextStyle(
                      fontSize: 25,
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
            ),
            RateApp()
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
            padding: EdgeInsets.only(left: 10, right: 10, top: this.marginTop),
            child: Center(
              child: Column(
                children: <Widget>[
                  ClipRRect(
                    child: Image.asset("images/banner.png", width: MediaQuery.of(context).size.width * 0.9 ),
                    borderRadius: BorderRadius.circular(10),
                  ),
                  Padding(
                    padding: const EdgeInsets.only(top: 10),
                    child: Wrap(
                      children: <Widget>[
                        Text(
                          'Hài Việt Hay - Hài Tổng Hợp Hay:', 
                          style: TextStyle(
                            fontSize: 20, 
                            color: Colors.orange, 
                            fontWeight: FontWeight.bold,
                            decoration: TextDecoration.underline,
                            decorationColor: Colors.yellowAccent,
                            decorationStyle: TextDecorationStyle.solid,
                            shadows: [
                              Shadow(
                                color: Colors.blue,
                                blurRadius: 2.0,
                                offset: Offset(0.5, 0.5),
                              ),
                            ],
                          )
                        ),
                      ],
                    ),
                  ),
                  Padding(
                    padding: const EdgeInsets.only(top: 10),
                    child: Text(
                      'Tổng hợp danh sách các hài hay tuyển chọn từ xưa đến nay.', 
                      style: TextStyle(fontStyle: FontStyle.italic, color: Colors.white, fontWeight: FontWeight.normal)
                    ),
                  ),
                  SizedBox(height: 20),
                  RaisedButton(
                    padding: EdgeInsets.all(10),
                    shape: new RoundedRectangleBorder(
                      borderRadius: new BorderRadius.circular(30.0),
                      side: BorderSide(color: Colors.blueAccent, width: 2)
                    ),
                    child: Wrap(
                      children: <Widget>[
                        Container(
                          width: 30,
                          height: 30,
                          margin: EdgeInsets.only(right: 5),
                          child: FlareActor("images/movie_icon.flr",
                            alignment: Alignment.center,
                            controller: _playIconController,
                          )
                        ),
                        Container(
                          child: Text(
                            'Xem Hài', 
                            style: TextStyle(
                              color: Colors.redAccent, 
                              fontWeight: FontWeight.bold,
                              decoration: TextDecoration.underline,
                              decorationColor: Colors.redAccent,
                              fontSize: 23
                            )
                          ),
                        ),
                      ],
                    ),
                    color: Colors.yellow[200],
                    onPressed: () => Navigator.pushNamed(context, '/typeMovies'),
                  ),
                  SizedBox(height: 10),
                  Expanded(
                    child: ListView(
                      children: <Widget>[
                        Padding(
                          padding: EdgeInsets.all(10),
                          child: Text(
                          'Chúng tôi tạo ứng dụng này nhằm giúp khán giả tìm và xem lại được những Hài Việt Hay - Hài Tổng Hợp xưa và nay hay và đặc sắc.\n\n'
                          + 'Chúng tôi hệ thống hoá các hài dưới dạng các menu theo danh sách các danh hài nổi tiếng.\n\n'
                          + 'Chúng tôi đã tuyển chọn các hài với chất lượng và âm thanh tốt để phục vụ các bạn. \n\n\n' 
                          , style: TextStyle(color: Colors.yellowAccent, fontSize: 15)),
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
