package android.support.p030v7.view.menu;

import android.content.Context;
import android.support.p029v4.util.C0320b;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p000a.p005b.p009c.p013c.p014a.C0076b;
import p000a.p005b.p009c.p013c.p014a.C0077c;

/* renamed from: android.support.v7.view.menu.c */
abstract class C0457c<T> extends C0458d<T> {

    /* renamed from: b */
    final Context f1641b;

    /* renamed from: c */
    private Map<C0076b, MenuItem> f1642c;

    /* renamed from: d */
    private Map<C0077c, SubMenu> f1643d;

    C0457c(Context context, T t) {
        super(t);
        this.f1641b = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final MenuItem mo2150a(MenuItem menuItem) {
        if (!(menuItem instanceof C0076b)) {
            return menuItem;
        }
        C0076b bVar = (C0076b) menuItem;
        if (this.f1642c == null) {
            this.f1642c = new C0320b();
        }
        MenuItem menuItem2 = (MenuItem) this.f1642c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a = C0489x.m2334a(this.f1641b, bVar);
        this.f1642c.put(bVar, a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final SubMenu mo2151a(SubMenu subMenu) {
        if (!(subMenu instanceof C0077c)) {
            return subMenu;
        }
        C0077c cVar = (C0077c) subMenu;
        if (this.f1643d == null) {
            this.f1643d = new C0320b();
        }
        SubMenu subMenu2 = (SubMenu) this.f1643d.get(cVar);
        if (subMenu2 == null) {
            subMenu2 = C0489x.m2335a(this.f1641b, cVar);
            this.f1643d.put(cVar, subMenu2);
        }
        return subMenu2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2152a(int i) {
        Map<C0076b, MenuItem> map = this.f1642c;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo2153b() {
        Map<C0076b, MenuItem> map = this.f1642c;
        if (map != null) {
            map.clear();
        }
        Map<C0077c, SubMenu> map2 = this.f1643d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo2154b(int i) {
        Map<C0076b, MenuItem> map = this.f1642c;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == ((MenuItem) it.next()).getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
}
