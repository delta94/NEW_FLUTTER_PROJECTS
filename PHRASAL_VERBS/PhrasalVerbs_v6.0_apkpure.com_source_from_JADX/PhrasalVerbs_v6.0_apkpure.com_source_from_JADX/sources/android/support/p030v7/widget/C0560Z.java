package android.support.p030v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.Z */
class C0560Z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f2188a;

    /* renamed from: b */
    final /* synthetic */ C0563aa f2189b;

    C0560Z(C0563aa aaVar, View view) {
        this.f2189b = aaVar;
        this.f2188a = view;
    }

    public void run() {
        this.f2189b.smoothScrollTo(this.f2188a.getLeft() - ((this.f2189b.getWidth() - this.f2188a.getWidth()) / 2), 0);
        this.f2189b.f2202b = null;
    }
}
