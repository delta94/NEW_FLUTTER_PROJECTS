import 'dart:async';

import 'package:app_review/app_review.dart';
import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:com.seab1ird.showyourself/widgets/CellWidget.dart';
import 'package:com.seab1ird.showyourself/widgets/ImageButton.dart';
import 'package:com.seab1ird.showyourself/widgets/Modal.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:shared_preferences/shared_preferences.dart';
import '../model_view/GameProvider.dart';
import 'Themes.dart';

class Game extends StatefulWidget {
  @override
  _GameState createState() => _GameState();
}

class _GameState extends State<Game> {
  var scoreBoardValues;
  var gameProvider;
  AnimationController animationController;
  Animation<double> animation;

  @override
  Widget build(BuildContext context) {
    gameProvider = Provider.of<GameProvider>(context);
    String rowNum = (gameProvider.currRoundNum + 1).toString();

    return WillPopScope(
      onWillPop: () {
        // Navigator.of(context).popAndPushNamed('/rounds');
        // timer.cancel();
        return Future<bool>.value(false);
      },
      child: Scaffold(
        body: Stack(
          children: [
            // Opacity(opacity: 0.6, child: Container(color: gameProvider.theme)),
            Opacity(
              opacity: 1,
              child: Container(
                decoration: new BoxDecoration(
                  image: new DecorationImage(
                    image: new AssetImage('asset/images/bg_pink.png'),
                    fit: BoxFit.fill,
                  ),
                ),
              ),
            ),
            SafeArea(
              child: SingleChildScrollView(
                child: Column(
                  children: [
                    Container(
                      padding:
                          EdgeInsets.symmetric(vertical: 5, horizontal: 10),
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.spaceBetween,
                        children: [
                          InkWell(
                            onTap: () =>
                                Navigator.popAndPushNamed(context, '/home'),
                            child: Utils.getImage('home_icon', width: 40),
                          ),
                          Text(
                            'Round $rowNum',
                            style: TextStyle(
                              fontWeight: FontWeight.bold,
                              fontSize: 20,
                              color: Colors.white,
                            ),
                          ),
                          Wrap(
                            children: [
                              InkWell(
                                onTap: () => showGameDialog(
                                  context: context,
                                  widget: Themes(
                                    onChangeTheme: (colorModel) async {
                                      var _prefs =
                                          await SharedPreferences.getInstance();
                                      _prefs.setString('theme',
                                          '${colorModel.r},${colorModel.g},${colorModel.b}');
                                      setState(() {
                                        gameProvider.theme = Color.fromRGBO(
                                          colorModel.r,
                                          colorModel.g,
                                          colorModel.b,
                                          1,
                                        );
                                      });
                                    },
                                  ),
                                ),
                                child: Utils.getImage('theme', width: 40),
                              ),
                              SizedBox(width: 10),
                              InkWell(
                                onTap: () =>
                                    AppReview.storeListing.then((onValue) {}),
                                child: Utils.getImage('star', width: 40),
                              ),
                            ],
                          ),
                        ],
                      ),
                    ),
                    SizedBox(height: 15),
                    Container(
                      child: Column(children: <Widget>[
                        Row(
                          children: <Widget>[
                            CellWidget(positionId: 00),
                            CellWidget(positionId: 01),
                            CellWidget(positionId: 02),
                            CellWidget(positionId: 03),
                            CellWidget(positionId: 04),
                          ],
                        ),
                        Row(
                          children: <Widget>[
                            CellWidget(positionId: 10),
                            CellWidget(positionId: 11),
                            CellWidget(
                                positionId: 12,
                                showClick: gameProvider.playableRoundNum == 0 &&
                                    !gameProvider.hasTurnOnLight),
                            CellWidget(positionId: 13),
                            CellWidget(positionId: 14),
                          ],
                        ),
                        Row(
                          children: <Widget>[
                            CellWidget(positionId: 20),
                            CellWidget(positionId: 21),
                            CellWidget(positionId: 22),
                            CellWidget(positionId: 23),
                            CellWidget(positionId: 24),
                          ],
                        ),
                        Row(
                          children: <Widget>[
                            CellWidget(positionId: 30),
                            CellWidget(positionId: 31),
                            CellWidget(positionId: 32),
                            CellWidget(positionId: 33),
                            CellWidget(positionId: 34),
                          ],
                        ),
                        Row(
                          children: <Widget>[
                            CellWidget(positionId: 40),
                            CellWidget(positionId: 41),
                            CellWidget(positionId: 42),
                            CellWidget(positionId: 43),
                            CellWidget(positionId: 44),
                          ],
                        ),
                      ]),
                    ),
                    SizedBox(height: 15),
                    BottomMenu()
                  ],
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}

class BottomMenu extends StatelessWidget {
  const BottomMenu({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    return Container(
      height: 150,
      child: Column(
        children: [
          SizedBox(height: 5),
          PlayingTime(),
          SizedBox(height: 5),
          Visibility(
            visible: gameProvider.hasTurnOnLight &&
                gameProvider.hasTurnOnLight1 &&
                gameProvider.hasTurnOnLight2,
            child: ImageButton(
              text: 'Next Round',
              buttonColor: 'yellow',
              onPress: () => Navigator.pushNamed(context, '/ranking'),
            ),
          ),
        ],
      ),
    );
  }
}

class PlayingTime extends StatefulWidget {
  const PlayingTime({
    Key key,
  }) : super(key: key);

  @override
  _PlayingTimeState createState() => _PlayingTimeState();
}

class _PlayingTimeState extends State<PlayingTime> {
  Timer timer;
  int time = 0;

  @override
  void initState() {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);
    timer = new Timer.periodic(Duration(seconds: 1), (t) {
      setState(() {
        time += 1;
        gameProvider.time = time;
      });
    });
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);
    if (gameProvider.hasTurnOnLight &&
        gameProvider.hasTurnOnLight1 &&
        gameProvider.hasTurnOnLight2) {
      timer.cancel();
    }

    return Container(
      child: Row(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Utils.getImage('timer', width: 35),
          SizedBox(width: 5),
          Padding(
            padding: const EdgeInsets.only(top: 5),
            child: Text(
              time.toString() + 's',
              style: TextStyle(
                color: Colors.yellow,
                fontSize: 20,
                fontWeight: FontWeight.bold,
              ),
            ),
          ),
        ],
      ),
    );
  }
}
