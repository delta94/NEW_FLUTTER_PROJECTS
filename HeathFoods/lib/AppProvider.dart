import 'package:flutter/widgets.dart';
import 'package:seabird.goutfood/enums/FoodTypeEnum.dart';
import 'package:shared_preferences/shared_preferences.dart';

import 'data/FoodTypeData.dart';

class AppProvider extends ChangeNotifier {
  List<FoodTypeEnum> selectedFoodTypeEnums = <FoodTypeEnum>[];

  String searchText = '';
  FoodTypeEnum currFoodTypeEnum;
  bool isFirstUse = true;

  Future<void> init() async {
    var prefs = await SharedPreferences.getInstance();
    isFirstUse = prefs.getBool('isFirstUse') ?? true;
  }

  void setIsFirstUse() async {
    var _prefs = await SharedPreferences.getInstance();
    await _prefs.setBool('isFirstUse', false);
  }

  void updateSearchText(String newSearchText) {
    searchText = newSearchText;
    clearSelectedFoodType();
    notifyListeners();
  }

  void clearSearhText() {
    searchText = '';
    notifyListeners();
  }

  void updateSelectedFoodType(FoodTypeEnum foodTypeEnum) {
    if (selectedFoodTypeEnums.contains(foodTypeEnum)) {
      selectedFoodTypeEnums.remove(foodTypeEnum);
    } else {
      selectedFoodTypeEnums.add(foodTypeEnum);
    }

    if (currFoodTypeEnum == foodTypeEnum) {
      currFoodTypeEnum = null;
    } else {
      currFoodTypeEnum = foodTypeEnum;
    }
    notifyListeners();
  }

  void clearSelectedFoodType() {
    selectedFoodTypeEnums.clear();
    FoodTypeData.foodTypeMap.values
        .forEach((foodType) => foodType.isSelected = false);
  }
}
