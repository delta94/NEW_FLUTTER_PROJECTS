import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.letitgo/widgets/ShadowText.dart';

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
        child: ShadowText(
          "$points",
          style: TextStyle(color: Colors.yellow, fontSize: 60),
        ),
      ),
    );
  }
}
