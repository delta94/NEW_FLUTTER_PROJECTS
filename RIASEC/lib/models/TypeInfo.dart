import 'dart:ui';

import 'Types.dart';

class TypeInfo {
  final Types type;
  final String name;
  final String image;
  final Color color;
  final List<String> texts;

  TypeInfo(this.type, this.name, this.color, this.image, this.texts);
}
