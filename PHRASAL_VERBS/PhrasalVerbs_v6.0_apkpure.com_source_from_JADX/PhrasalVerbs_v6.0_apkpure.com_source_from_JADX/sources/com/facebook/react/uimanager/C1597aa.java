package com.facebook.react.uimanager;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.facebook.react.uimanager.aa */
class C1597aa extends GuardedRunnable {

    /* renamed from: a */
    final /* synthetic */ int f4815a;

    /* renamed from: b */
    final /* synthetic */ Object f4816b;

    /* renamed from: c */
    final /* synthetic */ UIManagerModule f4817c;

    C1597aa(UIManagerModule uIManagerModule, ReactContext reactContext, int i, Object obj) {
        this.f4817c = uIManagerModule;
        this.f4815a = i;
        this.f4816b = obj;
        super(reactContext);
    }

    public void runGuarded() {
        this.f4817c.mUIImplementation.mo5713a(this.f4815a, this.f4816b);
    }
}
