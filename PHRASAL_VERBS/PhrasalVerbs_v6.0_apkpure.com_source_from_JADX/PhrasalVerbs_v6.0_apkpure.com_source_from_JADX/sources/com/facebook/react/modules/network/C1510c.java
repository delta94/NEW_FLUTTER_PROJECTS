package com.facebook.react.modules.network;

import android.webkit.CookieManager;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.facebook.react.modules.network.c */
class C1510c extends GuardedResultAsyncTask<Boolean> {

    /* renamed from: a */
    final /* synthetic */ Callback f4629a;

    /* renamed from: b */
    final /* synthetic */ C1516i f4630b;

    C1510c(C1516i iVar, ReactContext reactContext, Callback callback) {
        this.f4630b = iVar;
        this.f4629a = callback;
        super(reactContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecuteGuarded(Boolean bool) {
        this.f4629a.invoke(bool);
    }

    /* access modifiers changed from: protected */
    public Boolean doInBackgroundGuarded() {
        CookieManager a = this.f4630b.m6014c();
        if (a != null) {
            a.removeAllCookie();
        }
        this.f4630b.f4643b.mo5457a();
        return Boolean.valueOf(true);
    }
}
