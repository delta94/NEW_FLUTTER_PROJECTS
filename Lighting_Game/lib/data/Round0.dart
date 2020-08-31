import 'package:com.seab1ird.showyourself/enum/CellType.dart';
import 'package:com.seab1ird.showyourself/enum/Direction.dart';
import 'package:com.seab1ird.showyourself/model/Cell.dart';

class Round0 {
  static getCellsMap() {
    Map<int, Cell> cellsMap = new Map();

    cellsMap[02] = Cell.getCell(
      cellType: CellType.HALF_LINE,
      setSameDirections: true,
      rightDirection: Direction.BOTTOM,
      lineIndex: 4,
    );

    cellsMap[12] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.BOTTOM,
      lineIndex: 3,
    );

    cellsMap[22] = Cell.getCell(
      cellType: CellType.LINE,
      setSameDirections: true,
      rightDirection: Direction.BOTTOM,
      lineIndex: 2,
    );

    cellsMap[32] = Cell.getCell(
      cellType: CellType.LINE,
      setSameDirections: true,
      rightDirection: Direction.BOTTOM,
      lineIndex: 1,
    );

    cellsMap[42] = Cell.getCell(
      cellType: CellType.BATTERY,
      setSameDirections: true,
      rightDirection: Direction.TOP,
    );
    return cellsMap;
  }
}
