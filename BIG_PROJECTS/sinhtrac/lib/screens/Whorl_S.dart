import 'package:firebase_admob/firebase_admob.dart';

import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Whorl_S extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Whorl_S({
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
        title: Text('Chủng WS', style: TextStyle(color: Colors.yellowAccent),),
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
                      Text("Chủng đại bàng WS", style: TextStyle(color: Colors.red, fontWeight: FontWeight.bold, fontSize: 25),),
                      Divider(),
                      Column(children: <Widget>[
                        Image.asset("images/WS.png", height: 200, width: 150),
                        Image.asset("images/ws_draw.JPG", height: 150, width: 200),
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
                                    CommonUI.bulletText(' 1 tâm, 2 giao điểm – tâm là vòng tròn hở xoáy trôn ốc. '),
                                    Divider(),
                                    CommonUI.bulletText(' Mạnh mẽ, tự tin, quyết đoán và tự lập. '),
                                    Divider(),
                                    CommonUI.bulletText(' Tính tự quản cao, suy nghĩ quyết đoán. '),
                                    Divider(),
                                    CommonUI.bulletText(' Tự thúc đẩy, chủ động hoàn thiện bản thân. '),
                                    Divider(),
                                    CommonUI.bulletText(' Có xu hướng chỉ huy, không thích sự áp đặt tuy nhiên đôi khi có xu hướng áp đặt và lấn át người khác. '),
                                    Divider(),
                                    CommonUI.bulletText(' Là mẫu người có thế giới nội tâm phong phú mà người khác thường không hiểu được.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chủ quan, cái tôi cao, chủ nghĩa cá nhân, rất khó bị thuyết phục và ảnh hưởng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tính kỉ luật và đòi hỏi ở bản thân cao, không chấp nhận thất bại.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có khả năng lãnh đạo, khả năng kiểm soát cảm xúc và điều phối công việc tốt.'),
                                    Divider(),
                                    CommonUI.bulletText(' Kiên trì thực hiện công việc một cách nghiêm túc và đam mê. Thường nỗ lực trong một khoảng thời gian dài vào bất cứ công việc gì mà họ cảm thấy quan trọng để hoàn thành mục tiêu của mình, ít nản chí.'),
                                    Divider(),
                                    CommonUI.bulletText(' Một phẩm chất dễ giúp cá nhân này thành công đó là "sự kiên định".'),
                                    Divider(),
                                    CommonUI.bulletText(' Rất quan tâm đến hình ảnh cá nhân, đề cao sự rõ ràng trong các mối quan hệ cũng như công việc. '),
                                    Divider(),
                                    // CommonUI.bulletText(' Thẳng thắn, nóng tính, đôi khi không kiểm soát được cảm xúc.'),
                                    // Divider(),
                                    // CommonUI.bulletText(' Chủ quan, cái tôi cao, chủ nghĩa cá nhân, rất khó bị thuyết phục và ảnh hưởng (Trừ khi đó là người mình nể trọng, có kiến thức chuyên sâu hoặc có chứng thực rõ rang, cụ thể).'),
                                    // Divider(),
                                    // CommonUI.bulletText(' Mọi người có thể cảm thấy áp lực khi làm việc cùng vì cực kì tập trung và nghiêm túc.'),
                                    // Divider(),
                                    // CommonUI.bulletText(' Tính kỉ luật và đòi hỏi ở bản thân cao, không chấp nhận thất bại.'),
                                    // Divider(),
                                    // CommonUI.bulletText(' Wt khó chia sẻ và khó thổ lộ.'),
                                    // CommonUI.bulletText(' '),
                                    // Divider(),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Ưu điểm:', 0, 2,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Khả năng nhận thức cao, không dễ dàng bị tác động.', Colors.white),
                                    Divider(),
                                    CommonUI.bulletText(' Tự lập, luôn có tinh thần chiến đấu mạnh mẽ, thích chinh phục, không nản lòng trước khó khăn, thử thách và luôn tự động viên bản thân.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có phong cách riêng. Sống bằng lí trí hơn tình cảm, mạnh mẽ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Biết cách để đạt được mục tiêu, và luôn chủ động trong công việc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Kiên định với mục tiêu và không dễ dàng từ bỏ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Luôn hoàn thiện bản thân trở nên chuyện nghiệp. Họ luôn có suy nghĩ tích cực.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Nhược điểm:', 1, 3,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Đôi khi tư duy hơi cứng nhắc, nếu lặp lại nhiều sẽ hình thành nên tính bảo thủ.', Colors.white),
                                    Divider(),
                                    CommonUI.bulletText(' Thường khó chấp nhận thất bại của bản thân cũng như người khác.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khi gặp thất bại thường tự mình chịu đựng, hay gặp vấn đề về mối quan hệ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Không thích lắng nghe lời khuyên, ý kiến của người khác nên hay xảy ra những thất bại không đáng có.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nếu tuýp người này không xác định được mục tiêu của bản thân, họ sẽ dễ trở nên chán nản và rất tiêu cực.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Phương hướng phát triển bản thân:', 2, 4,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Xây dựng cho mình một mục tiêu dài hạn 5 -10 – 20 năm rồi chia nhỏ thành từng năm – từng tháng thậm chí là từng ngày. Điều đó sẽ giúp WS duy trì được năng lượng tích cực và tinh thần vượt khó giúp WS kích hoạt được mọi tố chất của mình.', Colors.white),
                                    Divider(),
                                    CommonUI.bulletText(' Nếu không có mục tiêu sẽ khiến WS rơi vào trạng thái mất phương hướng và khó thành công như WS đáng có.'),
                                    Divider(),
                                    CommonUI.bulletText(' WS cần tránh ép buộc người khác theo tiêu chuẩn và mong đợi riêng của bản thân, sẽ gây áp lực, mệt mỏi cho bản thân và mọi người.'),
                                    Divider(),
                                    CommonUI.bulletText(' WS cần cân nhắc giữa lợi ích bản thân và lợi ích của người khác, kiên nhẫn lắng nghe và đặt mình vào vị trí của người khác để hiểu họ hơn, sẽ tạo được niềm tin, sự quý trọng và mối quan hệ tốt đẹp hơn.'),
                                    Divider(),
                                    CommonUI.bulletText(' WS hãy gia tăng hoạt động đội nhóm để tối đa hóa điểm mạnh của tập thể. Tham gia các hoạt động – giao tiếp và phát triển kỹ năng giao tiếp.'),
                                    Divider(),
                                    CommonUI.bulletText(' WS cũng cần duy trì thái độ cởi mở, tránh cao ngạo vô ý.'),
                                    Divider(),
                                    CommonUI.bulletText(' WS cần học cách giao việc và tập trung vào giá trị và điểm mạnh của mọi người thay vì chỉ nhìn vào điểm yếu của họ.'),
                                    Divider(),
                                    CommonUI.bulletText(' WS cần học cách chia sẻ cảm xúc, khó khăn của bản thân với mọi người để tránh căng thẳng, nếu không thể học cách chia sẻ thì có thể chọn phương án viết nhật ký, khi nóng giận thì hãy xả giận của mình bằng cách hít thở sâu và viết xuống mọi bức bối của mình sau đó thì xé đi như vậy cũng giúp cho WS giảm bớt căng thẳng và bức xúc.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Giao tiếp với với chủng WS:', 3, -1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Khi giao tiếp với WS: cần ngắn gọn, tập trung vào vấn đề chính. Lưu ý tới điều họ quan tâm.'),
                                    Divider(),
                                    CommonUI.bulletText(' WS cần được Tôn trọng và tránh áp đặt, và chỉ nên đề cập khuyết điểm/ lỗi sai của họ ở nơi riêng tư. Khen trong sáng chê trong tối.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khi giao tiếp với WS nếu vấn đề trở nên gay gắt không nên tiếp tục tranh luận.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nên thông báo hoặc thảo luận trước kế hoạch tránh việc đưa WS vào sự việc đã rồi.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cần khen ngợi và tưởng thưởng kịp thời nếu WS hoàn thành tốt nhiệm vụ.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tránh áp đặt WS hãy đưa ra lựa chọn cùng lợi ích của việc cần làm thay vì đưa ra mệnh lệnh. Hoặc có thể đưa ra 2 sự lựa chọn để WS tự lựa chọn thay vì chỉ có 1.'),
                                    Divider(),
                                    CommonUI.bulletText(' WS cần để bản thân tự quyết định những việc nằm trong khả năng của mình thay vì nhờ người khác quyết định hộ hoặc làm giúp.'),
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