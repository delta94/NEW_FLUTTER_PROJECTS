class ColorModel {
  int r;
  int g;
  int b;

  ColorModel({this.r, this.g, this.b});

  factory ColorModel.getColor(
    int r,
    int g,
    int b,
  ) {
    return new ColorModel(r: r, g: g, b: b);
  }
}
