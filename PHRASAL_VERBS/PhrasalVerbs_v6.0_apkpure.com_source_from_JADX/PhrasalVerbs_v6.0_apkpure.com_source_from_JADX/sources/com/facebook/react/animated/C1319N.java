package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.N */
class C1319N extends C1328b {

    /* renamed from: e */
    private final C1312H f4283e;

    /* renamed from: f */
    private final int f4284f;

    /* renamed from: g */
    private final int f4285g;

    /* renamed from: h */
    private final int f4286h;

    /* renamed from: i */
    private final JavaOnlyMap f4287i;

    C1319N(ReadableMap readableMap, C1312H h) {
        this.f4283e = h;
        this.f4284f = readableMap.getInt("animationId");
        this.f4285g = readableMap.getInt("toValue");
        this.f4286h = readableMap.getInt("value");
        this.f4287i = JavaOnlyMap.deepClone(readableMap.getMap("animationConfig"));
    }

    /* renamed from: a */
    public void mo4836a() {
        C1328b d = this.f4283e.mo4824d(this.f4285g);
        this.f4287i.putDouble("toValue", ((C1326Q) d).mo4864d());
        this.f4283e.mo4811a(this.f4284f, this.f4286h, this.f4287i, null);
    }
}
