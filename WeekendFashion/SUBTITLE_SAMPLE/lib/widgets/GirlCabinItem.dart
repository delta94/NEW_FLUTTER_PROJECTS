import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.weekendfashion/enums/ItemType.dart';
import 'package:seabird.weekendfashion/enums/SubItemType.dart';
import 'package:seabird.weekendfashion/helpers/GameProvider.dart';
import 'package:seabird.weekendfashion/widgets/AnimatedButton.dart';

class GirlCabinItem extends StatefulWidget {
  final int girlIndex;
  final double left;
  final double top;
  final double width;
  final String image;
  final ItemType itemType;
  final SubItemType subItemType;
  GirlCabinItem(
      {@required this.girlIndex,
      this.left,
      this.top,
      this.width,
      this.image,
      this.itemType,
      this.subItemType});

  @override
  _GirlCabinItemState createState() => _GirlCabinItemState();
}

class _GirlCabinItemState extends State<GirlCabinItem> {
  bool toggle = false;

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    String img = "images/${widget.image}.png";
    return Positioned(
      left: widget.left,
      top: widget.top,
      child: Stack(
        children: <Widget>[
          Image.asset(
            img,
            width: widget.width * 1.08,
            color: gameProvider.selectedItemGirlList[widget.girlIndex]
                        [widget.itemType][widget.subItemType] ==
                    widget.image
                ? Colors.yellow
                : Colors.transparent,
          ),
          Positioned(
            left: 4,
            top: 4,
            child: AnimatedButton(
              image: img,
              width: widget.width,
              callback: () => gameProvider.setGirlItemType(
                widget.girlIndex,
                widget.itemType,
                widget.image,
                widget.subItemType,
              ),
            ),
          ),
        ],
      ),
    );
  }
}
