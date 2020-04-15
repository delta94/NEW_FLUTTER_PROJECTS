package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.j */
class C1336j extends C1326Q {

    /* renamed from: h */
    private final C1312H f4334h;

    /* renamed from: i */
    private final int f4335i;

    /* renamed from: j */
    private final double f4336j;

    public C1336j(ReadableMap readableMap, C1312H h) {
        this.f4334h = h;
        this.f4335i = readableMap.getInt("input");
        this.f4336j = readableMap.getDouble("modulus");
    }

    /* renamed from: a */
    public void mo4836a() {
        C1328b d = this.f4334h.mo4824d(this.f4335i);
        if (d == null || !(d instanceof C1326Q)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
        }
        this.f4296e = ((C1326Q) d).mo4864d() % this.f4336j;
    }
}
