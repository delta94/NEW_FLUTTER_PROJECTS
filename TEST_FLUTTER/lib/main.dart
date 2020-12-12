import 'dart:async';
import 'dart:math';
import 'dart:ui';
import 'dart:ui' as Ui;
import 'dart:math' as math;

import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class Bloc {
  final blocInput = StreamController<Ui.Image>();
  final blocOutput = StreamController<Ui.Image>();

  Bloc() {
    blocInput.stream.listen((image) async {
      blocOutput.add(image);

      // Checks if the image data has been changed
      final bytes = await image.toByteData(format: ImageByteFormat.rawRgba);
      final list = bytes.buffer.asUint8List();
      final sum = list.fold(0, (previous, element) => previous + element);
      const expectedSum = 10200000;
      if (sum != expectedSum) {
        print("Sum of pixels is $sum at ${DateTime.now()}");
      }
    });
  }

  void dispose() {
    blocInput.close();
    blocOutput.close();
  }
}

class _MyAppState extends State<MyApp> {
  final _bloc = Bloc();

  @override
  void initState() {
    super.initState();
    _createImage();
  }

  @override
  void dispose() {
    super.dispose();
    _bloc.dispose();
  }

  void _createImage() async {
    // Draw image
    final pictureRecorder = PictureRecorder();
    final canvas = Canvas(pictureRecorder);
    canvas.drawColor(Colors.white, BlendMode.color);
    final picture = pictureRecorder.endRecording();
    final image = await picture.toImage(100, 100);

    // Periodically send the image to the Bloc
    Timer.periodic(Duration(milliseconds: 10), (_) async {
      final byteData = await image.toByteData(format: ImageByteFormat.png);
      final codec = await instantiateImageCodec(byteData.buffer.asUint8List());
      final frame = await codec.getNextFrame();
      _bloc.blocInput.add(frame.image);
    });
  }

  @override
  Widget build(BuildContext context) {
    return StreamBuilder<Ui.Image>(
      stream: _bloc.blocOutput.stream,
      initialData: null,
      builder: (context, snapshot) {
        return Center(
          child: CustomPaint(
            size: Size(300, 300),
            painter: MyCustomPainter(snapshot.data),
          ),
        );
      },
    );
  }
}

class MyCustomPainter extends CustomPainter {
  final Ui.Image _image;

  MyCustomPainter(this._image);

  @override
  bool shouldRepaint(CustomPainter oldDelegate) => true;

  @override
  void paint(Canvas canvas, Size size) {
    if (_image == null) {
      return;
    }
    final imageSize = Size(_image.width.toDouble(), _image.height.toDouble());
    final src = Offset.zero & imageSize;
    var rd = new Random();
    final dst = Offset.zero & imageSize * rd.nextDouble();
    canvas.rotate(rd.nextInt(360) * math.pi / 180);
    canvas.drawImageRect(_image, src, dst, Paint());
  }
}
