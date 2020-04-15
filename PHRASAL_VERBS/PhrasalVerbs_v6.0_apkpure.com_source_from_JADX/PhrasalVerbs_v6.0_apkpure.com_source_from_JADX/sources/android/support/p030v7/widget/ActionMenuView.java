package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p030v7.view.menu.ActionMenuItemView;
import android.support.p030v7.view.menu.C0468l;
import android.support.p030v7.view.menu.C0468l.C0469a;
import android.support.p030v7.view.menu.C0468l.C0470b;
import android.support.p030v7.view.menu.C0474p;
import android.support.p030v7.view.menu.C0485v;
import android.support.p030v7.view.menu.C0485v.C0486a;
import android.support.p030v7.view.menu.C0487w;
import android.support.p030v7.widget.C0534Q.C0535a;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.ActionMenuView */
public class ActionMenuView extends C0534Q implements C0470b, C0487w {

    /* renamed from: A */
    C0500e f1841A;

    /* renamed from: p */
    private C0468l f1842p;

    /* renamed from: q */
    private Context f1843q;

    /* renamed from: r */
    private int f1844r;

    /* renamed from: s */
    private boolean f1845s;

    /* renamed from: t */
    private C0577g f1846t;

    /* renamed from: u */
    private C0486a f1847u;

    /* renamed from: v */
    C0469a f1848v;

    /* renamed from: w */
    private boolean f1849w;

    /* renamed from: x */
    private int f1850x;

    /* renamed from: y */
    private int f1851y;

