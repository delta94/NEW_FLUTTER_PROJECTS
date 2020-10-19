import 'package:com.seab1ird.showyourself/screens/SelectedFood.dart';
import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

class FoodList extends StatelessWidget {
  const FoodList({
    Key key,
    @required this.bottomHeight,
    @required ScrollController scrollControllerMain,
    @required this.vSeparator,
  })  : _scrollControllerMain = scrollControllerMain,
        super(key: key);

  final double bottomHeight;
  final ScrollController _scrollControllerMain;
  final SizedBox vSeparator;

  @override
  Widget build(BuildContext context) {
    void _goToDetail(String image, String tag) async {
      final page = SelectedFoodScreen(
        image: image,
        tag: tag,
      );
      await Navigator.of(context).push(
        PageRouteBuilder<Null>(
          opaque: false,
          pageBuilder: (BuildContext context, Animation<double> animation,
              Animation<double> secondaryAnimation) {
            return FadeTransition(
              opacity: animation,
              child: page,
            );
          },
          transitionDuration: Duration(milliseconds: 700),
        ),
      );
    }

    Widget _buildList(List<String> images) {
      return GridView.builder(
          scrollDirection: Axis.vertical,
          shrinkWrap: true,
          physics: ScrollPhysics(),
          gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
            crossAxisCount: 5,
            crossAxisSpacing: 5,
            mainAxisSpacing: 5,
          ),
          itemCount: 9,
          itemBuilder: (_, index) {
            final image = images[(index % images.length)];
            final tag = '$image$index';
            return Padding(
              padding: const EdgeInsets.all(2.5),
              child: InkWell(
                onTap: () {
                  _goToDetail(image, tag);
                },
                child: Hero(
                  tag: tag,
                  child: Container(
                    width: Utils.deviceSize.width / 5,
                    child: Stack(
                      children: [
                        Image.asset(
                          image,
                          fit: BoxFit.cover,
                        ),
                        Material(
                          color: Colors.transparent,
                          child: Container(
                            alignment: Alignment.bottomCenter,
                            child: Text(
                              '20',
                              style: TextStyle(color: Colors.white),
                            ),
                          ),
                        ),
                      ],
                    ),
                  ),
                ),
              ),
            );
          });
    }

    return AnimatedContainer(
      duration: Utils.animationDuration,
      height: bottomHeight,
      child: SingleChildScrollView(
        controller: _scrollControllerMain,
        scrollDirection: Axis.vertical,
        physics: const ClampingScrollPhysics(),
        child: _buildList([
          'asset/images/theme.png',
          'asset/images/star.png',
          'asset/images/exit.png',
          'asset/images/bg_blue.png',
          'asset/images/bg_green.png',
          'asset/images/bg_red.png',
          'asset/images/bg_yellow.png',
          'asset/images/bg_purple.png',
          'asset/images/bg_pink.png'
        ]),
      ),
    );
  }
}
