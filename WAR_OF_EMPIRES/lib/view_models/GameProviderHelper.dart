import 'package:seab1ird.disctest/data/character_types/CharacterTypes.dart';
import 'package:seab1ird.disctest/data/maps/Map0.dart';
import 'package:seab1ird.disctest/enums/CharacterTypeEnum.dart';
import 'package:seab1ird.disctest/models/Cell.dart';
import 'package:seab1ird.disctest/models/Character.dart';
import 'package:seab1ird.disctest/models/MapWidthHeight.dart';

class GameProviderHelper {
  static void renderCharacters(Map<Cell, Character> cellCharacters) {
    Map0.cells.forEach((cell) {
      cellCharacters[cell] = null;
    });

    cellCharacters[Map0.cells[0]] = Character(
      team: 0,
      x: 0,
      y: 0,
      characterType: getCharacterType(CharacterTypeEnum.WARRIOR),
    );

    cellCharacters[Map0.cells[2]] = Character(
      team: 1,
      x: 2,
      y: 0,
      characterType: getCharacterType(CharacterTypeEnum.WARRIOR),
    );
  }

  static bool isCurrentCharacterPosition(
      Character character, Character currentMovingCharacter, Cell cell) {
    if (character == null || currentMovingCharacter == null) return false;
    return currentMovingCharacter == character &&
        cell.x == currentMovingCharacter.x &&
        cell.y == currentMovingCharacter.y;
  }

  static bool isPossibleMovingPosition(
      Character currentMovingCharacter, Cell cell) {
    var _movingRange = currentMovingCharacter.characterType.movingRange;
    var isSameRow = cell.y == currentMovingCharacter.y;
    var isSameColumn = cell.x == currentMovingCharacter.x;

    var maxLeftIndex = currentMovingCharacter.x - _movingRange;
    var maxRightIndex = currentMovingCharacter.x + _movingRange;
    var maxBottomIndex = currentMovingCharacter.y - _movingRange;
    var maxTopIndex = currentMovingCharacter.y + _movingRange;

    // Check in the same row
    var isInMinLeft = isSameRow && (cell.x >= maxLeftIndex);
    var isInMaxRight = isSameRow && (cell.x <= maxRightIndex);

    // Check in the same column
    var isInMinBottom = isSameColumn && (cell.y >= maxBottomIndex);
    var isInMaxTop = isSameColumn && (cell.y <= maxTopIndex);

    // Check Left Right
    var isInLeftRight = isInMinLeft && isInMaxRight;
    var isInTopBottom = isInMinBottom && isInMaxTop;

    // Check other postions
    var isInTopLeftBottomRight = (cell.y < maxTopIndex) &&
        (cell.x > maxLeftIndex) &&
        (cell.y > maxBottomIndex) &&
        (cell.x < maxRightIndex);

    return isInTopLeftBottomRight || isInLeftRight || isInTopBottom;
  }

  static MapWidthHeight getMapWidthHeight(List<Cell> mapCells) {
    int maxWidthIndex = 0;
    int maxHeightIndex = 0;

    mapCells.forEach((cell) {
      if (cell.x > maxWidthIndex) maxWidthIndex = cell.x;
      if (cell.y > maxHeightIndex) maxHeightIndex = cell.y;
    });

    return MapWidthHeight(
        maxWidth: maxWidthIndex + 1, maxHeight: maxHeightIndex + 1);
  }
}
