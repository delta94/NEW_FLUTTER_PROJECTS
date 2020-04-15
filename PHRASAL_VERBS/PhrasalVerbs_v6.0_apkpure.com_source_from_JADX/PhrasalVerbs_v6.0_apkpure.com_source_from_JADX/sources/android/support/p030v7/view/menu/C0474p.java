package android.support.p030v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v4.graphics.drawable.C0311a;
import android.support.p030v7.view.menu.C0487w.C0488a;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import p000a.p005b.p009c.p013c.p014a.C0076b;
import p000a.p005b.p009c.p018g.C0136e;
import p000a.p005b.p009c.p018g.C0136e.C0138b;
import p000a.p005b.p021d.p022a.C0170h;
import p000a.p005b.p021d.p023b.p024a.C0173a;

/* renamed from: android.support.v7.view.menu.p */
public final class C0474p implements C0076b {

    /* renamed from: A */
    private View f1731A;

    /* renamed from: B */
    private C0136e f1732B;

    /* renamed from: C */
    private OnActionExpandListener f1733C;

    /* renamed from: D */
    private boolean f1734D = false;

    /* renamed from: E */
    private ContextMenuInfo f1735E;

    /* renamed from: a */
    private final int f1736a;

    /* renamed from: b */
    private final int f1737b;

    /* renamed from: c */
    private final int f1738c;

    /* renamed from: d */
    private final int f1739d;

    /* renamed from: e */
    private CharSequence f1740e;

    /* renamed from: f */
    private CharSequence f1741f;

    /* renamed from: g */
    private Intent f1742g;

    /* renamed from: h */
    private char f1743h;

    /* renamed from: i */
    private int f1744i = 4096;

    /* renamed from: j */
    private char f1745j;

    /* renamed from: k */
    private int f1746k = 4096;

    /* renamed from: l */
    private Drawable f1747l;

    /* renamed from: m */
    private int f1748m = 0;

    /* renamed from: n */
    C0468l f1749n;

    /* renamed from: o */
    private C0453D f1750o;

    /* renamed from: p */
    private Runnable f1751p;

    /* renamed from: q */
    private OnMenuItemClickListener f1752q;

    /* renamed from: r */
    private CharSequence f1753r;

    /* renamed from: s */
    private CharSequence f1754s;

    /* renamed from: t */
    private ColorStateList f1755t = null;

    /* renamed from: u */
    private Mode f1756u = null;

    /* renamed from: v */
    private boolean f1757v = false;

    /* renamed from: w */
    private boolean f1758w = false;

    /* renamed from: x */
    private boolean f1759x = false;

    /* renamed from: y */
    private int f1760y = 16;

    /* renamed from: z */
    private int f1761z = 0;

    C0474p(C0468l lVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1749n = lVar;
        this.f1736a = i2;
        this.f1737b = i;
        this.f1738c = i3;
        this.f1739d = i4;
        this.f1740e = charSequence;
        this.f1761z = i5;
    }

    /* renamed from: a */
    private Drawable m2252a(Drawable drawable) {
        if (drawable != null && this.f1759x && (this.f1757v || this.f1758w)) {
            drawable = C0311a.m1350h(drawable).mutate();
            if (this.f1757v) {
                C0311a.m1336a(drawable, this.f1755t);
            }
            if (this.f1758w) {
                C0311a.m1339a(drawable, this.f1756u);
            }
            this.f1759x = false;
        }
        return drawable;
    }

    /* renamed from: a */
    private static void m2253a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: a */
    public C0076b mo241a(C0136e eVar) {
        C0136e eVar2 = this.f1732B;
        if (eVar2 != null) {
            eVar2.mo498f();
        }
        this.f1731A = null;
        this.f1732B = eVar;
        this.f1749n.mo2211b(true);
        C0136e eVar3 = this.f1732B;
        if (eVar3 != null) {
            eVar3.mo491a((C0138b) new C0473o(this));
        }
        return this;
    }

