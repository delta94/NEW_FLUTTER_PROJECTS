package android.support.p030v7.app;

import android.view.View;
import android.widget.PopupWindow;
import p000a.p005b.p009c.p018g.C0118I;
import p000a.p005b.p009c.p018g.C0119J;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v7.app.y */
class C0446y extends C0119J {

    /* renamed from: a */
    final /* synthetic */ C0440b f1549a;

    C0446y(C0440b bVar) {
        this.f1549a = bVar;
    }

    /* renamed from: b */
    public void mo408b(View view) {
        C0438x.this.f1509q.setVisibility(8);
        C0438x xVar = C0438x.this;
        PopupWindow popupWindow = xVar.f1510r;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (xVar.f1509q.getParent() instanceof View) {
            C0156v.m580u((View) C0438x.this.f1509q.getParent());
        }
        C0438x.this.f1509q.removeAllViews();
        C0438x.this.f1512t.mo399a((C0118I) null);
        C0438x.this.f1512t = null;
    }
}
