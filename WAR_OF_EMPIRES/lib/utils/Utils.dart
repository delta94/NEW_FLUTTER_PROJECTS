import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.disctest/view_models/GameProvider.dart';
import 'package:seab1ird.disctest/helpers/FlareEndlessController.dart';
import 'package:seab1ird.disctest/models/Cell.dart';
import 'package:seab1ird.disctest/models/Character.dart';
import 'package:seab1ird.disctest/models/CharacterType.dart';

class Utils {
  static Widget handTouch;
  static Size deviceSize;

  static getImage(String name,
      {double width, bool isFlr = false, bool isShow = true}) {
    String extend = 'png';
    if (isFlr) {
      extend = 'flr';
      return getFlareWidget(name, 2);
    }
    return Opacity(
        opacity: isShow ? 1 : 0,
        child: Image.asset('images/$name.$extend', width: width));
  }

  static Color getOppositeColor(Color color) {
    if ((color.red * 0.299 + color.green * 0.587 + color.blue * 0.114) > 186) {
      return Color.fromRGBO(0, 0, 0, 1);
    } else {
      return Color.fromRGBO(255, 255, 255, 1);
    }
  }

  static getFlareWidget(String imageName, double time) {
    final FlareEndlessController _screenController =
        FlareEndlessController('Untitled', time);
    return Center(
      child: Container(
        child: FlareActor(
          "images/$imageName.flr",
          alignment: Alignment.center,
          controller: _screenController,
          fit: BoxFit.fill,
        ),
      ),
    );
  }

  static getBackground(String themeColorName) {
    return AssetImage('images/bg_$themeColorName.png');
  }

  static bool isIpad() {
    return deviceSize.width > 700 &&
        deviceSize.width / deviceSize.height > 0.65;
  }

  static double ipadIconSize() {
    return deviceSize.width / 16;
  }

  static double ipadFontSize() {
    return deviceSize.width / 25;
  }
}
