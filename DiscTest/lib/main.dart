import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/screens/ResultScreen.dart';
import 'QuestionProvider.dart';
import 'helpers/ScaleRoute.dart';
import 'helpers/SlideRoute.dart';
import 'screens/Home.dart';
import 'screens/Intro.dart';
import 'screens/TestScreen/TestScreen.dart';

void main() {
  runApp(
    MultiProvider(
      providers: [
        ChangeNotifierProvider<QuestionProvider>(create: (context) => QuestionProvider()),
      ],
      child: MaterialApp(
        title: 'DISC TEST',
        debugShowCheckedModeBanner: false,
        onGenerateRoute: (RouteSettings settings) {
          switch (settings.name) {
            case '/':
              return ScaleRoute(widget: Home(), settings: settings);
              break;
            case '/intro':
              return ScaleRoute(widget: Intro(), settings: settings);
              break;
            case '/startTest':
              return ScaleRoute(widget: TestScreen(), settings: settings);
              break;
            case '/test':
              return SlideRoute(widget: TestScreen(), settings: settings);
              break;
            case '/result':
              return SlideRoute(widget: ResultScreen(), settings: settings);
              break;
            default:
              return ScaleRoute(widget: Home());
              break;
          }
        },
      ),
    ),
  );
}
