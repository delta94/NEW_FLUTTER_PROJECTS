package android.support.p030v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.p005b.p009c.p013c.p014a.C0077c;

/* renamed from: android.support.v7.view.menu.E */
class C0454E extends C0490y implements SubMenu {
    C0454E(Context context, C0077c cVar) {
        super(context, cVar);
    }

    /* renamed from: c */
    public C0077c mo2080c() {
        return (C0077c) this.f1644a;
    }

    public void clearHeader() {
        mo2080c().clearHeader();
    }

    public MenuItem getItem() {
        return mo2150a(mo2080c().getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        mo2080c().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        mo2080c().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        mo2080c().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        mo2080c().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        mo2080c().setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        mo2080c().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        mo2080c().setIcon(drawable);
        return this;
    }
}
