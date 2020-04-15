package com.facebook.react.views.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStructure;
import android.view.animation.Animation;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.i18nmanager.C1489a;
import com.facebook.react.uimanager.C1567C;
import com.facebook.react.uimanager.C1573I;
import com.facebook.react.uimanager.C1574J;
import com.facebook.react.uimanager.C1575K;
import com.facebook.react.uimanager.C1685k;
import com.facebook.react.uimanager.C1688la;
import com.facebook.react.uimanager.C1702p;
import com.facebook.react.uimanager.C1727x;
import com.facebook.react.uimanager.C1728y;
import com.facebook.react.uimanager.C1729z;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p098m.p107g.C1210b;
import p032c.p033a.p098m.p107g.C1211c;
import p032c.p033a.p098m.p107g.C1212d;

/* renamed from: com.facebook.react.views.view.h */
public class C1886h extends ViewGroup implements C1212d, C1728y, C1567C, C1211c, C1573I {

    /* renamed from: a */
    private static final LayoutParams f5627a = new LayoutParams(0, 0);

    /* renamed from: b */
    private static final Rect f5628b = new Rect();

    /* renamed from: c */
    private boolean f5629c = false;

    /* renamed from: d */
    private View[] f5630d = null;

    /* renamed from: e */
    private int f5631e;

    /* renamed from: f */
    private Rect f5632f;

    /* renamed from: g */
    private Rect f5633g;

    /* renamed from: h */
    private String f5634h;

    /* renamed from: i */
    private C1727x f5635i = C1727x.AUTO;

    /* renamed from: j */
    private C1887a f5636j;

    /* renamed from: k */
    private C1881e f5637k;

    /* renamed from: l */
    private C1210b f5638l;

    /* renamed from: m */
    private boolean f5639m = false;

    /* renamed from: n */
    private final C1688la f5640n;

    /* renamed from: o */
    private Path f5641o;

    /* renamed from: p */
    private int f5642p;

    /* renamed from: q */
    private float f5643q = 1.0f;

    /* renamed from: r */
    private String f5644r = "visible";

    /* renamed from: com.facebook.react.views.view.h$a */
    private static final class C1887a implements OnLayoutChangeListener {

        /* renamed from: a */
        private final C1886h f5645a;

