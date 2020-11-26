import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'test_provider.dart';

class Counter extends StatefulWidget {
  @override
  _CounterState createState() => _CounterState();
}

class _CounterState extends State<Counter> {
  @override
  Widget build(BuildContext context) {
    final counterProvider =
        Provider.of<CounterProvider>(context, listen: false);
    return SafeArea(
      child: Scaffold(
        body: Column(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: <Widget>[
            Container(
              color: Colors.yellow,
              child: GridView.builder(
                  shrinkWrap: true,
                  padding: EdgeInsets.symmetric(vertical: 5, horizontal: 5),
                  itemCount: 8,
                  gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                    mainAxisSpacing: 5,
                    crossAxisSpacing: 5,
                    childAspectRatio: 2,
                    crossAxisCount: 4,
                  ),
                  itemBuilder: (BuildContext context, int index) {
                    return Container(
                      color: Colors.red,
                    );
                  }),
            ),
            Expanded(
              child: Container(
                color: Colors.blue,
              ),
            )
          ],
        ),
      ),
    );
  }
}
