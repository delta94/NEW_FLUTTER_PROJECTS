import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.biometry/AppProvider.dart';
import 'package:seabird.biometry/helpers/AdBannerTemplate.dart';
import 'package:seabird.biometry/helpers/Ads.dart';

class Wi extends StatelessWidget {
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
                      'Vân Đại Bàng WI',
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
                  Ads.loadInterstitialAd();
                  Navigator.of(context).pushNamedAndRemoveUntil(
                      '/home', ModalRoute.withName('/wi'));
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
                  Image.asset("images/WI.png", width: deviceWidth * 0.2),
                  Image.asset("images/wi_detail.png", width: deviceWidth * 0.4),
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
                                          '- 1 tâm, 2 giao điểm – tâm dài',
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
                                          '- Thích ứng, hội nhập nhanh với môi trường. Tìm kiếm cơ hội, thách thức nhưng chưa hết mình, do luôn có mâu thuẫn nội tại.',
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
                                          '- Tò mò, hứng thú nhiều lĩnh vực, thích điều mới mẻ và thử thách, theo đuổi nhiều mục tiêu, nhưng vẫn có nhiều cân nhắc.',
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
                                          '- Tiêu chuẩn cao, phân tích tỉ mỉ, hay đặt ra những câu hỏi, quan tâm đến chất lượng và sự hoàn hảo.',
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
                                          '- Thiên hướng suy nghĩ quá nhiều dẫn đến sự mất trung, dễ bị nản lòng khi mục tiêu không như mong muốn.',
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
                                          '- Hay do dự, lưỡng lự khi suy nghĩ ở nhiều khía cạnh khác nhau. Đưa ra những cách tiếp cận bảo thủ, khả năng kiểm soát chi tiết.',
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
                                          '- Nóng tính nhưng có thể kiểm soát được. Tinh thần trách nhiệm cao.',
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
                                          '- Có tinh thần trách nhiệm cao đối với công việc và gia đình.',
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
                                        '- Là người thân thiện, nhiệt tình, thẳng thắn, có năng lực và thoải mái.',
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
                                        '- Dễ dàng thích nghi trong nhiều điều kiện sống khác nhau.',
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
                                        '- Họ có trách nhiệm với gia đình, công việc, khá kỹ lưỡng trong tình cảm và không hề sống theo bản năng mà họ điều khiển cuộc sống của mình dựa vào lý trí.',
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
                                        '- Ít khi làm việc đến nơi đến chốn mà hay nửa vời.',
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
                                        '- Nếu buộc họ phải cùng lúc hoàn thành nhiều công việc thì hiệu quả chắc chắn sẽ không cao.',
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
                                        '- Không thích những gì lặp lại.',
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
                                        '- Có phần khép kín, tính tình nóng nảy, một khi họ đã bộc phát thì mọi chuyện khó có thể kiểm soát được.',
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
                                        '- Một điểm yếu khác của WI là rất hay quên.',
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
                                        '- Muốn thành công cần nghiêm túc hơn trong thái độ làm việc cũng như cách sống, học cách lập kế hoạch trước khi bắt tay vào làm việc gì.',
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
                                        '- Cởi mở hơn, sẵn sàng chia sẻ, chấp nhận phê phán để hoàn thiện bản thân hơn.',
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
                                        '- Cần có kế hoạch phải được lập trước thật rõ ràng, cụ thể để nhìn rõ vấn đề, giá trị, mục tiêu của mỗi việc mình chọn làm.',
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
                                        '- Vì đa mục tiêu và luôn có nhiều góc nhìn khác nhau nên WI cần học và thực hành phương pháp quản lý tốt thời gian.',
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
                                        '- WI cần ưu tiên công việc theo tầm quan trọng và độ cấp bách và thực hiện lần lượt từng việc.',
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
                                        '- WI cũng cần tăng cường kỹ năng chuyên môn để tránh việc trở thành “thợ” của tất cả ngành nghề mà không chuyên về nghề nào cụ thể.',
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
                                        '- WI hay suy nghĩ và hành động theo số đông, lập trường tư tưởng tùy thuộc tình thế nên cần học cách duy trì tính nhất quán của các nguyên tắc và quan điểm.',
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
                                        '- WI không thích làm những công việc nhàm chán lặp đi lặp lại nên cần tự tạo môi trường làm việc thoải mái.',
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
                                        '- WI cũng cần hạn chế suy nghĩ quá nhiều dễ dẫn đến mệt mỏi, kiệt sức, hoang mang.',
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
                                        '- WI có cái tôi cao và tính hình tượng cao nên thường ít khi chia sẻ khó khăn của bản thân với mọi người nên cần học cách chia sẻ trở ngại với những người xung quanh để cùng nhau tìm giải pháp.',
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
                              Text('Giao tiếp với với vân WI:',
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
                                        '- Giúp WI xác định được chính xác được mất để tránh việc lưỡng lự đắn đo trong quá trình thực hiện.',
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
                                        '- Giao tiếp với người có chủng vân tay WI nên tập trung vào điều họ quan tâm, chân thành và tích cực để truyền cảm hứng.',
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
                                        '- Tôn trọng và chỉ nên đề cập khuyết điểm/ lỗi sai của WI ở nơi riêng tư.',
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
                                        '- Hướng dẫn WI phương pháp học tập kết hợp: vừa đa dạng vừa chuyên sâu.',
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
                                        '- Hướng dẫn WI cách quản lý thời gian cho trẻ từ sớm và có mốc hoàn thành.',
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
                                        '- Khen ngợi và có thưởng nếu WI hoàn thành tốt nhiệm vụ.',
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
                                        '- Đưa ra lựa chọn cùng lợi ích của việc cần làm thay vì đưa ra mệnh lệnh trực tiếp cho WI.',
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
