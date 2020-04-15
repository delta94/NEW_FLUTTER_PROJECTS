package android.support.p030v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v7.view.menu.C0485v.C0486a;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;
import p000a.p005b.p009c.p018g.C0149o;
import p000a.p005b.p009c.p018g.C0150p;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p022a.C0168f;

/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
public class ActionBarOverlayLayout extends ViewGroup implements C0522K, C0149o {

    /* renamed from: a */
    static final int[] f1813a = {C0163a.actionBarSize, 16842841};

    /* renamed from: A */
    private final Runnable f1814A;

    /* renamed from: B */
    private final C0150p f1815B;

    /* renamed from: b */
    private int f1816b;

    /* renamed from: c */
    private int f1817c;

    /* renamed from: d */
    private ContentFrameLayout f1818d;

    /* renamed from: e */
    ActionBarContainer f1819e;

    /* renamed from: f */
    private C0524L f1820f;

    /* renamed from: g */
    private Drawable f1821g;

    /* renamed from: h */
    private boolean f1822h;

    /* renamed from: i */
    private boolean f1823i;

    /* renamed from: j */
    private boolean f1824j;

    /* renamed from: k */
    private boolean f1825k;

    /* renamed from: l */
    boolean f1826l;

    /* renamed from: m */
    private int f1827m;

    /* renamed from: n */
    private int f1828n;

    /* renamed from: o */
    private final Rect f1829o;

    /* renamed from: p */
    private final Rect f1830p;

    /* renamed from: q */
    private final Rect f1831q;

    /* renamed from: r */
    private final Rect f1832r;

    /* renamed from: s */
    private final Rect f1833s;

    /* renamed from: t */
    private final Rect f1834t;

    /* renamed from: u */
    private final Rect f1835u;

    /* renamed from: v */
    private C0494a f1836v;

    /* renamed from: w */
    private OverScroller f1837w;

    /* renamed from: x */
    ViewPropertyAnimator f1838x;

    /* renamed from: y */
    final AnimatorListenerAdapter f1839y;

