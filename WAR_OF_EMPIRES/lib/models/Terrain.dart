import 'package:seab1ird.disctest/enums/TerrainEnum.dart';

class Terrain {
  final TerrainEnum terrainEnum;
  final int resistanceNum;
  final int attackAdvantage;

  const Terrain({
    this.terrainEnum = TerrainEnum.DELTA,
    this.resistanceNum,
    this.attackAdvantage,
  });
}
