import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class Intro extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const Intro({
    Key key,
    this.title,
    this.message,
  }) : super(key: key);
  

  @override
  Widget build(BuildContext context) {
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));
    return Scaffold(
      appBar: AppBar(
        title: Text('Giới thiệu Sinh Trắc Vân Tay', style: TextStyle(color: Colors.yellowAccent),),
        iconTheme: new IconThemeData(color: Colors.yellowAccent),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
        actions: <Widget>[
            // action button
            IconButton(
              icon: Icon(Icons.home),
              onPressed: () {
                // Navigator.popUntil(context, ModalRoute.withName('/'));
                
                Navigator.of(context).pushNamedAndRemoveUntil('/', ModalRoute.withName('/intro'));   
                // Navigator.pop(context);
                // Navigator.pop(context, "/");
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
            child: Center(
              child: Column(
                children: <Widget>[
                  Row(
                    children: <Widget>[
                    Image.asset("images/sinhtrac_intro.png", height: 170, width: 100),
                    Expanded(
                      child: Padding(
                        padding: EdgeInsets.all(8.0),
                        child: Text.rich(TextSpan(
                          text: 'Sinh Trắc Vân Tay: ', 
                          style: TextStyle(color: Colors.yellow, fontWeight: FontWeight.bold),// default text style
                          children: <TextSpan>[
                            TextSpan(
                              text: ' Là ngành khoa học nghiên cứu về mối liên hệ giữa cấu trúc não bộ, sự phân bổ noron thần kinh với vân tay con người để có định hướng giáo dục phù hợp, phát triển bản thân.', 
                              style: TextStyle(fontStyle: FontStyle.italic, color: Colors.yellow, fontWeight: FontWeight.normal)
                            ),
                          ]
                        )
                      )
                    ),
                    )
                  ]),
                  RaisedButton(
                    color: Colors.red,
                    onPressed: () {
                      Navigator.pushNamed(context, '/dermatoglyphics');
                    },
                    child: Text('Xem Sinh Trắc Vân Tay', style: TextStyle(color: Colors.white, fontWeight: FontWeight.bold),),
                  ),
                  Divider(),
                  Expanded(
                    child: Container(
                        padding: EdgeInsets.only(bottom: 50),
                        child: ListView(
                          children: <Widget>[
                            Text(
                            'Mỗi vân tay trên ngón tay của bạn đều đang nói lên khả năng, tính cách và đặc trưng riêng của não bộ của bạn. Nếu bạn khám phá ra sớm để phát huy hết khả năng thì bạn sẽ sớm thành công hơn. Sinh trắc vân tay được ứng dụng rộng rãi trong nhiều lĩnh vực và mang lại nhiều giá trị cho từng nhóm đối tượng cụ thể:\n' 
                            , style: TextStyle(color: Colors.white)),
                            Row(
                              mainAxisAlignment: MainAxisAlignment.center,
                              children: <Widget>[
                                Icon(FontAwesomeIcons.user, color: Colors.red, size: 20, ),
                                Text(' CÁ NHÂN:', style: TextStyle(color: Colors.redAccent, fontWeight: FontWeight.bold)),
                              ],
                            ),
                            CommonUI.bulletText(' Hiểu được tính cách và năng lực bẩm sinh.'),
                            CommonUI.bulletText(' Tìm ra phương pháp học tập tối ưu.'),
                            CommonUI.bulletText(' Nhận diện trí thông minh nổi trội.'),
                            CommonUI.bulletText(' Đánh thức tiềm năng và đam mê.'),
                            CommonUI.bulletText(' Đánh thức thiên hướng phát triển ngành nghề.'),
                            Divider(),
                            Row(
                              mainAxisAlignment: MainAxisAlignment.center,
                              children: <Widget>[
                                Icon(FontAwesomeIcons.userFriends, color: Colors.blue, size: 20, ),
                                Text('  GIA ĐÌNH:', style: TextStyle(color: Colors.blue, fontWeight: FontWeight.bold)),
                              ],
                            ),
                            CommonUI.bulletText(' Vợ chồng thấu hiểu nhau.'),
                            CommonUI.bulletText(' Có cùng hướng nhìn trong cách giáo dục con.'),
                            CommonUI.bulletText(' Thấu hiểu tính cách và tiềm năng bẩm sinh.'),
                            CommonUI.bulletText(' Tạo môi trường và chương trình học phù hợp.'),
                            CommonUI.bulletText(' Nhận diện thiên hướng ngành nghề đam mê.'),
                            CommonUI.bulletText(' Cải thiện bất đồng cha mẹ và con cái.'),
                            Divider(),
                            Row(
                              mainAxisAlignment: MainAxisAlignment.center,
                              children: <Widget>[
                                Icon(FontAwesomeIcons.school, color: Colors.amber, size: 20, ),
                                Text('  NHÀ TRƯỜNG:', style: TextStyle(color: Colors.amber, fontWeight: FontWeight.bold)),
                              ],
                            ),
                            CommonUI.bulletText(' Tạo sự gắn kết giữa nhà trường và phụ huynh.'),
                            CommonUI.bulletText(' Giáo viên dễ dàng trong việc tương tác và giảng dạy.'),
                            CommonUI.bulletText(' Học sinh hào hứng hơn với các giờ học.'),
                            CommonUI.bulletText(' Ổn định và gia tăng số lượng học viên.'),
                            CommonUI.bulletText(' Nâng cao uy tín và chất lượng đào tạo cảu nhà trường.'),
                            Divider(),
                            Row(
                              mainAxisAlignment: MainAxisAlignment.center,
                              children: <Widget>[
                                Icon(FontAwesomeIcons.businessTime, color: Colors.greenAccent, size: 20, ),
                                Text('  DOANH NGHIỆP:', style: TextStyle(color: Colors.greenAccent, fontWeight: FontWeight.bold)),
                              ],
                            ),
                            CommonUI.bulletText(' Nhận định tiềm năng và phong cách làm việc của nhân sự.'),
                            CommonUI.bulletText(' Phát huy hiệu suất công việc của cả tập thể.'),
                            CommonUI.bulletText(' Củng cố nguồn lực để tạo ra nhân tài.'),
                            CommonUI.bulletText(' Kích thích đam mê và giữ chân nhân tài.'),
                            CommonUI.bulletText(' Tạo ra môi trường, văn hóa thấu hiểu và chia sẻ.'),
                          ],
                        )
                      )
                    )
                  ]
                )
              )
            )
                  
        ])
    );
  }

}