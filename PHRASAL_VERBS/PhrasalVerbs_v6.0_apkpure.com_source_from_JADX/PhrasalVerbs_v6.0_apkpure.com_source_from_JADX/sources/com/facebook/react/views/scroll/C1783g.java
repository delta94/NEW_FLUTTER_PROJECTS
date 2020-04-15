package com.facebook.react.views.scroll;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C1702p;
import com.facebook.react.uimanager.C1728y;
import com.facebook.react.uimanager.C1729z;
import com.facebook.react.uimanager.events.C1643i;
import com.facebook.react.views.view.C1884f;
import java.lang.reflect.Field;
import java.util.List;
import p000a.p005b.p009c.p018g.C0156v;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.views.scroll.g */
public class C1783g extends ScrollView implements C1728y, OnHierarchyChangeListener, OnLayoutChangeListener {

    /* renamed from: a */
    private static Field f5266a = null;

    /* renamed from: b */
    private static boolean f5267b = false;

    /* renamed from: c */
    private final C1778b f5268c = new C1778b();

    /* renamed from: d */
    private final OverScroller f5269d;

    /* renamed from: e */
    private final C1792m f5270e = new C1792m();

    /* renamed from: f */
    private final Rect f5271f = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f5272g;

    /* renamed from: h */
    private Rect f5273h;

    /* renamed from: i */
    private String f5274i = "hidden";

    /* renamed from: j */
    private boolean f5275j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f5276k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Runnable f5277l;

    /* renamed from: m */
    private boolean f5278m;

    /* renamed from: n */
    private boolean f5279n = true;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f5280o;

    /* renamed from: p */
    private C1777a f5281p = null;

    /* renamed from: q */
    private String f5282q;

    /* renamed from: r */
    private Drawable f5283r;

    /* renamed from: s */
    private int f5284s = 0;

    /* renamed from: t */
    private int f5285t = 0;

    /* renamed from: u */
    private float f5286u = 0.985f;

    /* renamed from: v */
    private List<Integer> f5287v;

    /* renamed from: w */
    private boolean f5288w = true;

    /* renamed from: x */
    private boolean f5289x = true;

    /* renamed from: y */
    private View f5290y;

    /* renamed from: z */
    private C1884f f5291z;

