import 'package:seab1ird.disctest/models/Answer.dart';

class QuestionInfo {
  final String prefixQuestion;
  final String suffixWords;
  final List<Answer> answers;

  QuestionInfo(this.prefixQuestion, this.suffixWords, this.answers);
}
