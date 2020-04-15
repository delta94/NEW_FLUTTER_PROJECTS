import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seab1ird.hkmovies/enums/PlayerStateEnum.dart';
import 'package:seab1ird.hkmovies/widgets/youtube_player/youtube_player.dart';
import 'package:seab1ird.hkmovies/widgets/youtube_player/youtube_player_controller.dart';
import 'package:seab1ird.hkmovies/widgets/youtube_player/youtube_player_controls.dart';
import 'package:seab1ird.hkmovies/widgets/youtube_player/youtube_player_flutter.dart';
import 'package:seab1ird.hkmovies/widgets/youtube_player/youtube_player_utils.dart';
import 'package:seab1ird.hkmovies/widgets/youtube_player/youtube_progress_bar.dart';

typedef YoutubePlayerControllerCallback(YoutubePlayerController controller);

class VideoBuilder{
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
      aspectRatio:VideoBuilder.aspectRatio,
      child: Stack(
        fit: StackFit.expand,
        overflow: Overflow.visible,
        children: <Widget>[
          YoutubePlayer(
            controller: controller,
            flags: VideoBuilder.flags,
          ),
          if (!controller.value.hasPlayed &&
              controller.value.playerState == PlayerStateEnum.BUFFERING)
            Container(
              color: Colors.black,
            ),
          if (!controller.value.hasPlayed && !VideoBuilder.flags.hideThumbnail)
            if(controller.initialSource.length > 0)
              Image.network(
                VideoBuilder.thumbnailUrl ??
                    YoutubeUtils.getThumbnail(
                      videoId: controller.initialSource,
                    ),
                fit: BoxFit.cover,
              ),
          if (!VideoBuilder.flags.hideControls)
            TouchShutter(
              controller,
              _showControls,
              VideoBuilder.flags.disableDragSeek,
            ),
          if (!VideoBuilder.flags.hideControls)
            (controller.value.position > Duration(milliseconds: 100) &&
                    !_showControls.value &&
                    VideoBuilder.flags.showVideoProgressIndicator &&
                    !VideoBuilder.flags.isLive &&
                    !controller.value.isFullScreen)
                ? Positioned(
                    bottom: -27.9,
                    left: 0,
                    right: 0,
                    child: IgnorePointer(
                      ignoring: true,
                      child: YoutubeProgressBar(
                        controller,
                        colors: ProgressColors(
                          handleColor: Colors.transparent,
                          playedColor: VideoBuilder.videoProgressIndicatorColor,
                        ),
                      ),
                    ),
                  )
                : Container(),
          if (!VideoBuilder.flags.hideControls)
            Positioned(
              bottom: 0,
              left: 0,
              right: 0,
              child: VideoBuilder.flags.isLive
                  ? LiveBottomBar(
                      controller,
                      _showControls,
                      VideoBuilder.aspectRatio,
                      VideoBuilder.liveUIColor,
                      VideoBuilder.flags.hideFullScreenButton,
                    )
                  : BottomBar(
                      controller,
                      _showControls,
                      VideoBuilder.aspectRatio,
                      VideoBuilder.progressColors,
                      VideoBuilder.flags.hideFullScreenButton,
                    ),
            ),
          if (!VideoBuilder.flags.hideControls && _showControls.value)
            Positioned(
              top: 0,
              left: 0,
              right: 0,
              child: AnimatedOpacity(
                opacity:
                    (!VideoBuilder.flags.hideControls && _showControls.value) ? 1 : 0,
                duration: Duration(milliseconds: 300),
                child: Row(
                  children: VideoBuilder.actions ?? [Container()],
                ),
              ),
            ),
          if (!VideoBuilder.flags.hideControls)
            Center(
              child: YoutubeControl(
                controller,
                _showControls,
                VideoBuilder.bufferIndicator ??
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