import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.disctest/helpers/ReponsiveHelper.dart';
import 'package:seab1ird.disctest/helpers/Helpers.dart';
import 'package:seab1ird.disctest/helpers/FlareEndlessController.dart';
import 'package:seab1ird.disctest/widgets/FabCircularMenu.dart';
import 'package:shimmer/shimmer.dart';

import 'FoodScreenBody.dart';

class FoodsScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final _logoHeadLoopController = FlareEndlessController('Untitled', 4);

    return WillPopScope(
      onWillPop: () {
        Helpers.onWillPop(context);
        return Future<bool>.value(false);
      },
      child: Scaffold(
        appBar: AppBar(
          leading: IconButton(
            icon: Image.asset(
              'images/exit.png',
              height: getXXlargeTextSize(),
            ),
            onPressed: () => Helpers.onWillPop(context),
          ),
          title: Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                Container(
                    width: getLargeLogoSize(),
                    height: getLargeLogoSize(),
                    child: ClipRRect(
                      borderRadius: BorderRadius.circular(5),
                      child: FlareActor(
                        'images/logo_head.flr',
                        alignment: Alignment.center,
                        controller: _logoHeadLoopController,
                      ),
                    )),
                SizedBox(width: 10),
                FittedBox(
                  fit: BoxFit.fitWidth,
                  child: Shimmer.fromColors(
                    baseColor: Colors.orange,
                    highlightColor: Colors.yellowAccent,
                    child: Text(
                      'FOOD LIST',
                      style: TextStyle(
                        fontWeight: FontWeight.bold,
                        color: Colors.yellowAccent,
                        decoration: TextDecoration.underline,
                        decorationColor: Colors.greenAccent,
                        decorationStyle: TextDecorationStyle.solid,
                        fontSize: getMediumTextSize(),
                        shadows: [
                          Shadow(
                            color: Colors.black,
                            blurRadius: 10.0,
                            offset: Offset(5.0, 5.0),
                          ),
                        ],
                      ),
                    ),
                  ),
                ),
              ]),
          iconTheme: IconThemeData(color: Colors.yellowAccent),
          backgroundColor: Colors.black87,
          actions: <Widget>[Container(width: 30)],
        ),
        body: FoodScreenBody(),
        floatingActionButton: FabCircularMenuCommon(),
      ),
    );
  }
}
