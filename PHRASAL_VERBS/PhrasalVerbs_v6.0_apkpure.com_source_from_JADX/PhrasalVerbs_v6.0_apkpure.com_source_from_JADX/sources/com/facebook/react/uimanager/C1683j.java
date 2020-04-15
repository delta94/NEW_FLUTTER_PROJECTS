package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.C1458b.C1459a;

/* renamed from: com.facebook.react.uimanager.j */
public abstract class C1683j extends C1459a {

    /* renamed from: b */
    private final ReactContext f5028b;

    protected C1683j(ReactContext reactContext) {
        this.f5028b = reactContext;
    }

    /* renamed from: a */
    public final void mo5332a(long j) {
        try {
            mo4870b(j);
        } catch (RuntimeException e) {
            this.f5028b.handleException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo4870b(long j);
}
