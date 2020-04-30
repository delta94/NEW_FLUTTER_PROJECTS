import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.showyourself/Screen2.dart';

import 'Screen1.dart';
import 'helpers/GameProvider.dart';

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
          '/': (context) => Screen1(),
          '/screen2': (context) => Screen2(),
        },
      ),
    ),
  );
}
