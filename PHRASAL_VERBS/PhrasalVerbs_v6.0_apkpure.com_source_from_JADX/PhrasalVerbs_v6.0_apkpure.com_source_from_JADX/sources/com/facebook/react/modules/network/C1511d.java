package com.facebook.react.modules.network;

import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;

/* renamed from: com.facebook.react.modules.network.d */
class C1511d implements ValueCallback<Boolean> {

    /* renamed from: a */
    final /* synthetic */ Callback f4631a;

    /* renamed from: b */
    final /* synthetic */ C1516i f4632b;

    C1511d(C1516i iVar, Callback callback) {
        this.f4632b = iVar;
        this.f4631a = callback;
    }

    /* renamed from: a */
    public void onReceiveValue(Boolean bool) {
        this.f4632b.f4643b.mo5457a();
        this.f4631a.invoke(bool);
    }
}
