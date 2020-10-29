import 'package:flutter/cupertino.dart';

import 'Terrain.dart';

class Cell {
  final int x;
  final int y;
  final Terrain terrain;
  bool couldBeMovedTo;

  Cell({
    @required this.x,
    @required this.y,
    this.terrain,
    this.couldBeMovedTo,
  });

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
