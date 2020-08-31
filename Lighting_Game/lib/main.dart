import 'package:com.seab1ird.showyourself/screens/Game.dart';
import 'package:com.seab1ird.showyourself/screens/Home.dart';
import 'package:com.seab1ird.showyourself/screens/Ranking.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'model_view/GameProvider.dart';

import 'screens/Rounds.dart';
import 'widgets/ScaleRoute.dart';

main() => runApp(
      MultiProvider(
        providers: [
          ChangeNotifierProvider<GameProvider>(
              create: (context) => GameProvider()),
        ],
        child: MaterialApp(
          title: 'LIGHTING GAME',
          home: Home(),
          debugShowCheckedModeBanner: false,
          onGenerateRoute: (RouteSettings settings) {
            switch (settings.name) {
              case '/home':
                return ScaleRoute(widget: Home(), settings: settings);
                break;
              case '/game':
                return ScaleRoute(widget: Game(), settings: settings);
                break;
              case '/rounds':
                return ScaleRoute(widget: Rounds(), settings: settings);
                break;
              case '/ranking':
                return ScaleRoute(widget: Ranking(), settings: settings);
                break;
              default:
                return ScaleRoute(widget: Game());
                break;
            }
          },
        ),
      ),
    );
