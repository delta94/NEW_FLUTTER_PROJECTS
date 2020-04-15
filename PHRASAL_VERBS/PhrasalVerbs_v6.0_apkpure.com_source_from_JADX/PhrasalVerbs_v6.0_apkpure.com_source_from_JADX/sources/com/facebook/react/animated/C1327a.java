package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.a */
class C1327a extends C1326Q {

    /* renamed from: h */
    private final C1312H f4299h;

    /* renamed from: i */
    private final int[] f4300i;

    public C1327a(ReadableMap readableMap, C1312H h) {
        this.f4299h = h;
        ReadableArray array = readableMap.getArray("input");
        this.f4300i = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f4300i;
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
        this.f4296e = 0.0d;
        int i = 0;
        while (true) {
            int[] iArr = this.f4300i;
            if (i < iArr.length) {
                C1328b d = this.f4299h.mo4824d(iArr[i]);
                if (d != null && (d instanceof C1326Q)) {
                    this.f4296e += ((C1326Q) d).mo4864d();
                    i++;
                }
            } else {
                return;
            }
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.Add node");
    }
}
