package android.support.p030v7.view.menu;

import android.os.SystemClock;
import android.support.p030v7.widget.C0554V;
import android.view.MenuItem;

/* renamed from: android.support.v7.view.menu.h */
class C0462h implements C0554V {

    /* renamed from: a */
    final /* synthetic */ C0463i f1651a;

    C0462h(C0463i iVar) {
        this.f1651a = iVar;
    }

    /* renamed from: a */
    public void mo2159a(C0468l lVar, MenuItem menuItem) {
        C0464a aVar = null;
        this.f1651a.f1660h.removeCallbacksAndMessages(null);
        int size = this.f1651a.f1662j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (lVar == ((C0464a) this.f1651a.f1662j.get(i)).f1680b) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            int i2 = i + 1;
            if (i2 < this.f1651a.f1662j.size()) {
                aVar = (C0464a) this.f1651a.f1662j.get(i2);
            }
            this.f1651a.f1660h.postAtTime(new C0461g(this, aVar, menuItem, lVar), lVar, SystemClock.uptimeMillis() + 200);
        }
    }

    /* renamed from: b */
    public void mo2160b(C0468l lVar, MenuItem menuItem) {
        this.f1651a.f1660h.removeCallbacksAndMessages(lVar);
    }
}
