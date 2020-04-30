import 'UserAnswer.dart';

class UserChoice {
  final int questionId;
  final UserAnswer userAnswer;

  UserChoice(this.questionId, this.userAnswer);

  @override
  String toString() {
    return 'UserChoice: questionId: $questionId, userAnswer: ' + userAnswer.toString();
  }
}
