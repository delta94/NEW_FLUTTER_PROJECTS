import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:swsinhtrac/models/CommonUI.dart';

class History extends StatelessWidget {
  final String title;
  final String message;

  // This Widget accepts the arguments as constructor parameters. It does not
  // extract the arguments from the ModalRoute.
  //
  // The arguments are extracted by the onGenerateRoute function provided to the
  // MaterialApp widget.
  const History({
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
        title: Text('Lịch sử Sinh Trắc Vân Tay', style: TextStyle(color: Colors.yellowAccent),),
        iconTheme: new IconThemeData(color: Colors.yellowAccent),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
        actions: <Widget>[
            // action button
            IconButton(
              icon: Icon(Icons.home),
              onPressed: () {
                // Navigator.popUntil(context, ModalRoute.withName('/'));
                
                Navigator.of(context).pushNamedAndRemoveUntil('/', ModalRoute.withName('/history'));   
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
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: <Widget>[
                      Image.asset("images/sinhtrac_intro.png", height: 170, width: 100),
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
                            CommonUI.bulletText(' Năm 1823: Tiến sĩ Jan Purkinje phân loại những chủng trên các vân tay thành 9 loại: arch, tented arch, ulnar loop, radial loop, peacock’s eye/compound, spiral whorl, elliptical whorl, circular whorl, và double loop/composite.'),
                            Divider(),
                            CommonUI.bulletText(' Năm 1893: Francis Galton (cháu của Charles Darwin) là người đầu tiên phát hiện vai trò của vân tay trong lĩnh vực di truyền và sự khác biệt vân tay ở những chủng tộc khác nhau. Ông đã đơn giản hoá việc phân loại vân tay và chia vân tay thành 3 loại lớn: Vân sóng (không có tam giác điểm), vân móc (có 1 tam giác điểm), vân xoáy (có 2 tam giác điểm) (1892) Francis Galton (cháu của Charles Darwin) là người đầu tiên phát hiện vai trò của vân tay trong lĩnh vực di truyền và sự khác biệt vân tay ở những chủng tộc khác nhau.'),
                            Divider(),
                            CommonUI.bulletText(' Năm 1926: Tiến sĩ Harold Cummins được xem là cha đẻ của ngành nghiên cứu khoa học dấu vân tay đưa ra lý luận chỉ số cường độ vân tay PI (Pattern Intensity).Giá trị RC, số lượng tam giác điểm, hình dạng vân tay, vị trí hình dạng vân tay ở những ngón tay khác nhau có liên quan đến tiềm năng và trí tuệ của con người.Ông nghiên cứu ra rằng dấu vân tay được hình thành đồng thời với sự hoàn thiện các cấu trúc của não bộ. Dấu vân tay được khởi tạo ở thai nhi vào giai đọan từ 13 đến 19 tuần tuổi. Vào giai đọan trước đó, thai nhi không có dấu vân tay đồng thời não bộ cũng chỉ trong giai đoạn hình thành. Khi thai nhi được 19 tuần tuổi cũng là lúc các vùng chính của não hình thành bao gồm cả vỏ đại não.'),
                            Divider(),
                            CommonUI.bulletText(' Năm 1969: John J. Mulvihill, MD và David W. Smith, MD xuất bảncuốn “Thiên tài qua vân tay”, cung cấp phiên bản mới nhất về sựhình thành của vân tay. '),
                            Divider(),
                            CommonUI.bulletText(' Năm 1970: Liên Xô sử dụng Sinh trắc vân tay trong việc lựa chọn thí sinh cho thế vận hội Olympic. '),
                            Divider(),
                            CommonUI.bulletText(' Năm 1980: Trung Quốc thực hiện công trình nghiên cứu tiềm năng con người, trí thông minh và tài năng trong vân tay và gen của con người.'),
                            Divider(),
                            CommonUI.bulletText(' Năm 1985: Tiến sĩ Chen Yi Mou – Đại học Havard nghiên cứu Sinh trắc vân tay dựa trên Thuyết Đa Thông Minh của Tiến sĩ Howard Gardner. Đây là lần đầu tiên áp dụng Sinh trắc dấu vân tay trong lĩnh vực giáo dục và chức năng của não liên quan đến dấu vân tay. '),
                            Divider(),
                            CommonUI.bulletText(' Năm 2004: Trung tâm IBMBS (Trung tâm Sinh trắc học Xã hội và Hành vi ứng xử quốc tế) đã xuất bản hơn 7000 luận án về Sinh trắc vân tay. Ngày nay, Mỹ, Nhật Bản, Trung Quốc, Đài Loan áp dụng Sinh trắc vân tay đến các lĩnh vực giáo dục, hy vọng sẽ cải thiện chất lượng giảng dạy và nâng cao hiệu quả học tập bằng cách xác định các phong cách học tập khác nhau.Các nhà nghiên cứu khẳng định độ chính xác của Sinh trắc vân tay rất cao, đó là khả năng dự báo từ các tính năng của tay… '),
                            Divider(),
                            CommonUI.bulletText(' Ngày nay, Hoa Kỳ, Nhật, Trung Quốc  và Đài Loan đã dụng sinh trắc vân tay trong lĩnh vực giáo dục nhằm nâng cao chất lượng giáo dục và hiệu quả học tâp bằng việc áp dụng nhiều phương pháp học khác nhau.'),
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