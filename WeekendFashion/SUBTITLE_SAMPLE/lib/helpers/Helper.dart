import 'dart:async';

import 'package:flutter/cupertino.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/models/DeviceSize.dart';

import 'GameProvider.dart';

class Helper {
  static getDeviceSize(BuildContext context) {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);
    Size tempSize = MediaQuery.of(context).size;
    gameProvider.deviceSize = new DeviceSize(tempSize.height, tempSize.width);
  }

  static changScreenAnimation(AnimationController changingScreenController,
      Animation<double> changingScreenAnimation, String path, BuildContext context) {
    changingScreenController.forward();
    changingScreenAnimation.addStatusListener((status) {
      if (status == AnimationStatus.completed) {
        Timer(Duration(seconds: 1), () {
          changingScreenController.reverse();
        });
      }
    });

    Timer(Duration(milliseconds: 1800), () {
      Navigator.pushNamed(context, path);
    });
  }
}
