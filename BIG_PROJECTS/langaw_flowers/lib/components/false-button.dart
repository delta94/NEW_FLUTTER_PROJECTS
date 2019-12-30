import 'dart:ui';
import 'package:flame/sprite.dart';
import 'package:langaw/bgm.dart';
import 'package:langaw/langaw-controller.dart';
import 'package:langaw/view.dart';

class FalseButton {
  final LangawGame game;
  Rect rect;
  Sprite sprite;

  FalseButton(this.game) {
    resize();
    sprite = Sprite('buttons/false_button.png');
  }

  void render(Canvas c) {
    sprite.renderRect(c, rect);
  }

  void update(double t) {}

  void resize() {
    rect = Rect.fromLTWH(
      game.tileSize * 0.3,
      game.screenSize.height * .8,
      game.tileSize * 2.5,
      game.tileSize * 2.5,
    );
  }

  void onTapDown() {
    game.score = 0;
    game.activeView = View.playing;
    game.spawner.start();
    BGM.play(BGMType.playing);
  }
}
