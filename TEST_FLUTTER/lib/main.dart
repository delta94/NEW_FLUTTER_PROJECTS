import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.disctest/screens/ResultScreen.dart';
import 'QuestionProvider.dart';
import 'helpers/ScaleRoute.dart';
import 'helpers/SlideRoute.dart';
import 'screens/DiscTypesScreen.dart';
import 'screens/HomeScreen.dart';
import 'screens/IntroScreen.dart';
import 'screens/TestScreen/TestScreen.dart';

void main() {
  runApp(
    MultiProvider(
      providers: [
        ChangeNotifierProvider<QuestionProvider>(
            create: (context) => QuestionProvider()),
      ],
      child: MaterialApp(
        title: 'DISC TEST',
        home: Material(
          child: Column(
            children: [
              Expanded(
                child: SingleChildScrollView(
                  child: Column(
                    children: [
                      Container(
                        child: ListView.builder(
                            shrinkWrap: true,
                            itemCount: 4,
                            itemBuilder: (BuildContext context, int index) {
                              return Text(
                                'hi hi',
                                style: TextStyle(color: Colors.blue),
                              );
                            }),
                      ),
                      Container(
                        child: ListView.builder(
                            shrinkWrap: true,
                            itemCount: 4,
                            itemBuilder: (BuildContext context, int index) {
                              return Text(
                                'hwww',
                                style: TextStyle(color: Colors.blue),
                              );
                            }),
                      )
                    ],
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    ),
  );
}
