
import 'dart:ui';

import 'Types.dart';

class ResultInfo{
  final Types type;
  final String name;
  final String image;
  final Color color;
  final List<String> texts;

  ResultInfo(this.type, this.name, this.color, this.image, this.texts);
}