import 'package:seab1ird.disctest/enums/Terrain.dart';

class Cell {
  final int x;
  final int y;
  final TERRAIN terrain;
  bool couldBeMovedTo;

  Cell({this.x, this.y, this.terrain, this.couldBeMovedTo});

  @override
  bool operator ==(Object other) =>
      other is Cell &&
      other.x == x &&
      other.y == y &&
      other.terrain == terrain &&
      other.couldBeMovedTo == couldBeMovedTo;

  @override
  int get hashCode => x.hashCode;
}
