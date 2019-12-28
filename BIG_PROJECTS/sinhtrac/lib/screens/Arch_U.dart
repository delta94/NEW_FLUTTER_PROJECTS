import 'package:firebase_admob/firebase_admob.dart';

import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Arch_U extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Arch_U({
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
        title: Text('Chủng AU', style: TextStyle(color: Colors.yellowAccent),),
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
                      Text("Chủng nước AU", style: TextStyle(color: Colors.cyanAccent, fontWeight: FontWeight.bold, fontSize: 25),),
                      Divider(),
                      Image.asset("images/AU.png", height: 200, width: 150),
                      Image.asset("images/au_draw.JPG", height: 150, width: 200),
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
                                    CommonUI.bulletText(' Sự kết hợp giữa nhóm loop với arch, khoảng cách từ tâm đến giao điểm nhỏ hơn 5 đường vân. Tâm chảy về hướng ngón út'),
                                    Divider(),
                                    CommonUI.bulletText(' Thân thiện, hòa đồng, cởi mở nhưng không giỏi thiết lập các mối quan hệ xã hội, thường không chủ động trong giao tiếp.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thích quan sát.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có tinh thần đồng đội cao, linh hoạt, dễ chấp nhận, hòa nhã.'),
                                    Divider(),
                                    CommonUI.bulletText(' Luôn hướng đến hòa bình, đồng thuận, ghét sự tranh cãi và không thích đối đầu.'),
                                    Divider(),
                                    CommonUI.bulletText(' Là thành viên tốt trong đội nhóm, người chấp hành tốt, khả năng chịu đựng cao.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thích nghi tốt, dễ hòa nhập với từng môi trường. Có tư duy linh hoạt và khả năng tương thích cao.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nhiệt tình, chân thành và dễ cảm thông cho vấn đề của người khác. Rất coi trọng các mối quan hệ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Biết lắng nghe và chấp nhận ý kiến của người khác.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khéo léo trong cách cư xử, bằng cách nào đó chiều ý những người khác.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chu đáo, biết quan tâm tới mọi người, sống tình cảm, thích tự do.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không giỏi sáng tạo, tuy nhiên học hỏi rất nhanh từ môi trường, dễ bắt chước và mô phỏng tốt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Luôn quan tâm đến cảm nhận, đánh giá của người khác về mình.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thích làm việc một cách ngăn nắp, dễ bị ảnh hưởng từ môi trường.'),
                                    Divider(),
                                    CommonUI.bulletText(' Luôn muốn được khen ngợi, khích lệ và ghi nhận.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hiếm khi đặt ra những mục tiêu lớn, luôn biết tận hưởng cuộc sống.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nếu có trí nhớ tốt thì sẽ càng hỗ trợ nhiều trong lĩnh vực y học.'),
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
                                    CommonUI.bulletText(' Nếu có trí nhớ tốt thì sẽ càng hỗ trợ nhiều trong lĩnh vực y học.'),
                                    Divider(),
                                    CommonUI.bulletText(' Họ là người rất có tránh nhiệm trong công việc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thuộc về mẫu tính cách chăm chỉ, cần cù, chi tiết, tỉ mỉ. Hoàn thành công việc theo phong cách từng bước một. Đi theo quy trình cụ thể và chỉ tin những bằng chứng kết quả được chứng minh.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chân thành, đáng tin cậy, trung thành, tuân thủ các quy tắc, thực tế trong công việc.'),
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
                                    CommonUI.bulletText(' Nên theo các ngành liên quan đến lĩnh vực y học.'),
                                    
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Giao tiếp với với chủng AU:', 3, -1,
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