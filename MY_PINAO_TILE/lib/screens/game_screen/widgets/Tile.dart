import 'package:flutter/material.dart';
import 'package:seab1ird.letitgo/helpers/ResponsiveHelper.dart';
import 'package:seab1ird.letitgo/models/Note.dart';

class Tile extends StatelessWidget {
  final NoteState state;
  final double height;
  final int tileIndex;
  final VoidCallback onTap;

  const Tile({Key key, this.height, this.state, this.onTap, this.tileIndex})
      : super(key: key);

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTapDown: (_) => onTap(),
      child: Container(
        height: ResponsiveHelper.deviceSize.height / 4,
        alignment: Alignment.topCenter,
        decoration: BoxDecoration(borderRadius: BorderRadius.circular(10)),
        child: Opacity(
          opacity:
              state == NoteState.ready || state == NoteState.missed ? 1 : 0.4,
          child: Image.asset(
            'assets/images/$image.png',
            height: ResponsiveHelper.deviceSize.height / (isIpad ? 3 : 4),
          ),
        ),
      ),
    );
  }

  double get opacity {
    switch (state) {
      case NoteState.ready:
        return 1;
      case NoteState.tapped:
        return 0;
      default:
        return 1;
    }
  }

  String get image {
    switch (state) {
      case NoteState.ready:
        return 'tile$tileIndex';
      case NoteState.missed:
        return 'disabled_tile';
      default:
        return 'tile$tileIndex';
    }
  }
}
