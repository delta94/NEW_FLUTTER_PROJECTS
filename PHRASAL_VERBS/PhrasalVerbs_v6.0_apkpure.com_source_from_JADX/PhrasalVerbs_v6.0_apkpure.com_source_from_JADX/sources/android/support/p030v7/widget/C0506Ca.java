package android.support.p030v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v7.view.menu.C0468l;
import android.support.p030v7.view.menu.C0485v.C0486a;
import android.support.p030v7.widget.Toolbar.C0545b;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window.Callback;
import p000a.p005b.p009c.p018g.C0116H;
import p000a.p005b.p009c.p018g.C0118I;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p022a.C0167e;
import p000a.p005b.p021d.p022a.C0168f;
import p000a.p005b.p021d.p022a.C0170h;
import p000a.p005b.p021d.p022a.C0172j;
import p000a.p005b.p021d.p023b.p024a.C0173a;

/* renamed from: android.support.v7.widget.Ca */
public class C0506Ca implements C0524L {

    /* renamed from: a */
    Toolbar f1884a;

    /* renamed from: b */
    private int f1885b;

    /* renamed from: c */
    private View f1886c;

    /* renamed from: d */
    private View f1887d;

    /* renamed from: e */
    private Drawable f1888e;

    /* renamed from: f */
    private Drawable f1889f;

    /* renamed from: g */
    private Drawable f1890g;

    /* renamed from: h */
    private boolean f1891h;

    /* renamed from: i */
    CharSequence f1892i;

    /* renamed from: j */
    private CharSequence f1893j;

    /* renamed from: k */
    private CharSequence f1894k;

    /* renamed from: l */
    Callback f1895l;

    /* renamed from: m */
    boolean f1896m;

    /* renamed from: n */
    private C0577g f1897n;

    /* renamed from: o */
    private int f1898o;

    /* renamed from: p */
    private int f1899p;

    /* renamed from: q */
    private Drawable f1900q;

