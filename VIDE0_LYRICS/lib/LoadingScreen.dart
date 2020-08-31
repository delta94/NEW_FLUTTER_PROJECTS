import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:shimmer/shimmer.dart';

import 'EndLoopController.dart';

class LoadingScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final EndLoopController _loopController3 =
        EndLoopController('Untitled', 1.0);

    return Column(
      children: <Widget>[
        Expanded(
          child: Stack(
            children: [
              Opacity(
                opacity: 1,
                child: Container(
                  decoration: new BoxDecoration(
                    image: new DecorationImage(
                      image: new AssetImage('images/loading.png'),
                      fit: BoxFit.fill,
                    ),
                  ),
                ),
              ),
              Center(
                child: Container(
                  decoration: BoxDecoration(
                      color: Colors.white,
                      borderRadius: BorderRadius.circular(10),
                      boxShadow: [
                        BoxShadow(
                            blurRadius: 1,
                            spreadRadius: 1,
                            offset: Offset(1, 1))
                      ]),
                  child: Shimmer.fromColors(
                    baseColor: Colors.deepOrangeAccent,
                    highlightColor: Colors.amber,
                    child: Wrap(
                      children: <Widget>[
                        Icon(Icons.ac_unit),
                        Text(
                          'Loading...',
                          textAlign: TextAlign.center,
                          style: TextStyle(
                            fontSize: 30,
                            fontWeight: FontWeight.w400,
                            decoration: TextDecoration.underline,
                            decorationColor: Colors.green,
                            decorationStyle: TextDecorationStyle.solid,
                            shadows: [
                              Shadow(
                                color: Colors.black,
                                blurRadius: 3.0,
                                offset: Offset(2.0, 2.0),
                              ),
                            ],
                          ),
                        ),
                        Container(
                          width: 30,
                          height: 30,
                          child: FlareActor(
                            "images/lyric_icon.flr",
                            alignment: Alignment.center,
                            controller: _loopController3,
                          ),
                        ),
                      ],
                    ),
                  ),
                ),
              ),
            ],
          ),
        ),
      ],
    );
  }
}
