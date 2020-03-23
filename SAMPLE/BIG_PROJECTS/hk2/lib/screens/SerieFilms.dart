import 'dart:async';

import 'package:dio/dio.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:hkfilms2/models/TypeVideo.model.dart';

class SerieFilms extends StatefulWidget {
  SerieFilms({Key key}) : super(key: key);
  SerieFilmsState createState() => SerieFilmsState();
}

class SerieFilmsState extends State<SerieFilms> {
  String message = 'Đang Tải...';
  final dio = new Dio();
  List items = new List();
  bool isLoading = false;

  @override
  void initState() {
    super.initState();
    this._getData();

    Timer(Duration(seconds: 4), () {
      setState(() {
       message = "Vui lòng kết nối Wifi. Thanks 😘😘😘";
      });
    });

    Timer.periodic(new Duration(seconds: 4), (timer) {
      if(items.length == 0){
        _getData();
      }
    });
  }

  void _getData() async {
    setState(() {
      isLoading = true;
    });

    final response = await dio.get('https://beer-199402.firebaseapp.com/api/v1/old_series_films');
    
    setState(() {
      isLoading = false;
      items = response.data;
      //Toast.show('ddddd: ' + items.length.toString(), context);
    });
  }

  @override
  void dispose() {
    super.dispose();
  }

  Widget _buildProgressIndicator() {
    return new Padding(
      padding: const EdgeInsets.all(8.0),
      child: new Center(
        child: new Opacity(
          opacity: isLoading ? 1.0 : 00,
          child: Text(message, style: TextStyle(color: Colors.yellowAccent, fontWeight: FontWeight.bold),)
        ),
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    SystemChrome.setSystemUIOverlayStyle(SystemUiOverlayStyle.dark.copyWith(
      statusBarColor: Colors.black12, //or set color with: Color(0xFF0000FF)
    ));
    return new Scaffold(
      appBar: AppBar(
        title: Text('Phim Bộ Xưa Hay', style: TextStyle(color: Colors.yellow),),
        iconTheme: new IconThemeData(color: Colors.yellow),
        backgroundColor: Color.fromRGBO(50, 50, 50, 1),
      ),
      body: new Stack(
        children: <Widget>[
          new Container(
            decoration: new BoxDecoration(
              image: new DecorationImage(image: new AssetImage('images/bg.png'), fit: BoxFit.cover,),
            ),
          ),
          new Container(
            padding: EdgeInsets.only(top: 60),
            child: new ListView.builder(
              //+1 for progressbar
              itemCount: items.length + 1,
              itemBuilder: (BuildContext context, int index) {
                if (index == items.length) {
                  return _buildProgressIndicator();
                } else {
                  return GestureDetector(
                        onTap: () { Navigator.pushNamed(context, '/listfilms', arguments: TypeVideoModel(items[index]['name'], items[index]['image'], items[index]['filmList'])); },
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
                                  Image.network(items[index]['image'], height: 100, width: 100),
                                  Expanded(
                                    child:
                                      Container(
                                        margin: EdgeInsets.only(left: 5),
                                        child: Text(items[index]['name'], style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold, color: Colors.yellow)),
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
                  }
                )
          )
        ]
      )
    );
  }
}

BoxDecoration myBoxDecoration() {
  return BoxDecoration(
    color: Color.fromRGBO(60, 60, 60, 1),
    border: Border.all(
      width: 3.0
    ),
    borderRadius: BorderRadius.all(
        Radius.circular(5.0) //         <--- border radius here
    ),
  );
}