        private C1887a(C1886h hVar) {
            this.f5645a = hVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f5645a.getRemoveClippedSubviews()) {
                this.f5645a.m7173c(view);
            }
        }
    }

    public C1886h(Context context) {
        super(context);
        setClipChildren(false);
        this.f5640n = new C1688la(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0136, code lost:
        if (com.facebook.yoga.C1943a.m7432a(r10) == false) goto L_0x0138;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01d5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7165a(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = r0.f5634h
            if (r2 == 0) goto L_0x01e5
            r3 = -1
            int r4 = r2.hashCode()
            r5 = -1217487446(0xffffffffb76e9daa, float:-1.42226145E-5)
            r7 = 1
            if (r4 == r5) goto L_0x0023
            r5 = 466743410(0x1bd1f072, float:3.4731534E-22)
            if (r4 == r5) goto L_0x0019
            goto L_0x002c
        L_0x0019:
            java.lang.String r4 = "visible"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x002c
            r3 = 0
            goto L_0x002c
        L_0x0023:
            java.lang.String r4 = "hidden"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x002c
            r3 = 1
        L_0x002c:
            if (r3 == 0) goto L_0x01de
            if (r3 == r7) goto L_0x0032
            goto L_0x01e5
        L_0x0032:
            int r2 = r19.getWidth()
            float r2 = (float) r2
            int r3 = r19.getHeight()
            float r3 = (float) r3
            com.facebook.react.views.view.e r4 = r0.f5637k
            r5 = 0
            if (r4 == 0) goto L_0x01cd
            android.graphics.RectF r4 = r4.mo6671b()
            float r8 = r4.top
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x0061
            float r8 = r4.left
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x0061
            float r8 = r4.bottom
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x0061
            float r8 = r4.right
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            r8 = 0
            r9 = 0
            goto L_0x006d
        L_0x0061:
            float r8 = r4.left
            float r8 = r8 + r5
            float r9 = r4.top
            float r9 = r9 + r5
            float r10 = r4.right
            float r2 = r2 - r10
            float r10 = r4.bottom
            float r3 = r3 - r10
        L_0x006d:
            com.facebook.react.views.view.e r10 = r0.f5637k
            float r10 = r10.mo6674c()
            com.facebook.react.views.view.e r11 = r0.f5637k
            com.facebook.react.views.view.e$a r12 = com.facebook.react.views.view.C1881e.C1882a.TOP_LEFT
            float r11 = r11.mo6663a(r10, r12)
            com.facebook.react.views.view.e r12 = r0.f5637k
            com.facebook.react.views.view.e$a r13 = com.facebook.react.views.view.C1881e.C1882a.TOP_RIGHT
            float r12 = r12.mo6663a(r10, r13)
            com.facebook.react.views.view.e r13 = r0.f5637k
            com.facebook.react.views.view.e$a r14 = com.facebook.react.views.view.C1881e.C1882a.BOTTOM_LEFT
            float r13 = r13.mo6663a(r10, r14)
            com.facebook.react.views.view.e r14 = r0.f5637k
            com.facebook.react.views.view.e$a r15 = com.facebook.react.views.view.C1881e.C1882a.BOTTOM_RIGHT
            float r10 = r14.mo6663a(r10, r15)
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 17
            if (r14 < r15) goto L_0x013c
            int r14 = r0.f5642p
            if (r14 != r7) goto L_0x009f
            r14 = 1
            goto L_0x00a0
        L_0x009f:
            r14 = 0
        L_0x00a0:
            com.facebook.react.views.view.e r15 = r0.f5637k
            com.facebook.react.views.view.e$a r7 = com.facebook.react.views.view.C1881e.C1882a.TOP_START
            float r7 = r15.mo6664a(r7)
            com.facebook.react.views.view.e r15 = r0.f5637k
            com.facebook.react.views.view.e$a r6 = com.facebook.react.views.view.C1881e.C1882a.TOP_END
            float r6 = r15.mo6664a(r6)
            com.facebook.react.views.view.e r15 = r0.f5637k
            com.facebook.react.views.view.e$a r5 = com.facebook.react.views.view.C1881e.C1882a.BOTTOM_START
            float r5 = r15.mo6664a(r5)
            com.facebook.react.views.view.e r15 = r0.f5637k
            r17 = r10
            com.facebook.react.views.view.e$a r10 = com.facebook.react.views.view.C1881e.C1882a.BOTTOM_END
            float r10 = r15.mo6664a(r10)
            com.facebook.react.modules.i18nmanager.a r15 = com.facebook.react.modules.i18nmanager.C1489a.m5938a()
            r18 = r11
            android.content.Context r11 = r19.getContext()
            boolean r11 = r15.mo5392a(r11)
            if (r11 == 0) goto L_0x010b
            boolean r11 = com.facebook.yoga.C1943a.m7432a(r7)
            if (r11 == 0) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            r18 = r7
        L_0x00db:
            boolean r7 = com.facebook.yoga.C1943a.m7432a(r6)
            if (r7 == 0) goto L_0x00e2
            r6 = r12
        L_0x00e2:
            boolean r7 = com.facebook.yoga.C1943a.m7432a(r5)
            if (r7 == 0) goto L_0x00e9
            r5 = r13
        L_0x00e9:
            boolean r7 = com.facebook.yoga.C1943a.m7432a(r10)
            if (r7 == 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            r17 = r10
        L_0x00f2:
            if (r14 == 0) goto L_0x00f6
            r11 = r6
            goto L_0x00f8
        L_0x00f6:
            r11 = r18
        L_0x00f8:
            if (r14 == 0) goto L_0x00fd
            r12 = r18
            goto L_0x00fe
        L_0x00fd:
            r12 = r6
        L_0x00fe:
            if (r14 == 0) goto L_0x0103
            r13 = r17
            goto L_0x0104
        L_0x0103:
            r13 = r5
        L_0x0104:
            if (r14 == 0) goto L_0x0108
            r10 = r5
            goto L_0x0138
        L_0x0108:
            r10 = r17
            goto L_0x0138
        L_0x010b:
            if (r14 == 0) goto L_0x010f
            r11 = r6
            goto L_0x0110
        L_0x010f:
            r11 = r7
        L_0x0110:
            if (r14 == 0) goto L_0x0113
            r6 = r7
        L_0x0113:
            if (r14 == 0) goto L_0x0117
            r7 = r10
            goto L_0x0118
        L_0x0117:
            r7 = r5
        L_0x0118:
            if (r14 == 0) goto L_0x011b
            r10 = r5
        L_0x011b:
            boolean r5 = com.facebook.yoga.C1943a.m7432a(r11)
            if (r5 != 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r11 = r18
        L_0x0124:
            boolean r5 = com.facebook.yoga.C1943a.m7432a(r6)
            if (r5 != 0) goto L_0x012b
            r12 = r6
        L_0x012b:
            boolean r5 = com.facebook.yoga.C1943a.m7432a(r7)
            if (r5 != 0) goto L_0x0132
            r13 = r7
        L_0x0132:
            boolean r5 = com.facebook.yoga.C1943a.m7432a(r10)
            if (r5 != 0) goto L_0x013a
        L_0x0138:
            r17 = r10
        L_0x013a:
            r5 = 0
            goto L_0x0140
        L_0x013c:
            r17 = r10
            r18 = r11
        L_0x0140:
            int r6 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r6 > 0) goto L_0x0150
            int r6 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r6 > 0) goto L_0x0150
            int r6 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r6 > 0) goto L_0x0150
            int r6 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x01d1
        L_0x0150:
            android.graphics.Path r5 = r0.f5641o
            if (r5 != 0) goto L_0x015b
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            r0.f5641o = r5
        L_0x015b:
            android.graphics.Path r5 = r0.f5641o
            r5.rewind()
            android.graphics.Path r5 = r0.f5641o
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r8, r9, r2, r3)
            r7 = 8
            float[] r7 = new float[r7]
            float r10 = r4.left
            float r10 = r11 - r10
            r14 = 0
            float r10 = java.lang.Math.max(r10, r14)
            r15 = 0
            r7[r15] = r10
            float r10 = r4.top
            float r11 = r11 - r10
            float r10 = java.lang.Math.max(r11, r14)
            r16 = 1
            r7[r16] = r10
            r10 = 2
            float r11 = r4.right
            float r11 = r12 - r11
            float r11 = java.lang.Math.max(r11, r14)
            r7[r10] = r11
            r10 = 3
            float r11 = r4.top
            float r12 = r12 - r11
            float r11 = java.lang.Math.max(r12, r14)
            r7[r10] = r11
            r10 = 4
            float r11 = r4.right
            float r11 = r17 - r11
            float r11 = java.lang.Math.max(r11, r14)
            r7[r10] = r11
            r10 = 5
            float r11 = r4.bottom
            float r11 = r17 - r11
            float r11 = java.lang.Math.max(r11, r14)
            r7[r10] = r11
            r10 = 6
            float r11 = r4.left
            float r11 = r13 - r11
            float r11 = java.lang.Math.max(r11, r14)
            r7[r10] = r11
            r10 = 7
            float r4 = r4.bottom
            float r13 = r13 - r4
            float r4 = java.lang.Math.max(r13, r14)
            r7[r10] = r4
            android.graphics.Path$Direction r4 = android.graphics.Path.Direction.CW
            r5.addRoundRect(r6, r7, r4)
            android.graphics.Path r4 = r0.f5641o
            r1.clipPath(r4)
            goto L_0x01d3
        L_0x01cd:
            r14 = 0
            r15 = 0
            r8 = 0
            r9 = 0
        L_0x01d1:
            r16 = 0
        L_0x01d3:
            if (r16 != 0) goto L_0x01e5
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r8, r9, r2, r3)
            r1.clipRect(r4)
            goto L_0x01e5
        L_0x01de:
            android.graphics.Path r1 = r0.f5641o
            if (r1 == 0) goto L_0x01e5
            r1.rewind()
        L_0x01e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.C1886h.m7165a(android.graphics.Canvas):void");
    }

    /* renamed from: a */
    private void m7166a(Rect rect, int i, int i2) {
        View[] viewArr = this.f5630d;
        C1136a.m5053a(viewArr);
        View view = viewArr[i];
        f5628b.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        Rect rect2 = f5628b;
        boolean intersects = rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
        Animation animation = view.getAnimation();
        boolean z = true;
        boolean z2 = animation != null && !animation.hasEnded();
        if (!intersects && view.getParent() != null && !z2) {
            super.removeViewsInLayout(i - i2, 1);
        } else if (intersects && view.getParent() == null) {
            super.addViewInLayout(view, i - i2, f5627a, true);
            invalidate();
        } else if (!intersects) {
            z = false;
        }
        if (z && (view instanceof C1728y)) {
            C1728y yVar = (C1728y) view;
            if (yVar.getRemoveClippedSubviews()) {
                yVar.mo6018a();
            }
        }
    }

    /* renamed from: a */
    private void m7167a(Drawable drawable) {
        super.setBackground(drawable);
    }

    /* renamed from: b */
    private int m7169b(View view) {
        int i = this.f5631e;
        View[] viewArr = this.f5630d;
        C1136a.m5053a(viewArr);
        View[] viewArr2 = viewArr;
        for (int i2 = 0; i2 < i; i2++) {
            if (viewArr2[i2] == view) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private void m7170b(Rect rect) {
        C1136a.m5053a(this.f5630d);
        int i = 0;
        for (int i2 = 0; i2 < this.f5631e; i2++) {
            m7166a(rect, i2, i);
            if (this.f5630d[i2].getParent() == null) {
                i++;
            }
        }
    }

    /* renamed from: b */
    private void m7171b(View view, int i) {
        View[] viewArr = this.f5630d;
        C1136a.m5053a(viewArr);
        View[] viewArr2 = viewArr;
        int i2 = this.f5631e;
        int length = viewArr2.length;
        if (i == i2) {
            if (length == i2) {
                this.f5630d = new View[(length + 12)];
                System.arraycopy(viewArr2, 0, this.f5630d, 0, length);
                viewArr2 = this.f5630d;
            }
            int i3 = this.f5631e;
            this.f5631e = i3 + 1;
            viewArr2[i3] = view;
        } else if (i < i2) {
            if (length == i2) {
                this.f5630d = new View[(length + 12)];
                System.arraycopy(viewArr2, 0, this.f5630d, 0, i);
                System.arraycopy(viewArr2, i, this.f5630d, i + 1, i2 - i);
                viewArr2 = this.f5630d;
            } else {
                System.arraycopy(viewArr2, i, viewArr2, i + 1, i2 - i);
            }
            viewArr2[i] = view;
            this.f5631e++;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("index=");
            sb.append(i);
            sb.append(" count=");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    /* renamed from: c */
    private void m7172c(int i) {
        View[] viewArr = this.f5630d;
        C1136a.m5053a(viewArr);
        View[] viewArr2 = viewArr;
        int i2 = this.f5631e;
        if (i == i2 - 1) {
            int i3 = i2 - 1;
            this.f5631e = i3;
            viewArr2[i3] = null;
        } else if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        } else {
            System.arraycopy(viewArr2, i + 1, viewArr2, i, (i2 - i) - 1);
            int i4 = this.f5631e - 1;
            this.f5631e = i4;
            viewArr2[i4] = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m7173c(View view) {
        if (this.f5629c && getParent() != null) {
            C1136a.m5053a(this.f5632f);
            C1136a.m5053a(this.f5630d);
            f5628b.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            Rect rect = this.f5632f;
            Rect rect2 = f5628b;
            if (rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom) != (view.getParent() != null)) {
                int i = 0;
                for (int i2 = 0; i2 < this.f5631e; i2++) {
                    View[] viewArr = this.f5630d;
                    if (viewArr[i2] == view) {
                        m7166a(this.f5632f, i2, i);
                        return;
                    }
                    if (viewArr[i2].getParent() == null) {
                        i++;
                    }
                }
            }
        }
    }

    private C1881e getOrCreateReactViewBackground() {
        if (this.f5637k == null) {
            this.f5637k = new C1881e(getContext());
            Drawable background = getBackground();
            m7167a((Drawable) null);
            if (background == null) {
                m7167a((Drawable) this.f5637k);
            } else {
                m7167a((Drawable) new LayerDrawable(new Drawable[]{this.f5637k, background}));
            }
            if (VERSION.SDK_INT >= 17) {
                this.f5642p = C1489a.m5938a().mo5394b(getContext()) ? 1 : 0;
                this.f5637k.mo6675c(this.f5642p);
            }
        }
        return this.f5637k;
    }

    /* renamed from: a */
    public int mo5679a(int i) {
        return this.f5640n.mo5950a() ? this.f5640n.mo5948a(getChildCount(), i) : i;
    }

    /* renamed from: a */
    public void mo6018a() {
        if (this.f5629c) {
            C1136a.m5053a(this.f5632f);
            C1136a.m5053a(this.f5630d);
            C1729z.m6673a(this, this.f5632f);
            m7170b(this.f5632f);
        }
    }

    /* renamed from: a */
    public void mo6692a(float f, int i) {
        C1881e orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.mo6672b(f, i);
        if (VERSION.SDK_INT < 18) {
            int i2 = orCreateReactViewBackground.mo6679f() ? 1 : 2;
            if (i2 != getLayerType()) {
                setLayerType(i2, null);
            }
        }
    }

    /* renamed from: a */
    public void mo6693a(int i, float f) {
        getOrCreateReactViewBackground().mo6667a(i, f);
    }

    /* renamed from: a */
    public void mo6694a(int i, float f, float f2) {
        getOrCreateReactViewBackground().mo6668a(i, f, f2);
    }

    /* renamed from: a */
    public void mo6019a(Rect rect) {
        rect.set(this.f5632f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6695a(View view) {
        C1136a.m5055a(this.f5629c);
        C1136a.m5053a(this.f5632f);
        C1136a.m5053a(this.f5630d);
        view.removeOnLayoutChangeListener(this.f5636j);
        int b = m7169b(view);
        if (this.f5630d[b].getParent() != null) {
            int i = 0;
            for (int i2 = 0; i2 < b; i2++) {
                if (this.f5630d[i2].getParent() == null) {
                    i++;
                }
            }
            super.removeViewsInLayout(b - i, 1);
        }
        m7172c(b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6696a(View view, int i) {
        mo6697a(view, i, f5627a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6697a(View view, int i, LayoutParams layoutParams) {
        C1136a.m5055a(this.f5629c);
        C1136a.m5053a(this.f5632f);
        C1136a.m5053a(this.f5630d);
        m7171b(view, i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.f5630d[i3].getParent() == null) {
                i2++;
            }
        }
        m7166a(this.f5632f, i, i2);
        view.addOnLayoutChangeListener(this.f5636j);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        this.f5640n.mo5949a(view);
        setChildrenDrawingOrderEnabled(this.f5640n.mo5950a());
        super.addView(view, i, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo6699b(int i) {
        View[] viewArr = this.f5630d;
        C1136a.m5053a(viewArr);
        return viewArr[i];
    }

    /* renamed from: b */
    public void mo5680b() {
        this.f5640n.mo5951b();
        setChildrenDrawingOrderEnabled(this.f5640n.mo5950a());
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo6700c() {
        C1136a.m5055a(this.f5629c);
        C1136a.m5053a(this.f5630d);
        for (int i = 0; i < this.f5631e; i++) {
            this.f5630d[i].removeOnLayoutChangeListener(this.f5636j);
        }
        removeAllViewsInLayout();
        this.f5631e = 0;
    }

    /* renamed from: d */
    public void mo6701d() {
        float f;
        if (!this.f5644r.equals("visible")) {
            float rotationX = getRotationX();
            float rotationY = getRotationY();
            if (!(rotationX >= -90.0f && rotationX < 90.0f && rotationY >= -90.0f && rotationY < 90.0f)) {
                f = 0.0f;
                setAlpha(f);
            }
        }
        f = this.f5643q;
        setAlpha(f);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        try {
            m7165a(canvas);
            super.dispatchDraw(canvas);
        } catch (NullPointerException e) {
            C0727a.m3267a("ReactNative", "NullPointerException when executing ViewGroup.dispatchDraw method", (Throwable) e);
        } catch (StackOverflowError e2) {
            C1574J a = C1575K.m6250a(this);
            if (a != null) {
                a.mo4477a((Throwable) e2);
            } else if (getContext() instanceof ReactContext) {
                ((ReactContext) getContext()).handleException(new C1685k("StackOverflowException", this, e2));
            } else {
                throw e2;
            }
        }
    }

    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e) {
            C0727a.m3267a("ReactNative", "NullPointerException when executing dispatchProvideStructure", (Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchSetPressed(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    public int getAllChildrenCount() {
        return this.f5631e;
    }

    public int getBackgroundColor() {
        if (getBackground() != null) {
            return ((C1881e) getBackground()).mo6665a();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        return this.f5640n.mo5948a(i, i2);
    }

    public Rect getHitSlopRect() {
        return this.f5633g;
    }

    public String getOverflow() {
        return this.f5634h;
    }

    public C1727x getPointerEvents() {
        return this.f5635i;
    }

    public boolean getRemoveClippedSubviews() {
        return this.f5629c;
    }

    public boolean hasOverlappingRendering() {
        return this.f5639m;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5629c) {
            mo6018a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C1210b bVar = this.f5638l;
        if (bVar != null && bVar.mo4548a(this, motionEvent)) {
            return true;
        }
        C1727x xVar = this.f5635i;
        if (xVar == C1727x.NONE || xVar == C1727x.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C1702p.m6587a(i, i2);
        setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
    }

    public void onRtlPropertiesChanged(int i) {
        if (VERSION.SDK_INT >= 17) {
            C1881e eVar = this.f5637k;
            if (eVar != null) {
                eVar.mo6675c(this.f5642p);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f5629c) {
            mo6018a();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C1727x xVar = this.f5635i;
        return (xVar == C1727x.NONE || xVar == C1727x.BOX_NONE) ? false : true;
    }

    public void removeView(View view) {
        this.f5640n.mo5952b(view);
        setChildrenDrawingOrderEnabled(this.f5640n.mo5950a());
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        this.f5640n.mo5952b(getChildAt(i));
        setChildrenDrawingOrderEnabled(this.f5640n.mo5950a());
        super.removeViewAt(i);
    }

    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    public void setBackfaceVisibility(String str) {
        this.f5644r = str;
        mo6701d();
    }

    public void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
    }

    public void setBackgroundColor(int i) {
        if (i != 0 || this.f5637k != null) {
            getOrCreateReactViewBackground().mo6673b(i);
        }
    }

    public void setBorderRadius(float f) {
        C1881e orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.mo6666a(f);
        if (VERSION.SDK_INT < 18) {
            int i = orCreateReactViewBackground.mo6679f() ? 1 : 2;
            if (i != getLayerType()) {
                setLayerType(i, null);
            }
        }
    }

    public void setBorderStyle(String str) {
        getOrCreateReactViewBackground().mo6669a(str);
    }

    public void setHitSlopRect(Rect rect) {
        this.f5633g = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.f5639m = z;
    }

    public void setOnInterceptTouchEventListener(C1210b bVar) {
        this.f5638l = bVar;
    }

    public void setOpacityIfPossible(float f) {
        this.f5643q = f;
        mo6701d();
    }

    public void setOverflow(String str) {
        this.f5634h = str;
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    public void setPointerEvents(C1727x xVar) {
        this.f5635i = xVar;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z != this.f5629c) {
            this.f5629c = z;
            if (z) {
                this.f5632f = new Rect();
                C1729z.m6673a(this, this.f5632f);
                this.f5631e = getChildCount();
                this.f5630d = new View[Math.max(12, this.f5631e)];
                this.f5636j = new C1887a();
                for (int i = 0; i < this.f5631e; i++) {
                    View childAt = getChildAt(i);
                    this.f5630d[i] = childAt;
                    childAt.addOnLayoutChangeListener(this.f5636j);
                }
                mo6018a();
            } else {
                C1136a.m5053a(this.f5632f);
                C1136a.m5053a(this.f5630d);
                C1136a.m5053a(this.f5636j);
                for (int i2 = 0; i2 < this.f5631e; i2++) {
                    this.f5630d[i2].removeOnLayoutChangeListener(this.f5636j);
                }
                getDrawingRect(this.f5632f);
                m7170b(this.f5632f);
                this.f5630d = null;
                this.f5632f = null;
                this.f5631e = 0;
                this.f5636j = null;
            }
        }
    }

    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        m7167a((Drawable) null);
        C1881e eVar = this.f5637k;
        if (eVar != null && drawable != null) {
            m7167a((Drawable) new LayerDrawable(new Drawable[]{eVar, drawable}));
        } else if (drawable != null) {
            m7167a(drawable);
        }
    }
}
