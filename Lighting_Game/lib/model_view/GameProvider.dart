import 'package:com.seab1ird.showyourself/data/Data.dart';
import 'package:com.seab1ird.showyourself/model/Cell.dart';
import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:shared_preferences/shared_preferences.dart';

class GameProvider with ChangeNotifier {
  Map<int, Cell> cellsMap = new Map();
  bool hasTurnOnLight = false;
  bool hasTurnOnLight1 = false;
  bool hasTurnOnLight2 = false;
  int playableRoundNum = 0;
  int currRoundNum = 0;
  int time = 0;
  Color theme;
  String lightOffType = 'light';
  String lightOnType = 'kitty_smile_0';

  init() {
    hasTurnOnLight = false;
    hasTurnOnLight1 = false;
    hasTurnOnLight2 = false;
    cellsMap = Data.getCellsMap(playableRoundNum);
  }

  updateDirection(int positionId) {
    cellsMap[positionId].userDirection =
        Utils.getNextDirection(cellsMap[positionId].userDirection);

    hasTurnOnLight = true;
    hasTurnOnLight1 = true;
    hasTurnOnLight2 = true;
    cellsMap.forEach((key, cell) {
      if (!cell.isUnusedLine) {
        if (cell.lightNum == null || cell.lightNum == 0)
          hasTurnOnLight &= Utils.isSameDirections(cell);
        else if (cell.lightNum == 1)
          hasTurnOnLight1 &= Utils.isSameDirections(cell);
        else if (cell.lightNum == 2)
          hasTurnOnLight2 &= Utils.isSameDirections(cell);
      }
    });

    notifyListeners();
  }

  updateRoundNum() async {
    hasTurnOnLight = false;
    hasTurnOnLight1 = false;
    hasTurnOnLight2 = false;
    if (playableRoundNum < Data.maxRowNum)
      playableRoundNum++;
    else {
      lightOffType = Utils.getLightOffType();
      lightOnType = Utils.getLightOnType(lightOffType);
    }

    if (currRoundNum == playableRoundNum) {
      var _prefs = await SharedPreferences.getInstance();
      _prefs.setInt('playable_round', playableRoundNum);
    }
  }

  newGame() {
    updateRoundNum();
    cellsMap = Data.getCellsMap(currRoundNum);
  }
}
