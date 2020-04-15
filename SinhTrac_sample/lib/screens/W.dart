import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:seabird.biometry/helpers/Ads.dart';
import 'package:seabird.biometry/helpers/CommonFunctions.dart';

class W extends StatelessWidget {

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
            Image.asset('images/eagle.png', width: deviceWidth/10),
            FittedBox(
              fit:BoxFit.fitWidth,
              child: Text('Chủng Đại Bàng', 
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
                  child: Image.asset('images/eagle.png', width: 130),
                ),
                Text(' Tỉ lệ: 30%. Vân xoáy có tâm (hoa tay).', style: TextStyle(color: Colors.white, fontSize: 15)),
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
                                      Text('CÁC VÂN CON (9 VÂN):', style: TextStyle(color: Colors.yellowAccent, fontSize: 18, fontWeight: FontWeight.bold, backgroundColor: Colors.white12)),
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
                                            Navigator.pushNamed(context, '/ws');
                                          },
                                          child: Image.asset("images/ws_detail.png", width: 0.4 * deviceWidth) 
                                        ),
                                        GestureDetector(
                                          onTap: () {
                                            Navigator.pushNamed(context, '/wt');
                                          },
                                          child: Image.asset("images/wt_detail.png", width: 0.4 * deviceWidth) 
                                        )
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                                      children: <Widget>[
                                        GestureDetector(
                                          onTap: () {
                                            Navigator.pushNamed(context, '/we');
                                          },
                                          child: Image.asset("images/we_detail.png", width: 0.4 * deviceWidth) 
                                        ),
                                        GestureDetector(
                                          onTap: () {
                                            Navigator.pushNamed(context, '/wc');
                                          },
                                          child: Image.asset("images/wc_detail.png", width: 0.4 * deviceWidth) 
                                        )
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                                      children: <Widget>[
                                        GestureDetector(
                                          onTap: () {
                                            Navigator.pushNamed(context, '/wd');
                                          },
                                          child: Image.asset("images/wd_detail.png", width: 0.4 * deviceWidth) 
                                        ),
                                        GestureDetector(
                                          onTap: () {
                                            Navigator.pushNamed(context, '/wi');
                                          },
                                          child: Image.asset("images/wi_detail.png", width: 0.4 * deviceWidth) 
                                        )
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                                      children: <Widget>[
                                        GestureDetector(
                                          onTap: () {
                                            Navigator.pushNamed(context, '/wp');
                                          },
                                          child: Image.asset("images/wp_detail.png", width: 0.4 * deviceWidth) 
                                        ),
                                        GestureDetector(
                                          onTap: () {
                                            Navigator.pushNamed(context, '/wx');
                                          },
                                          child: Image.asset("images/wx_detail.png", width: 0.4 * deviceWidth) 
                                        )
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
                                    Expanded(child: Text('- Khó bảo, bướng bỉnh, ko thích bị áp, cứng đầu.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Có khả năng tập trung mục tiêu cao, ít bị xao nhãng.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Bạn thích người khác lắng nghe và tuân thủ sự sắp xếp của bạn. Không thích bị chỉ ra điểm sai.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Tập trung vào mục tiêu của mình.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Nội tâm khép kín, ít chia sẻ với người khác, thường thích học tập và chơi một mình hơn là các hoạt động nhóm.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Tính cá nhân cao nên cái tôi lớn, muốn mình làm trung tâm.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Mạnh mẽ- Chủ Động- Quyết tâm cao.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Tự lập, chủ động. Tự thích làm mọi việc.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Tính cá nhân cao nên đôi khi khó hòa hợp với đội nhóm.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Có xu hướng muốn áp đặt, thay đổi người khác theo quan điểm của mình.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                    Expanded(child: Text('- Năng động, tính mục tiêu và làm việc chăm chỉ với một sự kiên trì và ý chí mạnh mẽ.', style: TextStyle(color: Colors.white, fontSize: 15)),),
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
                                      Expanded(child: Text('- Không nên mắng trẻ, góp ý trước đông người mà chờ lúc riêng tư, lúc nói chuyện nhẹ nhàng, thoải mái thì mới góp ý nhẹ nhàng.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Thu nhỏ làm 1 mục tiêu trước, sau đó hoàn thành rồi tiếp tục mục tiêu tiếp theo. Chọn 1 thứ thôi sẽ tuyệt vời hơn.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Tạo ra những trải nghiệm thực tế giúp họ tự tin hơn.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Với trẻ có vân tay này, đừng bao giờ dọa.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Bố mẹ nói là làm, nói 1 là 1, 2 là 2 còn nếu không về sau đừng hòng nói bé nghe.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Cần cho trẻ tham gia các hoạt động tập thể.', style: TextStyle(color: Colors.white, fontSize: 15)),),
                                    ],),Divider(),
                                    Row(children: <Widget>[
                                      Expanded(child: Text('- Không nuông chiều bé quá.', style: TextStyle(color: Colors.white, fontSize: 15)),),
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

