import 'dart:async';

import 'package:com.seab1ird.showyourself/model/ColorModel.dart';
import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:com.seab1ird.showyourself/widgets/CellWidget.dart';
import 'package:com.seab1ird.showyourself/widgets/FabCircularMenu.dart';
import 'package:com.seab1ird.showyourself/widgets/Modal.dart';
import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';
import 'package:shimmer/shimmer.dart';
import '../model_view/GameProvider.dart';
import 'Avatars.dart';

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
        return Future<bool>.value(false);
      },
      child: Scaffold(
        body: Stack(
          children: [
            Opacity(
              opacity: 1,
              child: Container(
                decoration: new BoxDecoration(
                  image: new DecorationImage(
                    image: Utils.getBackground(gameProvider.themeColorName),
                    fit: BoxFit.fill,
                  ),
                ),
              ),
            ),
            SafeArea(
              child: Column(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  Expanded(
                    flex: 1,
                    child: Container(
                      padding:
                          EdgeInsets.symmetric(vertical: 5, horizontal: 10),
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.spaceBetween,
                        children: [
                          Wrap(
                            children: [
                              InkWell(
                                onTap: () {
                                  Utils.tapButtonSound();
                                  Navigator.popAndPushNamed(context, '/home');
                                },
                                child: Utils.getImage('home_icon',
                                    width: Utils.isIpad()
                                        ? Utils.ipadIconSize()
                                        : 30),
                              ),
                              SizedBox(width: 10),
                              InkWell(
                                onTap: () {
                                  Utils.tapButtonSound();
                                  showGameDialog(
                                    context: context,
                                    widget: Avatars(
                                      onChangeAvatar: (avatar) async {
                                        gameProvider.setAvatar(avatar);
                                      },
                                    ),
                                  );
                                },
                                child: Container(
                                    decoration: BoxDecoration(
                                        color: Colors.amberAccent,
                                        borderRadius:
                                            BorderRadius.circular(50)),
                                    padding: EdgeInsets.all(2),
                                    child: Utils.getImage(
                                        gameProvider.chosenAvatar,
                                        width: Utils.isIpad()
                                            ? Utils.ipadIconSize()
                                            : 35)),
                              ),
                            ],
                          ),
                          Shimmer.fromColors(
                            baseColor: Colors.orange,
                            highlightColor: Colors.yellow,
                            child: Text(
                              'Round $rowNum',
                              style: GoogleFonts.tomorrow(
                                fontWeight: FontWeight.bold,
                                fontSize:
                                    Utils.isIpad() ? Utils.ipadFontSize() : 22,
                                color: Colors.white,
                              ),
                            ),
                          ),
                          Container(),
                          Container(),
                        ],
                      ),
                    ),
                  ),
                  Expanded(
                    flex: 6,
                    child: Container(
                      padding: EdgeInsets.symmetric(
                          horizontal: Utils.isIpad()
                              ? (Utils.deviceSize.width / 6)
                              : 0),
                      child: Column(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: <Widget>[
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
                                    showClick:
                                        gameProvider.playableRoundNum == 0 &&
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
                  ),
                  Expanded(
                    flex: 2,
                    child: Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        BottomMenu(),
                      ],
                    ),
                  )
                ],
              ),
            ),
          ],
        ),
        floatingActionButton: FabCircularMenu(
          alignment: Alignment.topRight,
          ringColor: Colors.white,
          animationDuration: Duration(milliseconds: 500),
          fabColor: Colors.amber,
          ringDiameter: Utils.deviceSize.width,
          ringWidth: Utils.deviceSize.width / 5,
          fabMargin: EdgeInsets.only(top: 40, right: 10),
          fabSize: Utils.deviceSize.width / 10,
          fabOpenIcon: Utils.getImage('theme',
              width: Utils.isIpad() ? Utils.ipadIconSize() : 30),
          children: <Widget>[
            ThemeItem(gameProvider: gameProvider, index: 0),
            ThemeItem(gameProvider: gameProvider, index: 1),
            ThemeItem(gameProvider: gameProvider, index: 2),
            ThemeItem(gameProvider: gameProvider, index: 3),
            ThemeItem(gameProvider: gameProvider, index: 4),
            ThemeItem(gameProvider: gameProvider, index: 5),
          ],
        ),
      ),
    );
  }
}

class ThemeItem extends StatelessWidget {
  const ThemeItem({
    Key key,
    @required this.gameProvider,
    @required this.index,
  }) : super(key: key);

  final GameProvider gameProvider;
  final int index;

  getColor(ColorModel colorModel, {double opacity = 1}) {
    return Color.fromRGBO(colorModel.r, colorModel.g, colorModel.b, opacity);
  }

  @override
  Widget build(BuildContext context) {
    List<ColorModel> colors = Utils.getGameColors();
    return GestureDetector(
      onTap: () {
        Utils.winGameSound();
        gameProvider.setThemeColorName(colors[index].colorName);
      },
      child: Container(
        width: Utils.deviceSize.width / 8,
        height: Utils.deviceSize.width / 8,
        decoration: BoxDecoration(
          shape: BoxShape.circle,
          color: getColor(colors[index]),
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
    bool finishedGame = gameProvider.hasTurnOnLight &&
        gameProvider.hasTurnOnLight1 &&
        gameProvider.hasTurnOnLight2;
    if (finishedGame) {
      gameProvider.updateRoundNum();
      Future.delayed(Duration(seconds: 3),
          () => Navigator.popAndPushNamed(context, '/ranking'));
    }
    return Container(
      child: PlayingTime(),
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
          Utils.getImage('timer',
              width: Utils.isIpad() ? Utils.ipadIconSize() : 35),
          SizedBox(width: 5),
          Padding(
            padding: const EdgeInsets.only(top: 5),
            child: Text(
              time.toString() + 's',
              style: TextStyle(
                color: Colors.yellow,
                backgroundColor: Colors.black45,
                fontSize: Utils.isIpad() ? Utils.ipadFontSize() : 20,
                fontWeight: FontWeight.bold,
              ),
            ),
          ),
        ],
      ),
    );
  }

  @override
  dispose() {
    timer.cancel();
    super.dispose();
  }
}
