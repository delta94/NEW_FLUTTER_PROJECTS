import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.disctest/QuestionProvider.dart';
import 'package:seab1ird.disctest/helpers/Helpers.dart';
import 'package:seab1ird.disctest/helpers/ReponsiveHelper.dart';
import 'package:seab1ird.disctest/models/ColorModel.dart';
import 'package:seab1ird.disctest/helpers/Utils.dart';

class ThemeItem extends StatelessWidget {
  const ThemeItem({
    Key key,
    @required this.index,
  }) : super(key: key);

  final int index;

  getColor(ColorModel colorModel, {double opacity = 1}) {
    return Color.fromRGBO(colorModel.r, colorModel.g, colorModel.b, opacity);
  }

  @override
  Widget build(BuildContext context) {
    List<ColorModel> colors = Utils.getGameColors();
    QuestionProvider questionProvider =
        Provider.of<QuestionProvider>(context, listen: false);
    return GestureDetector(
      onTap: () {
        Helpers.winGameSound();
        questionProvider.setThemeColorName(colors[index].colorName);
      },
      child: Container(
        width: ReponsiveHelper.deviceSize.width / 8,
        height: ReponsiveHelper.deviceSize.width / 8,
        decoration: BoxDecoration(
          shape: BoxShape.circle,
          color: getColor(colors[index]),
        ),
      ),
    );
  }
}
