package com.facebook.react.views.modal;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: com.facebook.react.views.modal.f */
class C1762f extends GuardedRunnable {

    /* renamed from: a */
    final /* synthetic */ int f5195a;

    /* renamed from: b */
    final /* synthetic */ int f5196b;

    /* renamed from: c */
    final /* synthetic */ int f5197c;

    /* renamed from: d */
    final /* synthetic */ C1764a f5198d;

    C1762f(C1764a aVar, ReactContext reactContext, int i, int i2, int i3) {
        this.f5198d = aVar;
        this.f5195a = i;
        this.f5196b = i2;
        this.f5197c = i3;
        super(reactContext);
    }

    public void runGuarded() {
        ((UIManagerModule) this.f5198d.m6776f().getNativeModule(UIManagerModule.class)).updateNodeSize(this.f5195a, this.f5196b, this.f5197c);
    }
}
