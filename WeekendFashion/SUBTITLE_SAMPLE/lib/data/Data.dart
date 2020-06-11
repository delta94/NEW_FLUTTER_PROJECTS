import 'package:flutter/widgets.dart';
import 'package:seab1ird.showyourself/enums/SubItemType.dart';

class Data {
  List<Map<SubItemType, Map<String, List<Positioned>>>> itemSubMapList;
  
  Data(){
    itemSubMapList = new List<Map<SubItemType, Map<String, List<Positioned>>>>();
    itemSubMapList.add(new Map<SubItemType, Map<String, List<Positioned>>>());
    itemSubMapList.add(new Map<SubItemType, Map<String, List<Positioned>>>());
  }
}
