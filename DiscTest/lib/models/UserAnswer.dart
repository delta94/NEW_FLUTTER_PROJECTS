import 'Types.dart';

class UserAnswer {
  Types likeMost;
  Types likeLeast;

  UserAnswer(this.likeMost, this.likeLeast);

  @override
  String toString() {
    return 'UserAnswer: ' + 'likeMost: ' + likeMost.toString() + ', likeLeast: ' + likeLeast.toString();
  }
}