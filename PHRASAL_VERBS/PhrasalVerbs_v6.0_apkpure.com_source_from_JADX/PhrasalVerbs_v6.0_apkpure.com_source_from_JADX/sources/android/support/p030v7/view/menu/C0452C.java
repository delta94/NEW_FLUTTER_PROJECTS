package android.support.p030v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.p030v7.view.menu.C0485v.C0486a;
import android.support.p030v7.widget.C0556W;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0166d;
import p000a.p005b.p021d.p022a.C0169g;

/* renamed from: android.support.v7.view.menu.C */
final class C0452C extends C0482s implements OnDismissListener, OnItemClickListener, C0485v, OnKeyListener {

    /* renamed from: b */
    private static final int f1565b = C0169g.abc_popup_menu_item_layout;

    /* renamed from: c */
    private final Context f1566c;

    /* renamed from: d */
    private final C0468l f1567d;

    /* renamed from: e */
    private final C0467k f1568e;

    /* renamed from: f */
    private final boolean f1569f;

    /* renamed from: g */
    private final int f1570g;

    /* renamed from: h */
    private final int f1571h;

    /* renamed from: i */
    private final int f1572i;

    /* renamed from: j */
    final C0556W f1573j;

    /* renamed from: k */
    final OnGlobalLayoutListener f1574k = new C0448A(this);

    /* renamed from: l */
    private final OnAttachStateChangeListener f1575l = new C0451B(this);

    /* renamed from: m */
    private OnDismissListener f1576m;

    /* renamed from: n */
    private View f1577n;

    /* renamed from: o */
    View f1578o;

    /* renamed from: p */
    private C0486a f1579p;

    /* renamed from: q */
    ViewTreeObserver f1580q;

    /* renamed from: r */
    private boolean f1581r;

    /* renamed from: s */
    private boolean f1582s;

    /* renamed from: t */
    private int f1583t;

    /* renamed from: u */
    private int f1584u = 0;

    /* renamed from: v */
    private boolean f1585v;

    public C0452C(Context context, C0468l lVar, View view, int i, int i2, boolean z) {
        this.f1566c = context;
        this.f1567d = lVar;
        this.f1569f = z;
        this.f1568e = new C0467k(lVar, LayoutInflater.from(context), this.f1569f, f1565b);
        this.f1571h = i;
        this.f1572i = i2;
        Resources resources = context.getResources();
        this.f1570g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0166d.abc_config_prefDialogWidth));
        this.f1577n = view;
        this.f1573j = new C0556W(this.f1566c, null, this.f1571h, this.f1572i);
        lVar.mo2192a((C0485v) this, context);
    }

    /* renamed from: g */
    private boolean m2086g() {
        if (mo2052b()) {
            return true;
        }
        if (!this.f1581r) {
            View view = this.f1577n;
            if (view != null) {
                this.f1578o = view;
                this.f1573j.mo2918a((OnDismissListener) this);
                this.f1573j.mo2917a((OnItemClickListener) this);
                this.f1573j.mo2919a(true);
                View view2 = this.f1578o;
                boolean z = this.f1580q == null;
                this.f1580q = view2.getViewTreeObserver();
                if (z) {
                    this.f1580q.addOnGlobalLayoutListener(this.f1574k);
                }
                view2.addOnAttachStateChangeListener(this.f1575l);
                this.f1573j.mo2916a(view2);
                this.f1573j.mo2922c(this.f1584u);
                if (!this.f1582s) {
                    this.f1583t = C0482s.m2289a(this.f1568e, null, this.f1566c, this.f1570g);
                    this.f1582s = true;
                }
                this.f1573j.mo2920b(this.f1583t);
                this.f1573j.mo2925e(2);
                this.f1573j.mo2914a(mo2367f());
                this.f1573j.mo2053c();
                ListView d = this.f1573j.mo2056d();
                d.setOnKeyListener(this);
                if (this.f1585v && this.f1567d.mo2227h() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1566c).inflate(C0169g.abc_popup_menu_header_item_layout, d, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f1567d.mo2227h());
                    }
                    frameLayout.setEnabled(false);
                    d.addHeaderView(frameLayout, null, false);
                }
                this.f1573j.mo2563a((ListAdapter) this.f1568e);
                this.f1573j.mo2053c();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo2041a(int i) {
        this.f1584u = i;
    }

    /* renamed from: a */
    public void mo2042a(C0468l lVar) {
    }

    /* renamed from: a */
    public void mo2043a(C0468l lVar, boolean z) {
        if (lVar == this.f1567d) {
            dismiss();
            C0486a aVar = this.f1579p;
            if (aVar != null) {
                aVar.mo2000a(lVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo2044a(C0486a aVar) {
        this.f1579p = aVar;
    }

    /* renamed from: a */
    public void mo2045a(View view) {
        this.f1577n = view;
    }

    /* renamed from: a */
    public void mo2046a(OnDismissListener onDismissListener) {
        this.f1576m = onDismissListener;
    }

    /* renamed from: a */
    public void mo2047a(boolean z) {
        this.f1582s = false;
        C0467k kVar = this.f1568e;
        if (kVar != null) {
            kVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo2048a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo2049a(C0453D d) {
        if (d.hasVisibleItems()) {
            C0484u uVar = new C0484u(this.f1566c, d, this.f1578o, this.f1569f, this.f1571h, this.f1572i);
            uVar.mo2372a(this.f1579p);
            uVar.mo2375a(C0482s.m2291b((C0468l) d));
            uVar.mo2374a(this.f1576m);
            this.f1576m = null;
            this.f1567d.mo2195a(false);
            int g = this.f1573j.mo2928g();
            int h = this.f1573j.mo2930h();
            if ((Gravity.getAbsoluteGravity(this.f1584u, C0156v.m565g(this.f1577n)) & 7) == 5) {
                g += this.f1577n.getWidth();
            }
            if (uVar.mo2376a(g, h)) {
                C0486a aVar = this.f1579p;
                if (aVar != null) {
                    aVar.mo2001a(d);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo2050b(int i) {
        this.f1573j.mo2923d(i);
    }

    /* renamed from: b */
    public void mo2051b(boolean z) {
        this.f1568e.mo2175a(z);
    }

    /* renamed from: b */
    public boolean mo2052b() {
        return !this.f1581r && this.f1573j.mo2052b();
    }

    /* renamed from: c */
    public void mo2053c() {
        if (!m2086g()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: c */
    public void mo2054c(int i) {
        this.f1573j.mo2931h(i);
    }

    /* renamed from: c */
    public void mo2055c(boolean z) {
        this.f1585v = z;
    }

    /* renamed from: d */
    public ListView mo2056d() {
        return this.f1573j.mo2056d();
    }

    public void dismiss() {
        if (mo2052b()) {
            this.f1573j.dismiss();
        }
    }

    public void onDismiss() {
        this.f1581r = true;
        this.f1567d.close();
        ViewTreeObserver viewTreeObserver = this.f1580q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1580q = this.f1578o.getViewTreeObserver();
            }
            this.f1580q.removeGlobalOnLayoutListener(this.f1574k);
            this.f1580q = null;
        }
        this.f1578o.removeOnAttachStateChangeListener(this.f1575l);
        OnDismissListener onDismissListener = this.f1576m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
