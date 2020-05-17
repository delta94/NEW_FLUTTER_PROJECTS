import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/screens/GirlOptionsScreen.dart';
import 'package:seab1ird.showyourself/screens/InitScreen.dart';
import 'package:seab1ird.showyourself/screens/PresentScreen.dart';

import 'helpers/GameProvider.dart';
import 'helpers/Helper.dart';
import 'routers.dart';
import 'screens/makeup_screen/MakeupScreen.dart';

void main() {
  runApp(
    MultiProvider(
      providers: [
        ChangeNotifierProvider<GameProvider>(
            create: (context) => GameProvider()),
      ],
      child: MaterialApp(
        debugShowCheckedModeBanner: false,
        initialRoute: '/',
        routes: <String, WidgetBuilder>{
          '/': (context) {
            init(context);
            return InitScreen();
          },
          Routers.PRESENT: (context) => PresentScreen(),
          Routers.GIRL_OPTIONS: (context) => GirlOptionsScreen(),
          Routers.MAKEUP: (context) => MakeupScreen(),
        },
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
