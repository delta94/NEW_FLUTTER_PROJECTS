import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/widgets.dart';
import 'package:in_app_review/in_app_review.dart';
import 'package:seabird.weekendfashion/helpers/EndlessController.dart';

class RateButton extends StatelessWidget {
  RateButton({
    Key key,
  }) : super(key: key);

  final EndlessController _starLoopController =
      EndlessController('Untitled', 1);

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      child: Container(
          width: 40,
          height: 40,
          child: FlareActor(
            'images/star.flr',
            alignment: Alignment.center,
            controller: _starLoopController,
          )),
      onTap: () {
        InAppReview.instance.openStoreListing();
      },
    );
  }
}
