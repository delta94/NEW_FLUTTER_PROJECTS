import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.showyourself/models/RadioModel.dart';

class RadioItem extends StatelessWidget {
  final RadioModel _item;
  final bool _isLikeMost;

  RadioItem(this._item, this._isLikeMost);
  @override
  Widget build(BuildContext context) {
    return new Container(
      margin: new EdgeInsets.all(7),
      child: new Row(
        mainAxisSize: MainAxisSize.max,
        children: <Widget>[
          new Container(
            height: 25.0,
            width: 25.0,
            child: new Center(
              child: new Text(_item.buttonText,
                  style: new TextStyle(
                      color: _item.isSelected ? Colors.white : Colors.grey,
                      fontWeight: FontWeight.bold,
                      fontSize: 18.0)),
            ),
            decoration: new BoxDecoration(
              color: _item.isSelected
                  ? _isLikeMost ? Colors.green : Colors.red
                  : Colors.transparent,
              border: new Border.all(
                  width: 1.0,
                  color: _item.isSelected
                      ? _isLikeMost ? Colors.lightBlue : Colors.red
                      : Colors.grey),
              borderRadius: const BorderRadius.all(const Radius.circular(20.0)),
            ),
          ),
          Expanded(
            child: new Container(
              margin: new EdgeInsets.only(left: 10.0),
              child: new Text(
                _item.text,
                style: TextStyle(
                  color: Colors.yellowAccent,
                  fontWeight: FontWeight.bold,
                  backgroundColor: Colors.black,
                ),
              ),
            ),
          )
        ],
      ),
    );
  }
}
