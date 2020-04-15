package android.support.p030v7.widget;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: android.support.v7.widget.E */
class C0510E implements OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C0505b f1911a;

    C0510E(C0505b bVar) {
        this.f1911a = bVar;
    }

    public void onGlobalLayout() {
        C0505b bVar = this.f1911a;
        if (!bVar.mo2565b(C0503C.this)) {
            this.f1911a.dismiss();
            return;
        }
        this.f1911a.mo2566l();
        C0510E.super.mo2053c();
    }
}
