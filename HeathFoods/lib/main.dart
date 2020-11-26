import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'AppProvider.dart';
import 'screens/DietScreen.dart';
import 'screens/about_screen/AboutScreen.dart';
import 'screens/HomeScreen.dart';
import 'screens/about_screen/AnswerScreen.dart';
import 'widgets/ScaleRoute.dart';
import 'screens/food_screen/FoodsScreen.dart';
import 'screens/SplashScreen.dart';

void main() {
  runApp(
    MultiProvider(
      providers: [
        ChangeNotifierProvider<AppProvider>(create: (context) => AppProvider()),
      ],
      child: MaterialApp(
        title: 'GOUT FOOD LIST',
        debugShowCheckedModeBanner: false,
        home: SplashScreen(),
        onGenerateRoute: (RouteSettings settings) {
          switch (settings.name) {
            case '/home':
              return ScaleRoute(widget: HomeScreen(), settings: settings);
              break;
            case '/about':
              return ScaleRoute(widget: AboutScreen(), settings: settings);
              break;
            case '/aboutAnswer':
              return ScaleRoute(widget: AnswerScreen(), settings: settings);
              break;
            case '/diet':
              return ScaleRoute(widget: DietScreen(), settings: settings);
              break;
            case '/foodsScreen':
              return ScaleRoute(widget: FoodsScreen(), settings: settings);
              break;
            default:
              return ScaleRoute(widget: FoodsScreen());
              break;
          }
        },
      ),
    ),
  );
}
