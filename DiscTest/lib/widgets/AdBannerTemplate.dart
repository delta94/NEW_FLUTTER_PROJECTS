import 'package:flutter/widgets.dart';
import 'package:seabird.disctest/helpers/AdHelpers.dart';

class AdBannerTemplate extends StatefulWidget {
  const AdBannerTemplate({
    Key key,
    @required this.child,
  }) : super(key: key);

  final Widget child;

  @override
  _AdBannerTemplateState createState() => _AdBannerTemplateState();
}

class _AdBannerTemplateState extends State<AdBannerTemplate> {
  @override
  Widget build(BuildContext context) {
    return Column(children: [
      AdHelpers.getBannerAd(),
      Expanded(
        child: Container(
          padding: EdgeInsets.only(left: 10, right: 10),
          child: widget.child,
        ),
      )
    ]);
  }
}
