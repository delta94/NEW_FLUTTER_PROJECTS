import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:percent_indicator/linear_percent_indicator.dart';
import 'package:provider/provider.dart';
import 'package:seabird.disctest/AppProvider.dart';
import 'package:seabird.disctest/data/Questions.dart';
import 'package:seabird.disctest/widgets/AdBannerTemplate.dart';
import 'package:seabird.disctest/widgets/BackgroundWidget.dart';
import 'package:seabird.disctest/helpers/EndLoopController.dart';
import 'package:seabird.disctest/helpers/Helpers.dart';
import 'package:seabird.disctest/models/RadioModel.dart';
import 'package:seabird.disctest/models/Types.dart';
import 'package:seabird.disctest/models/UserAnswer.dart';
import 'package:seabird.disctest/models/UserChoice.dart';

import '../widgets/OptionItem.dart';

// ignore: must_be_immutable
class TestScreen extends StatelessWidget {
  int questionId;
  double percent = 50;
  AppProvider appProvider;

  validateAndRoute(BuildContext context, int questionId,
      List<RadioModel> answers1, List<RadioModel> answers2) {
    Helpers.tapButtonSound();
    List<bool> isValidAnswersList = [true, true];
    isValidAnswersList[0] = answers1.any((answer) => answer.isSelected);
    isValidAnswersList[1] = answers2.any((answer) => answer.isSelected);

    if (isValidAnswersList[0] && isValidAnswersList[1]) {
      appProvider.radioModelsList.clear();
      if (questionId < questions.length - 1) {
        Navigator.pushNamed(context, '/test',
            arguments: (questionId + 1).toString());
      } else {
        Navigator.pushNamed(context, '/result');
      }
    } else {
      AppProvider appProvider =
          Provider.of<AppProvider>(context, listen: false);
      appProvider.setHighlightQuestions(
          !isValidAnswersList[0], !isValidAnswersList[1]);
    }
  }

  Widget build(BuildContext context) {
    appProvider = Provider.of<AppProvider>(context, listen: false);
    final String args = ModalRoute.of(context).settings.arguments;
    final EndLoopController _logoLoopController =
        EndLoopController('Untitled', 10);
    final EndLoopController _resultLoopController =
        EndLoopController('Untitled', 4);
    int questionIdNum = int.parse(args);

    questionId = questionIdNum;
    percent = (questionId + 1) / questions.length;

    if (appProvider.radioModelsList.isEmpty)
      Helpers.setAnswersList(
          appProvider.radioModelsList, questionId, appProvider);

    return Scaffold(
      appBar: AppBar(
        title:
            Row(mainAxisAlignment: MainAxisAlignment.center, children: <Widget>[
          Container(
              width: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.8 : 28,
              height: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.8 : 28,
              child: FlareActor(
                "images/disc.flr",
                alignment: Alignment.center,
                controller: _logoLoopController,
              )),
          SizedBox(width: 5),
          Text(
            'Question ' + (questionId + 1).toString(),
            style: TextStyle(
              fontWeight: FontWeight.bold,
              fontSize: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.6 : 18,
            ),
          ),
          SizedBox(width: 40),
        ]),
        iconTheme: new IconThemeData(color: Colors.yellowAccent),
        backgroundColor: Colors.black87,
        actions: <Widget>[
          questionId < questions.length - 1
              ? IconButton(
                  iconSize: Helpers.isIpad() ? Helpers.ipadIconSize() : 24,
                  icon: CircleAvatar(
                      radius: 30,
                      backgroundColor: Colors.lightGreen,
                      child: Icon(
                        Icons.arrow_forward,
                        color: Colors.black,
                      )),
                  onPressed: () => validateAndRoute(
                      context,
                      questionId,
                      appProvider.radioModelsList[0],
                      appProvider.radioModelsList[1]),
                )
              : InkWell(
                  onTap: () => validateAndRoute(
                      context,
                      questionId,
                      appProvider.radioModelsList[0],
                      appProvider.radioModelsList[1]),
                  child: Container(
                    width: 60,
                    height: 60,
                    child: FlareActor(
                      "images/result.flr",
                      alignment: Alignment.center,
                      controller: _resultLoopController,
                    ),
                  ),
                ),
        ],
      ),
      body: Stack(
        children: <Widget>[
          BackgroundWidget(),
          AdBannerTemplate(
            child: Column(
              children: <Widget>[
                SizedBox(height: Helpers.isIpad() ? 20 : 5),
                Row(
                  children: <Widget>[
                    Expanded(
                      child: LinearPercentIndicator(
                        lineHeight: 15,
                        animation: true,
                        animateFromLastPercent: true,
                        animationDuration: 500,
                        percent: percent,
                        center: Text('${(percent * 100).toStringAsFixed(1)}%'),
                        progressColor: Color.fromRGBO(0, 200, 0, 1),
                        backgroundColor: Colors.grey,
                      ),
                    ),
                  ],
                ),
                SizedBox(height: Helpers.isIpad() ? 20 : 5),
                Expanded(child: Scrollbar(child: Body(questionId: questionId))),
              ],
            ),
          ),
        ],
      ),
    );
  }
}

