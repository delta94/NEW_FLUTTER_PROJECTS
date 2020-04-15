package android.support.p030v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.S */
class C0536S implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0548U f2013a;

    C0536S(C0548U u) {
        this.f2013a = u;
    }

    public void run() {
        View e = this.f2013a.mo2924e();
        if (e != null && e.getWindowToken() != null) {
            this.f2013a.mo2053c();
        }
    }
}
