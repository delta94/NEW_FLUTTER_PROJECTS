import 'package:flutter/widgets.dart';

class SlideRoute extends PageRouteBuilder {
  final Widget widget;
  @override
  final RouteSettings settings;
  SlideRoute({this.widget, this.settings})
      : super(
          settings: settings,
          pageBuilder: (
            BuildContext context,
            Animation<double> animation,
            Animation<double> animation2,
          ) =>
              widget,
          transitionsBuilder: (
            BuildContext context,
            Animation<double> animation,
            Animation<double> animation2,
            Widget widget,
          ) =>
              SlideTransition(
            position: Tween<Offset>(
              begin: const Offset(1.0, 0.0),
              end: Offset.zero,
            ).animate(animation),
            child: SlideTransition(
              position: Tween<Offset>(
                begin: Offset.zero,
                end: const Offset(-1.0, 0.0),
              ).animate(animation2),
              child: widget,
            ),
          ),
        );
}
