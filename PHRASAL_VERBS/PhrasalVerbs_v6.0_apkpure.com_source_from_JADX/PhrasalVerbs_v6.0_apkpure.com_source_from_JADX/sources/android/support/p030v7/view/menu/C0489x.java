package android.support.p030v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p000a.p005b.p009c.p013c.p014a.C0075a;
import p000a.p005b.p009c.p013c.p014a.C0076b;
import p000a.p005b.p009c.p013c.p014a.C0077c;

/* renamed from: android.support.v7.view.menu.x */
public final class C0489x {
    /* renamed from: a */
    public static Menu m2333a(Context context, C0075a aVar) {
        return new C0490y(context, aVar);
    }

    /* renamed from: a */
    public static MenuItem m2334a(Context context, C0076b bVar) {
        return VERSION.SDK_INT >= 16 ? new C0480r(context, bVar) : new C0475q(context, bVar);
    }

    /* renamed from: a */
    public static SubMenu m2335a(Context context, C0077c cVar) {
        return new C0454E(context, cVar);
    }
}
