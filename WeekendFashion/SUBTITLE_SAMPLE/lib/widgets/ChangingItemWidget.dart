import 'package:flare_flutter/flare_actor.dart';
import 'package:flare_flutter/flare_controls.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.weekendfashion/helpers/GameProvider.dart';

class ChangingItemWidget extends StatelessWidget {
  const ChangingItemWidget({
    Key key,
    @required this.changingItemFlareController,
  }) : super(key: key);

  final FlareControls changingItemFlareController;

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);
    return Positioned(
      right: gameProvider.currentGirlIndex == 0 ? 40 : null,
      left: gameProvider.currentGirlIndex == 1 ? 40 : null,
      top: gameProvider.deviceSize.height * 0.1,
      height: gameProvider.deviceSize.height * 0.9,
      width: gameProvider.deviceSize.width * 0.5,
      child: FlareActor(
        "images/changing_item.flr",
        fit: BoxFit.contain,
        animation: "Untitled",
        controller: changingItemFlareController,
      ),
    );
  }
}
