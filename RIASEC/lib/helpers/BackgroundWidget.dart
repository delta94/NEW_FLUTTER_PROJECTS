import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.disctest/QuestionProvider.dart';

class BackgroundWidget extends StatelessWidget {
  const BackgroundWidget({
    Key key,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    QuestionProvider questionProvider = Provider.of<QuestionProvider>(context);
    return Container(
      decoration: new BoxDecoration(
        image: new DecorationImage(
          image: AssetImage('images/bg_${questionProvider.themeColorName}.png'),
          fit: BoxFit.cover,
        ),
      ),
    );
  }
}
