import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/widgets.dart';
import 'package:seabi1rd.weekendfashion/helpers/EndlessController.dart';

class ChangingScreenAnimation extends StatelessWidget {
  const ChangingScreenAnimation({
    Key key,
    @required this.changingScreenAnimation,
  }) : super(key: key);

  final Animation<double> changingScreenAnimation;

  @override
  Widget build(BuildContext context) {
    final EndlessController _transitionAnimatedController =
        EndlessController('Untitled', 5.0);
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
