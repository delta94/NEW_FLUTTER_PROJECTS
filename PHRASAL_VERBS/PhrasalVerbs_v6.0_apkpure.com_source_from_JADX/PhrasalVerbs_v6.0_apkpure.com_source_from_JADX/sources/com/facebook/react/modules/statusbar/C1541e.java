package com.facebook.react.modules.statusbar;

import android.app.Activity;

/* renamed from: com.facebook.react.modules.statusbar.e */
class C1541e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f4696a;

    /* renamed from: b */
    final /* synthetic */ Activity f4697b;

    /* renamed from: c */
    final /* synthetic */ StatusBarModule f4698c;

    C1541e(StatusBarModule statusBarModule, boolean z, Activity activity) {
        this.f4698c = statusBarModule;
        this.f4696a = z;
        this.f4697b = activity;
    }

    public void run() {
        if (this.f4696a) {
            this.f4697b.getWindow().addFlags(1024);
            this.f4697b.getWindow().clearFlags(2048);
            return;
        }
        this.f4697b.getWindow().addFlags(2048);
        this.f4697b.getWindow().clearFlags(1024);
    }
}
