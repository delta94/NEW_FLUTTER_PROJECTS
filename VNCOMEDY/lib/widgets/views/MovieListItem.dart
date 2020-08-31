import 'dart:ui';

import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.vncomedies/helpers/CommonFunctions.dart';
import 'package:seab1ird.vncomedies/models/MovieInfo.model.dart';

class MovieListItem extends StatelessWidget {
  const MovieListItem({@required this.videoList, @required this.index});

  final List<MovieInfoModel> videoList;
  final int index;

  @override
  Widget build(BuildContext context) {
    // print('------------------->' + args.movieList[index].videoId']);
    return GestureDetector(
        onTap: () {
          Navigator.pushNamed(context, '/movie',
              arguments: MovieInfoModel(videoList[index].title,
                  videoList[index].content, videoList[index].videoId));
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
                                videoList[index].videoId),
                            height: 70,
                            width: 120),
                        decoration: BoxDecoration(
                          border: Border.all(
                            width: 0.7,
                            color: Colors.lightGreenAccent,
                          ),
                        ),
                      )),
                  Expanded(
                      child: Container(
                    margin: EdgeInsets.only(left: 5),
                    child: Text(videoList[index].title,
                        style: TextStyle(
                            fontWeight: FontWeight.bold, color: Colors.yellow)),
                  ))
                ],
              )),
          Divider(height: 10), //
        ]));
  }
}
