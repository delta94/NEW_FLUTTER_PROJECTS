import 'package:flutter/widgets.dart';

class BackgroundWidget extends StatelessWidget {
  const BackgroundWidget({
    Key key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      decoration: new BoxDecoration(
        image: new DecorationImage(
          image: new AssetImage('images/bg.png'),
          fit: BoxFit.cover,
        ),
      ),
    );
  }
}