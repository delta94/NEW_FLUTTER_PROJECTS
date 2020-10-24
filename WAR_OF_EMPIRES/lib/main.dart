import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'view_models/GameProvider.dart';
import 'widgets/ScaleRoute.dart';
import 'screens/HomeScreen.dart';
import 'screens/SplashScreen.dart';

void main() {
  runApp(
    MultiProvider(
      providers: [
        ChangeNotifierProvider<GameProvider>(
            create: (context) => GameProvider()),
      ],
      child: MaterialApp(
        title: 'EMPIRES',
        debugShowCheckedModeBanner: false,
        home: SplashScreen(),
        onGenerateRoute: (RouteSettings settings) {
          switch (settings.name) {
            case '/home':
              return ScaleRoute(widget: HomeScreen(), settings: settings);
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
