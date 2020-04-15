import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:seabird.biometry/helpers/Ads.dart';
import 'package:seabird.biometry/helpers/CommonFunctions.dart';

class L extends StatelessWidget {

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
            Image.asset('images/water.png', width: 50),
            FittedBox(
              fit:BoxFit.fitWidth,
              child: Text(' Chủng Nước', 
                style: TextStyle(
                  color: Colors.lightBlueAccent, 
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
              
              Navigator.of(context).pushNamedAndRemoveUntil('/', ModalRoute.withName('/l'));   
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
                  child: Image.asset('images/water.png', width: 130),
                ),
                Text(' Tỉ lệ: 65%. Vân móc: không có tâm (không có hoa tay).', style: TextStyle(color: Colors.white, fontSize: 15)),
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
                                      Text('CÁC VÂN CON (3 VÂN):', style: TextStyle(color: Colors.yellowAccent, fontSize: 18, fontWeight: FontWeight.bold, backgroundColor: Colors.white12)),
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
                                            Navigator.pushNamed(context, '/lu');
                                          },
                                          child: Image.asset("images/lu_detail.png", width: 0.4 * deviceWidth) 
                                        ),
                                        GestureDetector(
                                          onTap: () {
                                            Navigator.pushNamed(context, '/lr');
                                          },
                                          child: Image.asset("images/lr_detail.png", width: 0.4 * deviceWidth) 
                                        )
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                                      children: <Widget>[
                                        GestureDetector(
                                          onTap: () {
                                            Navigator.pushNamed(context, '/lf');
                                          },
                                          child: Image.asset("images/lf_detail.png", width: 0.4 * deviceWidth) 
                                        ),
                                      ],
                                    ),
                                    Divider()
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
                                    Expanded(child: Text('- Linh hoạt và thích nghi như nước, rất thích đám đông và cộng đồng.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Khả năng bắt chước vượt trội (cần phải có hình mẫu), học nhanh trong môi trường và trong xã hội, qua trải nghiệm thành công, thất bại của cuộc sống.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Sẵn sàng hòa mình vào dòng chảy của cuộc sống.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Thân thiện, cởi mở - Mở cửa cho những ý tưởng mới.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Nói chuyện cởi mở, trong công việc thì dễ thương lượng, cả tin (dễ thuyết phục).', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Thích được khen, thích được động viên, không thích xung đột, mâu thuẫn; buồn khi bị chê bai, so sánh với người khác (chán luôn, chẳng muốn làm nữa).', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Thích được chia sẻ, tâm sự cũng như lắng nghe người khác, dễ mủi lòng, đồng cảm.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Thích hoạt động cộng đồng, giao tiếp, từ thiện…', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Khác với chủng đại bàng, người chủng nước tính quyết đoán không cao.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Kết nối đám đông, cộng đồng tốt.', style: TextStyle(color: Colors.white, fontSize: 15)),),
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
                                      Expanded(child: Text('- Cần sự động viên và khích lệ thông qua những lời khen, những câu nói khích lệ chứ không phải những lời chê bai.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Nếu bạn là chủng nước, bạn cần 1 nhà lãnh đạo, quản lý tốt.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Tìm những người sở hữu vân tay chủng đại bàng tốt để hợp tác làm ăn.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Bạn thương người nên dễ bị dụ lắm. Nên cẩn thận đừng vội cả tin mà hãy thảo luận với những người thân trước.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Bàn tay bạn nhiều chủng Loop quá nên tìm đến những người chủng WE truyền lửa , những người sở hữu chủng WT mục tiêu cao.', style: TextStyle(color: Colors.white, fontSize: 15)),),
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

