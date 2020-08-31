import 'package:com.seab1ird.showyourself/enum/CellType.dart';
import 'package:com.seab1ird.showyourself/enum/Direction.dart';
import 'package:com.seab1ird.showyourself/model/Cell.dart';

class Round7 {
  static getCellsMap() {
    Map<int, Cell> cellsMap = new Map();

    //-----------START LINE 0 --------------//
    cellsMap[00] = Cell.getCell(
      cellType: CellType.BATTERY,
      rightDirection: Direction.RIGHT,
    );
    cellsMap[01] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.BOTTOM,
      lineIndex: 1,
    );
    cellsMap[04] = Cell.getCell(
      cellType: CellType.HALF_LINE,
      rightDirection: Direction.BOTTOM,
      lineIndex: 12,
    );
    //-----------END LINE 0 --------------//

    //-----------LINE 1 --------------//
    cellsMap[11] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.BOTTOM,
      lineIndex: 2,
    );
    cellsMap[14] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.BOTTOM,
      lineIndex: 11,
    );
    //-----------END LINE 1 --------------//

    //-----------START LINE 2 --------------//
    cellsMap[20] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 4,
    );
    cellsMap[21] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 3,
    );
    cellsMap[22] = Cell.getCell(
      cellType: CellType.LINE,
      isUnusedLine: true,
    );
    cellsMap[23] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 9,
    );
    cellsMap[24] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 10,
    );
    //-----------END LINE 2 --------------//

    //-----------START LINE 3 --------------//
    cellsMap[30] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.TOP,
      lineIndex: 5,
    );
    cellsMap[31] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 6,
    );
    cellsMap[32] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 7,
    );
    cellsMap[33] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 8,
    );
    cellsMap[34] = Cell.getCell(
      cellType: CellType.ARC,
      isUnusedLine: true,
    );
    //-----------END LINE 3 --------------//

    //-----------START LINE 4 --------------//
    //-----------END LINE 4 --------------//

    return cellsMap;
  }
}
