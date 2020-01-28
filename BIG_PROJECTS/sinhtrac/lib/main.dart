import 'package:flutter/material.dart';
import 'package:sbsinhtrac/screens/Home.dart';
import 'package:sbsinhtrac/screens/Intro.dart';


void main() {
  runApp(
    MaterialApp(
      debugShowCheckedModeBanner: false,
      onGenerateRoute: (RouteSettings settings) {
        switch (settings.name) {
          case '/':
            return SlideRightRoute(widget:Home());
            break;
          case '/intro':
            return SlideRightRoute(widget: Intro());
            break;
          // case '/history':
          //   return SlideRightRoute(widget: History());
          //   break;
          // case '/dermatoglyphics':
          //   return SlideRightRoute(widget: Dermatoglyphics());
          //   break;
          // case '/whorls':
          //   return SlideRightRoute(widget: Whorls());
          //   break;
          // case '/loops':
          //   return SlideRightRoute(widget: Loops());
          //   break;
          // case '/archs':
          //   return SlideRightRoute(widget: Archs());
          //   break;
          // case '/whorl_t':
          //   return SlideRightRoute(widget: Whorl_T());
          //   break;
          // case '/whorl_s':
          //   return SlideRightRoute(widget: Whorl_S());
          //   break;
          // case '/whorl_e':
          //   return SlideRightRoute(widget: Whorl_E());
          //   break;
          // case '/whorl_c':
          //   return SlideRightRoute(widget: Whorl_C());
          //   break;
          // case '/whorl_d':
          //   return SlideRightRoute(widget: Whorl_D());
          //   break;
          // case '/whorl_i':
          //   return SlideRightRoute(widget: Whorl_I());
          //   break;
          // case '/whorl_p':
          //   return SlideRightRoute(widget: Whorl_P());
          //   break;
          // case '/whorl_x':
          //   return SlideRightRoute(widget: Whorl_X());
          //   break;
          // case '/loop_u':
          //   return SlideRightRoute(widget: Loop_U());
          //   break;
          // case '/loop_r':
          //   return SlideRightRoute(widget: Loop_R());
          //   break;
          // case '/loop_f':
          //   return SlideRightRoute(widget: Loop_F());
          //   break;
          // case '/arch_s':
          //   return SlideRightRoute(widget: Arch_S());
          //   break;
          // case '/arch_t':
          //   return SlideRightRoute(widget: Arch_T());
          //   break;
          // case '/arch_u':
          //   return SlideRightRoute(widget: Arch_U());
          //   break;
          // case '/arch_r':
          //   return SlideRightRoute(widget: Arch_R());
          //   break;
          // case '/arch_e':
          //   return SlideRightRoute(widget: Arch_E());
          //   break;
          default: return SlideRightRoute(widget:Home());
            break;
        }
      },
    ),
  );
}

class SlideRightRoute extends PageRouteBuilder {
  final Widget widget;
  SlideRightRoute({this.widget}) :  super(
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








