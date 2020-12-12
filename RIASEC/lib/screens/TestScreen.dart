import 'package:flare_flutter/flare_actor.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:percent_indicator/linear_percent_indicator.dart';
import 'package:seabird.riasectest/helpers/BackgroundWidget.dart';
import 'package:seabird.riasectest/helpers/FlareEndlessController.dart';
import 'package:seabird.riasectest/helpers/Helpers.dart';
import 'package:seabird.riasectest/models/Question.dart';
import 'package:seabird.riasectest/widgets/AdBannerTemplate.dart';
import 'package:seabird.riasectest/widgets/OptionItem.dart';

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
          padding: EdgeInsets.symmetric(
              vertical: Helpers.isIpad() ? 20 : 10, horizontal: 5),
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
                          color: Colors.black,
                          fontWeight: FontWeight.bold,
                          fontSize: Helpers.isIpad()
                              ? Helpers.ipadIconSize() / 2
                              : 20,
                        ),
                        children: <TextSpan>[
                          TextSpan(
                            text: questionList[i].text,
                            style: TextStyle(
                              color: Colors.black,
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
        leading: IconButton(
          padding: EdgeInsets.zero,
          iconSize: Helpers.isIpad() ? Helpers.ipadIconSize() * 1.2 : 24,
          icon: Icon(
            Icons.arrow_back,
            color: Colors.yellow,
            size: Helpers.isIpad() ? Helpers.ipadIconSize() * 0.6 : 20,
          ),
          onPressed: () => Navigator.pop(context),
        ),
        backgroundColor: Colors.black87,
        actions: <Widget>[
          pageNum + 1 < Helpers.getNumberPages()
              ? IconButton(
                  iconSize:
                      Helpers.isIpad() ? Helpers.ipadIconSize() * 1.2 : 24,
                  icon: CircleAvatar(
                      radius: 30,
                      backgroundColor: Colors.lightGreen,
                      child: Icon(
                        Icons.arrow_forward,
                        color: Colors.black,
                        size: Helpers.isIpad()
                            ? Helpers.ipadIconSize() * 0.6
                            : 20,
                      )),
                  onPressed: () => validateAndRoute(context),
                )
              : InkWell(
                  onTap: () => validateAndRoute(context),
                  child: Container(
                    width: Helpers.isIpad() ? Helpers.ipadIconSize() * 1.2 : 60,
                    height:
                        Helpers.isIpad() ? Helpers.ipadIconSize() * 1.2 : 60,
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
            child: SingleChildScrollView(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: <Widget>[
                  Row(
                    children: <Widget>[
                      Expanded(
                        child: LinearPercentIndicator(
                          lineHeight: Helpers.isIpad() ? 30 : 15,
                          animation: true,
                          center: Text(
                            '${(percent * 100).toStringAsFixed(1)}%',
                            style:
                                TextStyle(fontSize: Helpers.isIpad() ? 25 : 15),
                          ),
                          animateFromLastPercent: true,
                          animationDuration: 500,
                          percent: percent,
                          progressColor: Color.fromRGBO(0, 200, 0, 1),
                          backgroundColor: Colors.grey,
                        ),
                      ),
                    ],
                  ),
                  SizedBox(height: Helpers.isIpad() ? 50 : 20),
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
