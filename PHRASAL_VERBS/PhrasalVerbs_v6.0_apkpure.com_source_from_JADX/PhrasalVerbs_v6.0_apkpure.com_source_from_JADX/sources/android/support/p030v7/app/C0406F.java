package android.support.p030v7.app;

import android.support.p030v7.widget.ActionBarOverlayLayout;
import android.view.View;
import p000a.p005b.p009c.p018g.C0119J;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v7.app.F */
class C0406F extends C0119J {

    /* renamed from: a */
    final /* synthetic */ C0409I f1391a;

    C0406F(C0409I i) {
        this.f1391a = i;
    }

    /* renamed from: b */
    public void mo408b(View view) {
        C0409I i = this.f1391a;
        if (i.f1423w) {
            View view2 = i.f1411k;
            if (view2 != null) {
                view2.setTranslationY(0.0f);
                this.f1391a.f1408h.setTranslationY(0.0f);
            }
        }
        this.f1391a.f1408h.setVisibility(8);
        this.f1391a.f1408h.setTransitioning(false);
        C0409I i2 = this.f1391a;
        i2.f1397B = null;
        i2.mo1887l();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1391a.f1407g;
        if (actionBarOverlayLayout != null) {
            C0156v.m580u(actionBarOverlayLayout);
        }
    }
}
