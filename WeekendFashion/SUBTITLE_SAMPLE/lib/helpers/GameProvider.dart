import 'package:flutter/widgets.dart';
import 'package:seab1ird.showyourself/data/Data.dart';
import 'package:seab1ird.showyourself/data/wear_item/GirlDressData.dart';
import 'package:seab1ird.showyourself/data/wear_item/GirlHairData.dart';
import 'package:seab1ird.showyourself/data/wear_item/GirlJacketData.dart';
import 'package:seab1ird.showyourself/data/wear_item/GirlShirtData.dart';
import 'package:seab1ird.showyourself/data/wear_item/GirlShortData.dart';
import 'package:seab1ird.showyourself/data/wear_item/GirlTreasureData.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';
import 'package:seab1ird.showyourself/models/DeviceSize.dart';

class GameProvider extends ChangeNotifier {
  DeviceSize deviceSize;
  int currentGirlIndex;

  Map<ItemType, Data> itemTypeGirlMap = new Map<ItemType, Data>();
  List<Map<ItemType, Map<SubItemType, String>>> selectedItemGirlList = new List<Map<ItemType, Map<SubItemType, String>>>();

  init(){
    itemTypeGirlMap[ItemType.HAIR] =  new GirlHairData();
    itemTypeGirlMap[ItemType.SHIRT] = new GirlShirtData();
    itemTypeGirlMap[ItemType.SHORT] = new GirlShortData();
    itemTypeGirlMap[ItemType.JACKET] = new GirlJacketData();
    itemTypeGirlMap[ItemType.TREASURE] = new GirlTreasureData();
    itemTypeGirlMap[ItemType.DRESS] =  new GirlDressData();

    selectedItemGirlList.add(new Map<ItemType, Map<SubItemType, String>>());
    selectedItemGirlList.add(new Map<ItemType, Map<SubItemType, String>>());
  }

  setGirlItemType(int girlIndex, ItemType itemType, String image, [SubItemType subItemType]){
    if(image == selectedItemGirlList[girlIndex][itemType][subItemType]){
      var firstItemKey = itemTypeGirlMap[itemType].itemSubMapList[girlIndex][null].keys.toList()[0];
      selectedItemGirlList[girlIndex][itemType][subItemType] = firstItemKey;
    } else {
      selectedItemGirlList[girlIndex][itemType][subItemType] = image;
    }

    notifyListeners();
  }

  List<Positioned> getGirlSelectedItem(int girlIndex, ItemType itemType, [SubItemType subItemType]){
    var selectedKey = selectedItemGirlList[girlIndex][itemType][subItemType];
    var map = itemTypeGirlMap[itemType].itemSubMapList[girlIndex][subItemType][selectedKey];
    return map;
  }
}