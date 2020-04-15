package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.p119a.C1418b;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.g */
public class C1430g implements C1428e {

    /* renamed from: a */
    private int f4448a;

    /* renamed from: b */
    private int f4449b;

    /* renamed from: c */
    private int f4450c;

    public C1430g(int i, int i2, int i3) {
        this.f4448a = i;
        this.f4449b = i2;
        this.f4450c = i3;
    }

    /* renamed from: a */
    public void mo5251a(C1418b bVar) {
        bVar.mo5229a(this.f4449b, this.f4450c);
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemoveMountItem [");
        sb.append(this.f4448a);
        sb.append("] - parentTag: ");
        sb.append(this.f4449b);
        sb.append(" - index: ");
        sb.append(this.f4450c);
        return sb.toString();
    }
}
