package android.support.p030v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: android.support.v7.view.menu.A */
class C0448A implements OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C0452C f1551a;

    C0448A(C0452C c) {
        this.f1551a = c;
    }

    public void onGlobalLayout() {
        if (this.f1551a.mo2052b() && !this.f1551a.f1573j.mo2935k()) {
            View view = this.f1551a.f1578o;
            if (view == null || !view.isShown()) {
                this.f1551a.dismiss();
            } else {
                this.f1551a.f1573j.mo2053c();
            }
        }
    }
}
