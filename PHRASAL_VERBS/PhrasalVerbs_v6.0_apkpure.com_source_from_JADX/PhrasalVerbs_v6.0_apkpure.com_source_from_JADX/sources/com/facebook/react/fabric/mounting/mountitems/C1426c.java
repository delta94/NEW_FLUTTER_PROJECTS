package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.p119a.C1418b;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.c */
public class C1426c implements C1428e {

    /* renamed from: a */
    private final int f4439a;

    /* renamed from: b */
    private final int f4440b;

    /* renamed from: c */
    private final ReadableArray f4441c;

    public C1426c(int i, int i2, ReadableArray readableArray) {
        this.f4439a = i;
        this.f4440b = i2;
        this.f4441c = readableArray;
    }

    /* renamed from: a */
    public void mo5251a(C1418b bVar) {
        UiThreadUtil.assertOnUiThread();
        bVar.mo5232a(this.f4439a, this.f4440b, this.f4441c);
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispatchCommandMountItem [");
        sb.append(this.f4439a);
        sb.append("] ");
        sb.append(this.f4440b);
        return sb.toString();
    }
}
