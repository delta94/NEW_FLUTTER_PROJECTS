package android.support.p030v7.app;

import p000a.p005b.p009c.p018g.C0116H;
import p000a.p005b.p009c.p018g.C0118I;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v7.app.v */
class C0436v implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0438x f1471a;

    C0436v(C0438x xVar) {
        this.f1471a = xVar;
    }

    public void run() {
        C0438x xVar = this.f1471a;
        xVar.f1510r.showAtLocation(xVar.f1509q, 55, 0, 0);
        this.f1471a.mo1990l();
        if (this.f1471a.mo1999s()) {
            this.f1471a.f1509q.setAlpha(0.0f);
            C0438x xVar2 = this.f1471a;
            C0116H a = C0156v.m537a(xVar2.f1509q);
            a.mo397a(1.0f);
            xVar2.f1512t = a;
            this.f1471a.f1512t.mo399a((C0118I) new C0435u(this));
            return;
        }
        this.f1471a.f1509q.setAlpha(1.0f);
        this.f1471a.f1509q.setVisibility(0);
    }
}
