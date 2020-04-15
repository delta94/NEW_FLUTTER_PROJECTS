package android.support.p030v7.widget;

import android.support.p030v7.widget.ActionMenuView.C0500e;
import android.support.p030v7.widget.Toolbar.C0546c;
import android.view.MenuItem;

/* renamed from: android.support.v7.widget.wa */
class C0622wa implements C0500e {

    /* renamed from: a */
    final /* synthetic */ Toolbar f2402a;

    C0622wa(Toolbar toolbar) {
        this.f2402a = toolbar;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C0546c cVar = this.f2402a.f2086G;
        if (cVar != null) {
            return cVar.onMenuItemClick(menuItem);
        }
        return false;
    }
}
