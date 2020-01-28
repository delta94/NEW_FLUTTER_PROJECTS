import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';

class Intro extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Intro({
    Key key,
    this.title,
    this.message,
  }) : super(key: key);
  

  @override
  Widget build(BuildContext context) {
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));
    return Scaffold(
      appBar: AppBar(
        title: Text('Giới thiệu Sinh Trắc Vân Tay', style: TextStyle(color: Colors.yellowAccent),),
        iconTheme: new IconThemeData(color: Colors.yellowAccent),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
        actions: <Widget>[
            // action button
            IconButton(
              icon: Icon(Icons.home),
              onPressed: () {
                // Navigator.popUntil(context, ModalRoute.withName('/'));
                
                Navigator.of(context).pushNamedAndRemoveUntil('/', ModalRoute.withName('/intro'));   
                // Navigator.pop(context);
                // Navigator.pop(context, "/");
              },
            )
        ]
      ),
      body: new Stack(
        children: <Widget>[
          new Container(
            decoration: new BoxDecoration(
              color: Colors.black87
            ),
          ),
          new Container(
            padding: EdgeInsets.only(left: 10, right: 10, top: 40),
            child: Center(
              child: Column(
                children: <Widget>[
                  Row(
                    children: <Widget>[
                    Image.asset("images/info.png", height: 140, width: 80),
                    Expanded(
                      child: Padding(
                        padding: EdgeInsets.all(8.0),
                        child: Text.rich(TextSpan(
                          text: 'Sinh Trắc Vân Tay: ', 
                          style: TextStyle(color: Colors.yellowAccent, fontWeight: FontWeight.bold),// default text style
                          children: <TextSpan>[
                            TextSpan(
                              text: ' Là ngành khoa học nghiên cứu về mối liên hệ giữa cấu trúc não bộ, sự phân bổ noron thần kinh với vân tay con người để có định hướng giáo dục phù hợp, phát triển bản thân.', 
                              style: TextStyle(fontStyle: FontStyle.italic, color: Colors.white, fontWeight: FontWeight.normal)
                            ),
                          ]
                        )
                      )
                    ),
                    )
                  ]),
                  Expanded(
                    child: Container(
                        padding: EdgeInsets.only(bottom: 20),
                        child: ListView(
                          children: <Widget>[
                            Text(
                            '- Ngành khoa học sinh trắc vân tay dựa trên những thành tựu khi nghiên cứu về di truyền học, phôi học, sự cấu tạo của vân da tay và não bộ. Khoa học sinh trắc vân tay đã phân tích mật độ, độ ngắn dài của vân tay, hình dạng của vân tay… để phân tích chỉ số TFRC và các năng lực tiềm ẩn của não bộ.\n' 
                            , style: TextStyle(color: Colors.white, fontSize: 15)),
                            Divider(),
                            Container(
                              child: Column(
                                children: <Widget>[
                                  RaisedButton(
                                    color: Colors.red,
                                    onPressed: (){},
                                    child: Text('CÁ NHÂN:', style: TextStyle(color: Colors.white, fontWeight: FontWeight.bold),),
                                  ),
                                  Divider(),
                                  Row(children: <Widget>[
                                    Expanded(child: Text('– Khám phá bản thân bằng cách khám phá các năng lực tiềm ẩn của bạn.', style: TextStyle(color: Colors.white, fontSize: 17)),),
                                  ],),
                                ],
                              ),
                            )
                            
                            

                          ],
                        )
                      )
                    )
                  ]
                )
              )
            )
                  
        ])
    );
  }

}