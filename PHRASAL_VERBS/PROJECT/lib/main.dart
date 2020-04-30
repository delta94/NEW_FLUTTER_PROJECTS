import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/screens/ResultScreen.dart';
import 'QuestionProvider.dart';
import 'helpers/ScaleRoute.dart';
import 'helpers/SlideRoute.dart';
import 'screens/DiscTypesScreen.dart';
import 'screens/HomeScreen.dart';
import 'screens/IntroScreen.dart';
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
              return ScaleRoute(widget: HomeScreen(), settings: settings);
              break;
            case '/intro':
              return ScaleRoute(widget: IntroScreen(), settings: settings);
              break;
            case '/discTypes':
              return ScaleRoute(widget: DiscTypesScreen(), settings: settings);
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
              return ScaleRoute(widget: HomeScreen());
              break;
          }
        },
      ),
    ),
  );
}
