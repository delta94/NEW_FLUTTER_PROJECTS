import 'dart:io';

import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

class ExitWarning extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return new AlertDialog(
        backgroundColor: Colors.white,
        title: new Text('Bạn có muốn thoát ứng dụng?'),
        content: new Text('Bạn chắc chứ?'),
        actions: <Widget>[
          new FlatButton(
            onPressed: () => Navigator.of(context).pop(false),
            child: new Text('Không'),
          ),
          new FlatButton(
            onPressed: () =>  exit(0),
            child: new Text('Có'),
          ),
        ],
      );
  }
}