    /* renamed from: a */
    public C0136e mo242a() {
        return this.f1732B;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CharSequence mo2250a(C0488a aVar) {
        return (aVar == null || !aVar.mo2020c()) ? getTitle() : getTitleCondensed();
    }

    /* renamed from: a */
    public void mo2251a(C0453D d) {
        this.f1750o = d;
        d.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2252a(ContextMenuInfo contextMenuInfo) {
        this.f1735E = contextMenuInfo;
    }

    /* renamed from: a */
    public void mo2253a(boolean z) {
        this.f1734D = z;
        this.f1749n.mo2211b(false);
    }

    /* renamed from: b */
    public void mo2254b() {
        this.f1749n.mo2214c(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2255b(boolean z) {
        int i = this.f1760y;
        this.f1760y = (z ? 2 : 0) | (i & -3);
        if (i != this.f1760y) {
            this.f1749n.mo2211b(false);
        }
    }

    /* renamed from: c */
    public int mo2256c() {
        return this.f1739d;
    }

    /* renamed from: c */
    public void mo2257c(boolean z) {
        this.f1760y = (z ? 4 : 0) | (this.f1760y & -5);
    }

    public boolean collapseActionView() {
        if ((this.f1761z & 8) == 0) {
            return false;
        }
        if (this.f1731A == null) {
            return true;
        }
        OnActionExpandListener onActionExpandListener = this.f1733C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1749n.mo2062a(this);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public char mo2258d() {
        return this.f1749n.mo2068p() ? this.f1745j : this.f1743h;
    }

    /* renamed from: d */
    public void mo2259d(boolean z) {
        this.f1760y = z ? this.f1760y | 32 : this.f1760y & -33;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public String mo2260e() {
        int i;
        char d = mo2258d();
        if (d == 0) {
            return "";
        }
        Resources resources = this.f1749n.mo2221e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1749n.mo2221e()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0170h.abc_prepend_shortcut_label));
        }
        int i2 = this.f1749n.mo2068p() ? this.f1746k : this.f1744i;
        m2253a(sb, i2, 65536, resources.getString(C0170h.abc_menu_meta_shortcut_label));
        m2253a(sb, i2, 4096, resources.getString(C0170h.abc_menu_ctrl_shortcut_label));
        m2253a(sb, i2, 2, resources.getString(C0170h.abc_menu_alt_shortcut_label));
        m2253a(sb, i2, 1, resources.getString(C0170h.abc_menu_shift_shortcut_label));
        m2253a(sb, i2, 4, resources.getString(C0170h.abc_menu_sym_shortcut_label));
        m2253a(sb, i2, 8, resources.getString(C0170h.abc_menu_function_shortcut_label));
        if (d == 8) {
            i = C0170h.abc_menu_delete_shortcut_label;
        } else if (d == 10) {
            i = C0170h.abc_menu_enter_shortcut_label;
        } else if (d != ' ') {
            sb.append(d);
            return sb.toString();
        } else {
            i = C0170h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo2261e(boolean z) {
        int i = this.f1760y;
        this.f1760y = (z ? 0 : 8) | (i & -9);
        return i != this.f1760y;
    }

    public boolean expandActionView() {
        if (!mo2262f()) {
            return false;
        }
        OnActionExpandListener onActionExpandListener = this.f1733C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1749n.mo2063b(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo2262f() {
        if ((this.f1761z & 8) == 0) {
            return false;
        }
        if (this.f1731A == null) {
            C0136e eVar = this.f1732B;
            if (eVar != null) {
                this.f1731A = eVar.mo489a((MenuItem) this);
            }
        }
        return this.f1731A != null;
    }

    /* renamed from: g */
    public boolean mo2263g() {
        OnMenuItemClickListener onMenuItemClickListener = this.f1752q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0468l lVar = this.f1749n;
        if (lVar.mo2061a(lVar, (MenuItem) this)) {
            return true;
        }
        Runnable runnable = this.f1751p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1742g != null) {
            try {
                this.f1749n.mo2221e().startActivity(this.f1742g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C0136e eVar = this.f1732B;
        return eVar != null && eVar.mo496d();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f1731A;
        if (view != null) {
            return view;
        }
        C0136e eVar = this.f1732B;
        if (eVar == null) {
            return null;
        }
        this.f1731A = eVar.mo489a((MenuItem) this);
        return this.f1731A;
    }

    public int getAlphabeticModifiers() {
        return this.f1746k;
    }

    public char getAlphabeticShortcut() {
        return this.f1745j;
    }

    public CharSequence getContentDescription() {
        return this.f1753r;
    }

    public int getGroupId() {
        return this.f1737b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1747l;
        if (drawable != null) {
            return m2252a(drawable);
        }
        if (this.f1748m == 0) {
            return null;
        }
        Drawable b = C0173a.m597b(this.f1749n.mo2221e(), this.f1748m);
        this.f1748m = 0;
        this.f1747l = b;
        return m2252a(b);
    }

    public ColorStateList getIconTintList() {
        return this.f1755t;
    }

    public Mode getIconTintMode() {
        return this.f1756u;
    }

    public Intent getIntent() {
        return this.f1742g;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.f1736a;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f1735E;
    }

    public int getNumericModifiers() {
        return this.f1744i;
    }

    public char getNumericShortcut() {
        return this.f1743h;
    }

    public int getOrder() {
        return this.f1738c;
    }

    public SubMenu getSubMenu() {
        return this.f1750o;
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1740e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1741f;
        if (charSequence == null) {
            charSequence = this.f1740e;
        }
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f1754s;
    }

    /* renamed from: h */
    public boolean mo2276h() {
        return (this.f1760y & 32) == 32;
    }

    public boolean hasSubMenu() {
        return this.f1750o != null;
    }

    /* renamed from: i */
    public boolean mo2278i() {
        return (this.f1760y & 4) != 0;
    }

    public boolean isActionViewExpanded() {
        return this.f1734D;
    }

    public boolean isCheckable() {
        return (this.f1760y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1760y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1760y & 16) != 0;
    }

    public boolean isVisible() {
        C0136e eVar = this.f1732B;
        boolean z = true;
        if (eVar == null || !eVar.mo497e()) {
            if ((this.f1760y & 8) != 0) {
                z = false;
            }
            return z;
        }
        if ((this.f1760y & 8) != 0 || !this.f1732B.mo494b()) {
            z = false;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo2283j() {
        return (this.f1761z & 1) == 1;
    }

    /* renamed from: k */
    public boolean mo2284k() {
        return (this.f1761z & 2) == 2;
    }

    /* renamed from: l */
    public boolean mo2285l() {
        return this.f1749n.mo2232k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo2286m() {
        return this.f1749n.mo2069q() && mo2258d() != 0;
    }

    /* renamed from: n */
    public boolean mo2287n() {
        return (this.f1761z & 4) == 4;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public C0076b setActionView(int i) {
        Context e = this.f1749n.mo2221e();
        setActionView(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    public C0076b setActionView(View view) {
        this.f1731A = view;
        this.f1732B = null;
        if (view != null && view.getId() == -1) {
            int i = this.f1736a;
            if (i > 0) {
                view.setId(i);
            }
        }
        this.f1749n.mo2214c(this);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1745j == c) {
            return this;
        }
        this.f1745j = Character.toLowerCase(c);
        this.f1749n.mo2211b(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1745j == c && this.f1746k == i) {
            return this;
        }
        this.f1745j = Character.toLowerCase(c);
        this.f1746k = KeyEvent.normalizeMetaState(i);
        this.f1749n.mo2211b(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f1760y;
        this.f1760y = z | (i & true) ? 1 : 0;
        if (i != this.f1760y) {
            this.f1749n.mo2211b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f1760y & 4) != 0) {
            this.f1749n.mo2193a((MenuItem) this);
        } else {
            mo2255b(z);
        }
        return this;
    }

    public C0076b setContentDescription(CharSequence charSequence) {
        this.f1753r = charSequence;
        this.f1749n.mo2211b(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1760y = z ? this.f1760y | 16 : this.f1760y & -17;
        this.f1749n.mo2211b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1747l = null;
        this.f1748m = i;
        this.f1759x = true;
        this.f1749n.mo2211b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1748m = 0;
        this.f1747l = drawable;
        this.f1759x = true;
        this.f1749n.mo2211b(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1755t = colorStateList;
        this.f1757v = true;
        this.f1759x = true;
        this.f1749n.mo2211b(false);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f1756u = mode;
        this.f1758w = true;
        this.f1759x = true;
        this.f1749n.mo2211b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1742g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f1743h == c) {
            return this;
        }
        this.f1743h = c;
        this.f1749n.mo2211b(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1743h == c && this.f1744i == i) {
            return this;
        }
        this.f1743h = c;
        this.f1744i = KeyEvent.normalizeMetaState(i);
        this.f1749n.mo2211b(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f1733C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f1752q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1743h = c;
        this.f1745j = Character.toLowerCase(c2);
        this.f1749n.mo2211b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1743h = c;
        this.f1744i = KeyEvent.normalizeMetaState(i);
        this.f1745j = Character.toLowerCase(c2);
        this.f1746k = KeyEvent.normalizeMetaState(i2);
        this.f1749n.mo2211b(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f1761z = i;
            this.f1749n.mo2214c(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public C0076b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f1749n.mo2221e().getString(i));
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1740e = charSequence;
        this.f1749n.mo2211b(false);
        C0453D d = this.f1750o;
        if (d != null) {
            d.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1741f = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f1740e;
        }
        this.f1749n.mo2211b(false);
        return this;
    }

    public C0076b setTooltipText(CharSequence charSequence) {
        this.f1754s = charSequence;
        this.f1749n.mo2211b(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo2261e(z)) {
            this.f1749n.mo2220d(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f1740e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
