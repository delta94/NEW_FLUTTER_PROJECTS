import 'dart:ui';

import 'package:dio/dio.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.hkmovies/helpers/CommonFunctions.dart';
import 'package:seab1ird.hkmovies/models/MovieInfo.model.dart';
import 'package:seab1ird.hkmovies/models/TypeVideo.model.dart';

class MovieListItem extends StatefulWidget {
  const MovieListItem(
      {@required this.movieTypeModel, @required this.index, @required this.token});

  final MovieTypeModel movieTypeModel;
  final int index;
  final String token;

  @override
  _MovieListItemState createState() => _MovieListItemState();
}

class _MovieListItemState extends State<MovieListItem> {
  final dio = new Dio();
  String videoUrl;
  String thumbnailUrl;
  @override
  initState() async {
    final videoInfo = await dio.get(
        'https://graph.facebook.com/v3.2/${widget.movieTypeModel.movieList[widget.index]['videoId']}?fields=format,source&access_token=${widget.token}');
    setState(() {
      thumbnailUrl = videoInfo.data['format'][1]['picture'];
      videoUrl = videoInfo.data['source'];
    });
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    // print('------------------->' + args.movieList[index]['videoId']);
    return GestureDetector(
        onTap: () {
          Navigator.pushNamed(context, '/movie',
              arguments: MovieInfoModel(
                  widget.movieTypeModel.movieList[widget.index]['title'],
                  widget.movieTypeModel.movieList[widget.index]['content'],
                  videoUrl));
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
                        child: Image.network(thumbnailUrl,
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
                    child: Text(widget.movieTypeModel.movieList[widget.index]['title'],
                        style: TextStyle(
                            fontWeight: FontWeight.bold, color: Colors.yellow)),
                  ))
                ],
              )),
          Divider(height: 10), //
        ]));
  }
}
