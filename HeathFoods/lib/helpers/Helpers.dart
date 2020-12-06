import 'dart:io';
import 'package:assets_audio_player/assets_audio_player.dart';
import 'package:flutter/material.dart';

import 'AdHelpers.dart';

const NUM_QUESTIONS_PER_PAGE = 6;

class Helpers {
  static AssetsAudioPlayer animatedAudio = AssetsAudioPlayer();
  static AssetsAudioPlayer winAudio = AssetsAudioPlayer();

  static void winGameSound() {
    winAudio.open(Audio('sounds/win.mp3'));
  }

  static void tapButtonSound() {
    animatedAudio.open(Audio('sounds/btnclick.mp3'));
  }

  static Future<bool> onWillPop(BuildContext context) {
    AdHelpers.showInterAd();
    return showDialog(
      context: context,
      builder: (context) => AlertDialog(
        backgroundColor: Colors.white,
        title: Text('Quit App ?',
            style: TextStyle(
              color: Colors.red,
              fontSize: 18,
              decoration: TextDecoration.underline,
              decorationColor: Colors.red,
              decorationStyle: TextDecorationStyle.solid,
            )),
        content: Container(
            child: Text('Are you sure ?',
                style: TextStyle(
                    color: Colors.blue, fontWeight: FontWeight.bold))),
        actions: <Widget>[
          FlatButton(
            onPressed: () => Navigator.of(context).pop(false),
            child: Text(
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
          FlatButton(
            onPressed: () => exit(0),
            child: Text(
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
      color: color ?? Colors.yellow[100],
      border: Border.all(width: 1.0),
      gradient: LinearGradient(
        begin: Alignment.topLeft,
        end: Alignment(1, 0.0), // 10% of the width, so there are ten blinds.
        colors: [
          color ?? Colors.yellow[200],
          color ?? Colors.yellow[50],
        ], // red to yellow
        tileMode: TileMode.clamp, // repeats the gradient over the canvas
      ),
      boxShadow: [
        BoxShadow(
          color: Colors.grey,
          blurRadius: 2,
          spreadRadius: 2,
          offset: Offset(5, 5),
        )
      ],
      borderRadius: BorderRadius.all(Radius.circular(20.0) //
          ),
    );
  }

  static Widget getMenuBox(Row row, BuildContext context, String path,
      [String argument]) {
    return GestureDetector(
      onTap: () {
        Helpers.tapButtonSound();
        Navigator.pushNamed(context, path, arguments: argument);
      },
      child: Container(
        padding: EdgeInsets.only(left: 10, top: 10, bottom: 10),
        margin: EdgeInsets.only(bottom: 5),
        alignment: Alignment.center,
        decoration: boxDecoration(),
        child: GestureDetector(
          child: row,
        ),
      ),
    );
  }

  static void backToHomeScreen(BuildContext context) {
    tapButtonSound();
    Navigator.popUntil(context, ModalRoute.withName('/home'));
  }
}
