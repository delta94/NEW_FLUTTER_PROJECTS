package com.facebook.react.modules.network;

import android.webkit.CookieManager;
import java.util.List;

/* renamed from: com.facebook.react.modules.network.e */
class C1512e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f4633a;

    /* renamed from: b */
    final /* synthetic */ CookieManager f4634b;

    /* renamed from: c */
    final /* synthetic */ String f4635c;

    /* renamed from: d */
    final /* synthetic */ C1516i f4636d;

    C1512e(C1516i iVar, List list, CookieManager cookieManager, String str) {
        this.f4636d = iVar;
        this.f4633a = list;
        this.f4634b = cookieManager;
        this.f4635c = str;
    }

    public void run() {
        for (String cookie : this.f4633a) {
            this.f4634b.setCookie(this.f4635c, cookie);
        }
        this.f4636d.f4643b.mo5457a();
    }
}
