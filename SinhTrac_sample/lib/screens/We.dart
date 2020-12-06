import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.biometry/AppProvider.dart';
import 'package:seabird.biometry/helpers/AdBannerTemplate.dart';
import 'package:seabird.biometry/helpers/Ads.dart';

class We extends StatelessWidget {
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
                      'Vân Đại Bàng WE',
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
                      '/home', ModalRoute.withName('/we'));
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
                  Image.asset("images/WE.png", width: deviceWidth * 0.2),
                  Image.asset("images/we_detail.png", width: deviceWidth * 0.4),
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
                                          '- 1 tâm, 2 giao điểm – vòng tròn quanh tâm dày hơn.',
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
                                          '- Định hướng và tập trung mục tiêu, giỏi trong việc thiết lập mục tiêu cũng như lập kế hoạch chi tiết.',
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
                                          '- Có khả năng truyền lửa, truyền cảm xúc.',
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
                                          '- Tiêu chuẩn cao, phân tích tỉ mỉ, quan tâm tới chất lượng, sự chính xác và hoàn hảo. ',
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
                                          '- Tính kỷ luật và đòi hỏi ở bản thân cao.',
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
                                          '- Bị tình cảm, cảm xúc chi phối (đôi khi vì tình cảm mà thay đổi quyết định).',
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
                                          '- Nỗ lực để chiến thắng và thàng công, không chấp nhận thất bại.',
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
                                          '- Là người lương thiện, không làm hại được ai (nếu làm hại ai thì lương tâm sẽ rất cắn rứt và cảm thấy tội lỗi).',
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
                                          '- Làm việc có hệ thống, luôn tự đặt ra và duy trì hệ thống. Đề cao tác phong chuyên nghiệp, rất quan tâm đến hình ảnh cá nhân.',
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
                                          '- Cần rèn luyện tính kiên trì sẽ có cơ hội thành công cao.',
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
                                          '- Chủ quan, cái tôi cao, chủ nghĩa cá nhân, rất khó bị thuyết phục và ảnh hưởng (trừ khi đó là người mình nể trọng, có kiến thức chuyên sâu hoặc có chứng thực cụ thể).',
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
                                          '- Thích chỉ đạo, quyết đoán, đôi khi cho mình là trung tâm, dẫn đến áp đặt người khác; ý chí mạnh mẽ, quyết tâm cao.',
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
                                          '- Dễ dàng bị vướng giữa khía cạnh logic/lý trí và cảm xúc, có xu hướng lo lắng thái quá, nghĩ đến những rủi ro tiêu cực. Hay hồi hộp, thay đổi tâm trạng đột ngột.',
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
                                          '- Thẳng thắn, nóng tính, đôi khi không kiểm soát được cảm xúc.',
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
                                    child: Text('- Tầm nhìn xa trông rộng.',
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
                                        '- Chỉnh chu và cầu toàn trong công việc, hay lo sợ kết quả xấu trong công việc, đời sống.',
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
                                        '- Tổng hợp các suy nghĩ, dự đoán và lường trước kết quả hoàn thành.',
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
                                        '- Có khả năng thúc đẩy năng lượng, xúc cảm cho những người xung quanh.',
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
                                        '- Mẫu người đi đầu và làm gương trong vấn đề mang tính kỷ luật, nội quy cơ quan, công sở.',
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
                                        '- Khả năng nhìn nhận và đánh giá năng lực người khác khá tốt, khả năng xây dựng đội nhóm và phân công nhiệm vụ cho người khác cùng tham gia.',
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
                                    child: Text('- Thường bị cảm xúc chi phối.',
                                        style: TextStyle(
                                            color: Colors.white, fontSize: 15)),
                                  ),
                                ],
                              ),
                              Divider(),
                              Row(
                                children: <Widget>[
                                  Expanded(
                                    child: Text('- Đôi khi lo lắng thái quá.',
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
                                        '- Họ bị sự cầu toàn chi phối trong công việc nên đôi khi loay hoay, dẫn đến không tập trung và đạt kế quả không như mong muốn.',
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
                                        '- Do bị cảm xúc chi phối nên dễ bị tổn thương.',
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
                                        '- Cân bằng cảm xúc, khi giỏi cái gì rồi phải nên tự tin, không nên lo lắng quá.',
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
                                        '- Nghĩ đơn giản, lập kế hoạch lên cũng không nên quá lo lắng.',
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
                                        '- Hãy luôn duy trì cảm xúc tích cực trong mình, WE sẽ trở thành những con người tiên phong, đầy hứng khởi và truyền cảm hứng bất tận tới mọi người. Đó cũng chính là nguồn động lực để WE luôn hết mình tiến xa hơn trên con đường sự nghiệp, cuộc sống.',
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
                                        '- Đừng bao giờ để những cảm xúc tiêu cực tác động vào mình để mình trở thành kẻ bị chi phối bởi cảm xúc. Đó chính là hố chôn WE.',
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
                                        '- Keyword để WE thành công trong cuộc sống là hãy quản trị được cảm xúc của mình và biến cảm xúc thành vũ khí lợi hại.',
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
                                        '- Biết được khi nào một cái gì đó là “đủ tốt” và coi đó như là đã hoàn tất. Hãy vui tươi, thoải mái trải nghiệm, nuôi dưỡng sự thanh thản cho tâm hồn.',
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
                                        '- Gia tăng hoạt động đội nhóm để tối đa hóa điểm mạnh của tập thể. Tham gia các hoạt động phát triển kỹ năng giao tiếp.',
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
                              Text('Giao tiếp với với vân WE:',
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
                                        '- Nên thông báo và thảo luận trước kế hoạch.',
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
                                        '- Khi hoàn thành nhiệm vụ nên khen ngợi và thưởng.',
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
                                        '- Hình thành kỹ năng quản lý trạng thái cảm xúc của bản thân cho cá nhân này.',
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
                                        '- Chia sẻ và giúp họ phân tích trước những tình huống.',
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
                                        '- Đưa ra lựa chọn cùng lợi ích của việc cần làm thay vì đưa ra mệnh lệnh.',
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
                                        '- Để trẻ quyết định những việc nằm trong khả năng thay vì ba mẹ tự quyết định hoặc làm giúp.',
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
