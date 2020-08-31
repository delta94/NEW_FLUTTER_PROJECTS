import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.vncomedies/helpers/CommonFunctions.dart';
import 'package:seab1ird.vncomedies/models/TypeVideo.model.dart';

class TypeListItem extends StatelessWidget {
  const TypeListItem(
      {Key key, @required this.objectList, @required this.index});

  final List objectList;
  final int index;

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
        onTap: () {
          Navigator.pushNamed(context, '/listMovies',
              arguments: MovieTypeModel(
                  objectList[index]['name'],
                  objectList[index]['imageUrl'],
                  objectList[index]['movieList']));
        },
        child: Container(
            margin: EdgeInsets.only(left: 5, right: 5),
            padding: EdgeInsets.only(top: 10),
            alignment: Alignment.center,
            decoration: CommonFunctions.boxDecoration(),
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                Container(
                  padding: EdgeInsets.only(left: 10, right: 10),
                  child: ClipRRect(
                      borderRadius: BorderRadius.circular(10),
                      child: Image.network(objectList[index]['image'])),
                ),
                Padding(
                  padding: const EdgeInsets.all(8.0),
                  child: Wrap(
                    children: <Widget>[
                      Text(objectList[index]['name'],
                          style: TextStyle(
                              fontSize: 12,
                              fontWeight: FontWeight.bold,
                              color: Colors.yellow)),
                    ],
                  ),
                )
              ],
            )));
  }
}
