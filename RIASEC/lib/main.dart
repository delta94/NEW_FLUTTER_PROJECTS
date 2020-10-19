import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.disctest/screens/ResultScreen.dart';
import 'QuestionProvider.dart';
import 'widgets/ScaleRoute.dart';
import 'widgets/SlideRoute.dart';
import 'screens/RiasecTypesScreen.dart';
import 'screens/HomeScreen.dart';
import 'screens/IntroScreen.dart';
import 'screens/SplashScreen.dart';
import 'screens/TestScreen.dart';

void main() {
  runApp(
    MultiProvider(
      providers: [
        ChangeNotifierProvider<QuestionProvider>(
            create: (context) => QuestionProvider()),
      ],
      child: MaterialApp(
        title: 'RIASEC TEST',
        debugShowCheckedModeBanner: false,
        home: new SplashScreen(),
        onGenerateRoute: (RouteSettings settings) {
          switch (settings.name) {
            case '/home':
              return ScaleRoute(widget: HomeScreen(), settings: settings);
              break;
            case '/intro':
              return ScaleRoute(widget: IntroScreen(), settings: settings);
              break;
            case '/discTypes':
              return ScaleRoute(widget: RiasecTypesScreen(), settings: settings);
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
