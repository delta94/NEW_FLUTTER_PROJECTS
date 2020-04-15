import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seabird.biometry/helpers/Ads.dart';
import 'package:seabird.biometry/helpers/CommonFunctions.dart';

class A extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    Ads.showInterstitialAd();
    SystemChrome.setPreferredOrientations([DeviceOrientation.portraitUp]);
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));

    PageController _textController = PageController(initialPage: 0, keepPage: false);
    num deviceWidth = MediaQuery.of(context).size.width;
    return Scaffold(
      appBar: AppBar(
        title: Row(
          children: <Widget>[
            Image.asset('images/mountain.png', width: 50),
            FittedBox(
              fit:BoxFit.fitWidth,
              child: Text(' Chủng Núi', 
                style: TextStyle(
                  color: Colors.lightGreenAccent, 
                  fontWeight: FontWeight.bold, 
                  decoration: TextDecoration.underline,
                  decorationColor: Colors.yellowAccent,
                  decorationStyle: TextDecorationStyle.solid,
                  shadows: [
                    Shadow(
                      color: Colors.yellow[50],
                      blurRadius: 1.0,
                      offset: Offset(1.0, 0.0),
                    ),
                  ],),
              ),
            )
          ]
        ),
        iconTheme: new IconThemeData(color: Colors.yellowAccent),
        backgroundColor: Colors.black54,
        actions: <Widget>[
          // action button
          IconButton(
            icon: Image.asset('images/home_icon.png'),
            onPressed: () {
              // Navigator.popUntil(context, ModalRoute.withName('/'));
              
              Navigator.of(context).pushNamedAndRemoveUntil('/', ModalRoute.withName('/w'));   
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
            margin: EdgeInsets.only(bottom: 0),
            child: Center(
              child: Column(children: <Widget>[
                Divider(),
                Container(
                  padding: EdgeInsets.only(left: 10, top: 10, bottom: 10),
                  margin: EdgeInsets.only(bottom: 5, left: 100, right: 100),
                  alignment: Alignment.center,
                  decoration: CommonFunctions.boxDecoration(Color.fromRGBO(247, 255, 230, 1)),
                  child: Image.asset('images/mountain.png', width: 130),
                ),
                Text(' Tỉ lệ: 4%. Vân hình núi/sóng (không có hoa tay).', style: TextStyle(color: Colors.white, fontSize: 15)),
                Divider(),
                Text(' ĐẶC TÍNH: ', style: TextStyle(
                  color: Colors.redAccent, 
                  fontSize: 18, 
                  backgroundColor: Colors.yellow[100],
                  fontWeight: FontWeight.bold,
                  decoration: TextDecoration.underline,
                  decorationColor: Colors.black,
                  decorationStyle: TextDecorationStyle.solid,
                  shadows: [
                    Shadow(
                      color: Colors.yellow[50],
                      blurRadius: 1.0,
                      offset: Offset(1.0, 0.0),
                    ),
                  ],),
                ),
                Expanded(
                  child: Container(
                    child: SafeArea(
                      child: PageView(
                        controller: _textController,
                        children: <Widget>[
                          Card(
                            color: Colors.black12,
                            child: Column(children: <Widget>[
                              Column(
                                mainAxisAlignment: MainAxisAlignment.center,
                                children: <Widget>[
                                  Divider(),
                                  Row(
                                    mainAxisAlignment: MainAxisAlignment.spaceAround,
                                    children: <Widget>[
                                      Container(),
                                      Text('CÁC VÂN CON (5 VÂN):', style: TextStyle(color: Colors.yellowAccent, fontSize: 18, fontWeight: FontWeight.bold, backgroundColor: Colors.white12)),
                                      GestureDetector(
                                        child: Image.asset('images/next_icon.png', width: 25,),
                                        onTap: (){
                                          _textController.animateToPage(
                                            1, 
                                            duration: Duration(milliseconds: 200), 
                                            curve: Curves.linear,);
                                        },
                                      )
                                  ],),
                                  Text('(Chọn vào hình để mở chi tiết):', 
                                    style: TextStyle(
                                      color: Colors.white, 
                                      fontSize: 15, 
                                      fontWeight: FontWeight.bold, 
                                      backgroundColor: Colors.white12,
                                      decoration: TextDecoration.underline,
                                    )
                                  ),
                                ],
                              ),
                              Divider(),
                              Expanded(
                                child: ListView(children: <Widget>[
                                  Column(children: <Widget>[
                                    Row(
                                      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                                      children: <Widget>[
                                        GestureDetector(
                                          onTap: () {
                                            Navigator.pushNamed(context, '/au');
                                          },
                                          child: Image.asset("images/au_detail.png", width: 0.4 * deviceWidth) 
                                        ),
                                        GestureDetector(
                                          onTap: () {
                                            Navigator.pushNamed(context, '/ar');
                                          },
                                          child: Image.asset("images/ar_detail.png", width: 0.4 * deviceWidth) 
                                        )
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                                      children: <Widget>[
                                        GestureDetector(
                                          onTap: () {
                                            Navigator.pushNamed(context, '/as');
                                          },
                                          child: Image.asset("images/as_detail.png", width: 0.4 * deviceWidth) 
                                        ),
                                        GestureDetector(
                                          onTap: () {
                                            Navigator.pushNamed(context, '/at');
                                          },
                                          child: Image.asset("images/at_detail.png", width: 0.4 * deviceWidth) 
                                        )
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                                      children: <Widget>[
                                        GestureDetector(
                                          onTap: () {
                                            Navigator.pushNamed(context, '/ae');
                                          },
                                          child: Image.asset("images/ae_detail.png", width: 0.4 * deviceWidth) 
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                  ])
                                ]),
                              )
                            ])
                          ),
                          Card(
                            color: Colors.black12,
                            child: 
                            Column(children: <Widget>[
                              Column(
                                mainAxisAlignment: MainAxisAlignment.center,
                                children: <Widget>[
                                  Divider(),
                                  Row(
                                    mainAxisAlignment: MainAxisAlignment.spaceAround,
                                    children: <Widget>[
                                      GestureDetector(
                                        child: Image.asset('images/prev_icon.png', width: 30,),
                                        onTap: (){
                                          _textController.animateToPage(
                                            0, 
                                            duration: Duration(milliseconds: 200), 
                                            curve: Curves.linear,);
                                        },
                                      ),
                                      Text('Đặc điểm chung:', style: TextStyle(color: Colors.yellowAccent, fontSize: 20, fontWeight: FontWeight.bold, backgroundColor: Colors.white12)),
                                      GestureDetector(
                                        child: Image.asset('images/next_icon.png', width: 25,),
                                        onTap: (){
                                          _textController.animateToPage(
                                            2, 
                                            duration: Duration(milliseconds: 200), 
                                            curve: Curves.linear,);
                                        },
                                      )
                                  ],)
                                  
                                ],
                              ),
                              Divider(),
                              Expanded(
                                child: ListView(
                                  padding: EdgeInsets.only(left: 10, right: 10),
                                  children: <Widget>[
                                  Column(children: <Widget>[
                                    Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Là người nhanh giận nhưng cũng nhanh quên (dù rất giận nhưng chỉ cần được nói ngọt thì quên ngay, dễ sống), là người không để bụng.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Chủng thiên tài vì khả năng hấp thu như miếng bọt biển, hấp thu không ngừng (hấp thu tốt nhất là trước năm 16 tuổi).', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Chậm chắc, từng bước, từng bước một.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Như một con ong chăm chỉ, làm những việc lặp đi lặp lại hàng ngày cực kì tốt. Rất cẩn thận.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Thích làm theo những lối mòn, không thích thay đổi (sẽ rất khó sống với những người RL – nước ngược). Muốn thay đổi cần phải từ từ.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Là người rất đáng tin cậy, có tinh thần trách nhiệm cao. Cam kết nhiệm vụ với sự tuân thủ nghiêm ngặt.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Thích sự an toàn, công việc và phong cách sống đơn giản, thực tế.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Có khả năng kết nối những thành viên trong gia đình.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Quyết tâm và kiên trì cao.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Rất chân thành với tình bạn lâu dài, đặc biệt với những người họ tôn trọng.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Ý thức mạnh mẽ về công lý.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Thích sự ổn định yên bình. Không thích sự xô bồ, náo nhiệt.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Không thích tư duy trừu tượng và mơ hồ. Nghi ngờ và hoài nghi về bất cứ điều gì mới.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Họ có khả năng hướng dẫn cho người khác về các quy trình.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Nếu có 4 Arch trở lên thì bạn là một người rất tuyệt vời và đặc biệt.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                  ])
                                ]),
                              )
                            ])
                          ),
                          Card(
                            color: Colors.black12,
                            child: 
                            Column(children: <Widget>[
                              Column(
                                mainAxisAlignment: MainAxisAlignment.center,
                                children: <Widget>[
                                  Divider(),
                                  Row(
                                    mainAxisAlignment: MainAxisAlignment.spaceAround,
                                    children: <Widget>[
                                      GestureDetector(
                                        child: Image.asset('images/prev_icon.png', width: 25,),
                                        onTap: (){
                                          _textController.animateToPage(
                                            1, 
                                            duration: Duration(milliseconds: 200), 
                                            curve: Curves.linear,);
                                        },
                                      ),
                                      Text('Phương thức giáo dục:', style: TextStyle(color: Colors.yellowAccent, fontSize: 20, fontWeight: FontWeight.bold, backgroundColor: Colors.white12)),
                                      Container()
                                  ],)
                                  
                                ],
                              ),
                              Divider(),
                              Expanded(
                                child: ListView(
                                  padding: EdgeInsets.only(left: 10, right: 10),
                                  children: <Widget>[
                                  Column(children: <Widget>[
                                    Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Với những người này nên hạn chế tranh luận, phân tích dễ gây mất lòng và xung đột khi họ không đồng tình quan điểm.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Tạo môi trường học tập nhanh và nhiều lên mỗi ngày, họ hấp thu vô hạn.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Nên cho họ làm việc với WE về tinh thần vì họ hấp thu từ những người thông thái và đem lửa tới cho họ, làm việc với WD vì họ sao chép nhanh.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Chúng tôi khuyên các bậc phụ huynh có con thuộc chủng vân tay này nên cho con những lời khen khi con làm tốt hoặc cả khi con làm không tốt để bé tự tin vào mình.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Luôn tạo cho con môi trường thể hiện cái tôi và rèn luyện khả năng đưa ý kiến của con bằng việc hỏi con về các quyết định mà có liên quan đến bé.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Tạo cho con thói quen đọc sách và tìm hiểu thế giới ngay từ bé để khắc phục sự lười biếng của bé.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                  ])
                                ])
                              )
                            ])
                          )
                      ])
                    )
                  )
                )
              ])
            )
          )
        ])
      );
  }
}

