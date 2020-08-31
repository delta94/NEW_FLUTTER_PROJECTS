import 'dart:ui';

import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.hkmovies/helpers/CommonFunctions.dart';
import 'package:seab1ird.hkmovies/models/MovieInfo.model.dart';
import 'package:seab1ird.hkmovies/models/TypeVideo.model.dart';

class MovieListItem extends StatelessWidget {
  const MovieListItem({@required this.movieTypeModel, @required this.index});

  final MovieTypeModel movieTypeModel;
  final int index;

  @override
  Widget build(BuildContext context) {
    // print('------------------->' + args.movieList[index]['videoId']);
    Widget movieItem = Container();
    try {
      movieItem = GestureDetector(
        onTap: () {
          Navigator.pushNamed(context, '/movie',
              arguments: MovieInfoModel(
                  movieTypeModel.movieList[index]['title'],
                  movieTypeModel.movieList[index]['content'],
                  movieTypeModel.movieList[index]['videoId']));
        },
        child: Column(children: <Widget>[
          Container(
              alignment: Alignment.center,
              decoration: CommonFunctions.boxDecoration(),
              child: Row(
                children: <Widget>[
                  ClipRRect(
                    borderRadius: BorderRadius.only(
                        bottomLeft: Radius.circular(10),
                        topLeft: Radius.circular(10)),
                    child: Container(
                      child: Image.network(
                          CommonFunctions.getImageUrl(
                              movieTypeModel.movieList[index]['videoId']),
                          height: 70,
                          width: 120),
                      decoration: BoxDecoration(
                        border: Border.all(
                          width: 0.7,
                          color: Colors.lightGreenAccent,
                        ),
                      ),
                    ),
                  ),
                  Expanded(
                      child: Container(
                    margin: EdgeInsets.only(left: 5),
                    child: Text(
                      movieTypeModel.movieList[index]['title'],
                      style: TextStyle(
                        fontWeight: FontWeight.bold,
                        color: Colors.yellow,
                      ),
                    ),
                  ))
                ],
              )),
          Divider(height: 10), //
        ]),
      );
    } catch (e) {
      movieItem = Container();
    }

    return movieItem;
  }
}
