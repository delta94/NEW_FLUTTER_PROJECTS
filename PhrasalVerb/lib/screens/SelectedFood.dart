import 'package:com.seab1ird.showyourself/utils/Utils.dart';
import 'package:flutter/material.dart';
import 'package:shimmer/shimmer.dart';

class SelectedFoodScreen extends StatelessWidget {
  final String image;
  final String tag;

  const SelectedFoodScreen({Key key, this.image, this.tag}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        backgroundColor: Colors.transparent,
        body: GestureDetector(
          onTap: () => Navigator.pop(context),
          child: Material(
            color: Colors.black.withOpacity(0.8),
            child: Padding(
              padding: EdgeInsets.all(Utils.deviceSize.width / 5),
              child: Column(
                children: [
                  Center(
                    child: Container(
                      padding: EdgeInsets.all(10),
                      decoration: BoxDecoration(
                        color: Colors.black,
                        borderRadius: BorderRadius.circular(8),
                      ),
                      child: Column(
                        children: [
                          Shimmer.fromColors(
                            baseColor: Colors.white,
                            highlightColor: Colors.yellow,
                            child: Text(
                              'Orange',
                              style: TextStyle(
                                color: Colors.white,
                                fontSize: Utils.fontSize(),
                                fontWeight: FontWeight.bold,
                              ),
                            ),
                          ),
                          SizedBox(height: 10),
                          Hero(
                            tag: tag,
                            child: Image.asset(
                              image,
                            ),
                          ),
                          SizedBox(height: 10),
                          Text(
                            '20 mg/100g',
                            style: TextStyle(
                              color: Colors.white,
                              fontSize: Utils.fontSize() * 0.8,
                              fontWeight: FontWeight.bold,
                            ),
                          ),
                        ],
                      ),
                    ),
                  ),
                ],
              ),
            ),
          ),
        ),
      ),
    );
  }
}
