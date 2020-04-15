package com.facebook.react.views.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.facebook.react.uimanager.C1702p;
import com.facebook.react.uimanager.C1728y;
import com.facebook.react.uimanager.C1729z;
import com.facebook.react.uimanager.events.C1643i;
import com.facebook.react.views.view.C1884f;
import java.lang.reflect.Field;
import java.util.List;
import p000a.p005b.p009c.p018g.C0156v;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.views.scroll.e */
public class C1781e extends HorizontalScrollView implements C1728y {

    /* renamed from: a */
    private static Field f5239a = null;

    /* renamed from: b */
    private static boolean f5240b = false;

    /* renamed from: c */
    private final C1778b f5241c = new C1778b();

    /* renamed from: d */
    private final OverScroller f5242d;

    /* renamed from: e */
    private final C1792m f5243e = new C1792m();

    /* renamed from: f */
    private final Rect f5244f = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f5245g;

    /* renamed from: h */
    private Rect f5246h;

    /* renamed from: i */
    private String f5247i = "hidden";

    /* renamed from: j */
    private boolean f5248j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f5249k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Runnable f5250l;

    /* renamed from: m */
    private boolean f5251m;

    /* renamed from: n */
    private boolean f5252n = true;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f5253o;

    /* renamed from: p */
    private C1777a f5254p = null;

    /* renamed from: q */
    private String f5255q;

    /* renamed from: r */
    private Drawable f5256r;

    /* renamed from: s */
    private int f5257s = 0;

    /* renamed from: t */
    private int f5258t = 0;

    /* renamed from: u */
    private float f5259u = 0.985f;

    /* renamed from: v */
    private List<Integer> f5260v;

    /* renamed from: w */
    private boolean f5261w = true;

    /* renamed from: x */
    private boolean f5262x = true;

    /* renamed from: y */
    private C1884f f5263y = new C1884f(this);

