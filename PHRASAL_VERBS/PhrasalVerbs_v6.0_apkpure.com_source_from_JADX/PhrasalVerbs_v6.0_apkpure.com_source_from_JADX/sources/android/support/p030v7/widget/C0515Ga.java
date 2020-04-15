package android.support.p030v7.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p009c.p018g.C0159w;

/* renamed from: android.support.v7.widget.Ga */
class C0515Ga implements OnLongClickListener, OnHoverListener, OnAttachStateChangeListener {

    /* renamed from: a */
    private static C0515Ga f1920a;

    /* renamed from: b */
    private static C0515Ga f1921b;

    /* renamed from: c */
    private final View f1922c;

    /* renamed from: d */
    private final CharSequence f1923d;

    /* renamed from: e */
    private final int f1924e;

    /* renamed from: f */
    private final Runnable f1925f = new C0511Ea(this);

    /* renamed from: g */
    private final Runnable f1926g = new C0513Fa(this);

    /* renamed from: h */
    private int f1927h;

    /* renamed from: i */
    private int f1928i;

    /* renamed from: j */
    private C0517Ha f1929j;

    /* renamed from: k */
    private boolean f1930k;

    private C0515Ga(View view, CharSequence charSequence) {
        this.f1922c = view;
        this.f1923d = charSequence;
        this.f1924e = C0159w.m590a(ViewConfiguration.get(this.f1922c.getContext()));
        m2464c();
        this.f1922c.setOnLongClickListener(this);
        this.f1922c.setOnHoverListener(this);
    }

    /* renamed from: a */
    private static void m2460a(C0515Ga ga) {
        C0515Ga ga2 = f1920a;
        if (ga2 != null) {
            ga2.m2463b();
        }
        f1920a = ga;
        C0515Ga ga3 = f1920a;
        if (ga3 != null) {
            ga3.m2465d();
        }
    }

    /* renamed from: a */
    public static void m2461a(View view, CharSequence charSequence) {
        C0515Ga ga = f1920a;
        if (ga != null && ga.f1922c == view) {
            m2460a((C0515Ga) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0515Ga ga2 = f1921b;
            if (ga2 != null && ga2.f1922c == view) {
                ga2.mo2626a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new C0515Ga(view, charSequence);
    }

    /* renamed from: a */
    private boolean m2462a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1927h) <= this.f1924e && Math.abs(y - this.f1928i) <= this.f1924e) {
            return false;
        }
        this.f1927h = x;
        this.f1928i = y;
        return true;
    }

    /* renamed from: b */
    private void m2463b() {
        this.f1922c.removeCallbacks(this.f1925f);
    }

    /* renamed from: c */
    private void m2464c() {
        this.f1927h = Integer.MAX_VALUE;
        this.f1928i = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m2465d() {
        this.f1922c.postDelayed(this.f1925f, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2626a() {
        if (f1921b == this) {
            f1921b = null;
            C0517Ha ha = this.f1929j;
            if (ha != null) {
                ha.mo2649a();
                this.f1929j = null;
                m2464c();
                this.f1922c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1920a == this) {
            m2460a((C0515Ga) null);
        }
        this.f1922c.removeCallbacks(this.f1926g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2627a(boolean z) {
        long j;
        if (C0156v.m576q(this.f1922c)) {
            m2460a((C0515Ga) null);
            C0515Ga ga = f1921b;
            if (ga != null) {
                ga.mo2626a();
            }
            f1921b = this;
            this.f1930k = z;
            this.f1929j = new C0517Ha(this.f1922c.getContext());
            this.f1929j.mo2650a(this.f1922c, this.f1927h, this.f1928i, this.f1930k, this.f1923d);
            this.f1922c.addOnAttachStateChangeListener(this);
            if (this.f1930k) {
                j = 2500;
            } else {
                j = ((C0156v.m572m(this.f1922c) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f1922c.removeCallbacks(this.f1926g);
            this.f1922c.postDelayed(this.f1926g, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1929j != null && this.f1930k) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1922c.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m2464c();
                mo2626a();
            }
        } else if (this.f1922c.isEnabled() && this.f1929j == null && m2462a(motionEvent)) {
            m2460a(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1927h = view.getWidth() / 2;
        this.f1928i = view.getHeight() / 2;
        mo2627a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo2626a();
    }
}
