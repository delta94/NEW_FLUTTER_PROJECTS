import 'dart:async';

import 'package:app_review/app_review.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:sbsinhtrac/models/Ads.dart';
import 'package:sbsinhtrac/models/CommonFunctions.dart';
import 'package:sbsinhtrac/models/EndLoopController.dart';

void main() => runApp(Home());

class Home extends StatefulWidget {
  createState() => HomeState();
}

class HomeState extends State<Home> with SingleTickerProviderStateMixin {
  
  @override
  void initState() {
    super.initState();
    Ads.showBannerAd();
                  // ..addListener(() => setState(() {}));
  }

  Future<bool> _onWillPop() {
    return CommonFunctions.onWillPop(context) ?? false;
  }

  @override
  Widget build(BuildContext context) {
    final EndLoopController _loopController = EndLoopController('Untitled', 1);
    return new WillPopScope(
      onWillPop: _onWillPop,
      child:  Scaffold(
        appBar: AppBar(
          title: Row(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: <Widget>[
            Container(),
            Text("Cẩm Nang Sinh Trắc", style: TextStyle(
                fontSize: 30, 
                fontWeight: FontWeight.bold, 
                color: Colors.yellowAccent,
                decoration: TextDecoration.underline,
                decorationColor: Colors.greenAccent,
                decorationStyle: TextDecorationStyle.solid,
                shadows: [
                  Shadow(
                    color: Colors.black,
                    blurRadius: 10.0,
                    offset: Offset(5.0, 5.0),
                  ),
                ],),),
            GestureDetector(
              child: Container(
                width: 50,
                height: 50,
                child: FlareActor("images/Star.flr",
                  alignment: Alignment.center,
                  controller: _loopController,
                )
              ),
              onTap: () {
                AppReview.storeListing.then((onValue) {});
              },
            )
          ]),
          iconTheme: new IconThemeData(color: Colors.yellowAccent),
          backgroundColor: Colors.black87,
        ),
        body:BodyWidget()
      )
    );
  }

  @override
  void dispose() {
    super.dispose();
  }
}


class BodyWidget extends StatelessWidget {
  final EndLoopController _loopController = EndLoopController('Untitled', 2);

  @override
  Widget build(BuildContext context) {
    return new Stack(
        children: <Widget>[
          new Container(
            decoration: new BoxDecoration(
              image: new DecorationImage(image: new AssetImage('images/bg.jpg'), fit: BoxFit.cover,),
            ),
          ),
          new Container(
            padding: EdgeInsets.all(10),
            child: Column(children: <Widget>[
              Divider(height: 50,),
              Container(
                decoration: new BoxDecoration(
                border: Border.all(width: 5),
                borderRadius: new BorderRadius.all(Radius.circular(20.0)),
                  shape: BoxShape.rectangle,
                  color: Colors.amberAccent
                ),
                child: new ClipRRect(
                  borderRadius: new BorderRadius.circular(30.0),
                  child: Image.asset('images/logo.png', height: 120, width: 120),
                ),
              ),
              Expanded(
                child: Container(
                  padding: EdgeInsets.all(20),
                  child: ListView(
                    children: <Widget>[
                      CommonFunctions.getMenuBox(
                        Row(
                          children: <Widget>[
                            Image.asset('images/info.png', height: 30, width: 30),
                            Text(" Giới Thiệu", style: TextStyle(fontSize: 25, fontWeight: FontWeight.bold, color: Colors.yellowAccent),),
                          ],
                        ),
                        context,
                        '/intro'
                      ),
                      CommonFunctions.getMenuBox(
                        Row(
                          children: <Widget>[
                            Container(
                              width: 50,
                              height: 50,
                              child: FlareActor("images/SinhTrac.flr",
                                alignment: Alignment.center,
                                controller: _loopController,
                              )
                            ),
                            Text(" Xem Sinh Trắc", style: 
                                TextStyle(
                                  fontSize: 25, 
                                  fontWeight: FontWeight.bold, 
                                  color: Color.fromRGBO(0, 255, 255, 1),
                                  decoration: TextDecoration.underline,
                                  decorationColor: Colors.limeAccent,
                                  decorationStyle: TextDecorationStyle.solid,),
                            ),
                          ],
                        ),
                        context,
                        ''
                      ),
                      CommonFunctions.getMenuBox(
                        Row(
                          children: <Widget>[
                            Image.asset('images/history.png', height: 30, width: 30),
                            Text(" Lịch Sử", style: TextStyle(fontSize: 25, fontWeight: FontWeight.bold, color: Colors.orangeAccent),),
                          ],
                        ),
                        context,
                        ''
                      ),
                      CommonFunctions.getMenuBox(
                        Row(
                          children: <Widget>[
                            Image.asset('images/star.png', height: 30, width: 30),
                            Text(" Rate 5 Sao", style: TextStyle(fontSize: 25, fontWeight: FontWeight.bold, color: Colors.lightGreenAccent),),
                          ],
                        ),
                        context,
                        ''
                      ),
                      CommonFunctions.getMenuBox(
                        Row(
                          children: <Widget>[
                            Image.asset('images/exit.png', height: 30, width: 30),
                            Text(" Thoát", style: TextStyle(fontSize: 25, fontWeight: FontWeight.bold, color: Colors.red),),
                          ],
                        ),context,
                        ''
                      )
                    ])
                )
              )
            ],)
          )
        ]);
  }


}

