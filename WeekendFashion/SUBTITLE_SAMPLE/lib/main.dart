import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/screens/GirlOptionsScreen.dart';
import 'package:seab1ird.showyourself/screens/InitScreen.dart';
import 'package:seab1ird.showyourself/screens/PresentScreen.dart';
import 'package:seab1ird.showyourself/screens/SplashScreen.dart';

import 'helpers/GameProvider.dart';
import 'helpers/Helper.dart';
import 'routers.dart';
import 'screens/makeup_screen/Girl0MakeupScreen.dart';
import 'screens/makeup_screen/Girl1MakeupScreen.dart';

void main() {
  runApp(
    MultiProvider(
      providers: [
        ChangeNotifierProvider<GameProvider>(
            create: (context) => GameProvider()),
      ],
      child: MaterialApp(
        debugShowCheckedModeBanner: false,
        routes: <String, WidgetBuilder>{
          Routers.INIT: (context) {
            init(context);
            return InitScreen();
          },
          Routers.PRESENT: (context) => PresentScreen(),
          Routers.GIRL_OPTIONS: (context) => GirlOptionsScreen(),
          Routers.GIRL0_MAKEUP: (context) => Girl0MakeupScreen(),
          Routers.GIRL1_MAKEUP: (context) => Girl1MakeupScreen(),
        },
        home: new SplashScreen(),
      ),
    ),
  );
}

void init(BuildContext context) {
  SystemChrome.setPreferredOrientations([
    DeviceOrientation.landscapeRight,
    DeviceOrientation.landscapeLeft,
  ]);

  Helper.getDeviceSize(context);
}