    public C1781e(Context context, C1777a aVar) {
        super(context);
        this.f5254p = aVar;
        this.f5242d = getOverScrollerFromParent();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m6808a(int r28) {
        /*
            r27 = this;
            r0 = r27
            int r1 = r27.getChildCount()
            if (r1 > 0) goto L_0x0009
            return
        L_0x0009:
            int r1 = r0.f5258t
            if (r1 != 0) goto L_0x0015
            java.util.List<java.lang.Integer> r1 = r0.f5260v
            if (r1 != 0) goto L_0x0015
            r27.m6816c(r28)
            return
        L_0x0015:
            int r1 = r27.computeHorizontalScrollRange()
            int r2 = r27.getWidth()
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            int r3 = r27.m6813b(r28)
            int r4 = r27.getWidth()
            int r5 = p000a.p005b.p009c.p018g.C0156v.m569j(r27)
            int r4 = r4 - r5
            int r5 = p000a.p005b.p009c.p018g.C0156v.m568i(r27)
            int r4 = r4 - r5
            java.util.Locale r5 = java.util.Locale.getDefault()
            int r5 = p000a.p005b.p009c.p017f.C0098c.m315a(r5)
            r6 = 1
            if (r5 != r6) goto L_0x0042
            r5 = 1
            goto L_0x0043
        L_0x0042:
            r5 = 0
        L_0x0043:
            if (r5 == 0) goto L_0x004b
            int r3 = r1 - r3
            r7 = r28
            int r7 = -r7
            goto L_0x004d
        L_0x004b:
            r7 = r28
        L_0x004d:
            java.util.List<java.lang.Integer> r8 = r0.f5260v
            if (r8 == 0) goto L_0x009b
            java.lang.Object r8 = r8.get(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.util.List<java.lang.Integer> r9 = r0.f5260v
            int r10 = r9.size()
            int r10 = r10 - r6
            java.lang.Object r9 = r9.get(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r12 = r1
            r10 = 0
            r11 = 0
        L_0x006f:
            java.util.List<java.lang.Integer> r13 = r0.f5260v
            int r13 = r13.size()
            if (r10 >= r13) goto L_0x0098
            java.util.List<java.lang.Integer> r13 = r0.f5260v
            java.lang.Object r13 = r13.get(r10)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            if (r13 > r3) goto L_0x008c
            int r14 = r3 - r13
            int r15 = r3 - r11
            if (r14 >= r15) goto L_0x008c
            r11 = r13
        L_0x008c:
            if (r13 < r3) goto L_0x0095
            int r14 = r13 - r3
            int r15 = r12 - r3
            if (r14 >= r15) goto L_0x0095
            r12 = r13
        L_0x0095:
            int r10 = r10 + 1
            goto L_0x006f
        L_0x0098:
            r10 = r8
            r8 = r12
            goto L_0x00c3
        L_0x009b:
            int r8 = r27.getSnapInterval()
            double r8 = (double) r8
            double r10 = (double) r3
            java.lang.Double.isNaN(r10)
            java.lang.Double.isNaN(r8)
            double r10 = r10 / r8
            double r12 = java.lang.Math.floor(r10)
            java.lang.Double.isNaN(r8)
            double r12 = r12 * r8
            int r12 = (int) r12
            double r10 = java.lang.Math.ceil(r10)
            java.lang.Double.isNaN(r8)
            double r10 = r10 * r8
            int r8 = (int) r10
            int r8 = java.lang.Math.min(r8, r1)
            r9 = r1
            r11 = r12
            r10 = 0
        L_0x00c3:
            int r12 = r3 - r11
            int r13 = r8 - r3
            if (r12 >= r13) goto L_0x00cb
            r14 = r11
            goto L_0x00cc
        L_0x00cb:
            r14 = r8
        L_0x00cc:
            int r15 = r27.getScrollX()
            if (r5 == 0) goto L_0x00d4
            int r15 = r1 - r15
        L_0x00d4:
            boolean r6 = r0.f5262x
            if (r6 != 0) goto L_0x00df
            if (r3 < r9) goto L_0x00df
            if (r15 < r9) goto L_0x00dd
            goto L_0x00e7
        L_0x00dd:
            r14 = r9
            goto L_0x0104
        L_0x00df:
            boolean r6 = r0.f5261w
            if (r6 != 0) goto L_0x00eb
            if (r3 > r10) goto L_0x00eb
            if (r15 > r10) goto L_0x00e9
        L_0x00e7:
            r14 = r3
            goto L_0x0104
        L_0x00e9:
            r14 = r10
            goto L_0x0104
        L_0x00eb:
            r9 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r7 <= 0) goto L_0x00f9
            double r11 = (double) r13
            java.lang.Double.isNaN(r11)
            double r11 = r11 * r9
            int r3 = (int) r11
            int r7 = r7 + r3
            r14 = r8
            goto L_0x0104
        L_0x00f9:
            if (r7 >= 0) goto L_0x0104
            double r12 = (double) r12
            java.lang.Double.isNaN(r12)
            double r12 = r12 * r9
            int r3 = (int) r12
            int r7 = r7 - r3
            r14 = r11
        L_0x0104:
            int r3 = java.lang.Math.max(r2, r14)
            int r3 = java.lang.Math.min(r3, r1)
            if (r5 == 0) goto L_0x0111
            int r3 = r1 - r3
            int r7 = -r7
        L_0x0111:
            android.widget.OverScroller r5 = r0.f5242d
            if (r5 == 0) goto L_0x014e
            r6 = 1
            r0.f5245g = r6
            int r17 = r27.getScrollX()
            int r18 = r27.getScrollY()
            if (r7 == 0) goto L_0x0125
            r19 = r7
            goto L_0x012d
        L_0x0125:
            int r6 = r27.getScrollX()
            int r6 = r3 - r6
            r19 = r6
        L_0x012d:
            r20 = 0
            r23 = 0
            r24 = 0
            if (r3 == 0) goto L_0x013b
            if (r3 != r1) goto L_0x0138
            goto L_0x013b
        L_0x0138:
            r25 = 0
            goto L_0x013f
        L_0x013b:
            int r2 = r4 / 2
            r25 = r2
        L_0x013f:
            r26 = 0
            r16 = r5
            r21 = r3
            r22 = r3
            r16.fling(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r27.postInvalidateOnAnimation()
            goto L_0x0155
        L_0x014e:
            int r1 = r27.getScrollY()
            r0.smoothScrollTo(r3, r1)
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.C1781e.m6808a(int):void");
    }

    /* renamed from: a */
    private void m6809a(int i, int i2) {
        if ((this.f5253o || this.f5249k || m6820e()) && this.f5250l == null) {
            if (this.f5253o) {
                C1788i.m6852a((ViewGroup) this, i, i2);
            }
            this.f5245g = false;
            this.f5250l = new C1780d(this);
            C0156v.m549a((View) this, this.f5250l, 20);
        }
    }

    /* renamed from: b */
    private int m6813b(int i) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.f5259u);
        int width = ((getWidth() - C0156v.m569j(this)) - C0156v.m568i(this)) / 2;
        OverScroller overScroller2 = overScroller;
        overScroller2.fling(getScrollX(), getScrollY(), i, 0, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0, 0, width, 0);
        return overScroller.getFinalX();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m6815c() {
        if (m6820e()) {
            C1136a.m5053a(this.f5254p);
            C1136a.m5053a(this.f5255q);
            this.f5254p.mo6230b(this.f5255q);
        }
    }

    /* renamed from: c */
    private void m6816c(int i) {
        double snapInterval = (double) getSnapInterval();
        double scrollX = (double) getScrollX();
        double b = (double) m6813b(i);
        Double.isNaN(scrollX);
        Double.isNaN(snapInterval);
        double d = scrollX / snapInterval;
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
        if (d3 != scrollX) {
            this.f5245g = true;
            smoothScrollTo((int) d3, getScrollY());
        }
    }

    /* renamed from: d */
    private void m6818d() {
        if (m6820e()) {
            C1136a.m5053a(this.f5254p);
            C1136a.m5053a(this.f5255q);
            this.f5254p.mo6229a(this.f5255q);
        }
    }

    /* renamed from: e */
    private boolean m6820e() {
        if (this.f5254p != null) {
            String str = this.f5255q;
            if (str != null && !str.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private OverScroller getOverScrollerFromParent() {
        String str = "ReactNative";
        if (!f5240b) {
            f5240b = true;
            try {
                f5239a = HorizontalScrollView.class.getDeclaredField("mScroller");
                f5239a.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.w(str, "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f5239a;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            Log.w(str, "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e);
        }
    }

    private int getSnapInterval() {
        int i = this.f5258t;
        return i != 0 ? i : getWidth();
    }

    /* renamed from: a */
    public void mo6018a() {
        if (this.f5251m) {
            C1136a.m5053a(this.f5246h);
            C1729z.m6673a(this, this.f5246h);
            View childAt = getChildAt(0);
            if (childAt instanceof C1728y) {
                ((C1728y) childAt).mo6018a();
            }
        }
    }

    /* renamed from: a */
    public void mo6236a(float f, int i) {
        this.f5263y.mo6687a(f, i);
    }

    /* renamed from: a */
    public void mo6237a(int i, float f) {
        this.f5263y.mo6689a(i, f);
    }

    /* renamed from: a */
    public void mo6238a(int i, float f, float f2) {
        this.f5263y.mo6690a(i, f, f2);
    }

    /* renamed from: a */
    public void mo6019a(Rect rect) {
        Rect rect2 = this.f5246h;
        C1136a.m5053a(rect2);
        rect.set(rect2);
    }

    /* renamed from: b */
    public void mo6239b() {
        awakenScrollBars();
    }

    public void draw(Canvas canvas) {
        if (this.f5257s != 0) {
            View childAt = getChildAt(0);
            if (!(this.f5256r == null || childAt == null || childAt.getRight() >= getWidth())) {
                this.f5256r.setBounds(childAt.getRight(), 0, getWidth(), getHeight());
                this.f5256r.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    public void fling(int i) {
        int abs = (int) (((float) Math.abs(i)) * Math.signum(this.f5241c.mo6231a()));
        if (this.f5249k) {
            m6808a(abs);
        } else if (this.f5242d != null) {
            int width = (getWidth() - C0156v.m569j(this)) - C0156v.m568i(this);
            this.f5242d.fling(getScrollX(), getScrollY(), abs, 0, 0, Integer.MAX_VALUE, 0, 0, width / 2, 0);
            C0156v.m579t(this);
        } else {
            super.fling(abs);
        }
        m6809a(abs, 0);
    }

    public boolean getRemoveClippedSubviews() {
        return this.f5251m;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5251m) {
            mo6018a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        getDrawingRect(this.f5244f);
        String str = this.f5247i;
        if (((str.hashCode() == 466743410 && str.equals("visible")) ? (char) 0 : 65535) != 0) {
            canvas.clipRect(this.f5244f);
        }
        super.onDraw(canvas);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f5252n) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                C1643i.m6445a(this, motionEvent);
                C1788i.m6850a((ViewGroup) this);
                this.f5248j = true;
                m6818d();
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

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C1702p.m6587a(i, i2);
        setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        OverScroller overScroller = this.f5242d;
        if (!(overScroller == null || overScroller.isFinished() || this.f5242d.getCurrX() == this.f5242d.getFinalX())) {
            int computeHorizontalScrollRange = computeHorizontalScrollRange() - getWidth();
            if (i >= computeHorizontalScrollRange) {
                this.f5242d.abortAnimation();
                i = computeHorizontalScrollRange;
            }
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f5245g = true;
        if (this.f5241c.mo6232a(i, i2)) {
            if (this.f5251m) {
                mo6018a();
            }
            C1788i.m6856b(this, this.f5241c.mo6231a(), this.f5241c.mo6233b());
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f5251m) {
            mo6018a();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5252n) {
            return false;
        }
        this.f5243e.mo6300a(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.f5248j) {
            float a = this.f5243e.mo6299a();
            float b = this.f5243e.mo6301b();
            C1788i.m6851a((ViewGroup) this, a, b);
            this.f5248j = false;
            m6809a(Math.round(a), Math.round(b));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        this.f5263y.mo6688a(i);
    }

    public void setBorderRadius(float f) {
        this.f5263y.mo6686a(f);
    }

    public void setBorderStyle(String str) {
        this.f5263y.mo6691a(str);
    }

    public void setDecelerationRate(float f) {
        this.f5259u = f;
        OverScroller overScroller = this.f5242d;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - this.f5259u);
        }
    }

    public void setEndFillColor(int i) {
        if (i != this.f5257s) {
            this.f5257s = i;
            this.f5256r = new ColorDrawable(this.f5257s);
        }
    }

    public void setOverflow(String str) {
        this.f5247i = str;
        invalidate();
    }

    public void setPagingEnabled(boolean z) {
        this.f5249k = z;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.f5246h == null) {
            this.f5246h = new Rect();
        }
        this.f5251m = z;
        mo6018a();
    }

    public void setScrollEnabled(boolean z) {
        this.f5252n = z;
    }

    public void setScrollPerfTag(String str) {
        this.f5255q = str;
    }

    public void setSendMomentumEvents(boolean z) {
        this.f5253o = z;
    }

    public void setSnapInterval(int i) {
        this.f5258t = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f5260v = list;
    }

    public void setSnapToEnd(boolean z) {
        this.f5262x = z;
    }

    public void setSnapToStart(boolean z) {
        this.f5261w = z;
    }
}
