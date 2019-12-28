import 'package:firebase_admob/firebase_admob.dart';

import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Whorl_T extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Whorl_T({
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
        title: Text('Chủng WT', style: TextStyle(color: Colors.yellowAccent),),
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
                      Text("Chủng đại bàng WT", style: TextStyle(color: Colors.red, fontWeight: FontWeight.bold, fontSize: 25),),
                      Divider(),
                      Column(children: <Widget>[
                        Image.asset("images/WT.png", height: 200, width: 150),
                        Image.asset("images/wt_draw.JPG", height: 150, width: 200),
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
                                    CommonUI.bulletText(' 1 tâm, 2 giao điểm – tâm khép kín', Colors.white),
                                    Divider(),
                                    CommonUI.bulletText(' Độc lập, nhanh chóng, chủ động. Tính tự quản cao, suy nghĩ quyết đoán, mạnh mẽ.', Colors.white),
                                    Divider(),
                                    CommonUI.bulletText(' Định hướng mục tiêu rõ ràng, tập trung, kiên trì và quyết liệt với mục tiêu đã đề ra.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tự thúc đẩy, chủ động hoàn thiện bản thân. Đề cao tác phong chuyên nghiệp, rất quan tâm đến hình ảnh cá nhân.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tự cô lập bản thân mình, SỐNG KHÉP KÍN VÀ NỘI TÂM, khó thổ lộ cảm xúc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cạnh tranh mạnh mẽ, nỗ lực để chiến thắng và thành công. Khuynh hướng phân tích và tự nghiên cứu.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thích thể hiện (đôi lúc cho mình là trung tâm), có xu hướng chỉ huy, đôi khi áp đặt và lấn át người khác.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thẳng thắn, nóng tính, đôi khi không kiểm soát được cảm xúc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chủ quan, cái tôi cao, chủ nghĩa cá nhân, rất khó bị thuyết phục và ảnh hưởng (Trừ khi đó là người mình nể trọng, có kiến thức chuyên sâu hoặc có chứng thực rõ rang, cụ thể).'),
                                    Divider(),
                                    CommonUI.bulletText(' Mọi người có thể cảm thấy áp lực khi làm việc cùng vì cực kì tập trung và nghiêm túc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tính kỉ luật và đòi hỏi ở bản thân cao, không chấp nhận thất bại.'),
                                    Divider(),
                                    CommonUI.bulletText(' Wt khó chia sẻ và khó thổ lộ.'),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Ưu điểm:', 0, 2,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Bạn là mẫu người trầm tính, cứng rắn và khó thổ lộ cảm xúc.', Colors.white),
                                    Divider(),
                                    CommonUI.bulletText(' Có ý chí và tinh thần vững vàng, suy nghĩ mạnh mẽ và độc lập. Có mục tiêu cao.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khả năng tuyệt vời trong việc sắp xếp và lên kế hoạch rõ ràng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Bạn có sức mạnh cá nhân lớn và phong thái mạnh mẽ giúp đạt được mục tiêu mình đề ra.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tự suy nghĩ, tự lập luận và quyết định trong hành động,'),
                                    Divider(),
                                    CommonUI.bulletText(' Tinh thần trách nhiệm cao.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đối với bạn, công việc quan trọng hơn tất cả, nó lấy đi phần lớn thời gian trong ngày của bạn.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Nhược điểm:', 1, 3,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Thường khó chấp nhận thất bại của bản thân cũng như người khác.', Colors.white),
                                    Divider(),
                                    CommonUI.bulletText(' Khi gặp thất bại hoặc đổ vỡ thường tự mình chịu đựng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không thích lắng nghe lời khuyên, ý kiến của người khác nên hay xảy ra những thất bại không đáng có.'),
                                    Divider(),
                                    CommonUI.bulletText(' Vì không cảm thấy thoải mái khi bộc lộ cảm giác yêu thích và cảm xúc của mình với người khác nên hay bị hiểu lầm là lạnh nhạt, vô cảm.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nếu tuýp người này không xác định được mục tiêu của bản thân, họ sẽ dễ trở nên chán nản và rất tiêu cực.'),
                                    Divider(),
                                    CommonUI.bulletText(' Quan tâm và thể hiện tình cảm ra bên ngoài đặc biệt là với người thân để tránh sự hiểu lầm là lạnh lùng, vô cảm.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Phương hướng phát triển bản thân:', 2, 4,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Học tính kiên nhẫn, khả năng thích ứng với môi trường.', Colors.white),
                                    Divider(),
                                    CommonUI.bulletText(' Cống hiến, định vị lãnh đạo, phát triển nhận thức từ trải nghiệm.'),
                                    Divider(),
                                    CommonUI.bulletText(' Học thêm kỹ năng thiết lập và quản lý mục tiêu, có thể đặt mục tiêu theo nguyên tắc SMART sẽ giúp họ phát huy lợi thế của bản thân và dễ dàng đạt được sự thành công trong công việc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đối với trẻ em: Khuyến khích và tạo động lực cho trẻ mỗi ngày để trẻ có thể học hỏi từ thất bại, nhận ra thất bại, mạnh mẽ và dũng cảm hơn khi đối mặt với thất bại.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Giao tiếp với với chủng WT:', 3, -1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Đối với người sở hữu mẫu vân tay WT, họ phù hợp với phong cách giao tiếp dân chủ, mang tính xây dựng nhiều hơn là chiều hướng chiếm hữu hoặc áp đảo. ', Colors.white),
                                    Divider(),
                                    CommonUI.bulletText(' Thuyết phục nhẹ nhàng sẽ hiệu quả hơn là ép buộc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nên nhắc nhở ít, không nên nhắc nhiều, nếu nhắc nhiều dễ cáu.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nên kiểm điểm riêng, tránh phê bình trước mặt người khác vì họ có tự trọng cao.'),
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