    public C1783g(ReactContext reactContext, C1777a aVar) {
        super(reactContext);
        this.f5281p = aVar;
        this.f5291z = new C1884f(this);
        this.f5269d = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0131  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m6828a(int r20) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r19.getChildCount()
            if (r1 > 0) goto L_0x0009
            return
        L_0x0009:
            int r1 = r0.f5285t
            if (r1 != 0) goto L_0x0015
            java.util.List<java.lang.Integer> r1 = r0.f5287v
            if (r1 != 0) goto L_0x0015
            r19.m6836c(r20)
            return
        L_0x0015:
            int r1 = r19.getMaxScrollY()
            int r2 = r19.m6833b(r20)
            int r3 = r19.getHeight()
            int r4 = r19.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r19.getPaddingTop()
            int r3 = r3 - r4
            java.util.List<java.lang.Integer> r4 = r0.f5287v
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0080
            java.lang.Object r4 = r4.get(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.List<java.lang.Integer> r7 = r0.f5287v
            int r8 = r7.size()
            int r8 = r8 - r5
            java.lang.Object r7 = r7.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r10 = r1
            r8 = 0
            r9 = 0
        L_0x004f:
            java.util.List<java.lang.Integer> r11 = r0.f5287v
            int r11 = r11.size()
            if (r8 >= r11) goto L_0x0078
            java.util.List<java.lang.Integer> r11 = r0.f5287v
            java.lang.Object r11 = r11.get(r8)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 > r2) goto L_0x006c
            int r12 = r2 - r11
            int r13 = r2 - r9
            if (r12 >= r13) goto L_0x006c
            r9 = r11
        L_0x006c:
            if (r11 < r2) goto L_0x0075
            int r12 = r11 - r2
            int r13 = r10 - r2
            if (r12 >= r13) goto L_0x0075
            r10 = r11
        L_0x0075:
            int r8 = r8 + 1
            goto L_0x004f
        L_0x0078:
            r8 = r7
            r7 = r10
            r18 = r9
            r9 = r4
            r4 = r18
            goto L_0x00a7
        L_0x0080:
            int r4 = r19.getSnapInterval()
            double r7 = (double) r4
            double r9 = (double) r2
            java.lang.Double.isNaN(r9)
            java.lang.Double.isNaN(r7)
            double r9 = r9 / r7
            double r11 = java.lang.Math.floor(r9)
            java.lang.Double.isNaN(r7)
            double r11 = r11 * r7
            int r4 = (int) r11
            double r9 = java.lang.Math.ceil(r9)
            java.lang.Double.isNaN(r7)
            double r9 = r9 * r7
            int r7 = (int) r9
            int r7 = java.lang.Math.min(r7, r1)
            r8 = r1
            r9 = 0
        L_0x00a7:
            int r10 = r2 - r4
            int r11 = r7 - r2
            if (r10 >= r11) goto L_0x00af
            r12 = r4
            goto L_0x00b0
        L_0x00af:
            r12 = r7
        L_0x00b0:
            boolean r13 = r0.f5289x
            if (r13 != 0) goto L_0x00c1
            if (r2 < r8) goto L_0x00c1
            int r4 = r19.getScrollY()
            if (r4 < r8) goto L_0x00bd
            goto L_0x00cd
        L_0x00bd:
            r4 = r20
            r2 = r8
            goto L_0x00f8
        L_0x00c1:
            boolean r8 = r0.f5288w
            if (r8 != 0) goto L_0x00d4
            if (r2 > r9) goto L_0x00d4
            int r4 = r19.getScrollY()
            if (r4 > r9) goto L_0x00d0
        L_0x00cd:
            r4 = r20
            goto L_0x00f8
        L_0x00d0:
            r4 = r20
            r2 = r9
            goto L_0x00f8
        L_0x00d4:
            r8 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r20 <= 0) goto L_0x00e4
            double r10 = (double) r11
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r8
            int r2 = (int) r10
            int r2 = r20 + r2
            r4 = r2
            r2 = r7
            goto L_0x00f8
        L_0x00e4:
            if (r20 >= 0) goto L_0x00f5
            double r10 = (double) r10
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r8
            int r2 = (int) r10
            int r2 = r20 - r2
            r18 = r4
            r4 = r2
            r2 = r18
            goto L_0x00f8
        L_0x00f5:
            r4 = r20
            r2 = r12
        L_0x00f8:
            int r2 = java.lang.Math.max(r6, r2)
            int r15 = java.lang.Math.min(r2, r1)
            android.widget.OverScroller r7 = r0.f5269d
            if (r7 == 0) goto L_0x0131
            r0.f5272g = r5
            int r8 = r19.getScrollX()
            int r9 = r19.getScrollY()
            r10 = 0
            if (r4 == 0) goto L_0x0112
            goto L_0x0118
        L_0x0112:
            int r2 = r19.getScrollY()
            int r4 = r15 - r2
        L_0x0118:
            r11 = r4
            r12 = 0
            r13 = 0
            r16 = 0
            if (r15 == 0) goto L_0x0125
            if (r15 != r1) goto L_0x0122
            goto L_0x0125
        L_0x0122:
            r17 = 0
            goto L_0x0129
        L_0x0125:
            int r6 = r3 / 2
            r17 = r6
        L_0x0129:
            r14 = r15
            r7.fling(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r19.postInvalidateOnAnimation()
            goto L_0x0138
        L_0x0131:
            int r1 = r19.getScrollX()
            r0.smoothScrollTo(r1, r15)
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.C1783g.m6828a(int):void");
    }

