import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.biometry/AppProvider.dart';
import 'package:seabird.biometry/helpers/AdBannerTemplate.dart';
import 'package:seabird.biometry/helpers/Ads.dart';

class Wx extends StatelessWidget {
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
                        'Vân Đại Bàng WX',
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
                      )),
                ]),
            iconTheme: new IconThemeData(color: Colors.yellowAccent),
            backgroundColor: Colors.black54,
            actions: <Widget>[
              // action button
              IconButton(
                icon: Image.asset('images/home_icon.png'),
                onPressed: () {
                  // Navigator.popUntil(context, ModalRoute.withName('/home'));
                  Ads.loadInterstitialAd();
                  Navigator.of(context).pushNamedAndRemoveUntil(
                      '/home', ModalRoute.withName('/wx'));
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
            needShowSecondBanner:
                !Provider.of<AppProvider>(context, listen: false).admobLoaded,
            child: new Container(
                child: Center(
                    child: Column(children: <Widget>[
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceAround,
                children: <Widget>[
                  Image.asset("images/WX1.png", width: deviceWidth * 0.3),
                  Image.asset("images/WX2.png", width: deviceWidth * 0.3),
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
                                          '- Có nhiều đặc điểm tính cách và thay đổi thất thường, không thể đoán biết được. Có rất nhiều ý tưởng kỳ lạ và khác biệt.',
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
                                          '- Có xu hướng hay thay đổi và không ổn định, năng lượng phân tán khắp mọi nơi.',
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
                                          '- “Suy nghĩ ngoài chiếc hộp”, có tính cá nhân hóa.',
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
                                          '- Theo đuổi những điều độc đáo và khác biệt từ những người khác.',
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
                                          '- Thích những điều mới mẻ và huyền bí.',
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
                                          '- Ham muốn tự do, mong muốn phá vỡ những điều thuộc về truyền thống.',
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
                                          '- Có tính kháng cự, không bao giờ chấp nhận những điều mà họ không mong đợi.',
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
                                          '- Họ không bao giờ tự giới hạn chính bản thân mình, có những ý nghĩ mang tính đối kháng.',
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
                                          '- Không thể chấp nhận cuộc sống đơn giản và buồn tẻ, thích những thứ mới mẻ và thử thách, những điều đa dạng và bí ẩn.',
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
                                        '- Là những người có “Suy nghĩ ngoài chiếc hộp”, theo đuổi những điều độc đáo và khác biệt từ những người khác.',
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
                                        '- Thích những điều mới mẻ và huyền bí.',
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
                                        '- Lối suy nghĩ độc đáo, sáng tạo đôi lúc có phần “điên” khiến họ khó hòa đồng và thường bị xa lánh.',
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
                                        '- Với tính cách bốc đồng, WX rất dễ bị kích động (về mặt cảm xúc), và khó kiểm soát cảm xúc của bản thân.',
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
                                        '- WX cũng là nhóm người khó có thể áp đặt bởi họ luôn thích sống và làm việc theo ý muốn riêng của bản thân.',
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
                                        '- Bốc đồng, dễ kích động (về mặt cảm xúc).',
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
                                        '- WX cần chấp nhận nét độc đáo và khác biệt của mình.',
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
                                        '- WX cần luôn để cho tinh thần thoải mái, có không gian và thời gian riêng để theo đuổi những sở thích cá nhân và tự phát triển bản thân.',
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
                                        '- Muốn thành công WX cần học thói quen lập kế hoạch làm việc rõ ràng, chi tiết, tập trung vào mục tiêu và giám sát tiến độ thực hiện.',
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
                                        '- Cảm xúc là kẻ thù của thành công nên WX cần học cách kiểm soát cảm xúc, nên lắng nghe ý kiến của người khác, cân nhắc kỹ trước khi ra quyết định.',
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
                                        '- WX cũng nên thường xuyên tự phản ánh bản thân để tránh trở nên tự huyễn hoặc (hoặc trở nên kiêu ngạo).',
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
                              Text('Giao tiếp với với vân WX:',
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
                                        '- Khi giao tiếp với WX Cần chân thành, nhẹ nhàng. Thể hiện sự quan tâm và tôn trọng, không ngắt lời họ.',
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
                                        '- Tránh ra lệnh trực tiếp hoặc ép buộc WX vì sẽ ảnh hưởng ngược đến cách họ hành động.',
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
                                        '- Chấp nhận sự độc đáo, sáng tạo của WX hơn là áp đặt họ trở thành ai đó.',
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
                                        '- Khuyến khích hỏi và kiên nhẫn giúp trẻ tìm ra giải pháp hoặc câu trả lời.',
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
                                        '- Sử dụng thẻ điểm cho việc đạt mục tiêu như là sự khuyến khích.',
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
                                        '- Tạo ra nhiều thử thách nhỏ cho bản thân từ sớm để cá nhân trải nghiệm trong môi trường an toàn.',
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
