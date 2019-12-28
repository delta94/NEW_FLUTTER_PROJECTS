import 'package:firebase_admob/firebase_admob.dart';

import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Whorl_I extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Whorl_I({
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
        title: Text('Chủng WI', style: TextStyle(color: Colors.yellowAccent),),
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
                      Text("Chủng đại bàng WI", style: TextStyle(color: Colors.red, fontWeight: FontWeight.bold, fontSize: 25),),
                      Divider(),
                      Column(children: <Widget>[
                        Image.asset("images/WI.png", height: 200, width: 150),
                        Image.asset("images/wi_draw.JPG", height: 150, width: 200),
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
                                    CommonUI.bulletText(' 1 tâm, 2 giao điểm – tâm dài'),
                                    Divider(),
                                    CommonUI.bulletText(' Có thể tương tác và đa dạng đối tượng, thuận lợi trong các lĩnh vực giao tiếp và quan hệ công chúng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thích ứng, hội nhập nhanh với môi trường. Tìm kiếm cơ hội, thách thức nhưng chưa hết mình, do luôn có mâu thuẫn nội tại.'),
                                    Divider(),
                                    CommonUI.bulletText(' Suy nghĩ theo nhiều chiều hướng, đa góc nhìn. Luôn có “phương án B”, thực hiện nhiều phương pháp khác nhau để đạt được mục tiêu.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tò mò, hứng thú nhiều lĩnh vực, thích điều mới mẻ và thử thách, theo đuổi nhiều mục tiêu, nhưng vẫn có nhiều cân nhắc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tiêu chuẩn cao, phân tích tỉ mỉ, hay đặt ra những câu hỏi, quan tâm đến chất lượng và sự hoàn hảo.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thiên hướng suy nghĩ quá nhiều dẫn đến sự mất trung, dễ bị nản lòng khi mục tiêu không như mong muốn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hay do dự, lưỡng lự khi suy nghĩ ở nhiều khía cạnh khác nhau. Đưa ra những cách tiếp cận bảo thủ, khả năng kiểm soát chi tiết.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đề cao tinh thần hợp tác đội nhóm, thích hỏi và chia sẻ quan điểm với mọi người xung quanh.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nóng tính nhưng có thể kiểm soát được. Tinh thần trách nhiệm cao.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có tinh thần trách nhiệm cao đối với công việc và gia đình.'),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Ưu điểm:', 0, 2,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Là người thân thiện, nhiệt tình, thẳng thắn, có năng lực và thoải mái.', Colors.white),
                                    Divider(),
                                    CommonUI.bulletText(' Dễ dàng thích nghi trong nhiều điều kiện sống khác nhau.'),
                                    Divider(),
                                    CommonUI.bulletText(' Họ có trách nhiệm với gia đình, công việc, khá kỹ lưỡng trong tình cảm và không hề sống theo bản năng mà họ điều khiển cuộc sống của mình dựa vào lý trí.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Nhược điểm:', 1, 3,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Ít khi làm việc đến nơi đến chốn mà hay nửa vời.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nếu buộc họ phải cùng lúc hoàn thành nhiều công việc thì hiệu quả chắc chắn sẽ không cao.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không thích những gì lặp lại.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có phần khép kín, tính tình nóng nảy, một khi họ đã bộc phát thì mọi chuyện khó có thể kiểm soát được.'),
                                    Divider(),
                                    CommonUI.bulletText(' Một điểm yếu khác của WI là rất hay quên.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Phương hướng phát triển bản thân:', 2, 4,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Muốn thành công cần nghiêm túc hơn trong thái độ làm việc cũng như cách sống, học cách lập kế hoạch trước khi bắt tay vào làm việc gì'),
                                    Divider(),
                                    CommonUI.bulletText(' Cởi mở hơn, sẵn sàng chia sẻ, chấp nhận phê phán để hoàn thiện bản thân hơn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cần có kế hoạch phải được lập trước thật rõ ràng, cụ thể để nhìn rõ vấn đề, giá trị, mục tiêu của mỗi việc mình chọn làm.'),
                                    Divider(),
                                    CommonUI.bulletText(' Vì đa mục tiêu và luôn có nhiều góc nhìn khác nhau nên WI cần học và thực hành phương pháp quản lý tốt thời gian.'),
                                    Divider(),
                                    CommonUI.bulletText(' WI cần ưu tiên công việc theo tầm quan trọng và độ cấp bách và thực hiện lần lượt từng việc.'),
                                    Divider(),
                                    CommonUI.bulletText(' WI cũng cần tăng cường kỹ năng chuyên môn để tránh việc trở thành “thợ” của tất cả ngành nghề mà không chuyên về nghề nào cụ thể.'),
                                    Divider(),
                                    CommonUI.bulletText(' WI hay suy nghĩ và hành động theo số đông, lập trường tư tưởng tùy thuộc tình thế nên cần học cách duy trì tính nhất quán của các nguyên tắc và quan điểm.'),
                                    Divider(),
                                    CommonUI.bulletText(' WI không thích làm những công việc nhàm chán lặp đi lặp lại nên cần tự tạo môi trường làm việc thoải mái.'),
                                    Divider(),
                                    CommonUI.bulletText(' WI cũng cần hạn chế suy nghĩ quá nhiều dễ dẫn đến mệt mỏi, kiệt sức, hoang mang.'),
                                    Divider(),
                                    CommonUI.bulletText(' WI có cái tôi cao và tính hình tượng cao nên thường ít khi chia sẻ khó khăn của bản thân với mọi người nên cần học cách chia sẻ trở ngại với những người xung quanh để cùng nhau tìm giải pháp.'),
                                    
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Giao tiếp với với chủng WI:', 3, -1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Giúp WI xác định được chính xác được mất để tránh việc lưỡng lự đắn đo trong quá trình thực hiện.'),
                                    Divider(),
                                    CommonUI.bulletText(' Giao tiếp với người có chủng vân tay WI nên tập trung vào điều họ quan tâm, chân thành và tích cực để truyền cảm hứng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tôn trọng và chỉ nên đề cập khuyết điểm/ lỗi sai của WI ở nơi riêng tư.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hướng dẫn WI phương pháp học tập kết hợp: vừa đa dạng vừa chuyên sâu.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hướng dẫn WI cách quản lý thời gian cho trẻ từ sớm và có mốc hoàn thành.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khen ngợi và có thưởng nếu WI hoàn thành tốt nhiệm vụ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đưa ra lựa chọn cùng lợi ích của việc cần làm thay vì đưa ra mệnh lệnh trực tiếp cho WI.'),
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