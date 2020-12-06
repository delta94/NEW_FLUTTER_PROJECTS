import 'dart:math';

import 'package:firebase_admob/firebase_admob.dart';
import 'package:flutter/cupertino.dart';
import 'package:shared_preferences/shared_preferences.dart';

import 'helpers/AdHelpers.dart';
import 'models/Note.dart';

const int totalNodes = 1000;

class SongProvider extends ChangeNotifier {
  bool isFirstUse = true;
  bool admobLoaded = true;

  Future<void> init() async {
    var prefs = await SharedPreferences.getInstance();
    isFirstUse = prefs.getBool('isFirstUse') ?? true;
  }

  List<Note> initNotes() {
    List<Note> nodes = [];
    Random random = new Random();
    nodes.add(Note(0, 0));
    for (int i = 1; i < totalNodes; i++) {
      int randomNumber = random.nextInt(4);
      if (randomNumber == nodes[nodes.length - 1].line) {
        if (randomNumber == 3)
          randomNumber--;
        else
          randomNumber++;
      }

      nodes.add(Note(i, randomNumber));
    }

    print('NODE LEN: ${nodes.length}');
    return nodes;
  }

  void updateAdState(MobileAdEvent mobileAdEvent) {
    admobLoaded = AdHelpers.isAdmobBannerLoaded(mobileAdEvent);
    notifyListeners();
  }
}
