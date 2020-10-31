import 'package:assets_audio_player/assets_audio_player.dart';
import 'package:com.seab1ird.showyourself/helpers/FlareEndlessController.dart';
import 'package:com.seab1ird.showyourself/model/ColorModel.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/widgets.dart';

class Utils {
  static Widget handTouch;
  static double bottomMenuHeight = 56;
  static Size deviceSize;
  static Duration animationDuration = Duration(milliseconds: 500);
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

  static getBackground(String themeColorName) {
    return AssetImage('asset/images/bg_$themeColorName.png');
  }

  static bool isIpad() {
    return deviceSize.width > 700 &&
        deviceSize.width / deviceSize.height > 0.65;
  }

  static double iconSize() {
    return isIpad() ? deviceSize.width / 16 : 30;
  }

  static double fontSize() {
    return isIpad() ? deviceSize.width / 25 : 20;
  }
}
