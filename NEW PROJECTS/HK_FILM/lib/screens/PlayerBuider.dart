import 'package:firebase_admob_example/enums/PlayerStateEnum.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:firebase_admob_example/youtube_player/controls.dart';
import 'package:firebase_admob_example/youtube_player/player.dart';
import 'package:firebase_admob_example/youtube_player/progress_bar.dart';
import 'package:firebase_admob_example/youtube_player/youtube_player_controller.dart';
import 'package:firebase_admob_example/youtube_player/youtube_player_flags.dart';
import 'package:firebase_admob_example/youtube_player/youtube_utils.dart';

typedef YoutubePlayerControllerCallback(YoutubePlayerController controller);

class PlayerBuider{
  double width;
  static double aspectRatio = 16/9;
  static Duration controlsTimeOut = const Duration(seconds: 3);
  static Widget bufferIndicator;
  static ProgressColors progressColors;
  static Color videoProgressIndicatorColor = Colors.yellow;
  static YoutubePlayerControllerCallback onPlayerInitialized;
  static Color liveUIColor = Colors.yellow;
  static List<Widget> actions;
  static String thumbnailUrl;
  static YoutubePlayerFlags flags = const YoutubePlayerFlags();

  static buildPlayer(YoutubePlayerController controller, ValueNotifier<bool> _showControls){
    return AspectRatio(
      aspectRatio:PlayerBuider.aspectRatio,
      child: Stack(
        fit: StackFit.expand,
        overflow: Overflow.visible,
        children: <Widget>[
          Player(
            controller: controller,
            flags: PlayerBuider.flags,
          ),
          if (!controller.value.hasPlayed &&
              controller.value.playerState == PlayerStateEnum.BUFFERING)
            Container(
              color: Colors.black,
            ),
          if (!controller.value.hasPlayed && !PlayerBuider.flags.hideThumbnail)
            if(controller.initialSource.length > 0)
              Image.network(
                PlayerBuider.thumbnailUrl ??
                    YoutubeUtils.getThumbnail(
                      videoId: controller.initialSource,
                    ),
                fit: BoxFit.cover,
              ),
          if (!PlayerBuider.flags.hideControls)
            TouchShutter(
              controller,
              _showControls,
              PlayerBuider.flags.disableDragSeek,
            ),
          if (!PlayerBuider.flags.hideControls)
            (controller.value.position > Duration(milliseconds: 100) &&
                    !_showControls.value &&
                    PlayerBuider.flags.showVideoProgressIndicator &&
                    !PlayerBuider.flags.isLive &&
                    !controller.value.isFullScreen)
                ? Positioned(
                    bottom: -27.9,
                    left: 0,
                    right: 0,
                    child: IgnorePointer(
                      ignoring: true,
                      child: ProgressBar(
                        controller,
                        colors: ProgressColors(
                          handleColor: Colors.transparent,
                          playedColor: PlayerBuider.videoProgressIndicatorColor,
                        ),
                      ),
                    ),
                  )
                : Container(),
          if (!PlayerBuider.flags.hideControls)
            Positioned(
              bottom: 0,
              left: 0,
              right: 0,
              child: PlayerBuider.flags.isLive
                  ? LiveBottomBar(
                      controller,
                      _showControls,
                      PlayerBuider.aspectRatio,
                      PlayerBuider.liveUIColor,
                      PlayerBuider.flags.hideFullScreenButton,
                    )
                  : BottomBar(
                      controller,
                      _showControls,
                      PlayerBuider.aspectRatio,
                      PlayerBuider.progressColors,
                      PlayerBuider.flags.hideFullScreenButton,
                    ),
            ),
          if (!PlayerBuider.flags.hideControls && _showControls.value)
            Positioned(
              top: 0,
              left: 0,
              right: 0,
              child: AnimatedOpacity(
                opacity:
                    (!PlayerBuider.flags.hideControls && _showControls.value) ? 1 : 0,
                duration: Duration(milliseconds: 300),
                child: Row(
                  children: PlayerBuider.actions ?? [Container()],
                ),
              ),
            ),
          if (!PlayerBuider.flags.hideControls)
            Center(
              child: PlayPauseButton(
                controller,
                _showControls,
                PlayerBuider.bufferIndicator ??
                    Container(
                      width: 70.0,
                      height: 70.0,
                      child: CircularProgressIndicator(
                        valueColor: AlwaysStoppedAnimation(Colors.white),
                      ),
                    ),
              ),
            ),
        ],
      ),
    );
  }
}