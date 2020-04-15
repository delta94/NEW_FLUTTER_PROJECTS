import 'package:flutter/material.dart';
import 'package:image_color_picker/image_color_picker.dart';
void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: HomePage(),
    );
  }
}

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Plugin example app'),
      ),
      body: Center(
        child: RaisedButton(
          child: Text('View Image'),
          onPressed: () {
            Navigator.push(
                context,
                MaterialPageRoute(
                    builder: (context) => NetworkImageBG(
                          networkpath:
                              'https://media-exp1.licdn.com/dms/image/C5122AQEtG7CO0rFCRg/feedshare-shrink_800/0?e=1588809600&v=beta&t=kc8G2jGTOzxm0ehLchKh0SlTSyUl62Vtb5K59P00BLY',
                        )));
          },
        ),
      ),
    );
  }
}