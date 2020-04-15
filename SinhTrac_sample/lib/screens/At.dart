import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seabird.biometry/helpers/CommonFunctions.dart';

class At extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    SystemChrome.setPreferredOrientations([DeviceOrientation.portraitUp]);
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));

    PageController _textController = PageController(initialPage: 0, keepPage: false);
    num deviceWidth = MediaQuery.of(context).size.width;
    return Scaffold(
      appBar: AppBar(
        title: Row(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Image.asset('images/mountain.png', width: deviceWidth/12),
            FittedBox(
              fit:BoxFit.fitWidth,
              child: Text(' Vân Núi AT', 
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
              
              Navigator.of(context).pushNamedAndRemoveUntil('/', ModalRoute.withName('/at'));   
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
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceAround,
                  children: <Widget>[
                    Image.asset("images/AT.png", width: deviceWidth*0.4),
                    Image.asset("images/at_detail.png", width: deviceWidth*0.4),
                ],),
                Divider(),
                Text('ĐẶC TÍNH:', style: TextStyle(
                  color: Colors.redAccent, 
                  fontSize: 18, 
                  fontWeight: FontWeight.bold,decoration: TextDecoration.underline,
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
                Expanded(
                  child: Container(
                    child: SafeArea(
                      child: PageView(
                        controller: _textController,
                        children: <Widget>[
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
                                      Container(width: 20,),
                                      Text('Đặc điểm:', style: TextStyle(color: Colors.yellowAccent, fontSize: 20, fontWeight: FontWeight.bold, backgroundColor: Colors.white12)),
                                      GestureDetector(
                                        child: Image.asset('images/next_icon.png', width: 25,),
                                        onTap: (){
                                          _textController.animateToPage(
                                            1, 
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
                                    Expanded(child: Text('- Dạng hình trục đối xứng như túp lều.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Là một chủng thông minh. Tiềm năng lớn, khả năng hấp thu dường như vô hạn. Hấp thu kiến thức như một miếng bọt biển.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Theo phong cách chậm mà chắc. Thận trọng việc ra quyết định, không thích thể hiện, giỏi trong việc giám sát.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Không thích lý luận trừu tượng, thích mọi thứ đơn giản, thực tế, thẳng đến mục tiêu.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Dễ dàng từ bỏ một khi không nhận được kết quả mong đợi.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Không quan tâm nhiều về ý kiến người khác. Tỉ mỉ, khả năng chi tiết hóa, sắc bén trong đánh giá công việc.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Có xu hướng đặt nhiều câu hỏi. Chỉ tin khi đã trải nghiệm, học từ kinh nghiệm. Học tập theo phong cách đơn giản, lặp đi lặp lại thường xuyên.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Làm từng bước, sắp xếp mọi việc theo thứ tự, có hệ thống. Nghiêm túc, có trách nhiệm, chân thành.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Thích cuộc sống đơn giản, không có tham vọng và không thực dụng.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Không thể giải quyết những khủng hoảng đột ngột mà phải dựa vào những kinh nghiệm trước.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Nhạy cảm, cảm xúc và bốc đồng. Tuy nhiên khó thể hiện cảm xúc ra bên ngoài hay thổ lộ bằng lời nói.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Là một người khá bảo thủ.', style: TextStyle(color: Colors.white, fontSize: 15)),),
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
                                            0, 
                                            duration: Duration(milliseconds: 200), 
                                            curve: Curves.linear,);
                                        },
                                      ),
                                      Text('Ưu điểm:', style: TextStyle(color: Colors.yellowAccent, fontSize: 20, fontWeight: FontWeight.bold, backgroundColor: Colors.white12)),
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
                                    Expanded(child: Text('- Hơi nhút nhát, e ngại trong môi trường mới. Tuy nhiên khi kết bạn thì là một người bạn trung thành đáng tin.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Có khả năng làm những việc đòi hỏi sự tỉ mỉ, cẩn thận và chi tiết.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Khó tin tưởng điều gì đó khi chưa có bằng chứng cụ thể.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Có khả năng chi tiết hóa tuyệt vời. Bạn có thể ngồi hàng giờ và liên tục làm những việc lặp đi lặp lại một cách hệ thống, máy móc.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                  ])
                                ])
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
                                      Text('Nhược điểm:', style: TextStyle(color: Colors.yellowAccent, fontSize: 20, fontWeight: FontWeight.bold, backgroundColor: Colors.white12)),
                                      GestureDetector(
                                        child: Image.asset('images/next_icon.png', width: 25,),
                                        onTap: (){
                                          _textController.animateToPage(
                                            3, 
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
                                    Expanded(child: Text('- Khả năng kiểm soát cảm xúc yếu, dễ nổ tung.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Thường có tình bốc đồng, dễ bỏ cuộc giữa chừng.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Không giỏi giao tiếp mặc dù thân thiện nhưng họ vẫn yêu thích sự khép kín.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Không dễ nóng tính nhưng khi nóng giận thì họ sẽ trở thành ngọn núi lửa phun trào và tàn phá.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                  ])
                                ])
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
                                            2, 
                                            duration: Duration(milliseconds: 200), 
                                            curve: Curves.linear,);
                                        },
                                      ),
                                      Text('Phương hướng phát triển:', style: TextStyle(color: Colors.yellowAccent, fontSize: 20, fontWeight: FontWeight.bold, backgroundColor: Colors.white12)),
                                      GestureDetector(
                                        child: Image.asset('images/next_icon.png', width: 25,),
                                        onTap: (){
                                          _textController.animateToPage(
                                            4, 
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
                                    Expanded(child: Text('- Chủng Arch có tiềm năng vô hạn, nên phải tận dụng mọi cơ hội để học hỏi và phát triển càng sớm càng tốt.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- AT nên tham gia các khóa đào tạo sâu về chuyên môn, đọc nhiều sách để mở rộng kiến thức.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- AT cần học cách thiết lập các mục tiêu, kiên trì theo đuổi và không viện lý do để từ bỏ.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- AT nên giảm xu hướng tự thu mình, chủ động gặp gỡ những người thành công để chia sẻ, học hỏi và phát triển bản thân.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- AT cần trao dồi kỹ năng nói trước đám đông.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                  ])
                                ])
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
                                            3, 
                                            duration: Duration(milliseconds: 200), 
                                            curve: Curves.linear,);
                                        },
                                      ),
                                      Text('Giao tiếp với với vân AT:', style: TextStyle(color: Colors.yellowAccent, fontSize: 20, fontWeight: FontWeight.bold, backgroundColor: Colors.white12)),
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
                                    Expanded(child: Text('- Khi tương tác với AT cần ngắn gọn, đơn giản, đi thẳng vào vấn đề chính.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Không dồn ép AT hứa hẹn hoặc ra quyết định ngay lập tức.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Nên thông báo và giải thích lý do nếu có bất kỳ sự thay đổi nào trong kế hoạch đã định trước với AT.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Học bằng cách thực hành, trải nghiệm (hỏi – trả lời/ mô tả, thi đua, trò chơi). Chia nhỏ bài học, làm từng bước, lặp đi lặp lại. Tốt nhất là được huấn luyện kèm cặp 1-1.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Động viên, khen thưởng kịp thời, ngay cả khi bản thân đạt được tiến bộ nhỏ để tăng động lực học tập.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Nên có những câu hỏi dẫn dắt để khơi gợi câu trả lời của cá nhân, tập cho bản thân cách chia sẻ dễ dàng hơn.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Khi kết quả thực hiện thấp, nhờ mọi người xung quanh chỉ ngay cho mình chỗ sai, đưa ra cách tiếp cận đúng và sửa đổi ngay lập tức.', style: TextStyle(color: Colors.white, fontSize: 15)),),
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

