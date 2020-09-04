import 'dart:math';

import 'package:com.seab1ird.showyourself/enum/CellType.dart';
import 'package:com.seab1ird.showyourself/model_view/GameProvider.dart';
import 'package:enum_to_string/enum_to_string.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';

import '../model/Cell.dart';
import '../utils/Utils.dart';

const int ROTATED_DURATION = 180;

class CellWidget extends StatefulWidget {
  final int positionId;
  final bool showClick;

  const CellWidget({Key key, this.positionId, this.showClick: false})
      : super(key: key);

  @override
  _CellWidgetState createState() => _CellWidgetState();
}

class _CellWidgetState extends State<CellWidget> with TickerProviderStateMixin {
  Animation _cellAnimation;
  Animation _cellAnimation1;
  Animation _cellAnimation2;
  Animation _cellAnimation3;

  AnimationController _cellAnimationController;
  AnimationController _cellAnimationController1;
  AnimationController _cellAnimationController2;
  AnimationController _cellAnimationController3;

  Cell currentCell;
  int directionIndex = 0;
  bool connectLight = false;
  double width;
  double deviceWidth;
  bool hasTurnOnLight = false;

  @override
  void initState() {
    _cellAnimationController = AnimationController(
        vsync: this, duration: Duration(milliseconds: ROTATED_DURATION));
    _cellAnimationController1 = AnimationController(
        vsync: this, duration: Duration(milliseconds: ROTATED_DURATION));
    _cellAnimationController2 = AnimationController(
        vsync: this, duration: Duration(milliseconds: ROTATED_DURATION));
    _cellAnimationController3 = AnimationController(
        vsync: this, duration: Duration(milliseconds: ROTATED_DURATION));

    _cellAnimation =
        Tween(begin: 0.0, end: pi / 2).animate(_cellAnimationController);
    _cellAnimation1 =
        Tween(begin: pi / 2, end: pi).animate(_cellAnimationController1);
    _cellAnimation2 =
        Tween(begin: pi, end: pi * 1.5).animate(_cellAnimationController2);
    _cellAnimation3 =
        Tween(begin: pi * 1.5, end: pi * 2).animate(_cellAnimationController3);

    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);
    Map<int, Cell> cellsMap = gameProvider.cellsMap;
    currentCell = cellsMap[widget.positionId];
    if (currentCell != null)
      directionIndex = Utils.getDirectionIndex(currentCell.userDirection);

