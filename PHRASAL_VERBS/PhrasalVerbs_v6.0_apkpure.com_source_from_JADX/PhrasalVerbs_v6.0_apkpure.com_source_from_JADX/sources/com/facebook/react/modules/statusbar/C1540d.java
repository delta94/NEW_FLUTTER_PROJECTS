package com.facebook.react.modules.statusbar;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: com.facebook.react.modules.statusbar.d */
class C1540d extends GuardedRunnable {

    /* renamed from: a */
    final /* synthetic */ Activity f4693a;

    /* renamed from: b */
    final /* synthetic */ boolean f4694b;

    /* renamed from: c */
    final /* synthetic */ StatusBarModule f4695c;

    C1540d(StatusBarModule statusBarModule, ReactContext reactContext, Activity activity, boolean z) {
        this.f4695c = statusBarModule;
        this.f4693a = activity;
        this.f4694b = z;
        super(reactContext);
    }

    @TargetApi(21)
    public void runGuarded() {
        View decorView = this.f4693a.getWindow().getDecorView();
        decorView.setOnApplyWindowInsetsListener(this.f4694b ? new C1539c(this) : null);
        C0156v.m580u(decorView);
    }
}
