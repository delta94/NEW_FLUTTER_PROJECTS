library animated_background;

import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/scheduler.dart';

import 'behaviors/Behavior.dart';

/// A widget that renders an animated background.
class AnimatedBackground extends RenderObjectWidget {
  /// The child widget that is rendered on top of the background
  final Widget child;

  /// The ticker provider that provides the tick to update the background
  final TickerProvider vsync;

  /// The behaviour used to render the particles
  final Behaviour behaviour;

  /// Creates a new animated background with the provided arguments
  AnimatedBackground({
    Key key,
    @required this.child,
    @required this.vsync,
    @required this.behaviour,
  })  : assert(child != null),
        assert(vsync != null),
        assert(behaviour != null),
        super(key: key);

  @override
  createRenderObject(BuildContext context) => RenderAnimatedBackground(
        vsync: vsync,
        behaviour: behaviour,
      );

  @override
  void updateRenderObject(
      BuildContext context, RenderAnimatedBackground renderObject) {
    renderObject..behaviour = behaviour;
  }

  @override
  _AnimatedBackgroundElement createElement() =>
      _AnimatedBackgroundElement(this);
}

class _AnimatedBackgroundElement extends RenderObjectElement {
  _AnimatedBackgroundElement(AnimatedBackground widget) : super(widget);

  @override
  AnimatedBackground get widget => super.widget;

  @override
  RenderAnimatedBackground get renderObject => super.renderObject;

  Element _child;

  @override
  // ignore: must_call_super
  void forgetChild(Element child) {
    assert(child == _child);
    _child = null;
  }

  @override
  void insertChildRenderObject(RenderObject child, slot) {
    final RenderObjectWithChildMixin<RenderObject> renderObject =
        this.renderObject;
    assert(slot == null);
    assert(renderObject.debugValidateChild(child));
    renderObject.child = child;
    assert(renderObject == this.renderObject);
  }

  @override
  void moveChildRenderObject(RenderObject child, slot) {
    assert(false);
  }

  @override
  void removeChildRenderObject(RenderObject child) {
    final RenderAnimatedBackground renderObject = this.renderObject;
    assert(renderObject.child == child);
    renderObject.child = null;
    assert(renderObject == this.renderObject);
  }

  @override
  void visitChildren(ElementVisitor visitor) {
    if (_child != null) visitor(_child);
  }

  @override
  void mount(Element parent, newSlot) {
    super.mount(parent, newSlot);
    renderObject.callback = _layoutCallback;
  }

  @override
  void update(AnimatedBackground newWidget) {
    assert(widget != newWidget);
    super.update(newWidget);
    assert(widget == newWidget);
    renderObject.callback = _layoutCallback;
    renderObject.markNeedsLayout();
  }

  @override
  void performRebuild() {
    renderObject.markNeedsLayout();
    super.performRebuild();
  }

  @override
  void unmount() {
    renderObject.callback = null;
    super.unmount();
  }

  void _layoutCallback(BoxConstraints constraints) {
    owner.buildScope(this, () {
      Widget built;
      try {
        built = widget.behaviour.builder(this, constraints, widget.child);
        debugWidgetBuilderValue(widget, built);
      } catch (e, stack) {
        built = ErrorWidget.builder(_debugReportException(
          'building $widget',
          e,
          stack,
        ));
      }

      try {
        _child = updateChild(_child, built, null);
        assert(_child != null);
      } catch (e, stack) {
        built = ErrorWidget.builder(_debugReportException(
          'building $widget',
          e,
          stack,
        ));
        _child = updateChild(null, built, slot);
      }
    });
  }

  final bool _useDiagnosticsNode = FlutterError('text') is Diagnosticable;

  dynamic _safeContext(String context) {
    return _useDiagnosticsNode ? DiagnosticsNode.message(context) : context;
  }

  FlutterErrorDetails _debugReportException(
    String context,
    exception,
    StackTrace stack,
  ) {
    final FlutterErrorDetails details = FlutterErrorDetails(
      exception: exception,
      stack: stack,
      library: 'animated background library',
      context: _safeContext(context),
    );

    FlutterError.reportError(details);
    return details;
  }
}

/// An animated background in the render tree.
class RenderAnimatedBackground extends RenderProxyBox {
  int _lastTimeMs = 0;
  TickerProvider _vsync;
  Ticker _ticker;

  Behaviour _behaviour;

  /// Gets the behaviour used by this animated background.
  Behaviour get behaviour => _behaviour;

  /// Set the behaviour used by this animated background.
  set behaviour(value) {
    assert(value != null);
    Behaviour oldBehaviour = _behaviour;
    _behaviour = value;

    _behaviour.renderObject = this;
    _behaviour.initFrom(oldBehaviour);
  }

  /// Gets the layout callback that should be called when performing layout.
  LayoutCallback<BoxConstraints> get callback => _callback;
  LayoutCallback<BoxConstraints> _callback;

  /// Sets the layout callback that should be called when performing layout.
  set callback(LayoutCallback<BoxConstraints> value) {
    if (value == _callback) return;
    _callback = value;
    markNeedsLayout();
  }

  /// Creates a new render for animated background with the provided arguments.
  RenderAnimatedBackground({
    @required TickerProvider vsync,
    @required Behaviour behaviour,
  })  : assert(vsync != null),
        assert(behaviour != null),
        _vsync = vsync,
        _behaviour = behaviour {
    _behaviour.renderObject = this;
  }

  @override
  void attach(PipelineOwner owner) {
    _lastTimeMs = 0;
    _ticker = _vsync.createTicker(_tick);
    _ticker.start();
    super.attach(owner);
  }

  @override
  void detach() {
    _ticker.dispose();
    super.detach();
  }

  void _tick(Duration elapsed) {
    if (!_behaviour.isInitialized) return;

    double delta = (elapsed.inMilliseconds - _lastTimeMs) / 1000.0;
    _lastTimeMs = elapsed.inMilliseconds;

    if (_behaviour.tick(delta, elapsed)) markNeedsPaint();
  }

  @override
  void performLayout() {
    assert(callback != null);
    invokeLayoutCallback(callback);
    if (child != null) child.layout(constraints, parentUsesSize: true);
    size = constraints.biggest;
  }

  @override
  paint(PaintingContext context, Offset offset) {
    if (!behaviour.isInitialized) behaviour.init();

    Canvas canvas = context.canvas;
    // canvas.drawPaint(Paint()..color = Colors.pink);

    canvas.translate(offset.dx, offset.dy);
    behaviour.paint(context, offset);
    canvas.translate(-offset.dx, -offset.dy);

    super.paint(context, offset);
  }
}
