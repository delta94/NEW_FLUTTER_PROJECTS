import 'dart:io';

import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

import 'AdHelpers.dart';
import 'Helpers.dart';

class UiUtils {
  static Future<bool> onWillPop(BuildContext context) {
    AdHelpers.showInterAd();
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
        color: color != null ? color : Colors.grey[600],
        border: Border.all(width: 1.0),
        borderRadius: BorderRadius.all(Radius.circular(20.0)),
        gradient: LinearGradient(
          begin: Alignment.topLeft,
          end: Alignment(1, 0.0), // 10% of the width, so there are ten blinds.
          colors: [
            color != null ? color : Colors.black87,
            color != null ? color : Colors.grey[600],
          ], // red to yellow
          tileMode: TileMode.clamp, // repeats the gradient over the canvas
        ),
        boxShadow: [
          BoxShadow(
            color: Colors.grey[400],
            spreadRadius: 3,
            blurRadius: 3,
            offset: Offset(2, 2),
          ), // changes position of shadow
        ]);
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
        child: row,
      ),
    );
  }
}
