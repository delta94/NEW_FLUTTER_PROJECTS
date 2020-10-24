import 'CharacterType.dart';

class Character {
  CharacterType characterType;
  int health;
  int armor;
  int team;
  int x;
  int y;

  Character({
    this.characterType,
    this.health = 100,
    this.armor = 100,
    this.team,
    this.x,
    this.y,
  });

  @override
  bool operator ==(Object other) =>
      other is Character &&
      other.x == x &&
      other.y == y &&
      other.characterType == characterType &&
      other.team == team &&
      other.health == health &&
      other.armor == armor;

  @override
  int get hashCode => x.hashCode;
}