    /* renamed from: z */
    private final Runnable f1840z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    public interface C0494a {
        /* renamed from: a */
        void mo1864a();

        /* renamed from: a */
        void mo1866a(int i);

        /* renamed from: a */
        void mo1870a(boolean z);

        /* renamed from: b */
        void mo1872b();

        /* renamed from: c */
        void mo1874c();

        /* renamed from: d */
        void mo1876d();
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$b */
    public static class C0495b extends MarginLayoutParams {
        public C0495b(int i, int i2) {
            super(i, i2);
        }

        public C0495b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0495b(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1817c = 0;
        this.f1829o = new Rect();
        this.f1830p = new Rect();
        this.f1831q = new Rect();
        this.f1832r = new Rect();
        this.f1833s = new Rect();
        this.f1834t = new Rect();
        this.f1835u = new Rect();
        this.f1839y = new C0571d(this);
        this.f1840z = new C0573e(this);
        this.f1814A = new C0575f(this);
        m2355a(context);
        this.f1815B = new C0150p(this);
    }

    /* renamed from: a */
    private C0524L m2354a(View view) {
        if (view instanceof C0524L) {
            return (C0524L) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    private void m2355a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1813a);
        boolean z = false;
        this.f1816b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1821g = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f1821g == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f1822h = z;
        this.f1837w = new OverScroller(context);
    }

    /* renamed from: a */
    private boolean m2356a(float f, float f2) {
        this.f1837w.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1837w.getFinalY() > this.f1819e.getHeight();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2357a(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.support.v7.widget.ActionBarOverlayLayout$b r3 = (android.support.p030v7.widget.ActionBarOverlayLayout.C0495b) r3
            r0 = 1
            if (r5 == 0) goto L_0x0013
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L_0x0013
            r3.leftMargin = r1
            r5 = 1
            goto L_0x0014
        L_0x0013:
            r5 = 0
        L_0x0014:
            if (r6 == 0) goto L_0x001f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L_0x001f
            r3.topMargin = r1
            r5 = 1
        L_0x001f:
            if (r8 == 0) goto L_0x002a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L_0x002a
            r3.rightMargin = r8
            r5 = 1
        L_0x002a:
            if (r7 == 0) goto L_0x0035
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L_0x0035
            r3.bottomMargin = r4
            r5 = 1
        L_0x0035:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.ActionBarOverlayLayout.m2357a(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: k */
    private void m2358k() {
        mo2473h();
        this.f1814A.run();
    }

    /* renamed from: l */
    private void m2359l() {
        mo2473h();
        postDelayed(this.f1814A, 600);
    }

    /* renamed from: m */
    private void m2360m() {
        mo2473h();
        postDelayed(this.f1840z, 600);
    }

    /* renamed from: n */
    private void m2361n() {
        mo2473h();
        this.f1840z.run();
    }

    /* renamed from: a */
    public void mo2455a(int i) {
        mo2475j();
        if (i == 2) {
            this.f1820f.mo2598m();
        } else if (i == 5) {
            this.f1820f.mo2599n();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: a */
    public void mo2456a(Menu menu, C0486a aVar) {
        mo2475j();
        this.f1820f.mo2572a(menu, aVar);
    }

    /* renamed from: a */
    public boolean mo2457a() {
        mo2475j();
        return this.f1820f.mo2576a();
    }

    /* renamed from: b */
    public void mo2458b() {
        mo2475j();
        this.f1820f.mo2577b();
    }

    /* renamed from: c */
    public boolean mo2459c() {
        mo2475j();
        return this.f1820f.mo2584c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0495b;
    }

    /* renamed from: d */
    public boolean mo2461d() {
        mo2475j();
        return this.f1820f.mo2587d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1821g != null && !this.f1822h) {
            int bottom = this.f1819e.getVisibility() == 0 ? (int) (((float) this.f1819e.getBottom()) + this.f1819e.getTranslationY() + 0.5f) : 0;
            this.f1821g.setBounds(0, bottom, getWidth(), this.f1821g.getIntrinsicHeight() + bottom);
            this.f1821g.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo2463e() {
        mo2475j();
        return this.f1820f.mo2589e();
    }

    /* renamed from: f */
    public boolean mo2464f() {
        mo2475j();
        return this.f1820f.mo2590f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        mo2475j();
        int m = C0156v.m572m(this) & 256;
        boolean a = m2357a(this.f1819e, rect, true, true, false, true);
        this.f1832r.set(rect);
        C0521Ja.m2524a(this, this.f1832r, this.f1829o);
        if (!this.f1833s.equals(this.f1832r)) {
            this.f1833s.set(this.f1832r);
            a = true;
        }
        if (!this.f1830p.equals(this.f1829o)) {
            this.f1830p.set(this.f1829o);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public void mo2466g() {
        mo2475j();
        this.f1820f.mo2591g();
    }

    /* access modifiers changed from: protected */
    public C0495b generateDefaultLayoutParams() {
        return new C0495b(-1, -1);
    }

    public C0495b generateLayoutParams(AttributeSet attributeSet) {
        return new C0495b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0495b(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1819e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f1815B.mo530a();
    }

    public CharSequence getTitle() {
        mo2475j();
        return this.f1820f.getTitle();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo2473h() {
        removeCallbacks(this.f1840z);
        removeCallbacks(this.f1814A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1838x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: i */
    public boolean mo2474i() {
        return this.f1823i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo2475j() {
        if (this.f1818d == null) {
            this.f1818d = (ContentFrameLayout) findViewById(C0168f.action_bar_activity_content);
            this.f1819e = (ActionBarContainer) findViewById(C0168f.action_bar_container);
            this.f1820f = m2354a(findViewById(C0168f.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2355a(getContext());
        C0156v.m580u(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo2473h();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0495b bVar = (C0495b) childAt.getLayoutParams();
                int i6 = bVar.leftMargin + paddingLeft;
                int i7 = bVar.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        mo2475j();
        measureChildWithMargins(this.f1819e, i, 0, i2, 0);
        C0495b bVar = (C0495b) this.f1819e.getLayoutParams();
        int max = Math.max(0, this.f1819e.getMeasuredWidth() + bVar.leftMargin + bVar.rightMargin);
        int max2 = Math.max(0, this.f1819e.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1819e.getMeasuredState());
        boolean z = (C0156v.m572m(this) & 256) != 0;
        if (z) {
            i3 = this.f1816b;
            if (this.f1824j && this.f1819e.getTabContainer() != null) {
                i3 += this.f1816b;
            }
        } else {
            i3 = this.f1819e.getVisibility() != 8 ? this.f1819e.getMeasuredHeight() : 0;
        }
        this.f1831q.set(this.f1829o);
        this.f1834t.set(this.f1832r);
        Rect rect = (this.f1823i || z) ? this.f1834t : this.f1831q;
        rect.top += i3;
        rect.bottom += 0;
        m2357a(this.f1818d, this.f1831q, true, true, true, true);
        if (!this.f1835u.equals(this.f1834t)) {
            this.f1835u.set(this.f1834t);
            this.f1818d.mo2605a(this.f1834t);
        }
        measureChildWithMargins(this.f1818d, i, 0, i2, 0);
        C0495b bVar2 = (C0495b) this.f1818d.getLayoutParams();
        int max3 = Math.max(max, this.f1818d.getMeasuredWidth() + bVar2.leftMargin + bVar2.rightMargin);
        int max4 = Math.max(max2, this.f1818d.getMeasuredHeight() + bVar2.topMargin + bVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1818d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1825k || !z) {
            return false;
        }
        if (m2356a(f, f2)) {
            m2358k();
        } else {
            m2361n();
        }
        this.f1826l = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f1827m += i2;
        setActionBarHideOffset(this.f1827m);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1815B.mo533a(view, view2, i);
        this.f1827m = getActionBarHideOffset();
        mo2473h();
        C0494a aVar = this.f1836v;
        if (aVar != null) {
            aVar.mo1876d();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1819e.getVisibility() != 0) {
            return false;
        }
        return this.f1825k;
    }

    public void onStopNestedScroll(View view) {
        if (this.f1825k && !this.f1826l) {
            if (this.f1827m <= this.f1819e.getHeight()) {
                m2360m();
            } else {
                m2359l();
            }
        }
        C0494a aVar = this.f1836v;
        if (aVar != null) {
            aVar.mo1872b();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo2475j();
        int i2 = this.f1828n ^ i;
        this.f1828n = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0494a aVar = this.f1836v;
        if (aVar != null) {
            aVar.mo1870a(!z);
            if (z2 || !z) {
                this.f1836v.mo1864a();
            } else {
                this.f1836v.mo1874c();
            }
        }
        if ((i2 & 256) != 0 && this.f1836v != null) {
            C0156v.m580u(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1817c = i;
        C0494a aVar = this.f1836v;
        if (aVar != null) {
            aVar.mo1866a(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        mo2473h();
        this.f1819e.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1819e.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0494a aVar) {
        this.f1836v = aVar;
        if (getWindowToken() != null) {
            this.f1836v.mo1866a(this.f1817c);
            int i = this.f1828n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0156v.m580u(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1824j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1825k) {
            this.f1825k = z;
            if (!z) {
                mo2473h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo2475j();
        this.f1820f.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        mo2475j();
        this.f1820f.setIcon(drawable);
    }

    public void setLogo(int i) {
        mo2475j();
        this.f1820f.mo2578b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f1823i = z;
        this.f1822h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Callback callback) {
        mo2475j();
        this.f1820f.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo2475j();
        this.f1820f.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
