package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.o */
class C1341o implements C1320a {

    /* renamed from: a */
    final /* synthetic */ int f4346a;

    /* renamed from: b */
    final /* synthetic */ int f4347b;

    /* renamed from: c */
    final /* synthetic */ ReadableMap f4348c;

    /* renamed from: d */
    final /* synthetic */ Callback f4349d;

    /* renamed from: e */
    final /* synthetic */ NativeAnimatedModule f4350e;

    C1341o(NativeAnimatedModule nativeAnimatedModule, int i, int i2, ReadableMap readableMap, Callback callback) {
        this.f4350e = nativeAnimatedModule;
        this.f4346a = i;
        this.f4347b = i2;
        this.f4348c = readableMap;
        this.f4349d = callback;
    }

    /* renamed from: a */
    public void mo4803a(C1312H h) {
        h.mo4811a(this.f4346a, this.f4347b, this.f4348c, this.f4349d);
    }
}
