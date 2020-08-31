import 'package:com.seab1ird.showyourself/enum/CellType.dart';
import 'package:com.seab1ird.showyourself/enum/Direction.dart';
import 'package:com.seab1ird.showyourself/model/Cell.dart';

class Round15 {
  static getCellsMap() {
    Map<int, Cell> cellsMap = new Map();

    //-----------START LINE 0 --------------//
    cellsMap[00] = Cell.getCell(
      cellType: CellType.HALF_LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 12,
    );
    cellsMap[01] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 11,
    );
    cellsMap[02] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 10,
    );
    cellsMap[03] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.BOTTOM,
      lineIndex: 9,
    );
    cellsMap[04] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.ARC,
    );
    //-----------END LINE 0 --------------//

    //-----------LINE 1 --------------//
    cellsMap[10] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.ARC,
    );
    cellsMap[11] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 6,
    );
    cellsMap[12] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 7,
    );
    cellsMap[13] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 8,
    );
    cellsMap[14] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.LINE,
    );
    //-----------END LINE 1 --------------//

    //-----------START LINE 2 --------------//
    cellsMap[20] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.LINE,
    );
    cellsMap[21] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.TOP,
      lineIndex: 5,
    );
    cellsMap[22] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.BOTTOM,
      lineIndex: 4,
    );
    cellsMap[23] = Cell.getCell(
      cellType: CellType.ARC,
      isUnusedLine: true,
    );
    cellsMap[24] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.LINE,
    );
    //-----------END LINE 2 --------------//

    //-----------START LINE 3 --------------//
    cellsMap[30] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.LINE,
    );
    cellsMap[31] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.ARC,
    );
    cellsMap[32] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.BOTTOM,
      lineIndex: 3,
    );
    cellsMap[33] = Cell.getCell(
      cellType: CellType.ARC,
      isUnusedLine: true,
    );
    cellsMap[34] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.LINE,
    );
    //-----------END LINE 3 --------------//

    //-----------START LINE 4 --------------//
    cellsMap[42] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.TOP,
      lineIndex: 2,
    );
    cellsMap[43] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.LEFT,
      lineIndex: 1,
    );
    cellsMap[44] = Cell.getCell(
      rightDirection: Direction.LEFT,
      cellType: CellType.BATTERY,
    );
    //-----------END LINE 4 --------------//

    return cellsMap;
  }
}
