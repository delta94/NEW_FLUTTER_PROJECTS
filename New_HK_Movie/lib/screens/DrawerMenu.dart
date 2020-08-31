import 'dart:io';

import 'package:app_review/app_review.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

class DrawerMenu extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Theme(
           data: Theme.of(context).copyWith(
                 canvasColor: Color.fromRGBO(50, 50, 50, 1), //This will change the drawer background to blue.
                 //other styles
              ),
              child: Drawer(child: new ListView(
          children: <Widget> [
            new DrawerHeader(child: Image.asset('images/banner.png')),
            new ListTile(
              title: Row(
                children: <Widget>[
                  Icon(Icons.home, color: Colors.blue),
                  new Text('  Trang chủ', style: TextStyle(color: Colors.blue, fontWeight: FontWeight.bold)),
                ] 
              ),
              onTap: () {
                Navigator.popUntil(context, ModalRoute.withName('/'));
              },
            ),

            new ListTile(
              title: Row(
                children: <Widget>[
                  Icon(Icons.star, color: Colors.amber),
                  new Text('  Đánh giá 5 Sao', style: TextStyle(color: Colors.amber, fontWeight: FontWeight.bold)),
                ] 
              ),
              onTap: () {
                AppReview.storeListing.then((onValue) {});
              },
            ),
            
            // Exit
            new ListTile(
              title: Row(
                children: <Widget>[
                  Icon(Icons.exit_to_app, color: Colors.redAccent[700]),
                  new Text('  Thoát ứng dụng', style: TextStyle(color: Colors.redAccent[700], fontWeight: FontWeight.bold)),
                ] 
              ),
              onTap: () => exit(0)
            ),
          ],
        )
    )
        );
  }
}