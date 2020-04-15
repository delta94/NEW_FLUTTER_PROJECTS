package android.support.p030v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p030v7.app.C0411a.C0413b;
import android.support.p030v7.view.menu.C0468l;
import android.support.p030v7.view.menu.C0468l.C0469a;
import android.support.p030v7.widget.ActionBarContainer;
import android.support.p030v7.widget.ActionBarContextView;
import android.support.p030v7.widget.ActionBarOverlayLayout;
import android.support.p030v7.widget.ActionBarOverlayLayout.C0494a;
import android.support.p030v7.widget.C0524L;
import android.support.p030v7.widget.C0563aa;
import android.support.p030v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000a.p005b.p009c.p018g.C0116H;
import p000a.p005b.p009c.p018g.C0118I;
import p000a.p005b.p009c.p018g.C0120K;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p022a.C0168f;
import p000a.p005b.p021d.p022a.C0172j;
import p000a.p005b.p021d.p028e.C0191a;
import p000a.p005b.p021d.p028e.C0192b;
import p000a.p005b.p021d.p028e.C0192b.C0193a;
import p000a.p005b.p021d.p028e.C0199g;
import p000a.p005b.p021d.p028e.C0203i;

/* renamed from: android.support.v7.app.I */
public class C0409I extends C0411a implements C0494a {

    /* renamed from: a */
    private static final Interpolator f1394a = new AccelerateInterpolator();

    /* renamed from: b */
    private static final Interpolator f1395b = new DecelerateInterpolator();

    /* renamed from: A */
    private boolean f1396A = true;

    /* renamed from: B */
    C0203i f1397B;

    /* renamed from: C */
    private boolean f1398C;

    /* renamed from: D */
    boolean f1399D;

    /* renamed from: E */
    final C0118I f1400E = new C0406F(this);

    /* renamed from: F */
    final C0118I f1401F = new C0407G(this);

    /* renamed from: G */
    final C0120K f1402G = new C0408H(this);

    /* renamed from: c */
    Context f1403c;

    /* renamed from: d */
    private Context f1404d;

    /* renamed from: e */
    private Activity f1405e;

    /* renamed from: f */
    private Dialog f1406f;

    /* renamed from: g */
    ActionBarOverlayLayout f1407g;

    /* renamed from: h */
    ActionBarContainer f1408h;

    /* renamed from: i */
    C0524L f1409i;

    /* renamed from: j */
    ActionBarContextView f1410j;

    /* renamed from: k */
    View f1411k;

    /* renamed from: l */
    C0563aa f1412l;

    /* renamed from: m */
    private ArrayList<Object> f1413m = new ArrayList<>();

    /* renamed from: n */
    private int f1414n = -1;

    /* renamed from: o */
    private boolean f1415o;

    /* renamed from: p */
    C0410a f1416p;

    /* renamed from: q */
    C0192b f1417q;

    /* renamed from: r */
    C0193a f1418r;

    /* renamed from: s */
    private boolean f1419s;

    /* renamed from: t */
    private ArrayList<C0413b> f1420t = new ArrayList<>();

    /* renamed from: u */
    private boolean f1421u;

    /* renamed from: v */
    private int f1422v = 0;

    /* renamed from: w */
    boolean f1423w = true;

    /* renamed from: x */
    boolean f1424x;

    /* renamed from: y */
    boolean f1425y;

    /* renamed from: z */
    private boolean f1426z;

    /* renamed from: android.support.v7.app.I$a */
    public class C0410a extends C0192b implements C0469a {

        /* renamed from: c */
        private final Context f1427c;

        /* renamed from: d */
        private final C0468l f1428d;

        /* renamed from: e */
        private C0193a f1429e;

        /* renamed from: f */
        private WeakReference<View> f1430f;

        public C0410a(Context context, C0193a aVar) {
            this.f1427c = context;
            this.f1429e = aVar;
            C0468l lVar = new C0468l(context);
            lVar.mo2212c(1);
            this.f1428d = lVar;
            this.f1428d.mo2060a((C0469a) this);
        }

        /* renamed from: a */
        public void mo697a() {
            C0409I i = C0409I.this;
            if (i.f1416p == this) {
                if (!C0409I.m1859a(i.f1424x, i.f1425y, false)) {
                    C0409I i2 = C0409I.this;
                    i2.f1417q = this;
                    i2.f1418r = this.f1429e;
                } else {
                    this.f1429e.mo714a(this);
                }
                this.f1429e = null;
                C0409I.this.mo1878e(false);
                C0409I.this.f1410j.mo2431a();
                C0409I.this.f1409i.mo2595j().sendAccessibilityEvent(32);
                C0409I i3 = C0409I.this;
                i3.f1407g.setHideOnContentScrollEnabled(i3.f1399D);
                C0409I.this.f1416p = null;
            }
        }

