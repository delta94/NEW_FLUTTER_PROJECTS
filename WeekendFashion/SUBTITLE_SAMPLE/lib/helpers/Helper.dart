import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
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

  static getSubItem(List<Positioned> positioneds) {
    if (positioneds.length == 1) return Container();
    return positioneds[0];
  }

  static getItem(List<Positioned> positioneds) {
    if (positioneds.length == 1) return positioneds[0];
    return positioneds[1];
  }

}
