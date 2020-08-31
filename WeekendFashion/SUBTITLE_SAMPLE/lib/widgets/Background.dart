import 'package:flutter/widgets.dart';

class Bacground extends StatelessWidget {
  final String image;
  const Bacground({
    @required this.image,
    Key key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      decoration: BoxDecoration(
        image: DecorationImage(
          image: AssetImage(this.image),
          fit: BoxFit.fitWidth,
        ),
      ),
    );
  }
}