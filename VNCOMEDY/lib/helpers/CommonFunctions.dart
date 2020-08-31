import 'dart:io';

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

const API_KEY = 'AIzaSyC-UsXkdLwGcQGRf4XGzO9Sqkkq8yb2bCU';

const THUMBNAIL_URL_PREFIX = "https://i3.ytimg.com/vi";
const THUMBNAIL_URL_SUFFIX = "mqdefault.jpg";
const YT_HOST = 'https://www.googleapis.com/youtube/v3';
const YT_PLAYLIST_INFO_URL = '$YT_HOST/playlistItems?part=snippet%2CcontentDetails&maxResults=20&key=$API_KEY';
const YT_CHANNEL_INFO_URL = '$YT_HOST/playlists?part=snippet&key=$API_KEY&maxResults=20';

class CommonFunctions { 
  static onWillPop(BuildContext context){
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
    return '$THUMBNAIL_URL_PREFIX/$videoKey/$THUMBNAIL_URL_SUFFIX';
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
  
  static getYTPlayListInfoUrl(String playlistId, String nextPageToken){
    String url = '$YT_PLAYLIST_INFO_URL&playlistId=$playlistId';
    if(nextPageToken != null){
      url = '$url&pageToken=$nextPageToken';
    }
    
    return url;
  }

  static getYTChannelInfoUrl(String channelId, String nextPageToken){
    String url = '$YT_CHANNEL_INFO_URL&channelId=$channelId';
    if(nextPageToken != null){
      url = '$url&pageToken=$nextPageToken';
    }
    
    return url;
  }
}