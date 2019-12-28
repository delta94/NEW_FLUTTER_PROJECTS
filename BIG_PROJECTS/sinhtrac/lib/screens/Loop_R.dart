import 'package:firebase_admob/firebase_admob.dart';

import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Loop_R extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Loop_R({
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
        title: Text('Chủng LR', style: TextStyle(color: Colors.yellowAccent),),
        iconTheme: new IconThemeData(color: Colors.yellowAccent),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
        actions: <Widget>[
            // action button
            IconButton(
              icon: Icon(Icons.home),
              onPressed: () {
                Ads.hideBanner3Ad();
                Ads.showBanner2Ad();
                Navigator.of(context).pushNamedAndRemoveUntil('/', ModalRoute.withName('/loops'));   
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
                      Text("Chủng nước LR", style: TextStyle(color: Colors.cyanAccent, fontWeight: FontWeight.bold, fontSize: 25),),
                      Divider(),
                      Column(children: <Widget>[
                        Row(
                          mainAxisAlignment: MainAxisAlignment.spaceAround,
                          children: <Widget>[
                            Column(children: <Widget>[
                              Image.asset("images/RL_left.png", height: 200, width: 150),
                              Text('Tay Trái', style: TextStyle(color: Colors.white, fontWeight: FontWeight.bold),)
                            ],),
                            Column(children: <Widget>[
                              Image.asset("images/RL_right.png", height: 200, width: 150),
                              Text('Tay Phải', style: TextStyle(color: Colors.white, fontWeight: FontWeight.bold),)
                            ],),
                          ],
                        ),
                        Image.asset("images/rl_draw.JPG", height: 200, width: 150),
                      ],),
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
                                    CommonUI.bulletText(' Xác suất xuất hiện: 5%. Hình dạng như dòng nước chảy xuôi về phía ngón tay cái. Hay còn được gọi là chủng vân tay NƯỚC NGƯỢC.'),
                                    Divider(),
                                    CommonUI.bulletText(' Là một trong những chủng mạnh, là chủng rất thông minh. Vẫn có tính cách của Loop nói chung.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hòa đồng, thân thiện nhưng ít khi chủ động tạo mối quan hệ. Giao tiếp theo phong cách cởi mở.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nhạy cảm trong giao tiếp, quan sát rất sắc bén.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thường không được sự hưởng ứng của mọi người xung quanh và dễ bị cô lập.'),
                                    Divider(),
                                    CommonUI.bulletText(' Mong muốn tự do, không thích bị ràng buộc trong khuôn khổ truyền thống.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có tính hài hước.'),
                                    Divider(),
                                    CommonUI.bulletText(' “Suy nghĩ ngoài chiếc hộp”. Có tư duy độc đáo, khác biệt và phá cách, đôi khi bị cho là lập dị.'),
                                    Divider(),
                                    CommonUI.bulletText(' Theo đuổi sự độc đáo và khác biệt. Khát khao tự do, mong muốn phá vỡ truyền thống.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tư tưởng chống đối, không bao giờ thỏa hiệp với những gì mà họ không mong đợi.'),
                                    Divider(),
                                    CommonUI.bulletText(' Học hỏi rất nhanh từ môi trường và xã hội, dễ nắm bắt và mô phỏng tốt.'),
                                    Divider(),
                                    CommonUI.bulletText(' hông thể chịu đựng cuộc sống gò bó, đơn giản và buồn tẻ. Thích những điều thử thách, mới mẻ và huyền bí.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đầy sáng tạo, đưa ra giải pháp nhanh và hiệu quả tại thời điểm khủng hoảng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tư duy ngược, suy nghĩ vượt giới hạn và luôn đột phá những sáng tạo mới.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không quan tâm đến cách đánh giá của người khác, chỉ làm những điều họ muốn làm.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cực kì tò mò, giỏi trong việc giải nghĩa, lý luận và có lối suy luận ngược.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chu đáo, chân thành, sống tình cảm, biết quan tâm mọi người. Dễ bị kích động về mặt cảm xúc.'),
                                    
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Ưu điểm:', 0, 2,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Tính cách và phong cách mạnh mẽ và độc đáo, khó chấp nhận lối suy nghĩ bình thường hay chậm chạp; ghét những gì bình thường.'),
                                    Divider(),
                                    CommonUI.bulletText(' Năng lực sáng tạo rất cao, khả năng quan sát sắc bén, khả năng cảm nhận và thấu hiểu cao.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thích suy luận, có khả năng làm việc một cách hiệu quả và kiểm soát mọi việc vào phút chót theo kiểu nước đến chân mới nhảy tốt hơn các kiểu vân tay khác.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có khả năng tranh luận và phản biện rất tốt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đại diện cho mẫu người đấu tranh vì hòa bình, dám đứng lên vì quyền lợi của người khác hay bản thân mình.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hứng thú với những điều huyền bí.'),
                                    
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Nhược điểm:', 1, 3,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Không thể chịu đựng cuộc sống gò bó, đơn giản và buồn tẻ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thường gây sốc người khác bằng ngôn từ của mình. Dám nghĩ dám làm đôi khi trở thành lập dị.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tư tưởng chống đối, không bao giờ thỏa hiệp với những gì mà họ không mong đợi.'),
                                    Divider(),
                                    CommonUI.bulletText(' Vì đa phần suy nghĩ và hành động ngược lại với số đông nên nếu không cân bằng thì dễ làm bất hòa giữa các mối quan hệ xung quanh trong công việc và cuộc sống.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cái tôi lớn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thích làm mọi công việc với những suy nghĩ đối lập, hay phán đoán.'),
                                    Divider(),
                                    CommonUI.bulletText(' Vì đa phần suy nghĩ và hành động ngược lại với số đông nên nếu không cân bằng thì dễ làm bất hòa giữa các mối quan hệ xung quanh trong công việc và cuộc sống.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Phương hướng phát triển bản thân:', 2, 4,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Chấp nhận các đặc tính độc đáo của mình cũng như của người khác.'),
                                    Divider(),
                                    CommonUI.bulletText(' Phát huy sự nhiệt tình đặt câu hỏi.'),
                                    Divider(),
                                    CommonUI.bulletText(' Làm việc theo cảm tính, dễ thay đổi nguyên tắc và kế hoạch đã vạch ra. Vì vậy nên lập kế hoạch làm việc rõ ràng, chi tiết, tập trung vào mục tiêu và giám sát tiến độ thực hiện.'),
                                    Divider(),
                                    CommonUI.bulletText(' Học để trở thành người hướng dẫn và chịu trách nhiệm với quy trình làm việc, đưa ra giải pháp cho vấn đề phát sinh.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thường quyết định theo chủ quan cá nhân và cảm xúc nhất thời nên có thể gây ảnh hưởng đến hiệu quả công việc hoặc mối quan hệ. Do đó nên lắng nghe và cân nhắc kỹ trước khi ra quyết định.'),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Giao tiếp với với chủng LR:', 3, -1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Khi giao tiếp với mẫu người này, cần chân thành, nhẹ nhàng để tạo sự tin tưởng, giúp cuộc nói chuyện cởi mở và hiệu quả hơn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thể hiện sự quan tâm, dành thời gian để hỏi và trả lời, không ngắt lời họ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chấp nhận sự độc đáo, sáng tạo của họ hơn là áp đặt họ trở thành ai đó.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tránh việc thiếu tôn trọng ý kiến hoặc ép buộc họ phải làm vì sẽ ảnh hưởng ngược đến kết quả hành động.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cần làm mẫu để dễ dàng bắt nhịp trong học tập. Những hoạt động khơi nguồn cảm hứng và sáng tạo là rất cần thiết.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khuyến khích hỏi và kiên nhẫn trả lời, giúp bản thân tự tìm ra câu trả lời.'),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
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