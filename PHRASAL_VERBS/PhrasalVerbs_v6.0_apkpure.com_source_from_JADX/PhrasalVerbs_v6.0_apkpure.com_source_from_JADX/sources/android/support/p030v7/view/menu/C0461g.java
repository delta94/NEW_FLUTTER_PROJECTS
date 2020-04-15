package android.support.p030v7.view.menu;

import android.view.MenuItem;

/* renamed from: android.support.v7.view.menu.g */
class C0461g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0464a f1647a;

    /* renamed from: b */
    final /* synthetic */ MenuItem f1648b;

    /* renamed from: c */
    final /* synthetic */ C0468l f1649c;

    /* renamed from: d */
    final /* synthetic */ C0462h f1650d;

    C0461g(C0462h hVar, C0464a aVar, MenuItem menuItem, C0468l lVar) {
        this.f1650d = hVar;
        this.f1647a = aVar;
        this.f1648b = menuItem;
        this.f1649c = lVar;
    }

    public void run() {
        C0464a aVar = this.f1647a;
        if (aVar != null) {
            this.f1650d.f1651a.f1654B = true;
            aVar.f1680b.mo2195a(false);
            this.f1650d.f1651a.f1654B = false;
        }
        if (this.f1648b.isEnabled() && this.f1648b.hasSubMenu()) {
            this.f1649c.mo2196a(this.f1648b, 4);
        }
    }
}
