import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/widgets.dart';
import 'package:seabird.goutfood/helpers/FlareEndlessController.dart';
import 'package:seabird.goutfood/models/Food.dart';

class Utils {
  static Widget handTouch;

  static Opacity getImage(String name,
      {double width, bool isFlr = false, bool isShow = true}) {
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

  static Widget getFlareWidget(String imageName, double time) {
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

  static List<Food> getSortedAcidUricFoods(List<Food> foods) {
    foods.sort((a, b) => a.acidContent.compareTo(b.acidContent));
    return foods;
  }
}
