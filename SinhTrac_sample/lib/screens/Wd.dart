import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.biometry/AppProvider.dart';
import 'package:seabird.biometry/helpers/AdBannerTemplate.dart';

class Wd extends StatelessWidget {
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
                      'Vân Đại Bàng WD',
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
                icon: Image.asset('images/home_icon.png'),
                onPressed: () {
                  // Navigator.popUntil(context, ModalRoute.withName('/home'));
                  Navigator.of(context).pushNamedAndRemoveUntil(
                      '/home', ModalRoute.withName('/wd'));
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
                child: Center(
                    child: Column(children: <Widget>[
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceAround,
                children: <Widget>[
                  Image.asset("images/WD.png", width: deviceWidth * 0.2),
                  Image.asset("images/wd_detail.png", width: deviceWidth * 0.4),
                ],
              ),
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
                      child: SafeArea(
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
                            mainAxisAlignment: MainAxisAlignment.spaceAround,
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
                                          '- 2 tâm, 2 giao điểm – hình dạng hai dấu móc ngược nhau.',
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
                                          '- Có thể tương tác và đa dạng đối tượng, thuận lợi trong các lĩnh vực giao tiếp và quan hệ công chúng.',
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
                                          '- Thích ứng cao với môi trường , hội nhập nhanh. Có thể thích nghi và chấp nhận những điều mới mẻ, những ý tưởng và khái niệm mới dễ dàng.',
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
                                          '- Suy nghĩ theo nhiều chiều hướng, đa góc nhìn. Luôn có “phương án B”, thực hiện nhiều phương pháp khác nhau để đạt được mục tiêu.',
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
                                          '- Tò mò, hứng thú nhiều lĩnh vực, thích điều mới mẻ và sự đổi mới. Có xu hướng theo đuổi nhiều mục tiêu, khó khăn trong việc kiểm soát quá trình thực hiện.',
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
                                          '- Thiên hướng suy nghĩ quá nhiều dẫn đến sự mất tập trung và thay đổi mục tiêu hay định hướng.',
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
                                          '- Dễ bị người khác ảnh hưởng và làm lung lay. Hay do dự, lưỡng lự khi suy nghĩ ở nhiều khía cạnh khác nhau.',
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
                                          '- Linh hoạt, có nhiếu cách ứng xử khác nhau, thay đổi nguyên tắc và lập trường tùy thuộc vào tình thế.',
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
                                          '- Có khả năng mở rộng và liên kết thông tin, khéo léo hài hòa giữa nguồn lực và thông tin.',
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
                                          '- Nóng tính nhưng có thể kiểm soát được.',
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
                                          '- Đề cao tinh thần hợp tác đội nhóm, thích hỏi và chia sẻ quan điểm với mọi người xung quanh.',
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
                                          '- Luôn muốn được khen ngợi và tôn trọng.',
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
                            mainAxisAlignment: MainAxisAlignment.spaceAround,
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
                                        '- Mẫu người thân thiện, nhiệt tình. Có tố chất, năng lực và nhiều kỹ năng, thường giỏi ở nhiều mặt và hứng thú với nhiều lĩnh vực khác.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Có khả năng giao tiếp tốt, thích chia sẻ.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Có khả năng giải quyết vấn đề theo nhiều chiều hướng khác nhau bằng nhiều cách khác nhau.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Rất linh hoạt và thoải mái, thích nghi tốt ở mọi hoàn cảnh khác nhau "ở bầu thì tròn, ở ống thì dài".',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
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
                            mainAxisAlignment: MainAxisAlignment.spaceAround,
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
                                        '- Có thể đạt được những thành quả cao từ những việc bạn cảm thấy hứng thú, tuy nhiên rất mau chóng chán nản và thường không làm đến nơi đến chốn. ',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text('- Khó tập trung.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Việc tập trung quá nhiều mục tiêu cùng một lúc sẽ khó đạt được mục tiêu hoàn hảo.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Không thích thảo kế hoạch, thường làm theo phong cách "nước đến chân mới nhảy".',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Không thích làm những công việc đòi hỏi sự lặp đi lặp lại mang tính khuôn khổ.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
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
                            mainAxisAlignment: MainAxisAlignment.spaceAround,
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
                                        '- Giỏi giao tiếp nên sẽ là 1 người sale đại tài.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Kế hoạch phải được lập trước thật rõ ràng, cụ thể để nhìn rõ vấn đề, giá trị, mục tiêu của mỗi việc mình chọn làm.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Học và thực hành phương pháp quản lý tốt thời gian, Ưu tiên công việc theo tầm quan trọng và độ cấp bách. Thực hiện lần lượt từng việc.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Tăng cường kỹ năng chuyên môn. Tránh việc trở thành “thợ” của tất cả ngành nghề mà không chuyên về nghề nào cụ thể.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Duy trì tính nhất quán của các nguyên tắc và quan điểm.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Tự tạo môi trường làm việc thoải mái.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Hạn chế suy nghĩ quá nhiều dễ dẫn đến mệt mỏi, kiệt sức, hoang mang.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Chia sẻ trở ngại với những người xung quanh để cùng nhau tìm giải pháp.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
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
                            mainAxisAlignment: MainAxisAlignment.spaceAround,
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
                              Text('Giao tiếp với với vân WD:',
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
                                        '- Tôn trọng và chỉ nên đề cập khuyết điểm/ lỗi sai của họ ở nơi riêng tư.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Hướng dẫn phương pháp học tập kết hợp: vừa đa dạng vừa chuyên sâu.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Hướng dẫn và chỉ dạy cách quản lý thời gian cho chủng WD từ sớm và có mốc hoàn thành.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Khen ngợi và có thưởng nếu chủng WD hoàn thành tốt nhiệm vụ.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Đưa ra lựa chọn cùng lợi ích của việc cần làm thay vì đưa ra mệnh lệnh trực tiếp.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text(
                                        '- Định hướng và tập cho trẻ tự ra quyết định.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                            ])
                          ]))
                    ]))
              ]))))
            ]))),
          )
        ]));
  }
}
