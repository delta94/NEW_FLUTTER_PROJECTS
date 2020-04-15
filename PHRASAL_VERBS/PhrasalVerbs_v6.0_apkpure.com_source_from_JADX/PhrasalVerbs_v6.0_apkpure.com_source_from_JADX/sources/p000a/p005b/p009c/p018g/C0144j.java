package p000a.p005b.p009c.p018g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.MenuItem;
import p000a.p005b.p009c.p013c.p014a.C0076b;

/* renamed from: a.b.c.g.j */
public final class C0144j {
    /* renamed from: a */
    public static MenuItem m487a(MenuItem menuItem, C0136e eVar) {
        if (menuItem instanceof C0076b) {
            return ((C0076b) menuItem).mo241a(eVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: a */
    public static void m488a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0076b) {
            ((C0076b) menuItem).setAlphabeticShortcut(c, i);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m489a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C0076b) {
            ((C0076b) menuItem).setIconTintList(colorStateList);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m490a(MenuItem menuItem, Mode mode) {
        if (menuItem instanceof C0076b) {
            ((C0076b) menuItem).setIconTintMode(mode);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m491a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0076b) {
            ((C0076b) menuItem).setContentDescription(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public static void m492b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0076b) {
            ((C0076b) menuItem).setNumericShortcut(c, i);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: b */
    public static void m493b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0076b) {
            ((C0076b) menuItem).setTooltipText(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
