import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:flutter_keyboard_visibility/flutter_keyboard_visibility.dart';
import 'package:in_app_review/in_app_review.dart';
import 'package:provider/provider.dart';
import 'package:seabird.goutfood/AppProvider.dart';
import 'package:seabird.goutfood/data/FoodTypeData.dart';
import 'package:seabird.goutfood/enums/FoodUricContentType.dart';
import 'package:seabird.goutfood/helpers/Helpers.dart';
import 'package:seabird.goutfood/helpers/ReponsiveHelper.dart';
import 'package:seabird.goutfood/models/FoodType.dart';
import 'package:seabird.goutfood/widgets/AdBannerTemplate.dart';
import 'package:seabird.goutfood/widgets/BottomNavyBar.dart';
import 'package:seabird.goutfood/widgets/RateButton.dart';
import 'package:shimmer/shimmer.dart';

import 'FoodListWidget.dart';
import 'FoodTypeMenu.dart';

class FoodsScreen extends StatefulWidget {
  @override
  _FoodsScreenState createState() => _FoodsScreenState();
}

class _FoodsScreenState extends State<FoodsScreen> {
  @override
  Widget build(BuildContext context) {
    var appProvider = Provider.of<AppProvider>(context, listen: false);
    return SafeArea(
      child: AdBannerTemplate(
        needShowSecondBanner: !appProvider.admobLoaded,
        child: Body(),
      ),
    );
  }
}

class Body extends StatefulWidget {
  @override
  _BodyState createState() => _BodyState();
}

class _BodyState extends State<Body> {
  int selectedIndex = 0;
  PageController pageController = PageController();
  List<FoodType> foodTypes = FoodTypeData.foodTypeMap.values.toList();
  bool showFoodTypeMenu = true;
  TextEditingController textEditingController = TextEditingController();
  AppProvider appProvider;

  @override
  void initState() {
    appProvider = Provider.of<AppProvider>(context, listen: false);
    if (appProvider.isFirstUse) {
      appProvider.isFirstUse = false;
      appProvider.setIsFirstUse();
      Future.delayed(
          Duration(seconds: 10), () => InAppReview.instance.requestReview());
    }

    super.initState();
  }

  void changePageViewIndex(int index) {
    if (index != selectedIndex) {
      Helpers.tapButtonSound();
      if (index < 3) clearSearhText();
      setState(() {
        selectedIndex = index;
        pageController.animateToPage(index,
            duration: Duration(milliseconds: 300), curve: Curves.ease);
      });
    }
  }

