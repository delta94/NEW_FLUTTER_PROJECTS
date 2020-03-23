//
//  Generated file. Do not edit.
//

#import "GeneratedPluginRegistrant.h"

#if __has_include(<app_review/AppReviewPlugin.h>)
#import <app_review/AppReviewPlugin.h>
#else
@import app_review;
#endif

#if __has_include(<firebase_admob/FirebaseAdMobPlugin.h>)
#import <firebase_admob/FirebaseAdMobPlugin.h>
#else
@import firebase_admob;
#endif

#if __has_include(<package_info/FLTPackageInfoPlugin.h>)
#import <package_info/FLTPackageInfoPlugin.h>
#else
@import package_info;
#endif

#if __has_include(<url_launcher/FLTURLLauncherPlugin.h>)
#import <url_launcher/FLTURLLauncherPlugin.h>
#else
@import url_launcher;
#endif

#if __has_include(<ytview/WebViewFlutterPlugin.h>)
#import <ytview/WebViewFlutterPlugin.h>
#else
@import ytview;
#endif

@implementation GeneratedPluginRegistrant

+ (void)registerWithRegistry:(NSObject<FlutterPluginRegistry>*)registry {
  [AppReviewPlugin registerWithRegistrar:[registry registrarForPlugin:@"AppReviewPlugin"]];
  [FLTFirebaseAdMobPlugin registerWithRegistrar:[registry registrarForPlugin:@"FLTFirebaseAdMobPlugin"]];
  [FLTPackageInfoPlugin registerWithRegistrar:[registry registrarForPlugin:@"FLTPackageInfoPlugin"]];
  [FLTURLLauncherPlugin registerWithRegistrar:[registry registrarForPlugin:@"FLTURLLauncherPlugin"]];
  [YTWebViewFlutterPlugin registerWithRegistrar:[registry registrarForPlugin:@"YTWebViewFlutterPlugin"]];
}

@end
