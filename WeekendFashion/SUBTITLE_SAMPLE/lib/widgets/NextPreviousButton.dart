import 'dart:io';

import 'package:assets_audio_player/assets_audio_player.dart';
import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.weekendfashion/helpers/EndlessController.dart';
import 'package:seabird.weekendfashion/helpers/GameProvider.dart';

class NextPreviousButton extends StatelessWidget {
  const NextPreviousButton(
      {Key key,
      @required this.isNext,
      @required this.controller,
      @required this.voidCallback})
      : super(key: key);

  final bool isNext;
  final EndlessController controller;
  final VoidCallback voidCallback;

  @override
  Widget build(BuildContext context) {
    final changingItemTypeAudio = AssetsAudioPlayer();
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);
    return Positioned(
      left: gameProvider.currentGirlIndex == 1
          ? gameProvider.deviceSize.width * (0.1 + (isNext ? 0.15 : 0))
          : null,
      right: gameProvider.currentGirlIndex == 0
          ? gameProvider.deviceSize.width * (0.3 - (isNext ? 0.15 : 0))
          : null,
      bottom: 10,
      height: gameProvider.deviceSize.height * 0.2,
      width: gameProvider.deviceSize.height * 0.4,
      child: Container(
        child: FlatButton(
          color: Colors.transparent,
          onPressed: () {
            changingItemTypeAudio.open(Audio('sounds/change_item_type.ogg'));
            gameProvider.changingItemTypeIndex = 5;
            voidCallback();
          },
          child: FlareActor(
            isNext
                ? "images/next_item_list.flr"
                : "images/previous_item_list.flr",
            controller: controller,
          ),
        ),
      ),
    );
  }
}
