import 'package:com.seab1ird.showyourself/enum/CellType.dart';
import 'package:com.seab1ird.showyourself/enum/Direction.dart';
import 'package:com.seab1ird.showyourself/model/Cell.dart';

class Round18 {
  static getCellsMap() {
    Map<int, Cell> cellsMap = new Map();

    //-----------START LINE 0 --------------//
    cellsMap[00] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.BATTERY,
      rightDirection: Direction.BOTTOM,
    );
    cellsMap[01] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 7,
    );
    cellsMap[02] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 6,
    );
    cellsMap[03] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 5,
    );
    cellsMap[04] = Cell.getCell(
      rightDirection: Direction.BOTTOM,
      cellType: CellType.ARC,
      lineIndex: 4,
    );
    //-----------END LINE 0 --------------//

    //-----------LINE 1 --------------//
    cellsMap[10] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.LINE,
    );
    cellsMap[11] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.TOP,
      lineIndex: 8,
    );
    cellsMap[12] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 1,
    );
    cellsMap[13] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 2,
    );
    cellsMap[14] = Cell.getCell(
      rightDirection: Direction.LEFT,
      cellType: CellType.ARC,
      lineIndex: 3,
    );
    //-----------END LINE 1 --------------//

    //-----------START LINE 2 --------------//
    cellsMap[20] = Cell.getCell(
      rightDirection: Direction.RIGHT,
      cellType: CellType.ARC,
      lineIndex: 10,
    );
    cellsMap[21] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 9,
    );
    cellsMap[22] = Cell.getCell(
      cellType: CellType.BATTERY,
      rightDirection: Direction.TOP,
    );
    cellsMap[23] = Cell.getCell(
      cellType: CellType.BATTERY,
      rightDirection: Direction.RIGHT,
      isUnusedLine: true,
    );
    cellsMap[24] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.ARC,
    );
    //-----------END LINE 2 --------------//

    //-----------START LINE 3 --------------//
    cellsMap[30] = Cell.getCell(
      rightDirection: Direction.TOP,
      cellType: CellType.LINE,
      lineIndex: 11,
    );
    cellsMap[31] = Cell.getCell(
      cellType: CellType.BATTERY,
      rightDirection: Direction.BOTTOM,
      isUnusedLine: true,
    );
    cellsMap[32] = Cell.getCell(
      cellType: CellType.HALF_LINE,
      rightDirection: Direction.BOTTOM,
      lineIndex: 15,
    );
    cellsMap[33] = Cell.getCell(
      cellType: CellType.ARC,
      isUnusedLine: true,
    );
    cellsMap[34] = Cell.getCell(
      cellType: CellType.ARC,
      isUnusedLine: true,
    );
    //-----------END LINE 3 --------------//

    //-----------START LINE 4 --------------//
    cellsMap[40] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.TOP,
      lineIndex: 12,
    );
    cellsMap[41] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 13,
    );
    cellsMap[42] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 14,
    );
    cellsMap[43] = Cell.getCell(
      cellType: CellType.ARC,
      isUnusedLine: true,
    );
    cellsMap[44] = Cell.getCell(
      cellType: CellType.LINE,
      isUnusedLine: true,
    );
    //-----------END LINE 4 --------------//

    return cellsMap;
  }
}
