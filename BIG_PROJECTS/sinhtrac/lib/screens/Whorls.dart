import 'package:firebase_admob/firebase_admob.dart';
import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:swsinhtrac/models/Ads.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Whorls extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Whorls({
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
        title: Text('Chủng Đại Bàng (Whorl)', style: TextStyle(color: Colors.yellowAccent),),
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
                      Text("Chủng đại bàng (Whorl)", style: TextStyle(color: Colors.red, fontWeight: FontWeight.bold, fontSize: 25),),
                      Image.asset("images/daibang.png", height: 200, width: 200),
                      CommonUI.centerBulletText(' Tỉ lệ xuất hiện: 30%.'),
                      CommonUI.centerBulletText(' Vân xoáy: có tâm (hoa tay).'),
                      CommonUI.centerBulletText(' Có 2 tam giác điểm ở 2 bên phía dưới.'),
                      Divider(),
                      Column(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: <Widget>[
                          Text('CÁC CHỦNG CON:', style: TextStyle(color: Colors.redAccent, fontSize: 17, fontWeight: FontWeight.bold)),
                          Text('(Chạm vào hình để xem chi tiết):', style: TextStyle(color: Colors.redAccent, fontSize: 17, fontWeight: FontWeight.bold)),
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
                                  CommonUI.openDetail(Image.asset("images/wt_draw.JPG", height: 200, width: 250), '/whorl_t', context),
                                  CommonUI.moveToNextPage(1, _childController)
                                ]), 
                                color: Colors.transparent,
                              ),
                              Card(child: Row(
                                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                children: <Widget>[
                                  CommonUI.moveToPreviousPage(0, _childController),
                                  CommonUI.openDetail(Image.asset("images/ws_draw.JPG", height: 200, width: 250), '/whorl_s', context),
                                  CommonUI.moveToNextPage(2, _childController)
                                ]), 
                                color: Colors.transparent,
                              ),
                              Card(child: Row(
                                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                children: <Widget>[
                                  CommonUI.moveToPreviousPage(1, _childController),
                                  CommonUI.openDetail(Image.asset("images/we_draw.JPG", height: 200, width: 250), '/whorl_e', context), 
                                  CommonUI.moveToNextPage(3, _childController)
                                ]), 
                                color: Colors.transparent,
                              ),
                              Card(child: Row(
                                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                children: <Widget>[
                                  CommonUI.moveToPreviousPage(2, _childController),
                                  CommonUI.openDetail(Image.asset("images/wc_draw.JPG", height: 200, width: 250), '/whorl_c', context), 
                                  CommonUI.moveToNextPage(4, _childController)
                                ]), 
                                color: Colors.transparent,
                              ),
                              Card(child: Row(
                                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                children: <Widget>[
                                  CommonUI.moveToPreviousPage(3, _childController),
                                  CommonUI.openDetail(Image.asset("images/wd_draw.JPG", height: 200, width: 250), '/whorl_d', context),
                                  CommonUI.moveToNextPage(5, _childController)
                                ]), 
                                color: Colors.transparent,
                              ),
                              Card(child: Row(
                                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                children: <Widget>[
                                  CommonUI.moveToPreviousPage(4, _childController),
                                  CommonUI.openDetail(Image.asset("images/wi_draw.JPG", height: 200, width: 250), '/whorl_i', context),
                                  CommonUI.moveToNextPage(6, _childController)
                                ]), 
                                color: Colors.transparent,
                              ),
                              Card(child: Row(
                                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                children: <Widget>[
                                  CommonUI.moveToPreviousPage(5, _childController),
                                  CommonUI.openDetail(Image.asset("images/wp_draw.JPG", height: 200, width: 250), '/whorl_p', context),
                                  CommonUI.moveToNextPage(7, _childController)
                                ]), 
                                color: Colors.transparent,
                              ),
                              Card(child: Row(
                                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                children: <Widget>[
                                  CommonUI.moveToPreviousPage(6, _childController),
                                  CommonUI.openDetail(Image.asset("images/wx_draw.JPG", height: 200, width: 250), '/whorl_x', context),
                                  Container(width: 20.0, height: 0.0),
                                ]), 
                                color: Colors.transparent,
                              ),
                            ],
                          ),
                        )
                      ),

                      Divider(),
                      Text('ĐẶC ĐIỂM:', style: TextStyle(color: Colors.redAccent, fontSize: 17, fontWeight: FontWeight.bold)),
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
                                          CommonUI.bulletText(' Khó bảo, bướng bỉnh, ko thích bị áp, cứng đầu.'),
                                          Divider(),
                                          CommonUI.bulletText(' Có khả năng tập trung mục tiêu cao, ít bị xao nhãng.'),
                                          Divider(),
                                          CommonUI.bulletText(' Bạn thích người khác lắng nghe và tuân thủ sự sắp xếp của bạn. Không thích bị chỉ ra điểm sai.'),
                                          Divider(),
                                          CommonUI.bulletText(' Tập trung vào mục tiêu của mình.'),
                                          Divider(),
                                          CommonUI.bulletText(' Nội tâm khép kín, ít chia sẻ với người khác, thường thích học tập và chơi một mình hơn là các hoạt động nhóm.'),
                                          Divider(),
                                          CommonUI.bulletText(' Tính cá nhân cao nên cái tôi lớn, muốn mình làm trung tâm.'),
                                          Divider(),
                                          CommonUI.bulletText(' Mạnh mẽ – Chủ Động – Quyết tâm cao.'),
                                          Divider(),
                                          CommonUI.bulletText(' Tự lập, chủ động. Tự thích làm mọi việc'),
                                          Divider(),
                                          CommonUI.bulletText(' Tính cá nhân cao nên đôi khi khó hòa hợp với đội nhóm.'),
                                          Divider(),
                                          CommonUI.bulletText(' Có xu hướng muốn áp đặt, thay đổi người khác theo quan điểm của mình.'),
                                          Divider(),
                                          CommonUI.bulletText(' Năng động, tính mục tiêu và làm việc chăm chỉ với một sự kiên trì và ý chí mạnh mẽ.'),
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
                                          CommonUI.bulletText(' Không nên mắng trẻ, góp ý trước đông người mà chờ lúc riêng tư, lúc nói chuyện nhẹ nhàng, thoải mái thì mới góp ý nhẹ nhàng.'),
                                          Divider(),
                                          CommonUI.bulletText(' Thu nhỏ làm 1 mục tiêu trước, sau đó hoàn thành rồi tiếp tục mục tiêu tiếp theo. Chọn 1 thứ thôi sẽ tuyệt vời hơn.'),
                                          Divider(),
                                          CommonUI.bulletText(' Tạo ra những trải nghiệm thực tế giúp họ tự tin hơn.'),
                                          Divider(),
                                          CommonUI.bulletText(' Với trẻ có vân tay này, đừng bao giờ dọa.'),
                                          Divider(),
                                          CommonUI.bulletText(' Bố mẹ nói là làm, nói 1 là 1, 2 là 2 còn nếu không về sau đừng hòng nói bé nghe.'),
                                          Divider(),
                                          CommonUI.bulletText(' Cần cho trẻ tham gia các hoạt động tập thể'),
                                          Divider(),
                                          CommonUI.bulletText(' Không nuông chiều bé quá.'),
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