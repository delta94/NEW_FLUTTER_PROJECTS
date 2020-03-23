import 'dart:async';

import 'package:dio/dio.dart';
import 'package:firebase_admob_example/helpers/CommonFunctions.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter/widgets.dart';
import 'package:firebase_admob_example/models/TypeVideo.model.dart';

class TypeMovies extends StatefulWidget {
  TypeMovies({Key key}) : super(key: key);
  TypeMoviesState createState() => TypeMoviesState();
}

class TypeMoviesState extends State<TypeMovies> {
  String message = 'Đang Tải...';
  final dio = new Dio();
  List listSubjects = new List();
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
      if(listSubjects.length == 0){
        _getData();
      }
    });
  }

  void _getData() async {
    setState(() {
      isLoading = true;
    });

    final response = await dio.get('https://beer-199402.firebaseapp.com/api/v1/retailHkFilms');
    
    setState(() {
      isLoading = false;
      listSubjects = response.data;
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
        title: Text('Danh Sách diễn viên', style: TextStyle(color: Colors.yellowAccent),),
        iconTheme: new IconThemeData(color: Colors.yellowAccent),
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
            child: new GridView.builder(
              itemCount: listSubjects.length + 1,
              gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                crossAxisCount: 2, 
              ),
              itemBuilder: (BuildContext context, int index) {
                if (index == listSubjects.length) {
                  return _buildProgressIndicator();
                } else {
                  return GestureDetector(
                        onTap: () { Navigator.pushNamed(context, '/listMovies', arguments: TypeVideoModel(listSubjects[index]['name'], listSubjects[index]['image'], listSubjects[index]['filmList'])); },
                        child: Column(
                          mainAxisAlignment: MainAxisAlignment.spaceBetween,
                          children: <Widget>[
                            Container(
                              margin: EdgeInsets.only(left: 10, right: 10),
                              padding: EdgeInsets.only(top: 10, bottom: 10),  
                              alignment: Alignment.center,
                              // color: Colors.yellow,
                              decoration: CommonFunctions.boxDecoration(),
                              child: Column(
                                mainAxisAlignment: MainAxisAlignment.center,
                                children: <Widget>[
                                  Image.network(listSubjects[index]['image'], height: 100, width: 100),
                                  SizedBox(height: 15,),
                                  Wrap(
                                    children: <Widget>[
                                      Text(listSubjects[index]['name'], style: TextStyle(fontSize: 15, fontWeight: FontWeight.bold, color: Colors.yellow)),
                                    ],
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