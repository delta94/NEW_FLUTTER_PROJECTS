import 'package:flutter/services.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.biometry/AppProvider.dart';
import 'package:seabird.biometry/helpers/AdBannerTemplate.dart';

class Intro extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));
    return Scaffold(
        appBar: AppBar(
            title: Text(
              'Giới thiệu Sinh Trắc',
              style: TextStyle(
                color: Colors.yellowAccent,
                fontWeight: FontWeight.bold,
                decoration: TextDecoration.underline,
                decorationColor: Colors.yellowAccent,
                decorationStyle: TextDecorationStyle.solid,
                shadows: [
                  Shadow(
                    color: Colors.yellowAccent,
                    blurRadius: 2.0,
                    offset: Offset(1.0, 1.0),
                  ),
                ],
              ),
            ),
            iconTheme: new IconThemeData(color: Colors.yellowAccent),
            backgroundColor: Color.fromRGBO(50, 50, 50, 1),
            actions: <Widget>[
              // action button
              IconButton(
                icon: Image.asset('images/home_icon.png'),
                onPressed: () {
                  // Navigator.popUntil(context, ModalRoute.withName('/home'));

                  Navigator.of(context).pushNamedAndRemoveUntil(
                      '/home', ModalRoute.withName('/intro'));
                  // Navigator.pop(context);
                  // Navigator.pop(context, "/");
                },
              )
            ]),
        body: new Stack(children: <Widget>[
          new Container(
            decoration: new BoxDecoration(color: Colors.black87),
          ),
          AdBannerTemplate(
            needShowSecondBanner:
                !Provider.of<AppProvider>(context, listen: false).admobLoaded,
            child: new Container(
                padding: EdgeInsets.only(left: 10, right: 10, top: 0),
                child: Column(children: <Widget>[
                  Row(children: <Widget>[
                    Image.asset("images/info.png", width: 80),
                    Expanded(
                      child: Padding(
                          padding: EdgeInsets.all(8.0),
                          child: Text.rich(TextSpan(
                              text: 'Sinh Trắc Vân Tay: ',
                              style: TextStyle(
                                  color: Colors.yellowAccent,
                                  fontWeight:
                                      FontWeight.bold), // default text style
                              children: <TextSpan>[
                                TextSpan(
                                    text:
                                        ' Là ngành khoa học nghiên cứu về mối liên hệ giữa cấu trúc não bộ, sự phân bổ noron thần kinh với vân tay con người để có định hướng giáo dục phù hợp, phát triển bản thân.',
                                    style: TextStyle(
                                        fontStyle: FontStyle.italic,
                                        color: Colors.white,
                                        fontWeight: FontWeight.normal)),
                              ]))),
                    )
                  ]),
                  Expanded(
                      child: Container(
                          padding: EdgeInsets.only(bottom: 20),
                          child: ListView(
                            children: <Widget>[
                              Text(
                                  '- Ngành khoa học sinh trắc vân tay dựa trên những thành tựu khi nghiên cứu về di truyền học, phôi học, sự cấu tạo của vân da tay và não bộ. Khoa học sinh trắc vân tay đã phân tích mật độ, độ ngắn dài của vân tay, hình dạng của vân tay… để phân tích chỉ số TFRC và các năng lực tiềm ẩn của não bộ.\n',
                                  style: TextStyle(
                                      color: Colors.white, fontSize: 15)),
                              Text(
                                  '- Bàn tay càng nhiều chủng vân tay nào thì tính cách của bạn sẽ thiên nhiều về chủng vân tay đó. Ngón cái sẽ ảnh hưởng nhiều hơn các ngón còn lại.\n',
                                  style: TextStyle(
                                      color: Colors.yellowAccent,
                                      fontSize: 15)),
                              Divider(),
                              Container(
                                child: Column(
                                  children: <Widget>[
                                    RaisedButton(
                                      color: Colors.red,
                                      onPressed: () {},
                                      child: Text(
                                        'CÁ NHÂN:',
                                        style: TextStyle(
                                            color: Colors.white,
                                            fontWeight: FontWeight.bold),
                                      ),
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Khám phá bản thân bằng cách khám phá các năng lực tiềm ẩn của bạn.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Giúp bạn định hướng nghề̀ nghiệp phù hợp với tài năng bẩm sinh.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Khơi dậy niềm đam mê của bạn trong công việc để đạt được mục tiêu và thành công.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Hiểu rõ bản thân để tự làm giàu giá trị của mình.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Divider(),
                                    RaisedButton(
                                      color: Colors.blue,
                                      onPressed: () {},
                                      child: Text(
                                        'GIÁO DỤC:',
                                        style: TextStyle(
                                            color: Colors.white,
                                            fontWeight: FontWeight.bold),
                                      ),
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Biết được năng lực bẩm sinh, điểm mạnh, yếu qua 8 loại hình trí thông minh.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Xác định phương pháp học tập tốt nhất qua đặc tính hấp thu VAK.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Đánh giá bản thân thông qua các chỉ số EQ, IQ, CQ, AQ và tỉ lệ giữa các chỉ số này.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Xác định tính cách của trẻ, từ đó xây dựng sự tự tin, tự lập cho con.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Tư vấn cải thiện mối quan hệ hòa hợp giữa bố mẹ và con trẻ.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Đánh giá các chỉ số năng động thông qua việc phân tích hai bán cầu não.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Thiết lập các chương trình học tập cần thiết nhằm giảm thiểu các chi phí cho việc đầu tư vào các khóa học không cần thiết.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Divider(),
                                    RaisedButton(
                                      color: Colors.orange,
                                      onPressed: () {},
                                      child: Text(
                                        'GIA ĐÌNH:',
                                        style: TextStyle(
                                            color: Colors.white,
                                            fontWeight: FontWeight.bold),
                                      ),
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Cha mẹ thấu hiểu các năng khiếu bẩm sinh, điểm manh và điểm yếu của con em bạn, từ đó định hướng cho trẻ ngay từ khi con còn nhỏ.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Tư vấn cải thiện các bất đồng quan điểm giữa cha mẹ và con trẻ.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Thấu hiểu lẫn nhau – Nâng cao giá trị gia đình.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Divider(),
                                    RaisedButton(
                                      color: Colors.green,
                                      onPressed: () {},
                                      child: Text(
                                        'DOANH NGHIỆP:',
                                        style: TextStyle(
                                            color: Colors.white,
                                            fontWeight: FontWeight.bold),
                                      ),
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Giúp doanh nghiệp sàng lọc trong tuyển dụng, đánh giá năng lực thực hiện công việc và phong cách của ứng viên.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Phát huy tiềm năng nhân viên tạo đột phá cho doanh nghiệp.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Khám phá tiềm năng của nhân viên nhằm bố trí đúng người vào đúng vị trí.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Tư vấn củng cố nguồn nhân lực. Tìm ra các lãnh đạo tài ba.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                    Row(
                                      children: <Widget>[
                                        Expanded(
                                          child: Text(
                                              '– Tư vấn, phát triển nhân sự.',
                                              style: TextStyle(
                                                  color: Colors.white,
                                                  fontSize: 17)),
                                        ),
                                      ],
                                    ),
                                    Divider(),
                                  ],
                                ),
                              )
                            ],
                          )))
                ])),
          )
        ]));
  }
}
