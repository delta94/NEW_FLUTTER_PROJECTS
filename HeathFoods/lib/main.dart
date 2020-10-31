import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'QuestionProvider.dart';
import 'widgets/ScaleRoute.dart';
import 'widgets/SlideRoute.dart';
import 'screens/FoodsScreen.dart';
import 'screens/SplashScreen.dart';

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
