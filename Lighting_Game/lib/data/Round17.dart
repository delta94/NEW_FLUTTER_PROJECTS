import 'package:com.seab1ird.showyourself/enum/CellType.dart';
import 'package:com.seab1ird.showyourself/enum/Direction.dart';
import 'package:com.seab1ird.showyourself/model/Cell.dart';

class Round17 {
  static getCellsMap() {
    Map<int, Cell> cellsMap = new Map();

    //-----------START LINE 0 --------------//
    cellsMap[00] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.ARC,
    );
    cellsMap[01] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 3,
    );
    cellsMap[02] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 2,
    );
    cellsMap[03] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 1,
    );
    cellsMap[04] = Cell.getCell(
      rightDirection: Direction.LEFT,
      cellType: CellType.BATTERY,
    );
    //-----------END LINE 0 --------------//

    //-----------LINE 1 --------------//
    cellsMap[10] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.ARC,
    );
    cellsMap[11] = Cell.getCell(
      rightDirection: Direction.TOP,
      cellType: CellType.LINE,
      lineIndex: 4,
    );
    cellsMap[12] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 7,
    );
    cellsMap[13] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 8,
    );
    cellsMap[14] = Cell.getCell(
      rightDirection: Direction.BOTTOM,
      cellType: CellType.ARC,
      lineIndex: 9,
    );
    //-----------END LINE 1 --------------//

    //-----------START LINE 2 --------------//
    cellsMap[20] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.BATTERY,
    );
    cellsMap[21] = Cell.getCell(
      rightDirection: Direction.TOP,
      cellType: CellType.ARC,
      lineIndex: 5,
    );
    cellsMap[22] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 6,
    );
    cellsMap[23] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.BATTERY,
      rightDirection: Direction.RIGHT,
    );
    cellsMap[24] = Cell.getCell(
      rightDirection: Direction.BOTTOM,
      cellType: CellType.LINE,
      lineIndex: 10,
    );
    //-----------END LINE 2 --------------//

    //-----------START LINE 3 --------------//
    cellsMap[30] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 15,
    );
    cellsMap[31] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.LEFT,
      lineIndex: 14,
    );
    cellsMap[32] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.LEFT,
      lineIndex: 13,
    );
    cellsMap[33] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.LEFT,
      lineIndex: 12,
    );
    cellsMap[34] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 11,
    );
    //-----------END LINE 3 --------------//

    //-----------START LINE 4 --------------//
    cellsMap[40] = Cell.getCell(
      cellType: CellType.HALF_LINE,
      rightDirection: Direction.TOP,
      lineIndex: 16,
    );
    cellsMap[41] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.ARC,
    );
    cellsMap[42] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.LINE,
    );
    cellsMap[43] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.ARC,
    );
    cellsMap[44] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.BATTERY,
    );
    //-----------END LINE 4 --------------//

    return cellsMap;
  }
}
