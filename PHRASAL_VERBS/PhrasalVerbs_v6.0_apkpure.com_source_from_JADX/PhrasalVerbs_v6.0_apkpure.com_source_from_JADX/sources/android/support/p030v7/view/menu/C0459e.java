package android.support.p030v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: android.support.v7.view.menu.e */
class C0459e implements OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C0463i f1645a;

    C0459e(C0463i iVar) {
        this.f1645a = iVar;
    }

    public void onGlobalLayout() {
        if (this.f1645a.mo2052b() && this.f1645a.f1662j.size() > 0 && !((C0464a) this.f1645a.f1662j.get(0)).f1679a.mo2935k()) {
            View view = this.f1645a.f1669q;
            if (view == null || !view.isShown()) {
                this.f1645a.dismiss();
                return;
            }
            for (C0464a aVar : this.f1645a.f1662j) {
                aVar.f1679a.mo2053c();
            }
        }
    }
}
