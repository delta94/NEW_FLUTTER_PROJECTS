import 'package:firebase_admob_example/screens/Movie.dart';
import 'package:firebase_admob_example/screens/Home.dart';
import 'package:firebase_admob_example/screens/TypeMovies.dart';
import 'package:flutter/material.dart';
import 'helpers/SlideCenterRoute.dart';
import 'screens/ListMovies.dart';

void main() {
  runApp(
    MaterialApp(
      debugShowCheckedModeBanner: false,
      onGenerateRoute: (RouteSettings settings) {
        switch (settings.name) {
          case '/':
            return SlideCenterRoute(widget:Home());
            break;
          case '/typeMovies':
            return SlideCenterRoute(widget: TypeMovies());
            break;
          case '/listMovies':
            return SlideCenterRoute(widget: ListMovies());
            break;
          case '/movie':
            return SlideCenterRoute(widget: Movie());
            break;
          default: return SlideCenterRoute(widget:Home());
            break;
        }
      },
    ),
  );
}









