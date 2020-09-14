import 'package:com.seab1ird.showyourself/model_view/GameProvider.dart';
import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';
import 'package:shimmer/shimmer.dart';

class Rounds extends StatefulWidget {
  final int positionId;
  final bool showClick;

  const Rounds({Key key, this.positionId, this.showClick: false})
      : super(key: key);

  @override
  _CellWidgetState createState() => _CellWidgetState();
}

class _CellWidgetState extends State<Rounds> {
  @override
  Widget build(BuildContext context) {
    GameProvider gameProvider = Provider.of<GameProvider>(context);

    _isPlayable(int index) {
      return gameProvider.playableRoundNum >= index;
    }

    return Material(
      child: Stack(
        children: [
          Opacity(
            opacity: 1,
            child: Container(
              decoration: new BoxDecoration(
                image: new DecorationImage(
                  image: Utils.getBackground(gameProvider.themeColorName),
                  fit: BoxFit.fill,
                ),
              ),
            ),
          ),
          SingleChildScrollView(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Container(
                  color: Colors.transparent,
                  padding: EdgeInsets.symmetric(vertical: 10),
                  child: Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Utils.getImage('flag',
                          width: Utils.isIpad() ? Utils.ipadIconSize() : 30),
                      SizedBox(width: 20),
                      Center(
                        child: Shimmer.fromColors(
                          baseColor: Colors.orange,
                          highlightColor: Colors.yellow,
                          child: Text(
                            'Rounds',
                            textAlign: TextAlign.center,
                            style: GoogleFonts.tomorrow(
                              fontWeight: FontWeight.bold,
                              fontSize:
                                  Utils.isIpad() ? Utils.ipadFontSize() : 30,
                            ),
                          ),
                        ),
                      ),
                    ],
                  ),
                ),
                Center(
                  child: Container(
                    padding: EdgeInsets.symmetric(
                        horizontal:
                            Utils.isIpad() ? (Utils.deviceSize.width / 6) : 10,
                        vertical: 5),
                    child: GridView.builder(
                      physics: ScrollPhysics(),
                      shrinkWrap: true,
                      itemCount: 24,
                      gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                        crossAxisCount: 4,
                        crossAxisSpacing: 5,
                        mainAxisSpacing: 5,
                      ),
                      itemBuilder: (BuildContext context, int index) {
                        return ButtonTheme(
                          child: Material(
                            color: Colors.transparent,
                            child: InkWell(
                              onTap: _isPlayable(index)
                                  ? () {
                                      Utils.tapButtonSound();
                                      gameProvider.currRoundNum = index;
                                      gameProvider.newGame();
                                      Navigator.of(context)
                                          .popAndPushNamed('/game');
                                    }
                                  : null,
                              child: Container(
                                decoration: BoxDecoration(
                                  color: _isPlayable(index)
                                      ? Color.fromRGBO(101, 225, 44, 1)
                                      : Colors.grey,
                                  borderRadius: BorderRadius.circular(15),
                                  gradient: _isPlayable(index)
                                      ? LinearGradient(
                                          begin: Alignment.topRight,
                                          end: Alignment.bottomLeft,
                                          colors: [
                                              Colors.cyan,
                                              Color.fromRGBO(101, 225, 44, 1)
                                            ])
                                      : null,
                                ),
                                padding: const EdgeInsets.all(8),
                                child: Stack(
                                  children: [
                                    Center(
                                      child: Visibility(
                                        visible: !_isPlayable(index),
                                        child: Opacity(
                                            opacity: 0.3,
                                            child:
                                                Utils.getImage('clocl_block')),
                                      ),
                                    ),
                                    Center(
                                      child: Container(
                                        margin: EdgeInsets.only(
                                            top: _isPlayable(index)
                                                ? 0
                                                : Utils.isIpad() ? 50 : 25),
                                        color: _isPlayable(index)
                                            ? Colors.transparent
                                            : Colors.grey,
                                        child: Text(
                                          (index + 1).toString(),
                                          style: GoogleFonts.tomorrow(
                                            fontWeight: FontWeight.bold,
                                            color: _isPlayable(index)
                                                ? Colors.black
                                                : Colors.black,
                                            fontSize: Utils.isIpad()
                                                ? Utils.ipadIconSize()
                                                : 20,
                                          ),
                                        ),
                                      ),
                                    ),
                                  ],
                                ),
                              ),
                            ),
                          ),
                        );
                      },
                    ),
                  ),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
