package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.g */
class C1333g extends C1326Q {

    /* renamed from: h */
    private final C1312H f4321h;

    /* renamed from: i */
    private final int[] f4322i;

    public C1333g(ReadableMap readableMap, C1312H h) {
        this.f4321h = h;
        ReadableArray array = readableMap.getArray("input");
        this.f4322i = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f4322i;
            if (i < iArr.length) {
                iArr[i] = array.getInt(i);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo4836a() {
        int i = 0;
        while (true) {
            int[] iArr = this.f4322i;
            if (i < iArr.length) {
                C1328b d = this.f4321h.mo4824d(iArr[i]);
                if (d != null && (d instanceof C1326Q)) {
                    double d2 = ((C1326Q) d).mo4864d();
                    if (i == 0) {
                        this.f4296e = d2;
                    } else if (d2 != 0.0d) {
                        this.f4296e /= d2;
                    } else {
                        throw new JSApplicationCausedNativeException("Detected a division by zero in Animated.divide node");
                    }
                    i++;
                }
            } else {
                return;
            }
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.divide node");
    }
}
