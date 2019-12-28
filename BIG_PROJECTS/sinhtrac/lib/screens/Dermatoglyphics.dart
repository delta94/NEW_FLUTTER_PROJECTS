import 'dart:async';
import 'package:firebase_admob/firebase_admob.dart';

import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';
import 'package:vector_math/vector_math.dart' show radians, Vector3;

class Dermatoglyphics extends StatefulWidget {
  createState() => DermatoglyphicsState();
}

class DermatoglyphicsState extends State<Dermatoglyphics> with SingleTickerProviderStateMixin {
  
  AnimationController controller;

  @override
  void initState() {
    super.initState();
    Ads.hideBannerAd();
    Ads.showBanner1Ad();
    
    
    
    controller = AnimationController(duration: Duration(milliseconds: 900), vsync: this);
                  // ..addListener(() => setState(() {}));
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Xem Sinh Trắc Vân Tay', style: TextStyle(color: Colors.yellow),),
        iconTheme: new IconThemeData(color: Colors.yellow),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
        actions: <Widget>[
            IconButton(
              icon: Icon(Icons.home),
              onPressed: () {
                Ads.hideBanner1Ad();
                Ads.showBannerAd();
                Navigator.of(context).pushNamedAndRemoveUntil('/', ModalRoute.withName('/dermatoglyphics'));   
              },
            )
        ]
      ),
      body:RadialAnimation(controller: controller)
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
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));
    return Stack(
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
                    CommonUI.buildAnimatedButton('Vân Nước','btn3', translation, controller, context, '/loops', 30, color: Colors.cyanAccent, image: 'images/nuoc.png'),
                    CommonUI.buildAnimatedButton('Vân Đại Bàng', 'btn1', translation, controller, context, '/whorls', 150, color: Colors.red, image: 'images/daibang.png'),
                    CommonUI.buildAnimatedButton('Vân Núi','btn2', translation, controller, context, '/archs', 270, color: Colors.orange, image: 'images/nui.png'),
                    
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
                              child: Icon(FontAwesomeIcons.angleDoubleRight), 
                              onPressed: (){
                                Ads.hideBanner1Ad();
                                Ads.showBannerAd();
                                CommonUI.close(controller);
                                new Timer(const Duration(milliseconds: 600), () {
                                  Navigator.of(context).pushNamedAndRemoveUntil('/', ModalRoute.withName('/dermatoglyphics'));
                                });
                              },
                              backgroundColor: Colors.blue),
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
                              onPressed: CommonUI.open(controller), 
                              backgroundColor: Colors.transparent,
                            ),
                          ])
                        )
                    )
                
                ])
              );
            })
          )
                  
        ]
    );
  }

}