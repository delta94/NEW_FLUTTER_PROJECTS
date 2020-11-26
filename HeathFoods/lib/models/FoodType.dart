import 'package:flutter/cupertino.dart';
import 'package:seabird.goutfood/enums/FoodTypeEnum.dart';
import 'package:seabird.goutfood/models/Food.dart';

class FoodType {
  final FoodTypeEnum foodTypeEnum;
  final String name;
  final String desc;
  final String imageName;
  final List<Food> foods;
  bool isSelected;

  FoodType({
    @required this.foodTypeEnum,
    @required this.name,
    @required this.desc,
    @required this.imageName,
    @required this.foods,
    this.isSelected = false,
  });
}
