import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

class AnimatedButton extends StatefulWidget {
  final String image;
  final double width;
  final VoidCallback callback;

  AnimatedButton({this.image, this.width, this.callback});

  @override
  _AnimatedButtonState createState() => _AnimatedButtonState();
}

class _AnimatedButtonState extends State<AnimatedButton> {
  bool toggle = false;
  onPress() {
    setState(() {
      toggle = true;
    });

    Timer(Duration(milliseconds: 200), () {
      setState(() {
        toggle = false;
        widget.callback();
      });
    });
  }

  @override
  Widget build(BuildContext context) {
    return Material(
      color: Colors.transparent,
      child: InkWell(
        onTap: () => onPress(),
        child: Image.asset(
          widget.image,
          width: toggle ? widget.width * 1.2 : widget.width,
        ),
      ),
    );
  }
}
