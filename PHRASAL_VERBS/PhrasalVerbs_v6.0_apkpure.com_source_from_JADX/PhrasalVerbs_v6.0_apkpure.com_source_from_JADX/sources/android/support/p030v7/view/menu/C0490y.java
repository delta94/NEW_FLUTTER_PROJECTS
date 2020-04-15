package android.support.p030v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p000a.p005b.p009c.p013c.p014a.C0075a;

/* renamed from: android.support.v7.view.menu.y */
class C0490y extends C0457c<C0075a> implements Menu {
    C0490y(Context context, C0075a aVar) {
        super(context, aVar);
    }

    public MenuItem add(int i) {
        return mo2150a(((C0075a) this.f1644a).add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo2150a(((C0075a) this.f1644a).add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo2150a(((C0075a) this.f1644a).add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo2150a(((C0075a) this.f1644a).add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = ((C0075a) this.f1644a).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo2150a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo2151a(((C0075a) this.f1644a).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo2151a(((C0075a) this.f1644a).addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo2151a(((C0075a) this.f1644a).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo2151a(((C0075a) this.f1644a).addSubMenu(charSequence));
    }

    public void clear() {
        mo2153b();
        ((C0075a) this.f1644a).clear();
    }

    public void close() {
        ((C0075a) this.f1644a).close();
    }

    public MenuItem findItem(int i) {
        return mo2150a(((C0075a) this.f1644a).findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo2150a(((C0075a) this.f1644a).getItem(i));
    }

    public boolean hasVisibleItems() {
        return ((C0075a) this.f1644a).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C0075a) this.f1644a).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C0075a) this.f1644a).performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C0075a) this.f1644a).performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo2152a(i);
        ((C0075a) this.f1644a).removeGroup(i);
    }

    public void removeItem(int i) {
        mo2154b(i);
        ((C0075a) this.f1644a).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C0075a) this.f1644a).setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C0075a) this.f1644a).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C0075a) this.f1644a).setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        ((C0075a) this.f1644a).setQwertyMode(z);
    }

    public int size() {
        return ((C0075a) this.f1644a).size();
    }
}
