import 'package:flutter/material.dart';
import 'package:seab1ird.letitgo/helpers/ResponsiveHelper.dart';

class LineDivider extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Container(
      height: ResponsiveHelper.deviceSize.height,
      width: 1,
      decoration: BoxDecoration(
        gradient: LinearGradient(
          begin: Alignment.topRight,
          end: Alignment.bottomLeft,
          colors: [Colors.red, Colors.green],
        ),
      ),
    );
  }
}
