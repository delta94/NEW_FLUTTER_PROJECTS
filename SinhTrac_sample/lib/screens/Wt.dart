import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:seabird.biometry/helpers/CommonFunctions.dart';

class Wt extends StatelessWidget {

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
            Image.asset('images/eagle.png', width: deviceWidth/12),
            FittedBox(
              fit:BoxFit.fitWidth,
              child: Text('Vân Đại Bàng WT', 
                style: TextStyle(
                  color: Colors.redAccent, 
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
              
              Navigator.of(context).pushNamedAndRemoveUntil('/', ModalRoute.withName('/wt'));   
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
                    Image.asset("images/WT.png", width: deviceWidth*0.4),
                    Image.asset("images/wt_detail.png", width: deviceWidth*0.4),
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
                                    Expanded(child: Text('- 1 tâm, 2 giao điểm – tâm khép kín', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Độc lập, nhanh chóng, chủ động. Tính tự quản cao, suy nghĩ quyết đoán, mạnh mẽ.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Định hướng mục tiêu rõ ràng, tập trung, kiên trì và quyết liệt với mục tiêu đã đề ra.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Tự thúc đẩy, chủ động hoàn thiện bản thân. Đề cao tác phong chuyên nghiệp, rất quan tâm đến hình ảnh cá nhân.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Tự cô lập bản thân mình, SỐNG KHÉP KÍN VÀ NỘI TÂM, khó thổ lộ cảm xúc.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Cạnh tranh mạnh mẽ, nỗ lực để chiến thắng và thành công. Khuynh hướng phân tích và tự nghiên cứu.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Thích thể hiện (đôi lúc cho mình là trung tâm), có xu hướng chỉ huy, đôi khi áp đặt và lấn át người khác.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Thẳng thắn, nóng tính, đôi khi không kiểm soát được cảm xúc.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Chủ quan, cái tôi cao, chủ nghĩa cá nhân, rất khó bị thuyết phục và ảnh hưởng (Trừ khi đó là người mình nể trọng, có kiến thức chuyên sâu hoặc có chứng thực rõ rang, cụ thể).', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Mọi người có thể cảm thấy áp lực khi làm việc cùng vì cực kì tập trung và nghiêm túc.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Tính kỉ luật và đòi hỏi ở bản thân cao, không chấp nhận thất bại.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Wt khó chia sẻ và khó thổ lộ.', style: TextStyle(color: Colors.white, fontSize: 15)),),
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
                                    Expanded(child: Text('- Bạn là mẫu người trầm tính, cứng rắn và khó thổ lộ cảm xúc.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Có ý chí và tinh thần vững vàng, suy nghĩ mạnh mẽ và độc lập. Có mục tiêu cao.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Khả năng tuyệt vời trong việc sắp xếp và lên kế hoạch rõ ràng.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Bạn có sức mạnh cá nhân lớn và phong thái mạnh mẽ giúp đạt được mục tiêu mình đề ra.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Tự suy nghĩ, tự lập luận và quyết định trong hành động.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Tinh thần trách nhiệm cao.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Đối với bạn, công việc quan trọng hơn tất cả, nó lấy đi phần lớn thời gian trong ngày của bạn.', style: TextStyle(color: Colors.white, fontSize: 15)),),
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
                                    Expanded(child: Text('- Thường khó chấp nhận thất bại của bản thân cũng như người khác.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Khi gặp thất bại hoặc đổ vỡ thường tự mình chịu đựng.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Không thích lắng nghe lời khuyên, ý kiến của người khác nên hay xảy ra những thất bại không đáng có.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Vì không cảm thấy thoải mái khi bộc lộ cảm giác yêu thích và cảm xúc của mình với người khác nên hay bị hiểu lầm là lạnh nhạt, vô cảm.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Nếu tuýp người này không xác định được mục tiêu của bản thân, họ sẽ dễ trở nên chán nản và rất tiêu cực.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Quan tâm và thể hiện tình cảm ra bên ngoài đặc biệt là với người thân để tránh sự hiểu lầm là lạnh lùng, vô cảm.', style: TextStyle(color: Colors.white, fontSize: 15)),),
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
                                    Expanded(child: Text('- Học tính kiên nhẫn, khả năng thích ứng với môi trường.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Cống hiến, định vị lãnh đạo, phát triển nhận thức từ trải nghiệm.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Học thêm kỹ năng thiết lập và quản lý mục tiêu, có thể đặt mục tiêu theo nguyên tắc SMART sẽ giúp họ phát huy lợi thế của bản thân và dễ dàng đạt được sự thành công trong công việc.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Đối với trẻ em: Khuyến khích và tạo động lực cho trẻ mỗi ngày để trẻ có thể học hỏi từ thất bại, nhận ra thất bại, mạnh mẽ và dũng cảm hơn khi đối mặt với thất bại.', style: TextStyle(color: Colors.white, fontSize: 15)),),
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
                                      Text('Giao tiếp với với vân WT:', style: TextStyle(color: Colors.yellowAccent, fontSize: 20, fontWeight: FontWeight.bold, backgroundColor: Colors.white12)),
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
                                    Expanded(child: Text('- Đối với người sở hữu mẫu vân tay WT, họ phù hợp với phong cách giao tiếp dân chủ, mang tính xây dựng nhiều hơn là chiều hướng chiếm hữu hoặc áp đảo.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Thuyết phục nhẹ nhàng sẽ hiệu quả hơn là ép buộc.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Nên nhắc nhở ít, không nên nhắc nhiều, nếu nhắc nhiều dễ cáu.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Nên kiểm điểm riêng, tránh phê bình trước mặt người khác vì họ có tự trọng cao.', style: TextStyle(color: Colors.white, fontSize: 15)),),
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

