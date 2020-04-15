import 'package:app_review/app_review.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.hkmovies/helpers/EndLoopController.dart';

class RateApp extends StatelessWidget {
  final AnimatedController _rateIconController = AnimatedController('Untitled', 1);

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      child: Container(
        width: 30,
        height: 30,
        child: FlareActor("images/Star.flr",
          alignment: Alignment.center,
          controller: _rateIconController,
        )
      ),
      onTap: () {
        AppReview.storeListing.then((onValue) {});
      },
    );
  }
}