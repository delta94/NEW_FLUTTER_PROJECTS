import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

import 'package:seab1ird.letitgo/helpers/Helper.dart';
import 'package:seab1ird.letitgo/widgets/animated_background/AnimatedBackground.dart';
import 'package:seab1ird.letitgo/widgets/animated_background/Lines.dart';
import 'package:seab1ird.letitgo/widgets/animated_background/Space.dart';
import 'package:seab1ird.letitgo/widgets/animated_background/behaviors/Behavior.dart';
import 'package:seab1ird.letitgo/widgets/animated_background/behaviors/ParticleOptions.dart';
import 'package:seab1ird.letitgo/widgets/animated_background/behaviors/RacingLinesBehaviour.dart';
import 'package:seab1ird.letitgo/widgets/animated_background/behaviors/RainParticleBehaviour.dart';
import 'package:seab1ird.letitgo/widgets/animated_background/behaviors/RandomParticleBehaviour.dart';

List<List<Image>> animatedImages = [
  [
    Helpers.getImage('petal0'),
    Helpers.getImage('petal1'),
    Helpers.getImage('petal2'),
    Helpers.getImage('petal3'),
  ],
  [
    Helpers.getImage('heart0'),
    Helpers.getImage('heart1'),
    Helpers.getImage('heart2'),
    Helpers.getImage('heart3'),
  ],
  [
    Helpers.getImage('flower0'),
    Helpers.getImage('flower1'),
    Helpers.getImage('flower2'),
  ],
  [
    Helpers.getImage('leaf0'),
    Helpers.getImage('leaf1'),
    Helpers.getImage('leaf2'),
    Helpers.getImage('leaf3'),
    Helpers.getImage('leaf4'),
    Helpers.getImage('leaf5'),
  ],
  [Helpers.getImage('soap_bubble')]
];

class CustomAnimatedBg extends StatefulWidget {
  CustomAnimatedBg(
      {Key key, this.title, this.animatedIndex, this.animatedItemIndex})
      : super(key: key);

  final String title;
  final int animatedIndex;
  final int animatedItemIndex;

  @override
  _CustomAnimatedBgState createState() => new _CustomAnimatedBgState();
}

class _CustomAnimatedBgState extends State<CustomAnimatedBg>
    with TickerProviderStateMixin {
  ParticleOptions particleOptions = ParticleOptions(
    images: animatedImages[0],
    baseColor: Colors.blue,
    spawnOpacity: 0.0,
    opacityChangeRate: 0.25,
    minOpacity: 0.1,
    maxOpacity: 1,
    spawnMinSpeed: 100.0,
    spawnMaxSpeed: 200.0,
    spawnMinRadius: 7.0,
    spawnMaxRadius: 15.0,
    particleCount: 50,
  );

  var particlePaint = Paint()
    ..style = PaintingStyle.stroke
    ..strokeWidth = 1.0;

  // Lines

  var _lineDirection = LineDirection.Ttb;
  int _lineCount = 50;

  bool _showSettings = false;

  @override
  Widget build(BuildContext context) {
    return AnimatedBackground(
      behaviour: _buildBehaviour(),
      vsync: this,
      child: SingleChildScrollView(
        child: Padding(
          padding: const EdgeInsets.all(16.0),
          child: Container(),
        ),
      ),
    );
  }

  Behaviour _buildBehaviour() {
    particleOptions = particleOptions.copyWith(
        images: animatedImages[widget.animatedItemIndex]);
    switch (widget.animatedIndex) {
      case 0:
        return RandomParticleBehaviour(
          options: particleOptions,
          paint: particlePaint,
        );
      case 1:
        return RainParticleBehaviour(
          options: particleOptions,
          paint: particlePaint,
          enabled: !_showSettings,
        );
      case 2:
        return RacingLinesBehaviour(
          direction: _lineDirection,
          numLines: _lineCount,
        );
      case 3:
        return SpaceBehaviour();
    }

    return RandomParticleBehaviour(
      options: particleOptions,
      paint: particlePaint,
    );
  }
}