    /* renamed from: a */
    private void m6829a(int i, int i2) {
        if ((this.f5280o || this.f5276k || m6840e()) && this.f5277l == null) {
            if (this.f5280o) {
                m6838d();
                C1788i.m6852a((ViewGroup) this, i, i2);
            }
            this.f5272g = false;
            this.f5277l = new C1782f(this);
            C0156v.m549a((View) this, this.f5277l, 20);
        }
    }

    /* renamed from: b */
    private int m6833b(int i) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.f5286u);
        int height = ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2;
        OverScroller overScroller2 = overScroller;
        overScroller2.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, getMaxScrollY(), 0, height);
        return overScroller.getFinalY();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m6835c() {
        if (m6840e()) {
            C1136a.m5053a(this.f5281p);
            C1136a.m5053a(this.f5282q);
            this.f5281p.mo6230b(this.f5282q);
        }
    }

    /* renamed from: c */
    private void m6836c(int i) {
        double snapInterval = (double) getSnapInterval();
        double scrollY = (double) getScrollY();
        double b = (double) m6833b(i);
        Double.isNaN(scrollY);
        Double.isNaN(snapInterval);
        double d = scrollY / snapInterval;
        int floor = (int) Math.floor(d);
        int ceil = (int) Math.ceil(d);
        int round = (int) Math.round(d);
        Double.isNaN(b);
        Double.isNaN(snapInterval);
        int round2 = (int) Math.round(b / snapInterval);
        if (i > 0 && ceil == floor) {
            ceil++;
        } else if (i < 0 && floor == ceil) {
            floor--;
        }
        if (i > 0 && round < ceil && round2 > floor) {
            round = ceil;
        } else if (i < 0 && round > floor && round2 < ceil) {
            round = floor;
        }
        double d2 = (double) round;
        Double.isNaN(d2);
        Double.isNaN(snapInterval);
        double d3 = d2 * snapInterval;
        if (d3 != scrollY) {
            this.f5272g = true;
            smoothScrollTo(getScrollX(), (int) d3);
        }
    }

    /* renamed from: d */
    private void m6838d() {
        if (m6840e()) {
            C1136a.m5053a(this.f5281p);
            C1136a.m5053a(this.f5282q);
            this.f5281p.mo6229a(this.f5282q);
        }
    }

    /* renamed from: e */
    private boolean m6840e() {
        if (this.f5281p != null) {
            String str = this.f5282q;
            if (str != null && !str.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private int getMaxScrollY() {
        return Math.max(0, this.f5290y.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() {
        String str = "ReactNative";
        if (!f5267b) {
            f5267b = true;
            try {
                f5266a = ScrollView.class.getDeclaredField("mScroller");
                f5266a.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.w(str, "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f5266a;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            Log.w(str, "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to get mScroller from ScrollView!", e);
        }
    }

    private int getSnapInterval() {
        int i = this.f5285t;
        return i != 0 ? i : getHeight();
    }

    /* renamed from: a */
    public void mo6018a() {
        if (this.f5278m) {
            C1136a.m5053a(this.f5273h);
            C1729z.m6673a(this, this.f5273h);
            View childAt = getChildAt(0);
            if (childAt instanceof C1728y) {
                ((C1728y) childAt).mo6018a();
            }
        }
    }

    /* renamed from: a */
    public void mo6267a(float f, int i) {
        this.f5291z.mo6687a(f, i);
    }

    /* renamed from: a */
    public void mo6268a(int i, float f) {
        this.f5291z.mo6689a(i, f);
    }

    /* renamed from: a */
    public void mo6269a(int i, float f, float f2) {
        this.f5291z.mo6690a(i, f, f2);
    }

    /* renamed from: a */
    public void mo6019a(Rect rect) {
        Rect rect2 = this.f5273h;
        C1136a.m5053a(rect2);
        rect.set(rect2);
    }

    /* renamed from: b */
    public void mo6270b() {
        awakenScrollBars();
    }

    public void draw(Canvas canvas) {
        char c = 0;
        if (this.f5284s != 0) {
            View childAt = getChildAt(0);
            if (!(this.f5283r == null || childAt == null || childAt.getBottom() >= getHeight())) {
                this.f5283r.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.f5283r.draw(canvas);
            }
        }
        getDrawingRect(this.f5271f);
        String str = this.f5274i;
        if (str.hashCode() != 466743410 || !str.equals("visible")) {
            c = 65535;
        }
        if (c != 0) {
            canvas.clipRect(this.f5271f);
        }
        super.draw(canvas);
    }

    public void fling(int i) {
        int abs = (int) (((float) Math.abs(i)) * Math.signum(this.f5268c.mo6233b()));
        if (this.f5276k) {
            m6828a(abs);
        } else if (this.f5269d != null) {
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            this.f5269d.fling(getScrollX(), getScrollY(), 0, abs, 0, 0, 0, Integer.MAX_VALUE, 0, height / 2);
            C0156v.m579t(this);
        } else {
            super.fling(abs);
        }
        m6829a(0, abs);
    }

    public boolean getRemoveClippedSubviews() {
        return this.f5278m;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5278m) {
            mo6018a();
        }
    }

    public void onChildViewAdded(View view, View view2) {
        this.f5290y = view2;
        this.f5290y.addOnLayoutChangeListener(this);
    }

    public void onChildViewRemoved(View view, View view2) {
        this.f5290y.removeOnLayoutChangeListener(this);
        this.f5290y = null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f5279n) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                C1643i.m6445a(this, motionEvent);
                C1788i.m6850a((ViewGroup) this);
                this.f5275j = true;
                m6838d();
                return true;
            }
        } catch (IllegalArgumentException e) {
            Log.w("ReactNative", "Error intercepting touch event.", e);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        scrollTo(getScrollX(), getScrollY());
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f5290y != null) {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C1702p.m6587a(i, i2);
        setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        OverScroller overScroller = this.f5269d;
        if (!(overScroller == null || overScroller.isFinished() || this.f5269d.getCurrY() == this.f5269d.getFinalY())) {
            int maxScrollY = getMaxScrollY();
            if (i2 >= maxScrollY) {
                this.f5269d.abortAnimation();
                i2 = maxScrollY;
            }
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f5272g = true;
        if (this.f5268c.mo6232a(i, i2)) {
            if (this.f5278m) {
                mo6018a();
            }
            C1788i.m6856b(this, this.f5268c.mo6231a(), this.f5268c.mo6233b());
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f5278m) {
            mo6018a();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5279n) {
            return false;
        }
        this.f5270e.mo6300a(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.f5275j) {
            float a = this.f5270e.mo6299a();
            float b = this.f5270e.mo6301b();
            C1788i.m6851a((ViewGroup) this, a, b);
            this.f5275j = false;
            m6829a(Math.round(a), Math.round(b));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        this.f5291z.mo6688a(i);
    }

    public void setBorderRadius(float f) {
        this.f5291z.mo6686a(f);
    }

    public void setBorderStyle(String str) {
        this.f5291z.mo6691a(str);
    }

    public void setDecelerationRate(float f) {
        this.f5286u = f;
        OverScroller overScroller = this.f5269d;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - this.f5286u);
        }
    }

    public void setEndFillColor(int i) {
        if (i != this.f5284s) {
            this.f5284s = i;
            this.f5283r = new ColorDrawable(this.f5284s);
        }
    }

    public void setOverflow(String str) {
        this.f5274i = str;
        invalidate();
    }

    public void setPagingEnabled(boolean z) {
        this.f5276k = z;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.f5273h == null) {
            this.f5273h = new Rect();
        }
        this.f5278m = z;
        mo6018a();
    }

    public void setScrollEnabled(boolean z) {
        this.f5279n = z;
    }

    public void setScrollPerfTag(String str) {
        this.f5282q = str;
    }

    public void setSendMomentumEvents(boolean z) {
        this.f5280o = z;
    }

    public void setSnapInterval(int i) {
        this.f5285t = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f5287v = list;
    }

    public void setSnapToEnd(boolean z) {
        this.f5289x = z;
    }

    public void setSnapToStart(boolean z) {
        this.f5288w = z;
    }
}
