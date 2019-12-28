import 'package:firebase_admob/firebase_admob.dart';

import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Whorl_D extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Whorl_D({
    Key key,
    this.title,
    this.message,
  }) : super(key: key);
  

  @override
  Widget build(BuildContext context) {
    Ads.hideBanner2Ad();
    Ads.showBanner3Ad();
    
    
    
    PageController _textController = PageController(initialPage: 0, keepPage: false);
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));
    return Scaffold(
      appBar: AppBar(
        title: Text('Chủng WD', style: TextStyle(color: Colors.yellowAccent),),
        iconTheme: new IconThemeData(color: Colors.yellowAccent),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
        actions: <Widget>[
            // action button
            IconButton(
              icon: Icon(Icons.home),
              onPressed: () {
                Ads.hideBanner3Ad();
                Ads.showBanner2Ad();
                Navigator.of(context).pushNamedAndRemoveUntil('/', ModalRoute.withName('/whorls'));   
              },
            )
        ]
      ),
      body: new Stack(
        children: <Widget>[
          new Container(
            decoration: new BoxDecoration(
              image: new DecorationImage(image: new AssetImage('images/bg.png'), fit: BoxFit.cover,),
            ),
          ),
          new Container(
            padding: EdgeInsets.only(left: 10, right: 10, top: 40),
            margin: EdgeInsets.only(bottom: 0),
            child: Center(
              child: ListView(
                children: <Widget>[
                  Center(
                    child: Column(children: <Widget>[
                      Divider(),
                      Text("Chủng đại bàng WD", style: TextStyle(color: Colors.red, fontWeight: FontWeight.bold, fontSize: 25),),
                      Divider(),
                      Column(children: <Widget>[
                        Image.asset("images/WD.png", height: 200, width: 150),
                        Image.asset("images/wd_draw.JPG", height: 150, width: 200),
                      ],),
                      Text('ĐẶC ĐIỂM:', style: TextStyle(color: Colors.redAccent, fontSize: 17, fontWeight: FontWeight.bold)),
                      Container(
                        height: 1000.0,
                        margin: EdgeInsets.symmetric(vertical: 5.0),
                        child:  SafeArea(
                          child: PageView(
                            controller: _textController,
                            children: <Widget>[
                              CommonUI.textCard('Đặc tính:', -1, 1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' 2 tâm, 2 giao điểm – hình dạng hai dấu móc ngược nhau.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có thể tương tác và đa dạng đối tượng, thuận lợi trong các lĩnh vực giao tiếp và quan hệ công chúng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thích ứng cao với môi trường , hội nhập nhanh. Có thể thích nghi và chấp nhận những điều mới mẻ, những ý tưởng và khái niệm mới dễ dàng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Suy nghĩ theo nhiều chiều hướng, đa góc nhìn. Luôn có “phương án B”, thực hiện nhiều phương pháp khác nhau để đạt được mục tiêu.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tò mò, hứng thú nhiều lĩnh vực, thích điều mới mẻ và sự đổi mới. Có xu hướng theo đuổi nhiều mục tiêu, khó khăn trong việc kiểm soát quá trình thực hiện.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thiên hướng suy nghĩ quá nhiều dẫn đến sự mất tập trung và thay đổi mục tiêu hay định hướng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Dễ bị người khác ảnh hưởng và làm lung lay. Hay do dự, lưỡng lự khi suy nghĩ ở nhiều khía cạnh khác nhau.'),
                                    Divider(),
                                    CommonUI.bulletText(' Linh hoạt, có nhiếu cách ứng xử khác nhau, thay đổi nguyên tắc và lập trường tùy thuộc vào tình thế.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có khả năng mở rộng và liên kết thông tin, khéo léo hài hòa giữa nguồn lực và thông tin.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nóng tính nhưng có thể kiểm soát được.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đề cao tinh thần hợp tác đội nhóm, thích hỏi và chia sẻ quan điểm với mọi người xung quanh.'),
                                    Divider(),
                                    CommonUI.bulletText(' Luôn muốn được khen ngợi và tôn trọng.'),
                                    
                                    // Divider(),
                                    // CommonUI.bulletText(' Wt khó chia sẻ và khó thổ lộ.'),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Ưu điểm:', 0, 2,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Mẫu người thân thiện, nhiệt tình. Có tố chất, năng lực và nhiều kỹ năng, thường giỏi ở nhiều mặt và hứng thú với nhiều lĩnh vực khác.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có khả năng giao tiếp tốt, thích chia sẻ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có khả năng giải quyết vấn đề theo nhiều chiều hướng khác nhau bằng nhiều cách khác nhau.'),
                                    Divider(),
                                    CommonUI.bulletText(' Rất linh hoạt và thoải mái, thích nghi tốt ở mọi hoàn cảnh khác nhau "ở bầu thì tròn, ở ống thì dài".'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Nhược điểm:', 1, 3,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Có thể đạt được những thành quả cao từ những việc bạn cảm thấy hứng thú, tuy nhiên rất mau chóng chán nản và thường không làm đến nơi đến chốn. Khó tập trung.'),
                                    Divider(),
                                    CommonUI.bulletText(' Việc tập trung quá nhiều mục tiêu cùng một lúc sẽ khó đạt được mục tiêu hoàn hảo.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không thích thảo kế hoạch, thường làm theo phong cách "nước đến chân mới nhảy".'),
                                    Divider(),
                                    CommonUI.bulletText(' Không thích làm những công việc đòi hỏi sự lặp đi lặp lại mang tính khuôn khổ.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Phương hướng phát triển bản thân:', 2, 4,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Giỏi giao tiếp nên sẽ là 1 người sale đại tài'),
                                    Divider(),
                                    CommonUI.bulletText(' Kế hoạch phải được lập trước thật rõ ràng, cụ thể để nhìn rõ vấn đề, giá trị, mục tiêu của mỗi việc mình chọn làm.'),
                                    Divider(),
                                    CommonUI.bulletText(' Học và thực hành phương pháp quản lý tốt thời gian, Ưu tiên công việc theo tầm quan trọng và độ cấp bách. Thực hiện lần lượt từng việc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tăng cường kỹ năng chuyên môn. Tránh việc trở thành “thợ” của tất cả ngành nghề mà không chuyên về nghề nào cụ thể.'),
                                    Divider(),
                                    CommonUI.bulletText(' Duy trì tính nhất quán của các nguyên tắc và quan điểm.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tự tạo môi trường làm việc thoải mái.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hạn chế suy nghĩ quá nhiều dễ dẫn đến mệt mỏi, kiệt sức, hoang mang.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chia sẻ trở ngại với những người xung quanh để cùng nhau tìm giải pháp.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Giao tiếp với với chủng WD:', 3, -1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Tôn trọng và chỉ nên đề cập khuyết điểm/ lỗi sai của họ ở nơi riêng tư.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hướng dẫn phương pháp học tập kết hợp: vừa đa dạng vừa chuyên sâu.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hướng dẫn và chỉ dạy cách quản lý thời gian cho chủng WD từ sớm và có mốc hoàn thành'),
                                    Divider(),
                                    CommonUI.bulletText(' Khen ngợi và có thưởng nếu chủng WD hoàn thành tốt nhiệm vụ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đưa ra lựa chọn cùng lợi ích của việc cần làm thay vì đưa ra mệnh lệnh trực tiếp.'),
                                    Divider(),
                                    CommonUI.bulletText(' Định hướng và tập cho trẻ tự ra quyết định.'),
                                  ]
                                ), _textController
                              ),
                            ],
                          ),
                        )
                      )
                    ],)
                  ),
                ])
                )
              )
        ])
    );
  }
}