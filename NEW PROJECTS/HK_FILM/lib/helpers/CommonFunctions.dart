import 'dart:io';

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

const THUMBNAIL_URL_ROOT = "https://i3.ytimg.com/vi/";
const THUMNAIL_SUFFIX = "/mqdefault.jpg";

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

  static getImageUrl(String videoKey){
    return '${THUMBNAIL_URL_ROOT}${videoKey}${THUMNAIL_SUFFIX}';
  }
}