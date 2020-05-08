import 'package:flutter/widgets.dart';
import 'package:seab1ird.showyourself/models/DeviceSize.dart';

class GameProvider extends ChangeNotifier {
  DeviceSize deviceSize;
  bool isFirstGirl = true;
  Map<int, bool> girlsMap = new Map<int, bool>();

  doSomething() {
    notifyListeners();
  }

}