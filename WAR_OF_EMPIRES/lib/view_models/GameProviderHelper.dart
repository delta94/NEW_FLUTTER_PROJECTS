import 'package:seab1ird.disctest/data/character_types/CharacterTypes.dart';
import 'package:seab1ird.disctest/data/maps/Map0.dart';
import 'package:seab1ird.disctest/enums/CharacterTypeEnum.dart';
import 'package:seab1ird.disctest/models/Cell.dart';
import 'package:seab1ird.disctest/models/Character.dart';
import 'package:seab1ird.disctest/models/MaxMapWidthHeight.dart';

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

  static bool isPossiblePositionMovingTo(
    Map<Cell, Character> cellCharacters,
    Character currentMovingCharacter,
    Cell cell,
  ) {
    // If cell have any character
    if (cellCharacters[cell] != null) return false;

    var _movingRange = currentMovingCharacter.characterType.movingRange;
    var xDiff = (cell.x - currentMovingCharacter.x).abs();
    var yDiff = (cell.y - currentMovingCharacter.y).abs();

    return (xDiff + yDiff) <= _movingRange;
  }

  static MaxMapWidthHeight getMapWidthHeight(List<Cell> mapCells) {
    int maxWidthIndex = 0;
    int maxHeightIndex = 0;

    mapCells.forEach((cell) {
      if (cell.x > maxWidthIndex) maxWidthIndex = cell.x;
      if (cell.y > maxHeightIndex) maxHeightIndex = cell.y;
    });

    return MaxMapWidthHeight(
        maxWidth: maxWidthIndex + 1, maxHeight: maxHeightIndex + 1);
  }
}
