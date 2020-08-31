import 'dart:math';

import 'note.dart';

const int totalNodes = 100000;
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

  return nodes;
  // return [
  //   Note(0, 0),
  //   Note(1, 1),
  //   Note(2, 2),
  //   Note(3, 1),
  //   Note(4, 3),
  //   Note(5, 0),
  //   Note(6, 1),
  //   Note(7, 2),
  //   Note(8, 3),
  //   Note(9, 2),
  //   Note(10, 3),
  //   Note(11, 0),
  //   Note(12, 2),
  //   Note(13, 1),
  //   Note(14, 3),
  //   Note(15, 0),
  //   Note(16, 1),
  //   Note(17, 2),
  //   Note(18, 3),
  //   Note(19, 2),
  //   Note(20, 3),
  //   Note(21, 1),
  //   Note(22, 2),
  //   Note(23, 1),
  //   Note(24, 3),
  //   Note(25, 0),
  //   Note(26, 1),
  //   Note(27, 2),
  //   Note(28, 3),
  //   Note(29, 2),
  //   Note(30, 3),
  //   Note(31, 1),
  //   Note(32, 2),
  //   Note(33, 1),
  //   Note(34, 3),
  //   Note(35, 0),
  //   Note(36, 1),
  //   Note(37, 2),
  //   Note(38, 3),
  //   Note(39, 2),
  //   Note(40, 3),
  //   Note(41, -1),
  //   Note(42, -1),
  //   Note(43, -1),
  //   Note(44, -1),
  // ];
}
