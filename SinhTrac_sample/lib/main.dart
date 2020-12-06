import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:seabird.biometry/screens/A.dart';
import 'package:seabird.biometry/screens/Ae.dart';
import 'package:seabird.biometry/screens/Ar.dart';
import 'package:seabird.biometry/screens/As.dart';
import 'package:seabird.biometry/screens/At.dart';
import 'package:seabird.biometry/screens/Au.dart';
import 'package:seabird.biometry/screens/Hist.dart';
import 'package:seabird.biometry/screens/Home.dart';
import 'package:seabird.biometry/screens/Intro.dart';
import 'package:seabird.biometry/screens/L.dart';
import 'package:seabird.biometry/screens/Lf.dart';
import 'package:seabird.biometry/screens/Lr.dart';
import 'package:seabird.biometry/screens/Lu.dart';
import 'package:seabird.biometry/screens/MainTypes.dart';
import 'package:seabird.biometry/screens/W.dart';
import 'package:seabird.biometry/screens/Wc.dart';
import 'package:seabird.biometry/screens/Wd.dart';
import 'package:seabird.biometry/screens/We.dart';
import 'package:seabird.biometry/screens/Wi.dart';
import 'package:seabird.biometry/screens/Wp.dart';
import 'package:seabird.biometry/screens/Ws.dart';
import 'package:seabird.biometry/screens/Wt.dart';
import 'package:seabird.biometry/screens/Wx.dart';

import 'AppProvider.dart';
import 'screens/SplashScreen.dart';

void main() {
  runApp(
    MultiProvider(
      providers: [
        ChangeNotifierProvider<AppProvider>(create: (context) => AppProvider()),
      ],
      child: MaterialApp(
        debugShowCheckedModeBanner: false,
        home: SplashScreen(),
        onGenerateRoute: (RouteSettings settings) {
          switch (settings.name) {
            case '/home':
              return SlideRightRoute(widget: Home());
              break;
            case '/intro':
              return SlideRightRoute(widget: Intro());
              break;
            case '/history':
              return SlideRightRoute(widget: Hist());
              break;
            case '/mainTypes':
              return SlideRightRoute(widget: MainTypes());
              break;
            case '/w':
              return SlideRightRoute(widget: W());
              break;
            case '/ws':
              return SlideRightRoute(widget: Ws());
              break;
            case '/wc':
              return SlideRightRoute(widget: Wc());
              break;
            case '/wd':
              return SlideRightRoute(widget: Wd());
              break;
            case '/we':
              return SlideRightRoute(widget: We());
              break;
            case '/wi':
              return SlideRightRoute(widget: Wi());
              break;
            case '/wp':
              return SlideRightRoute(widget: Wp());
              break;
            case '/wt':
              return SlideRightRoute(widget: Wt());
              break;
            case '/wx':
              return SlideRightRoute(widget: Wx());
              break;
            case '/a':
              return SlideRightRoute(widget: A());
              break;
            case '/ae':
              return SlideRightRoute(widget: Ae());
              break;
            case '/ar':
              return SlideRightRoute(widget: Ar());
              break;
            case '/as':
              return SlideRightRoute(widget: As());
              break;
            case '/at':
              return SlideRightRoute(widget: At());
              break;
            case '/au':
              return SlideRightRoute(widget: Au());
              break;
            case '/l':
              return SlideRightRoute(widget: L());
              break;
            case '/lf':
              return SlideRightRoute(widget: Lf());
              break;
            case '/lr':
              return SlideRightRoute(widget: Lr());
              break;
            case '/lu':
              return SlideRightRoute(widget: Lu());
              break;
            default:
              return SlideRightRoute(widget: Home());
              break;
          }
        },
      ),
    ),
  );
}

class SlideRightRoute extends PageRouteBuilder {
  final Widget widget;
  SlideRightRoute({this.widget})
      : super(
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
              ScaleTransition(
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
