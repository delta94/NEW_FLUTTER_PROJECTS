import 'package:com.seab1ird.showyourself/enum/CellType.dart';
import 'package:com.seab1ird.showyourself/enum/Direction.dart';
import 'package:com.seab1ird.showyourself/model/Cell.dart';

class Round6 {
  static getCellsMap() {
    Map<int, Cell> cellsMap = new Map();

    //-----------START LINE 0 --------------//
    cellsMap[00] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 7,
    );
    cellsMap[01] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 8,
    );
    cellsMap[02] = Cell.getCell(
      cellType: CellType.HALF_LINE,
      rightDirection: Direction.LEFT,
      lineIndex: 9,
    );
    cellsMap[03] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.ARC,
    );
    //-----------END LINE 0 --------------//

    //-----------LINE 1 --------------//
    cellsMap[10] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.TOP,
      lineIndex: 6,
    );
    cellsMap[11] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 5,
    );
    cellsMap[12] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.BOTTOM,
      lineIndex: 4,
    );
    cellsMap[13] = Cell.getCell(
      cellType: CellType.LINE,
      isUnusedLine: true,
    );
    //-----------END LINE 1 --------------//

    //-----------START LINE 2 --------------//
    cellsMap[21] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 2,
    );
    cellsMap[22] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 3,
    );
    cellsMap[23] = Cell.getCell(
      cellType: CellType.ARC,
      isUnusedLine: true,
    );
    //-----------END LINE 2 --------------//

    //-----------START LINE 3 --------------//
    cellsMap[31] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.TOP,
      lineIndex: 1,
    );
    //-----------END LINE 3 --------------//

    //-----------START LINE 4 --------------//
    cellsMap[41] = Cell.getCell(
      cellType: CellType.BATTERY,
      rightDirection: Direction.TOP,
    );
    //-----------END LINE 4 --------------//

    return cellsMap;
  }
}
