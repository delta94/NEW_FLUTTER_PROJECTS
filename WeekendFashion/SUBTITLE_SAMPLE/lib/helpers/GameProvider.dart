import 'package:flutter/widgets.dart';
import 'package:seab1ird.showyourself/data/HairData.dart';
import 'package:seab1ird.showyourself/data/ShirtData.dart';
import 'package:seab1ird.showyourself/data/ShortData.dart';
import 'package:seab1ird.showyourself/models/DeviceSize.dart';

enum ItemType{
  HAIR,
  SHIRT,
  SHORT,
  JACKET,
  TREASURE
}

class GameProvider extends ChangeNotifier {
  DeviceSize deviceSize;
  bool isFirstGirl = true;
  Map<int, bool> girlsMap = new Map<int, bool>();

  Map<ItemType, String> selectedItems = new Map<ItemType, String>();

  init(){
    HairData.init();
    ShirtData.init();
    ShortData.init();
  }

  setItemType(ItemType itemType, String image){
    selectedItems[itemType] = image;
    notifyListeners();
  }

  doSomething() {
    notifyListeners();
  }

}