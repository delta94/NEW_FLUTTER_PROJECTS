import 'package:enum_to_string/enum_to_string.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.goutfood/AppProvider.dart';
import 'package:seabird.goutfood/data/FoodTypeData.dart';
import 'package:seabird.goutfood/enums/FoodTypeEnum.dart';
import 'package:seabird.goutfood/enums/FoodUricContentType.dart';
import 'package:seabird.goutfood/helpers/ReponsiveHelper.dart';
import 'package:seabird.goutfood/helpers/Utils.dart';
import 'package:seabird.goutfood/models/Food.dart';
import 'package:seabird.goutfood/models/FoodType.dart';
import 'package:tuple/tuple.dart';

// ignore: must_be_immutable
class FoodListWidget extends StatelessWidget {
  FoodListWidget({
    Key key,
    this.foodUricContentType,
    this.backgroundColor = Colors.white,
  }) : super(key: key);

  final FoodUricContentType foodUricContentType;
  final Color backgroundColor;
  AppProvider appProvider;

  List<Food> getFoodList(List<FoodTypeEnum> foodTypeEnums) {
    var foodTypes = <FoodType>[];
    FoodTypeData.foodTypeMap.forEach((foodTypeEnum, foodType) {
      if (foodTypeEnums.contains(foodTypeEnum)) {
        foodTypes.add(foodType);
      }
    });

    var foods = foodTypes.fold(<Food>[], (previousValue, foodType) {
      previousValue.addAll(foodType.foods);
      return previousValue;
    });

    var filteredFoods = <Food>[];
    switch (foodUricContentType) {
      case FoodUricContentType.LOW:
        filteredFoods = foods
            .where((food) =>
                (food as Food).foodUricContentType == FoodUricContentType.LOW)
            .toList();
        break;
      case FoodUricContentType.MODERATE:
        filteredFoods = foods
            .where((food) =>
                (food as Food).foodUricContentType ==
                FoodUricContentType.MODERATE)
            .toList();
        break;
      case FoodUricContentType.HIGH:
        filteredFoods = foods
            .where((food) =>
                (food as Food).foodUricContentType == FoodUricContentType.HIGH)
            .toList();
        break;
      default:
        var currSearchText = appProvider.searchText.toLowerCase();
        if (currSearchText?.trim()?.isEmpty ?? true) {
          filteredFoods = foods;
        } else {
          filteredFoods = foods.where((food) {
            var foodName = (food as Food).name.toLowerCase();
            var searchLetters = appProvider.searchText.toLowerCase().split(' ');
            return searchLetters
                .any((searchLetter) => foodName.contains(searchLetter));
          }).toList();
        }

        break;
    }

    return Utils.getSortedAcidUricFoods(filteredFoods);
  }

  Image getFoodIcon(Food food) {
    return Image.asset(
      'images/${EnumToString.parse(food.foodUricContentType).toLowerCase()}.png',
      height: getXSmallLogoSize(),
    );
  }

  @override
  Widget build(BuildContext context) {
    var scrollController = ScrollController();
    appProvider = Provider.of<AppProvider>(context, listen: false);

    return Selector<AppProvider, Tuple2<FoodTypeEnum, String>>(
      selector: (buildContext, appProvider) =>
          Tuple2(appProvider.currFoodTypeEnum, appProvider.searchText),
      builder: (context, value, child) {
        var sortedFoods;
        if (appProvider.selectedFoodTypeEnums.isEmpty) {
          sortedFoods = getFoodList(FoodTypeEnum.values);
        } else {
          sortedFoods = getFoodList(appProvider.selectedFoodTypeEnums);
        }

        return Container(
          child: Column(
            children: [
              Container(
                padding: EdgeInsets.symmetric(horizontal: 10, vertical: 8),
                decoration: BoxDecoration(
                  color: Colors.black,
                  borderRadius: BorderRadius.only(
                    topLeft: Radius.circular(5),
                    topRight: Radius.circular(5),
                  ),
                ),
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    Padding(
                      padding: EdgeInsets.only(
                          left: getXSSmallTextSize() + (isIpad ? 15 : 0)),
                      child: Text(
                        'Food Names',
                        style: TextStyle(
                          color: Colors.white,
                          fontWeight: FontWeight.bold,
                          fontSize: getXSSmallTextSize(),
                        ),
                      ),
                    ),
                    Text(
                      'mg uric acid/100g',
                      style: TextStyle(
                        color: Colors.white,
                        fontWeight: FontWeight.bold,
                        fontSize: getXSSmallTextSize(),
                      ),
                    ),
                  ],
                ),
              ),
              Expanded(
                child: Scrollbar(
                  thickness: 4,
                  controller: scrollController,
                  isAlwaysShown: true,
                  child: Container(
                    child: ListView.builder(
                        shrinkWrap: true,
                        controller: scrollController,
                        itemCount: sortedFoods.length,
                        itemBuilder: (BuildContext ctxt, int index) {
                          return Container(
                            padding: EdgeInsets.symmetric(
                                horizontal: 10, vertical: 5),
                            color: index % 2 == 0
                                ? backgroundColor.withOpacity(0.9)
                                : backgroundColor.withOpacity(0.2),
                            child: Row(
                              mainAxisAlignment: MainAxisAlignment.spaceBetween,
                              children: [
                                Row(
                                  children: [
                                    getFoodIcon(sortedFoods[index]),
                                    Container(
                                      constraints: BoxConstraints(
                                          maxWidth:
                                              ReponsiveHelper.deviceSize.width -
                                                  90),
                                      child: Text(
                                        sortedFoods[index].name,
                                        style: TextStyle(
                                          fontWeight: FontWeight.bold,
                                          fontSize: getXSSmallTextSize(),
                                        ),
                                      ),
                                    ),
                                  ],
                                ),
                                Text(
                                  sortedFoods[index].acidContent.toString(),
                                  style: TextStyle(
                                    fontWeight: FontWeight.bold,
                                    fontSize: getXSSmallTextSize(),
                                  ),
                                ),
                              ],
                            ),
                          );
                        }),
                  ),
                ),
              ),
            ],
          ),
        );
      },
    );
  }
}
