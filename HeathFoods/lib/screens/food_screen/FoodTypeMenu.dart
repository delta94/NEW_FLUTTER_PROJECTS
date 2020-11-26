import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.goutfood/AppProvider.dart';
import 'package:seabird.goutfood/helpers/Helpers.dart';
import 'package:seabird.goutfood/helpers/ReponsiveHelper.dart';
import 'package:seabird.goutfood/helpers/Utils.dart';
import 'package:seabird.goutfood/models/FoodType.dart';
import 'package:shimmer/shimmer.dart';

class FoodTypeMenu extends StatefulWidget {
  const FoodTypeMenu({
    Key key,
    this.foodType,
  }) : super(key: key);

  final FoodType foodType;

  @override
  _FoodTypeMenuState createState() => _FoodTypeMenuState();
}

class _FoodTypeMenuState extends State<FoodTypeMenu> {
  @override
  Widget build(BuildContext context) {
    var appProvider = Provider.of<AppProvider>(context, listen: false);
    return ClipRRect(
      borderRadius: BorderRadius.circular(50),
      child: FlatButton(
        padding: EdgeInsets.zero,
        minWidth: 0,
        onPressed: () {
          Helpers.tapButtonSound();
          appProvider.updateSelectedFoodType(widget.foodType.foodTypeEnum);
          setState(() {
            widget.foodType.isSelected = !widget.foodType.isSelected;
          });
        },
        child: Selector<AppProvider, String>(
          selector: (buildContext, appProvider) => appProvider.searchText,
          builder: (context, value, child) {
            return Opacity(
              opacity: widget.foodType.isSelected ? 1 : 0.8,
              child: Stack(
                children: [
                  Container(
                      color: widget.foodType.isSelected
                          ? Colors.yellow[100]
                          : Colors.transparent,
                      child: Utils.getImage(widget.foodType.imageName)),
                  Container(
                    alignment: Alignment.bottomCenter,
                    margin: EdgeInsets.only(bottom: 2),
                    child: Container(
                      padding: EdgeInsets.symmetric(horizontal: 2),
                      decoration: BoxDecoration(
                        color: Colors.black,
                        borderRadius: BorderRadius.circular(4),
                      ),
                      child: Shimmer.fromColors(
                        baseColor: Colors.white,
                        highlightColor: Colors.yellowAccent,
                        child: Text(
                          widget.foodType.name,
                          style: TextStyle(
                            color: Colors.white,
                            fontSize: getXXSmallTextSize(),
                            fontWeight: FontWeight.bold,
                          ),
                        ),
                      ),
                    ),
                  )
                ],
              ),
            );
          },
        ),
      ),
    );
  }
}
