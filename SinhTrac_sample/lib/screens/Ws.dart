import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.biometry/AppProvider.dart';
import 'package:seabird.biometry/helpers/AdBannerTemplate.dart';

class Ws extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    //Ads.showInterstitialAd();
    SystemChrome.setPreferredOrientations([DeviceOrientation.portraitUp]);
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));

    PageController _textController =
        PageController(initialPage: 0, keepPage: false);
    num deviceWidth = MediaQuery.of(context).size.width;
    return Scaffold(
        appBar: AppBar(
            title: Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  Image.asset('images/eagle.png', width: deviceWidth / 12),
                  FittedBox(
                    fit: BoxFit.fitWidth,
                    child: Text(
                      'Vân Đại Bàng WS',
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
                        ],
                      ),
                    ),
                  )
                ]),
            iconTheme: new IconThemeData(color: Colors.yellowAccent),
            backgroundColor: Colors.black54,
            actions: <Widget>[
              // action button
              IconButton(
                icon: Image.asset(
                  'images/home_icon.png',
                ),
                onPressed: () {
                  // Navigator.popUntil(context, ModalRoute.withName('/home'));
                  Navigator.of(context).pushNamedAndRemoveUntil(
                      '/home', ModalRoute.withName('/ws'));
                  // Navigator.pop(context);
                  // Navigator.pop(context, "/");
                },
              )
            ]),
        body: new Stack(children: <Widget>[
          new Container(
            decoration: new BoxDecoration(color: Colors.black87),
          ),
          AdBannerTemplate(
            child: new Container(
                padding: EdgeInsets.only(top: 0),
                child: Center(
                    child: Column(children: <Widget>[
                  Row(
                    mainAxisAlignment: MainAxisAlignment.spaceAround,
                    children: <Widget>[
                      Image.asset("images/WS.png", width: deviceWidth * 0.2),
                      Image.asset("images/ws_detail.png",
                          width: deviceWidth * 0.4),
                    ],
                  ),
                  Divider(),
                  Text(
                    'ĐẶC TÍNH:',
                    style: TextStyle(
                      color: Colors.redAccent,
                      fontSize: 18,
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
                      ],
                    ),
                  ),
                  Expanded(
                      child: Container(
                          child:
                              PageView(controller: _textController, children: <
                                  Widget>[
                    Card(
                        color: Colors.black12,
                        child: Column(children: <Widget>[
                          Column(
                            mainAxisAlignment: MainAxisAlignment.center,
                            children: <Widget>[
                              Row(
                                mainAxisAlignment:
                                    MainAxisAlignment.spaceAround,
                                children: <Widget>[
                                  Container(
                                    width: 20,
                                  ),
                                  Text('Đặc điểm:',
                                      style: TextStyle(
                                          color: Colors.yellowAccent,
                                          fontSize: 20,
                                          fontWeight: FontWeight.bold,
                                          backgroundColor: Colors.white12)),
                                  GestureDetector(
                                    child: Image.asset(
                                      'images/next_icon.png',
                                      width: 25,
                                    ),
                                    onTap: () {
                                      _textController.animateToPage(
                                        1,
                                        duration: Duration(milliseconds: 200),
                                        curve: Curves.linear,
                                      );
                                    },
                                  )
                                ],
                              )
                            ],
                          ),
                          Expanded(
                            child: ListView(
                                padding: EdgeInsets.only(left: 10, right: 10),
                                children: <Widget>[
                                  Column(children: <Widget>[
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '- 1 tâm, 2 giao điểm – tâm là vòng tròn hở xoáy trôn ốc.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 15)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '- Mạnh mẽ, tự tin, quyết đoán và tự lập.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 15)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '- Tính tự quản cao, suy nghĩ quyết đoán.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 15)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '- Tự thúc đẩy, chủ động hoàn thiện bản thân.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 15)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '- Có xu hướng chỉ huy, không thích sự áp đặt tuy nhiên đôi khi có xu hướng áp đặt và lấn át người khác.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 15)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '- Là mẫu người có thế giới nội tâm phong phú mà người khác thường không hiểu được.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 15)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '- Chủ quan, cái tôi cao, chủ nghĩa cá nhân, rất khó bị thuyết phục và ảnh hưởng.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 15)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '- Tính kỉ luật và đòi hỏi ở bản thân cao, không chấp nhận thất bại.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 15)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '- Có khả năng lãnh đạo, khả năng kiểm soát cảm xúc và điều phối công việc tốt.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 15)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '- Kiên trì thực hiện công việc một cách nghiêm túc và đam mê. Thường nỗ lực trong một khoảng thời gian dài vào bất cứ công việc gì mà họ cảm thấy quan trọng để hoàn thành mục tiêu của mình, ít nản chí.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 15)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '- Một phẩm chất dễ giúp cá nhân này thành công đó là "sự kiên định".',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 15)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '- Rất quan tâm đến hình ảnh cá nhân, đề cao sự rõ ràng trong các mối quan hệ cũng như công việc. ',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 15)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                  ])
                                ]),
                          )
                        ])),
                    Card(
                        color: Colors.black12,
                        child: Column(children: <Widget>[
                          Column(
                            mainAxisAlignment: MainAxisAlignment.center,
                            children: <Widget>[
                              Row(
                                mainAxisAlignment:
                                    MainAxisAlignment.spaceAround,
                                children: <Widget>[
                                  GestureDetector(
                                    child: Image.asset(
                                      'images/prev_icon.png',
                                      width: 25,
                                    ),
                                    onTap: () {
                                      _textController.animateToPage(
                                        0,
                                        duration: Duration(milliseconds: 200),
                                        curve: Curves.linear,
                                      );
                                    },
                                  ),
                                  Text('Ưu điểm:',
                                      style: TextStyle(
                                          color: Colors.yellowAccent,
                                          fontSize: 20,
                                          fontWeight: FontWeight.bold,
                                          backgroundColor: Colors.white12)),
                                  GestureDetector(
                                    child: Image.asset(
                                      'images/next_icon.png',
                                      width: 25,
                                    ),
                                    onTap: () {
                                      _textController.animateToPage(
                                        2,
                                        duration: Duration(milliseconds: 200),
                                        curve: Curves.linear,
                                      );
                                    },
                                  )
                                ],
                              )
                            ],
                          ),
                          Divider(),
                          Expanded(
                              child: ListView(
                                  padding: EdgeInsets.only(left: 10, right: 10),
                                  children: <Widget>[
                                Column(children: <Widget>[
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Khả năng nhận thức cao, không dễ dàng bị tác động.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Tự lập, luôn có tinh thần chiến đấu mạnh mẽ, thích chinh phục, không nản lòng trước khó khăn, thử thách và luôn tự động viên bản thân.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Có phong cách riêng. Sống bằng lí trí hơn tình cảm, mạnh mẽ.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Biết cách để đạt được mục tiêu, và luôn chủ động trong công việc.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Kiên định với mục tiêu và không dễ dàng từ bỏ.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Luôn hoàn thiện bản thân trở nên chuyện nghiệp. Họ luôn có suy nghĩ tích cực.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                ])
                              ]))
                        ])),
                    Card(
                        color: Colors.black12,
                        child: Column(children: <Widget>[
                          Column(
                            mainAxisAlignment: MainAxisAlignment.center,
                            children: <Widget>[
                              Row(
                                mainAxisAlignment:
                                    MainAxisAlignment.spaceAround,
                                children: <Widget>[
                                  GestureDetector(
                                    child: Image.asset(
                                      'images/prev_icon.png',
                                      width: 25,
                                    ),
                                    onTap: () {
                                      _textController.animateToPage(
                                        1,
                                        duration: Duration(milliseconds: 200),
                                        curve: Curves.linear,
                                      );
                                    },
                                  ),
                                  Text('Nhược điểm:',
                                      style: TextStyle(
                                          color: Colors.yellowAccent,
                                          fontSize: 20,
                                          fontWeight: FontWeight.bold,
                                          backgroundColor: Colors.white12)),
                                  GestureDetector(
                                    child: Image.asset(
                                      'images/next_icon.png',
                                      width: 25,
                                    ),
                                    onTap: () {
                                      _textController.animateToPage(
                                        3,
                                        duration: Duration(milliseconds: 200),
                                        curve: Curves.linear,
                                      );
                                    },
                                  )
                                ],
                              )
                            ],
                          ),
                          Divider(),
                          Expanded(
                              child: ListView(
                                  padding: EdgeInsets.only(left: 10, right: 10),
                                  children: <Widget>[
                                Column(children: <Widget>[
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Đôi khi tư duy hơi cứng nhắc, nếu lặp lại nhiều sẽ hình thành nên tính bảo thủ.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Thường khó chấp nhận thất bại của bản thân cũng như người khác.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Khi gặp thất bại thường tự mình chịu đựng, hay gặp vấn đề về mối quan hệ.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Không thích lắng nghe lời khuyên, ý kiến của người khác nên hay xảy ra những thất bại không đáng có.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Nếu tuýp người này không xác định được mục tiêu của bản thân, họ sẽ dễ trở nên chán nản và rất tiêu cực.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                ])
                              ]))
                        ])),
                    Card(
                        color: Colors.black12,
                        child: Column(children: <Widget>[
                          Column(
                            mainAxisAlignment: MainAxisAlignment.center,
                            children: <Widget>[
                              Row(
                                mainAxisAlignment:
                                    MainAxisAlignment.spaceAround,
                                children: <Widget>[
                                  GestureDetector(
                                    child: Image.asset(
                                      'images/prev_icon.png',
                                      width: 25,
                                    ),
                                    onTap: () {
                                      _textController.animateToPage(
                                        2,
                                        duration: Duration(milliseconds: 200),
                                        curve: Curves.linear,
                                      );
                                    },
                                  ),
                                  Text('Phương hướng phát triển:',
                                      style: TextStyle(
                                          color: Colors.yellowAccent,
                                          fontSize: 20,
                                          fontWeight: FontWeight.bold,
                                          backgroundColor: Colors.white12)),
                                  GestureDetector(
                                    child: Image.asset(
                                      'images/next_icon.png',
                                      width: 25,
                                    ),
                                    onTap: () {
                                      _textController.animateToPage(
                                        4,
                                        duration: Duration(milliseconds: 200),
                                        curve: Curves.linear,
                                      );
                                    },
                                  )
                                ],
                              )
                            ],
                          ),
                          Divider(),
                          Expanded(
                              child: ListView(
                                  padding: EdgeInsets.only(left: 10, right: 10),
                                  children: <Widget>[
                                Column(children: <Widget>[
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Xây dựng cho mình một mục tiêu dài hạn 5 -10 – 20 năm rồi chia nhỏ thành từng năm – từng tháng thậm chí là từng ngày. Điều đó sẽ giúp WS duy trì được năng lượng tích cực và tinh thần vượt khó giúp WS kích hoạt được mọi tố chất của mình.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Nếu không có mục tiêu sẽ khiến WS rơi vào trạng thái mất phương hướng và khó thành công như WS đáng có.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- WS cần tránh ép buộc người khác theo tiêu chuẩn và mong đợi riêng của bản thân, sẽ gây áp lực, mệt mỏi cho bản thân và mọi người.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- WS cần cân nhắc giữa lợi ích bản thân và lợi ích của người khác, kiên nhẫn lắng nghe và đặt mình vào vị trí của người khác để hiểu họ hơn, sẽ tạo được niềm tin, sự quý trọng và mối quan hệ tốt đẹp hơn.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- WS hãy gia tăng hoạt động đội nhóm để tối đa hóa điểm mạnh của tập thể. Tham gia các hoạt động – giao tiếp và phát triển kỹ năng giao tiếp.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- WS cũng cần duy trì thái độ cởi mở, tránh cao ngạo vô ý.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- WS cần học cách giao việc và tập trung vào giá trị và điểm mạnh của mọi người thay vì chỉ nhìn vào điểm yếu của họ.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- WS cần học cách chia sẻ cảm xúc, khó khăn của bản thân với mọi người để tránh căng thẳng, nếu không thể học cách chia sẻ thì có thể chọn phương án viết nhật ký, khi nóng giận thì hãy xả giận của mình bằng cách hít thở sâu và viết xuống mọi bức bối của mình sau đó thì xé đi như vậy cũng giúp cho WS giảm bớt căng thẳng và bức xúc.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                ])
                              ]))
                        ])),
                    Card(
                        color: Colors.black12,
                        child: Column(children: <Widget>[
                          Column(
                            mainAxisAlignment: MainAxisAlignment.center,
                            children: <Widget>[
                              Row(
                                mainAxisAlignment:
                                    MainAxisAlignment.spaceAround,
                                children: <Widget>[
                                  GestureDetector(
                                    child: Image.asset(
                                      'images/prev_icon.png',
                                      width: 25,
                                    ),
                                    onTap: () {
                                      _textController.animateToPage(
                                        3,
                                        duration: Duration(milliseconds: 200),
                                        curve: Curves.linear,
                                      );
                                    },
                                  ),
                                  Text('Giao tiếp với với vân WS:',
                                      style: TextStyle(
                                          color: Colors.yellowAccent,
                                          fontSize: 20,
                                          fontWeight: FontWeight.bold,
                                          backgroundColor: Colors.white12)),
                                  Container()
                                ],
                              )
                            ],
                          ),
                          Divider(),
                          Expanded(
                              child: ListView(
                                  padding: EdgeInsets.only(left: 10, right: 10),
                                  children: <Widget>[
                                Column(children: <Widget>[
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Khi giao tiếp với WS: cần ngắn gọn, tập trung vào vấn đề chính. Lưu ý tới điều họ quan tâm.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- WS cần được Tôn trọng và tránh áp đặt, và chỉ nên đề cập khuyết điểm/ lỗi sai của họ ở nơi riêng tư. Khen trong sáng chê trong tối.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Khi giao tiếp với WS nếu vấn đề trở nên gay gắt không nên tiếp tục tranh luận.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Nên thông báo hoặc thảo luận trước kế hoạch tránh việc đưa WS vào sự việc đã rồi.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Cần khen ngợi và tưởng thưởng kịp thời nếu WS hoàn thành tốt nhiệm vụ.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- Tránh áp đặt WS hãy đưa ra lựa chọn cùng lợi ích của việc cần làm thay vì đưa ra mệnh lệnh. Hoặc có thể đưa ra 2 sự lựa chọn để WS tự lựa chọn thay vì chỉ có 1.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                  Row(
                                    children: <Widget>[
                                      Expanded(
                                        child: Text(
                                            '- WS cần để bản thân tự quyết định những việc nằm trong khả năng của mình thay vì nhờ người khác quyết định hộ hoặc làm giúp.',
                                            style: TextStyle(
                                                color: Colors.white,
                                                fontSize: 15)),
                                      ),
                                    ],
                                  ),
                                  Divider(),
                                ])
                              ]))
                        ]))
                  ])))
                ]))),
          )
        ]));
  }
}
