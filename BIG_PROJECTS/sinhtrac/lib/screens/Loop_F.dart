import 'package:firebase_admob/firebase_admob.dart';

import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Loop_F extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Loop_F({
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
        title: Text('Chủng LF', style: TextStyle(color: Colors.yellowAccent),),
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
                      Text("Chủng nước LF", style: TextStyle(color: Colors.cyanAccent, fontWeight: FontWeight.bold, fontSize: 25),),
                      Divider(),
                      Image.asset("images/fl_draw.JPG", height: 200, width: 200),
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
                                    CommonUI.bulletText(' Các đặc tính khá giống với chủng LU.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khả năng hiểu nhanh một sự việc chỉ trong thời gian ngắn và thường hiểu rất sâu, khác biệt so với người bình thường.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có sự đa dạng và phong phú trong tính cách.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hòa đồng, cởi mở, thân thiện nhưng ít chủ động tạo mối quan hệ. Nhạy cảm trong giao tiếp, thích quan sát.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không thích xung đột mâu thuẫn, đề cao tinh thần đồng đội, yêu thích hoạt động đội nhóm.'),
                                    Divider(),
                                    CommonUI.bulletText(' Là thành viên tốt trong đội nhóm, người chấp hành tốt, khả năng chịu đựng cao.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thích nghi tốt, dễ hòa nhập với từng môi trường. Có tư duy linh hoạt và khả năng tương thích cao.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nhiệt tình, chân thành và dễ cảm thông cho vấn đề của người khác. Rất coi trọng các mối quan hệ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Biết lắng nghe và chấp nhận ý kiến của người khác.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cư xử theo cách mọi người mong đợi, bằng cách nào đó chiều ý những người khác.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chu đáo, biết quan tâm mọi người, sống tình cảm, thích tự do.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không giỏi sáng tạo, tuy nhiên học hỏi rất nhanh từ môi trường và xã hội, dễ bắt chước và mô phỏng tốt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Là một người dễ bị người khác ảnh hưởng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Kỷ luật tự giác bản thân thấp.'),
                                    Divider(),
                                    CommonUI.bulletText(' Là người của xã hội, cộng đồng. Là một chủng khá phổ biến. Người mang chủng nay khá hiền và lành tính, dễ bị người khác chèn ép.'),
                                    Divider(),
                                    CommonUI.bulletText(' Lãng mạn, thích sự tự do.'),
                                    Divider(),
                                    CommonUI.bulletText(' Họ làm việc theo cảm tính và dễ thay đổi mục tiêu của mình.'),
                                    
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Ưu điểm:', 0, 2,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Khả năng bắt chước vượt trội, học nhanh trong môi trường và trong xã hội.'),
                                    Divider(),
                                    CommonUI.bulletText(' Mềm mại, nhẹ nhàng và cởi mở; lãng mạn, thích tự do và chỉ sống cho hiện tại.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hướng tới sự hòa hợp và hòa bình, không thích sự mâu thuẫn, gay gắt hay xung đột.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thuộc mẫu người cộng đồng xã hội thích những nơi đông người, thích nghi trước rồi mới giao tiếp, thích tham gia các hoạt động vì cộng đồng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cảm xúc, làm theo cảm xúc. Thường quan tâm tới những người xung quanh, dễ cảm thông cho vấn đề của người khác.'),
                                    Divider(),
                                    CommonUI.bulletText(' Suy nghĩ linh hoạt và tương thích, dễ bắt chước hoặc tái tạo ý tưởng của người khác thành ý tưởng của mình.'),
                                    // Divider(),
                                    // CommonUI.bulletText(' Đối với bạn, công việc quan trọng hơn tất cả, nó lấy đi phần lớn thời gian trong ngày của bạn.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Nhược điểm:', 1, 3,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Không có mục tiêu rõ ràng trong tâm trí, tham vọng không lớn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không có chính kiến, dễ bị tác động bởi những người xung quanh và môi trường.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hay lo chuyện bao đồng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thụ động, dễ bị áp đặt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Làm việc theo cảm tính, dễ thay đổi nguyên tắc và kế hoạch đã vạch ra.'),
                                    Divider(),
                                    CommonUI.bulletText(' Công việc, kế hoạch có thể bị trì hoãn vì lối sống tình cảm.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Phương hướng phát triển bản thân:', 2, 4,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Làm việc theo cảm tính, dễ thay đổi nguyên tắc và kế hoạch đã vạch ra. Vì vậy nên lập kế hoạch làm việc rõ ràng, chi tiết, tập trung vào mục tiêu và giám sát tiến độ thực hiện. Tham gia các khóa học về ra quyết định và lập mục tiêu.'),
                                    Divider(),
                                    CommonUI.bulletText(' Học để trở thành người hướng dẫn và chịu trách nhiệm với quy trình làm việc, đưa ra giải pháp cho vấn đề phát sinh.'),
                                    Divider(),
                                    CommonUI.bulletText(' Công việc, kế hoạch có thể bị trì hoãn vì lối sống tình cảm. Chọn một người tri kỷ đáng tin cậy để động viên và khích lệ, đôn đốc việc thực hiện mục tiêu'),
                                    Divider(),
                                    CommonUI.bulletText(' Chủ động giao tiếp. Tham gia các hoạt động cộng đồng khác nhau, chủ động nhận vị trí lãnh đạo, xây dựng sự tự tin. Tham khảo tự truyện của những người thành công.'),
                                    Divider(),
                                    CommonUI.bulletText(' Học cách nói “không” với người khác một cách thích hợp khi cần thiết.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nước phải tìm cho mình NGƯỜI THẦY: Người Thầy sẽ như vật chứa, có thể định hình giúp NƯỚC. Là người định hướng, chỉ bảo, thúc đẩy, động viên để nước có thể dễ dàng hơn về hướng đi trong cuộc đời mình. Hãy tìm cho mình người Thầy về phát triển bản thân, người thầy về phát triển chuyên môn, phát triển kinh doanh, … .'),
                                    Divider(),
                                    CommonUI.bulletText(' Nước cần phải có MÔI TRƯỜNG TỐT.Nước dễ thích nghi với môi trường. Dễ hòa nhập với môi trường và khả năng sao chép tốt. Chính vì điều đó Nước ở bên cạnh ai, trong môi trường như thế nào nước sẽ dễ dàng trở thành những người tương tự như thế.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nước cần HÌNH TƯỢNG. Nước giỏi sao chép, chính vì vậy nước hãy tìm ra những thần tượng cho mình. Nghiên cứu, tìm hiểu, học hỏi từ họ để tìm ra những triết lý sống, cách thức mà họ đã thành công. Từ đó nước áp dụng bằng khả năng sao chép của chính mình.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chọn bạn mà chơi, chọn nơi mà ở, chọn thầy mà học.'),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                    // CommonUI.bulletText(' '),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Giao tiếp với với chủng LF:', 3, -1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Khi giao tiếp với mẫu người này, cần chân thành, nhẹ nhàng để tạo sự tin tưởng, giúp cuộc nói chuyện cởi mở và hiệu quả hơn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thể hiện sự quan tâm, dành thời gian để hỏi và trả lời, khen ngợi, động viên.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cần làm mẫu cụ thể để dễ dàng bắt nhịp trang học tập.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cần theo dõi, thường xuyên khuyến khích và động viên trẻ kịp thời để truyền sự tự tin, tránh việc bỏ dở nửa chừng theo tâm trạng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tạo một môi trường kỷ luật nghiêm ngặt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Dùng phương pháp tương tác khi hướng dẫn: thảo luận, để người khác đưa ra câu hỏi và mình trả lời.'),
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