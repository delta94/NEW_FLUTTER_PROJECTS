import 'dart:async';
import 'dart:io';
import 'dart:math';
import 'package:firebase_admob/firebase_admob.dart';
import 'package:app_review/app_review.dart';
import 'package:flutter/material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:vector_math/vector_math.dart' show radians, Vector3;

class CommonUI {

  static translation(AnimationController controller){
    return Tween<double>(
      begin: 0.0,
      end: 110.0,
    ).animate(
      CurvedAnimation(
        parent: controller,
        curve: Curves.elasticOut
      ),
    );
  }

  static scale(AnimationController controller){
    return Tween<double>(
      begin: 1.7,
      end: 0.0,
    ).animate(
      CurvedAnimation(
        parent: controller,
        curve: Curves.fastOutSlowIn
      ),
    );
  }

  static rotation(AnimationController controller){
    return Tween<double>(
      begin: 0.0,
      end: 360.0,
    ).animate(
      CurvedAnimation(
        parent: controller,
        curve: Interval(
          0.0, 0.7,
          curve: Curves.decelerate,
        ),
      ),
    );
  }

  static open(AnimationController controller) {
    controller.forward();
  }

  static close(AnimationController controller) {
    controller.reverse();
  }

  static gotoPath(BuildContext context, String path) {
    new Timer(const Duration(seconds: 1), () {
      if(path.contains('/')){
        Navigator.pushNamed(context, path);
      } else {
        AppReview.storeListing.then((onValue) {});
      }
    });
  }

  static buildAnimatedButton(String name, String heroTag, 
                              Animation<double> translation,
                              AnimationController controller,
                              BuildContext context, String path, 
                              double angle, { Color color, String image }) {
    final double rad = radians(angle);
    return Transform(
      transform: Matrix4.identity()..translate(
        (translation.value) * cos(rad), 
        (translation.value) * sin(rad)
      ),

      child: Container(
        height: 100.0,
        child: Column(
          children: <Widget>[
            FloatingActionButton(
              heroTag: heroTag,
              child: Image.asset(image, width: 100, height: 100,), 
              backgroundColor: Colors.transparent, 
              onPressed: (){
                CommonUI.close(controller);
                CommonUI.gotoPath(context, path);
              },
              elevation: 0),
            Text(
              name, style: TextStyle(color: color, fontWeight: FontWeight.bold, fontSize: 20, decoration: TextDecoration.none))
          ]
        ),
      )
    );
  }

  static Row bulletText(String text, [Color color]) {
    return Row(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: <Widget>[
        Container(
          height: 20.0,
          width: 5.0,
          decoration: new BoxDecoration(
            color: color != null ? color : Colors.white,
            shape: BoxShape.circle,
          ),
        ),
        Expanded(child: Text(text, style: TextStyle(color: color != null ? color : Colors.white, fontSize: 17)),)
      ],
    );
  }

  static Text centerBulletText(String text, [Color color]) {
    return Text(text, style: TextStyle(color: color != null ? color : Colors.white, fontSize: 17));
  }

  static Future<bool> onWillPop(BuildContext context){
    return showDialog(
      context: context,
      builder: (context) => new AlertDialog(
        backgroundColor: Colors.white,
        title: new Text('Bạn có muốn thoát ứng dụng?'),
        content: new Text('Bạn chắc chứ?'),
        actions: <Widget>[
          new FlatButton(
            onPressed: () => Navigator.of(context).pop(false),
            child: new Text('Không'),
          ),
          new FlatButton(
            onPressed: () =>  exit(0),
            child: new Text('Có'),
          ),
        ],
      ),
    );
  }

  static moveToPage(int pageNum, PageController pageController, IconData iconData){
    return GestureDetector(
      child: Icon(
        iconData , 
        color: Colors.yellowAccent,
      ),
      onTap: (){

        pageController.animateToPage(
          pageNum, 
          duration: Duration(milliseconds: 400), 
          curve: Curves.linear,);
      },
    );
  }

  static moveToNextPage(int pageNum, PageController pageController){
    return moveToPage(
      pageNum, 
      pageController, 
      FontAwesomeIcons.angleDoubleRight, 
    );
  }

  static moveToPreviousPage(int pageNum, PageController pageController){
    return moveToPage(
      pageNum, 
      pageController, 
      FontAwesomeIcons.angleDoubleLeft, 
    );
  }

  static openDetail(Image image, String path, BuildContext context){
    return GestureDetector(
      onTap: () {
        InterstitialAd(
          adUnitId: INTERSTITIAL_ID,
          targetingInfo: Ads.targetingInfo,
        )..load()..show();
        
        Navigator.pushNamed(context, path);
      },
      child: image 
    );
  }

  static textCard(String title, num prevPage, num nextPage, Column column, PageController pageController){
    return Card(
      child: Container(
        padding: EdgeInsets.only(left: 10),
        child: Column(
          children: <Widget>[
            Divider(),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: <Widget>[
                prevPage >= 0 ? CommonUI.moveToPreviousPage(prevPage, pageController) : Container(width: 20.0, height: 0.0),
                CommonUI.titleParagraph(title),
                nextPage > 0 ? CommonUI.moveToNextPage(nextPage, pageController) : Container(width: 20.0, height: 0.0),
              ]
            ),
            Divider(),
            column,
          ],
        ),
      ),
      color: Colors.transparent,
    );
  }

  static titleParagraph(String title){
    return Text(title, style: TextStyle(color: Colors.yellowAccent, fontSize: 17, fontWeight: FontWeight.bold, decoration: TextDecoration.underline, backgroundColor: Colors.black));
  }
}
