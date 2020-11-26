import 'package:seabird.goutfood/data/FoodData.dart';
import 'package:seabird.goutfood/enums/FoodTypeEnum.dart';
import 'package:seabird.goutfood/models/FoodType.dart';

class FoodTypeData {
  static Map<FoodTypeEnum, FoodType> foodTypeMap = {
    FoodTypeEnum.VEGETABLE: FoodType(
      foodTypeEnum: FoodTypeEnum.VEGETABLE,
      name: 'Vegetables',
      desc: 'Vegetables',
      imageName: 'vegetable',
      foods: FoodData.vegetables,
    ),
    FoodTypeEnum.FRUITS: FoodType(
      foodTypeEnum: FoodTypeEnum.FRUITS,
      name: 'Fruits',
      desc: 'Fruits',
      imageName: 'fruit',
      foods: FoodData.fruits,
    ),
    FoodTypeEnum.NUT_LEGUME: FoodType(
      foodTypeEnum: FoodTypeEnum.NUT_LEGUME,
      name: 'Nuts/Legume',
      desc: 'Nuts/Legume',
      imageName: 'nut',
      foods: FoodData.nuts,
    ),
    FoodTypeEnum.BEVERAGES: FoodType(
      foodTypeEnum: FoodTypeEnum.BEVERAGES,
      name: 'Beverages',
      desc: 'Beverages',
      imageName: 'beverage',
      foods: FoodData.beverages,
    ),
    FoodTypeEnum.MILK_PRODUCTS: FoodType(
      foodTypeEnum: FoodTypeEnum.MILK_PRODUCTS,
      name: 'Milk products',
      desc: 'Milk products',
      imageName: 'milk',
      foods: FoodData.milk,
    ),
    FoodTypeEnum.SEAFOODS: FoodType(
      foodTypeEnum: FoodTypeEnum.SEAFOODS,
      name: 'Seafoods',
      desc: 'Seafoods',
      imageName: 'fish',
      foods: FoodData.fishes,
    ),
    FoodTypeEnum.MEATS: FoodType(
      foodTypeEnum: FoodTypeEnum.MEATS,
      name: 'Meats',
      desc: 'Meats',
      imageName: 'meat',
      foods: FoodData.meats,
    ),
    FoodTypeEnum.OTHERS: FoodType(
      foodTypeEnum: FoodTypeEnum.OTHERS,
      name: 'Others',
      desc: 'Others',
      imageName: 'other',
      foods: FoodData.others,
    ),
  };
}
