package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.p119a.C1418b;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.k */
public class C1434k implements C1428e {

    /* renamed from: a */
    private final int f4460a;

    /* renamed from: b */
    private final ReadableMap f4461b;

    public C1434k(int i, ReadableMap readableMap) {
        this.f4460a = i;
        this.f4461b = readableMap;
    }

    /* renamed from: a */
    public void mo5251a(C1418b bVar) {
        bVar.mo5239b(this.f4460a, this.f4461b);
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdatePropsMountItem [");
        sb.append(this.f4460a);
        sb.append("] - props: ");
        sb.append(this.f4461b);
        return sb.toString();
    }
}
