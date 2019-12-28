import 'package:firebase_admob/firebase_admob.dart';

import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Whorl_P extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Whorl_P({
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
        title: Text('Chủng WP', style: TextStyle(color: Colors.yellowAccent),),
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
                      Text("Chủng đại bàng WP", style: TextStyle(color: Colors.red, fontWeight: FontWeight.bold, fontSize: 25),),
                      Divider(),
                      Column(children: <Widget>[
                        Image.asset("images/UWP.png", height: 200, width: 150),
                        Image.asset("images/wp_draw.JPG", height: 150, width: 200),
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
                                    CommonUI.bulletText(' Xác suất xuất hiện: 2%. Tâm tròn như mắt công, giao điểm gần nhất cách tâm ≤ 5 vân (Hoa tay)'),
                                    Divider(),
                                    CommonUI.bulletText(' Cầu toàn, tiêu chuẩn cao, để ý đến từng chi tiết. Theo đuổi sự độc đáo, khác biệt và đại diện cho mẫu người theo chủ nghĩa hoàn hảo.'),
                                    Divider(),
                                    CommonUI.bulletText(' Sắc sảo trong nhận thức, khéo léo trong giao tiếp, có khả năng xoay chuyển tình thế. Là một nhà lãnh đạo độc đáo, lôi cuốn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có khả năng thuyết phục người khác bằng niềm tin và quan điểm của mình.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có năng lực dự đoán, tạo ra hay khám phá ra thị trường mới.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có khả năng tốt trong việc nhận diện hoặc tạo ra sự khác biệt, hình thành ý tưởng mới.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tự tin, lạc quan, chủ động và quyết liệt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cạnh tranh mạnh mẽ, nỗ lực để chiến thắng và thành công. Vận dụng nhiều cách khác nhau để đạt mục tiêu.'),
                                    Divider(),
                                    CommonUI.bulletText(' Quan tâm đến mọi người xung quanh, không bướng bỉnh.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nhạy cảm , tinh tế với cái đẹp. Thiên hướng nghệ thuật và ý thức về thẩm mỹ tốt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đề cao tác phong chuyên nghiệp, để ý xây dựng hình tượng cá nhân và hoàn thiện bản thân.'),
                                    Divider(),
                                    CommonUI.bulletText(' Kiêu hãnh, tự hào về bản thân. Quyến rũ, thu hút người đối diện.'),
                                    Divider(),
                                    CommonUI.bulletText(' Là người có năng lượng rất trong sạch.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khả năng dẫn dắt và tư duy sáng tạo.'),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Ưu điểm:', 0, 2,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Người sở hữu chủng vân tay WP, có nét tính cách tinh tế thiên bẩm, khả năng hoạt ngôn sắc sảo và có thiên hướng cảm thụ nghệ thuật rất tốt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Người mang chủng vân tay WP có khả năng tuyệt vời trong việc quan sát các chi tiết. Từ cảm xúc, thái độ, cử chỉ tới hành động của người đối diện dù là nhỏ nhất.'),
                                    Divider(),
                                    CommonUI.bulletText(' Họ có khả năng truyền cảm hứng đến mọi người xung quanh. Có khả năng dùng quan điểm riêng của mình để thuyết phục người khác rất tốt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Họ có tư duy sáng tạo và hình thành ý tưởng mới rất tốt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Họ luôn nỗ lực trong công việc, có tinh thần cạnh tranh mạnh mẽ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Biết vận dụng nhiều phương pháp linh hoạt khác nhau để đạt được mục tiêu đề ra.'),
                                    Divider(),
                                    CommonUI.bulletText(' Một đặc điểm nổi bật của chủng vân tay WP, đó chính là sự cầu toàn. Điều này được thể hiện một cách rõ ràng, trong sự chu đáo hoàn thành tất cả mọi việc đầy trách nhiệm. Bởi họ luôn quan tâm đến sự đánh giá của mọi người về mình.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Nhược điểm:', 1, 3,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Họ thường có xu hướng đặt mình ở vị trí cao hơn những người xung quanh. Trong một vài trường hợp họ thường rất tự hào về bản thân.'),
                                    Divider(),
                                    CommonUI.bulletText(' Kỹ tính, cái gì cũng phải hoàn hảo.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nếu làm việc với người này sẽ khá áp lực.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tự cao tự đại.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Phương hướng phát triển bản thân:', 2, 4,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Lắng nghe và cảm nhận nhiều hơn, tránh việc ép buộc người khác theo tiêu chuẩn và mong đợi riêng của bản thân sẽ giúp có được mối quan hệ tốt đẹp với mọi người.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cần cân nhắc giữa lợi ích bản thân và lợi ích của người khác, đặt mình vào vị trí của người khác để hiểu họ hơn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chú ý đến giá trị và điểm mạnh hơn là tập trung vào lỗi sai của người khác, giảm đi cách nhìn tiêu cực.'),
                                    Divider(),
                                    CommonUI.bulletText(' Giữ một thái độ cởi mở để tránh những trường hợp bị cho là kiêu ngạo do vô ý.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tham gia nhiều hoạt động cộng đồng; Cải thiện, nâng cao các kỹ năng tương tác giao tiếp.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Giao tiếp với với chủng WP:', 3, -1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Khi giao tiếp với người có chủng Wp, cần ngắn gọn, tập trung vào vấn đề chính.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tôn trọng họ trong việc giao tiếp và ra quyết định, chỉ nên đề cập khuyết điểm/ lỗi sai của họ ở nơi riêng tư.'),
                                    Divider(),
                                    CommonUI.bulletText(' Giao tiếp khéo léo ví dụ ( khi một người bạn hỏi WP về chiếc váy mà họ đang mặc xem có đẹp không, mặc dù chiếc váy đó không được đẹp cho lắm, nhưng WP vẫn khen một cách khéo léo là chiếc váy đó nhìn khá sang trọng)'),
                                    Divider(),
                                    CommonUI.bulletText(' Khen ngợi và thưởng nếu bản thân hoàn thành tốt nhiệm vụ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đưa ra lựa chọn cùng lợi ích của việc cần làm thay vì đưa ra mệnh lệnh trực tiếp.'),
                                    Divider(),
                                    CommonUI.bulletText(' Để bản thân tự quyết định những việc nằm trong khả năng của mình thay vì nhờ người khác quyết định hộ hoặc làm giúp.'),
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