    public C0506Ca(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0170h.abc_action_bar_up_description, C0167e.abc_ic_ab_back_material);
    }

    public C0506Ca(Toolbar toolbar, boolean z, int i, int i2) {
        this.f1898o = 0;
        this.f1899p = 0;
        this.f1884a = toolbar;
        this.f1892i = toolbar.getTitle();
        this.f1893j = toolbar.getSubtitle();
        this.f1891h = this.f1892i != null;
        this.f1890g = toolbar.getNavigationIcon();
        C0620va a = C0620va.m2920a(toolbar.getContext(), null, C0172j.ActionBar, C0163a.actionBarStyle, 0);
        this.f1900q = a.mo3258b(C0172j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e = a.mo3264e(C0172j.ActionBar_title);
            if (!TextUtils.isEmpty(e)) {
                mo2583c(e);
            }
            CharSequence e2 = a.mo3264e(C0172j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e2)) {
                mo2580b(e2);
            }
            Drawable b = a.mo3258b(C0172j.ActionBar_logo);
            if (b != null) {
                mo2570a(b);
            }
            Drawable b2 = a.mo3258b(C0172j.ActionBar_icon);
            if (b2 != null) {
                setIcon(b2);
            }
            if (this.f1890g == null) {
                Drawable drawable = this.f1900q;
                if (drawable != null) {
                    mo2579b(drawable);
                }
            }
            mo2569a(a.mo3261d(C0172j.ActionBar_displayOptions, 0));
            int g = a.mo3267g(C0172j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                mo2573a(LayoutInflater.from(this.f1884a.getContext()).inflate(g, this.f1884a, false));
                mo2569a(this.f1885b | 16);
            }
            int f = a.mo3265f(C0172j.ActionBar_height, 0);
            if (f > 0) {
                LayoutParams layoutParams = this.f1884a.getLayoutParams();
                layoutParams.height = f;
                this.f1884a.setLayoutParams(layoutParams);
            }
            int b3 = a.mo3257b(C0172j.ActionBar_contentInsetStart, -1);
            int b4 = a.mo3257b(C0172j.ActionBar_contentInsetEnd, -1);
            if (b3 >= 0 || b4 >= 0) {
                this.f1884a.mo2832a(Math.max(b3, 0), Math.max(b4, 0));
            }
            int g2 = a.mo3267g(C0172j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                Toolbar toolbar2 = this.f1884a;
                toolbar2.mo2835b(toolbar2.getContext(), g2);
            }
            int g3 = a.mo3267g(C0172j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar3 = this.f1884a;
                toolbar3.mo2833a(toolbar3.getContext(), g3);
            }
            int g4 = a.mo3267g(C0172j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f1884a.setPopupTheme(g4);
            }
        } else {
            this.f1885b = m2420o();
        }
        a.mo3255a();
        mo2586d(i);
        this.f1894k = this.f1884a.getNavigationContentDescription();
        this.f1884a.setNavigationOnClickListener(new C0493Aa(this));
    }

    /* renamed from: d */
    private void m2419d(CharSequence charSequence) {
        this.f1892i = charSequence;
        if ((this.f1885b & 8) != 0) {
            this.f1884a.setTitle(charSequence);
        }
    }

    /* renamed from: o */
    private int m2420o() {
        if (this.f1884a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1900q = this.f1884a.getNavigationIcon();
        return 15;
    }

    /* renamed from: p */
    private void m2421p() {
        if ((this.f1885b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1894k)) {
            this.f1884a.setNavigationContentDescription(this.f1899p);
        } else {
            this.f1884a.setNavigationContentDescription(this.f1894k);
        }
    }

    /* renamed from: q */
    private void m2422q() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f1885b & 4) != 0) {
            toolbar = this.f1884a;
            drawable = this.f1890g;
            if (drawable == null) {
                drawable = this.f1900q;
            }
        } else {
            toolbar = this.f1884a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != null) goto L_0x0013;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2423r() {
        /*
            r2 = this;
            int r0 = r2.f1885b
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r0 = r0 & 1
            if (r0 == 0) goto L_0x000f
            android.graphics.drawable.Drawable r0 = r2.f1889f
            if (r0 == 0) goto L_0x000f
            goto L_0x0013
        L_0x000f:
            android.graphics.drawable.Drawable r0 = r2.f1888e
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            android.support.v7.widget.Toolbar r1 = r2.f1884a
            r1.setLogo(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0506Ca.m2423r():void");
    }

    /* renamed from: a */
    public C0116H mo2568a(int i, long j) {
        C0116H a = C0156v.m537a(this.f1884a);
        a.mo397a(i == 0 ? 1.0f : 0.0f);
        a.mo398a(j);
        a.mo399a((C0118I) new C0502Ba(this, i));
        return a;
    }

    /* renamed from: a */
    public void mo2569a(int i) {
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1885b ^ i;
        this.f1885b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2421p();
                }
                m2422q();
            }
            if ((i2 & 3) != 0) {
                m2423r();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1884a.setTitle(this.f1892i);
                    toolbar = this.f1884a;
                    charSequence = this.f1893j;
                } else {
                    charSequence = null;
                    this.f1884a.setTitle((CharSequence) null);
                    toolbar = this.f1884a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0) {
                View view = this.f1887d;
                if (view == null) {
                    return;
                }
                if ((i & 16) != 0) {
                    this.f1884a.addView(view);
                } else {
                    this.f1884a.removeView(view);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2570a(Drawable drawable) {
        this.f1889f = drawable;
        m2423r();
    }

    /* renamed from: a */
    public void mo2571a(C0563aa aaVar) {
        View view = this.f1886c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1884a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1886c);
            }
        }
        this.f1886c = aaVar;
        if (aaVar != null && this.f1898o == 2) {
            this.f1884a.addView(this.f1886c, 0);
            C0545b bVar = (C0545b) this.f1886c.getLayoutParams();
            bVar.width = -2;
            bVar.height = -2;
            bVar.f1432a = 8388691;
            aaVar.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo2572a(Menu menu, C0486a aVar) {
        if (this.f1897n == null) {
            this.f1897n = new C0577g(this.f1884a.getContext());
            this.f1897n.mo2140a(C0168f.action_menu_presenter);
        }
        this.f1897n.mo2044a(aVar);
        this.f1884a.mo2834a((C0468l) menu, this.f1897n);
    }

    /* renamed from: a */
    public void mo2573a(View view) {
        View view2 = this.f1887d;
        if (!(view2 == null || (this.f1885b & 16) == 0)) {
            this.f1884a.removeView(view2);
        }
        this.f1887d = view;
        if (view != null && (this.f1885b & 16) != 0) {
            this.f1884a.addView(this.f1887d);
        }
    }

    /* renamed from: a */
    public void mo2574a(CharSequence charSequence) {
        this.f1894k = charSequence;
        m2421p();
    }

    /* renamed from: a */
    public void mo2575a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo2576a() {
        return this.f1884a.mo2873i();
    }

    /* renamed from: b */
    public void mo2577b() {
        this.f1896m = true;
    }

    /* renamed from: b */
    public void mo2578b(int i) {
        mo2570a(i != 0 ? C0173a.m597b(mo2596k(), i) : null);
    }

    /* renamed from: b */
    public void mo2579b(Drawable drawable) {
        this.f1890g = drawable;
        m2422q();
    }

    /* renamed from: b */
    public void mo2580b(CharSequence charSequence) {
        this.f1893j = charSequence;
        if ((this.f1885b & 8) != 0) {
            this.f1884a.setSubtitle(charSequence);
        }
    }

    /* renamed from: b */
    public void mo2581b(boolean z) {
        this.f1884a.setCollapsible(z);
    }

    /* renamed from: c */
    public void mo2582c(int i) {
        this.f1884a.setVisibility(i);
    }

    /* renamed from: c */
    public void mo2583c(CharSequence charSequence) {
        this.f1891h = true;
        m2419d(charSequence);
    }

    /* renamed from: c */
    public boolean mo2584c() {
        return this.f1884a.mo2836b();
    }

    public void collapseActionView() {
        this.f1884a.mo2837c();
    }

    /* renamed from: d */
    public void mo2586d(int i) {
        if (i != this.f1899p) {
            this.f1899p = i;
            if (TextUtils.isEmpty(this.f1884a.getNavigationContentDescription())) {
                mo2588e(this.f1899p);
            }
        }
    }

    /* renamed from: d */
    public boolean mo2587d() {
        return this.f1884a.mo2872h();
    }

    /* renamed from: e */
    public void mo2588e(int i) {
        mo2574a((CharSequence) i == 0 ? null : mo2596k().getString(i));
    }

    /* renamed from: e */
    public boolean mo2589e() {
        return this.f1884a.mo2842g();
    }

    /* renamed from: f */
    public boolean mo2590f() {
        return this.f1884a.mo2875k();
    }

    /* renamed from: g */
    public void mo2591g() {
        this.f1884a.mo2839d();
    }

    public CharSequence getTitle() {
        return this.f1884a.getTitle();
    }

    /* renamed from: h */
    public boolean mo2593h() {
        return this.f1884a.mo2841f();
    }

    /* renamed from: i */
    public int mo2594i() {
        return this.f1898o;
    }

    /* renamed from: j */
    public ViewGroup mo2595j() {
        return this.f1884a;
    }

    /* renamed from: k */
    public Context mo2596k() {
        return this.f1884a.getContext();
    }

    /* renamed from: l */
    public int mo2597l() {
        return this.f1885b;
    }

    /* renamed from: m */
    public void mo2598m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: n */
    public void mo2599n() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C0173a.m597b(mo2596k(), i) : null);
    }

    public void setIcon(Drawable drawable) {
        this.f1888e = drawable;
        m2423r();
    }

    public void setWindowCallback(Callback callback) {
        this.f1895l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1891h) {
            m2419d(charSequence);
        }
    }
}
