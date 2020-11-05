import 'package:bottom_navy_bar/bottom_navy_bar.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.disctest/data/FoodTypeData.dart';
import 'package:seab1ird.disctest/enums/FoodUricContentType.dart';
import 'package:seab1ird.disctest/helpers/Ads.dart';
import 'package:seab1ird.disctest/helpers/ReponsiveHelper.dart';
import 'package:seab1ird.disctest/helpers/Utils.dart';
import 'package:seab1ird.disctest/models/Food.dart';
import 'package:seab1ird.disctest/models/FoodType.dart';
import 'package:seab1ird.disctest/widgets/BackgroundWidget.dart';

import 'food_list_widget.dart';

class FoodScreenBody extends StatefulWidget {
  @override
  _FoodScreenBodyState createState() => _FoodScreenBodyState();
}

class _FoodScreenBodyState extends State<FoodScreenBody> {
  double marginTop = 0;
  int _selectedIndex = 0;
  PageController pageController;
  List<FoodType> foodTypes = getFoodTypeList();
  List<Food> foods;

  @override
  void initState() {
    if (Ads.isReleaseMode()) {
      Ads.showBannerAd();
      marginTop = 60;
    }

    foods = foodTypes.fold([], (previousValue, foodType) {
      previousValue.addAll(foodType.foods);
      return previousValue;
    });

    pageController = PageController();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        body: Stack(children: <Widget>[
          BackgroundWidget(),
          Container(
            child: Column(
              children: [
                Container(
                  color: Colors.black,
                  child: GridView.builder(
                      shrinkWrap: true,
                      padding: EdgeInsets.symmetric(vertical: 5, horizontal: 5),
                      itemCount: foodTypes.length,
                      gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                        mainAxisSpacing: 5,
                        crossAxisSpacing: 5,
                        childAspectRatio: 2,
                        crossAxisCount: 4,
                      ),
                      itemBuilder: (BuildContext context, int index) {
                        return FoodTypeWidget(foodType: foodTypes[index]);
                      }),
                ),
                Expanded(
                  child: Container(
                    alignment: Alignment.center,
                    child: PageView(
                      controller: pageController,
                      onPageChanged: (index) =>
                          setState(() => _selectedIndex = index),
                      children: <Widget>[
                        Container(
                          color: Colors.lightGreen,
                          child: FoodListWidget(
                            foods: foods,
                            foodUricContentType: FoodUricContentType.LOW,
                          ),
                        ),
                        Container(
                          color: Colors.orangeAccent,
                          child: FoodListWidget(
                            foods: foods,
                            foodUricContentType: FoodUricContentType.MODERATE,
                          ),
                        ),
                        Container(
                          color: Colors.redAccent,
                          child: FoodListWidget(
                            foods: foods,
                            foodUricContentType: FoodUricContentType.HIGH,
                          ),
                        ),
                      ],
                    ),
                  ),
                ),
              ],
            ),
          ),
        ]),
        bottomNavigationBar: BottomNavyBar(
          selectedIndex: _selectedIndex,
          showElevation: true,
          itemCornerRadius: 8,
          curve: Curves.easeInBack,
          onItemSelected: (index) => setState(() {
            _selectedIndex = index;
            pageController.animateToPage(index,
                duration: Duration(milliseconds: 300), curve: Curves.ease);
          }),
          items: [
            BottomNavyBarItem(
              icon: Icon(Icons.trending_up),
              title: Text('Low'),
              activeColor: Colors.green,
              textAlign: TextAlign.center,
            ),
            BottomNavyBarItem(
              icon: Icon(Icons.apps),
              title: Text('Moderate'),
              activeColor: Colors.orange,
              textAlign: TextAlign.center,
            ),
            BottomNavyBarItem(
              icon: Icon(Icons.fireplace_sharp),
              title: Text('High'),
              activeColor: Colors.pink,
              textAlign: TextAlign.center,
            ),
          ],
        ),
      ),
    );
  }
}

class FoodTypeWidget extends StatefulWidget {
  const FoodTypeWidget({
    Key key,
    this.foodType,
  }) : super(key: key);

  final FoodType foodType;

  @override
  _FoodTypeWidgetState createState() => _FoodTypeWidgetState();
}

class _FoodTypeWidgetState extends State<FoodTypeWidget> {
  @override
  Widget build(BuildContext context) {
    return FlatButton(
      minWidth: 0,
      onPressed: () {
        setState(() {
          widget.foodType.isSelected = !widget.foodType.isSelected;
        });
      },
      color: widget.foodType.isSelected ? Colors.white : Colors.black12,
      child: Opacity(
          opacity: widget.foodType.isSelected ? 1 : 0.5,
          child: Stack(
            children: [
              Utils.getImage(widget.foodType.imageName),
              Container(
                alignment: Alignment.bottomCenter,
                margin: EdgeInsets.only(bottom: 2),
                child: Text(
                  widget.foodType.name,
                  style: TextStyle(
                    color: Colors.yellow,
                    fontSize: getXSmallTextSize(),
                    backgroundColor: Colors.black87,
                    fontWeight: FontWeight.bold,
                  ),
                ),
              )
            ],
          )),
    );
  }
}
