package com.facebook.react.modules.statusbar;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;

/* renamed from: com.facebook.react.modules.statusbar.f */
class C1542f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Activity f4699a;

    /* renamed from: b */
    final /* synthetic */ String f4700b;

    /* renamed from: c */
    final /* synthetic */ StatusBarModule f4701c;

    C1542f(StatusBarModule statusBarModule, Activity activity, String str) {
        this.f4701c = statusBarModule;
        this.f4699a = activity;
        this.f4700b = str;
    }

    @TargetApi(23)
    public void run() {
        View decorView = this.f4699a.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility("dark-content".equals(this.f4700b) ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
    }
}
