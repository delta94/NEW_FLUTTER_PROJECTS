class DataInfo {
  final List<Info> infos;

  DataInfo(this.infos);
}

class Info {
  final String infoText;
  final List<String> smallInfos;

  Info(this.infoText, {this.smallInfos = const []});
}
