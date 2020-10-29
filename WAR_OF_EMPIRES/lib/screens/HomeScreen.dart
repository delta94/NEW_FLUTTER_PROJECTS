import 'package:enum_to_string/enum_to_string.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.disctest/view_models/GameProvider.dart';
import 'package:seab1ird.disctest/helpers/Ads.dart';
import 'package:seab1ird.disctest/helpers/Helpers.dart';
import 'package:seab1ird.disctest/models/Cell.dart';
import 'package:seab1ird.disctest/models/Character.dart';

class HomeScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    Helpers.deviceSize = MediaQuery.of(context).size;

    return WillPopScope(
      onWillPop: () {
        Helpers.onWillPop(context);
        return Future<bool>.value(false);
      },
      child: Scaffold(
        body: BodyWidget(),
      ),
    );
  }
}

class BodyWidget extends StatefulWidget {
  @override
  _BodyWidgetState createState() => _BodyWidgetState();
}

class _BodyWidgetState extends State<BodyWidget> {
  double marginTop = 0;
  GameProvider gameProvider;

  @override
  void initState() {
    var gameProvider = Provider.of<GameProvider>(context, listen: false);
    gameProvider.init();
    if (Ads.isReleaseMode()) {
      Ads.showBannerAd();
      marginTop = 60;
    }
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    gameProvider = Provider.of<GameProvider>(context);
    return Stack(children: <Widget>[
      // BackgroundWidget(),
      Container(
        color: Colors.black,
        margin: EdgeInsets.only(top: marginTop),
        padding: EdgeInsets.only(top: 10),
        alignment: Alignment.center,
        child: InteractiveViewer(
          panEnabled: true,
          boundaryMargin: EdgeInsets.all(80),
          minScale: 0.1,
          maxScale: 3,
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: getColumnItems(),
          ),
        ),
      )
    ]);
  }

  List<Widget> getColumnItems() {
    List<Widget> rowWidgets = <Widget>[];
    var rowId = 0;
    gameProvider.cellCharacters.forEach((cell, character) {
      if (cell.y == rowId) {
        rowWidgets.add(
          Row(
            mainAxisAlignment: MainAxisAlignment.center,
            children: getRowCells(rowId),
          ),
        );

        rowId++;
      }
    });

    return rowWidgets;
  }

  List<Widget> getRowCells(int rowId) {
    List<Widget> cellWidgets = <Widget>[];
    gameProvider.cellCharacters.forEach((cell, character) {
      if (cell.y == rowId) {
        cellWidgets.add(
          GestureDetector(
            onTap: () => gameProvider.handleTapOnCell(cell, character),
            child: Container(
              decoration: BoxDecoration(
                color: Colors.grey,
                border: Border.all(
                  color: gameProvider.isCurrentCharacterPosition(
                          character: character, cell: cell)
                      ? Colors.deepOrange
                      : Colors.grey,
                  width: 2,
                ),
              ),
              width: Helpers.deviceSize.width /
                  gameProvider.mapWidthHeight.maxWidth,
              height: Helpers.deviceSize.width /
                  gameProvider.mapWidthHeight.maxHeight,
              child: Stack(children: <Widget>[
                Visibility(
                  visible: cell.couldBeMovedTo ?? false,
                  child: Container(
                    alignment: Alignment.center,
                    color: Colors.yellow.withOpacity(0.5),
                    child: Text(
                      cell.terrain.resistanceNum.toString(),
                    ),
                  ),
                ),
                getCharacterImage(cell, character) ?? Container(),
              ]),
            ),
          ),
        );
      }
    });

    return cellWidgets;
  }

  getCharacterImage(Cell cell, Character character) {
    if (character != null && cell.x == character.x && cell.y == character.y) {
      var imageName = EnumToString.convertToString(
              character.characterType.characterTypeEnum)
          .toLowerCase();
      return Stack(
        children: [
          Center(child: Image.asset('images/$imageName.png')),
          Text(
            character.health.toString(),
            style: TextStyle(
              color: Colors.white,
              fontSize: 8,
              fontWeight: FontWeight.w500,
            ),
          ),
        ],
      );
    } else {
      return null;
    }
  }
}
