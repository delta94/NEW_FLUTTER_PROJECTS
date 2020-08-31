import 'dart:io';

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class CommonFunctions { 
  static Future<bool> onWillPop(BuildContext context){
    return showDialog(
      context: context,
      builder: (context) => new AlertDialog(
        backgroundColor: Colors.white,
        title: new Text('Bạn muốn thoát ứng dụng ?', 
                style: TextStyle(
                  color: Colors.red, 
                  fontSize: 18, 
                  decoration: TextDecoration.underline,
                  decorationColor: Colors.red,
                  decorationStyle: TextDecorationStyle.solid,)),
        content: Container(child: new Text('Bạn đã chắc ?', style: TextStyle(color: Colors.blue, fontWeight: FontWeight.bold))),
        actions: <Widget>[
          new FlatButton(
            onPressed: () => Navigator.of(context).pop(false),
            child: new Text('KHÔNG', 
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
                ],),),
          ),
          new FlatButton(
            onPressed: () =>  exit(0),
            child: new Text('CÓ', 
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
                ],),),
          ),
        ],
      ),
    );
  }

  static BoxDecoration boxDecoration([Color color]){
    return BoxDecoration(
      color: color != null ? color : Color.fromRGBO(80, 80, 80, 1),
      border: Border.all(
        width: 3.0
      ),
      borderRadius: BorderRadius.all(
        Radius.circular(20.0) // 
      ),
    );
  }

  static String durationFormatter(int milliSeconds) {
    int seconds = milliSeconds ~/ 1000;
    final int hours = seconds ~/ 3600;
    seconds = seconds % 3600;
    var minutes = seconds ~/ 60;
    seconds = seconds % 60;
    final hoursString = hours >= 10 ? '$hours' : hours == 0 ? '00' : '0$hours';
    final minutesString =
        minutes >= 10 ? '$minutes' : minutes == 0 ? '00' : '0$minutes';
    final secondsString =
        seconds >= 10 ? '$seconds' : seconds == 0 ? '00' : '0$seconds';
    final formattedTime =
        '${hoursString == '00' ? '' : hoursString + ':'}$minutesString:$secondsString';
    return formattedTime;
  }
  
  static Widget buildProgressIndicator(bool isLoading, String message) {
    return new Padding(
      padding: const EdgeInsets.all(8.0),
      child: new Center(
        child: new Opacity(
          opacity: isLoading ? 1.0 : 0,
          child: Text(message, style: TextStyle(color: Colors.yellowAccent, fontWeight: FontWeight.bold),)
        ),
      ),
    );
  }
}