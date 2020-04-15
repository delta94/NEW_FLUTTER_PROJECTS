package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.p119a.C1418b;
import com.facebook.react.uimanager.C1578N;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.a */
public class C1424a implements C1428e {

    /* renamed from: a */
    private final String f4434a;

    /* renamed from: b */
    private final int f4435b;

    /* renamed from: c */
    private final C1578N f4436c;

    /* renamed from: d */
    private final boolean f4437d;

    public C1424a(C1578N n, String str, int i, boolean z) {
        this.f4435b = i;
        this.f4436c = n;
        this.f4434a = str;
        this.f4437d = z;
    }

    /* renamed from: a */
    public void mo5251a(C1418b bVar) {
        bVar.mo5237a(this.f4436c, this.f4434a, this.f4435b, this.f4437d);
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreateMountItem [");
        sb.append(this.f4435b);
        sb.append("] ");
        sb.append(this.f4434a);
        return sb.toString();
    }
}
