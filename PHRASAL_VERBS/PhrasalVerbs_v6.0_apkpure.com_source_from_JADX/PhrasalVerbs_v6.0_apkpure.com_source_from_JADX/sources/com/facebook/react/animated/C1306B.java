package com.facebook.react.animated;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;

/* renamed from: com.facebook.react.animated.B */
class C1306B implements C1329c {

    /* renamed from: a */
    final /* synthetic */ int f4233a;

    /* renamed from: b */
    final /* synthetic */ NativeAnimatedModule f4234b;

    C1306B(NativeAnimatedModule nativeAnimatedModule, int i) {
        this.f4234b = nativeAnimatedModule;
        this.f4233a = i;
    }

    /* renamed from: a */
    public void mo4804a(double d) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("tag", this.f4233a);
        createMap.putDouble("value", d);
        ((RCTDeviceEventEmitter) this.f4234b.getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("onAnimatedValueUpdate", createMap);
    }
}
