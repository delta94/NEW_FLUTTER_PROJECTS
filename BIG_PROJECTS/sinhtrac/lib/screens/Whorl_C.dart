import 'package:firebase_admob/firebase_admob.dart';

import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Whorl_C extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Whorl_C({
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
        title: Text('Chủng WC', style: TextStyle(color: Colors.yellowAccent),),
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
                      Text("Chủng đại bàng WC", style: TextStyle(color: Colors.red, fontWeight: FontWeight.bold, fontSize: 25),),
                      Divider(),
                      Column(children: <Widget>[
                        Image.asset("images/WC.png", height: 230, width: 330),
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
                                    CommonUI.bulletText(' 2 tâm, 2 giao điểm – hai dòng xoáy tạo thành vòng tròn thái cực xoáy tròn vào nhau.'),
                                    Divider(),
                                    CommonUI.bulletText(' Người có cái nhìn đa chiều về một vấn đề, cũng từ đó bạn có thể đọc vị được cảm xúc và nhu cầu của người đối diện.'),
                                    Divider(),
                                    CommonUI.bulletText(' Trong những mối quan hệ hay công việc, bạn nhìn rõ ràng được đâu là điểm mạnh và đâu là điểm chưa mạnh trong đó và cũng chính từ đó bạn có thể đọc vị rõ ràng được vấn đề và nhu cầu của mối quan hệ hay công việc đó. Đây là điểm mạnh tuyệt vời mà không phải ai cũng có được.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cũng chính từ sự hướng ngoại, linh hoạt, giao tiếp trung tính và khả năng nhìn nhận đa chiều vấn đề mà WC có tố chất về đàm phán, thương lượng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Ở mặt khác, bạn là người đa mục tiêu, đa kế hoạch và thích làm nhiều việc cùng một lúc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khi bạn vào làm rồi, dù làm được hay không làm được thì bạn hay bị cả thèm chóng chán và hay thích đổi mới công việc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Là những người hay suy nghĩ nhiều, điều đó dẫn đến mệt mỏi cho bạn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Bạn hứng thú với những thử thách, khám phá những điều mới lạ và có phong cách độc đáo. Đó cũng chính là những KEY giúp bạn có những bước tiến đột phá trong đời.'),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Ưu điểm:', 0, 2,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Đa mục tiêu, có sự đa dạng trong các kế hoạch, có thể cùng đồng thời thực hiện và làm nhiều việc khác nhau cùng một lúc, nhiều mục tiêu.', Colors.white),
                                    Divider(),
                                    CommonUI.bulletText(' Nhiệt tình, thân thiện, thiết lập mối quan hệ nhanh chóng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có khả năng nhìn thấy hai mặt của một vấn đề.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khả năng giao tiếp, phối hợp, thương lượng tốt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Sống tình cảm, thích chia sẻ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Dễ thích nghi, thích tự do, không ràng buộc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Suy nghĩ nhiều, PR tốt, giàu ý tưởng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đề cao tinh thần hợp tác đội nhóm, thích hỏi và chia sẻ quan điểm với mọi người xung quanh. Khả năng phối hợp trong công việc cao.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Nhược điểm:', 1, 3,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Làm việc theo phong cách “ nước đến chân mới nhảy”.'),
                                    Divider(),
                                    CommonUI.bulletText(' Do dự, tiêu chuẩn kép.'),
                                    Divider(),
                                    CommonUI.bulletText(' Dễ thay đổi, thiếu kế hoạch.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đốt cháy giai đoạn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đa mục tiêu đôi khi dễ bị lan man, mất tập trung.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hay suy nghĩ nhiều, điều đó dẫn đến mệt mỏi cho bạn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chủng WC không phải là nhóm người quyết đoán, thường xuyên chần chừ, dễ thay đổi, họ làm việc theo cảm xúc, ít khi lập kế hoạch lâu dài.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Phương hướng phát triển bản thân:', 2, 4,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Nên học cách lập kế hoạch trong công việc cũng như cuộc sống, làm lần lượt từng công việc một thay vì ôm đồm cùng lúc nhiều việc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khả năng giao tiếp của WC rất tốt nên đừng quên tận dụng điểm mạnh này của mình để tiến xa hơn trong sự nghiệp.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có tố chất về đàm phán, thương lượng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hãy đổi mới cách làm việc, bối cảnh làm việc chứ đừng nên đổi mới công việc nếu như thực sự mình chưa cần đổi mới.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hãy biết cách phân tích được mất trong vấn đề, hay nhiều việc có thể xét trên góc độ việc bắt buộc, cần hay nên làm.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hãy biết thách thức chính bản thân mình liên tục để tạo ra những sức bật của cuộc đời.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Giao tiếp với với chủng WC:', 3, -1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Không nên áp đặt, nên thông báo và thảo luận trước kế hoạch. Đưa ra sự lựa chọn cùng lợi ích việc cần làm thay vì mệnh lệnh.'),
                                    Divider(),
                                    CommonUI.bulletText(' Định hướng và theo sát kế hoạch, và có mốc thời gian hoàn thành.'),
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