package com.facebook.react.animated;

import java.util.ArrayList;
import java.util.List;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.animated.b */
abstract class C1328b {

    /* renamed from: a */
    List<C1328b> f4301a;

    /* renamed from: b */
    int f4302b = 0;

    /* renamed from: c */
    int f4303c = 0;

    /* renamed from: d */
    int f4304d = -1;

    C1328b() {
    }

    /* renamed from: a */
    public void mo4836a() {
    }

    /* renamed from: a */
    public final void mo4866a(C1328b bVar) {
        if (this.f4301a == null) {
            this.f4301a = new ArrayList(1);
        }
        List<C1328b> list = this.f4301a;
        C1136a.m5053a(list);
        list.add(bVar);
        bVar.mo4867b(this);
    }

    /* renamed from: b */
    public void mo4867b(C1328b bVar) {
    }

    /* renamed from: c */
    public void mo4868c(C1328b bVar) {
    }

    /* renamed from: d */
    public final void mo4869d(C1328b bVar) {
        if (this.f4301a != null) {
            bVar.mo4868c(this);
            this.f4301a.remove(bVar);
        }
    }
}
