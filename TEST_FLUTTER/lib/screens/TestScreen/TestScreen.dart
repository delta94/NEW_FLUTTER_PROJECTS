import 'dart:async';

import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:percent_indicator/linear_percent_indicator.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.disctest/QuestionProvider.dart';
import 'package:seab1ird.disctest/data/Questions.dart';
import 'package:seab1ird.disctest/helpers/Ads.dart';
import 'package:seab1ird.disctest/helpers/BackgroundWidget.dart';
import 'package:seab1ird.disctest/helpers/EndLoopController.dart';
import 'package:seab1ird.disctest/helpers/Helpers.dart';
import 'package:seab1ird.disctest/models/RadioModel.dart';
import 'package:seab1ird.disctest/models/Types.dart';
import 'package:seab1ird.disctest/models/UserAnswer.dart';
import 'package:seab1ird.disctest/models/UserChoice.dart';

import 'OptionItem.dart';

class TestScreen extends StatefulWidget {
  @override
  _TestScreenState createState() => _TestScreenState();
}

class _TestScreenState extends State<TestScreen> {
  int questionId;
  double marginTop = 0;
  List<String> questionSentencesList = new List<String>();
  List<bool> isHightLightAnswersList = [false, false];
  double percent = 50;
  List<List<RadioModel>> radioModelsList = new List<List<RadioModel>>();

  validateAndRoute(BuildContext context, int questionId,
      List<RadioModel> answers1, List<RadioModel> answers2) {
    List<bool> isValidAnswersList = [true, true];
    isValidAnswersList[0] = answers1.any((answer) => answer.isSelected);
    isValidAnswersList[1] = answers2.any((answer) => answer.isSelected);

    if (isValidAnswersList[0] && isValidAnswersList[1]) {
      if (questionId < questions.length - 1) {
        Navigator.pushNamed(context, '/test',
            arguments: (questionId + 1).toString());
      } else {
        Navigator.pushNamed(context, '/result');
      }
    } else {
      setState(() {
        isHightLightAnswersList[0] = !isValidAnswersList[0];
        isHightLightAnswersList[1] = !isValidAnswersList[1];
      });

      new Timer(const Duration(milliseconds: 300), () {
        setState(() {
          isHightLightAnswersList[0] = false;
          isHightLightAnswersList[1] = false;
        });
      });
    }
  }

  void tapOnAnswerRadio(int questionOrder, int answerId) {
    QuestionProvider questionProvider =
        Provider.of<QuestionProvider>(context, listen: false);

    List<UserChoice> savedUserChoices = questionProvider.userChoices;
    bool isUserChoiceExisting = false;
    if (savedUserChoices.length == 0) {
      addUserChoice(questionOrder, answerId, savedUserChoices);
    } else {
      for (var i = 0; i < savedUserChoices.length; i++) {
        if (savedUserChoices[i].questionId == questionId) {
          isUserChoiceExisting = true;
          if (questionOrder == 0) {
            savedUserChoices[i].userAnswer.likeMost =
                questions[questionId].answers[answerId].type;
          } else {
            savedUserChoices[i].userAnswer.likeLeast =
                questions[questionId].answers[answerId].type;
          }
        }
      }

      if (!isUserChoiceExisting) {
        addUserChoice(questionOrder, answerId, savedUserChoices);
      }
    }

    setState(() {
      this
          .radioModelsList[questionOrder]
          .forEach((answer) => answer.isSelected = false);
      this.radioModelsList[questionOrder][answerId].isSelected = true;
    });

    int oppositeQuestionOrder = getOppositeQuestionOrder(questionOrder);
    if (this.radioModelsList[oppositeQuestionOrder][answerId].isSelected ==
        true) {
      setState(() {
        this.radioModelsList[oppositeQuestionOrder][answerId].isSelected =
            false;
        isHightLightAnswersList[oppositeQuestionOrder] = true;
      });

      new Timer(const Duration(milliseconds: 300), () {
        setState(() {
          isHightLightAnswersList[oppositeQuestionOrder] = false;
        });
      });
    }
  }

  void addUserChoice(
      int questionOrder, int answerId, List<UserChoice> savedUserChoices) {
    Types likeMost;
    Types likeLeast;

    if (questionOrder == 0) {
      likeMost = questions[questionId].answers[answerId].type;
    } else {
      likeLeast = questions[questionId].answers[answerId].type;
    }

    savedUserChoices
        .add(new UserChoice(questionId, new UserAnswer(likeMost, likeLeast)));
  }

