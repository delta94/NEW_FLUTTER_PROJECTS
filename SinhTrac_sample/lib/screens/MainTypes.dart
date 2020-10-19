import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:seabird.biometry/helpers/Ads.dart';
import 'package:seabird.biometry/helpers/CommonFunctions.dart';

void main() => runApp(MainTypes());

class MainTypes extends StatefulWidget {
  createState() => MainTypesState();
}

class MainTypesState extends State<MainTypes>
    with SingleTickerProviderStateMixin {
  @override
  void initState() {
    super.initState();
    // ..addListener(() => setState(() {}));
  }

  @override
  Widget build(BuildContext context) {
    SystemChrome.setPreferredOrientations([DeviceOrientation.portraitUp]);
    return Scaffold(
        appBar: AppBar(
            title: Row(children: <Widget>[
              Container(),
              FittedBox(
                fit: BoxFit.fitWidth,
                child: Text(
                  "Các chủng chính",
                  style: TextStyle(
                    fontWeight: FontWeight.bold,
                    color: Colors.yellowAccent,
                    decoration: TextDecoration.underline,
                    decorationColor: Colors.greenAccent,
                    decorationStyle: TextDecorationStyle.solid,
                    shadows: [
                      Shadow(
                        color: Colors.black,
                        blurRadius: 10.0,
                        offset: Offset(5.0, 5.0),
                      ),
                    ],
                  ),
                ),
              )
            ]),
            iconTheme: new IconThemeData(color: Colors.yellowAccent),
            backgroundColor: Colors.black87,
            actions: <Widget>[
              // action button
              IconButton(
                icon: Image.asset('images/home_icon.png'),
                onPressed: () {
                  // Navigator.popUntil(context, ModalRoute.withName('/'));

                  Navigator.of(context).pushNamedAndRemoveUntil(
                      '/', ModalRoute.withName('/intro'));
                  // Navigator.pop(context);
                  // Navigator.pop(context, "/");
                },
              )
            ]),
        body: Stack(children: <Widget>[
          new Container(
            decoration: new BoxDecoration(
              image: new DecorationImage(
                image: new AssetImage('images/background.jpg'),
                fit: BoxFit.cover,
              ),
            ),
          ),
          new Container(
              margin: EdgeInsets.only(top: 60),
              alignment: Alignment.center,
              child: Column(
                children: <Widget>[
                  Expanded(
                      child: Container(
                          width: 230,
                          child: ListView(children: <Widget>[
                            Container(
                                width: 30,
                                padding: EdgeInsets.only(
                                    left: 10, top: 10, bottom: 10),
                                margin: EdgeInsets.only(bottom: 5),
                                alignment: Alignment.center,
                                decoration: CommonFunctions.boxDecoration(
                                    Color.fromRGBO(247, 255, 230, 1)),
                                child: GestureDetector(
                                  child: Column(
                                    children: <Widget>[
                                      Image.asset('images/eagle.png',
                                          width: 130),
                                      Text(
                                        "Chủng Đại Bàng",
                                        style: TextStyle(
                                            fontSize: 25,
                                            fontWeight: FontWeight.bold,
                                            color: Colors.redAccent),
                                      ),
                                    ],
                                  ),
                                  onTap: () {
                                    Navigator.pushNamed(context, '/w');
                                  },
                                )),
                            Container(
                                padding: EdgeInsets.only(
                                    left: 10, top: 10, bottom: 10),
                                margin: EdgeInsets.only(bottom: 5),
                                alignment: Alignment.center,
                                decoration: CommonFunctions.boxDecoration(
                                    Color.fromRGBO(230, 255, 230, 1)),
                                child: GestureDetector(
                                  child: Column(
                                    children: <Widget>[
                                      Image.asset('images/water.png',
                                          width: 130),
                                      Divider(),
                                      Text(
                                        "Chủng Nước",
                                        style: TextStyle(
                                            fontSize: 25,
                                            fontWeight: FontWeight.bold,
                                            color: Colors.blueAccent),
                                      ),
                                    ],
                                  ),
                                  onTap: () {
                                    Navigator.pushNamed(context, '/l');
                                  },
                                )),
                            Container(
                                padding: EdgeInsets.only(
                                    left: 10, top: 10, bottom: 10),
                                margin: EdgeInsets.only(bottom: 5),
                                alignment: Alignment.center,
                                decoration: CommonFunctions.boxDecoration(
                                    Color.fromRGBO(230, 242, 255, 1)),
                                child: GestureDetector(
                                  child: Column(
                                    children: <Widget>[
                                      Image.asset('images/mountain.png',
                                          width: 130),
                                      Divider(),
                                      Text(
                                        "Chủng Núi",
                                        style: TextStyle(
                                            fontSize: 25,
                                            fontWeight: FontWeight.bold,
                                            color: Colors.lightGreen),
                                      ),
                                    ],
                                  ),
                                  onTap: () {
                                    Navigator.pushNamed(context, '/a');
                                  },
                                )),
                            Container(
                                padding: EdgeInsets.only(
                                    left: 10, top: 10, bottom: 10),
                                margin: EdgeInsets.only(bottom: 5),
                                alignment: Alignment.center,
                                decoration: CommonFunctions.boxDecoration(
                                    Color.fromRGBO(100, 100, 100, 1)),
                                child: GestureDetector(
                                  child: Row(
                                    mainAxisAlignment: MainAxisAlignment.center,
                                    children: <Widget>[
                                      Image.asset('images/exit.png',
                                          height: 30, width: 30),
                                      Text(
                                        " Thoát",
                                        style: TextStyle(
                                            fontSize: 25,
                                            fontWeight: FontWeight.bold,
                                            color: Colors.lightGreenAccent),
                                      ),
                                    ],
                                  ),
                                  onTap: () {
                                    Navigator.pop(context);
                                  },
                                )),
                          ])))
                ],
              ))
        ]));
  }

  @override
  void dispose() {
    super.dispose();
  }
}
