import 'package:com.seab1ird.showyourself/enum/CellType.dart';
import 'package:com.seab1ird.showyourself/enum/Direction.dart';
import 'package:com.seab1ird.showyourself/model/Cell.dart';

class Round13 {
  static getCellsMap() {
    Map<int, Cell> cellsMap = new Map();

    //-----------START LINE 0 --------------//
    cellsMap[00] = Cell.getCell(
      lightNum: 0,
      cellType: CellType.BATTERY,
      rightDirection: Direction.RIGHT,
    );
    cellsMap[01] = Cell.getCell(
      lightNum: 0,
      cellType: CellType.ARC,
      rightDirection: Direction.BOTTOM,
      lineIndex: 1,
    );
    //-----------END LINE 0 --------------//

    //-----------LINE 1 --------------//
    cellsMap[10] = Cell.getCell(
      lightNum: 0,
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 3,
    );
    cellsMap[11] = Cell.getCell(
      lightNum: 0,
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 2,
    );
    cellsMap[12] = Cell.getCell(
      lightNum: 1,
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 2,
    );
    cellsMap[13] = Cell.getCell(
      lightNum: 1,
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 5,
    );
    cellsMap[13] = Cell.getCell(
      lightNum: 1,
      cellType: CellType.HALF_LINE,
      rightDirection: Direction.LEFT,
      lineIndex: 6,
    );
    //-----------END LINE 1 --------------//

    //-----------START LINE 2 --------------//
    cellsMap[20] = Cell.getCell(
      lightNum: 0,
      cellType: CellType.LINE,
      rightDirection: Direction.BOTTOM,
      lineIndex: 4,
    );
    cellsMap[21] = Cell.getCell(
      lightNum: 1,
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 3,
    );
    cellsMap[22] = Cell.getCell(
      lightNum: 1,
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 4,
    );
    cellsMap[23] = Cell.getCell(
      lightNum: 2,
      cellType: CellType.BATTERY,
      rightDirection: Direction.BOTTOM,
    );
    //-----------END LINE 2 --------------//

    //-----------START LINE 3 --------------//
    cellsMap[30] = Cell.getCell(
      lightNum: 0,
      cellType: CellType.HALF_LINE,
      rightDirection: Direction.TOP,
      lineIndex: 5,
    );
    cellsMap[31] = Cell.getCell(
      lightNum: 1,
      cellType: CellType.LINE,
      rightDirection: Direction.TOP,
      lineIndex: 2,
    );
    cellsMap[32] = Cell.getCell(
      lightNum: 2,
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 2,
    );
    cellsMap[33] = Cell.getCell(
      lightNum: 2,
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 1,
    );
    //-----------END LINE 3 --------------//

    //-----------START LINE 4 --------------//
    cellsMap[40] = Cell.getCell(
      lightNum: 1,
      cellType: CellType.BATTERY,
      rightDirection: Direction.RIGHT,
    );
    cellsMap[41] = Cell.getCell(
      lightNum: 1,
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 1,
    );
    cellsMap[42] = Cell.getCell(
      lightNum: 2,
      cellType: CellType.ARC,
      rightDirection: Direction.TOP,
      lineIndex: 3,
    );
    cellsMap[43] = Cell.getCell(
      lightNum: 2,
      cellType: CellType.LINE,
      rightDirection: Direction.RIGHT,
      lineIndex: 4,
    );
    cellsMap[44] = Cell.getCell(
      lightNum: 2,
      cellType: CellType.HALF_LINE,
      rightDirection: Direction.LEFT,
      lineIndex: 5,
    );
    //-----------END LINE 4 --------------//

    return cellsMap;
  }
}
