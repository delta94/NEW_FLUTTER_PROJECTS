import 'package:com.seab1ird.showyourself/screens/food_list/FoodScreen.dart';
import 'package:com.seab1ird.showyourself/screens/SplashScreen.dart';
import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:provider/provider.dart';
import 'model_view/GameProvider.dart';

import 'widgets/ScaleRoute.dart';

main() => runApp(
      GetMaterialApp(
        home: MultiProvider(
          providers: [
            ChangeNotifierProvider<GameProvider>(
                create: (context) => GameProvider()),
          ],
          child: MaterialApp(
            title: 'LIGHTING GAME',
            home: new SplashScreen(),
            debugShowCheckedModeBanner: false,
            onGenerateRoute: (RouteSettings settings) {
              switch (settings.name) {
                case '/home':
                  return ScaleRoute(widget: FoodScreen(), settings: settings);
                default:
                  return ScaleRoute(widget: FoodScreen(), settings: settings);
              }
            },
          ),
        ),
      ),
    );
