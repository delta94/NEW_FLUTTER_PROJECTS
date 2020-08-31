import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

class ImageButton extends StatelessWidget {
  const ImageButton({
    Key key,
    @required this.text,
    @required this.onPress,
    this.buttonColor,
  }) : super(key: key);

  final String text;
  final String buttonColor;
  final VoidCallback onPress;

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
              child: Text(
                text,
                style: TextStyle(
                  color: Colors.black,
                  fontSize: 25,
                  fontWeight: FontWeight.bold,
                ),
              ),
            ),
          ],
        ),
        onTap: () => onPress(),
      ),
    );
  }
}
