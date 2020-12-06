import 'package:flutter/material.dart';
import 'package:seab1ird.letitgo/helpers/Helper.dart';
import 'package:seab1ird.letitgo/models/Note.dart';

class Tile extends StatelessWidget {
  final NoteState state;
  final double height;
  final VoidCallback onTap;

  const Tile({Key key, this.height, this.state, this.onTap}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTapDown: (_) => onTap(),
      child: Container(
        decoration: BoxDecoration(
          borderRadius: BorderRadius.circular(10),
        ),
        child: Opacity(opacity: opacity, child: Helpers.getImage(image)),
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
        return 'tile';
      case NoteState.missed:
        return 'disabled_tile';
      default:
        return 'tile';
    }
  }
}
