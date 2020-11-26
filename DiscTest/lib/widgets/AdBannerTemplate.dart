import 'package:flutter/widgets.dart';
import 'package:seabird.disctest/helpers/AdHelpers.dart';

class AdBannerTemplate extends StatelessWidget {
  const AdBannerTemplate({
    Key key,
    @required this.needShowSecondBanner,
    @required this.child,
  }) : super(key: key);

  final bool needShowSecondBanner;
  final Widget child;

  @override
  Widget build(BuildContext context) {
    return Column(children: [
      AdHelpers.showBannerAd(needShowSecondBanner),
      Expanded(
        child: Container(
          margin: EdgeInsets.only(
              top: needShowSecondBanner || !AdHelpers.isReleaseMode() ? 0 : 60),
          padding: EdgeInsets.only(left: 10, right: 10),
          child: child,
        ),
      )
    ]);
  }
}
