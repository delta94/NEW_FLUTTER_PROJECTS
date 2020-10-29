import 'package:flutter/widgets.dart';
import 'package:seab1ird.disctest/data/maps/MapList.dart';
import 'package:seab1ird.disctest/models/Character.dart';
import 'package:seab1ird.disctest/models/MaxMapWidthHeight.dart';
import 'package:seab1ird.disctest/view_models/GameProviderHelper.dart';

import '../models/Cell.dart';

class GameProvider extends ChangeNotifier {
  int currentMapIndex = 0;
  List<Cell> mapCells;
  Map<Cell, Character> cellCharacters = {};
  Character currentCharacter;
  Cell currentMovingCell;
  MaxMapWidthHeight mapWidthHeight;
  List<Character> currentEnemies = <Character>[];

  void init() {
    mapCells = MapList.getMap(currentMapIndex);
    mapWidthHeight = GameProviderHelper.getMapWidthHeight(mapCells);
    GameProviderHelper.renderCharacters(cellCharacters);
  }

  void showAllCellsCouldMoveTo() {
    cellCharacters.forEach((cell, character) =>
        cell.couldBeMovedTo = couldBeMovedTo(character, cell));

    cellCharacters.forEach((cell, character){
      
    });
  }

  bool couldBeMovedTo(Character character, Cell cell) {
    if (currentCharacter == null) return false;
    return isCurrentCharacterPosition(character: character, cell: cell) ||
        GameProviderHelper.isPossiblePositionMovingTo(
            cellCharacters, currentCharacter, cell);
  }

  void onMoveFrom(Cell currentCell, Character character) {
    currentCharacter = character;
    currentMovingCell = currentCell;
    showAllCellsCouldMoveTo();
    notifyListeners();
  }

  void onMoveTo(Cell newCell, Character character) {
    // Change location of character
    if (currentCharacter != null && newCell.couldBeMovedTo) {
      cellCharacters.keys.forEach((cell) => cell.couldBeMovedTo = false);
      currentCharacter.x = newCell.x;
      currentCharacter.y = newCell.y;

      cellCharacters[newCell] = currentCharacter;
      cellCharacters[currentMovingCell] = null;

      clearState();
      notifyListeners();
    }
  }

  bool allowAttack(Character character) {
    var _attackRange = currentCharacter.characterType.attackRange;
    var forwardAttackLocationX = currentCharacter.x + _attackRange;
    var forwardAttackLocationY = currentCharacter.y + _attackRange;

    var backAttackLocationX = currentCharacter.x - _attackRange;
    var backAttackLocationY = currentCharacter.y - _attackRange;

    return (forwardAttackLocationX == character.x ||
        forwardAttackLocationY == character.y ||
        backAttackLocationX == character.x ||
        backAttackLocationY == character.y);
  }

  void attack(Cell cell, Character character) {
    character.health -= (currentCharacter.characterType.attackStrength *
            currentCharacter.health /
            100)
        .round();
    if (character.health <= 0) {
      cellCharacters[cell] = null;
    } else {
      attackBack(character);
      clearState();
    }

    notifyListeners();
  }

  void attackBack(Character character) {
    currentCharacter.health -=
        (character.characterType.attackStrength * 0.7 * character.health / 100)
            .round();
    if (currentCharacter.health <= 0) {
      cellCharacters[currentMovingCell] = null;
    }
  }

  void handleTapOnCell(Cell cell, Character character) {
    // if new cell don't have character
    if (character == null && currentCharacter != null) {
      onMoveTo(cell, character);
    } else if (currentCharacter == null) {
      onMoveFrom(cell, character);
    } else {
      if (allowAttack(character)) {
        attack(cell, character);
      }
    }
  }

  void clearState() {
    currentCharacter = null;
    currentMovingCell = null;
  }

  bool isCurrentCharacterPosition({Character character, Cell cell}) {
    return GameProviderHelper.isCurrentCharacterPosition(
        character, currentCharacter, cell);
  }
}
