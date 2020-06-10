import 'package:flutter/widgets.dart';
import 'package:seab1ird.showyourself/data/Data.dart';
import 'package:seab1ird.showyourself/data/girl0/Girl0HairData.dart';
import 'package:seab1ird.showyourself/data/girl0/Girl0JacketData.dart';
import 'package:seab1ird.showyourself/data/girl0/Girl0ShirtData.dart';
import 'package:seab1ird.showyourself/data/girl0/Girl0ShortData.dart';
import 'package:seab1ird.showyourself/data/girl0/Girl0TreasureData.dart';
import 'package:seab1ird.showyourself/data/girl1/Girl1DressData.dart';
import 'package:seab1ird.showyourself/data/girl1/Girl1HairData.dart';
import 'package:seab1ird.showyourself/data/girl1/Girl1JacketData.dart';
import 'package:seab1ird.showyourself/data/girl1/Girl1ShirtData.dart';
import 'package:seab1ird.showyourself/data/girl1/Girl1ShortData.dart';
import 'package:seab1ird.showyourself/data/girl1/Girl1TreasureData.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';
import 'package:seab1ird.showyourself/models/DeviceSize.dart';

class GameProvider extends ChangeNotifier {
  DeviceSize deviceSize;
  int currentGirlIndex;
  Map<ItemType, Data> itemTypeGirl0Map = new Map<ItemType, Data>();
  Map<ItemType, Map<SubItemType, String>> selectedItemGirl0Map = new Map<ItemType, Map<SubItemType, String>>();
  
  Map<ItemType, Data> itemTypeGirl1Map = new Map<ItemType, Data>();
  Map<ItemType, Map<SubItemType, String>> selectedItemGirl1Map = new Map<ItemType, Map<SubItemType, String>>();

  init(){
    itemTypeGirl0Map[ItemType.HAIR] = new Girl0HairData();
    itemTypeGirl0Map[ItemType.SHIRT] = new Girl0ShirtData();
    itemTypeGirl0Map[ItemType.SHORT] = new Girl0ShortData();
    itemTypeGirl0Map[ItemType.JACKET] = new Girl0JacketData();
    itemTypeGirl0Map[ItemType.TREASURE] = new Girl0TreasureData();

    itemTypeGirl1Map[ItemType.HAIR] = new Girl1HairData();
    itemTypeGirl1Map[ItemType.SHIRT] = new Girl1ShirtData();
    itemTypeGirl1Map[ItemType.DRESS] = new Girl1DressData();
    itemTypeGirl1Map[ItemType.SHORT] = new Girl1ShortData();
    itemTypeGirl1Map[ItemType.JACKET] = new Girl1JacketData();
    itemTypeGirl1Map[ItemType.TREASURE] = new Girl1TreasureData();
  }

  setGirl0ItemType(ItemType itemType, String image, [SubItemType subItemType]){
    if(image == selectedItemGirl0Map[itemType][subItemType]){
      var firstItemKey = itemTypeGirl0Map[itemType].itemSubMap[null].keys.toList()[0];
      selectedItemGirl0Map[itemType][subItemType] = firstItemKey;
    } else {
      selectedItemGirl0Map[itemType][subItemType] = image;
    }

    notifyListeners();
  }

  List<Positioned> getGirl0SelectedItem(ItemType itemType, [SubItemType subItemType]){
    var selectedKey = selectedItemGirl0Map[itemType][subItemType];
    var map = itemTypeGirl0Map[itemType].itemSubMap[subItemType][selectedKey];
    return map;
  }

  setGirl1ItemType(ItemType itemType, String image, [SubItemType subItemType]){
    if(image == selectedItemGirl1Map[itemType][subItemType]){
      var firstItemKey = itemTypeGirl1Map[itemType].itemSubMap[null].keys.toList()[0];
      selectedItemGirl1Map[itemType][subItemType] = firstItemKey;
    } else {
      selectedItemGirl1Map[itemType][subItemType] = image;
    }

    notifyListeners();
  }

  List<Positioned> getGirl1SelectedItem(ItemType itemType, [SubItemType subItemType]){
    var selectedKey = selectedItemGirl1Map[itemType][subItemType];
    var map = itemTypeGirl1Map[itemType].itemSubMap[subItemType][selectedKey];
    return map;
  }

}