import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

Future<DateTime> showGameDialog({
  @required BuildContext context,
  bool barrierDismissible = false,
  Widget widget,
}) async {
  return await showDialog(
    context: context,
    builder: (_) => GestureDetector(
      onTap: () {
        if (!barrierDismissible) {
          Navigator.pop(context);
        }
      },
      child: widget,
    ),
  );
}

Future showDialog({
  @required BuildContext context,
  WidgetBuilder builder,
}) {
  return showGeneralDialog(
    context: context,
    pageBuilder: (BuildContext buildContext, Animation<double> animation,
        Animation<double> secondaryAnimation) {
      return SafeArea(
        child: Builder(builder: builder),
      );
    },
    barrierDismissible: true,
    barrierLabel: MaterialLocalizations.of(context).modalBarrierDismissLabel,
    transitionDuration: const Duration(milliseconds: 150),
  );
}
