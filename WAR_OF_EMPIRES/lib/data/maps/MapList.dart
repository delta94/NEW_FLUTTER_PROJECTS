import 'package:seab1ird.disctest/data/maps/GameMap.dart';
import 'package:seab1ird.disctest/data/maps/Map0.dart';
import 'package:seab1ird.disctest/models/Cell.dart';

class MapList {
  static List<Cell> getMap(int mapIndex) {
    switch (mapIndex) {
      case 0:
        return Map0.cells;

      default:
        return Map0.cells;
    }
  }
}
