import 'package:firebase_admob/firebase_admob.dart';

import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Arch_T extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Arch_T({
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
        title: Text('Chủng AT', style: TextStyle(color: Colors.yellowAccent),),
        iconTheme: new IconThemeData(color: Colors.yellowAccent),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
        actions: <Widget>[
            // action button
            IconButton(
              icon: Icon(Icons.home),
              onPressed: () {
                Ads.hideBanner3Ad();
                Ads.showBanner2Ad();
                Navigator.of(context).pushNamedAndRemoveUntil('/', ModalRoute.withName('/archs'));   
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
                      Text("Chủng nước AT", style: TextStyle(color: Colors.cyanAccent, fontWeight: FontWeight.bold, fontSize: 25),),
                      Divider(),
                      Image.asset("images/AT.png", height: 200, width: 150),
                      Image.asset("images/at_draw.JPG", height: 150, width: 200),
                      Text('ĐẶC ĐIỂM:', style: TextStyle(color: Colors.cyanAccent, fontSize: 17, fontWeight: FontWeight.bold)),
                      Container(
                        height: 1200.0,
                        margin: EdgeInsets.symmetric(vertical: 5.0),
                        child:  SafeArea(
                          child: PageView(
                            controller: _textController,
                            children: <Widget>[
                              CommonUI.textCard('Đặc tính:', -1, 1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Dạng hình trục đối xứng như túp lều.'),
                                    Divider(),
                                    CommonUI.bulletText(' Là một chủng thông minh. Tiềm năng lớn, khả năng hấp thu dường như vô hạn. Hấp thu kiến thức như một miếng bọt biển.'),
                                    Divider(),
                                    CommonUI.bulletText(' Theo phong cách chậm mà chắc. Thận trọng việc ra quyết định, không thích thể hiện, giỏi trong việc giám sát.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không thích lý luận trừu tượng, thích mọi thứ đơn giản, thực tế, thẳng đến mục tiêu.'),
                                    Divider(),
                                    CommonUI.bulletText(' Dễ dàng từ bỏ một khi không nhận được kết quả mong đợi.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không quan tâm nhiều về ý kiến người khác. Tỉ mỉ, khả năng chi tiết hóa, sắc bén trong đánh giá công việc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có xu hướng đặt nhiều câu hỏi. Chỉ tin khi đã trải nghiệm, học từ kinh nghiệm. Học tập theo phong cách đơn giản, lặp đi lặp lại thường xuyên.'),
                                    Divider(),
                                    CommonUI.bulletText(' Làm từng bước, sắp xếp mọi việc theo thứ tự, có hệ thống. Nghiêm túc, có trách nhiệm, chân thành.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thích cuộc sống đơn giản, không có tham vọng và không thực dụng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không thể giải quyết những khủng hoảng đột ngột mà phải dựa vào những kinh nghiệm trước.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nhạy cảm, cảm xúc và bốc đồng. Tuy nhiên khó thể hiện cảm xúc ra bên ngoài hay thổ lộ bằng lời nói.'),
                                    Divider(),
                                    CommonUI.bulletText(' Là một người khá bảo thủ.'),
                                    
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Ưu điểm:', 0, 2,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Hơi nhút nhát, e ngại trong môi trường mới. Tuy nhiên khi kết bạn thì là một người bạn trung thành đáng tin.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có khả năng làm những việc đòi hỏi sự tỉ mỉ, cẩn thận và chi tiết.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khó tin tưởng điều gì đó khi chưa có bằng chứng cụ thể.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có khả năng chi tiết hóa tuyệt vời. Bạn có thể ngồi hàng giờ và liên tục làm những việc lặp đi lặp lại một cách hệ thống, máy móc.'),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Nhược điểm:', 1, 3,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Khả năng kiểm soát cảm xúc yếu, dễ nổ tung.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thường có tình bốc đồng, dễ bỏ cuộc giữa chừng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không giỏi giao tiếp mặc dù thân thiện nhưng họ vẫn yêu thích sự khép kín.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không dễ nóng tính nhưng khi nóng giận thì họ sẽ trở thành ngọn núi lửa phun trào và tàn phá.'),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Phương hướng phát triển bản thân:', 2, 4,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Chủng Arch có tiềm năng vô hạn, nên phải tận dụng mọi cơ hội để học hỏi và phát triển càng sớm càng tốt.'),
                                    Divider(),
                                    CommonUI.bulletText(' AT nên tham gia các khóa đào tạo sâu về chuyên môn, đọc nhiều sách để mở rộng kiến thức.'),
                                    Divider(),
                                    CommonUI.bulletText(' AT cần học cách thiết lập các mục tiêu, kiên trì theo đuổi và không viện lý do để từ bỏ.'),
                                    Divider(),
                                    CommonUI.bulletText(' AT nên giảm xu hướng tự thu mình, chủ động gặp gỡ những người thành công để chia sẻ, học hỏi và phát triển bản thân.'),
                                    Divider(),
                                    CommonUI.bulletText(' AT cần trao dồi kỹ năng nói trước đám đông.'),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Giao tiếp với với chủng AT:', 3, -1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Khi tương tác với AT cần ngắn gọn, đơn giản, đi thẳng vào vấn đề chính.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không dồn ép AT hứa hẹn hoặc ra quyết định ngay lập tức.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nên thông báo và giải thích lý do nếu có bất kỳ sự thay đổi nào trong kế hoạch đã định trước với AT.'),
                                    Divider(),
                                    CommonUI.bulletText(' Học bằng cách thực hành, trải nghiệm (hỏi – trả lời/ mô tả, thi đua, trò chơi). Chia nhỏ bài học, làm từng bước, lặp đi lặp lại. Tốt nhất là được huấn luyện kèm cặp 1-1.'),
                                    Divider(),
                                    CommonUI.bulletText(' Động viên, khen thưởng kịp thời, ngay cả khi bản thân đạt được tiến bộ nhỏ để tăng động lực học tập.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nên có những câu hỏi dẫn dắt để khơi gợi câu trả lời của cá nhân, tập cho bản thân cách chia sẻ dễ dàng hơn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khi kết quả thực hiện thấp, nhờ mọi người xung quanh chỉ ngay cho mình chỗ sai, đưa ra cách tiếp cận đúng và sửa đổi ngay lập tức.'),
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