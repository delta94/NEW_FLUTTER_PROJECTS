import 'package:assets_audio_player/assets_audio_player.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seab1ird.letitgo/SongProvider.dart';
import 'package:seab1ird.letitgo/models/Note.dart';

import 'widgets/CustomAnimatedBg.dart';
import 'widgets/GamePoints.dart';
import 'widgets/VerticalLine.dart';
import 'widgets/LineDivider.dart';

const GAME_SPEED = 300;

class GameScreen extends StatefulWidget {
  @override
  _GameScreenState createState() => _GameScreenState();
}

class _GameScreenState extends State<GameScreen>
    with SingleTickerProviderStateMixin, TickerProviderStateMixin {
  List<Note> notes;
  AnimationController animationController;
  int currentNoteIndex = 0;
  int points = 0;
  bool hasStarted = false;
  bool isPlaying = true;
  AssetsAudioPlayer animatedAudio = AssetsAudioPlayer();
  SongProvider songProvider;

  @override
  void initState() {
    songProvider = Provider.of<SongProvider>(context, listen: false);
    setNotes();
    animationController = AnimationController(
        vsync: this, duration: Duration(milliseconds: GAME_SPEED));
    animationController.addStatusListener((status) {
      if (status == AnimationStatus.completed && isPlaying) {
        if (notes[currentNoteIndex].state != NoteState.tapped) {
          //game over
          setState(() {
            isPlaying = false;
            notes[currentNoteIndex].state = NoteState.missed;
          });
          animationController.reverse().then((_) {
            onStart(false);
            _showFinishDialog();
          });
        } else if (currentNoteIndex == notes.length - 4) {
          //song finished
          _showFinishDialog();
        } else {
          setState(() => ++currentNoteIndex);
          animationController.forward(from: 0);
        }
      }
    });

    super.initState();
  }

  onStart(bool onStart) {
    setState(() {
      isPlaying = onStart;
    });
  }

  @override
  Widget build(BuildContext context) {
    // GifController controller = GifController(vsync: this);
    // WidgetsBinding.instance.addPostFrameCallback((_) {
    //   // controller.repeat(min: 0, max: 72, period: Duration(milliseconds: 6000));
    //   isPlaying
    //       ? controller.repeat(
    //           min: 0, max: 72, period: Duration(milliseconds: 6000))
    //       : controller.stop();
    // });
    return Scaffold(
      body: Center(
        child: Column(
          children: [
            Expanded(
              child: Material(
                child: Stack(
                  fit: StackFit.passthrough,
                  children: <Widget>[
                    // Image.asset(
                    //   'images/background.jpg',
                    //   fit: BoxFit.cover,
                    // ),
                    CustomAnimatedBg(),
                    Row(
                      children: <Widget>[
                        verticalLineWidget(0),
                        LineDivider(),
                        verticalLineWidget(1),
                        LineDivider(),
                        verticalLineWidget(2),
                        LineDivider(),
                        verticalLineWidget(3),
                      ],
                    ),
                    GamePoints(points: points),
                  ],
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }

  setNotes() {
    notes = songProvider.initNotes();
  }

  void _restart() {
    setState(() {
      hasStarted = false;
      isPlaying = true;
      points = 0;
      currentNoteIndex = 0;
      setNotes();
    });
    animationController.reset();
  }

  void _showFinishDialog() {
    animatedAudio.stop();
    showDialog(
      context: context,
      builder: (context) {
        return AlertDialog(
          title: Text("Score: $points"),
          actions: <Widget>[
            FlatButton(
              onPressed: () {
                Navigator.of(context).pop();
                onStart(true);
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
        animatedAudio.open(Audio('assets/sounds/Cartoon.mp3'));
      }
      onTapNote(note);
      setState(() {
        note.state = NoteState.tapped;
        ++points;
      });
    }
  }

  verticalLineWidget(int lineNumber) {
    return Expanded(
      child: VerticalLine(
        lineNumber: lineNumber,
        currentNotes: notes.sublist(currentNoteIndex, currentNoteIndex + 4),
        onTileTap: _onTap,
        animation: animationController,
      ),
    );
  }

  onTapNote(Note note) {
    // switch (note.line) {
    //   case 0:
    //     player.play('a.wav');
    //     return;
    //   case 1:
    //     player.play('c.wav');
    //     return;
    //   case 2:
    //     player.play('e.wav');
    //     return;
    //   case 3:
    //     player.play('f.wav');
    //     return;
    // }
  }

  @override
  void dispose() {
    animationController.dispose();
    super.dispose();
  }
}
