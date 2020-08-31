import 'package:com.seab1ird.showyourself/enum/CellType.dart';
import 'package:com.seab1ird.showyourself/enum/Direction.dart';
import 'package:com.seab1ird.showyourself/utils/Utils.dart';

class Position {
  final int rowId;
  final int columnId;

  Position({this.rowId, this.columnId});

  factory Position.getPostion({int rowId, int columnId}) {
    return Position(rowId: rowId, columnId: columnId);
  }
}

class Cell {
  bool setSameDirections;
  bool isUnusedLine;
  CellType cellType;
  Direction userDirection;
  Direction rightDirection;
  int lightNum;
  int lineIndex;

  Cell({
    this.setSameDirections: false,
    this.isUnusedLine: false,
    this.cellType,
    this.userDirection,
    this.rightDirection,
    this.lightNum,
    this.lineIndex,
  });

  factory Cell.getCell({
    bool setSameDirections = false,
    bool isUnusedLine = false,
    CellType cellType,
    Direction userDirection,
    Direction rightDirection,
    int lightNum,
    int lineIndex,
  }) {
    Cell cell = new Cell(
      isUnusedLine: isUnusedLine,
      cellType: cellType,
      rightDirection: rightDirection,
      userDirection: userDirection,
      lightNum: lightNum,
      lineIndex: lineIndex,
    );

    if (cellType == CellType.BATTERY && !isUnusedLine) cell.lineIndex = 0;
    if (isUnusedLine) cell.rightDirection = Utils.getRandomDirection();
    if (cellType == CellType.BATTERY) setSameDirections = true;
    if (setSameDirections) {
      cell.userDirection = rightDirection;
    } else {
      cell.userDirection = Utils.getRandomDirection();
      if (Utils.isSameDirections(cell)) {
        cell.userDirection = Utils.getNextDirection(cell.userDirection);
      }
    }

    return cell;
  }
}