    /* renamed from: z */
    private int f1852z;

    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    public interface C0496a {
        /* renamed from: a */
        boolean mo2018a();

        /* renamed from: b */
        boolean mo2019b();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    private static class C0497b implements C0486a {
        C0497b() {
        }

        /* renamed from: a */
        public void mo2000a(C0468l lVar, boolean z) {
        }

        /* renamed from: a */
        public boolean mo2001a(C0468l lVar) {
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    public static class C0498c extends C0535a {
        @ExportedProperty

        /* renamed from: c */
        public boolean f1853c;
        @ExportedProperty

        /* renamed from: d */
        public int f1854d;
        @ExportedProperty

        /* renamed from: e */
        public int f1855e;
        @ExportedProperty

        /* renamed from: f */
        public boolean f1856f;
        @ExportedProperty

        /* renamed from: g */
        public boolean f1857g;

        /* renamed from: h */
        boolean f1858h;

        public C0498c(int i, int i2) {
            super(i, i2);
            this.f1853c = false;
        }

        public C0498c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0498c(C0498c cVar) {
            super(cVar);
            this.f1853c = cVar.f1853c;
        }

        public C0498c(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    private class C0499d implements C0469a {
        C0499d() {
        }

        /* renamed from: a */
        public void mo728a(C0468l lVar) {
            C0469a aVar = ActionMenuView.this.f1848v;
            if (aVar != null) {
                aVar.mo728a(lVar);
            }
        }

        /* renamed from: a */
        public boolean mo729a(C0468l lVar, MenuItem menuItem) {
            C0500e eVar = ActionMenuView.this.f1841A;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$e */
    public interface C0500e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1851y = (int) (56.0f * f);
        this.f1852z = (int) (f * 4.0f);
        this.f1843q = context;
        this.f1844r = 0;
    }

    /* renamed from: a */
    static int m2380a(View view, int i, int i2, int i3, int i4) {
        C0498c cVar = (C0498c) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo2021d();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f1853c || !z2) {
            z = false;
        }
        cVar.f1856f = z;
        cVar.f1854d = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x023b A[LOOP:5: B:134:0x023b->B:138:0x025a, LOOP_START, PHI: r13 
      PHI: (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:133:0x0239, B:138:0x025a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0262  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2381e(int r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            int r1 = android.view.View.MeasureSpec.getMode(r31)
            int r2 = android.view.View.MeasureSpec.getSize(r30)
            int r3 = android.view.View.MeasureSpec.getSize(r31)
            int r4 = r29.getPaddingLeft()
            int r5 = r29.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r29.getPaddingTop()
            int r6 = r29.getPaddingBottom()
            int r5 = r5 + r6
            r6 = -2
            r7 = r31
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r7, r5, r6)
            int r2 = r2 - r4
            int r4 = r0.f1851y
            int r7 = r2 / r4
            int r8 = r2 % r4
            r9 = 0
            if (r7 != 0) goto L_0x0035
            r0.setMeasuredDimension(r2, r9)
            return
        L_0x0035:
            int r8 = r8 / r7
            int r4 = r4 + r8
            int r8 = r29.getChildCount()
            r14 = r7
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0045:
            if (r7 >= r8) goto L_0x00c5
            android.view.View r11 = r0.getChildAt(r7)
            int r9 = r11.getVisibility()
            r19 = r3
            r3 = 8
            if (r9 != r3) goto L_0x0057
            goto L_0x00bf
        L_0x0057:
            boolean r3 = r11 instanceof android.support.p030v7.view.menu.ActionMenuItemView
            int r13 = r13 + 1
            if (r3 == 0) goto L_0x0066
            int r9 = r0.f1852z
            r20 = r13
            r13 = 0
            r11.setPadding(r9, r13, r9, r13)
            goto L_0x0069
        L_0x0066:
            r20 = r13
            r13 = 0
        L_0x0069:
            android.view.ViewGroup$LayoutParams r9 = r11.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r9 = (android.support.p030v7.widget.ActionMenuView.C0498c) r9
            r9.f1858h = r13
            r9.f1855e = r13
            r9.f1854d = r13
            r9.f1856f = r13
            r9.leftMargin = r13
            r9.rightMargin = r13
            if (r3 == 0) goto L_0x0088
            r3 = r11
            android.support.v7.view.menu.ActionMenuItemView r3 = (android.support.p030v7.view.menu.ActionMenuItemView) r3
            boolean r3 = r3.mo2021d()
            if (r3 == 0) goto L_0x0088
            r3 = 1
            goto L_0x0089
        L_0x0088:
            r3 = 0
        L_0x0089:
            r9.f1857g = r3
            boolean r3 = r9.f1853c
            if (r3 == 0) goto L_0x0091
            r3 = 1
            goto L_0x0092
        L_0x0091:
            r3 = r14
        L_0x0092:
            int r3 = m2380a(r11, r4, r3, r6, r5)
            int r13 = java.lang.Math.max(r15, r3)
            boolean r15 = r9.f1856f
            if (r15 == 0) goto L_0x00a0
            int r16 = r16 + 1
        L_0x00a0:
            boolean r9 = r9.f1853c
            if (r9 == 0) goto L_0x00a5
            r12 = 1
        L_0x00a5:
            int r14 = r14 - r3
            int r9 = r11.getMeasuredHeight()
            int r10 = java.lang.Math.max(r10, r9)
            r9 = 1
            if (r3 != r9) goto L_0x00bb
            int r3 = r9 << r7
            r11 = r10
            long r9 = (long) r3
            long r9 = r17 | r9
            r17 = r9
            r10 = r11
            goto L_0x00bc
        L_0x00bb:
            r11 = r10
        L_0x00bc:
            r15 = r13
            r13 = r20
        L_0x00bf:
            int r7 = r7 + 1
            r3 = r19
            r9 = 0
            goto L_0x0045
        L_0x00c5:
            r19 = r3
            r3 = 2
            if (r12 == 0) goto L_0x00ce
            if (r13 != r3) goto L_0x00ce
            r5 = 1
            goto L_0x00cf
        L_0x00ce:
            r5 = 0
        L_0x00cf:
            r7 = 0
        L_0x00d0:
            r20 = 1
            if (r16 <= 0) goto L_0x0172
            if (r14 <= 0) goto L_0x0172
            r9 = 2147483647(0x7fffffff, float:NaN)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r9 = 0
            r11 = 0
            r22 = 0
        L_0x00e0:
            if (r9 >= r8) goto L_0x0111
            android.view.View r24 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r24 = r24.getLayoutParams()
            r25 = r7
            r7 = r24
            android.support.v7.widget.ActionMenuView$c r7 = (android.support.p030v7.widget.ActionMenuView.C0498c) r7
            r24 = r10
            boolean r10 = r7.f1856f
            if (r10 != 0) goto L_0x00f7
            goto L_0x010a
        L_0x00f7:
            int r7 = r7.f1854d
            if (r7 >= r3) goto L_0x0102
            long r10 = r20 << r9
            r3 = r7
            r22 = r10
            r11 = 1
            goto L_0x010a
        L_0x0102:
            if (r7 != r3) goto L_0x010a
            long r26 = r20 << r9
            long r22 = r22 | r26
            int r11 = r11 + 1
        L_0x010a:
            int r9 = r9 + 1
            r10 = r24
            r7 = r25
            goto L_0x00e0
        L_0x0111:
            r25 = r7
            r24 = r10
            long r17 = r17 | r22
            if (r11 <= r14) goto L_0x011d
            r11 = r1
            r26 = r2
            goto L_0x0179
        L_0x011d:
            int r3 = r3 + 1
            r7 = 0
        L_0x0120:
            if (r7 >= r8) goto L_0x016c
            android.view.View r9 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r10 = (android.support.p030v7.widget.ActionMenuView.C0498c) r10
            r26 = r2
            r11 = 1
            int r2 = r11 << r7
            r11 = r1
            long r1 = (long) r2
            long r20 = r22 & r1
            r27 = 0
            int r25 = (r20 > r27 ? 1 : (r20 == r27 ? 0 : -1))
            if (r25 != 0) goto L_0x0144
            int r9 = r10.f1854d
            if (r9 != r3) goto L_0x0141
            long r17 = r17 | r1
        L_0x0141:
            r20 = r3
            goto L_0x0164
        L_0x0144:
            if (r5 == 0) goto L_0x0158
            boolean r1 = r10.f1857g
            if (r1 == 0) goto L_0x0158
            r1 = 1
            if (r14 != r1) goto L_0x0158
            int r2 = r0.f1852z
            int r1 = r2 + r4
            r20 = r3
            r3 = 0
            r9.setPadding(r1, r3, r2, r3)
            goto L_0x015a
        L_0x0158:
            r20 = r3
        L_0x015a:
            int r1 = r10.f1854d
            r2 = 1
            int r1 = r1 + r2
            r10.f1854d = r1
            r10.f1858h = r2
            int r14 = r14 + -1
        L_0x0164:
            int r7 = r7 + 1
            r1 = r11
            r3 = r20
            r2 = r26
            goto L_0x0120
        L_0x016c:
            r10 = r24
            r3 = 2
            r7 = 1
            goto L_0x00d0
        L_0x0172:
            r11 = r1
            r26 = r2
            r25 = r7
            r24 = r10
        L_0x0179:
            if (r12 != 0) goto L_0x0180
            r1 = 1
            if (r13 != r1) goto L_0x0181
            r2 = 1
            goto L_0x0182
        L_0x0180:
            r1 = 1
        L_0x0181:
            r2 = 0
        L_0x0182:
            if (r14 <= 0) goto L_0x0236
            r9 = 0
            int r3 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0236
            int r13 = r13 - r1
            if (r14 < r13) goto L_0x0191
            if (r2 != 0) goto L_0x0191
            if (r15 <= r1) goto L_0x0236
        L_0x0191:
            int r1 = java.lang.Long.bitCount(r17)
            float r1 = (float) r1
            if (r2 != 0) goto L_0x01d2
            long r2 = r17 & r20
            r5 = 1056964608(0x3f000000, float:0.5)
            r9 = 0
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x01b3
            r13 = 0
            android.view.View r2 = r0.getChildAt(r13)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r2 = (android.support.p030v7.widget.ActionMenuView.C0498c) r2
            boolean r2 = r2.f1857g
            if (r2 != 0) goto L_0x01b4
            float r1 = r1 - r5
            goto L_0x01b4
        L_0x01b3:
            r13 = 0
        L_0x01b4:
            int r2 = r8 + -1
            r3 = 1
            int r7 = r3 << r2
            long r9 = (long) r7
            long r9 = r17 & r9
            r15 = 0
            int r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x01d3
            android.view.View r2 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r2 = (android.support.p030v7.widget.ActionMenuView.C0498c) r2
            boolean r2 = r2.f1857g
            if (r2 != 0) goto L_0x01d3
            float r1 = r1 - r5
            goto L_0x01d3
        L_0x01d2:
            r13 = 0
        L_0x01d3:
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x01de
            int r14 = r14 * r4
            float r2 = (float) r14
            float r2 = r2 / r1
            int r9 = (int) r2
            goto L_0x01df
        L_0x01de:
            r9 = 0
        L_0x01df:
            r1 = 0
        L_0x01e0:
            if (r1 >= r8) goto L_0x0237
            r2 = 1
            int r3 = r2 << r1
            long r2 = (long) r3
            long r2 = r17 & r2
            r14 = 0
            int r5 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x01f1
            r2 = 1
            r5 = 2
            goto L_0x0233
        L_0x01f1:
            android.view.View r2 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r3 = (android.support.p030v7.widget.ActionMenuView.C0498c) r3
            boolean r2 = r2 instanceof android.support.p030v7.view.menu.ActionMenuItemView
            if (r2 == 0) goto L_0x0213
            r3.f1855e = r9
            r2 = 1
            r3.f1858h = r2
            if (r1 != 0) goto L_0x0210
            boolean r2 = r3.f1857g
            if (r2 != 0) goto L_0x0210
            int r2 = -r9
            r5 = 2
            int r2 = r2 / r5
            r3.leftMargin = r2
            goto L_0x0211
        L_0x0210:
            r5 = 2
        L_0x0211:
            r2 = 1
            goto L_0x0221
        L_0x0213:
            r5 = 2
            boolean r2 = r3.f1853c
            if (r2 == 0) goto L_0x0224
            r3.f1855e = r9
            r2 = 1
            r3.f1858h = r2
            int r7 = -r9
            int r7 = r7 / r5
            r3.rightMargin = r7
        L_0x0221:
            r25 = 1
            goto L_0x0233
        L_0x0224:
            r2 = 1
            if (r1 == 0) goto L_0x022b
            int r7 = r9 / 2
            r3.leftMargin = r7
        L_0x022b:
            int r7 = r8 + -1
            if (r1 == r7) goto L_0x0233
            int r7 = r9 / 2
            r3.rightMargin = r7
        L_0x0233:
            int r1 = r1 + 1
            goto L_0x01e0
        L_0x0236:
            r13 = 0
        L_0x0237:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r25 == 0) goto L_0x025d
        L_0x023b:
            if (r13 >= r8) goto L_0x025d
            android.view.View r2 = r0.getChildAt(r13)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r3 = (android.support.p030v7.widget.ActionMenuView.C0498c) r3
            boolean r5 = r3.f1858h
            if (r5 != 0) goto L_0x024c
            goto L_0x025a
        L_0x024c:
            int r5 = r3.f1854d
            int r5 = r5 * r4
            int r3 = r3.f1855e
            int r5 = r5 + r3
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            r2.measure(r3, r6)
        L_0x025a:
            int r13 = r13 + 1
            goto L_0x023b
        L_0x025d:
            if (r11 == r1) goto L_0x0262
            r1 = r24
            goto L_0x0264
        L_0x0262:
            r1 = r19
        L_0x0264:
            r2 = r26
            r0.setMeasuredDimension(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.ActionMenuView.m2381e(int, int):void");
    }

    /* renamed from: a */
    public void mo2495a() {
        C0577g gVar = this.f1846t;
        if (gVar != null) {
            gVar.mo3063c();
        }
    }

    /* renamed from: a */
    public void mo2090a(C0468l lVar) {
        this.f1842p = lVar;
    }

    /* renamed from: a */
    public void mo2496a(C0486a aVar, C0469a aVar2) {
        this.f1847u = aVar;
        this.f1848v = aVar2;
    }

    /* renamed from: a */
    public boolean mo2091a(C0474p pVar) {
        return this.f1842p.mo2196a((MenuItem) pVar, 0);
    }

    /* renamed from: b */
    public C0498c mo2497b() {
        C0498c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f1853c = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: c */
    public boolean mo2498c() {
        C0577g gVar = this.f1846t;
        return gVar != null && gVar.mo3065e();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0498c);
    }

    /* renamed from: d */
    public boolean mo2500d() {
        C0577g gVar = this.f1846t;
        return gVar != null && gVar.mo3067g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo2501d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0496a)) {
            z = false | ((C0496a) childAt).mo2018a();
        }
        if (i > 0 && (childAt2 instanceof C0496a)) {
            z |= ((C0496a) childAt2).mo2019b();
        }
        return z;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public boolean mo2503e() {
        C0577g gVar = this.f1846t;
        return gVar != null && gVar.mo3068h();
    }

    /* renamed from: f */
    public boolean mo2504f() {
        return this.f1845s;
    }

    /* renamed from: g */
    public C0468l mo2505g() {
        return this.f1842p;
    }

    /* access modifiers changed from: protected */
    public C0498c generateDefaultLayoutParams() {
        C0498c cVar = new C0498c(-2, -2);
        cVar.f2012b = 16;
        return cVar;
    }

    public C0498c generateLayoutParams(AttributeSet attributeSet) {
        return new C0498c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0498c generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0498c cVar = layoutParams instanceof C0498c ? new C0498c((C0498c) layoutParams) : new C0498c(layoutParams);
        if (cVar.f2012b <= 0) {
            cVar.f2012b = 16;
        }
        return cVar;
    }

    public Menu getMenu() {
        if (this.f1842p == null) {
            Context context = getContext();
            this.f1842p = new C0468l(context);
            this.f1842p.mo2060a((C0469a) new C0499d());
            this.f1846t = new C0577g(context);
            this.f1846t.mo3062c(true);
            C0577g gVar = this.f1846t;
            C0486a aVar = this.f1847u;
            if (aVar == null) {
                aVar = new C0497b();
            }
            gVar.mo2044a(aVar);
            this.f1842p.mo2192a((C0485v) this.f1846t, this.f1843q);
            this.f1846t.mo3060a(this);
        }
        return this.f1842p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1846t.mo3064d();
    }

    public int getPopupTheme() {
        return this.f1844r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public boolean mo2513h() {
        C0577g gVar = this.f1846t;
        return gVar != null && gVar.mo3069i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0577g gVar = this.f1846t;
        if (gVar != null) {
            gVar.mo2047a(false);
            if (this.f1846t.mo3068h()) {
                this.f1846t.mo3065e();
                this.f1846t.mo3069i();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo2495a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f1849w) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0521Ja.m2525a(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0498c cVar = (C0498c) childAt.getLayoutParams();
                if (cVar.f1853c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo2501d(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + cVar.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    boolean d = mo2501d(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                C0498c cVar2 = (C0498c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1853c) {
                    int i19 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i6++;
            }
        } else {
            int paddingLeft = getPaddingLeft();
            while (i6 < childCount) {
                View childAt4 = getChildAt(i6);
                C0498c cVar3 = (C0498c) childAt4.getLayoutParams();
                if (childAt4.getVisibility() != 8 && !cVar3.f1853c) {
                    int i21 = paddingLeft + cVar3.leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i22 = i9 - (measuredHeight4 / 2);
                    childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                    paddingLeft = i21 + measuredWidth4 + cVar3.rightMargin + max;
                }
                i6++;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z = this.f1849w;
        this.f1849w = MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f1849w) {
            this.f1850x = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (this.f1849w) {
            C0468l lVar = this.f1842p;
            if (!(lVar == null || size == this.f1850x)) {
                this.f1850x = size;
                lVar.mo2211b(true);
            }
        }
        int childCount = getChildCount();
        if (!this.f1849w || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0498c cVar = (C0498c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m2381e(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1846t.mo3061b(z);
    }

    public void setOnMenuItemClickListener(C0500e eVar) {
        this.f1841A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1846t.mo3059a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f1845s = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1844r != i) {
            this.f1844r = i;
            if (i == 0) {
                this.f1843q = getContext();
            } else {
                this.f1843q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0577g gVar) {
        this.f1846t = gVar;
        this.f1846t.mo3060a(this);
    }
}
