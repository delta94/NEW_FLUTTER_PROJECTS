import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';

class CabinItem extends StatelessWidget {
  final double left;
  final double top;
  final double width;
  final String image;
  final ItemType itemType;
  CabinItem({this.left, this.top, this.width, this.image, this.itemType});
  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    return Positioned(
      left: left,
      top: top,
      child: Stack(
        children: <Widget>[
          Image.asset(
            "images/$image",
            width: width * 1.08,
            color: gameProvider.selectedItems[itemType] == image
                ? Colors.yellow
                : Colors.transparent,
          ),
          Positioned(
            left: 3,
            top: 3,
            child: InkWell(
              onTap: () => gameProvider.setItemType(itemType, image),
              child: Image.asset(
                "images/$image",
                width: width,
              ),
            ),
          ),
        ],
      ),
    );
  }
}
