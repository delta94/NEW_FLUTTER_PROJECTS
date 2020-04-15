package android.support.p030v7.widget;

import android.view.View;
import p000a.p005b.p009c.p018g.C0119J;

/* renamed from: android.support.v7.widget.Ba */
class C0502Ba extends C0119J {

    /* renamed from: a */
    private boolean f1863a = false;

    /* renamed from: b */
    final /* synthetic */ int f1864b;

    /* renamed from: c */
    final /* synthetic */ C0506Ca f1865c;

    C0502Ba(C0506Ca ca, int i) {
        this.f1865c = ca;
        this.f1864b = i;
    }

    /* renamed from: a */
    public void mo407a(View view) {
        this.f1863a = true;
    }

    /* renamed from: b */
    public void mo408b(View view) {
        if (!this.f1863a) {
            this.f1865c.f1884a.setVisibility(this.f1864b);
        }
    }

    /* renamed from: c */
    public void mo409c(View view) {
        this.f1865c.f1884a.setVisibility(0);
    }
}
