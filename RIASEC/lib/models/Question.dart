import 'package:seab1ird.disctest/models/Types.dart';

class Question {
  int id;
  String text;
  Types type;
  bool checked;

  Question({this.id, this.text, this.type, this.checked});
  factory Question.newQuestion(
      {int id, String text, Types type, bool checked}) {
    return new Question(id: id, text: text, type: type, checked: false);
  }
}
