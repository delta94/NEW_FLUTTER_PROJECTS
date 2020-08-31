import 'package:assets_audio_player/assets_audio_player.dart';
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

import 'Helper.dart';

class GameProvider extends ChangeNotifier {
  DeviceSize deviceSize;
  int currentGirlIndex;
  int changingItemTypeIndex = 0;
  final backgroundAudio = AssetsAudioPlayer();
  final showingItemAudio = AssetsAudioPlayer();
  final girlSoundAudio = AssetsAudioPlayer();

  Map<ItemType, Data> itemTypeGirlMap = new Map<ItemType, Data>();
  List<Map<ItemType, Map<SubItemType, String>>> selectedItemGirlList =
      new List<Map<ItemType, Map<SubItemType, String>>>();
  List<List<ItemType>> girlItemTypes = new List<List<ItemType>>();

  init() {
    backgroundAudio.loop = true;
    backgroundAudio.open(Audio('sounds/background_music.ogg'));

    girlItemTypes.clear();

    itemTypeGirlMap[ItemType.HAIR] = new GirlHairData();
    itemTypeGirlMap[ItemType.SHIRT] = new GirlShirtData();
    itemTypeGirlMap[ItemType.SHORT] = new GirlShortData();
    itemTypeGirlMap[ItemType.JACKET] = new GirlJacketData();
    itemTypeGirlMap[ItemType.TREASURE] = new GirlTreasureData();
    itemTypeGirlMap[ItemType.DRESS] = new GirlDressData();

    selectedItemGirlList.add(new Map<ItemType, Map<SubItemType, String>>());
    selectedItemGirlList.add(new Map<ItemType, Map<SubItemType, String>>());

    girlItemTypes.add([
      ItemType.HAIR,
      ItemType.SHIRT,
      ItemType.SHORT,
      ItemType.JACKET,
      ItemType.TREASURE
    ]);
    girlItemTypes.add([
      ItemType.HAIR,
      ItemType.SHIRT,
      ItemType.SHORT,
      ItemType.DRESS,
      ItemType.JACKET,
      ItemType.TREASURE
    ]);
  }

  setGirlItemType(int girlIndex, ItemType itemType, String image,
      [SubItemType subItemType]) {
    changingItemTypeIndex = 0;
    if (image == selectedItemGirlList[girlIndex][itemType][subItemType]) {
      var firstItemKey = itemTypeGirlMap[itemType]
          .itemSubMapList[girlIndex][null]
          .keys
          .toList()[0];
      selectedItemGirlList[girlIndex][itemType][subItemType] = firstItemKey;
      if (itemType == ItemType.DRESS) {
        selectedItemGirlList[girlIndex][ItemType.SHIRT][subItemType] = null;
        selectedItemGirlList[girlIndex][ItemType.SHORT][subItemType] = null;
      }
    } else {
      selectedItemGirlList[girlIndex][itemType][subItemType] = image;
      if (itemType == ItemType.DRESS) {
        selectedItemGirlList[girlIndex][ItemType.SHIRT][subItemType] = '';
        selectedItemGirlList[girlIndex][ItemType.SHORT][subItemType] = '';
      } else {
        if (itemType != ItemType.JACKET &&
            itemType != ItemType.HAIR &&
            selectedItemGirlList[girlIndex][ItemType.DRESS] != null) {
          selectedItemGirlList[girlIndex][ItemType.DRESS][subItemType] = null;
        }

        if ((itemType == ItemType.SHIRT || itemType == ItemType.SHORT) &&
            selectedItemGirlList[girlIndex][ItemType.SHIRT][subItemType] ==
                '') {
          selectedItemGirlList[girlIndex][ItemType.SHIRT][subItemType] = null;
        }

        if ((itemType == ItemType.SHIRT || itemType == ItemType.SHORT) &&
            selectedItemGirlList[girlIndex][ItemType.SHORT][subItemType] ==
                '') {
          selectedItemGirlList[girlIndex][ItemType.SHORT][subItemType] = null;
        }
      }
    }

    notifyListeners();
  }

  List<Positioned> getGirlSelectedItem(ItemType itemType,
      {SubItemType subItemType, int girlIndex}) {
    int _girlIndex = girlIndex ?? currentGirlIndex;
    String selectedKey =
        selectedItemGirlList[_girlIndex][itemType][subItemType];
    return itemTypeGirlMap[itemType].itemSubMapList[_girlIndex][subItemType]
        [selectedKey];
  }

  ItemType changeCabinForNextAndGirlIndex(bool isNext, ItemType oldItemType) {
    int newIndex = Helper.getItemTypeIndex(
      girlItemTypes[currentGirlIndex].indexOf(oldItemType),
      girlItemTypes[currentGirlIndex].length,
      isNext,
    );

    return girlItemTypes[currentGirlIndex][newIndex];
  }
}
