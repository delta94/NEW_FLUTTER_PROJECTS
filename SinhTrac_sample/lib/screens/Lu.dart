import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:in_app_review/in_app_review.dart';
import 'package:provider/provider.dart';
import 'package:seabird.biometry/AppProvider.dart';
import 'package:seabird.biometry/helpers/AdBannerTemplate.dart';
import 'package:seabird.biometry/helpers/Ads.dart';

class Lu extends StatefulWidget {
  @override
  _LuState createState() => _LuState();
}

class _LuState extends State<Lu> {
  InAppReview inAppReview;

  @override
  void initState() {
    inAppReview = InAppReview.instance;
    var appProvider = Provider.of<AppProvider>(context, listen: false);
    if (appProvider.isFirstUse) {
      appProvider.isFirstUse = false;
      appProvider.setFirstUseToFalse();
      Future.delayed(Duration(seconds: 10), () => inAppReview.requestReview());
    }
    super.initState();
  }

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
                  Text(
                    ' Vân Nước LU',
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
                      '/home', ModalRoute.withName('/lu'));
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
                padding: EdgeInsets.only(left: 10, right: 10, top: 0),
                child: Center(
                    child: Column(children: <Widget>[
                  Row(
                    mainAxisAlignment: MainAxisAlignment.spaceAround,
                    children: <Widget>[
                      Image.asset("images/UL_left.png",
                          width: deviceWidth * 0.3),
                      Image.asset("images/lu_detail.png",
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
                              Expanded(
                                child: ListView(
                                    padding:
                                        EdgeInsets.only(left: 10, right: 10),
                                    children: <Widget>[
                                      Column(children: <Widget>[
                                        Divider(),
                                        Row(
                                          children: <Widget>[
                                            Expanded(
                                              child: Text(
                                                  '- Xác suất xuất hiện: 55%. Hình dạng như dòng nước chảy xuôi về phía ngón tay út. Hay còn được gọi là chủng vân tay NƯỚC.',
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
                                                  '- Hòa đồng, cởi mở, thân thiện nhưng ít chủ động tạo mối quan hệ. Nhạy cảm trong giao tiếp, thích quan sát.',
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
                                                  '- Không thích xung đột mâu thuẫn, đề cao tinh thần đồng đội, yêu thích hoạt động đội nhóm.',
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
                                                  '- Là thành viên tốt trong đội nhóm, người chấp hành tốt, khả năng chịu đựng cao.',
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
                                                  '- Thích nghi tốt, dễ hòa nhập với từng môi trường. Có tư duy linh hoạt và khả năng tương thích cao.',
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
                                                  '- Nhiệt tình, chân thành và dễ cảm thông cho vấn đề của người khác. Rất coi trọng các mối quan hệ.',
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
                                                  '- Biết lắng nghe và chấp nhận ý kiến của người khác.',
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
                                                  '- Cư xử theo cách mọi người mong đợi, bằng cách nào đó chiều ý những người khác.',
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
                                                  '- Chu đáo, biết quan tâm mọi người, sống tình cảm, thích tự do.',
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
                                                  '- Không giỏi sáng tạo, tuy nhiên học hỏi rất nhanh từ môi trường và xã hội, dễ bắt chước và mô phỏng tốt.',
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
                                                  '- Là một người dễ bị người khác ảnh hưởng.',
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
                                                  '- Kỷ luật tự giác bản thân thấp.',
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
                                                  '- Là người của xã hội, cộng đồng. Là một chủng khá phổ biến. Người mang chủng nay khá hiền và lành tính, dễ bị người khác chèn ép.',
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
                                                  '- Lãng mạn, thích sự tự do.',
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
                                                  '- Họ làm việc theo cảm tính và dễ thay đổi mục tiêu của mình.',
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
                                                '- Khả năng bắt chước vượt trội, học nhanh trong môi trường và trong xã hội.',
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
                                                '- Mềm mại, nhẹ nhàng và cởi mở; lãng mạn, thích tự do và chỉ sống cho hiện tại.',
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
                                                '- Hướng tới sự hòa hợp và hòa bình, không thích sự mâu thuẫn, gay gắt hay xung đột.',
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
                                                '- Thuộc mẫu người cộng đồng xã hội thích những nơi đông người, thích nghi trước rồi mới giao tiếp, thích tham gia các hoạt động vì cộng đồng.',
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
                                                '- Cảm xúc, làm theo cảm xúc. Thường quan tâm tới những người xung quanh, dễ cảm thông cho vấn đề của người khác.',
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
                                                '- Suy nghĩ linh hoạt và tương thích, dễ bắt chước hoặc tái tạo ý tưởng của người khác thành ý tưởng của mình.',
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
                                                '- Không có mục tiêu rõ ràng trong tâm trí, tham vọng không lớn.',
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
                                                '- Không có chính kiến, dễ bị tác động bởi những người xung quanh và môi trường.',
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
                                                '- Hay lo chuyện bao đồng.',
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
                                                '- Thụ động, dễ bị áp đặt.',
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
                                                '- Làm việc theo cảm tính, dễ thay đổi nguyên tắc và kế hoạch đã vạch ra.',
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
                                                '- Công việc, kế hoạch có thể bị trì hoãn vì lối sống tình cảm.',
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
                                                '- Làm việc theo cảm tính, dễ thay đổi nguyên tắc và kế hoạch đã vạch ra. Vì vậy nên lập kế hoạch làm việc rõ ràng, chi tiết, tập trung vào mục tiêu và giám sát tiến độ thực hiện. Tham gia các khóa học về ra quyết định và lập mục tiêu.',
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
                                                '- Công việc, kế hoạch có thể bị trì hoãn vì lối sống tình cảm. Chọn một người tri kỷ đáng tin cậy để động viên và khích lệ, đôn đốc việc thực hiện mục tiêu.',
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
                                                '- Chủ động giao tiếp. Tham gia các hoạt động cộng đồng khác nhau, chủ động nhận vị trí lãnh đạo, xây dựng sự tự tin. Tham khảo tự truyện của những người thành công.',
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
                                                '- Học cách nói “không” với người khác một cách thích hợp khi cần thiết.',
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
                                                '- Nước phải tìm cho mình NGƯỜI THẦY: Người Thầy sẽ như vật chứa, có thể định hình giúp NƯỚC. Là người định hướng, chỉ bảo, thúc đẩy, động viên để nước có thể dễ dàng hơn về hướng đi trong cuộc đời mình. Hãy tìm cho mình người Thầy về phát triển bản thân, người thầy về phát triển chuyên môn, phát triển kinh doanh, … .',
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
                                                '- Nước cần phải có MÔI TRƯỜNG TỐT.Nước dễ thích nghi với môi trường. Dễ hòa nhập với môi trường và khả năng sao chép tốt. Chính vì điều đó Nước ở bên cạnh ai, trong môi trường như thế nào nước sẽ dễ dàng trở thành những người tương tự như thế.',
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
                                                '- Nước cần HÌNH TƯỢNG. Nước giỏi sao chép, chính vì vậy nước hãy tìm ra những thần tượng cho mình. Nghiên cứu, tìm hiểu, học hỏi từ họ để tìm ra những triết lý sống, cách thức mà họ đã thành công. Từ đó nước áp dụng bằng khả năng sao chép của chính mình.',
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
                                                '- Chọn bạn mà chơi, chọn nơi mà ở, chọn thầy mà học.',
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
                                      Text('Giao tiếp với với vân LU:',
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
                                                '- Thể hiện sự quan tâm, dành thời gian để hỏi và trả lời, khen ngợi, động viên.',
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
                                                '- Cần làm mẫu cụ thể để dễ dàng bắt nhịp trang học tập.',
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
                                                '- Cần theo dõi, thường xuyên khuyến khích và động viên trẻ kịp thời để truyền sự tự tin, tránh việc bỏ dở nửa chừng theo tâm trạng.',
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
                                                '- Tạo một môi trường kỷ luật nghiêm ngặt.',
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
                                                '- Dùng phương pháp tương tác khi hướng dẫn: thảo luận, để người khác đưa ra câu hỏi và mình trả lời.',
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
