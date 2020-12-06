import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.riasectest/AppProvider.dart';
import 'package:seabird.riasectest/helpers/Helpers.dart';
import 'package:seabird.riasectest/models/ColorModel.dart';
import 'package:seabird.riasectest/utils/Utils.dart';

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
    AppProvider questionProvider =
        Provider.of<AppProvider>(context, listen: false);
    return GestureDetector(
      onTap: () {
        Helpers.winGameSound();
        questionProvider.setThemeColorName(colors[index].colorName);
      },
      child: Container(
        width: Helpers.deviceSize.width / 8,
        height: Helpers.deviceSize.width / 8,
        decoration: BoxDecoration(
          shape: BoxShape.circle,
          color: getColor(colors[index]),
        ),
      ),
    );
  }
}
