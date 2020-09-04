import 'package:com.seab1ird.showyourself/enum/CellType.dart';
import 'package:com.seab1ird.showyourself/enum/Direction.dart';
import 'package:com.seab1ird.showyourself/model/Cell.dart';

class Round1 {
  static getCellsMap() {
    Map<int, Cell> cellsMap = new Map();

    cellsMap[12] = Cell.getCell(
      cellType: CellType.HALF_LINE,
      rightDirection: Direction.BOTTOM,
      lineIndex: 4,
    );

    cellsMap[22] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.BOTTOM,
      lineIndex: 3,
    );

    cellsMap[32] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.BOTTOM,
      lineIndex: 2,
    );

    cellsMap[42] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.TOP,
      lineIndex: 1,
    );

    cellsMap[43] = Cell.getCell(
      cellType: CellType.BATTERY,
      rightDirection: Direction.LEFT,
    );
    return cellsMap;
  }
}
