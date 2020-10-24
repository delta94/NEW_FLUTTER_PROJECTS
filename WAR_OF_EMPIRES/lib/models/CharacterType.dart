import 'package:seab1ird.disctest/enums/CharacterTypeEnum.dart';

class CharacterType {
  final CharacterTypeEnum characterTypeEnum;
  int attackStrength;
  int attackRange;
  int movingRange;

  CharacterType({
    this.characterTypeEnum,
    this.attackStrength,
    this.attackRange,
    this.movingRange,
  });
}
