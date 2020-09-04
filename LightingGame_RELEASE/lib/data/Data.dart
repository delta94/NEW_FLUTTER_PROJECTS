import 'package:com.seab1ird.showyourself/data/Round0.dart';
import 'package:com.seab1ird.showyourself/data/Round2.dart';
import 'package:com.seab1ird.showyourself/data/Round8.dart';

import 'Round1.dart';
import 'Round10.dart';
import 'Round11.dart';
import 'Round12.dart';
import 'Round13.dart';
import 'Round14.dart';
import 'Round15.dart';
import 'Round16.dart';
import 'Round17.dart';
import 'Round18.dart';
import 'Round19.dart';
import 'Round20.dart';
import 'Round21.dart';
import 'Round22.dart';
import 'Round23.dart';
import 'Round3.dart';
import 'Round4.dart';
import 'Round5.dart';
import 'Round6.dart';
import 'Round7.dart';
import 'Round9.dart';

class Data {
  static final int maxRowNum = 23;
  static getCellsMap(int roundNum) {
    switch (roundNum) {
      case 0:
        return Round0.getCellsMap();
      case 1:
        return Round1.getCellsMap();
      case 2:
        return Round2.getCellsMap();
      case 3:
        return Round3.getCellsMap();
      case 4:
        return Round4.getCellsMap();
      case 5:
        return Round5.getCellsMap();
      case 6:
        return Round6.getCellsMap();
      case 7:
        return Round7.getCellsMap();
      case 8:
        return Round8.getCellsMap();
      case 9:
        return Round9.getCellsMap();
      case 10:
        return Round10.getCellsMap();
      case 11:
        return Round11.getCellsMap();
      case 12:
        return Round12.getCellsMap();
      case 13:
        return Round13.getCellsMap();
      case 14:
        return Round14.getCellsMap();
      case 15:
        return Round15.getCellsMap();
      case 16:
        return Round16.getCellsMap();
      case 17:
        return Round17.getCellsMap();
      case 18:
        return Round18.getCellsMap();
      case 19:
        return Round19.getCellsMap();
      case 20:
        return Round20.getCellsMap();
      case 21:
        return Round21.getCellsMap();
      case 22:
        return Round22.getCellsMap();
      case 23:
        return Round23.getCellsMap();
      default:
    }
  }
}
