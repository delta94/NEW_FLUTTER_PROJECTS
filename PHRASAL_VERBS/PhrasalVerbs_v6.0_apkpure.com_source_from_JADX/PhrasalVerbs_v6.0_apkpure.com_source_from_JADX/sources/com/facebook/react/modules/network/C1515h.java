package com.facebook.react.modules.network;

import android.webkit.CookieSyncManager;

/* renamed from: com.facebook.react.modules.network.h */
class C1515h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1517a f4641a;

    C1515h(C1517a aVar) {
        this.f4641a = aVar;
    }

    public void run() {
        if (C1516i.f4642a) {
            CookieSyncManager.getInstance().sync();
        } else {
            this.f4641a.m6018c();
        }
    }
}
