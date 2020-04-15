package android.support.p030v7.widget;

import android.support.p029v4.widget.C0367h;

/* renamed from: android.support.v7.widget.da */
class C0572da implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SearchView f2225a;

    C0572da(SearchView searchView) {
        this.f2225a = searchView;
    }

    public void run() {
        C0367h hVar = this.f2225a.f2033S;
        if (hVar != null && (hVar instanceof C0598na)) {
            hVar.mo1699a(null);
        }
    }
}
