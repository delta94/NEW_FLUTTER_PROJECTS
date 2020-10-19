import 'dart:math';

import 'package:assets_audio_player/assets_audio_player.dart';
import 'package:com.seab1ird.showyourself/enum/CellType.dart';
import 'package:com.seab1ird.showyourself/enum/Direction.dart';
import 'package:com.seab1ird.showyourself/helpers/FlareEndlessController.dart';
import 'package:com.seab1ird.showyourself/model/Cell.dart';
import 'package:com.seab1ird.showyourself/model/ColorModel.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/widgets.dart';

class Utils {
  static Widget handTouch;
  static Size deviceSize;
  static AssetsAudioPlayer backgroundAudio = AssetsAudioPlayer();
  static AssetsAudioPlayer animatedAudio = AssetsAudioPlayer();
  static AssetsAudioPlayer winAudio = AssetsAudioPlayer();
  static AssetsAudioPlayer connectedAudio = AssetsAudioPlayer();

  static openBackgroundSound() {
    backgroundAudio.loop = true;
    backgroundAudio.setVolume(1);
    backgroundAudio.open(Audio('asset/sounds/music.ogg'));
  }

  static tapButtonSound() {
    animatedAudio.open(Audio('asset/sounds/btnclick.ogg'));
  }

  static tapCellSound() {
    animatedAudio.open(Audio('asset/sounds/click_cell.ogg'));
  }

  static connectedSound() {
    connectedAudio.open(Audio('asset/sounds/connected.ogg'));
  }

  static winGameSound() {
    winAudio.open(Audio('asset/sounds/win.ogg'));
  }

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
    return [
      'light',
      'cake',
      'kitty_normal',
      'kitty_smile',
      'kitty_tongue',
      'rabbit_smile',
      'rabbit_normal',
      'pig'
    ];
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

  static String getRandomLightOffType() {
    Random rd = new Random();
    int randomIndex = rd.nextInt(Utils.getLightTypes().length);
    if (randomIndex == 0) randomIndex = 1;
    return Utils.getLightTypes()[randomIndex];
  }

  static String getLightOffType(String chosenAvatar) {
    List<String> chosenAvatarArr = chosenAvatar.split('_');
    chosenAvatarArr.removeLast();
    chosenAvatarArr.removeLast();
    return chosenAvatarArr.join('_');
  }

  static String getLightOnType(String chosenAvatar) {
    List<String> chosenAvatarArr = chosenAvatar.split('_');
    chosenAvatarArr.removeLast();
    return chosenAvatarArr.join('_');
  }

  static String getRandomLightOnType(String _lightOffType) {
    Random rd = new Random();
    return _lightOffType + '_' + rd.nextInt(5).toString();
  }

  static getBackground(String themeColorName) {
    return AssetImage('asset/images/bg_$themeColorName.png');
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
