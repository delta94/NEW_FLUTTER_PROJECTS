import 'dart:async';
import 'dart:convert';
import 'dart:io';

import 'package:firebase_admob/firebase_admob.dart';
import 'package:swswhaitonghop/models/Ads.dart';
import 'package:swswhaitonghop/models/TypeVideo.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:swswhaitonghop/screens/ExitWarning.dart';
import 'package:http/http.dart' as http;
import 'package:swswhaitonghop/models/TypeVideo.model.dart';
import 'package:swswhaitonghop/screens/DrawerMenu.dart';

Future<List<TypeVideo>> fetchData() async {
  final response = await http.get('https://beer-199402.firebaseapp.com/api/v1/vn_comedy');
  
  if (response.statusCode == 200) {
    // If the call to the server was successful, parse the JSON.
    // return TypeVideo.fromJson(json.decode(response.body));

    final parsed = json.decode(response.body).cast<Map<String, dynamic>>();

    return parsed.map<TypeVideo>((json) => TypeVideo.fromJson(json)).toList();
  } else {
    // If that call was not successful, throw an error.
    throw Exception('Failed to load post');
  }
}

class Home extends StatefulWidget {
  Home({Key key}) : super(key: key);
  HomeState createState() => HomeState();
}

class HomeState extends State<Home> {
  String message = 'Đang Tải...';

  Future<bool> _onWillPop() {
    InterstitialAd(
      adUnitId: INTERSTITIAL_ID,
      targetingInfo: Ads.targetingInfo,
    )..load()..show();
    return showDialog(
      context: context,
      builder: (context) => ExitWarning(),
    ) ?? false;
  }

  @override
  void initState() {
    super.initState();
    Ads.showBannerAd();

    Timer(Duration(seconds: 3), () {
      setState(() {
       message = "Vui lòng kết nối internet. Thanks 😘😘😘";
      });
    });
  }

  @override
  void dispose() {
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));
    return new WillPopScope(
      onWillPop: _onWillPop,
      child:  Scaffold(
      appBar: AppBar(
        title: Text('Hài Việt Hay', style: TextStyle(color: Colors.yellow),),
        iconTheme: new IconThemeData(color: Colors.yellow),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
      ),
      drawer: DrawerMenu(),
      body: new Stack(
        children: <Widget>[
          new Container(
            decoration: new BoxDecoration(
              image: new DecorationImage(image: new AssetImage('images/bg.png'), fit: BoxFit.cover,),
            ),
          ),
          new Center(
                child: 
                    FutureBuilder<List<TypeVideo>>(
                    future: fetchData(),
                    builder: (context, snapshot) {
                    if (snapshot.hasData) {
                      return Column(
                        children: <Widget>[
                          new Expanded(
                            child:  ListView.builder(
                                    scrollDirection: Axis.vertical,
                                    shrinkWrap: true,
                                    padding: EdgeInsets.only(top: 50, left: 10, right: 10),
                                    itemCount: snapshot.data.length,
                                    itemBuilder: (context, index) {
                                      return GestureDetector(
                                        onTap: () { Navigator.pushNamed(context, '/listfilms', arguments: TypeVideoModel(snapshot.data[index].name, snapshot.data[index].imageLink, snapshot.data[index].filmList)); },
                                        child: Column(
                                          mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                          children: <Widget>[
                                            Container(
                                              padding: EdgeInsets.only(left: 10, top: 5, bottom: 5),
                                              alignment: Alignment.center,
                                              // color: Colors.yellow,
                                              decoration: myBoxDecoration(),
                                              child: Row(
                                                children: <Widget>[
                                                  Image.network(snapshot.data[index].imageLink, height: 100, width: 100),
                                                  Expanded(
                                                    child:
                                                      Container(
                                                        margin: EdgeInsets.only(left: 5),
                                                        child: Text(" " + snapshot.data[index].name, style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold, color: Colors.yellow)),
                                                      )
                                                  )
                                                ],
                                              )
                                            ),
                                            Divider(height: 10), //  
                                          ]
                                        )
                                      );
                                    }
                                  )
                                ),
                                Divider(height: 35)
                        ]);
                    } else  {
                      // By default, show a loading spinner.
                      return Center(child: Text(message, style: TextStyle(color: Colors.yellowAccent, fontWeight: FontWeight.bold),));
                    }
                  }
                )
          )
        ]
      )
    ));
  }
}

BoxDecoration myBoxDecoration() {
  return BoxDecoration(
    color: Color.fromRGBO(50, 50, 50, 1),
    border: Border.all(
      width: 3.0
    ),
    borderRadius: BorderRadius.all(
        Radius.circular(5.0) //         <--- border radius here
    ),
  );
}