  void clearSearhText() {
    textEditingController.clear();
    appProvider.clearSearhText();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        child: KeyboardDismissOnTap(
          child: Column(
            children: [
              // Searching name
              Container(
                padding: EdgeInsets.symmetric(vertical: 5),
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    IconButton(
                      icon: Image.asset(
                        'images/home_icon.png',
                        height: getMediumLogoSize(),
                      ),
                      onPressed: () => Helpers.backToHomeScreen(context),
                    ),
                    Container(
                      alignment: Alignment.center,
                      width: ReponsiveHelper.deviceSize.width -
                          (isIpad ? 220 : 110),
                      height: isIpad ? 60 : 40,
                      decoration: BoxDecoration(
                        color: Colors.grey[300],
                        borderRadius: BorderRadius.circular(20),
                      ),
                      child: TextField(
                        controller: textEditingController,
                        decoration: InputDecoration(
                          border: InputBorder.none,
                          contentPadding: EdgeInsets.fromLTRB(isIpad ? 20 : 0,
                              isIpad ? 15 : 5, 20, isIpad ? 15 : 5),
                          prefixIcon: Padding(
                            padding: EdgeInsets.all(isIpad ? 8.0 : 0),
                            child: Icon(
                              Icons.search,
                              color: Colors.black,
                              size: getSmallLogoSize(),
                            ),
                          ),
                          suffixIcon: IconButton(
                            padding: EdgeInsets.only(
                                bottom: isIpad ? 20 : 0,
                                right: isIpad ? 40 : 0),
                            icon: Icon(
                              Icons.clear,
                              color: Colors.black,
                              size: getSmallLogoSize(),
                            ),
                            onPressed: () {
                              Helpers.tapButtonSound();
                              clearSearhText();
                              FocusScope.of(context).unfocus();
                            },
                          ),
                          focusedBorder: OutlineInputBorder(
                            borderRadius: BorderRadius.circular(50),
                            borderSide: BorderSide(
                              color: Colors.yellowAccent,
                              width: 2.0,
                            ),
                          ),
                          hintText: 'Enter a food name',
                          hintStyle: TextStyle(fontWeight: FontWeight.normal),
                        ),
                        onChanged: (searchText) {
                          appProvider.updateSearchText(searchText);
                          changePageViewIndex(3);
                        },
                        textAlign: TextAlign.center,
                        style: TextStyle(
                          color: Colors.black,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                    ),
                    RateButton()
                  ],
                ),
              ),
              // Food Type menus
              Visibility(
                visible: showFoodTypeMenu,
                child: Container(
                  padding: EdgeInsets.symmetric(vertical: 5),
                  decoration: BoxDecoration(
                    borderRadius: BorderRadius.circular(15),
                    color: Colors.black87,
                    shape: BoxShape.rectangle,
                    border: Border.all(color: Colors.yellow, width: 2),
                    gradient: LinearGradient(
                      begin: Alignment.topLeft,
                      end: Alignment(1, 0.0),
                      colors: [Colors.black, Colors.black87], // red to yellow
                      tileMode: TileMode.clamp,
                    ),
                  ),
                  child: GridView.builder(
                      shrinkWrap: true,
                      padding: EdgeInsets.symmetric(horizontal: 5),
                      itemCount: foodTypes.length,
                      gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                        mainAxisSpacing: 5,
                        crossAxisSpacing: 5,
                        childAspectRatio: 2,
                        crossAxisCount: 4,
                      ),
                      itemBuilder: (BuildContext context, int index) {
                        return FoodTypeMenu(foodType: foodTypes[index]);
                      }),
                ),
              ),
              // SizedBox(height: 10),

              // Page views
              Expanded(
                child: Container(
                  // color: Colors.black,
                  alignment: Alignment.center,
                  child: PageView(
                    controller: pageController,
                    onPageChanged: (index) => changePageViewIndex(index),
                    children: <Widget>[
                      Container(
                        child: FoodListWidget(
                          backgroundColor: Color.fromRGBO(230, 255, 230, 1),
                          foodUricContentType: FoodUricContentType.LOW,
                        ),
                      ),
                      Container(
                        child: FoodListWidget(
                          backgroundColor: Color.fromRGBO(255, 235, 204, 1),
                          foodUricContentType: FoodUricContentType.MODERATE,
                        ),
                      ),
                      Container(
                        child: FoodListWidget(
                          backgroundColor: Color.fromRGBO(255, 230, 230, 1),
                          foodUricContentType: FoodUricContentType.HIGH,
                        ),
                      ),
                      Container(
                        child: FoodListWidget(),
                      ),
                    ],
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
      bottomNavigationBar: Visibility(
        visible: showFoodTypeMenu,
        child: BottomNavyBar(
          backgroundColor: Colors.yellow[200],
          selectedIndex: selectedIndex,
          showElevation: true,
          itemCornerRadius: 8,
          curve: Curves.easeInBack,
          onItemSelected: (index) => changePageViewIndex(index),
          items: [
            BottomNavyBarItem(
              icon: Image.asset(
                'images/low.png',
                height: getMediumSLogoSize(),
              ),
              title: Shimmer.fromColors(
                baseColor: Colors.green,
                highlightColor: Colors.black,
                child: Text('Low Uric',
                    style: TextStyle(fontSize: getXSSmallTextSize())),
              ),
              activeColor: Colors.green,
              textAlign: TextAlign.left,
            ),
            BottomNavyBarItem(
              icon: Image.asset(
                'images/moderate.png',
                height: getMediumSLogoSize(),
              ),
              title: Shimmer.fromColors(
                baseColor: Colors.deepOrangeAccent,
                highlightColor: Colors.black,
                child: Text(
                  'Moderate Uric',
                  style: TextStyle(fontSize: getXSSmallTextSize()),
                ),
              ),
              activeColor: Colors.orange,
              textAlign: TextAlign.left,
            ),
            BottomNavyBarItem(
              icon: Image.asset(
                'images/high.png',
                height: getMediumSLogoSize(),
              ),
              title: Shimmer.fromColors(
                baseColor: Colors.pink,
                highlightColor: Colors.black,
                child: Text('High Uric',
                    style: TextStyle(fontSize: getXSSmallTextSize())),
              ),
              activeColor: Colors.pink,
              textAlign: TextAlign.left,
            ),
            BottomNavyBarItem(
              icon: Image.asset(
                'images/all.png',
                height: getMediumSLogoSize(),
              ),
              title: Shimmer.fromColors(
                baseColor: Colors.black,
                highlightColor: Colors.black,
                child: Text('All Foods',
                    style: TextStyle(fontSize: getXSSmallTextSize())),
              ),
              activeColor: Colors.grey,
              textAlign: TextAlign.left,
            ),
          ],
        ),
      ),
    );
  }
}
