import 'package:firebase_admob/firebase_admob.dart';

import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Whorl_X extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Whorl_X({
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
        title: Text('Chủng WX', style: TextStyle(color: Colors.yellowAccent),),
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
                      Text("Chủng đại bàng WX", style: TextStyle(color: Colors.red, fontWeight: FontWeight.bold, fontSize: 25),),
                      Divider(),
                      Column(children: <Widget>[
                        Row(
                          mainAxisAlignment: MainAxisAlignment.spaceAround,
                          children: <Widget>[
                            Image.asset("images/WX1.png", height: 150, width: 150),
                            Image.asset("images/WX2.png", height: 150, width: 150),
                          ]
                        ),
                        Image.asset("images/wx_draw.JPG", height: 150, width: 200),
                      ],),
                      Text('ĐẶC ĐIỂM:', style: TextStyle(color: Colors.redAccent, fontSize: 17, fontWeight: FontWeight.bold)),
                      Container(
                        height: 800.0,
                        margin: EdgeInsets.symmetric(vertical: 5.0),
                        child:  SafeArea(
                          child: PageView(
                            controller: _textController,
                            children: <Widget>[
                              CommonUI.textCard('Đặc tính:', -1, 1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Có nhiều đặc điểm tính cách và thay đổi thất thường, không thể đoán biết được. Có rất nhiều ý tưởng kỳ lạ và khác biệt.', Colors.white),
                                    Divider(),
                                    CommonUI.bulletText(' Có xu hướng hay thay đổi và không ổn định, năng lượng phân tán khắp mọi nơi.'),
                                    Divider(),
                                    CommonUI.bulletText(' “Suy nghĩ ngoài chiếc hộp”, có tính cá nhân hóa.'),
                                    Divider(),
                                    CommonUI.bulletText(' Theo đuổi những điều độc đáo và khác biệt từ những người khác.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thích những điều mới mẻ và huyền bí.'),
                                    Divider(),
                                    CommonUI.bulletText(' Ham muốn tự do, mong muốn phá vỡ những điều thuộc về truyền thống.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có tính kháng cự, không bao giờ chấp nhận những điều mà họ không mong đợi.'),
                                    Divider(),
                                    CommonUI.bulletText(' Họ không bao giờ tự giới hạn chính bản thân mình, có những ý nghĩ mang tính đối kháng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không thể chấp nhận cuộc sống đơn giản và buồn tẻ, thích những thứ mới mẻ và thử thách, những điều đa dạng và bí ẩn.'),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Ưu điểm:', 0, 2,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Là những người có “Suy nghĩ ngoài chiếc hộp”, theo đuổi những điều độc đáo và khác biệt từ những người khác.', Colors.white),
                                    Divider(),
                                    CommonUI.bulletText(' Thích những điều mới mẻ và huyền bí.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Nhược điểm:', 1, 3,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Lối suy nghĩ độc đáo, sáng tạo đôi lúc có phần “điên” khiến họ khó hòa đồng và thường bị xa lánh.', Colors.white),
                                    Divider(),
                                    CommonUI.bulletText(' Với tính cách bốc đồng, WX rất dễ bị kích động (về mặt cảm xúc), và khó kiểm soát cảm xúc của bản thân.'),
                                    Divider(),
                                    CommonUI.bulletText(' WX cũng là nhóm người khó có thể áp đặt bởi họ luôn thích sống và làm việc theo ý muốn riêng của bản thân.'),
                                    Divider(),
                                    CommonUI.bulletText(' Bốc đồng, dễ kích động (về mặt cảm xúc).'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Phương hướng phát triển bản thân:', 2, 4,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' WX cần chấp nhận nét độc đáo và khác biệt của mình.'),
                                    Divider(),
                                    CommonUI.bulletText(' WX cần luôn để cho tinh thần thoải mái, có không gian và thời gian riêng để theo đuổi những sở thích cá nhân và tự phát triển bản thân.'),
                                    Divider(),
                                    CommonUI.bulletText(' Muốn thành công WX cần học thói quen lập kế hoạch làm việc rõ ràng, chi tiết, tập trung vào mục tiêu và giám sát tiến độ thực hiện.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cảm xúc là kẻ thù của thành công nên WX cần học cách kiểm soát cảm xúc, nên lắng nghe ý kiến của người khác, cân nhắc kỹ trước khi ra quyết định.'),
                                    Divider(),
                                    CommonUI.bulletText(' WX cũng nên thường xuyên tự phản ánh bản thân để tránh trở nên tự huyễn hoặc (hoặc trở nên kiêu ngạo).'),
                                    Divider(),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Giao tiếp với với chủng WX:', 3, -1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Khi giao tiếp với WX Cần chân thành, nhẹ nhàng. Thể hiện sự quan tâm và tôn trọng, không ngắt lời họ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tránh ra lệnh trực tiếp hoặc ép buộc WX vì sẽ ảnh hưởng ngược đến cách họ hành động.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chấp nhận sự độc đáo, sáng tạo của WX hơn là áp đặt họ trở thành ai đó.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khuyến khích hỏi và kiên nhẫn giúp trẻ tìm ra giải pháp hoặc câu trả lời.'),
                                    Divider(),
                                    CommonUI.bulletText(' Sử dụng thẻ điểm cho việc đạt mục tiêu như là sự khuyến khích.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tạo ra nhiều thử thách nhỏ cho bản thân từ sớm để cá nhân trải nghiệm trong môi trường an toàn.'),
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