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
  String themeColorName;
  String lightOffType = 'light';
  String lightOnType = 'light';
  String chosenAvatar;

  init() {
    cellsMap = Data.getCellsMap(playableRoundNum);
    getThemeFromShareReference();
    getPlayableRound();
    getChosenAvatar();
  }

  getPlayableRound() async {
    SharedPreferences prefs = await SharedPreferences.getInstance();
    playableRoundNum = prefs.getInt('playable_round');
    playableRoundNum = playableRoundNum ?? 0;
  }

  getChosenAvatar() async {
    SharedPreferences prefs = await SharedPreferences.getInstance();
    chosenAvatar = prefs.getString('chosen_avatar');
    chosenAvatar = chosenAvatar ?? 'light_on';
  }

  getThemeFromShareReference() async {
    SharedPreferences prefs = await SharedPreferences.getInstance();
    String savedThemeColorName = prefs.getString('themeColorName');
    savedThemeColorName =
        savedThemeColorName ?? Utils.getGameColors()[0].colorName;

    themeColorName = savedThemeColorName;
  }

  updateDirection(int positionId) {
    cellsMap[positionId].userDirection =
        Utils.getNextDirection(cellsMap[positionId].userDirection);

    hasTurnOnLight = true;
    hasTurnOnLight1 = true;
    hasTurnOnLight2 = true;

    cellsMap.forEach((key, cell) {
      if (!cell.isUnusedLine) {
        if (cell.lightNum == null || cell.lightNum == 0) {
          hasTurnOnLight &= Utils.isSameDirections(cell);
        } else if (cell.lightNum == 1) {
          hasTurnOnLight1 &= Utils.isSameDirections(cell);
        } else if (cell.lightNum == 2) {
          hasTurnOnLight2 &= Utils.isSameDirections(cell);
        }
      }
    });

    notifyListeners();
  }

  setThemeColorName(String colorName) async {
    var _prefs = await SharedPreferences.getInstance();
    _prefs.setString('themeColorName', '$colorName');
    themeColorName = colorName;
    notifyListeners();
  }

  setAvatar(String avatar) async {
    var _prefs = await SharedPreferences.getInstance();
    _prefs.setString('chosen_avatar', avatar);
    chosenAvatar = avatar;
    setLight();
    notifyListeners();
  }

  setLight() {
    lightOffType = Utils.getLightOffType(chosenAvatar);
    lightOnType = Utils.getLightOnType(chosenAvatar);
  }

  updateRoundNum() async {
    hasTurnOnLight = false;
    hasTurnOnLight1 = false;
    hasTurnOnLight2 = false;
    if (playableRoundNum < Data.maxRowNum && playableRoundNum == currRoundNum)
      playableRoundNum++;

    if (currRoundNum == playableRoundNum) {
      var _prefs = await SharedPreferences.getInstance();
      _prefs.setInt('playable_round', playableRoundNum);
    }
  }

  newGame() {
    updateRoundNum();
    cellsMap = Data.getCellsMap(currRoundNum);
  }

  getUserAvatars(String userName) {
    if (userName == 'You') {
      return Utils.getImage(chosenAvatar);
    } else {
      return Utils.getImage(
          Utils.getRandomLightOnType(Utils.getRandomLightOffType()) + '_on');
    }
  }
}
