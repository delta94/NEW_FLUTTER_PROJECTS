import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';
import 'package:vector_math/vector_math.dart' show radians, Vector3;
import 'package:font_awesome_flutter/font_awesome_flutter.dart';

void main() => runApp(Home());

class Home extends StatefulWidget {
  createState() => HomeState();
}

class HomeState extends State<Home> with SingleTickerProviderStateMixin {
  
  AnimationController controller;

  @override
  void initState() {
    super.initState();
    Ads.showBannerAd();
    controller = AnimationController(duration: Duration(milliseconds: 900), vsync: this);
                  // ..addListener(() => setState(() {}));
  }

  Future<bool> _onWillPop() {
    return CommonUI.onWillPop(context) ?? false;
  }

  @override
  Widget build(BuildContext context) {
    return new WillPopScope(
      onWillPop: _onWillPop,
      child:  Scaffold(
      appBar: AppBar(
        title: Text('Sinh Trắc Vân Tay', style: TextStyle(color: Colors.yellow),),
        iconTheme: new IconThemeData(color: Colors.yellow),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
      ),
      body:RadialAnimation(controller: controller)
      )
    );
  }

  @override
  void dispose() {
    controller.dispose();
    super.dispose();
  }
}


class RadialAnimation extends StatelessWidget {
  RadialAnimation({ Key key, this.controller }) :

  translation = CommonUI.translation(controller),
  scale = CommonUI.scale(controller),
  rotation = CommonUI.rotation(controller),
    
  super(key: key);

  final AnimationController controller;
  final Animation<double> rotation;
  final Animation<double> translation;
  final Animation<double> scale;

  @override
  Widget build(BuildContext context) {
    CommonUI.open(controller);
    return new Stack(
        children: <Widget>[
          new Container(
            decoration: new BoxDecoration(
              image: new DecorationImage(image: new AssetImage('images/bg.png'), fit: BoxFit.cover,),
            ),
          ),
          new Center(
            child: AnimatedBuilder(
              animation: controller,
              builder: (context, widget) { 
                return Transform.rotate(
                  angle: radians(rotation.value),
                  child: Stack(
                  alignment: Alignment.center,
                  children: <Widget>[
                    Container(),
                    CommonUI.buildAnimatedButton('Lịch Sử', 'btn1', translation, controller, context, '/history', 0, color: Colors.orange, image: 'images/history.png'),
                    CommonUI.buildAnimatedButton('Đáng giá','btn2', translation, controller, context, 'review', 90, color: Colors.yellow, image: 'images/star.png'),
                    CommonUI.buildAnimatedButton('Giới Thiệu','btn3', translation, controller, context, '/intro', 180, color: Color.fromRGBO(102, 255, 102, 1), image: 'images/info.png'),
                    CommonUI.buildAnimatedButton('Sinh Trắc','btn4', translation, controller, context, '/dermatoglyphics', 270, color: Color.fromRGBO(255, 0, 102, 1), image: 'images/sinhtrac.png'),
                    
                    Transform.scale(
                      scale: scale.value - 1,
                      child: Container(
                        height: 90.0,
                        child: Column(
                          mainAxisAlignment: MainAxisAlignment.spaceBetween,
                          children: <Widget>[
                            Text("ʇɐ̗oɥ⊥", style: TextStyle(color: Colors.red, fontWeight: FontWeight.bold, fontSize: 20, decoration: TextDecoration.none)),
                            FloatingActionButton(
                              heroTag: 'btnClose',
                              child: Icon(FontAwesomeIcons.timesCircle), 
                              onPressed: (){
                                CommonUI.close(controller);
                                new Timer(const Duration(milliseconds: 1300), () {
                                  CommonUI.onWillPop(context);
                                });
                              },
                              backgroundColor: Colors.red),
                          ])
                        )
                    ),

                    Transform.scale(
                      scale: scale.value,
                      child: Container(
                              height: 70.0,
                              child: Column(
                                children: <Widget>[
                                  FloatingActionButton(
                                    heroTag: 'btnOpen',
                                    child: new ClipRRect(
                                      borderRadius: new BorderRadius.circular(25.0),
                                      child: Image.asset('images/main_icon1.png'), 
                                    ),
                                    onPressed: CommonUI.open(controller), 
                                    backgroundColor: Colors.transparent,),
                                    Text("Mở Ứng Dụng", style: TextStyle(color: Colors.red, fontWeight: FontWeight.bold, fontSize: 12, decoration: TextDecoration.none))
                                ])
                              )
                    ),
                ])
              );
            })
          )
        ]);
  }


}

