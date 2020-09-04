import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:shimmer/shimmer.dart';

class ImageButton extends StatelessWidget {
  const ImageButton({
    Key key,
    @required this.text,
    @required this.onPress,
    @required this.buttonColor,
    this.iconName,
  }) : super(key: key);

  final String text;
  final String buttonColor;
  final VoidCallback onPress;
  final String iconName;

  @override
  Widget build(BuildContext context) {
    String buttonName = 'button_$buttonColor';
    return Container(
      margin: EdgeInsets.symmetric(vertical: 10),
      child: GestureDetector(
        child: Stack(
          alignment: Alignment.center,
          children: [
            Center(
              child: Utils.getImage(
                buttonName,
                width: MediaQuery.of(context).size.width / 2,
              ),
            ),
            Center(
              child: Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  iconName == null
                      ? Container()
                      : Utils.getImage(iconName, width: 27),
                  SizedBox(width: 10),
                  Shimmer.fromColors(
                    baseColor: Colors.black,
                    highlightColor: Colors.yellow,
                    child: Text(
                      text,
                      style: GoogleFonts.tomorrow(
                        color: Colors.black,
                        fontSize: 23,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                  ),
                ],
              ),
            ),
          ],
        ),
        onTap: () {
          Utils.tapButtonSound();
          onPress();
        },
      ),
    );
  }
}
