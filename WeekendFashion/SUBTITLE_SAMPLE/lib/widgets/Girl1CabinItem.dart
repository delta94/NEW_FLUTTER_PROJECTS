import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/enums/ItemType.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';
import 'package:seab1ird.showyourself/helpers/GameProvider.dart';
import 'package:seab1ird.showyourself/widgets/AnimatedButton.dart';

class Girl1CabinItem extends StatefulWidget {
  final double left;
  final double top;
  final double width;
  final String image;
  final ItemType itemType;
  final SubItemType subItemType;
  Girl1CabinItem(
      {this.left,
      this.top,
      this.width,
      this.image,
      this.itemType,
      this.subItemType});

  @override
  _Girl1CabinItemState createState() => _Girl1CabinItemState();
}

class _Girl1CabinItemState extends State<Girl1CabinItem> {
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
            width: widget.width * 1.12,
            color: gameProvider.selectedItemGirl1Map[widget.itemType]
                        [widget.subItemType] ==
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
              callback: () => gameProvider.setGirl1ItemType(
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
