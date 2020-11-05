import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.disctest/enums/FoodUricContentType.dart';
import 'package:seab1ird.disctest/helpers/Utils.dart';
import 'package:seab1ird.disctest/models/Food.dart';

class FoodListWidget extends StatelessWidget {
  const FoodListWidget({
    Key key,
    @required this.foods,
    @required this.foodUricContentType,
  }) : super(key: key);

  final List<Food> foods;
  final FoodUricContentType foodUricContentType;

  @override
  Widget build(BuildContext context) {
    var scrollController = ScrollController();

    var filteredFoods;
    switch (foodUricContentType) {
      case FoodUricContentType.LOW:
        filteredFoods = foods.where((food) => food.acidContent <= 100).toList();
        break;
      case FoodUricContentType.MODERATE:
        filteredFoods = foods
            .where((food) => food.acidContent > 100 && food.acidContent < 250)
            .toList();
        break;
      case FoodUricContentType.HIGH:
        filteredFoods = foods.where((food) => food.acidContent >= 250).toList();
        break;
      default:
        break;
    }

    var sortedFoods = Utils.getSortedAcidUricFoods(filteredFoods);
    return Scrollbar(
      controller: scrollController,
      isAlwaysShown: true,
      child: ListView.builder(
          controller: scrollController,
          itemCount: sortedFoods.length,
          itemBuilder: (BuildContext ctxt, int index) {
            return Container(
              padding: EdgeInsets.symmetric(horizontal: 8, vertical: 5),
              color: index % 2 == 0 ? Colors.grey[100] : Colors.white,
              child: Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  Flexible(child: Text(sortedFoods[index].name)),
                  Text(sortedFoods[index].acidContent.toString()),
                ],
              ),
            );
          }),
    );
  }
}
