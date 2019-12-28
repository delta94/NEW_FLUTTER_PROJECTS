import 'package:firebase_admob/firebase_admob.dart';

import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Arch_E extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Arch_E({
    Key key,
    this.title,
    this.message,
  }) : super(key: key);
  

  @override
  Widget build(BuildContext context) {
    Ads.hideBanner2Ad();
    Ads.showBanner3Ad();
    
    
    PageController _textController = PageController(initialPage: 0, keepPage: false);
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));
    return Scaffold(
      appBar: AppBar(
        title: Text('Chủng AE', style: TextStyle(color: Colors.yellowAccent),),
        iconTheme: new IconThemeData(color: Colors.yellowAccent),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
        actions: <Widget>[
            // action button
            IconButton(
              icon: Icon(Icons.home),
              onPressed: () {
                Navigator.of(context).pushNamedAndRemoveUntil('/', ModalRoute.withName('/archs'));   
              },
            )
        ]
      ),
      body: new Stack(
        children: <Widget>[
          new Container(
            decoration: new BoxDecoration(
              image: new DecorationImage(image: new AssetImage('images/bg.png'), fit: BoxFit.cover,),
            ),
          ),
          new Container(
            padding: EdgeInsets.only(left: 10, right: 10, top: 40),
            margin: EdgeInsets.only(bottom: 00),
            child: Center(
              child: ListView(
                children: <Widget>[
                  Center(
                    child: Column(children: <Widget>[
                      Divider(),
                      Text("Chủng nước AE", style: TextStyle(color: Colors.cyanAccent, fontWeight: FontWeight.bold, fontSize: 25),),
                      Divider(),
                      Image.asset("images/ae_draw.JPG", height: 200, width: 150),
                      Text('ĐẶC ĐIỂM:', style: TextStyle(color: Colors.cyanAccent, fontSize: 17, fontWeight: FontWeight.bold)),
                      Container(
                        height: 1200.0,
                        margin: EdgeInsets.symmetric(vertical: 5.0),
                        child:  SafeArea(
                          child: PageView(
                            controller: _textController,
                            children: <Widget>[
                              CommonUI.textCard('Đặc tính:', -1, 1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Sự kết hợp giữa nhóm Đại bàng với Núi, khoảng cách tâm đến giao điểm của đại bàng nhỏ hơn 5 đường vân.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có 1 tâm tròn ở giữa'),
                                    Divider(),
                                    CommonUI.bulletText(' Là một người nhạy cảm, có mục tiêu rõ ràng, luôn sẵn sằng cố gắng để đạt mục tiêu.'),
                                    Divider(),
                                    CommonUI.bulletText(' Giỏi với con số, phù hợp với các việc cần tính toán, đầu tư tài chính.'),
                                    Divider(),
                                    CommonUI.bulletText(' Là người cẩn trọng, luôn chú ý tới các chi tiết trong quá trình làm việc, luôn đánh giá cao tiến trình công việc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thông minh, khả năng hấp thu kiến thức cũng rất lớn như các đặc tính vân khác của chủng vân núi.'),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Ưu điểm:', 0, 2,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Có mục tiêu rõ ràng, luôn sẵn sằng cố gắng để đạt mục tiêu'),
                                    Divider(),
                                    CommonUI.bulletText(' Cẩn trọng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thông minh, khả năng hấp thu kiến thức cũng rất lớn.'),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Nhược điểm:', 1, 3,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Nhạy cảm'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Phương hướng phát triển bản thân:', 2, -1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Nên phát triển sự nghiệp liên quan đén tính toàn, đầu tư tài chính'),
                                  ]
                                ), _textController
                              ),
                            ],
                          ),
                        )
                      )
                    ],)
                  ),
                ])
                )
              )
        ])
    );
  }
}