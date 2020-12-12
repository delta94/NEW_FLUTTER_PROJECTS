import 'package:flutter/widgets.dart';
import 'package:seabird.goutfood/helpers/AdHelpers.dart';

class AdBannerTemplate extends StatelessWidget {
  const AdBannerTemplate({
    Key key,
    @required this.child,
  }) : super(key: key);

  final Widget child;

  @override
  Widget build(BuildContext context) {
    return Column(children: [
      AdHelpers.showBannerAd(),
      Expanded(
        child: Container(
          padding: EdgeInsets.only(left: 10, right: 10),
          child: child,
        ),
      )
    ]);
  }
}
