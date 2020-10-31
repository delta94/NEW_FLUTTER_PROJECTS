import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

import '../helpers/Helpers.dart';

class RadioItem extends StatelessWidget {
  final bool isSelected;

  RadioItem(this.isSelected);
  @override
  Widget build(BuildContext context) {
    return new Container(
      margin: new EdgeInsets.all(5),
      child: new Row(
        mainAxisSize: MainAxisSize.max,
        children: <Widget>[
          new Container(
            height: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.7 : 25.0,
            width: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.7 : 25.0,
            decoration: new BoxDecoration(
              border: new Border.all(
                  width: 1.0, color: isSelected ? Colors.yellow : Colors.grey),
              borderRadius: const BorderRadius.all(const Radius.circular(40.0)),
            ),
            child: Container(
              height: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.7 : 25.0,
              width: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.7 : 25.0,
              margin: EdgeInsets.all(3),
              decoration: BoxDecoration(
                color: isSelected
                    ? isSelected
                        ? Colors.lightGreenAccent
                        : Colors.transparent
                    : Colors.transparent,
                boxShadow: isSelected
                    ? [
                        BoxShadow(
                          color: Colors.yellow.withOpacity(0.5),
                          spreadRadius: 5,
                          blurRadius: 5,
                          offset: Offset(0, 2),
                        ), // changes position of shadow
                      ]
                    : null,
                borderRadius:
                    const BorderRadius.all(const Radius.circular(40.0)),
              ),
            ),
          ),
        ],
      ),
    );
  }
}
