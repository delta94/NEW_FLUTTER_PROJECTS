package com.facebook.react.uimanager;

import com.facebook.react.bridge.Callback;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p098m.p099a.C1166b;

/* renamed from: com.facebook.react.uimanager.r */
class C1717r implements C1166b {

    /* renamed from: a */
    final /* synthetic */ int f5076a;

    /* renamed from: b */
    final /* synthetic */ Callback f5077b;

    /* renamed from: c */
    final /* synthetic */ C1719s f5078c;

    C1717r(C1719s sVar, int i, Callback callback) {
        this.f5078c = sVar;
        this.f5076a = i;
        this.f5077b = callback;
    }

    public void onCancel() {
        C1136a.m5054a(this.f5078c.f5084b.mo4528b(this.f5076a), "Animation was already removed somehow!");
        Callback callback = this.f5077b;
        if (callback != null) {
            callback.invoke(Boolean.valueOf(false));
        }
    }
}
