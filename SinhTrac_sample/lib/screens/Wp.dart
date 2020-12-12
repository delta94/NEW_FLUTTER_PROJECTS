import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.biometry/AppProvider.dart';
import 'package:seabird.biometry/helpers/AdBannerTemplate.dart';

class Wp extends StatelessWidget {
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
                      'Vân Đại Bàng WP',
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
                      '/home', ModalRoute.withName('/wp'));
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
                  Image.asset("images/wp_detail.png", width: deviceWidth * 0.4),
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
                                          '- Xác suất xuất hiện: 2%. Tâm tròn như mắt công, giao điểm gần nhất cách tâm ≤ 5 vân (Hoa tay).',
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
                                          '- Cầu toàn, tiêu chuẩn cao, để ý đến từng chi tiết. Theo đuổi sự độc đáo, khác biệt và đại diện cho mẫu người theo chủ nghĩa hoàn hảo.',
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
                                          '- Sắc sảo trong nhận thức, khéo léo trong giao tiếp, có khả năng xoay chuyển tình thế. Là một nhà lãnh đạo độc đáo, lôi cuốn.',
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
                                          '- Có khả năng thuyết phục người khác bằng niềm tin và quan điểm của mình.',
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
                                          '- Có năng lực dự đoán, tạo ra hay khám phá ra thị trường mới.',
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
                                          '- Có khả năng tốt trong việc nhận diện hoặc tạo ra sự khác biệt, hình thành ý tưởng mới.',
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
                                          '- Tự tin, lạc quan, chủ động và quyết liệt.',
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
                                          '- Cạnh tranh mạnh mẽ, nỗ lực để chiến thắng và thành công. Vận dụng nhiều cách khác nhau để đạt mục tiêu.',
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
                                          '- Quan tâm đến mọi người xung quanh, không bướng bỉnh.',
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
                                          '- Nhạy cảm, tinh tế với cái đẹp. Thiên hướng nghệ thuật và ý thức về thẩm mỹ tốt.',
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
                                          '- Đề cao tác phong chuyên nghiệp, để ý xây dựng hình tượng cá nhân và hoàn thiện bản thân.',
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
                                          '- Kiêu hãnh, tự hào về bản thân. Quyến rũ, thu hút người đối diện.',
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
                                          '- Là người có năng lượng rất trong sạch.',
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
                                          '- Khả năng dẫn dắt và tư duy sáng tạo.',
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
                                        '- Người sở hữu chủng vân tay WP, có nét tính cách tinh tế thiên bẩm, khả năng hoạt ngôn sắc sảo và có thiên hướng cảm thụ nghệ thuật rất tốt.',
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
                                        '- Người mang chủng vân tay WP có khả năng tuyệt vời trong việc quan sát các chi tiết. Từ cảm xúc, thái độ, cử chỉ tới hành động của người đối diện dù là nhỏ nhất.',
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
                                        '- Họ có khả năng truyền cảm hứng đến mọi người xung quanh. Có khả năng dùng quan điểm riêng của mình để thuyết phục người khác rất tốt.',
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
                                        '- Họ có tư duy sáng tạo và hình thành ý tưởng mới rất tốt.',
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
                                        '- Họ luôn nỗ lực trong công việc, có tinh thần cạnh tranh mạnh mẽ.',
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
                                        '- Biết vận dụng nhiều phương pháp linh hoạt khác nhau để đạt được mục tiêu đề ra.',
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
                                        '- Một đặc điểm nổi bật của chủng vân tay WP, đó chính là sự cầu toàn. Điều này được thể hiện một cách rõ ràng, trong sự chu đáo hoàn thành tất cả mọi việc đầy trách nhiệm. Bởi họ luôn quan tâm đến sự đánh giá của mọi người về mình.',
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
                                        '- Họ thường có xu hướng đặt mình ở vị trí cao hơn những người xung quanh. Trong một vài trường hợp họ thường rất tự hào về bản thân.',
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
                                        '- Kỹ tính, cái gì cũng phải hoàn hảo.',
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
                                        '- Nếu làm việc với người này sẽ khá áp lực.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text('- Tự cao tự đại.',
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
                                        '- Lắng nghe và cảm nhận nhiều hơn, tránh việc ép buộc người khác theo tiêu chuẩn và mong đợi riêng của bản thân sẽ giúp có được mối quan hệ tốt đẹp với mọi người.',
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
                                        '- Cần cân nhắc giữa lợi ích bản thân và lợi ích của người khác, đặt mình vào vị trí của người khác để hiểu họ hơn.',
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
                                        '- Chú ý đến giá trị và điểm mạnh hơn là tập trung vào lỗi sai của người khác, giảm đi cách nhìn tiêu cực.',
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
                                        '- Giữ một thái độ cởi mở để tránh những trường hợp bị cho là kiêu ngạo do vô ý.',
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
                                        '- Tham gia nhiều hoạt động cộng đồng; Cải thiện, nâng cao các kỹ năng tương tác giao tiếp.',
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
                              Text('Giao tiếp với với vân WP:',
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
                                        '- Khi giao tiếp với người có chủng Wp, cần ngắn gọn, tập trung vào vấn đề chính.',
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
                                        '- Tôn trọng họ trong việc giao tiếp và ra quyết định, chỉ nên đề cập khuyết điểm/ lỗi sai của họ ở nơi riêng tư.',
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
                                        '- Giao tiếp khéo léo ví dụ ( khi một người bạn hỏi WP về chiếc váy mà họ đang mặc xem có đẹp không, mặc dù chiếc váy đó không được đẹp cho lắm, nhưng WP vẫn khen một cách khéo léo là chiếc váy đó nhìn khá sang trọng).',
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
                                        '- Khen ngợi và thưởng nếu bản thân hoàn thành tốt nhiệm vụ.',
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
                                        '- Để bản thân tự quyết định những việc nằm trong khả năng của mình thay vì nhờ người khác quyết định hộ hoặc làm giúp.',
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
