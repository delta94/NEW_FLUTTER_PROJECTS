import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import 'SongProvider.dart';
import 'screens/SplashScreen.dart';
import 'screens/game_screen/GameScreen.dart';
import 'screens/game_screen/widgets/ScaleRoute.dart';

void main() {
  runApp(
    MultiProvider(
      providers: [
        ChangeNotifierProvider<SongProvider>(
            create: (context) => SongProvider()),
      ],
      child: MaterialApp(
        title: 'GOUT FOOD LIST',
        debugShowCheckedModeBanner: false,
        home: SplashScreen(),
        onGenerateRoute: (RouteSettings settings) {
          switch (settings.name) {
            case '/game':
              return ScaleRoute(widget: GameScreen(), settings: settings);
              break;
            default:
              return ScaleRoute(widget: GameScreen());
              break;
          }
        },
      ),
    ),
  );
}
