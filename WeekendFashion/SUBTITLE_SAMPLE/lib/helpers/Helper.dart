import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:seabird.weekendfashion/enums/ItemType.dart';
import 'package:seabird.weekendfashion/models/DeviceSize.dart';

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

  static Positioned getItem(List<Positioned> positioneds) {
    if (positioneds.length == 1) return positioneds[0];
    return positioneds[1];
  }

  static Positioned getInsideItem(
      List<Positioned> positioneds, GameProvider gameProvider) {
    if (gameProvider.selectedItemGirlList[gameProvider.currentGirlIndex]
            [ItemType.JACKET][null] ==
        null) {
      return positioneds[0];
    } else {
      return positioneds[1];
    }
  }

  static getItemTypeIndex(int rawIndex, int len, bool isNext) {
    if (isNext) {
      rawIndex += 1;
    } else {
      rawIndex -= 1;
    }

    if (rawIndex < 0) {
      return len - 1;
    } else if (rawIndex == len) {
      return 0;
    } else {
      return rawIndex;
    }
  }
}
