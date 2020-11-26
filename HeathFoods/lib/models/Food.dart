import 'package:seabird.goutfood/enums/FoodUricContentType.dart';

class Food {
  final String name;
  final double acidContent;
  FoodUricContentType foodUricContentType;

  Food(this.name, this.acidContent) {
    if (acidContent <= 100) {
      foodUricContentType = FoodUricContentType.LOW;
    } else if (acidContent > 100 && acidContent < 250) {
      foodUricContentType = FoodUricContentType.MODERATE;
    } else {
      foodUricContentType = FoodUricContentType.HIGH;
    }
  }
}
