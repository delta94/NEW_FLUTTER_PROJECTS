import 'package:seab1ird.hkmovies/screens/Home.dart';
import 'package:flutter/material.dart';
import 'helpers/SlideCenterRoute.dart';
import 'screens/Movie.dart';
import 'screens/MovieList.dart';
import 'screens/MovieTypes.dart';

void main() {
  runApp(
    MaterialApp(
      debugShowCheckedModeBanner: false,
      onGenerateRoute: (RouteSettings settings) {
        switch (settings.name) {
          case '/':
            return SlideCenterRoute(widget:Home(), settings: settings);
            break;
          case '/typeMovies':
            return SlideCenterRoute(widget: MovieTypes(), settings: settings);
            break;
          case '/listMovies':
            return SlideCenterRoute(widget: MovieList(), settings: settings);
            break;
          case '/movie':
            return SlideCenterRoute(widget: Movie(), settings: settings);
            break;
          default: return SlideCenterRoute(widget:Home(), settings: settings);
            break;
        }
      },
    ),
  );
}









