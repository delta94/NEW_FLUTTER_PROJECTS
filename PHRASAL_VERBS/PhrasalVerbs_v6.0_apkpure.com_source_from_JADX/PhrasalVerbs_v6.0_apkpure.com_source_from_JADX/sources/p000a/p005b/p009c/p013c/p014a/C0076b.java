package p000a.p005b.p009c.p013c.p014a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;
import android.view.View;
import p000a.p005b.p009c.p018g.C0136e;

/* renamed from: a.b.c.c.a.b */
public interface C0076b extends MenuItem {
    /* renamed from: a */
    C0076b mo241a(C0136e eVar);

    /* renamed from: a */
    C0136e mo242a();

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    C0076b setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);

    C0076b setTooltipText(CharSequence charSequence);
}
