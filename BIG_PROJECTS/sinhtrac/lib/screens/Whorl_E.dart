import 'package:firebase_admob/firebase_admob.dart';

import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Whorl_E extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Whorl_E({
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
        title: Text('Chủng WE', style: TextStyle(color: Colors.yellowAccent),),
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
                      Text("Chủng đại bàng WE", style: TextStyle(color: Colors.red, fontWeight: FontWeight.bold, fontSize: 25),),
                      Divider(),
                      Column(children: <Widget>[
                        Image.asset("images/WE.png", height: 200, width: 150),
                        Image.asset("images/we_draw.JPG", height: 150, width: 200),
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
                                    CommonUI.bulletText(' 1 tâm, 2 giao điểm – vòng tròn quanh tâm dày hơn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Định hướng và tập trung mục tiêu, giỏi trong việc thiết lập mục tiêu cũng như lập kế hoạch chi tiết. '),
                                    Divider(),
                                    CommonUI.bulletText(' Có khả năng truyền lửa, truyền cảm xúc.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tiêu chuẩn cao, phân tích tỉ mỉ, quan tâm tới chất lượng, sự chính xác và hoàn hảo. Tính kỷ luật và đòi hỏi ở bản thân cao.'),
                                    Divider(),
                                    CommonUI.bulletText(' Bị tình cảm, cảm xúc chi phối (đôi khi vì tình cảm mà thay đổi quyết định).'),
                                    Divider(),
                                    CommonUI.bulletText(' Nỗ lực để chiến thắng và thàng công, không chấp nhận thất bại.'),
                                    Divider(),
                                    CommonUI.bulletText(' Là người lương thiện, không làm hại được ai (nếu làm hại ai thì lương tâm sẽ rất cắn rứt và cảm thấy tội lỗi).'),
                                    Divider(),
                                    CommonUI.bulletText(' Làm việc có hệ thống, luôn tự đặt ra và duy trì hệ thống. Đề cao tác phong chuyên nghiệp, rất quan tâm đến hình ảnh cá nhân.'),
                                    Divider(),
                                    CommonUI.bulletText(' Cần rèn luyện tính kiên trì sẽ có cơ hội thành công cao.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chủ quan, cái tôi cao, chủ nghĩa cá nhân, rất khó bị thuyết phục và ảnh hưởng (trừ khi đó là người mình nể trọng, có kiến thức chuyên sâu hoặc có chứng thực cụ thể).'),
                                    Divider(),
                                    CommonUI.bulletText(' Thích chỉ đạo, quyết đoán, đôi khi cho mình là trung tâm, dẫn đến áp đặt người khác; ý chí mạnh mẽ, quyết tâm cao.'),
                                    Divider(),
                                    CommonUI.bulletText(' Dễ dàng bị vướng giữa khía cạnh logic/lý trí và cảm xúc, có xu hướng lo lắng thái quá, nghĩ đến những rủi ro tiêu cực. Hay hồi hộp, thay đổi tâm trạng đột ngột.'),
                                    Divider(),
                                    CommonUI.bulletText(' Thẳng thắn, nóng tính, đôi khi không kiểm soát được cảm xúc.'),
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
                                    CommonUI.bulletText(' Tầm nhìn xa trông rộng.', Colors.white),
                                    Divider(),
                                    CommonUI.bulletText(' Chỉnh chu và cầu toàn trong công việc, hay lo sợ kết quả xấu trong công việc, đời sống.'),
                                    Divider(),
                                    CommonUI.bulletText(' Tổng hợp các suy nghĩ, dự đoán và lường trước kết quả hoàn thành.'),
                                    Divider(),
                                    CommonUI.bulletText(' Có khả năng thúc đẩy năng lượng, xúc cảm cho những người xung quanh.'),
                                    Divider(),
                                    CommonUI.bulletText(' Mẫu người đi đầu và làm gương trong vấn đề mang tính kỷ luật, nội quy cơ quan, công sở.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khả năng nhìn nhận và đánh giá năng lực người khác khá tốt, khả năng xây dựng đội nhóm và phân công nhiệm vụ cho người khác cùng tham gia.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Nhược điểm:', 1, 3,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Thường bị cảm xúc chi phối.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đôi khi lo lắng thái quá.'),
                                    Divider(),
                                    CommonUI.bulletText(' Họ bị sự cầu toàn chi phối trong công việc nên đôi khi loay hoay, dẫn đến không tập trung và đạt kế quả không như mong muốn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Do bị cảm xúc chi phối nên dễ bị tổn thương.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Phương hướng phát triển bản thân:', 2, 4,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Cân bằng cảm xúc, khi giỏi cái gì rồi phải nên tự tin, không nên lo lắng quá.'),
                                    Divider(),
                                    CommonUI.bulletText(' Nghĩ đơn giản, lập kế hoạch lên cũng không nên quá lo lắng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hãy luôn duy trì cảm xúc tích cực trong mình, WE sẽ trở thành những con người tiên phong, đầy hứng khởi và truyền cảm hứng bất tận tới mọi người. Đó cũng chính là nguồn động lực để WE luôn hết mình tiến xa hơn trên con đường sự nghiệp, cuộc sống.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đừng bao giờ để những cảm xúc tiêu cực tác động vào mình để mình trở thành kẻ bị chi phối bởi cảm xúc. Đó chính là hố chôn WE.'),
                                    Divider(),
                                    CommonUI.bulletText(' Keyword để WE thành công trong cuộc sống là hãy quản trị được cảm xúc của mình và biến cảm xúc thành vũ khí lợi hại'),
                                    Divider(),
                                    CommonUI.bulletText(' Biết được khi nào một cái gì đó là “đủ tốt” và coi đó như là đã hoàn tất. Hãy vui tươi, thoải mái trải nghiệm, nuôi dưỡng sự thanh thản cho tâm hồn.'),
                                    Divider(),
                                    CommonUI.bulletText(' Gia tăng hoạt động đội nhóm để tối đa hóa điểm mạnh của tập thể. Tham gia các hoạt động phát triển kỹ năng giao tiếp.'),
                                  ]
                                ), _textController
                              ),
                              CommonUI.textCard('Giao tiếp với với chủng WE:', 3, -1,
                                Column(
                                  children: <Widget>[
                                    CommonUI.bulletText(' Nên thông báo và thảo luận trước kế hoạch.'),
                                    Divider(),
                                    CommonUI.bulletText(' Khi hoàn thành nhiệm vụ nên khen ngợi và thưởng.'),
                                    Divider(),
                                    CommonUI.bulletText(' Hình thành kỹ năng quản lý trạng thái cảm xúc của bản thân cho cá nhân này.'),
                                    Divider(),
                                    CommonUI.bulletText(' Chia sẻ và giúp họ phân tích trước những tình huống.'),
                                    Divider(),
                                    CommonUI.bulletText(' Đưa ra lựa chọn cùng lợi ích của việc cần làm thay vì đưa ra mệnh lệnh.'),
                                    Divider(),
                                    CommonUI.bulletText(' Để trẻ quyết định những việc nằm trong khả năng thay vì ba mẹ tự quyết định hoặc làm giúp.'),
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