import 'package:com.seab1ird.showyourself/model/ColorModel.dart';
import 'package:com.seab1ird.showyourself/model_view/GameProvider.dart';
import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';
import 'package:shimmer/shimmer.dart';

// ignore: must_be_immutable
class Themes extends StatelessWidget {
  final Function(ColorModel) onChangeTheme;
  const Themes({Key key, this.onChangeTheme}) : super(key: key);

  getColor(ColorModel colorModel, {double opacity = 1}) {
    return Color.fromRGBO(colorModel.r, colorModel.g, colorModel.b, opacity);
  }

  @override
  Widget build(BuildContext context) {
    List<ColorModel> colors = Utils.getGameColors();
    GameProvider gameProvider = Provider.of<GameProvider>(context);

    return Material(
      color: Colors.transparent,
      child: Stack(
        children: [
          Opacity(opacity: 0.8, child: Container(color: Colors.black)),
          Container(
            child: Column(
              children: [
                Expanded(
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Shimmer.fromColors(
                        baseColor: Colors.orange,
                        highlightColor: Colors.yellow,
                        child: Text(
                          'Themes',
                          style: GoogleFonts.tomorrow(
                            color: Colors.red,
                            fontWeight: FontWeight.bold,
                            fontSize: 30,
                          ),
                        ),
                      ),
                      SizedBox(height: 20),
                      Center(
                        child: Container(
                          alignment: Alignment.center,
                          padding: EdgeInsets.symmetric(
                              horizontal: gameProvider.deviceSize.width / 4),
                          child: GridView.builder(
                              shrinkWrap: true,
                              itemCount: colors.length,
                              gridDelegate:
                                  SliverGridDelegateWithFixedCrossAxisCount(
                                crossAxisCount: 2,
                                crossAxisSpacing: 10,
                                mainAxisSpacing: 10,
                              ),
                              itemBuilder: (BuildContext context, index) {
                                return RaisedButton(
                                  padding: EdgeInsets.all(10),
                                  onPressed: () {
                                    onChangeTheme(colors[index]);
                                    Navigator.pop(context);
                                  },
                                  child: Opacity(
                                    opacity: 0.9,
                                    child: Container(
                                      decoration: BoxDecoration(
                                        shape: BoxShape.circle,
                                        color: getColor(colors[index]),
                                      ),
                                    ),
                                  ),
                                );
                              }),
                        ),
                      ),
                    ],
                  ),
                )
              ],
            ),
          ),
        ],
      ),
    );
  }
}
