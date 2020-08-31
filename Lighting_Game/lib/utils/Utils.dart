import 'dart:math';

import 'package:com.seab1ird.showyourself/enum/CellType.dart';
import 'package:com.seab1ird.showyourself/enum/Direction.dart';
import 'package:com.seab1ird.showyourself/helpers/FlareEndlessController.dart';
import 'package:com.seab1ird.showyourself/model/Cell.dart';
import 'package:com.seab1ird.showyourself/model/ColorModel.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/widgets.dart';

class Utils {
  static Widget handTouch;
  static getRandomDirection() {
    var random = new Random();
    int index = random.nextInt(4);
    return Direction.values[index];
  }

  static int getDirectionIndex(Direction direction) {
    int index = Direction.values.indexOf(direction);
    return index == -1 ? 0 : index;
  }

  static Direction getNextDirection(Direction currentDirection) {
    int currentDirectionIndex = Utils.getDirectionIndex(currentDirection);
    int newDirectionIndex = currentDirectionIndex + 1;
    if (newDirectionIndex > 3) newDirectionIndex = 0;
    return Direction.values[newDirectionIndex];
  }

  static isSameDirections(Cell cell) {
    bool isSameDirections = false;
    if (cell.cellType == CellType.LINE) {
      if (cell.userDirection == Direction.BOTTOM ||
          cell.userDirection == Direction.TOP) {
        if (cell.rightDirection == Direction.BOTTOM ||
            cell.rightDirection == Direction.TOP)
          isSameDirections = true;
        else
          isSameDirections = false;
      } else {
        if (cell.rightDirection == Direction.RIGHT ||
            cell.rightDirection == Direction.LEFT)
          isSameDirections = true;
        else
          isSameDirections = false;
      }
    } else
      isSameDirections = cell.userDirection == cell.rightDirection;

    return isSameDirections;
  }

  static getImage(String name,
      {double width, bool isFlr: false, bool isShow: true}) {
    String extend = 'png';
    if (isFlr) {
      extend = 'flr';
      return getFlareWidget(name, 2);
    }
    return Opacity(
        opacity: isShow ? 1 : 0,
        child: Image.asset('asset/images/$name.$extend', width: width));
  }

  static Color getOppositeColor(Color color) {
    if ((color.red * 0.299 + color.green * 0.587 + color.blue * 0.114) > 186) {
      return Color.fromRGBO(0, 0, 0, 1);
    } else
      return Color.fromRGBO(255, 255, 255, 1);
  }

  static setHandTouchWidget() {
    final FlareEndlessController _screenController =
        FlareEndlessController('Untitled', 1.0);
    handTouch = Center(
      child: Container(
        child: FlareActor(
          "asset/images/hand_touch.flr",
          alignment: Alignment.center,
          controller: _screenController,
          fit: BoxFit.fill,
        ),
      ),
    );
  }

  static getFlareWidget(String imageName, double time) {
    final FlareEndlessController _screenController =
        FlareEndlessController('Untitled', time);
    return Center(
      child: Container(
        child: FlareActor(
          "asset/images/$imageName.flr",
          alignment: Alignment.center,
          controller: _screenController,
          fit: BoxFit.fill,
        ),
      ),
    );
  }

  static List<String> getLightTypes() {
    return ['light', 'cake', 'kitty_normal', 'kitty_smile', 'kitty_tongue'];
  }

  static List<ColorModel> getGameColors() {
    return [
      ColorModel.getColor(164, 196, 0),
      ColorModel.getColor(96, 169, 23),
      ColorModel.getColor(0, 138, 0),
      ColorModel.getColor(0, 171, 169),
      ColorModel.getColor(27, 161, 226),
      ColorModel.getColor(62, 101, 255),
      ColorModel.getColor(106, 0, 255),
      ColorModel.getColor(170, 0, 255),
      ColorModel.getColor(244, 114, 208),
      ColorModel.getColor(216, 0, 115),
      ColorModel.getColor(162, 0, 37),
      ColorModel.getColor(229, 20, 0),
      ColorModel.getColor(250, 104, 0),
      ColorModel.getColor(240, 163, 10),
      ColorModel.getColor(227, 200, 0),
      ColorModel.getColor(130, 90, 44),
      ColorModel.getColor(109, 135, 100),
      ColorModel.getColor(100, 118, 135),
      ColorModel.getColor(118, 96, 138),
      ColorModel.getColor(135, 121, 78),
    ];
  }

  static String getLightOffType() {
    Random rd = new Random();
    int randomIndex = rd.nextInt(Utils.getLightTypes().length);
    if (randomIndex == 0) randomIndex = 1;
    return Utils.getLightTypes()[randomIndex];
  }

  static String getLightOnType(String _lightOffType) {
    Random rd = new Random();
    return _lightOffType + '_' + rd.nextInt(5).toString();
  }
}
