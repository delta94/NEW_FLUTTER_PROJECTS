import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.showyourself/helpers/EndlessController.dart';

class ChangingScreenAnimation extends StatelessWidget {
  const ChangingScreenAnimation({
    Key key,
    @required this.changingScreenAnimation,
    @required EndlessController changingScreenController,
  }) : _transitionAnimatedController = changingScreenController, super(key: key);

  final Animation<double> changingScreenAnimation;
  final EndlessController _transitionAnimatedController;

  @override
  Widget build(BuildContext context) {
    return Align(
      alignment: Alignment.center,
      child: Transform.translate(
        offset: Offset(0, changingScreenAnimation.value),
        child: Container(
          alignment: Alignment.center,
          child: FlareActor(
            "images/changing_screen.flr",
            alignment: Alignment.center,
            controller: _transitionAnimatedController,
            fit: BoxFit.cover,
          ),
        ),
      ),
    );
  }
}
