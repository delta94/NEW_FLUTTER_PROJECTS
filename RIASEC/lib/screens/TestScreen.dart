import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:percent_indicator/linear_percent_indicator.dart';
import 'package:seab1ird.disctest/helpers/Ads.dart';
import 'package:seab1ird.disctest/helpers/BackgroundWidget.dart';
import 'package:seab1ird.disctest/helpers/FlareEndlessController.dart';
import 'package:seab1ird.disctest/helpers/Helpers.dart';
import 'package:seab1ird.disctest/models/Question.dart';
import 'package:seab1ird.disctest/widgets/OptionItem.dart';

class TestScreen extends StatefulWidget {
  @override
  _TestScreenState createState() => _TestScreenState();
}

class _TestScreenState extends State<TestScreen> {
  int pageNum;
  double marginTop = 0;
  List<Question> questionList = <Question>[];
  double percent = 0;

  validateAndRoute(BuildContext context) {
    Helpers.tapButtonSound();
    if (percent == 1) {
      Navigator.pushNamed(context, '/result');
    } else {
      Navigator.pushNamed(context, '/test',
          arguments: (pageNum + 1).toString());
    }
  }

  Widget _getListQuestionAnswers() {
    List<Widget> questionAnswers = <Widget>[];
    for (var i = 0; i < questionList.length; i++) {
      String questionNum = '${questionList[i].id + 1}. ';
      questionAnswers.add(
        Container(
          padding: EdgeInsets.symmetric(vertical: 10, horizontal: 5),
          child: Row(
            crossAxisAlignment: CrossAxisAlignment.start,
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: [
              Flexible(
                child: Wrap(
                  children: [
                    RichText(
                      text: TextSpan(
                        text: questionNum,
                        style: TextStyle(
                          decoration: TextDecoration.underline,
                          decorationColor: Colors.black,
                          backgroundColor: Colors.black,
                          color: Colors.yellowAccent,
                          fontWeight: FontWeight.bold,
                          fontSize: Helpers.isIpad()
                              ? Helpers.ipadIconSize() / 2
                              : 20,
                        ),
                        children: <TextSpan>[
                          TextSpan(
                            text: questionList[i].text,
                            style: TextStyle(
                              decoration: TextDecoration.underline,
                              decorationColor: Colors.black,
                              backgroundColor: Colors.black,
                              color: Colors.greenAccent,
                              fontWeight: FontWeight.bold,
                              fontSize: Helpers.isIpad()
                                  ? Helpers.ipadIconSize() / 2
                                  : 20,
                            ),
                          ),
                        ],
                      ),
                    ),
                  ],
                ),
              ),
              Container(
                child: OptionItem(
                  isHightLight: false,
                  isSelected: questionList[i].checked,
                  questionId: i,
                  onTap: () => setState(
                      () => questionList[i].checked = !questionList[i].checked),
                ),
              )
            ],
          ),
        ),
      );
    }

    questionAnswers.add(SizedBox(height: 7));

    return Column(
      mainAxisAlignment: MainAxisAlignment.spaceAround,
      crossAxisAlignment: CrossAxisAlignment.start,
      children: questionAnswers,
    );
  }

  @override
  void initState() {
    if (Ads.isReleaseMode()) {
      marginTop = 60;
    }

    super.initState();
  }

  setPageNume(String _pageNum) {
    pageNum = int.parse(_pageNum);
    percent = (pageNum + 1) / Helpers.getNumberPages();
  }

  Widget build(BuildContext context) {
    final String args = ModalRoute.of(context).settings.arguments;
    final FlareEndlessController _logoLoopController =
        FlareEndlessController('Untitled', 10);
    final FlareEndlessController _resultLoopController =
        FlareEndlessController('Untitled', 4);

    setPageNume(args);
    questionList.clear();
    Helpers.setQuestionSentencesList(questionList, pageNum);
    return Scaffold(
      appBar: AppBar(
        title:
            Row(mainAxisAlignment: MainAxisAlignment.center, children: <Widget>[
          Container(
              width: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.8 : 28,
              height: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.8 : 28,
              child: FlareActor(
                "images/riasec.flr",
                alignment: Alignment.center,
                controller: _logoLoopController,
              )),
          SizedBox(
            width: 10,
          ),
          Text(
            'Page ' + (pageNum + 1).toString(),
            style: TextStyle(
              fontSize: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.6 : 18,
            ),
          ),
          SizedBox(
            width: 40,
          ),
        ]),
        iconTheme: new IconThemeData(color: Colors.yellowAccent),
        backgroundColor: Colors.black87,
        actions: <Widget>[
          pageNum + 1 < Helpers.getNumberPages()
              ? IconButton(
                  iconSize: Helpers.isIpad() ? Helpers.ipadIconSize() : 24,
                  icon: CircleAvatar(
                      radius: 30,
                      backgroundColor: Colors.red,
                      child: Icon(Icons.arrow_forward)),
                  onPressed: () => validateAndRoute(context),
                )
              : InkWell(
                  onTap: () => validateAndRoute(context),
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
          Container(
            margin: EdgeInsets.only(top: marginTop),
            padding: EdgeInsets.only(left: 5, right: 5, top: 10),
            child: SingleChildScrollView(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
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
                  _getListQuestionAnswers(),
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }
}