        /* renamed from: a */
        public void mo698a(int i) {
            mo700a((CharSequence) C0409I.this.f1403c.getResources().getString(i));
        }

        /* renamed from: a */
        public void mo728a(C0468l lVar) {
            if (this.f1429e != null) {
                mo712i();
                C0409I.this.f1410j.mo2435d();
            }
        }

        /* renamed from: a */
        public void mo699a(View view) {
            C0409I.this.f1410j.setCustomView(view);
            this.f1430f = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo700a(CharSequence charSequence) {
            C0409I.this.f1410j.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public void mo702a(boolean z) {
            super.mo702a(z);
            C0409I.this.f1410j.setTitleOptional(z);
        }

        /* renamed from: a */
        public boolean mo729a(C0468l lVar, MenuItem menuItem) {
            C0193a aVar = this.f1429e;
            if (aVar != null) {
                return aVar.mo716a((C0192b) this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public View mo703b() {
            WeakReference<View> weakReference = this.f1430f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: b */
        public void mo704b(int i) {
            mo705b((CharSequence) C0409I.this.f1403c.getResources().getString(i));
        }

        /* renamed from: b */
        public void mo705b(CharSequence charSequence) {
            C0409I.this.f1410j.setTitle(charSequence);
        }

        /* renamed from: c */
        public Menu mo706c() {
            return this.f1428d;
        }

        /* renamed from: d */
        public MenuInflater mo707d() {
            return new C0199g(this.f1427c);
        }

        /* renamed from: e */
        public CharSequence mo708e() {
            return C0409I.this.f1410j.getSubtitle();
        }

        /* renamed from: g */
        public CharSequence mo710g() {
            return C0409I.this.f1410j.getTitle();
        }

        /* renamed from: i */
        public void mo712i() {
            if (C0409I.this.f1416p == this) {
                this.f1428d.mo2240s();
                try {
                    this.f1429e.mo717b(this, this.f1428d);
                } finally {
                    this.f1428d.mo2237r();
                }
            }
        }

        /* renamed from: j */
        public boolean mo713j() {
            return C0409I.this.f1410j.mo2433b();
        }

        /* renamed from: k */
        public boolean mo1889k() {
            this.f1428d.mo2240s();
            try {
                return this.f1429e.mo715a((C0192b) this, (Menu) this.f1428d);
            } finally {
                this.f1428d.mo2237r();
            }
        }
    }

    public C0409I(Activity activity, boolean z) {
        this.f1405e = activity;
        View decorView = activity.getWindow().getDecorView();
        m1860b(decorView);
        if (!z) {
            this.f1411k = decorView.findViewById(16908290);
        }
    }

    public C0409I(Dialog dialog) {
        this.f1406f = dialog;
        m1860b(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private C0524L m1858a(View view) {
        if (view instanceof C0524L) {
            return (C0524L) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    static boolean m1859a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b */
    private void m1860b(View view) {
        this.f1407g = (ActionBarOverlayLayout) view.findViewById(C0168f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1407g;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1409i = m1858a(view.findViewById(C0168f.action_bar));
        this.f1410j = (ActionBarContextView) view.findViewById(C0168f.action_context_bar);
        this.f1408h = (ActionBarContainer) view.findViewById(C0168f.action_bar_container);
        C0524L l = this.f1409i;
        if (l == null || this.f1410j == null || this.f1408h == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0409I.class.getSimpleName());
            sb.append(" can only be used ");
            sb.append("with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.f1403c = l.mo2596k();
        boolean z = (this.f1409i.mo2597l() & 4) != 0;
        if (z) {
            this.f1415o = true;
        }
        C0191a a = C0191a.m682a(this.f1403c);
        mo1886j(a.mo690a() || z);
        m1861k(a.mo695f());
        TypedArray obtainStyledAttributes = this.f1403c.obtainStyledAttributes(null, C0172j.ActionBar, C0163a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0172j.ActionBar_hideOnContentScroll, false)) {
            mo1885i(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0172j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo1865a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    private void m1861k(boolean z) {
        this.f1421u = z;
        if (!this.f1421u) {
            this.f1409i.mo2571a((C0563aa) null);
            this.f1408h.setTabContainer(this.f1412l);
        } else {
            this.f1408h.setTabContainer(null);
            this.f1409i.mo2571a(this.f1412l);
        }
        boolean z2 = true;
        boolean z3 = mo1888m() == 2;
        C0563aa aaVar = this.f1412l;
        if (aaVar != null) {
            if (z3) {
                aaVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1407g;
                if (actionBarOverlayLayout != null) {
                    C0156v.m580u(actionBarOverlayLayout);
                }
            } else {
                aaVar.setVisibility(8);
            }
        }
        this.f1409i.mo2581b(!this.f1421u && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1407g;
        if (this.f1421u || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: l */
    private void m1862l(boolean z) {
        if (m1859a(this.f1424x, this.f1425y, this.f1426z)) {
            if (!this.f1396A) {
                this.f1396A = true;
                mo1882g(z);
            }
        } else if (this.f1396A) {
            this.f1396A = false;
            mo1879f(z);
        }
    }

    /* renamed from: n */
    private void m1863n() {
        if (this.f1426z) {
            this.f1426z = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1407g;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m1862l(false);
        }
    }

    /* renamed from: o */
    private boolean m1864o() {
        return C0156v.m577r(this.f1408h);
    }

    /* renamed from: p */
    private void m1865p() {
        if (!this.f1426z) {
            this.f1426z = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1407g;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m1862l(false);
        }
    }

    /* renamed from: a */
    public C0192b mo1863a(C0193a aVar) {
        C0410a aVar2 = this.f1416p;
        if (aVar2 != null) {
            aVar2.mo697a();
        }
        this.f1407g.setHideOnContentScrollEnabled(false);
        this.f1410j.mo2434c();
        C0410a aVar3 = new C0410a(this.f1410j.getContext(), aVar);
        if (!aVar3.mo1889k()) {
            return null;
        }
        this.f1416p = aVar3;
        aVar3.mo712i();
        this.f1410j.mo2432a(aVar3);
        mo1878e(true);
        this.f1410j.sendAccessibilityEvent(32);
        return aVar3;
    }

    /* renamed from: a */
    public void mo1864a() {
        if (this.f1425y) {
            this.f1425y = false;
            m1862l(true);
        }
    }

    /* renamed from: a */
    public void mo1865a(float f) {
        C0156v.m540a((View) this.f1408h, f);
    }

    /* renamed from: a */
    public void mo1866a(int i) {
        this.f1422v = i;
    }

    /* renamed from: a */
    public void mo1867a(int i, int i2) {
        int l = this.f1409i.mo2597l();
        if ((i2 & 4) != 0) {
            this.f1415o = true;
        }
        this.f1409i.mo2569a((i & i2) | ((i2 ^ -1) & l));
    }

    /* renamed from: a */
    public void mo1868a(Configuration configuration) {
        m1861k(C0191a.m682a(this.f1403c).mo695f());
    }

    /* renamed from: a */
    public void mo1869a(CharSequence charSequence) {
        this.f1409i.setWindowTitle(charSequence);
    }

    /* renamed from: a */
    public void mo1870a(boolean z) {
        this.f1423w = z;
    }

    /* renamed from: a */
    public boolean mo1871a(int i, KeyEvent keyEvent) {
        C0410a aVar = this.f1416p;
        if (aVar == null) {
            return false;
        }
        Menu c = aVar.mo706c();
        if (c == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        c.setQwertyMode(z);
        return c.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: b */
    public void mo1872b() {
    }

    /* renamed from: b */
    public void mo1873b(boolean z) {
        if (z != this.f1419s) {
            this.f1419s = z;
            int size = this.f1420t.size();
            for (int i = 0; i < size; i++) {
                ((C0413b) this.f1420t.get(i)).onMenuVisibilityChanged(z);
            }
        }
    }

    /* renamed from: c */
    public void mo1874c() {
        if (!this.f1425y) {
            this.f1425y = true;
            m1862l(true);
        }
    }

    /* renamed from: c */
    public void mo1875c(boolean z) {
        if (!this.f1415o) {
            mo1884h(z);
        }
    }

    /* renamed from: d */
    public void mo1876d() {
        C0203i iVar = this.f1397B;
        if (iVar != null) {
            iVar.mo763a();
            this.f1397B = null;
        }
    }

    /* renamed from: d */
    public void mo1877d(boolean z) {
        this.f1398C = z;
        if (!z) {
            C0203i iVar = this.f1397B;
            if (iVar != null) {
                iVar.mo763a();
            }
        }
    }

    /* renamed from: e */
    public void mo1878e(boolean z) {
        C0116H h;
        C0116H h2;
        if (z) {
            m1865p();
        } else {
            m1863n();
        }
        if (m1864o()) {
            if (z) {
                h = this.f1409i.mo2568a(4, 100);
                h2 = this.f1410j.mo2430a(0, 200);
            } else {
                h2 = this.f1409i.mo2568a(0, 200);
                h = this.f1410j.mo2430a(8, 100);
            }
            C0203i iVar = new C0203i();
            iVar.mo760a(h, h2);
            iVar.mo765c();
        } else if (z) {
            this.f1409i.mo2582c(4);
            this.f1410j.setVisibility(0);
        } else {
            this.f1409i.mo2582c(0);
            this.f1410j.setVisibility(8);
        }
    }

    /* renamed from: f */
    public void mo1879f(boolean z) {
        C0203i iVar = this.f1397B;
        if (iVar != null) {
            iVar.mo763a();
        }
        if (this.f1422v != 0 || (!this.f1398C && !z)) {
            this.f1400E.mo408b(null);
            return;
        }
        this.f1408h.setAlpha(1.0f);
        this.f1408h.setTransitioning(true);
        C0203i iVar2 = new C0203i();
        float f = (float) (-this.f1408h.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f1408h.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0116H a = C0156v.m537a(this.f1408h);
        a.mo404b(f);
        a.mo400a(this.f1402G);
        iVar2.mo759a(a);
        if (this.f1423w) {
            View view = this.f1411k;
            if (view != null) {
                C0116H a2 = C0156v.m537a(view);
                a2.mo404b(f);
                iVar2.mo759a(a2);
            }
        }
        iVar2.mo762a(f1394a);
        iVar2.mo758a(250);
        iVar2.mo761a(this.f1400E);
        this.f1397B = iVar2;
        iVar2.mo765c();
    }

    /* renamed from: f */
    public boolean mo1880f() {
        C0524L l = this.f1409i;
        if (l == null || !l.mo2593h()) {
            return false;
        }
        this.f1409i.collapseActionView();
        return true;
    }

    /* renamed from: g */
    public int mo1881g() {
        return this.f1409i.mo2597l();
    }

    /* renamed from: g */
    public void mo1882g(boolean z) {
        C0203i iVar = this.f1397B;
        if (iVar != null) {
            iVar.mo763a();
        }
        this.f1408h.setVisibility(0);
        if (this.f1422v != 0 || (!this.f1398C && !z)) {
            this.f1408h.setAlpha(1.0f);
            this.f1408h.setTranslationY(0.0f);
            if (this.f1423w) {
                View view = this.f1411k;
                if (view != null) {
                    view.setTranslationY(0.0f);
                }
            }
            this.f1401F.mo408b(null);
        } else {
            this.f1408h.setTranslationY(0.0f);
            float f = (float) (-this.f1408h.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f1408h.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f1408h.setTranslationY(f);
            C0203i iVar2 = new C0203i();
            C0116H a = C0156v.m537a(this.f1408h);
            a.mo404b(0.0f);
            a.mo400a(this.f1402G);
            iVar2.mo759a(a);
            if (this.f1423w) {
                View view2 = this.f1411k;
                if (view2 != null) {
                    view2.setTranslationY(f);
                    C0116H a2 = C0156v.m537a(this.f1411k);
                    a2.mo404b(0.0f);
                    iVar2.mo759a(a2);
                }
            }
            iVar2.mo762a(f1395b);
            iVar2.mo758a(250);
            iVar2.mo761a(this.f1401F);
            this.f1397B = iVar2;
            iVar2.mo765c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1407g;
        if (actionBarOverlayLayout != null) {
            C0156v.m580u(actionBarOverlayLayout);
        }
    }

    /* renamed from: h */
    public Context mo1883h() {
        if (this.f1404d == null) {
            TypedValue typedValue = new TypedValue();
            this.f1403c.getTheme().resolveAttribute(C0163a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1404d = new ContextThemeWrapper(this.f1403c, i);
            } else {
                this.f1404d = this.f1403c;
            }
        }
        return this.f1404d;
    }

    /* renamed from: h */
    public void mo1884h(boolean z) {
        mo1867a(z ? 4 : 0, 4);
    }

    /* renamed from: i */
    public void mo1885i(boolean z) {
        if (!z || this.f1407g.mo2474i()) {
            this.f1399D = z;
            this.f1407g.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: j */
    public void mo1886j(boolean z) {
        this.f1409i.mo2575a(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo1887l() {
        C0193a aVar = this.f1418r;
        if (aVar != null) {
            aVar.mo714a(this.f1417q);
            this.f1417q = null;
            this.f1418r = null;
        }
    }

    /* renamed from: m */
    public int mo1888m() {
        return this.f1409i.mo2594i();
    }
}