class Body extends StatefulWidget {
  const Body({Key key, this.questionId}) : super(key: key);

  final int questionId;

  @override
  _BodyState createState() => _BodyState();
}

class _BodyState extends State<Body> {
  List<String> questionSentencesList = new List<String>();

  @override
  Widget build(BuildContext context) {
    AppProvider appProvider = Provider.of<AppProvider>(context);
    Helpers.setQuestionSentencesList(questionSentencesList, widget.questionId);

    void addUserChoice(
        int questionOrder, int answerId, List<UserChoice> savedUserChoices) {
      Types likeMost;
      Types likeLeast;

      if (questionOrder == 0) {
        likeMost = questions[widget.questionId].answers[answerId].type;
      } else {
        likeLeast = questions[widget.questionId].answers[answerId].type;
      }

      savedUserChoices.add(new UserChoice(
          widget.questionId, new UserAnswer(likeMost, likeLeast)));
    }

    int getOppositeQuestionOrder(int currentQestionOrder) {
      if (currentQestionOrder == 0) return 1;
      return 0;
    }

    void tapOnAnswerRadio(int questionOrder, int answerId) {
      AppProvider appProvider =
          Provider.of<AppProvider>(context, listen: false);

      List<UserChoice> savedUserChoices = appProvider.userChoices;
      bool isUserChoiceExisting = false;
      if (savedUserChoices.isEmpty) {
        addUserChoice(questionOrder, answerId, savedUserChoices);
      } else {
        for (var i = 0; i < savedUserChoices.length; i++) {
          if (savedUserChoices[i].questionId == widget.questionId) {
            isUserChoiceExisting = true;
            if (questionOrder == 0) {
              savedUserChoices[i].userAnswer.likeMost =
                  questions[widget.questionId].answers[answerId].type;
            } else {
              savedUserChoices[i].userAnswer.likeLeast =
                  questions[widget.questionId].answers[answerId].type;
            }
          }
        }

        if (!isUserChoiceExisting) {
          addUserChoice(questionOrder, answerId, savedUserChoices);
        }
      }

      setState(() {
        appProvider.radioModelsList[questionOrder]
            .forEach((answer) => answer.isSelected = false);
        appProvider.radioModelsList[questionOrder][answerId].isSelected = true;
      });

      int oppositeQuestionOrder = getOppositeQuestionOrder(questionOrder);
      if (appProvider
          .radioModelsList[oppositeQuestionOrder][answerId].isSelected) {
        appProvider.updateAnswer(oppositeQuestionOrder, answerId);
      }
    }

    SingleChildScrollView _getListQuestionAnswers() {
      List<Widget> questionAnswers = new List<Widget>();
      questionAnswers.add(Text(
        questionSentencesList[0],
        style: TextStyle(
            decoration: TextDecoration.underline,
            decorationColor: Colors.black,
            // backgroundColor: Colors.black,
            color: Color.fromRGBO(0, 128, 0, 1),
            fontWeight: FontWeight.bold,
            fontSize: Helpers.isIpad() ? Helpers.ipadIconSize() / 2 : 18),
      ));

      questionAnswers.add(SizedBox(height: 7));

      // List Like Most Answers
      for (var i = 0; i < 4; i++) {
        questionAnswers.add(
          OptionItem(
            isHightLight: appProvider.needFirstQuestionHighLight,
            questionId: widget.questionId,
            answerId: i,
            isLikeMost: true,
            radioModelsList: appProvider.radioModelsList[0],
            onTap: () => tapOnAnswerRadio(0, i),
          ),
        );
      }

      questionAnswers.add(SizedBox(height: 10));

      questionAnswers.add(Text(
        questionSentencesList[1],
        style: TextStyle(
            decoration: TextDecoration.underline,
            decorationColor: Colors.black,
            // backgroundColor: Colors.black,
            color: Colors.deepOrange.withOpacity(0.9),
            fontWeight: FontWeight.bold,
            fontSize: Helpers.isIpad() ? Helpers.ipadIconSize() / 2 : 18),
      ));

      // List Least Most Answers
      for (var i = 0; i < 4; i++) {
        questionAnswers.add(OptionItem(
            isHightLight: appProvider.needSecondQuestionHighLight,
            questionId: widget.questionId,
            answerId: i,
            isLikeMost: false,
            radioModelsList: appProvider.radioModelsList[1],
            onTap: () => tapOnAnswerRadio(1, i)));
      }

      return SingleChildScrollView(
        child: Container(
          padding: EdgeInsets.symmetric(vertical: 10),
          child: Column(
              mainAxisAlignment: MainAxisAlignment.spaceAround,
              crossAxisAlignment: CrossAxisAlignment.start,
              children: questionAnswers),
        ),
      );
    }

    return _getListQuestionAnswers();
  }
}
