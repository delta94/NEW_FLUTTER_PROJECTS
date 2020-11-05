import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.disctest/helpers/FlareEndlessController.dart';
import 'package:seab1ird.disctest/models/ColorModel.dart';
import 'package:seab1ird.disctest/models/Food.dart';

class Utils {
  static Widget handTouch;

  static Opacity getImage(String name,
      {double width, bool isFlr: false, bool isShow: true}) {
    var extend = 'png';
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
    final _screenController = FlareEndlessController('Untitled', time);
    return Center(
      child: Container(
        child: FlareActor(
          'images/$imageName.flr',
          alignment: Alignment.center,
          controller: _screenController,
          fit: BoxFit.fill,
        ),
      ),
    );
  }

  static List<ColorModel> getGameColors() {
    return [
      ColorModel.getColor(35, 52, 200, 'blue'),
      ColorModel.getColor(220, 180, 2, 'yellow'),
      ColorModel.getColor(200, 50, 100, 'pink'),
      ColorModel.getColor(30, 150, 23, 'green'),
      ColorModel.getColor(150, 23, 180, 'purple'),
      ColorModel.getColor(200, 30, 10, 'red'),
    ];
  }

  static AssetImage getBackground(String themeColorName) {
    return AssetImage('images/bg_$themeColorName.png');
  }

  static List<Food> getSortedAcidUricFoods(List<Food> foods) {
    foods.sort((a, b) => a.acidContent.compareTo(b.acidContent));
    return foods;
  }
}
