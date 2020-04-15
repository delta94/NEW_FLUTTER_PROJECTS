package com.facebook.react.uimanager;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.facebook.react.uimanager.ba */
class C1600ba extends GuardedRunnable {

    /* renamed from: a */
    final /* synthetic */ int f4819a;

    /* renamed from: b */
    final /* synthetic */ int f4820b;

    /* renamed from: c */
    final /* synthetic */ int f4821c;

    /* renamed from: d */
    final /* synthetic */ UIManagerModule f4822d;

    C1600ba(UIManagerModule uIManagerModule, ReactContext reactContext, int i, int i2, int i3) {
        this.f4822d = uIManagerModule;
        this.f4819a = i;
        this.f4820b = i2;
        this.f4821c = i3;
        super(reactContext);
    }

    public void runGuarded() {
        this.f4822d.mUIImplementation.mo5732b(this.f4819a, this.f4820b, this.f4821c);
        this.f4822d.mUIImplementation.mo5700a(-1);
    }
}
