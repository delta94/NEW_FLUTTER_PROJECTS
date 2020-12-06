import 'package:flutter/widgets.dart';

import 'AdHelpers.dart';

class AdBannerTemplate extends StatefulWidget {
  const AdBannerTemplate({
    Key key,
    @required this.needShowSecondBanner,
    @required this.child,
  }) : super(key: key);

  final bool needShowSecondBanner;
  final Widget child;

  @override
  _AdBannerTemplateState createState() => _AdBannerTemplateState();
}

class _AdBannerTemplateState extends State<AdBannerTemplate> {
  @override
  Widget build(BuildContext context) {
    return Column(children: [
      AdHelpers.getBannerAd(widget.needShowSecondBanner),
      Expanded(
        child: Container(
          margin: EdgeInsets.only(
              top: widget.needShowSecondBanner || !AdHelpers.isReleaseMode()
                  ? 0
                  : 60),
          padding: EdgeInsets.only(left: 10, right: 10),
          child: widget.child,
        ),
      )
    ]);
  }
}
