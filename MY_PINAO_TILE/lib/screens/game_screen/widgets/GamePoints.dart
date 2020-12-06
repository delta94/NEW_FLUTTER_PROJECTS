import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

class GamePoints extends StatelessWidget {
  const GamePoints({
    Key key,
    @required this.points,
  }) : super(key: key);

  final int points;

  @override
  Widget build(BuildContext context) {
    return Align(
      alignment: Alignment.topCenter,
      child: Padding(
        padding: const EdgeInsets.only(top: 32.0),
        child: Text(
          "$points",
          style: TextStyle(color: Colors.red, fontSize: 60),
        ),
      ),
    );
  }
}
