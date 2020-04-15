package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.p119a.C1418b;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.d */
public class C1427d implements C1428e {

    /* renamed from: a */
    private int f4442a;

    /* renamed from: b */
    private int f4443b;

    /* renamed from: c */
    private int f4444c;

    public C1427d(int i, int i2, int i3) {
        this.f4442a = i;
        this.f4443b = i2;
        this.f4444c = i3;
    }

    /* renamed from: a */
    public void mo5251a(C1418b bVar) {
        bVar.mo5230a(this.f4443b, this.f4442a, this.f4444c);
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InsertMountItem [");
        sb.append(this.f4442a);
        sb.append("] - parentTag: ");
        sb.append(this.f4443b);
        sb.append(" - index: ");
        sb.append(this.f4444c);
        return sb.toString();
    }
}
