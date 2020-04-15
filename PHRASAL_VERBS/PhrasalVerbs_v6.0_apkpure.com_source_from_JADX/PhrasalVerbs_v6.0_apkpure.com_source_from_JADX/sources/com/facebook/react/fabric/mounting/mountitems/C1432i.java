package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.p119a.C1418b;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.i */
public class C1432i implements C1428e {

    /* renamed from: a */
    private final int f4453a;

    /* renamed from: b */
    private final int f4454b;

    /* renamed from: c */
    private final int f4455c;

    /* renamed from: d */
    private final int f4456d;

    /* renamed from: e */
    private final int f4457e;

    public C1432i(int i, int i2, int i3, int i4, int i5) {
        this.f4453a = i;
        this.f4454b = i2;
        this.f4455c = i3;
        this.f4456d = i4;
        this.f4457e = i5;
    }

    /* renamed from: a */
    public void mo5251a(C1418b bVar) {
        bVar.mo5231a(this.f4453a, this.f4454b, this.f4455c, this.f4456d, this.f4457e);
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateLayoutMountItem [");
        sb.append(this.f4453a);
        sb.append("] - x: ");
        sb.append(this.f4454b);
        sb.append(" - y: ");
        sb.append(this.f4455c);
        sb.append(" - height: ");
        sb.append(this.f4457e);
        sb.append(" - width: ");
        sb.append(this.f4456d);
        return sb.toString();
    }
}
