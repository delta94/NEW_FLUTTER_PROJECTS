import 'package:firebase_admob/firebase_admob.dart';

import 'package:firebase_admob/firebase_admob.dart';
import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Arch_R extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Arch_R({
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
        title: Text('Chủng AR', style: TextStyle(color: Colors.yellowAccent),),
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
                      Text("Chủng nước AR", style: TextStyle(color: Colors.cyanAccent, fontWeight: FontWeight.bold, fontSize: 25),),
                      Divider(),
                      Image.asset("images/AR.png", height: 200, width: 150),
                      Image.asset("images/ar_draw.JPG", height: 150, width: 200),
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
                                    CommonUI.bulletText(' Sự kết hợp giữa nhóm loop với arch, khoảng cách từ tâm đến giao điểm nhỏ hơn 5 đường vân. Tâm chảy về hướng ngón cái'),
                                    Divider(),
                                    CommonUI.bulletText(' Tiềm năng lớn, khả năng hấp thu dường như vô hạn. Hấp thu kiến thức như một miếng bọt biển.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thận trọng việc ra quyết định, không thích thể hiện, giỏi trong việc giám sát. '),
                                    Divider(),
                                    CommonUI.bulletText(' Không thích lý luận trừu tượng, thích mọi thứ đơn giản, thực tế, thẳng đến mục tiêu.'),
                                    Divider(),
                                    CommonUI.bulletText(' Dễ dàng từ bỏ một khi không nhận được kết quả mong đợi.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tỉ mỉ, khả năng chi tiết hóa, sắc bén trong đánh giá công việc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có xu hướng đặt nhiều câu hỏi. Chỉ tin khi đã trải nghiệm, học từ kinh nghiệm.'),
                                    Divider(),
                                    CommonUI.bulletText(' Học tập theo phong cách đơn giản, lặp đi lặp lại thường xuyên.'),
                                    Divider(),
                                    CommonUI.bulletText(' Làm từng bước, sắp xếp mọi việc theo thứ tự, có hệ thống. Nghiêm túc, có trách nhiệm, chân thành.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có tư duy độc đáo, khác biệt và phá cách, đôi khi bị cho là lập dị.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tò mò, thích những điều thử thách, mới mẻ và huyền bí.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có khả năng giải nghĩa, lý luận và có lối suy luận ngược.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nhạy cảm, dễ bị kích động về mặt cảm xúc, tự mâu thuẫn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nếu họ tập trung vào một lĩnh vực, họ sẽ trở nên rất uyên thâm và trở thành chuyên gia trong lĩnh vực đó.'),
                                    
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Ưu điểm:', 0, 2,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Là người rất uyên thâm, giỏi về những lĩnh vực trừu tượng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hấp thụ kiến thức vô hạn như một miếng bọt biển thấm nước.'),
                                    Divider(),
                                    CommonUI.bulletText(' Là người có chủ nghĩa an toàn và thiết thực, tiếp cận trực tiếp với các công việc, nhiệm vụ, có thể tin cậy được.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thích sự ổn định, yên bình. Chăm chỉ làm những công việc được lặp đi lặp lại hằng ngày.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khả năng sáng tạo, đổi mới, đặc biệt trong lĩnh vực kỹ sư, khoa học và công nghệ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Họ là người rất có tránh nhiệm trong công việc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thuộc về mẫu tính cách chăm chỉ, cần cù, chi tiết, tỉ mỉ. Hoàn thành công việc theo phong cách từng bước một. Đi theo quy trình cụ thể và chỉ tin những bằng chứng kết quả được chứng minh.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chân thành, đáng tin cậy, trung thành, tuân thủ các quy tắc, thực tế trong công việc.'),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
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
                                    CommonUI.bulletText(' Khi được đặt trong một môi trường mới, người có chủng AU sẽ dễ dàng cảm thấy e thẹn, nhút nhát và bị động.'),
                                    Divider(),
                                    CommonUI.bulletText(' Dễ từ bỏ công việc hoặc học hành nếu không nhận được kết quả mong đợi sau 1 khoảng thời gian hoặc không nhận được sự động viên từ người khác.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khi cảm xúc bùng nổ thì như ngọn núi lửa.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Phương hướng phát triển bản thân:', 2, 4,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Phù hợp với phong cách giảng dạy MỘT – MỘT. Người có chủng vân tay núi AU cần đặc biệt lưu ý đến đặc điểm này để trẻ học tập tốt hơn. Núi hay đặt ra các câu hỏi và thắc mắc liên tục, đòi hỏi cha mẹ và người huấn luyện kiên nhẫn giải đáp các thắc mắc của núi một cách tỉ mỉ và chậm rãi'),
                                    Divider(),
                                    CommonUI.bulletText(' Để học tập và làm việc tốt hơn, cần thực hành nhiều lần trong học tập cũng như công việc cần thực hành nhiều.'),
                                    Divider(),
                                    CommonUI.bulletText(' Học theo quy trình hoặc phương pháp mà bản thân chấp nhận và tin tưởng trước sử dụng phương pháp này như một cuốn “kim chỉ nam”.'),
                                    Divider(),
                                    CommonUI.bulletText(' Lập kế hoạch học tập, tìm hiểu quy trình và học hỏi phương pháp từ các chuyên gia xuất sắc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nên theo các ngành liên quan đến: kỹ sư, khoa học và công nghệ.'),

                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Giao tiếp với với chủng AR:', 3, -1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Cần sự hỗ trợ ban đầu để giao tiếp tốt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Sống theo phong thái TỪNG BƯỚC  trong giao tiếp hay các vấn đề của cuộc sống.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tránh gây áp lực nếu không sẽ có những phản ứng cảm xúc bùng nổ tức thì.'),
                                    Divider(),
                                    CommonUI.bulletText(' Người có chủng vân tay AU khó để tiếp xúc. Nhưng khi đã có sự gắn kết nhất định thì AU – AR có khả năng duy trì mối quan hệ lâu bền, gắn kết.'),

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