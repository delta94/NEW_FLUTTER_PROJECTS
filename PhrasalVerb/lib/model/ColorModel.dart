class ColorModel {
  int r;
  int g;
  int b;
  String colorName;

  ColorModel({this.r, this.g, this.b, this.colorName});

  factory ColorModel.getColor(
    int r,
    int g,
    int b,
    String name,
  ) {
    return new ColorModel(r: r, g: g, b: b, colorName: name);
  }
}
