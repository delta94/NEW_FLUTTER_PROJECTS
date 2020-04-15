package android.support.p030v7.app;

import android.view.View;
import p000a.p005b.p009c.p018g.C0121L;
import p000a.p005b.p009c.p018g.C0151q;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v7.app.r */
class C0432r implements C0151q {

    /* renamed from: a */
    final /* synthetic */ C0438x f1467a;

    C0432r(C0438x xVar) {
        this.f1467a = xVar;
    }

    /* renamed from: a */
    public C0121L mo317a(View view, C0121L l) {
        int d = l.mo415d();
        int i = this.f1467a.mo1988i(d);
        if (d != i) {
            l = l.mo412a(l.mo413b(), i, l.mo414c(), l.mo411a());
        }
        return C0156v.m553b(view, l);
    }
}
