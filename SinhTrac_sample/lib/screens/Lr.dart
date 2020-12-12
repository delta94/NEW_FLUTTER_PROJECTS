import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.biometry/AppProvider.dart';
import 'package:seabird.biometry/helpers/AdBannerTemplate.dart';

class Lr extends StatelessWidget {
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
                      ' Vân Nước LR',
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
                      '/home', ModalRoute.withName('/lr'));
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
                padding: EdgeInsets.only(left: 10, right: 10, top: 0),
                child: Center(
                    child: Column(children: <Widget>[
                  Row(
                    mainAxisAlignment: MainAxisAlignment.spaceAround,
                    children: <Widget>[
                      Image.asset("images/RL_left.png",
                          width: deviceWidth * 0.25),
                      Image.asset("images/lr_detail.png",
                          width: deviceWidth * 0.26),
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
                              child: PageView(
                                  controller: _textController,
                                  children: <Widget>[
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
                                            duration:
                                                Duration(milliseconds: 200),
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
                                    padding:
                                        EdgeInsets.only(left: 10, right: 10),
                                    children: <Widget>[
                                      Column(children: <Widget>[
                                        Row(
                                          children: <Widget>[
                                            Expanded(
                                              child: Text(
                                                  '- Xác suất xuất hiện: 5%. Hình dạng như dòng nước chảy xuôi về phía ngón tay cái. Hay còn được gọi là chủng vân tay NƯỚC NGƯỢC.',
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
                                                  '- Là một trong những chủng mạnh, là chủng rất thông minh. Vẫn có tính cách của Loop nói chung.',
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
                                                  '- Hòa đồng, thân thiện nhưng ít khi chủ động tạo mối quan hệ. Giao tiếp theo phong cách cởi mở.',
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
                                                  '- Nhạy cảm trong giao tiếp, quan sát rất sắc bén.',
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
                                                  '- Thường không được sự hưởng ứng của mọi người xung quanh và dễ bị cô lập.',
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
                                                  '- Mong muốn tự do, không thích bị ràng buộc trong khuôn khổ truyền thống.',
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
                                              child: Text('- Có tính hài hước.',
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
                                                  '- “Suy nghĩ ngoài chiếc hộp”. Có tư duy độc đáo, khác biệt và phá cách, đôi khi bị cho là lập dị.',
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
                                                  '- Theo đuổi sự độc đáo và khác biệt. Khát khao tự do, mong muốn phá vỡ truyền thống.',
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
                                                  '- Tư tưởng chống đối, không bao giờ thỏa hiệp với những gì mà họ không mong đợi.',
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
                                                  '- Học hỏi rất nhanh từ môi trường và xã hội, dễ nắm bắt và mô phỏng tốt.',
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
                                                  '- Không thể chịu đựng cuộc sống gò bó, đơn giản và buồn tẻ. Thích những điều thử thách, mới mẻ và huyền bí.',
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
                                                  '- Đầy sáng tạo, đưa ra giải pháp nhanh và hiệu quả tại thời điểm khủng hoảng.',
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
                                                  '- Tư duy ngược, suy nghĩ vượt giới hạn và luôn đột phá những sáng tạo mới.',
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
                                                  '- Không quan tâm đến cách đánh giá của người khác, chỉ làm những điều họ muốn làm.',
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
                                                  '- Cực kì tò mò, giỏi trong việc giải nghĩa, lý luận và có lối suy luận ngược.',
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
                                                  '- Chu đáo, chân thành, sống tình cảm, biết quan tâm mọi người. Dễ bị kích động về mặt cảm xúc.',
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
                                            duration:
                                                Duration(milliseconds: 200),
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
                                            duration:
                                                Duration(milliseconds: 200),
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
                                      padding:
                                          EdgeInsets.only(left: 10, right: 10),
                                      children: <Widget>[
                                    Column(children: <Widget>[
                                      Row(
                                        children: <Widget>[
                                          Expanded(
                                            child: Text(
                                                '- Tính cách và phong cách mạnh mẽ và độc đáo, khó chấp nhận lối suy nghĩ bình thường hay chậm chạp; ghét những gì bình thường.',
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
                                                '- Năng lực sáng tạo rất cao, khả năng quan sát sắc bén, khả năng cảm nhận và thấu hiểu cao.',
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
                                                '- Thích suy luận, có khả năng làm việc một cách hiệu quả và kiểm soát mọi việc vào phút chót theo kiểu nước đến chân mới nhảy tốt hơn các kiểu vân tay khác.',
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
                                                '- Có khả năng tranh luận và phản biện rất tốt.',
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
                                                '- Đại diện cho mẫu người đấu tranh vì hòa bình, dám đứng lên vì quyền lợi của người khác hay bản thân mình.',
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
                                                '- Hứng thú với những điều huyền bí.',
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
                                            duration:
                                                Duration(milliseconds: 200),
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
                                            duration:
                                                Duration(milliseconds: 200),
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
                                      padding:
                                          EdgeInsets.only(left: 10, right: 10),
                                      children: <Widget>[
                                    Column(children: <Widget>[
                                      Row(
                                        children: <Widget>[
                                          Expanded(
                                            child: Text(
                                                '- Không thể chịu đựng cuộc sống gò bó, đơn giản và buồn tẻ.',
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
                                                '- Thường gây sốc người khác bằng ngôn từ của mình. Dám nghĩ dám làm đôi khi trở thành lập dị.',
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
                                                '- Tư tưởng chống đối, không bao giờ thỏa hiệp với những gì mà họ không mong đợi.',
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
                                                '- Vì đa phần suy nghĩ và hành động ngược lại với số đông nên nếu không cân bằng thì dễ làm bất hòa giữa các mối quan hệ xung quanh trong công việc và cuộc sống.',
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
                                            child: Text('- Cái tôi lớn.',
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
                                                '- Thích làm mọi công việc với những suy nghĩ đối lập, hay phán đoán.',
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
                                            duration:
                                                Duration(milliseconds: 200),
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
                                            duration:
                                                Duration(milliseconds: 200),
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
                                      padding:
                                          EdgeInsets.only(left: 10, right: 10),
                                      children: <Widget>[
                                    Column(children: <Widget>[
                                      Row(
                                        children: <Widget>[
                                          Expanded(
                                            child: Text(
                                                '- Chấp nhận các đặc tính độc đáo của mình cũng như của người khác.',
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
                                                '- Phát huy sự nhiệt tình đặt câu hỏi.',
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
                                                '- Làm việc theo cảm tính, dễ thay đổi nguyên tắc và kế hoạch đã vạch ra. Vì vậy nên lập kế hoạch làm việc rõ ràng, chi tiết, tập trung vào mục tiêu và giám sát tiến độ thực hiện.',
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
                                                '- Học để trở thành người hướng dẫn và chịu trách nhiệm với quy trình làm việc, đưa ra giải pháp cho vấn đề phát sinh.',
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
                                                '- Thường quyết định theo chủ quan cá nhân và cảm xúc nhất thời nên có thể gây ảnh hưởng đến hiệu quả công việc hoặc mối quan hệ. Do đó nên lắng nghe và cân nhắc kỹ trước khi ra quyết định.',
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
                                            duration:
                                                Duration(milliseconds: 200),
                                            curve: Curves.linear,
                                          );
                                        },
                                      ),
                                      Text('Giao tiếp với với vân LR:',
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
                                      padding:
                                          EdgeInsets.only(left: 10, right: 10),
                                      children: <Widget>[
                                    Column(children: <Widget>[
                                      Row(
                                        children: <Widget>[
                                          Expanded(
                                            child: Text(
                                                '- Khi giao tiếp với mẫu người này, cần chân thành, nhẹ nhàng để tạo sự tin tưởng, giúp cuộc nói chuyện cởi mở và hiệu quả hơn.',
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
                                                '- Thể hiện sự quan tâm, dành thời gian để hỏi và trả lời, không ngắt lời họ.',
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
                                                '- Chấp nhận sự độc đáo, sáng tạo của họ hơn là áp đặt họ trở thành ai đó.',
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
                                                '- Tránh việc thiếu tôn trọng ý kiến hoặc ép buộc họ phải làm vì sẽ ảnh hưởng ngược đến kết quả hành động.',
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
                                                '- Cần làm mẫu để dễ dàng bắt nhịp trong học tập. Những hoạt động khơi nguồn cảm hứng và sáng tạo là rất cần thiết.',
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
                                                '- Khuyến khích hỏi và kiên nhẫn trả lời, giúp bản thân tự tìm ra câu trả lời.',
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
                      ]))))
                ]))),
          )
        ]));
  }
}
