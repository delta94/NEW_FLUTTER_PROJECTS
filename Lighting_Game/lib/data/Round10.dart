import 'package:com.seab1ird.showyourself/enum/CellType.dart';
import 'package:com.seab1ird.showyourself/enum/Direction.dart';
import 'package:com.seab1ird.showyourself/model/Cell.dart';

class Round10 {
  static getCellsMap() {
    Map<int, Cell> cellsMap = new Map();

    //-----------START LINE 0 --------------//
    cellsMap[00] = Cell.getCell(
      lightNum: 0,
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 2,
    );
    cellsMap[01] = Cell.getCell(
      lightNum: 0,
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 3,
    );
    cellsMap[02] = Cell.getCell(
      lightNum: 0,
      cellType: CellType.ARC,
      rightDirection: Direction.BOTTOM,
      lineIndex: 4,
    );
    cellsMap[03] = Cell.getCell(
      lightNum: 0,
      cellType: CellType.HALF_LINE,
      rightDirection: Direction.BOTTOM,
      lineIndex: 7,
    );
    //-----------END LINE 0 --------------//

    //-----------LINE 1 --------------//
    cellsMap[10] = Cell.getCell(
      lightNum: 0,
      cellType: CellType.LINE,
      rightDirection: Direction.TOP,
      lineIndex: 1,
    );
    cellsMap[11] = Cell.getCell(
      isUnusedLine: true,
      cellType: CellType.LINE,
    );
    cellsMap[12] = Cell.getCell(
      lightNum: 0,
      cellType: CellType.ARC,
      rightDirection: Direction.TOP,
      lineIndex: 5,
    );
    cellsMap[13] = Cell.getCell(
      lightNum: 0,
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 6,
    );
    //-----------END LINE 1 --------------//

    //-----------START LINE 2 --------------//
    cellsMap[20] = Cell.getCell(
      lightNum: 0,
      cellType: CellType.BATTERY,
      rightDirection: Direction.TOP,
    );
    cellsMap[21] = Cell.getCell(
      lightNum: 1,
      cellType: CellType.BATTERY,
      rightDirection: Direction.BOTTOM,
    );
    cellsMap[22] = Cell.getCell(
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
      lightNum: 1,
      cellType: CellType.ARC,
      rightDirection: Direction.TOP,
      lineIndex: 1,
    );
    cellsMap[32] = Cell.getCell(
      lightNum: 1,
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 2,
    );
    cellsMap[33] = Cell.getCell(
      lightNum: 1,
      cellType: CellType.ARC,
      rightDirection: Direction.BOTTOM,
      lineIndex: 3,
    );
    //-----------END LINE 3 --------------//

    //-----------START LINE 4 --------------//
    cellsMap[40] = Cell.getCell(
      lightNum: 1,
      cellType: CellType.HALF_LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 7,
    );
    cellsMap[41] = Cell.getCell(
      lightNum: 1,
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 6,
    );
    cellsMap[42] = Cell.getCell(
      lightNum: 1,
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 5,
    );
    cellsMap[43] = Cell.getCell(
      lightNum: 1,
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 4,
    );
    //-----------END LINE 4 --------------//

    return cellsMap;
  }
}
