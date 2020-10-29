import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

import 'FoodList.dart';

const topPercentageBefore = 0.45;
const topPercentageAfter = 0.3;

class HomeContent extends StatefulWidget {
  const HomeContent({
    Key key,
  }) : super(key: key);

  @override
  _HomeContentState createState() => _HomeContentState();
}

class _HomeContentState extends State<HomeContent> {
  bool expanded = true;
  double _heightBackGround = 0.0;
  double _heightImage = 0.0;
  GlobalKey _keyStack = GlobalKey();
  double _heightStack = 0.0;
  double _lastOffset = 0.0;
  ScrollController _scrollControllerMain = ScrollController();

  @override
  void initState() {
    WidgetsBinding.instance.addPostFrameCallback((_) {
      setState(() {
        _heightStack =
            (_keyStack.currentContext.findRenderObject() as RenderBox)
                .size
                .height;
        _heightBackGround = (_heightStack / 3) + kToolbarHeight;
        _heightImage = (_heightStack - _heightBackGround) * 3;
      });
    });
    _scrollControllerMain.addListener(() {
      bool isGoingLeft = _lastOffset + 10 < _scrollControllerMain.offset;
      bool isGoingRight = _lastOffset - 10 > _scrollControllerMain.offset;

      if (isGoingLeft) {
        if (expanded) {
          setState(() {
            expanded = false;
          });
        }
        _lastOffset = _scrollControllerMain.offset;
      } else if (isGoingRight) {
        if (!expanded) {
          setState(() {
            expanded = true;
          });
        }
        _lastOffset = _scrollControllerMain.offset;
      }
    });

    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    const vSeparator = const SizedBox(height: 5);
    final size = MediaQuery.of(context).size;
    final borderRadius = BorderRadius.circular(20.0);

    double _percentBackground;
    double _currentPercentage;
    if (expanded) {
      _currentPercentage = topPercentageBefore;
      _percentBackground = 1.0;
    } else {
      _currentPercentage = topPercentageAfter;
      _percentBackground = 0.9;
    }
    final topHeight = size.height * _currentPercentage;
    final bottomHeight =
        size.height * (1 - _currentPercentage) - Utils.bottomMenuHeight + 20;
    final imageSize = _heightImage * _percentBackground / 2;
    final backgroundSize = _heightBackGround * _percentBackground;
    print(
        '----------------Heght: ${Utils.deviceSize.height}, topHieght: $topHeight, bottomHeight: $bottomHeight');

    return Container(
      color: Colors.blueGrey,
      child: Column(
        children: [
          AnimatedContainer(
            duration: Utils.animationDuration,
            height: topHeight - Utils.bottomMenuHeight,
            child: Column(
              children: [
                Expanded(
                  child: Stack(
                    key: _keyStack,
                    children: [
                      AnimatedPositioned(
                        duration: Utils.animationDuration,
                        child: Image.asset(
                          'asset/images/bg_blue.png',
                          fit: BoxFit.cover,
                        ),
                        width: MediaQuery.of(context).size.width,
                        height: backgroundSize,
                      ),
                      Positioned(
                        top: 10,
                        width: Utils.deviceSize.width,
                        child: Row(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                            Text(
                              'Low Purine Foods',
                              style: TextStyle(
                                fontSize: Utils.fontSize(),
                                fontWeight: FontWeight.w600,
                                color: Colors.white,
                              ),
                            ),
                          ],
                        ),
                      ),
                      AnimatedPositioned(
                        duration: Utils.animationDuration,
                        child: Material(
                          elevation: expanded ? 10 : 20,
                          shape: RoundedRectangleBorder(
                            borderRadius: borderRadius,
                          ),
                          child: ClipRRect(
                            borderRadius: borderRadius,
                            child: Image.asset(
                              'asset/images/logo.png',
                              fit: BoxFit.cover,
                            ),
                          ),
                        ),
                        top: backgroundSize - imageSize / 2,
                        left: MediaQuery.of(context).size.width / 2 -
                            imageSize / 2,
                        width: imageSize,
                        height: imageSize,
                      ),
                    ],
                  ),
                ),
                AnimatedCrossFade(
                  firstChild: Container(
                    color: Colors.transparent,
                    padding: const EdgeInsets.all(12.0),
                    child: Row(
                      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                      children: [
                        getPurineInfoWidget('Total purines', 6),
                      ],
                    ),
                  ),
                  secondChild: const SizedBox.shrink(),
                  crossFadeState: expanded
                      ? CrossFadeState.showFirst
                      : CrossFadeState.showSecond,
                  duration: Utils.animationDuration,
                ),
              ],
            ),
          ),
          FoodList(
            bottomHeight: bottomHeight,
            scrollControllerMain: _scrollControllerMain,
            vSeparator: vSeparator,
          )
        ],
      ),
    );
  }

  Widget getPurineInfoWidget(String title, double amount) => Row(
        children: [
          Text(
            '$title: $amount (mg/100g)',
            style: TextStyle(
                fontSize: Utils.fontSize(), fontWeight: FontWeight.bold),
          ),
        ],
      );
}
