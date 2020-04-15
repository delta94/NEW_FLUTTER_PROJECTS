package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.M */
class C1318M extends C1326Q {

    /* renamed from: h */
    private final C1312H f4281h;

    /* renamed from: i */
    private final int[] f4282i;

    public C1318M(ReadableMap readableMap, C1312H h) {
        this.f4281h = h;
        ReadableArray array = readableMap.getArray("input");
        this.f4282i = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f4282i;
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
            int[] iArr = this.f4282i;
            if (i < iArr.length) {
                C1328b d = this.f4281h.mo4824d(iArr[i]);
                if (d != null && (d instanceof C1326Q)) {
                    C1326Q q = (C1326Q) d;
                    double d2 = q.mo4864d();
                    if (i != 0) {
                        d2 = this.f4296e - q.mo4864d();
                    }
                    this.f4296e = d2;
                    i++;
                }
            } else {
                return;
            }
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.subtract node");
    }
}
