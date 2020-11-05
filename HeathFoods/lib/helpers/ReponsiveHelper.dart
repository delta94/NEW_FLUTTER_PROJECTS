import 'dart:ui';

import 'package:flutter/widgets.dart';

class ReponsiveHelper {
  static Size deviceSize;
}

Size getDeviceSize(BuildContext context) => ReponsiveHelper.deviceSize;
bool isIpad() =>
    ReponsiveHelper.deviceSize.width / ReponsiveHelper.deviceSize.height > 0.65;
double ipadIconSize() => ReponsiveHelper.deviceSize.width / 15;
double ipadFontSize() => ReponsiveHelper.deviceSize.width / 24;

// Some common sizes
double getMenuSpaceSize() => isIpad() ? 20 : 0;

// TEXT
double getXXlargeTextSize() => isIpad() ? ipadFontSize() : 40;
double getXlargeTextSize() => isIpad() ? ipadFontSize() : 30;
double getLargeTextSize() => isIpad() ? ipadFontSize() : 25;
double getMediumTextSize() => isIpad() ? ipadIconSize() : 20;
double getSmallTextSize() => isIpad() ? ipadFontSize() * 0.7 : 20;
double getXSmallTextSize() => isIpad() ? ipadFontSize() * 0.4 : 10;

// IMAGE
double getXLargeLogoSize() => isIpad() ? ipadIconSize() : 40;
double getLargeLogoSize() => isIpad() ? ipadIconSize() * 0.8 : 40;
double getMediumLogoize() => isIpad() ? ipadIconSize() : 30;
