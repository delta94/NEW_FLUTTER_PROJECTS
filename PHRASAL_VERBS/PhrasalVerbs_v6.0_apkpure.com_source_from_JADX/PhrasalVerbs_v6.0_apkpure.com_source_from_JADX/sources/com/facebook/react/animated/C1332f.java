package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.f */
class C1332f extends C1326Q {

    /* renamed from: h */
    private final C1312H f4316h;

    /* renamed from: i */
    private final int f4317i;

    /* renamed from: j */
    private final double f4318j;

    /* renamed from: k */
    private final double f4319k;

    /* renamed from: l */
    private double f4320l = 0.0d;

    public C1332f(ReadableMap readableMap, C1312H h) {
        this.f4316h = h;
        this.f4317i = readableMap.getInt("input");
        this.f4318j = readableMap.getDouble("min");
        this.f4319k = readableMap.getDouble("max");
    }

    /* renamed from: f */
    private double m5690f() {
        C1328b d = this.f4316h.mo4824d(this.f4317i);
        if (d != null && (d instanceof C1326Q)) {
            return ((C1326Q) d).mo4864d();
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
    }

    /* renamed from: a */
    public void mo4836a() {
        double f = m5690f();
        double d = f - this.f4320l;
        this.f4320l = f;
        this.f4296e = Math.min(Math.max(this.f4296e + d, this.f4318j), this.f4319k);
    }
}