    super.initState();
  }

  _hasTurnOnLight(GameProvider gameProvider) {
    if (currentCell.lightNum == null || currentCell.lightNum == 0) {
      hasTurnOnLight = gameProvider.hasTurnOnLight && !currentCell.isUnusedLine;
    } else if (currentCell.lightNum == 1) {
      hasTurnOnLight =
          gameProvider.hasTurnOnLight1 && !currentCell.isUnusedLine;
    } else if (currentCell.lightNum == 2) {
      hasTurnOnLight =
          gameProvider.hasTurnOnLight2 && !currentCell.isUnusedLine;
    }
  }

  @override
  void didUpdateWidget(CellWidget oldWidget) {
    GameProvider gameProvider =
        Provider.of<GameProvider>(context, listen: false);
    if (!hasTurnOnLight && currentCell != null) {
      _hasTurnOnLight(gameProvider);

      if (hasTurnOnLight) {
        Future.delayed(Duration(milliseconds: currentCell.lineIndex * 50), () {
          setState(() {
            width = 0.9 * deviceWidth / 5;
          });
          Future.delayed(Duration(milliseconds: currentCell.lineIndex * 80),
              () {
            if (currentCell.cellType == CellType.HALF_LINE) {
              Utils.winGameSound();
            } else {
              Utils.connectedSound();
            }

            setState(() {
              connectLight = true;
              width = deviceWidth / 5;
            });
          });
        });
      }
    }

    super.didUpdateWidget(oldWidget);
  }

  @override
  Widget build(BuildContext context) {
    hasTurnOnLight = false;
    deviceWidth = MediaQuery.of(context).size.width;
    GameProvider gameProvider = Provider.of<GameProvider>(context);

    bool isLightBultCell = false;

    if (currentCell != null) {
      isLightBultCell = currentCell.cellType == CellType.HALF_LINE;
      _hasTurnOnLight(gameProvider);
    }

    bool lighting = hasTurnOnLight && connectLight;

    getOnOffImage({bool isLightBult: false, bool isBehind: false}) {
      String cellName;

      if (isLightBult) {
        cellName = gameProvider.lightOffType;
        if (lighting)
          cellName = gameProvider.lightOnType;
        else
          cellName = gameProvider.lightOffType;
      } else
        cellName = EnumToString.parse(currentCell.cellType).toLowerCase();

      // print('------------------' + cellName.toString());
      if (isLightBult && isBehind)
        return Utils.getImage(gameProvider.lightOnType + '_on',
            width: width, isFlr: true, isShow: true);

      return Utils.getImage(cellName + (lighting ? '_on' : '_off'),
          width: width, isShow: !isLightBult || (!lighting && isLightBult));
    }

    getDirectionIndex(int currentIndex) {
      currentIndex++;
      if (currentIndex == 4) currentIndex = 0;
      return currentIndex;
    }

    getImage() {
      AnimationController animationController;
      Animation animation;
      if (directionIndex == 0) {
        animationController = _cellAnimationController;
        animation = _cellAnimation;
      } else if (directionIndex == 1) {
        animationController = _cellAnimationController1;
        animation = _cellAnimation1;
      } else if (directionIndex == 2) {
        animationController = _cellAnimationController2;
        animation = _cellAnimation2;
      } else if (directionIndex == 3) {
        animationController = _cellAnimationController3;
        animation = _cellAnimation3;
      }

      return AnimatedBuilder(
        animation: animationController,
        builder: (context, child) => Transform.rotate(
          angle: animation.value,
          child: Container(
              decoration: BoxDecoration(
                shape: BoxShape.rectangle,
                border: Border.all(color: Colors.white, width: 2),
                borderRadius: BorderRadius.circular(10),
              ),
              child: getOnOffImage()),
        ),
      );
    }

    return Expanded(
      child: Container(
        height: deviceWidth / 5,
        decoration: currentCell == null
            ? BoxDecoration(
                color: Colors.grey[700],
                borderRadius: BorderRadius.circular(20),
              )
            : null,
        child: currentCell == null
            ? null
            : Material(
                color: Colors.transparent,
                child: InkWell(
                  onTap: () {
                    if (hasTurnOnLight ||
                        currentCell.cellType == CellType.BATTERY)
                      return null;
                    else {
                      Utils.tapCellSound();
                      gameProvider.updateDirection(widget.positionId);
                      if (directionIndex == 0) {
                        _cellAnimationController3.reverse();
                        _cellAnimationController.forward();
                      } else if (directionIndex == 1) {
                        _cellAnimationController.reverse();
                        _cellAnimationController1.forward();
                      }
                      if (directionIndex == 2) {
                        _cellAnimationController1.reverse();
                        _cellAnimationController2.forward();
                      } else if (directionIndex == 3) {
                        _cellAnimationController2.reverse();
                        _cellAnimationController3.forward();
                      }

                      Future.delayed(Duration(milliseconds: ROTATED_DURATION),
                          () {
                        setState(() {
                          directionIndex = getDirectionIndex(directionIndex);
                        });
                      });
                    }
                  },
                  child: Stack(
                    children: [
                      Center(child: getImage()),
                      isLightBultCell
                          ? Stack(
                              children: [
                                Opacity(
                                  opacity:
                                      hasTurnOnLight && connectLight ? 1 : 0,
                                  child: getOnOffImage(
                                    isLightBult: true,
                                    isBehind: true,
                                  ),
                                ),
                                getOnOffImage(isLightBult: true),
                              ],
                            )
                          : widget.showClick ? Utils.handTouch : Container()
                    ],
                  ),
                ),
              ),
      ),
    );
  }
}
