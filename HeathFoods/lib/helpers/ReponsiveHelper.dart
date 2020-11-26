import 'dart:ui';

import 'package:flutter/widgets.dart';

class ReponsiveHelper {
  static Size deviceSize;
}

Size getDeviceSize(BuildContext context) => ReponsiveHelper.deviceSize;
bool get isIpad =>
    ReponsiveHelper.deviceSize.width / ReponsiveHelper.deviceSize.height > 0.65;
double ipadIconSize() => ReponsiveHelper.deviceSize.width / 15;
double ipadFontSize() => ReponsiveHelper.deviceSize.width / 24;

// Some common sizes
double getMenuSpaceSize() => isIpad ? 20 : 0;

// TEXT
double getXXlargeTextSize() => isIpad ? ipadFontSize() * 1.3 : 40;
double getXlargeTextSize() => isIpad ? ipadFontSize() * 1.2 : 30;
double getLargeTextSize() => isIpad ? ipadFontSize() * 1.1 : 25;
double getMediumTextSize() => isIpad ? ipadFontSize() : 20;
double getSmallTextSize() => isIpad ? ipadFontSize() * 0.8 : 20;
double getXSSmallTextSize() => isIpad ? ipadFontSize() * 0.6 : 18;
double getXSmallTextSize() => isIpad ? ipadFontSize() * 0.4 : 15;
double getXXSmallTextSize() => isIpad ? ipadFontSize() * 0.2 : 10;

// IMAGE
double getXLargeLogoSize() => isIpad ? ipadIconSize() : 40;
double getLargeLogoSize() => isIpad ? ipadIconSize() * 0.8 : 40;
double getMediumLogoSize() => isIpad ? ipadIconSize() : 30;
double getMediumSLogoSize() => isIpad ? ipadIconSize() * 0.9 : 25;
double getSmallLogoSize() => isIpad ? ipadIconSize() * 0.8 : 20;
double getXSmallLogoSize() => isIpad ? ipadIconSize() * 0.6 : 16;
