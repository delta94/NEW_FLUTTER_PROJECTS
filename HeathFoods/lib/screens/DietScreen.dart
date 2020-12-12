import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:provider/provider.dart';
import 'package:seabird.goutfood/AppProvider.dart';
import 'package:seabird.goutfood/data/DietData.dart';
import 'package:seabird.goutfood/helpers/AdHelpers.dart';
import 'package:seabird.goutfood/helpers/ReponsiveHelper.dart';
import 'package:seabird.goutfood/helpers/Helpers.dart';
import 'package:seabird.goutfood/models/DataInfo.dart';
import 'package:seabird.goutfood/widgets/AdBannerTemplate.dart';
import 'package:seabird.goutfood/widgets/RateButton.dart';

class DietScreen extends StatefulWidget {
  @override
  _DietScreenState createState() => _DietScreenState();
}

class _DietScreenState extends State<DietScreen> {
  @override
  void initState() {
    AdHelpers.showInterAd();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        appBar: AppBar(
          leading: IconButton(
            icon: Image.asset(
              'images/home_icon.png',
              height: getMediumLogoSize(),
            ),
            onPressed: () => Helpers.backToHomeScreen(context),
          ),
          title: Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                SizedBox(
                  width: 10,
                ),
                Text(
                  'Diet Menu',
                  style: TextStyle(
                    color: Colors.black,
                    fontSize: getMediumTextSize(),
                  ),
                ),
                SizedBox(
                  width: 50,
                ),
              ]),
          iconTheme: IconThemeData(color: Colors.yellowAccent),
          backgroundColor: Colors.yellowAccent[100],
          actions: <Widget>[RateButton()],
        ),
        body: AdBannerTemplate(
          child: Container(
            color: Colors.transparent,
            child: Column(
              children: [
                SizedBox(height: 10),
                Expanded(
                  child: SingleChildScrollView(
                    child: Column(
                      children: [...getDataInfosWidgets(DietData.dietData)],
                    ),
                  ),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }

  List<Widget> getDataInfosWidgets(Map<String, DataInfo> dataInfoMap) {
    var widgets = <Widget>[];
    dataInfoMap.forEach((title, dataInfo) {
      widgets.add(Column(
        children: [
          Container(
            margin: EdgeInsets.only(top: 10),
            padding: EdgeInsets.symmetric(horizontal: 5),
            child: Column(
              children: [
                Container(
                  padding: EdgeInsets.all(5),
                  decoration: BoxDecoration(
                    color: Colors.yellowAccent[100],
                    borderRadius: BorderRadius.circular(5),
                  ),
                  child: Text(
                    title,
                    style: TextStyle(
                      fontSize: getSmallTextSize(),
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                ),
                ...getInfosWidgets(dataInfo.infos),
              ],
            ),
          ),
          SizedBox(height: 15),
          Divider(color: Colors.black, height: 1, thickness: 1)
        ],
      ));
    });

    return widgets;
  }

  List<Widget> getInfosWidgets(List<Info> infos) {
    var widgets = <Widget>[];
    for (var i = 0; i < infos.length; i++) {
      widgets.add(
        Column(
          children: [
            Row(
              children: [
                Container(
                  padding: EdgeInsets.symmetric(vertical: 10, horizontal: 5),
                  child: Row(
                    children: [
                      Text(
                        infos[i].infoText,
                        style: TextStyle(
                          color: Colors.black,
                          fontWeight: infos[i].smallInfos.isEmpty
                              ? FontWeight.normal
                              : FontWeight.bold,
                          fontSize: getSmallTextSize(),
                        ),
                      ),
                      ...getSmallInfos(infos[i].smallInfos)
                    ],
                  ),
                ),
              ],
            ),
            if (i < infos.length - 1)
              Divider(color: Colors.grey[300], height: 1, thickness: 1)
          ],
        ),
      );
    }

    return widgets;
  }

  List<Widget> getSmallInfos(List<String> smallInfos) {
    var widgets = <Widget>[];
    smallInfos.forEach((smallInfo) {
      widgets.add(
        Column(
          children: [
            Row(
              children: [
                Container(
                  constraints: BoxConstraints(
                      maxWidth: ReponsiveHelper.deviceSize.width -
                          (isIpad ? 180 : 160)),
                  padding: EdgeInsets.symmetric(vertical: 10, horizontal: 5),
                  child: Column(
                    children: [
                      Text(
                        '$smallInfo',
                        style: TextStyle(
                          color: Colors.black,
                          fontSize: getSmallTextSize(),
                        ),
                      ),
                    ],
                  ),
                ),
              ],
            ),
          ],
        ),
      );
    });

    return widgets;
  }
}
