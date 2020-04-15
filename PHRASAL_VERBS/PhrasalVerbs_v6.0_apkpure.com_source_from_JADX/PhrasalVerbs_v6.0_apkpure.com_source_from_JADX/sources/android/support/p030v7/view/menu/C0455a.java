package android.support.p030v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p029v4.graphics.drawable.C0311a;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import p000a.p005b.p009c.p010a.C0039a;
import p000a.p005b.p009c.p013c.p014a.C0076b;
import p000a.p005b.p009c.p018g.C0136e;

/* renamed from: android.support.v7.view.menu.a */
public class C0455a implements C0076b {

    /* renamed from: a */
    private final int f1609a;

    /* renamed from: b */
    private final int f1610b;

    /* renamed from: c */
    private final int f1611c;

    /* renamed from: d */
    private final int f1612d;

    /* renamed from: e */
    private CharSequence f1613e;

    /* renamed from: f */
    private CharSequence f1614f;

    /* renamed from: g */
    private Intent f1615g;

    /* renamed from: h */
    private char f1616h;

    /* renamed from: i */
    private int f1617i = 4096;

    /* renamed from: j */
    private char f1618j;

    /* renamed from: k */
    private int f1619k = 4096;

    /* renamed from: l */
    private Drawable f1620l;

    /* renamed from: m */
    private int f1621m = 0;

    /* renamed from: n */
    private Context f1622n;

    /* renamed from: o */
    private OnMenuItemClickListener f1623o;

    /* renamed from: p */
    private CharSequence f1624p;

    /* renamed from: q */
    private CharSequence f1625q;

    /* renamed from: r */
    private ColorStateList f1626r = null;

    /* renamed from: s */
    private Mode f1627s = null;

    /* renamed from: t */
    private boolean f1628t = false;

    /* renamed from: u */
    private boolean f1629u = false;

    /* renamed from: v */
    private int f1630v = 16;

    public C0455a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1622n = context;
        this.f1609a = i2;
        this.f1610b = i;
        this.f1611c = i3;
        this.f1612d = i4;
        this.f1613e = charSequence;
    }

    /* renamed from: b */
    private void m2124b() {
        if (this.f1620l == null) {
            return;
        }
        if (this.f1628t || this.f1629u) {
            this.f1620l = C0311a.m1350h(this.f1620l);
            this.f1620l = this.f1620l.mutate();
            if (this.f1628t) {
                C0311a.m1336a(this.f1620l, this.f1626r);
            }
            if (this.f1629u) {
                C0311a.m1339a(this.f1620l, this.f1627s);
            }
        }
    }

    /* renamed from: a */
    public C0076b mo241a(C0136e eVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0136e mo242a() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f1619k;
    }

    public char getAlphabeticShortcut() {
        return this.f1618j;
    }

    public CharSequence getContentDescription() {
        return this.f1624p;
    }

    public int getGroupId() {
        return this.f1610b;
    }

    public Drawable getIcon() {
        return this.f1620l;
    }

    public ColorStateList getIconTintList() {
        return this.f1626r;
    }

    public Mode getIconTintMode() {
        return this.f1627s;
    }

    public Intent getIntent() {
        return this.f1615g;
    }

    public int getItemId() {
        return this.f1609a;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f1617i;
    }

    public char getNumericShortcut() {
        return this.f1616h;
    }

    public int getOrder() {
        return this.f1612d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f1613e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1614f;
        return charSequence != null ? charSequence : this.f1613e;
    }

    public CharSequence getTooltipText() {
        return this.f1625q;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f1630v & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f1630v & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f1630v & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f1630v & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public C0076b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public C0076b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1618j = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1618j = Character.toLowerCase(c);
        this.f1619k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1630v = z | (this.f1630v & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1630v = (z ? 2 : 0) | (this.f1630v & -3);
        return this;
    }

    public C0076b setContentDescription(CharSequence charSequence) {
        this.f1624p = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1630v = (z ? 16 : 0) | (this.f1630v & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1621m = i;
        this.f1620l = C0039a.m111c(this.f1622n, i);
        m2124b();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1620l = drawable;
        this.f1621m = 0;
        m2124b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1626r = colorStateList;
        this.f1628t = true;
        m2124b();
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f1627s = mode;
        this.f1629u = true;
        m2124b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1615g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1616h = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1616h = c;
        this.f1617i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f1623o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1616h = c;
        this.f1618j = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1616h = c;
        this.f1617i = KeyEvent.normalizeMetaState(i);
        this.f1618j = Character.toLowerCase(c2);
        this.f1619k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public C0076b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f1613e = this.f1622n.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1613e = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1614f = charSequence;
        return this;
    }

    public C0076b setTooltipText(CharSequence charSequence) {
        this.f1625q = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f1630v & 8;
        if (z) {
            i = 0;
        }
        this.f1630v = i2 | i;
        return this;
    }
}
