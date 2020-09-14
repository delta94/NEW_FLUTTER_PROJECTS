import 'package:com.seab1ird.showyourself/model_view/GameProvider.dart';
import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';
import 'package:shimmer/shimmer.dart';

// ignore: must_be_immutable
class Avatars extends StatelessWidget {
  final Function(String) onChangeAvatar;
  const Avatars({Key key, this.onChangeAvatar}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    List<String> avatars = [
      'cake_0_on',
      'cake_1_on',
      'cake_2_on',
      'cake_3_on',
      'cake_4_on',
      'pig_0_on',
      'pig_1_on',
      'pig_2_on',
      'pig_3_on',
      'pig_4_on',
      'kitty_normal_0_on',
      'kitty_normal_1_on',
      'kitty_normal_2_on',
      'kitty_normal_3_on',
      'kitty_normal_4_on',
      'kitty_smile_0_on',
      'kitty_smile_1_on',
      'kitty_smile_2_on',
      'kitty_smile_3_on',
      'kitty_smile_4_on',
      'kitty_tongue_0_on',
      'kitty_tongue_1_on',
      'kitty_tongue_2_on',
      'kitty_tongue_3_on',
      'kitty_tongue_4_on',
      'rabbit_normal_0_on',
      'rabbit_normal_1_on',
      'rabbit_normal_2_on',
      'rabbit_normal_3_on',
      'rabbit_normal_4_on',
      'rabbit_smile_0_on',
      'rabbit_smile_1_on',
      'rabbit_smile_2_on',
      'rabbit_smile_3_on',
      'rabbit_smile_4_on',
    ];

    GameProvider gameProvider = Provider.of<GameProvider>(context);

    return Material(
      color: Colors.transparent,
      child: Stack(
        children: [
          Opacity(opacity: 0.9, child: Container(color: Colors.black)),
          SingleChildScrollView(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Utils.getImage(gameProvider.chosenAvatar, width: Utils.isIpad() ? Utils.ipadIconSize() : 30),
                    SizedBox(width: 10),
                    Shimmer.fromColors(
                      baseColor: Colors.orange,
                      highlightColor: Colors.yellow,
                      child: Text(
                        'Avatars',
                        style: GoogleFonts.tomorrow(
                          color: Colors.red,
                          fontWeight: FontWeight.bold,
                          fontSize: Utils.isIpad() ? Utils.ipadFontSize() : 20,
                        ),
                      ),
                    ),
                  ],
                ),
                SizedBox(height: 10),
                Padding(
                  padding: EdgeInsets.symmetric(horizontal: (Utils.isIpad() ? (Utils.deviceSize.width/12) : 0)),
                  child: GridView.builder(
                      shrinkWrap: true,
                      itemCount: avatars.length,
                      gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                        crossAxisCount: 5,
                        crossAxisSpacing: 5,
                        mainAxisSpacing: 5,
                      ),
                      itemBuilder: (BuildContext context, index) {
                        return RaisedButton(
                          color: Colors.black,
                          padding: EdgeInsets.all(2),
                          onPressed: () {
                            Utils.winGameSound();
                            onChangeAvatar(avatars[index]);
                            Navigator.pop(context);
                          },
                          child: Container(
                            child: Utils.getImage(avatars[index]),
                          ),
                        );
                      }),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
