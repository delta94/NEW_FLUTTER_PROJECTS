import 'package:flutter/cupertino.dart';

class Helper{
  static Size getDeviceSize(BuildContext context){
    return MediaQuery.of(context).size;
  }
}