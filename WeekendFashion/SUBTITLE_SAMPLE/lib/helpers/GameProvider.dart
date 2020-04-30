import 'package:flutter/widgets.dart';

class GameProvider extends ChangeNotifier {
  Size deviceSize;

  doSomething() {

    notifyListeners();
  }

}
