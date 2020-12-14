import 'package:flutter/material.dart';

// ignore: must_be_immutable
class PercentIndicator extends StatefulWidget {
  final double percent;
  final double lineHeight;
  final Widget content;

  Color _progressColor;
  Color get progressColor => _progressColor;

  PercentIndicator({
    Key key,
    @required Color progressColor,
    @required this.content,
    @required this.percent,
    this.lineHeight = 5.0,
  }) : super(key: key) {
    _progressColor = progressColor ?? Colors.green;

    if (percent < 0.0 || percent > 1.0) {
      throw Exception('Percent value must be a double between 0.0 and 1.0');
    }
  }

  @override
  _PercentIndicatorState createState() => _PercentIndicatorState();
}

class _PercentIndicatorState extends State<PercentIndicator>
    with SingleTickerProviderStateMixin, AutomaticKeepAliveClientMixin {
  AnimationController _animationController;
  double _percent = 0.0;

  @override
  void initState() {
    _updateProgress();
    super.initState();
  }

  @override
  void dispose() {
    _animationController?.dispose();
    super.dispose();
  }

  @override
  void didUpdateWidget(PercentIndicator oldWidget) {
    super.didUpdateWidget(oldWidget);
    if (oldWidget.percent != widget.percent) {
      if (_animationController == null) {
        _updateProgress();
      } else {
        _animationController.duration = Duration(milliseconds: 500);
        _animationController.forward(from: 0.0);
      }
    }
  }

  void _updateProgress() {
    setState(() => _percent = widget.percent);
  }

  @override
  Widget build(BuildContext context) {
    super.build(context);
    var items = <Widget>[];
    var containerWidget = Container(
      height: widget.lineHeight,
      child: Stack(
        clipBehavior: Clip.none,
        children: [
          CustomPaint(
            painter: LinearPainter(
              progress: _percent,
              progressColor: widget.progressColor,
              backgroundColor: Colors.transparent,
              lineWidth: widget.lineHeight,
            ),
            child: Center(
              child: Container(
                padding: EdgeInsets.symmetric(horizontal: 12),
                child: widget.content,
                alignment: Alignment.centerLeft,
              ),
            ),
          ),
        ],
      ),
    );

    items.add(Expanded(child: containerWidget));

    return Material(
      color: Colors.transparent,
      child: Container(
        color: Colors.transparent,
        child: Row(
          mainAxisAlignment: MainAxisAlignment.start,
          crossAxisAlignment: CrossAxisAlignment.center,
          children: items,
        ),
      ),
    );
  }

  @override
  bool get wantKeepAlive => true;
}

class LinearPainter extends CustomPainter {
  final Paint _paintBackground = Paint();
  final Paint _paintLine = Paint();
  final double lineWidth;
  final double progress;
  final Color progressColor;
  final Color backgroundColor;

  LinearPainter({
    this.lineWidth,
    this.progress,
    this.progressColor,
    this.backgroundColor,
  }) {
    _paintBackground.color = backgroundColor;
    _paintBackground.style = PaintingStyle.stroke;
    _paintBackground.strokeWidth = lineWidth;

    _paintLine.color = progressColor.withOpacity(progress == 0.0 ? 0.0 : 1);
    _paintLine.style = PaintingStyle.stroke;
    _paintLine.strokeWidth = lineWidth;
    _paintLine.strokeCap = StrokeCap.butt;
  }

  @override
  void paint(Canvas canvas, Size size) {
    final start = Offset(0.0, size.height / 2);
    final end = Offset(size.width, size.height / 2);
    canvas.drawLine(start, end, _paintBackground);

    final xProgress = size.width * progress;
    canvas.drawLine(start, Offset(xProgress, size.height / 2), _paintLine);
  }

  @override
  bool shouldRepaint(CustomPainter oldDelegate) {
    return true;
  }
}
