import 'package:audioplayers/audio_cache.dart';
import 'package:flutter/material.dart';
import 'package:flutter_gifimage/flutter_gifimage.dart';

import 'animated_background.dart';
import 'line.dart';
import 'line_divider.dart';
import 'note.dart';
import 'song_provider.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> with TickerProviderStateMixin {
  bool isPlaying = true;

  @override
  Widget build(BuildContext context) {
    GifController controller = GifController(vsync: this);
    WidgetsBinding.instance.addPostFrameCallback((_) {
      // controller.repeat(min: 0, max: 72, period: Duration(milliseconds: 6000));
      isPlaying
          ? controller.repeat(
              min: 0, max: 72, period: Duration(milliseconds: 6000))
          : controller.stop();
    });

    ///or you can use other action as a AnimationController
    return MaterialApp(
      title: 'Welcome to Flutter',
      home: Scaffold(
        appBar: AppBar(
          title: Text('Welcome to Flutter'),
        ),
        body: Center(
          child: Column(
            children: <Widget>[
              Expanded(
                child: Stack(
                  children: [
                    Visibility(visible: isPlaying, child: CustomAnimatedBg()),
                    Container(
                      margin: EdgeInsets.only(bottom: 30),
                      child: Center(
                        child: GifImage(
                          controller: controller,
                          image: AssetImage("images/tenor2.gif"),
                        ),
                      ),
                    ),
                  ],
                ),
              ),
              Expanded(child: MainPage(
                onStart: (onStart) {
                  setState(() {
                    isPlaying = onStart;
                  });
                },
              ))
            ],
          ),
        ),
      ),
    );
  }
}

class MainPage extends StatefulWidget {
  final Function(bool) onStart;

  const MainPage({Key key, this.onStart}) : super(key: key);
  @override
  _MainPageState createState() => _MainPageState();
}

class _MainPageState extends State<MainPage>
    with SingleTickerProviderStateMixin {
  AudioCache player = new AudioCache();
  List<Note> notes = initNotes();
  AnimationController animationController;
  int currentNoteIndex = 0;
  int points = 0;
  bool hasStarted = false;
  bool isPlaying = true;

  @override
  void initState() {
    super.initState();
    animationController =
        AnimationController(vsync: this, duration: Duration(milliseconds: 800));
    animationController.addStatusListener((status) {
      if (status == AnimationStatus.completed && isPlaying) {
        if (notes[currentNoteIndex].state != NoteState.tapped) {
          //game over
          setState(() {
            isPlaying = false;
            notes[currentNoteIndex].state = NoteState.missed;
          });
          animationController.reverse().then((_) {
            widget.onStart(false);
            _showFinishDialog();
          });
        } else if (currentNoteIndex == notes.length - 5) {
          //song finished
          _showFinishDialog();
        } else {
          setState(() => ++currentNoteIndex);
          animationController.forward(from: 0);
        }
      }
    });
  }

  @override
  void dispose() {
    animationController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Material(
      child: Stack(
        fit: StackFit.passthrough,
        children: <Widget>[
          Image.asset(
            'images/background.jpg',
            fit: BoxFit.cover,
          ),
          Row(
            children: <Widget>[
              _drawLine(0),
              LineDivider(),
              _drawLine(1),
              LineDivider(),
              _drawLine(2),
              LineDivider(),
              _drawLine(3),
            ],
          ),
          _drawPoints(),
        ],
      ),
    );
  }

  void _restart() {
    setState(() {
      hasStarted = false;
      isPlaying = true;
      notes = initNotes();
      points = 0;
      currentNoteIndex = 0;
    });
    animationController.reset();
  }

  void _showFinishDialog() {
    showDialog(
      context: context,
      builder: (context) {
        return AlertDialog(
          title: Text("Score: $points"),
          actions: <Widget>[
            FlatButton(
              onPressed: () {
                Navigator.of(context).pop();
                widget.onStart(true);
              },
              child: Text("RESTART"),
            ),
          ],
        );
      },
    ).then((_) => _restart());
  }

  void _onTap(Note note) {
    bool areAllPreviousTapped = notes
        .sublist(0, note.orderNumber)
        .every((n) => n.state == NoteState.tapped);
    print(areAllPreviousTapped);
    if (areAllPreviousTapped) {
      if (!hasStarted) {
        setState(() => hasStarted = true);
        animationController.forward();
      }
      _playNote(note);
      setState(() {
        note.state = NoteState.tapped;
        ++points;
      });
    }
  }

  _drawLine(int lineNumber) {
    return Expanded(
      child: Line(
        lineNumber: lineNumber,
        currentNotes: notes.sublist(currentNoteIndex, currentNoteIndex + 4),
        onTileTap: _onTap,
        animation: animationController,
      ),
    );
  }

  _drawPoints() {
    return Align(
      alignment: Alignment.topCenter,
      child: Padding(
        padding: const EdgeInsets.only(top: 32.0),
        child: Text(
          "$points",
          style: TextStyle(color: Colors.red, fontSize: 60),
        ),
      ),
    );
  }

  _playNote(Note note) {
    switch (note.line) {
      case 0:
        player.play('a.wav');
        return;
      case 1:
        player.play('c.wav');
        return;
      case 2:
        player.play('e.wav');
        return;
      case 3:
        player.play('f.wav');
        return;
    }
  }
}
