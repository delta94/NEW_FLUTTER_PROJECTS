import 'package:firebase_admob/firebase_admob.dart';

import 'package:firebase_admob/firebase_admob.dart';
import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Arch_S extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Arch_S({
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
        title: Text('Chủng AS', style: TextStyle(color: Colors.yellowAccent),),
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
                      Text("Chủng nước AS", style: TextStyle(color: Colors.cyanAccent, fontWeight: FontWeight.bold, fontSize: 25),),
                      Divider(),
                      Image.asset("images/AS.png", height: 200, width: 150),
                      Image.asset("images/as_draw.JPG", height: 150, width: 200),
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
                                    CommonUI.bulletText(' Các đường vân xếp chồng lên nhau từng lớp, không tâm, không giao điểm.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tiềm năng lớn, khả năng hấp thu dường như vô hạn. Nếu nỗ lực và phát triển đúng cách sẽ phát huy hiệu quả tối ưu. Ngược lại, hiệu quả sẽ rất thấp và lãng phí tiềm năng vô hạn này. Tuy nhiên khởi đầu thường chậm.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thích ổn định, an toàn. Theo phong cách chậm mà chắc, bền bỉ, phấn đấu cho những mục tiêu cơ bản và an toàn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có xu hướng đặt nhiều câu hỏi. Khó bị thuyết phục, chỉ tin khi đã trải nghiệm, học từ kinh nghiệm.'),
                                    Divider(),
                                    CommonUI.bulletText(' Học tập bằng cách thực hành, lặp đi lặp lại.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không thích lý luận trừu tượng, thích những thứ đơn giản, rõ ràng, thực tế.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chăm chỉ, cần cù. Làm việc theo nguyên tắc, thứ tự va hệ thống.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thận trọng, tỉ mỉ, có khả năng chi tiết hóa, đề cao chất lượng và sự chính xác.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không thích thể hiện, giỏi trong việc giám sát. Rất trung thành và đáng tin.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có xu hướng che giấu cảm xúc, tĩnh lặng, có thói quen phòng thủ.'),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    
                                    
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Ưu điểm:', 0, 2,
                                Column(
                                  children: <Widget>[
                                    // Divider(),
                                    CommonUI.bulletText(' Tiềm năng lớn, khả năng hấp thu gần như vô hạn. Hấp thu kiến thức như một miếng bọt biển.'),
                                    Divider(),
                                    CommonUI.bulletText(' Theo phong cách chậm mà chắc. Thận trọng trong việc ra quyết định, không thích thể hiện và giỏi trong việc giám sát.'),
                                    Divider(),
                                    CommonUI.bulletText(' Dễ dàng từ bỏ một khi không nhận được kết quả mong đợi sau một khoảng thời gian.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không quan tâm nhiều về ý kiến của người khác. Tỉ mỉ, khả năng chi tiết hóa, sắc bén trong đánh giá công việc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có xu hướng đặt nhiều câu hỏi. Chỉ tin khi đã trải nghiệm, học từ kinh nghiệm. Học tập theo phong cách đơn giản, lặp đi lặp lại thường xuyên.'),
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
                                    CommonUI.bulletText(' Thường kìm giữ cảm xúc khó chịu trong người, đến lúc bùng nổ như núi lửa (trong 1 thống kê tại Nhật Bản, 70% người tự tử có chủng vân tay AS).'),
                                    Divider(),
                                    CommonUI.bulletText(' Tính cẩn trọng nên có thể bỏ lỡ những cơ hội tốt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nhạy cảm, cảm xúc và bốc đồng. Tuy nhiên khó thể hiện cảm xúc ra bên ngoài hay thổ lộ bằng lời nói.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nghiêm túc, có trách nhiệm, chân thành. Không thích sự thiếu năng lực và kém hiệu quả.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Phương hướng phát triển bản thân:', 2, 4,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Họ cần cởi mở hơn để tránh rơi vào tình trạng cô lập dẫn đến căng thẳng, mệt mỏi.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hành động và quyết định cần nhanh hơn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tránh ép buộc và đòi hỏi quá cao ở người khác đáp ứng những tiêu chuẩn khắt khe của mình.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đừng để bản thân sa lầy vào những việc nhỏ nhặt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không nên e ngại những thất bại bởi nó đơn giản chỉ là bài học giúp bạn trưởng thành hơn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chủng Arch có tiềm năng vô hạn, nên phải tận dụng mọi cơ hội để học hỏi và phát triển càng sớm càng tốt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tìm ra điểm mạnh bẩm sinh và phát triển nó để trở thành nổi trội.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tham gia các khóa đào tạo sâu về chuyên môn, đọc nhiều sách để mở rộng kiến thức.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thiết lập các mục tiêu và kiên trì theo đuổi.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cần kiên trì, không nản trí sớm, biết cách tận dụng khả năng hấp thu vô hạn để tích luỹ kiến thức lâu dài.'),
                                    Divider(),
                                    CommonUI.bulletText(' Giảm xu hướng tự thu mình, chủ động gặp gỡ những người thành công để chia sẻ, học hỏi và phát triển bản thân.'),
                                    Divider(),
                                    CommonUI.bulletText(' Trau dồi kỹ năng nói trước đám đông.'),
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
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Giao tiếp với với chủng AS:', 3, -1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Khi tương tác với mẫu người này cần ngắn gọn, dễ hiểu, đi thẳng vào vấn đề chính.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không dồn ép họ hứa hẹn hoặc ra quyết định ngay lập tức.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nên thông báo và giải thích lý do nếu có bất kỳ sự thay đổi nào trong kế hoạch đã định trước. Đối với trẻ'),
                                    Divider(),
                                    CommonUI.bulletText(' Học bằng cách thực hành, trải nghiệm (hỏi – trả lời/ mô tả, thi đua, trò chơi).'),
                                    Divider(),
                                    CommonUI.bulletText(' Chia nhỏ bài học, làm từng bước, lặp đi lặp lại. Tốt nhất là được kèm cặp 1-1.'),
                                    Divider(),
                                    CommonUI.bulletText(' Động viên, khen thưởng kịp thời, ngay cả khi trẻ đạt được tiến bộ nhỏ để tăng động lực học tập.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nên có những câu hỏi dẫn dắt để khơi gợi câu trả lời của trẻ, tập cho trẻ chia sẻ dễ dàng hơn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khi kết quả thực hiện thấp, chỉ ngay chỗ sai, đưa ra cách tiếp cận đúng và sửa đổi ngay lập tức.'),
                                    Divider(),
                                    CommonUI.bulletText(' Bạn bè/người thân chỉ nên đưa ra lời hứa khi có thể thực hiện được.'),
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