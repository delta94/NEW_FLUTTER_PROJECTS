package com.facebook.react.uimanager;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.facebook.react.uimanager.Y */
class C1592Y extends GuardedRunnable {

    /* renamed from: a */
    final /* synthetic */ int f4806a;

    /* renamed from: b */
    final /* synthetic */ int f4807b;

    /* renamed from: c */
    final /* synthetic */ C1593Z f4808c;

    C1592Y(C1593Z z, ReactContext reactContext, int i, int i2) {
        this.f4808c = z;
        this.f4806a = i;
        this.f4807b = i2;
        super(reactContext);
    }

    public void runGuarded() {
        C1593Z z = this.f4808c;
        z.f4811c.updateNodeSize(z.f4810b, this.f4806a, this.f4807b);
    }
}
