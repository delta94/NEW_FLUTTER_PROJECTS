package android.support.p030v7.app;

import android.view.View;
import p000a.p005b.p009c.p018g.C0118I;
import p000a.p005b.p009c.p018g.C0119J;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v7.app.w */
class C0437w extends C0119J {

    /* renamed from: a */
    final /* synthetic */ C0438x f1472a;

    C0437w(C0438x xVar) {
        this.f1472a = xVar;
    }

    /* renamed from: b */
    public void mo408b(View view) {
        this.f1472a.f1509q.setAlpha(1.0f);
        this.f1472a.f1512t.mo399a((C0118I) null);
        this.f1472a.f1512t = null;
    }

    /* renamed from: c */
    public void mo409c(View view) {
        this.f1472a.f1509q.setVisibility(0);
        this.f1472a.f1509q.sendAccessibilityEvent(32);
        if (this.f1472a.f1509q.getParent() instanceof View) {
            C0156v.m580u((View) this.f1472a.f1509q.getParent());
        }
    }
}
