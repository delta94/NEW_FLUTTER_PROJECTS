import 'dart:async';

import 'package:app_review/app_review.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seabird.biometry/helpers/Ads.dart';
import 'package:seabird.biometry/helpers/CommonFunctions.dart';
import 'package:seabird.biometry/helpers/EndLoopController.dart';

void main() => runApp(Home());

class Home extends StatefulWidget {
  createState() => HomeState();
}

class HomeState extends State<Home> with SingleTickerProviderStateMixin {
  
  @override
  void initState() {
    super.initState();
    Ads.showBannerAd();
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
            Image.asset('images/icon_title.png', height: 25,),
            FittedBox(fit:BoxFit.fitWidth, 
              child: Text("Cẩm Nang Sinh Trắc", style: TextStyle(
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
                ],),)
            ),
            GestureDetector(
              child: Container(
                width: 40,
                height: 40,
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
    num deviceHeight = MediaQuery.of(context).size.height;
    num deviceWidth = MediaQuery.of(context).size.width;

    return new Stack(
        children: <Widget>[
          new Container(
            decoration: new BoxDecoration(
              image: new DecorationImage(image: new AssetImage('images/background.jpg'), fit: BoxFit.cover,),
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
                  child: Image.asset('images/logo.png', height: deviceHeight/8),
                ),
              ),
              Expanded(
                child: Container(
                  padding: EdgeInsets.only(top: 10),
                  child: ListView(
                    children: <Widget>[
                      CommonFunctions.getMenuBox(
                        Row(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: <Widget>[
                            Image.asset('images/info.png', height: 30, width: 30),
                            Text(" Giới Thiệu ", style: TextStyle(fontSize: 25, fontWeight: FontWeight.bold, color: Color.fromRGBO(0, 255, 255, 1),),),
                          ],
                        ),
                        context, '/intro'
                      ),
                      CommonFunctions.getMenuBox(
                        Row(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: <Widget>[
                            Container(
                              width: 50,
                              height: 50,
                              child: FlareActor("images/SinhTrac.flr",
                                alignment: Alignment.center,
                                controller: _loopController,
                              )
                            ),
                            Container(
                              width: deviceWidth - 120,
                              child: FittedBox(fit:BoxFit.fitWidth,
                                child: Text(" Tra Cứu Sinh Trắc ", style: 
                                  TextStyle(
                                    fontWeight: FontWeight.bold, 
                                    color: Colors.yellowAccent,
                                    decoration: TextDecoration.underline,
                                    decorationColor: Colors.limeAccent,
                                    decorationStyle: TextDecorationStyle.solid,),
                                ),
                              ),
                            )
                            
                          ],
                        ),
                        context,
                        '/mainTypes'
                      ),
                      CommonFunctions.getMenuBox(
                        Row(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: <Widget>[
                            Image.asset('images/history.png', height: 30, width: 30),
                            Text(" Lịch Sử ", style: TextStyle(fontSize: 25, fontWeight: FontWeight.bold, color: Colors.orangeAccent),),
                          ],
                        ),
                        context,
                        '/history'
                      ),
                      Container(
                        padding: EdgeInsets.only(left: 10, top: 10, bottom: 10),
                        margin: EdgeInsets.only(bottom: 5),
                        alignment: Alignment.center,
                        decoration: CommonFunctions.boxDecoration(),
                        child: GestureDetector(
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.center,
                            children: <Widget>[
                              Image.asset('images/star.png', height: 30, width: 30),
                              Text(" Rate 5 Sao ", style: TextStyle(fontSize: 25, fontWeight: FontWeight.bold, color: Colors.lightGreenAccent),),
                            ],
                          ),
                          onTap: (){
                            AppReview.storeListing.then((onValue) {});
                          },
                        )
                      ),
                      Container(
                        padding: EdgeInsets.only(left: 10, top: 10, bottom: 10),
                        margin: EdgeInsets.only(bottom: 5),
                        alignment: Alignment.center,
                        decoration: CommonFunctions.boxDecoration(),
                        child: GestureDetector(
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.center,
                            children: <Widget>[
                              Image.asset('images/exit.png', height: 30, width: 30),
                              Text(" Thoát ", style: TextStyle(fontSize: 25, fontWeight: FontWeight.bold, color: Colors.red),),
                            ],
                          ),
                          onTap: (){
                            return CommonFunctions.onWillPop(context);
                          },
                        )
                      ),
                    ])
                )
              )
            ],)
          )
        ]);
  }


}

