import 'dart:io';
import 'package:assets_audio_player/assets_audio_player.dart';
import 'package:flutter/material.dart';

const NUM_QUESTIONS_PER_PAGE = 6;

class Helpers {
  static Size deviceSize;
  static AssetsAudioPlayer animatedAudio = AssetsAudioPlayer();
  static AssetsAudioPlayer winAudio = AssetsAudioPlayer();

  static winGameSound() {
    winAudio.open(Audio('sounds/win.mp3'));
  }

  static tapButtonSound() {
    animatedAudio.open(Audio('sounds/btnclick.mp3'));
  }

  static Future<bool> onWillPop(BuildContext context) {
    // Ads.showInterstitialAd();
    return showDialog(
      context: context,
      builder: (context) => new AlertDialog(
        backgroundColor: Colors.white,
        title: new Text('Quit App ?',
            style: TextStyle(
              color: Colors.red,
              fontSize: 18,
              decoration: TextDecoration.underline,
              decorationColor: Colors.red,
              decorationStyle: TextDecorationStyle.solid,
            )),
        content: Container(
            child: new Text('Are you sure ?',
                style: TextStyle(
                    color: Colors.blue, fontWeight: FontWeight.bold))),
        actions: <Widget>[
          new FlatButton(
            onPressed: () => Navigator.of(context).pop(false),
            child: new Text(
              'No',
              style: TextStyle(
                color: Colors.blue,
                fontWeight: FontWeight.bold,
                decoration: TextDecoration.underline,
                decorationColor: Colors.blue,
                decorationStyle: TextDecorationStyle.solid,
                shadows: [
                  Shadow(
                    color: Colors.greenAccent,
                    blurRadius: 10.0,
                    offset: Offset(5.0, 5.0),
                  ),
                ],
              ),
            ),
          ),
          new FlatButton(
            onPressed: () => exit(0),
            child: new Text(
              'Yes',
              style: TextStyle(
                color: Colors.red,
                fontWeight: FontWeight.bold,
                decoration: TextDecoration.underline,
                decorationColor: Colors.red,
                decorationStyle: TextDecorationStyle.solid,
                shadows: [
                  Shadow(
                    color: Colors.greenAccent,
                    blurRadius: 10.0,
                    offset: Offset(5.0, 5.0),
                  ),
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }

  static BoxDecoration boxDecoration([Color color]) {
    return BoxDecoration(
      color: color != null ? color : Colors.black54,
      border: Border.all(width: 3.0),
      borderRadius: BorderRadius.all(Radius.circular(20.0) //
          ),
    );
  }

  static Container getMenuBox(Row row, BuildContext context, String path,
      [String argument]) {
    return Container(
        padding: EdgeInsets.only(left: 10, top: 10, bottom: 10),
        margin: EdgeInsets.only(bottom: 5),
        alignment: Alignment.center,
        decoration: boxDecoration(),
        child: GestureDetector(
          child: row,
          onTap: () {
            Helpers.tapButtonSound();
            Navigator.pushNamed(context, path, arguments: argument);
          },
        ));
  }

  static Size getDeviceSize(BuildContext context) {
    return MediaQuery.of(context).size;
  }

  static bool isIpad() {
    return deviceSize.width / deviceSize.height > 0.65;
  }

  static double ipadIconSize() {
    return deviceSize.width / 15;
  }

  static double ipadFontSize() {
    return deviceSize.width / 24;
  }

  static backToHomeScreen(BuildContext context) {
    Helpers.tapButtonSound();
    Navigator.popUntil(context, ModalRoute.withName('/home'));
  }
}
