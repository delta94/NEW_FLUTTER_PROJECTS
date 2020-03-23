import 'package:swswhaitonghop/screens/About.dart';
import 'package:swswhaitonghop/screens/Detail.dart';
import 'package:flutter/material.dart';
import 'package:swswhaitonghop/screens/Home.dart';
import 'package:swswhaitonghop/screens/ListFilms.dart';


void main() {
  runApp(
    MaterialApp(
      onGenerateRoute: (RouteSettings settings) {
        switch (settings.name) {
          case '/':
            return SlideRightRoute(widget:Home(), settings: settings);
            break;
          case '/listfilms':
            return SlideRightRoute(widget: ListFilms(), settings: settings);
            break;
          case '/detail':
            return SlideRightRoute(widget: Detail(), settings: settings);
            break;
          case '/about':
            return SlideRightRoute(widget: About(), settings: settings);
            break;
          default: 
            return SlideRightRoute(widget:Home(), settings: settings);
            break;
        }
      },
    ),
  );
}

class SlideRightRoute extends PageRouteBuilder {
  final Widget widget;
  final RouteSettings settings;
  SlideRightRoute({this.widget, this.settings}) :  super(
    settings: settings,
    pageBuilder: (
      BuildContext context,
      Animation<double> animation,
      Animation<double> secondaryAnimation,
    ) => widget,
    transitionsBuilder: (
      BuildContext context,
      Animation<double> animation,
      Animation<double> secondaryAnimation,
      Widget child,
    ) => ScaleTransition(
          scale: Tween<double>(
            begin: 0.0,
            end: 1.0,
          ).animate(
            CurvedAnimation(
              parent: animation,
              curve: Curves.fastOutSlowIn,
            ),
          ),
          child: child,
        ),
  );
}








