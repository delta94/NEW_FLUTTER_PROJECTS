import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.disctest/helpers/Helpers.dart';
import 'package:seab1ird.disctest/widgets/RadioItem.dart';
import 'package:seab1ird.disctest/models/RadioModel.dart';

class OptionItem extends StatefulWidget {
  final bool isHightLight;
  final int questionId;
  final int answerId;
  final bool isLikeMost;
  final List<RadioModel> radioModelsList;
  final VoidCallback onTap;

  OptionItem(
      {this.isHightLight,
      this.questionId,
      this.answerId,
      this.isLikeMost,
      this.radioModelsList,
      this.onTap});

  @override
  _OptionItemState createState() => _OptionItemState();
}

class _OptionItemState extends State<OptionItem> {
  void onTap() async {
    Helpers.tapButtonSound();
    widget.onTap();
    setState(() {
      widget.radioModelsList[widget.answerId].isSelected = true;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Material(
      color: widget.isHightLight ? Colors.white24 : Colors.transparent,
      child: InkWell(
        //highlightColor: Colors.red,
        splashColor: Colors.blueAccent,
        onTap: () => onTap(),
        child: new RadioItem(
            widget.radioModelsList[widget.answerId], widget.isLikeMost),
      ),
    );
  }
}
