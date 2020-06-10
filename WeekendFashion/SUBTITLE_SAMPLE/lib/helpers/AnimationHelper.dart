import 'dart:async';

import 'package:flutter/widgets.dart';

class AnimationHelper{
  static changeScreenAnimation(AnimationController changingScreenController,
      String path, BuildContext context) {
    changingScreenController.forward();
    changingScreenController.addStatusListener((status) {
      if (status == AnimationStatus.completed) {
        Timer(Duration(seconds: 1), () {
          changingScreenController.reverse();
        });
      }
    });

    Timer(Duration(milliseconds: 600), () {
      Navigator.pushNamed(context, path);
    });
  }

  static AnimationController getAnimationController(TickerProvider tickerProvider, [int time]){
    return AnimationController(vsync: tickerProvider, duration: Duration(milliseconds: time != null ? time : 1500));
  }

  // static Animation<double> getInitScreenAnimation(AnimationController initScreenController){
  //   return AnimationController(vsync: tickerProvider, duration: Duration(milliseconds: 500));
  // }
}