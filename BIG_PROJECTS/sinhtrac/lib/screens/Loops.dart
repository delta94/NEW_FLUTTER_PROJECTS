import 'package:firebase_admob/firebase_admob.dart';
import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Loops extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Loops({
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
        title: Text('Chủng Nước (Loop)', style: TextStyle(color: Colors.yellowAccent),),
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
                      Text("Chủng Nước (Loop)", style: TextStyle(color: Colors.cyanAccent, fontWeight: FontWeight.bold, fontSize: 25),),
                      Image.asset("images/nuoc.png", height: 200, width: 200),
                      CommonUI.centerBulletText(' Tỉ lệ xuất hiện: 65%.'),
                      CommonUI.centerBulletText(' Vân móc: không có tâm (không có hoa tay).'),
                      CommonUI.centerBulletText(' Có 1 tam giác điểm ở phía dưới.'),
                      Divider(),
                      Column(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: <Widget>[
                          Text('CÁC CHỦNG CON:', style: TextStyle(color: Colors.cyanAccent, fontSize: 17, fontWeight: FontWeight.bold)),
                          Text('(Chạm vào hình để xem chi tiết):', style: TextStyle(color: Colors.cyanAccent, fontSize: 17, fontWeight: FontWeight.bold)),
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
                                  CommonUI.openDetail(Image.asset("images/ul_draw.JPG", height: 200, width: 250), '/loop_u', context),
                                  CommonUI.moveToNextPage(1, _childController)
                                ]), 
                                color: Colors.transparent,
                              ),
                              Card(child: Row(
                                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                children: <Widget>[
                                  CommonUI.moveToPreviousPage(0, _childController),
                                  CommonUI.openDetail(Image.asset("images/rl_draw.JPG", height: 200, width: 250), '/loop_r', context),
                                  CommonUI.moveToNextPage(2, _childController)
                                ]), 
                                color: Colors.transparent,
                              ),
                              Card(child: Row(
                                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                children: <Widget>[
                                  CommonUI.moveToPreviousPage(1, _childController),
                                  CommonUI.openDetail(Image.asset("images/fl_draw.JPG", height: 200, width: 250), '/loop_f', context),
                                  Container(width: 20.0, height: 0.0),
                                ]), 
                                color: Colors.transparent,
                              ),
                            ],
                          ),
                        )
                      ),

                      Divider(),
                      Text('ĐẶC ĐIỂM:', style: TextStyle(color: Colors.cyanAccent, fontSize: 17, fontWeight: FontWeight.bold)),
                      Container(
                        height: 800.0,
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
                                          CommonUI.bulletText(' Linh hoạt và thích nghi như nước, rất thích đám đông và cộng đồng.'),
                                          Divider(),
                                          CommonUI.bulletText(' Khả năng bắt chước vượt trội (cần phải có hình mẫu), học nhanh trong môi trường và trong xã hội, qua trải nghiệm thành công, thất bại của cuộc sống.'),
                                          Divider(),
                                          CommonUI.bulletText(' Sẵn sàng hòa mình vào dòng chảy của cuộc sống.'),
                                          Divider(),
                                          CommonUI.bulletText(' Thân thiện, cởi mở - Mở cửa cho những ý tưởng mới.'),
                                          Divider(),
                                          CommonUI.bulletText(' Nói chuyện cởi mở, trong công việc thì dễ thương lượng, cả tin (dễ thuyết phục).'),
                                          Divider(),
                                          CommonUI.bulletText(' Thích được khen, thích được động viên, không thích xung đột, mâu thuẫn; buồn khi bị chê bai, so sánh với người khác (chán luôn, chẳng muốn làm nữa).'),
                                          Divider(),
                                          CommonUI.bulletText(' Thích được chia sẻ, tâm sự cũng như lắng nghe người khác, dễ mủi lòng, đồng cảm.'),
                                          Divider(),
                                          CommonUI.bulletText(' Thích hoạt động cộng đồng, giao tiếp, từ thiện…'),
                                          Divider(),
                                          CommonUI.bulletText(' Khác với chủng đại bàng, người chủng nước tính quyết đoán không cao.'),
                                          Divider(),
                                          CommonUI.bulletText(' Kết nối đám đông, cộng đồng tốt.'),
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
                                          CommonUI.bulletText(' Cần sự động viên và khích lệ thông qua những lời khen, những câu nói khích lệ chứ không phải những lời chê bai.'),
                                          Divider(),
                                          CommonUI.bulletText(' Nếu bạn là chủng nước, bạn cần 1 nhà lãnh đạo, quản lý tốt.'),
                                          Divider(),
                                          CommonUI.bulletText(' Tìm những người sở hữu vân tay chủng đại bàng tốt để hợp tác làm ăn.'),
                                          Divider(),
                                          CommonUI.bulletText(' Bạn thương người nên dễ bị dụ lắm. Nên cẩn thận đừng vội cả tin mà hãy thảo luận với những người thân trước.'),
                                          Divider(),
                                          CommonUI.bulletText(' Bàn tay bạn nhiều chủng Loop quá nên tìm đến những người chủng WE truyền lửa , những người sở hữu chủng WT mục tiêu cao.'),
                                          Divider(),
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