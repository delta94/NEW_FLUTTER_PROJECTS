import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.disctest/view_models/GameProvider.dart';

class BackgroundWidget extends StatelessWidget {
  const BackgroundWidget({
    Key key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    GameProvider questionProvider = Provider.of<GameProvider>(context);
    return Container(
        // decoration: new BoxDecoration(
        //   image: new DecorationImage(
        //     image: AssetImage('images/bg_${questionProvider.themeColorName}.png'),
        //     fit: BoxFit.cover,
        //   ),
        // ),
        );
  }
}
