import 'package:seab1ird.disctest/enums/TerrainEnum.dart';
import 'package:seab1ird.disctest/models/Terrain.dart';

const Map<TerrainEnum, Terrain> TerrainMap = {
  TerrainEnum.VALLEY: Terrain(
    terrainEnum: TerrainEnum.VALLEY,
    resistanceNum: 0,
    attackAdvantage: 0,
  ),
  TerrainEnum.MARSH: Terrain(
    terrainEnum: TerrainEnum.MARSH,
    resistanceNum: 0,
    attackAdvantage: -1,
  ),
  TerrainEnum.WATER: Terrain(
    terrainEnum: TerrainEnum.WATER,
    resistanceNum: 1,
    attackAdvantage: 1,
  ),
  TerrainEnum.DELTA: Terrain(
    terrainEnum: TerrainEnum.DELTA,
    resistanceNum: 1,
    attackAdvantage: 1,
  ),
  TerrainEnum.GLACIER: Terrain(
    terrainEnum: TerrainEnum.GLACIER,
    resistanceNum: 1,
    attackAdvantage: 0,
  ),
  TerrainEnum.FOREST: Terrain(
    terrainEnum: TerrainEnum.FOREST,
    resistanceNum: 2,
    attackAdvantage: 2,
  ),
  TerrainEnum.HILL: Terrain(
    terrainEnum: TerrainEnum.HILL,
    resistanceNum: 2,
    attackAdvantage: 2,
  ),
  TerrainEnum.MOUNTAIN: Terrain(
    terrainEnum: TerrainEnum.MOUNTAIN,
    resistanceNum: 3,
    attackAdvantage: 3,
  ),
};

Terrain getTerrainType(TerrainEnum terrainEnum) {
  return TerrainMap[terrainEnum];
}
