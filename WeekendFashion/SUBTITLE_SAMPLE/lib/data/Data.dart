import 'package:flutter/widgets.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';

abstract class Data {
  Map<SubItemType, Map<String, List<Positioned>>> itemSubMap;
}
