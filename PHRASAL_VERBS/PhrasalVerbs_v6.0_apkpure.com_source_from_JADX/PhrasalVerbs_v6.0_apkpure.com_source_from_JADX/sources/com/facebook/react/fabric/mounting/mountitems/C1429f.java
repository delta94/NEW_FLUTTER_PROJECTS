package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.p119a.C1418b;
import com.facebook.react.uimanager.C1578N;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.f */
public class C1429f implements C1428e {

    /* renamed from: a */
    private final String f4445a;

    /* renamed from: b */
    private final int f4446b;

    /* renamed from: c */
    private final C1578N f4447c;

    public C1429f(C1578N n, int i, String str) {
        this.f4447c = n;
        this.f4445a = str;
        this.f4446b = i;
    }

    /* renamed from: a */
    public void mo5251a(C1418b bVar) {
        bVar.mo5236a(this.f4447c, this.f4445a);
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.f4446b);
        sb.append("] - Preallocate ");
        sb.append(this.f4445a);
        return sb.toString();
    }
}
