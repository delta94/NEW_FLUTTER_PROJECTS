import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

class BackgroundWidget extends StatelessWidget {
  const BackgroundWidget({
    Key key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Opacity(
      opacity: 0.15,
      child: Container(
        // color: Colors.grey[200],
        decoration: new BoxDecoration(
          image: new DecorationImage(
            image: AssetImage('images/background.jpg'),
            fit: BoxFit.cover,
          ),
        ),
      ),
    );
  }
}
