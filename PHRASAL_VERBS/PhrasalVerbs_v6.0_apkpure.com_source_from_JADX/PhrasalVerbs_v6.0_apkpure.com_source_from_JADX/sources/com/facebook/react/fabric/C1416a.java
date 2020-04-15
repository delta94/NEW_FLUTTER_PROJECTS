package com.facebook.react.fabric;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.fabric.p119a.C1417a;

/* renamed from: com.facebook.react.fabric.a */
class C1416a extends GuardedRunnable {

    /* renamed from: a */
    final /* synthetic */ int f4404a;

    /* renamed from: b */
    final /* synthetic */ int f4405b;

    /* renamed from: c */
    final /* synthetic */ int f4406c;

    /* renamed from: d */
    final /* synthetic */ C1419b f4407d;

    C1416a(C1419b bVar, ReactContext reactContext, int i, int i2, int i3) {
        this.f4407d = bVar;
        this.f4404a = i;
        this.f4405b = i2;
        this.f4406c = i3;
        super(reactContext);
    }

    public void runGuarded() {
        this.f4407d.f4409b.setConstraints(this.f4404a, C1417a.m5795b(this.f4405b), C1417a.m5792a(this.f4405b), C1417a.m5795b(this.f4406c), C1417a.m5792a(this.f4406c));
    }
}
