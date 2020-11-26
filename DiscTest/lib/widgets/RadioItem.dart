import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seabird.disctest/models/RadioModel.dart';

import '../helpers/Helpers.dart';

class RadioItem extends StatelessWidget {
  final RadioModel _item;
  final bool _isLikeMost;

  RadioItem(this._item, this._isLikeMost);
  @override
  Widget build(BuildContext context) {
    return new Container(
      margin: new EdgeInsets.symmetric(vertical: Helpers.isIpad() ? 7: 2),
      child: new Row(
        mainAxisSize: MainAxisSize.max,
        children: <Widget>[
          new Container(
            height: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.7 : 25.0,
            width: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.7 : 25.0,
            child: new Center(
              child: new Text(_item.buttonText,
                  style: new TextStyle(
                      color: _item.isSelected ? Colors.white : Colors.black,
                      fontWeight: FontWeight.bold,
                      fontSize: 18.0)),
            ),
            decoration: new BoxDecoration(
              color: _item.isSelected
                  ? _isLikeMost
                      ? Colors.green
                      : Colors.red
                  : Colors.transparent,
              border: new Border.all(
                  width: 1.0,
                  color: _item.isSelected
                      ? _isLikeMost
                          ? Colors.lightBlue
                          : Colors.red
                      : Colors.black),
              borderRadius: const BorderRadius.all(const Radius.circular(40.0)),
              boxShadow: _item.isSelected
                  ? [
                      BoxShadow(
                        color: (_isLikeMost ? Colors.green : Colors.red)
                            .withOpacity(0.5),
                        spreadRadius: 2,
                        blurRadius: 2,
                        offset: Offset(2, 2),
                      ), // changes position of shadow
                    ]
                  : null,
            ),
          ),
          Expanded(
            child: new Container(
              margin: new EdgeInsets.only(left: 5),
              child: new Text(
                _item.text,
                style: TextStyle(
                    color: _item.isSelected
                        ? (_isLikeMost
                            ? Color.fromRGBO(0, 128, 0, 1)
                            : Colors.deepOrange.withOpacity(0.9))
                        : Colors.black,
                    fontWeight: FontWeight.w500,
                    // backgroundColor: Colors.black,
                    fontSize:
                        Helpers.isIpad() ? Helpers.ipadIconSize() / 2 : 17),
              ),
            ),
          )
        ],
      ),
    );
  }
}
