import 'package:seab1ird.disctest/enums/CharacterTypeEnum.dart';
import 'package:seab1ird.disctest/models/CharacterType.dart';

Map<CharacterTypeEnum, CharacterType> CharaterTypeMap = {
  CharacterTypeEnum.WARRIOR: CharacterType(
    attackRange: 1,
    attackStrength: 35,
    characterTypeEnum: CharacterTypeEnum.WARRIOR,
    movingRange: 4,
  ),
  CharacterTypeEnum.ARCHER: CharacterType(
    attackRange: 2,
    attackStrength: 35,
    characterTypeEnum: CharacterTypeEnum.ARCHER,
    movingRange: 4,
  )
};

CharacterType getCharacterType(CharacterTypeEnum characterTypeEnum) {
  return CharaterTypeMap[characterTypeEnum];
}
