package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.facebook.react.modules.statusbar.b */
class C1538b extends GuardedRunnable {

    /* renamed from: a */
    final /* synthetic */ Activity f4688a;

    /* renamed from: b */
    final /* synthetic */ boolean f4689b;

    /* renamed from: c */
    final /* synthetic */ int f4690c;

    /* renamed from: d */
    final /* synthetic */ StatusBarModule f4691d;

    C1538b(StatusBarModule statusBarModule, ReactContext reactContext, Activity activity, boolean z, int i) {
        this.f4691d = statusBarModule;
        this.f4688a = activity;
        this.f4689b = z;
        this.f4690c = i;
        super(reactContext);
    }

    @TargetApi(21)
    public void runGuarded() {
        this.f4688a.getWindow().addFlags(Integer.MIN_VALUE);
        if (this.f4689b) {
            int statusBarColor = this.f4688a.getWindow().getStatusBarColor();
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(statusBarColor), Integer.valueOf(this.f4690c)});
            ofObject.addUpdateListener(new C1537a(this));
            ofObject.setDuration(300).setStartDelay(0);
            ofObject.start();
            return;
        }
        this.f4688a.getWindow().setStatusBarColor(this.f4690c);
    }
}
