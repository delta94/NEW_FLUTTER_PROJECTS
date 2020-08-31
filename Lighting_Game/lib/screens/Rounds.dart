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
      child: SafeArea(
        child: Stack(
          children: [
            Opacity(
              opacity: 1,
              child: Container(
                decoration: new BoxDecoration(
                  image: new DecorationImage(
                    image: new AssetImage('asset/images/bg_blue.png'),
                    fit: BoxFit.fill,
                  ),
                ),
              ),
            ),
            SingleChildScrollView(
              child: Column(
                children: [
                  Container(
                    color: Colors.transparent,
                    padding: EdgeInsets.symmetric(vertical: 10),
                    child: Row(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        Utils.getImage('flag', width: 30),
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
                                fontSize: 30,
                              ),
                            ),
                          ),
                        ),
                      ],
                    ),
                  ),
                  Container(
                    padding: EdgeInsets.symmetric(horizontal: 10, vertical: 5),
                    child: GridView.builder(
                      shrinkWrap: true,
                      itemCount: 24,
                      gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                        crossAxisCount: 4,
                        crossAxisSpacing: 10,
                        mainAxisSpacing: 10,
                      ),
                      itemBuilder: (BuildContext context, int index) {
                        return ButtonTheme(
                          child: Material(
                            color: Colors.transparent,
                            child: InkWell(
                              onTap: _isPlayable(index)
                                  ? () {
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
                                ),
                                padding: const EdgeInsets.all(8),
                                child: Stack(
                                  children: [
                                    Center(
                                      child: Visibility(
                                        visible: !_isPlayable(index),
                                        child: Utils.getImage('clocl_block'),
                                      ),
                                    ),
                                    Center(
                                      child: Text(
                                        (index + 1).toString(),
                                        style: TextStyle(
                                          fontWeight: _isPlayable(index)
                                              ? FontWeight.bold
                                              : FontWeight.normal,
                                          fontSize: 20,
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
                  SizedBox(height: 40)
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
