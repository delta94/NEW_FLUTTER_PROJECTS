import 'package:com.seab1ird.showyourself/enum/CellType.dart';
import 'package:com.seab1ird.showyourself/enum/Direction.dart';
import 'package:com.seab1ird.showyourself/model/Cell.dart';

class Round22 {
  static getCellsMap() {
    Map<int, Cell> cellsMap = new Map();

    //-----------START LINE 0 --------------//
    cellsMap[00] = Cell.getCell(
      cellType: CellType.LINE,
      isUnusedLine: true,
    );
    cellsMap[01] = Cell.getCell(
      cellType: CellType.HALF_LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 16,
    );
    cellsMap[02] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 15,
    );
    cellsMap[03] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.BOTTOM,
      lineIndex: 14,
    );
    cellsMap[04] = Cell.getCell(
      cellType: CellType.ARC,
      isUnusedLine: true,
    );
    //-----------END LINE 0 --------------//

    //-----------LINE 1 --------------//
    cellsMap[10] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 2,
    );
    cellsMap[11] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 1,
    );
    cellsMap[12] = Cell.getCell(
      cellType: CellType.BATTERY,
      rightDirection: Direction.LEFT,
    );
    cellsMap[13] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.TOP,
      lineIndex: 13,
    );
    cellsMap[14] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.BOTTOM,
      lineIndex: 12,
    );
    //-----------END LINE 1 --------------//

    //-----------START LINE 2 --------------//
    cellsMap[20] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.TOP,
      lineIndex: 3,
    );
    cellsMap[21] = Cell.getCell(
      cellType: CellType.LINE,
      isUnusedLine: true,
    );
    cellsMap[22] = Cell.getCell(
      cellType: CellType.ARC,
      isUnusedLine: true,
    );
    cellsMap[23] = Cell.getCell(
      cellType: CellType.LINE,
      isUnusedLine: true,
    );
    cellsMap[24] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.TOP,
      lineIndex: 11,
    );
    //-----------END LINE 2 --------------//

    //-----------START LINE 3 --------------//
    cellsMap[30] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.TOP,
      lineIndex: 4,
    );
    cellsMap[31] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.BOTTOM,
      lineIndex: 5,
    );
    cellsMap[32] = Cell.getCell(
      cellType: CellType.LINE,
      isUnusedLine: true,
    );
    cellsMap[33] = Cell.getCell(
      cellType: CellType.ARC,
      isUnusedLine: true,
    );
    cellsMap[34] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.TOP,
      lineIndex: 10,
    );
    //-----------END LINE 3 --------------//

    //-----------START LINE 4 --------------//
    cellsMap[40] = Cell.getCell(
      cellType: CellType.LINE,
      isUnusedLine: true,
    );
    cellsMap[41] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.TOP,
      lineIndex: 6,
    );
    cellsMap[42] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 7,
    );
    cellsMap[43] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 8,
    );
    cellsMap[44] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 9,
    );
    //-----------END LINE 4 --------------//

    return cellsMap;
  }
}
