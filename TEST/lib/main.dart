import 'package:flutter/material.dart';
import 'package:shadow/shadow.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  bool isSelected = false;

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        body: Center(
          child: Stack(alignment: Alignment.bottomCenter, children: <Widget>[
            isSelected
                ? Positioned(
                    top: 50,
                    child: Image.asset(
                      "images/CreatedObject7_28.png",
                      width: 100 * 1.07,
                      color: Colors.yellow,
                    ),
                  )
                : Container(),
            Positioned(
              top: 50 * 1.07,
              child: Image.asset("images/CreatedObject7_28.png", width: 100),
            ),
          ]),
        ),
        floatingActionButton: Center(
          child: FloatingActionButton(
              backgroundColor: isSelected ? Colors.red : Colors.grey,
              onPressed: () {
                setState(() => isSelected = !isSelected);
              },
              child: Text('Toggle')),
        ),
      ),
    );
  }
}
