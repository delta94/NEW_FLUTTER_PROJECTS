import 'package:firebase_admob/firebase_admob.dart';
import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Archs extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Archs({
    Key key,
    this.title,
    this.message,
  }) : super(key: key);
  

  @override
  Widget build(BuildContext context) {
    PageController _childController = PageController(initialPage: 0, keepPage: false);
    PageController _textController = PageController(initialPage: 0, keepPage: false);
    Ads.hideBanner1Ad();
    Ads.showBanner2Ad();
    
    // InterstitialAd(
    //   adUnitId: INTERSTITIAL_ID,
    //   targetingInfo: Ads.targetingInfo,
    // )..load()..show();

    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));
    return Scaffold(
      appBar: AppBar(
        title: Text('Chủng Núi (Arch)', style: TextStyle(color: Colors.yellowAccent),),
        iconTheme: new IconThemeData(color: Colors.yellowAccent),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
        actions: <Widget>[
            // action button
            IconButton(
              icon: Icon(Icons.home),
              onPressed: () {
                Navigator.of(context).pushNamedAndRemoveUntil('/', ModalRoute.withName('/regconize'));   
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
                      Text("Chủng Núi (Arch)", style: TextStyle(color: Colors.orange, fontWeight: FontWeight.bold, fontSize: 25),),
                      Image.asset("images/nui.png", height: 200, width: 200),
                      CommonUI.centerBulletText(' Tỉ lệ xuất hiện: 4%.'),
                      CommonUI.centerBulletText(' Vân hình núi/sóng.', Colors.white),
                      CommonUI.centerBulletText(' Không có tâm (không có hoa tay).', Colors.white),
                      Divider(),
                      Column(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: <Widget>[
                          Text('CÁC CHỦNG CON:', style: TextStyle(color: Colors.orange, fontSize: 17, fontWeight: FontWeight.bold)),
                          Text('(Chạm vào hình để xem chi tiết):', style: TextStyle(color: Colors.orange, fontSize: 17, fontWeight: FontWeight.bold)),
                        ],
                      ),
                      Container(
                        height: 150.0,
                        margin: EdgeInsets.symmetric(vertical: 5.0),
                        child:  SafeArea(
                          child: PageView(
                            controller: _childController,
                            children: <Widget>[
                              Card(child: Row(
                                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                children: <Widget>[
                                  Container(width: 20.0, height: 0.0),
                                  CommonUI.openDetail(Image.asset("images/as_draw.JPG", height: 200, width: 250), '/arch_s', context),
                                  CommonUI.moveToNextPage(1, _childController)
                                ]), 
                                color: Colors.transparent,
                              ),
                              Card(child: Row(
                                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                children: <Widget>[
                                  CommonUI.moveToPreviousPage(0, _childController),
                                  CommonUI.openDetail(Image.asset("images/at_draw.JPG", height: 200, width: 250), '/arch_t', context),
                                  CommonUI.moveToNextPage(2, _childController)
                                ]), 
                                color: Colors.transparent,
                              ),
                              Card(child: Row(
                                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                children: <Widget>[
                                  CommonUI.moveToPreviousPage(1, _childController),
                                  CommonUI.openDetail(Image.asset("images/au_draw.JPG", height: 200, width: 250), '/arch_u', context),
                                  CommonUI.moveToNextPage(3, _childController)
                                ]), 
                                color: Colors.transparent,
                              ),
                              Card(child: Row(
                                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                children: <Widget>[
                                  CommonUI.moveToPreviousPage(2, _childController),
                                  CommonUI.openDetail(Image.asset("images/ar_draw.JPG", height: 200, width: 250), '/arch_r', context),
                                  CommonUI.moveToNextPage(4, _childController)
                                ]), 
                                color: Colors.transparent,
                              ),
                              Card(child: Row(
                                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                children: <Widget>[
                                  CommonUI.moveToPreviousPage(3, _childController),
                                  CommonUI.openDetail(Image.asset("images/ae_draw.JPG", height: 200, width: 250), '/arch_r', context),
                                  Container(width: 20.0, height: 0.0),
                                ]), 
                                color: Colors.transparent,
                              ),
                            ],
                          ),
                        )
                      ),

                      Divider(),
                      Text('ĐẶC ĐIỂM:', style: TextStyle(color: Colors.orange, fontSize: 17, fontWeight: FontWeight.bold)),
                      Container(
                        height: 1000.0,
                        margin: EdgeInsets.symmetric(vertical: 5.0),
                        child:  SafeArea(
                          child: PageView(
                            controller: _textController,
                            children: <Widget>[
                              Card(
                                child: Container(
                                  padding: EdgeInsets.only(left: 10),
                                  child: Column(
                                    children: <Widget>[
                                      Divider(),
                                      Row(
                                        mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                        children: <Widget>[
                                          Container(width: 20.0, height: 0.0),
                                          CommonUI.titleParagraph('Đặc tính chung:'),
                                          CommonUI.moveToNextPage(1, _textController)
                                        ]
                                      ),
                                      Divider(),
                                      Column(
                                        children: <Widget>[
                                          CommonUI.bulletText(' Là người nhanh giận nhưng cũng nhanh quên (dù rất giận nhưng chỉ cần được nói ngọt thì quên ngay, dễ sống), là người không để bụng.'),
                                          Divider(),
                                          CommonUI.bulletText(' Chủng thiên tài vì khả năng hấp thu như miếng bọt biển, hấp thu không ngừng (hấp thu tốt nhất là trước năm 16 tuổi).'),
                                          Divider(),
                                          CommonUI.bulletText(' Chậm chắc, từng bước, từng bước một.'),
                                          Divider(),
                                          CommonUI.bulletText(' Như một con ong chăm chỉ, làm những việc lặp đi lặp lại hàng ngày cực kì tốt. Rất cẩn thận.'),
                                          Divider(),
                                          CommonUI.bulletText(' Thích làm theo những lối mòn, không thích thay đổi (sẽ rất khó sống với những người RL – nước ngược). Muốn thay đổi cần phải từ từ.'),
                                          Divider(),
                                          CommonUI.bulletText(' Là người rất đáng tin cậy, có tinh thần trách nhiệm cao. Cam kết nhiệm vụ với sự tuân thủ nghiêm ngặt.'),
                                          Divider(),
                                          CommonUI.bulletText(' Thích sự an toàn, công việc và phong cách sống đơn giản, thực tế.'),
                                          Divider(),
                                          CommonUI.bulletText(' Có khả năng kết nối những thành viên trong gia đình'),
                                          Divider(),
                                          CommonUI.bulletText(' Quyết tâm và kiên trì cao.'),
                                          Divider(),
                                          CommonUI.bulletText(' Rất chân thành với tình bạn lâu dài, đặc biệt với những người họ tôn trọng.'),
                                          Divider(),
                                          CommonUI.bulletText(' Ý thức mạnh mẽ về công lý.'),
                                          Divider(),
                                          CommonUI.bulletText(' Thích sự ổn định yên bình. Không thích sự xô bồ, náo nhiệt.'),
                                          Divider(),
                                          CommonUI.bulletText(' Không thích tư duy trừu tượng và mơ hồ. Nghi ngờ và hoài nghi về bất cứ điều gì mới.'),
                                          Divider(),
                                          CommonUI.bulletText(' Họ có khả năng hướng dẫn cho người khác về các quy trình.'),
                                          Divider(),
                                          CommonUI.bulletText(' Nếu có 4 Arch trở lên thì bạn là một người rất tuyệt vời và đặc biệt.'),
                                          // Divider(),
                                          // CommonUI.bulletText(' '),
                                          // Divider(),
                                          // CommonUI.bulletText(' '),
                                        ]
                                      ),
                                    ],
                                  ),
                                ),
                                color: Colors.transparent,
                              ),
                              Card(
                                child: Container(
                                  padding: EdgeInsets.only(left: 10),
                                  child: Column(
                                    children: <Widget>[
                                      Divider(),
                                      Row(
                                        mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                        children: <Widget>[
                                          CommonUI.moveToPreviousPage(0, _textController),
                                          CommonUI.titleParagraph('Phương pháp giáo dục:'),
                                          Container(width: 20.0, height: 0.0),
                                        ]
                                      ),
                                      Divider(),
                                      Column(
                                        children: <Widget>[
                                          CommonUI.bulletText(' Với những người này nên hạn chế tranh luận, phân tích dễ gây mất lòng và xung đột khi họ không đồng tình quan điểm.'),
                                          Divider(),
                                          CommonUI.bulletText(' Tạo môi trường học tập nhanh và nhiều lên mỗi ngày, họ hấp thu vô hạn.'),
                                          Divider(),
                                          CommonUI.bulletText(' Nên cho họ làm việc với WE về tinh thần vì họ hấp thu từ những người thông thái và đem lửa tới cho họ, làm việc với WD vì họ sao chép nhanh.'),
                                          Divider(),
                                          CommonUI.bulletText(' Chúng tôi khuyên các bậc phụ huynh có con thuộc chủng vân tay này nên cho con những lời khen khi con làm tốt hoặc cả khi con làm không tốt để bé tự tin vào mình.'),
                                          Divider(),
                                          CommonUI.bulletText(' Luôn tạo cho con môi trường thể hiện cái tôi và rèn luyện khả năng đưa ý kiến của con bằng việc hỏi con về các quyết định mà có liên quan đến bé.'),
                                          Divider(),
                                          CommonUI.bulletText(' Tạo cho con thói quen đọc sách và tìm hiểu thế giới ngay từ bé để khắc phục sự lười biếng của bé.'),
                                        ]
                                      ),
                                    ],
                                  ),
                                ),
                                color: Colors.transparent,
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