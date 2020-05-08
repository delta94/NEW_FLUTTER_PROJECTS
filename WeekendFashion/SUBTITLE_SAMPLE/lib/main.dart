import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:provider/provider.dart';

import 'Screen1.dart';
import 'Screen2.dart';
import 'Screen3.dart';
import 'Screen4.dart';
import 'helpers/GameProvider.dart';
import 'helpers/Helper.dart';

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
            return Screen1();
          },
          '/screen2': (context) => Screen2(),
          '/screen3': (context) => Screen3(),
          '/screen4': (context) => Screen4(),
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
