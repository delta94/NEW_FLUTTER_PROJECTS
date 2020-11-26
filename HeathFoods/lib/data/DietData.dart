import 'package:seabird.goutfood/models/DataInfo.dart';

class DietData {
  static Map<String, DataInfo> dietData = {
    'Monday': DataInfo([
      Info(
        'Breakfast: ',
        smallInfos: [
          'Oats with Greek yogurt and 1/4 cup (about 31 grams) berries.'
        ],
      ),
      Info('Lunch: ',
          smallInfos: ['Quinoa salad with boiled eggs and fresh veggies']),
      Info('Dinner: ', smallInfos: [
        'Whole wheat pasta with roasted chicken, spinach, bell peppers and low-fat feta cheese.'
      ]),
    ]),
    'Tuesday': DataInfo([
      Info(
        'Breakfast: ',
        smallInfos: [
          'Smoothie with 1/2 cup (74 grams) blueberries, 1/2 cup (15 grams) spinach, 1/4 cup (59 ml) Greek yogurt and 1/4 cup (59 ml) low-fat milk.'
        ],
      ),
      Info('Lunch: ',
          smallInfos: ['Whole grain sandwich with eggs and salad.']),
      Info('Dinner: ',
          smallInfos: ['Stir-fried chicken and vegetables with brown rice.']),
    ]),
    'Wednesday': DataInfo([
      Info(
        'Breakfast: ',
        smallInfos: [
          'Overnight oats — 1/3 cup (27 grams) rolled oats, 1/4 cup (59 ml) Greek yogurt, 1/3 cup (79 ml) low-fat milk, 1 tbsp (14 grams) chia seeds, 1/4 cup (about 31 grams) berries and 1/4 tsp (1.2 ml) vanilla extract. Let sit overnight.'
        ],
      ),
      Info('Lunch: ', smallInfos: [
        'Chickpeas and fresh vegetables in a whole wheat wrap.'
      ]),
      Info('Dinner: ', smallInfos: [
        'Herb-baked salmon with asparagus and cherry tomatoes.'
      ]),
    ]),
    'Thursday': DataInfo([
      Info(
        'Breakfast: ',
        smallInfos: [
          'Overnight chia seed pudding — 2 tbsp (28 grams) chia seeds, 1 cup (240 ml) Greek yogurt and 1/2 tsp (2.5 ml) vanilla extract with sliced fruits of your choice. Let sit in a bowl or mason jar overnight.'
        ],
      ),
      Info('Lunch: ', smallInfos: ['Leftover salmon with salad.']),
      Info('Dinner: ',
          smallInfos: ['Quinoa, spinach, eggplant and feta salad.']),
    ]),
    'Friday': DataInfo([
      Info(
        'Breakfast: ',
        smallInfos: ['French toast with strawberries.'],
      ),
      Info('Lunch: ',
          smallInfos: ['Whole grain sandwich with boiled eggs and salad.']),
      Info('Dinner: ',
          smallInfos: ['Stir-fried tofu and vegetables with brown rice.']),
    ]),
    'Saturday': DataInfo([
      Info(
        'Breakfast: ',
        smallInfos: ['Mushroom and zucchini frittata.'],
      ),
      Info('Lunch: ', smallInfos: ['Leftover stir-fried tofu and brown rice.']),
      Info('Dinner: ',
          smallInfos: ['Homemade chicken burgers with a fresh salad.']),
    ]),
    'Sunday': DataInfo([
      Info(
        'Breakfast: ',
        smallInfos: ['Two-egg omelet with spinach and mushrooms.'],
      ),
      Info('Lunch: ', smallInfos: [
        'Chickpeas and fresh vegetables in a whole wheat wrap.'
      ]),
      Info('Dinner: ', smallInfos: [
        'Scrambled egg tacos — scrambled eggs with spinach and bell peppers on whole wheat tortillas.'
      ]),
    ]),
  };
}
