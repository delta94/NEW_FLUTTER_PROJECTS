import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.disctest/helpers/Helpers.dart';
import 'package:seab1ird.disctest/widgets/RadioItem.dart';

class OptionItem extends StatefulWidget {
  final bool isHightLight;
  final int questionId;
  final bool isSelected;
  final VoidCallback onTap;

  OptionItem({
    this.isHightLight,
    this.questionId,
    this.isSelected,
    this.onTap,
  });

  @override
  _OptionItemState createState() => _OptionItemState();
}

class _OptionItemState extends State<OptionItem> {
  void onTap() async {
    Helpers.tapButtonSound();
    widget.onTap();
  }

  @override
  Widget build(BuildContext context) {
    return Material(
      color: widget.isHightLight ? Colors.white24 : Colors.transparent,
      child: InkWell(
        splashColor: Colors.blueAccent,
        onTap: () => onTap(),
        child: new RadioItem(widget.isSelected),
      ),
    );
  }
}
