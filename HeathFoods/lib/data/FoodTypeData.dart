import 'package:seab1ird.disctest/data/FoodData.dart';
import 'package:seab1ird.disctest/enums/FoodTypeEnum.dart';
import 'package:seab1ird.disctest/models/FoodType.dart';

List<FoodType> getFoodTypeList() {
  return [
    FoodType(
      foodTypeEnum: FoodTypeEnum.VEGETABLE,
      name: 'Vegetable',
      desc: 'Vegetables',
      imageName: 'vegetable',
      foods: FoodData.vegetables,
    ),
    FoodType(
      foodTypeEnum: FoodTypeEnum.FRUIT,
      name: 'Fruit',
      desc: 'Fruit',
      imageName: 'fruit',
      foods: FoodData.fruits,
    ),
    FoodType(
      foodTypeEnum: FoodTypeEnum.NUT,
      name: 'Nut',
      desc: 'Legumes vs Nuts',
      imageName: 'nut',
      foods: FoodData.nuts,
    ),
    FoodType(
      foodTypeEnum: FoodTypeEnum.BEVERAGE,
      name: 'Beverage',
      desc: 'Beverages',
      imageName: 'beverage',
      foods: FoodData.beverages,
    ),
    FoodType(
      foodTypeEnum: FoodTypeEnum.MILK,
      name: 'Milk',
      desc: 'Milk products',
      imageName: 'milk',
      foods: FoodData.milk,
    ),
    FoodType(
      foodTypeEnum: FoodTypeEnum.FISH,
      name: 'Fish',
      desc: 'Fish vs crustaceans',
      imageName: 'fish',
      foods: FoodData.fishes,
    ),
    FoodType(
      foodTypeEnum: FoodTypeEnum.MEAT,
      name: 'Meat',
      desc: 'Meat',
      imageName: 'meat',
      foods: FoodData.meats,
    ),
    FoodType(
      foodTypeEnum: FoodTypeEnum.OTHER,
      name: 'Other',
      desc: 'Other',
      imageName: 'other',
      foods: FoodData.others,
    ),
  ];
}
