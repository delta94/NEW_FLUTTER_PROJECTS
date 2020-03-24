import 'package:flutter/widgets.dart';

class SlideCenterRoute extends PageRouteBuilder {
  final Widget widget;
  final RouteSettings settings;
  SlideCenterRoute({this.widget, this.settings}) :  super(
    settings: settings,
    pageBuilder: (
      BuildContext context,
      Animation<double> animation,
      Animation<double> animation2,
    ) => widget,
    transitionsBuilder: (
      BuildContext context,
      Animation<double> animation,
      Animation<double> animation2,
      Widget widget,
    ) => ScaleTransition(
          scale: Tween<double>(
            begin: 0.0,
            end: 1.0,
          ).animate(
            CurvedAnimation(
              parent: animation,
              curve: Curves.bounceInOut,
            ),
          ),
          child: widget,
        ),
  );
}