  int getOppositeQuestionOrder(int currentQestionOrder) {
    if (currentQestionOrder == 0) return 1;
    return 0;
  }

  ListView _getListQuestionAnswers() {
    List<Widget> questionAnswers = new List<Widget>();
    questionAnswers.add(Text(
      questionSentencesList[0],
      style: TextStyle(
          decoration: TextDecoration.underline,
          decorationColor: Colors.black,
          backgroundColor: Colors.black,
          color: Colors.greenAccent,
          fontWeight: FontWeight.bold,
          fontSize: 16),
    ));

    questionAnswers.add(SizedBox(height: 7));

    // List Like Most Answers
    for (var i = 0; i < 4; i++) {
      questionAnswers.add(OptionItem(
          isHightLight: isHightLightAnswersList[0],
          questionId: questionId,
          answerId: i,
          isLikeMost: true,
          radioModelsList: radioModelsList[0],
          onTap: () => tapOnAnswerRadio(0, i)));
    }

    questionAnswers.add(SizedBox(height: 10));

    questionAnswers.add(Text(
      questionSentencesList[1],
      style: TextStyle(
          decoration: TextDecoration.underline,
          decorationColor: Colors.black,
          backgroundColor: Colors.black,
          color: Colors.red,
          fontWeight: FontWeight.bold,
          fontSize: 16),
    ));

    // List Least Most Answers
    for (var i = 0; i < 4; i++) {
      questionAnswers.add(OptionItem(
          isHightLight: isHightLightAnswersList[1],
          questionId: questionId,
          answerId: i,
          isLikeMost: false,
          radioModelsList: radioModelsList[1],
          onTap: () => tapOnAnswerRadio(1, i)));
    }

    return new ListView(children: questionAnswers);
  }

  @override
  void initState(){
    if(Ads.isReleaseMode()){ // is Release Mode ??
      marginTop = 60;
    }

    super.initState();
  }

  Widget build(BuildContext context) {
    QuestionProvider questionProvider =
        Provider.of<QuestionProvider>(context, listen: false);
    final String args = ModalRoute.of(context).settings.arguments;
    final EndLoopController _logoLoopController =
        EndLoopController('Untitled', 10);
    final EndLoopController _resultLoopController =
        EndLoopController('Untitled', 4);
    int questionIdNum = int.parse(args);


    setState(() {
      questionId = questionIdNum;
      percent = (questionId + 1) / questions.length;
    });

    Helpers.setAnswersList(radioModelsList, questionId, questionProvider);
    Helpers.setQuestionSentencesList(questionSentencesList, questionId);

    return Scaffold(
      appBar: AppBar(
        title:
            Row(mainAxisAlignment: MainAxisAlignment.center, children: <Widget>[
          Container(
              width: 30,
              height: 30,
              child: FlareActor(
                "images/disc.flr",
                alignment: Alignment.center,
                controller: _logoLoopController,
              )),
          SizedBox(
            width: 10,
          ),
          Text('Question ' + (questionId + 1).toString()),
          SizedBox(
            width: 40,
          ),
        ]),
        iconTheme: new IconThemeData(color: Colors.yellowAccent),
        backgroundColor: Colors.black87,
        actions: <Widget>[
          questionId < questions.length - 1
              ? IconButton(
                  icon: CircleAvatar(
                      radius: 30,
                      backgroundColor: Colors.red,
                      child: Icon(Icons.arrow_forward)),
                  onPressed: () => validateAndRoute(context, questionId,
                      radioModelsList[0], radioModelsList[1]),
                )
              : InkWell(
                  onTap: () => validateAndRoute(context, questionId,
                      radioModelsList[0], radioModelsList[1]),
                  child: Container(
                    width: 70,
                    height: 70,
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
          Container(
            margin: EdgeInsets.only(top: marginTop),
            padding: EdgeInsets.only(left: 5, right: 5),
            child: Column(
              children: <Widget>[
                Row(
                  children: <Widget>[
                    Expanded(
                      child: LinearPercentIndicator(
                        lineHeight: 8.0,
                        animation: true,
                        animateFromLastPercent: true,
                        animationDuration: 500,
                        percent: percent,
                        progressColor: Colors.lightGreenAccent,
                        backgroundColor: Colors.white24,
                      ),
                    ),
                  ],
                ),
                SizedBox(height: 20),
                Expanded(
                  child: Scrollbar(
                    child: _getListQuestionAnswers(),
                  ),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}

