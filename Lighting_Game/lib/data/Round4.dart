import 'package:com.seab1ird.showyourself/enum/CellType.dart';
import 'package:com.seab1ird.showyourself/enum/Direction.dart';
import 'package:com.seab1ird.showyourself/model/Cell.dart';

class Round4 {
  static getCellsMap() {
    Map<int, Cell> cellsMap = new Map();

    //-----------START LINE 0 --------------//
    cellsMap[01] = Cell.getCell(
      cellType: CellType.BATTERY,
      rightDirection: Direction.BOTTOM,
    );
    //-----------END LINE 0 --------------//

    //-----------LINE 1 --------------//
    cellsMap[11] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.BOTTOM,
      lineIndex: 1,
    );
    cellsMap[12] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.RIGHT,
      lineIndex: 6,
    );
    cellsMap[13] = Cell.getCell(
      cellType: CellType.HALF_LINE,
      rightDirection: Direction.LEFT,
      lineIndex: 7,
    );
    //-----------END LINE 1 --------------//

    //-----------START LINE 2 --------------//
    cellsMap[21] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.BOTTOM,
      lineIndex: 2,
    );
    cellsMap[22] = Cell.getCell(
      cellType: CellType.LINE,
      rightDirection: Direction.TOP,
      lineIndex: 5,
    );
    //-----------END LINE 2 --------------//

    //-----------START LINE 3 --------------//
    cellsMap[31] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.TOP,
      lineIndex: 3,
    );
    cellsMap[32] = Cell.getCell(
      cellType: CellType.ARC,
      rightDirection: Direction.LEFT,
      lineIndex: 4,
    );
    //-----------END LINE 3 --------------//

    //-----------START LINE 4 --------------//
    //-----------END LINE 4 --------------//

    return cellsMap;
  }
}
