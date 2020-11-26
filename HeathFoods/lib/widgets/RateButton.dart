import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/widgets.dart';
import 'package:in_app_review/in_app_review.dart';
import 'package:seabird.goutfood/helpers/FlareEndlessController.dart';
import 'package:seabird.goutfood/helpers/ReponsiveHelper.dart';

class RateButton extends StatelessWidget {
  RateButton({
    Key key,
  }) : super(key: key);

  final FlareEndlessController _starLoopController =
      FlareEndlessController('Untitled', 1);

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      child: Container(
          width: getXLargeLogoSize(),
          height: getXLargeLogoSize(),
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
