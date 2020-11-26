import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabi1rd.weekendfashion/helpers/GameProvider.dart';

import 'AnimatedButton.dart';

class FinishButton extends StatelessWidget {
  const FinishButton({Key key, @required this.isValid, @required this.callback})
      : super(key: key);

  final bool isValid;
  final VoidCallback callback;

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);
    return Visibility(
      visible: isValid,
      child: Positioned(
        left: gameProvider.deviceSize.width * 0.02,
        bottom: 10,
        child: AnimatedButton(
          image: "images/finishButton.png",
          width: gameProvider.deviceSize.width * 0.1,
          callback: () => callback(),
        ),
      ),
    );
  }
}
