package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import com.facebook.react.modules.i18nmanager.C1489a;
import com.facebook.react.uimanager.C1577M;
import com.facebook.react.uimanager.C1681i;
import com.facebook.yoga.C1943a;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.react.views.view.e */
public class C1881e extends Drawable {

    /* renamed from: a */
    private C1577M f5586a;

    /* renamed from: b */
    private C1577M f5587b;

    /* renamed from: c */
    private C1577M f5588c;

    /* renamed from: d */
    private C1883b f5589d;

    /* renamed from: e */
    private PathEffect f5590e;

    /* renamed from: f */
    private Path f5591f;

    /* renamed from: g */
    private Path f5592g;

    /* renamed from: h */
    private Path f5593h;

    /* renamed from: i */
    private Path f5594i;

    /* renamed from: j */
    private Path f5595j;

    /* renamed from: k */
    private RectF f5596k;

    /* renamed from: l */
    private RectF f5597l;

    /* renamed from: m */
    private RectF f5598m;

    /* renamed from: n */
    private RectF f5599n;

    /* renamed from: o */
    private PointF f5600o;

    /* renamed from: p */
    private PointF f5601p;

    /* renamed from: q */
    private PointF f5602q;

    /* renamed from: r */
    private PointF f5603r;

    /* renamed from: s */
    private boolean f5604s = false;

    /* renamed from: t */
    private float f5605t = Float.NaN;

    /* renamed from: u */
    private final Paint f5606u = new Paint(1);

    /* renamed from: v */
    private int f5607v = 0;

    /* renamed from: w */
    private int f5608w = 255;

    /* renamed from: x */
    private float[] f5609x;

    /* renamed from: y */
    private final Context f5610y;

    /* renamed from: z */
    private int f5611z;

    /* renamed from: com.facebook.react.views.view.e$a */
    public enum C1882a {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    /* renamed from: com.facebook.react.views.view.e$b */
    private enum C1883b {
        SOLID,
        DASHED,
        DOTTED;

        /* renamed from: a */
        public static PathEffect m7157a(C1883b bVar, float f) {
            int i = C1880d.f5585a[bVar.ordinal()];
            if (i == 1) {
                return null;
            }
            if (i == 2) {
                float f2 = f * 3.0f;
                return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
            } else if (i != 3) {
                return null;
            } else {
                return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
            }
        }
    }

    public C1881e(Context context) {
        this.f5610y = context;
    }

    /* renamed from: a */
    private static int m7128a(float f, float f2) {
        return ((((int) f) << 24) & -16777216) | (((int) f2) & 16777215);
    }

    /* renamed from: a */
    private static int m7129a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = -1;
        int i10 = (i > 0 ? i5 : -1) & (i2 > 0 ? i6 : -1) & (i3 > 0 ? i7 : -1);
        if (i4 > 0) {
            i9 = i8;
        }
        int i11 = i9 & i10;
        if (i <= 0) {
            i5 = 0;
        }
        if (i2 <= 0) {
            i6 = 0;
        }
        int i12 = i5 | i6;
        if (i3 <= 0) {
            i7 = 0;
        }
        int i13 = i12 | i7;
        if (i4 <= 0) {
            i8 = 0;
        }
        if (i11 == (i13 | i8)) {
            return i11;
        }
        return 0;
    }

    /* renamed from: a */
    private static void m7130a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        PointF pointF2 = pointF;
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double d13 = d8 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        double d14 = (d13 - d12) / ((d7 - d9) - d11);
        double d15 = d12 - (d11 * d14);
        double d16 = abs2 * abs2;
        double d17 = abs * abs;
        double d18 = d16 + (d17 * d14 * d14);
        double d19 = abs * 2.0d * abs * d15 * d14;
        double d20 = (-(d17 * ((d15 * d15) - d16))) / d18;
        double d21 = d18 * 2.0d;
        double sqrt = ((-d19) / d21) - Math.sqrt(d20 + Math.pow(d19 / d21, 2.0d));
        double d22 = sqrt + d9;
        double d23 = (d14 * sqrt) + d15 + d10;
        if (!Double.isNaN(d22) && !Double.isNaN(d23)) {
            PointF pointF3 = pointF;
            pointF3.x = (float) d22;
            pointF3.y = (float) d23;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7131a(android.graphics.Canvas r25) {
        /*
            r24 = this;
            r11 = r24
            int r0 = r11.f5607v
            int r1 = r11.f5608w
            int r0 = com.facebook.react.views.view.C1877a.m7125a(r0, r1)
            int r1 = android.graphics.Color.alpha(r0)
            if (r1 == 0) goto L_0x0028
            android.graphics.Paint r1 = r11.f5606u
            r1.setColor(r0)
            android.graphics.Paint r0 = r11.f5606u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Rect r0 = r24.getBounds()
            android.graphics.Paint r1 = r11.f5606u
            r12 = r25
            r12.drawRect(r0, r1)
            goto L_0x002a
        L_0x0028:
            r12 = r25
        L_0x002a:
            android.graphics.RectF r0 = r24.mo6671b()
            float r1 = r0.left
            int r13 = java.lang.Math.round(r1)
            float r1 = r0.top
            int r14 = java.lang.Math.round(r1)
            float r1 = r0.right
            int r15 = java.lang.Math.round(r1)
            float r0 = r0.bottom
            int r16 = java.lang.Math.round(r0)
            if (r13 > 0) goto L_0x004e
            if (r15 > 0) goto L_0x004e
            if (r14 > 0) goto L_0x004e
            if (r16 <= 0) goto L_0x0137
        L_0x004e:
            android.graphics.Rect r0 = r24.getBounds()
            r1 = 0
            int r2 = r11.m7136d(r1)
            r10 = 1
            int r17 = r11.m7136d(r10)
            r3 = 2
            int r3 = r11.m7136d(r3)
            r4 = 3
            int r18 = r11.m7136d(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 17
            if (r4 < r5) goto L_0x00cb
            int r4 = r24.mo6678e()
            if (r4 != r10) goto L_0x0074
            r4 = 1
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            r5 = 4
            int r6 = r11.m7136d(r5)
            r7 = 5
            int r8 = r11.m7136d(r7)
            com.facebook.react.modules.i18nmanager.a r9 = com.facebook.react.modules.i18nmanager.C1489a.m5938a()
            android.content.Context r10 = r11.f5610y
            boolean r9 = r9.mo5392a(r10)
            if (r9 == 0) goto L_0x00a8
            boolean r5 = r11.m7137e(r5)
            if (r5 != 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r2 = r6
        L_0x0093:
            boolean r5 = r11.m7137e(r7)
            if (r5 != 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r3 = r8
        L_0x009b:
            if (r4 == 0) goto L_0x009f
            r5 = r3
            goto L_0x00a0
        L_0x009f:
            r5 = r2
        L_0x00a0:
            if (r4 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r2 = r3
        L_0x00a4:
            r19 = r2
            r10 = r5
            goto L_0x00ce
        L_0x00a8:
            if (r4 == 0) goto L_0x00ac
            r9 = r8
            goto L_0x00ad
        L_0x00ac:
            r9 = r6
        L_0x00ad:
            if (r4 == 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r6 = r8
        L_0x00b1:
            boolean r5 = r11.m7137e(r5)
            boolean r7 = r11.m7137e(r7)
            if (r4 == 0) goto L_0x00bd
            r8 = r7
            goto L_0x00be
        L_0x00bd:
            r8 = r5
        L_0x00be:
            if (r4 == 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r5 = r7
        L_0x00c2:
            if (r8 == 0) goto L_0x00c5
            r2 = r9
        L_0x00c5:
            if (r5 == 0) goto L_0x00cb
            r10 = r2
            r19 = r6
            goto L_0x00ce
        L_0x00cb:
            r10 = r2
            r19 = r3
        L_0x00ce:
            int r9 = r0.left
            int r8 = r0.top
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r10
            r7 = r17
            r1 = r8
            r8 = r19
            r12 = r9
            r9 = r18
            int r2 = m7129a(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r2 == 0) goto L_0x013a
            int r3 = android.graphics.Color.alpha(r2)
            if (r3 == 0) goto L_0x0137
            int r8 = r0.right
            int r0 = r0.bottom
            android.graphics.Paint r3 = r11.f5606u
            r3.setColor(r2)
            if (r13 <= 0) goto L_0x0106
            int r9 = r12 + r13
            float r3 = (float) r12
            float r4 = (float) r1
            float r5 = (float) r9
            int r2 = r0 - r16
            float r6 = (float) r2
            android.graphics.Paint r7 = r11.f5606u
            r2 = r25
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0106:
            if (r14 <= 0) goto L_0x0117
            int r2 = r1 + r14
            int r9 = r12 + r13
            float r3 = (float) r9
            float r4 = (float) r1
            float r5 = (float) r8
            float r6 = (float) r2
            android.graphics.Paint r7 = r11.f5606u
            r2 = r25
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0117:
            if (r15 <= 0) goto L_0x0127
            int r2 = r8 - r15
            float r3 = (float) r2
            int r1 = r1 + r14
            float r4 = (float) r1
            float r5 = (float) r8
            float r6 = (float) r0
            android.graphics.Paint r7 = r11.f5606u
            r2 = r25
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0127:
            if (r16 <= 0) goto L_0x0137
            int r1 = r0 - r16
            float r3 = (float) r12
            float r4 = (float) r1
            int r8 = r8 - r15
            float r5 = (float) r8
            float r6 = (float) r0
            android.graphics.Paint r7 = r11.f5606u
            r2 = r25
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0137:
            r0 = r11
            goto L_0x01cb
        L_0x013a:
            android.graphics.Paint r2 = r11.f5606u
            r3 = 0
            r2.setAntiAlias(r3)
            int r20 = r0.width()
            int r21 = r0.height()
            if (r13 <= 0) goto L_0x016e
            float r9 = (float) r12
            float r4 = (float) r1
            int r0 = r12 + r13
            float r7 = (float) r0
            int r8 = r1 + r14
            float r6 = (float) r8
            int r8 = r1 + r21
            int r0 = r8 - r16
            float r5 = (float) r0
            float r8 = (float) r8
            r0 = r24
            r3 = r1
            r1 = r25
            r2 = r10
            r10 = r3
            r3 = r9
            r22 = r5
            r5 = r7
            r23 = r8
            r8 = r22
            r11 = r10
            r10 = r23
            r0.m7132a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x016f
        L_0x016e:
            r11 = r1
        L_0x016f:
            if (r14 <= 0) goto L_0x018a
            float r3 = (float) r12
            float r10 = (float) r11
            int r9 = r12 + r13
            float r5 = (float) r9
            int r8 = r11 + r14
            float r8 = (float) r8
            int r9 = r12 + r20
            int r0 = r9 - r15
            float r7 = (float) r0
            float r9 = (float) r9
            r0 = r24
            r1 = r25
            r2 = r17
            r4 = r10
            r6 = r8
            r0.m7132a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x018a:
            if (r15 <= 0) goto L_0x01a6
            int r9 = r12 + r20
            float r5 = (float) r9
            float r4 = (float) r11
            int r8 = r11 + r21
            float r6 = (float) r8
            int r9 = r9 - r15
            float r9 = (float) r9
            int r8 = r8 - r16
            float r8 = (float) r8
            int r0 = r11 + r14
            float r10 = (float) r0
            r0 = r24
            r1 = r25
            r2 = r19
            r3 = r5
            r7 = r9
            r0.m7132a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x01a6:
            if (r16 <= 0) goto L_0x01c3
            float r3 = (float) r12
            int r8 = r11 + r21
            float r6 = (float) r8
            int r9 = r12 + r20
            float r5 = (float) r9
            int r9 = r9 - r15
            float r7 = (float) r9
            int r8 = r8 - r16
            float r10 = (float) r8
            int r9 = r12 + r13
            float r9 = (float) r9
            r0 = r24
            r1 = r25
            r2 = r18
            r4 = r6
            r8 = r10
            r0.m7132a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x01c5
        L_0x01c3:
            r0 = r24
        L_0x01c5:
            android.graphics.Paint r1 = r0.f5606u
            r2 = 1
            r1.setAntiAlias(r2)
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.C1881e.m7131a(android.graphics.Canvas):void");
    }

    /* renamed from: a */
    private void m7132a(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i != 0) {
            if (this.f5594i == null) {
                this.f5594i = new Path();
            }
            this.f5606u.setColor(i);
            this.f5594i.reset();
            this.f5594i.moveTo(f, f2);
            this.f5594i.lineTo(f3, f4);
            this.f5594i.lineTo(f5, f6);
            this.f5594i.lineTo(f7, f8);
            this.f5594i.lineTo(f, f2);
            canvas.drawPath(this.f5594i, this.f5606u);
        }
    }

    /* renamed from: b */
    private void m7133b(int i, float f) {
        if (this.f5588c == null) {
            this.f5588c = new C1577M(255.0f);
        }
        if (!C1681i.m6531a(this.f5588c.mo5691b(i), f)) {
            this.f5588c.mo5690a(i, f);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7134b(android.graphics.Canvas r23) {
        /*
            r22 = this;
            r11 = r22
            r12 = r23
            r22.m7138g()
            r23.save()
            int r0 = r11.f5607v
            int r1 = r11.f5608w
            int r0 = com.facebook.react.views.view.C1877a.m7125a(r0, r1)
            int r1 = android.graphics.Color.alpha(r0)
            if (r1 == 0) goto L_0x002b
            android.graphics.Paint r1 = r11.f5606u
            r1.setColor(r0)
            android.graphics.Paint r0 = r11.f5606u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Path r0 = r11.f5591f
            android.graphics.Paint r1 = r11.f5606u
            r12.drawPath(r0, r1)
        L_0x002b:
            android.graphics.RectF r13 = r22.mo6671b()
            float r0 = r13.top
            r14 = 0
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0048
            float r0 = r13.bottom
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0048
            float r0 = r13.left
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0048
            float r0 = r13.right
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c5
        L_0x0048:
            float r0 = r22.mo6676d()
            float r1 = r13.top
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x008e
            float r1 = r13.bottom
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x008e
            float r1 = r13.left
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x008e
            float r1 = r13.right
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x008e
            int r1 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x01c5
            r1 = 8
            int r1 = r11.m7136d(r1)
            android.graphics.Paint r2 = r11.f5606u
            int r3 = r11.f5608w
            int r1 = com.facebook.react.views.view.C1877a.m7125a(r1, r3)
            r2.setColor(r1)
            android.graphics.Paint r1 = r11.f5606u
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            android.graphics.Paint r1 = r11.f5606u
            r1.setStrokeWidth(r0)
            android.graphics.Path r0 = r11.f5595j
            android.graphics.Paint r1 = r11.f5606u
            r12.drawPath(r0, r1)
            goto L_0x01c5
        L_0x008e:
            android.graphics.Paint r0 = r11.f5606u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Path r0 = r11.f5592g
            android.graphics.Region$Op r1 = android.graphics.Region.Op.INTERSECT
            r12.clipPath(r0, r1)
            android.graphics.Path r0 = r11.f5591f
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r12.clipPath(r0, r1)
            r0 = 0
            int r1 = r11.m7136d(r0)
            r2 = 1
            int r15 = r11.m7136d(r2)
            r3 = 2
            int r3 = r11.m7136d(r3)
            r4 = 3
            int r16 = r11.m7136d(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 17
            if (r4 < r5) goto L_0x0119
            int r4 = r22.mo6678e()
            if (r4 != r2) goto L_0x00c4
            r0 = 1
        L_0x00c4:
            r2 = 4
            int r4 = r11.m7136d(r2)
            r5 = 5
            int r6 = r11.m7136d(r5)
            com.facebook.react.modules.i18nmanager.a r7 = com.facebook.react.modules.i18nmanager.C1489a.m5938a()
            android.content.Context r8 = r11.f5610y
            boolean r7 = r7.mo5392a(r8)
            if (r7 == 0) goto L_0x00f6
            boolean r2 = r11.m7137e(r2)
            if (r2 != 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r1 = r4
        L_0x00e2:
            boolean r2 = r11.m7137e(r5)
            if (r2 != 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r3 = r6
        L_0x00ea:
            if (r0 == 0) goto L_0x00ee
            r2 = r3
            goto L_0x00ef
        L_0x00ee:
            r2 = r1
        L_0x00ef:
            if (r0 == 0) goto L_0x00f2
            goto L_0x00f3
        L_0x00f2:
            r1 = r3
        L_0x00f3:
            r17 = r1
            goto L_0x011c
        L_0x00f6:
            if (r0 == 0) goto L_0x00fa
            r7 = r6
            goto L_0x00fb
        L_0x00fa:
            r7 = r4
        L_0x00fb:
            if (r0 == 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            r4 = r6
        L_0x00ff:
            boolean r2 = r11.m7137e(r2)
            boolean r5 = r11.m7137e(r5)
            if (r0 == 0) goto L_0x010b
            r6 = r5
            goto L_0x010c
        L_0x010b:
            r6 = r2
        L_0x010c:
            if (r0 == 0) goto L_0x010f
            goto L_0x0110
        L_0x010f:
            r2 = r5
        L_0x0110:
            if (r6 == 0) goto L_0x0113
            r1 = r7
        L_0x0113:
            if (r2 == 0) goto L_0x0119
            r2 = r1
            r17 = r4
            goto L_0x011c
        L_0x0119:
            r2 = r1
            r17 = r3
        L_0x011c:
            android.graphics.RectF r0 = r11.f5597l
            float r10 = r0.left
            float r9 = r0.right
            float r8 = r0.top
            float r7 = r0.bottom
            float r0 = r13.left
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0155
            android.graphics.PointF r0 = r11.f5600o
            float r5 = r0.x
            float r6 = r0.y
            android.graphics.PointF r0 = r11.f5603r
            float r4 = r0.x
            float r3 = r0.y
            r0 = r22
            r1 = r23
            r18 = r3
            r3 = r10
            r19 = r4
            r4 = r8
            r20 = r7
            r7 = r19
            r19 = r8
            r8 = r18
            r18 = r9
            r9 = r10
            r21 = r10
            r10 = r20
            r0.m7132a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x015d
        L_0x0155:
            r20 = r7
            r19 = r8
            r18 = r9
            r21 = r10
        L_0x015d:
            float r0 = r13.top
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x017f
            android.graphics.PointF r0 = r11.f5600o
            float r5 = r0.x
            float r6 = r0.y
            android.graphics.PointF r0 = r11.f5601p
            float r7 = r0.x
            float r8 = r0.y
            r0 = r22
            r1 = r23
            r2 = r15
            r3 = r21
            r4 = r19
            r9 = r18
            r10 = r19
            r0.m7132a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x017f:
            float r0 = r13.right
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a2
            android.graphics.PointF r0 = r11.f5601p
            float r5 = r0.x
            float r6 = r0.y
            android.graphics.PointF r0 = r11.f5602q
            float r7 = r0.x
            float r8 = r0.y
            r0 = r22
            r1 = r23
            r2 = r17
            r3 = r18
            r4 = r19
            r9 = r18
            r10 = r20
            r0.m7132a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x01a2:
            float r0 = r13.bottom
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c5
            android.graphics.PointF r0 = r11.f5603r
            float r5 = r0.x
            float r6 = r0.y
            android.graphics.PointF r0 = r11.f5602q
            float r7 = r0.x
            float r8 = r0.y
            r0 = r22
            r1 = r23
            r2 = r16
            r3 = r21
            r4 = r20
            r9 = r18
            r10 = r20
            r0.m7132a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x01c5:
            r23.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.C1881e.m7134b(android.graphics.Canvas):void");
    }

    /* renamed from: c */
    private void m7135c(int i, float f) {
        if (this.f5587b == null) {
            this.f5587b = new C1577M(0.0f);
        }
        if (!C1681i.m6531a(this.f5587b.mo5691b(i), f)) {
            this.f5587b.mo5690a(i, f);
            invalidateSelf();
        }
    }

    /* renamed from: d */
    private int m7136d(int i) {
        C1577M m = this.f5587b;
        float a = m != null ? m.mo5689a(i) : 0.0f;
        C1577M m2 = this.f5588c;
        return m7128a(m2 != null ? m2.mo5689a(i) : 255.0f, a);
    }

    /* renamed from: e */
    private boolean m7137e(int i) {
        C1577M m = this.f5587b;
        float f = Float.NaN;
        float a = m != null ? m.mo5689a(i) : Float.NaN;
        C1577M m2 = this.f5588c;
        if (m2 != null) {
            f = m2.mo5689a(i);
        }
        return !C1943a.m7432a(a) && !C1943a.m7432a(f);
    }

    /* renamed from: g */
    private void m7138g() {
        if (this.f5604s) {
            this.f5604s = false;
            if (this.f5591f == null) {
                this.f5591f = new Path();
            }
            if (this.f5592g == null) {
                this.f5592g = new Path();
            }
            if (this.f5593h == null) {
                this.f5593h = new Path();
            }
            if (this.f5595j == null) {
                this.f5595j = new Path();
            }
            if (this.f5596k == null) {
                this.f5596k = new RectF();
            }
            if (this.f5597l == null) {
                this.f5597l = new RectF();
            }
            if (this.f5598m == null) {
                this.f5598m = new RectF();
            }
            if (this.f5599n == null) {
                this.f5599n = new RectF();
            }
            this.f5591f.reset();
            this.f5592g.reset();
            this.f5593h.reset();
            this.f5595j.reset();
            this.f5596k.set(getBounds());
            this.f5597l.set(getBounds());
            this.f5598m.set(getBounds());
            this.f5599n.set(getBounds());
            float d = mo6676d();
            if (d > 0.0f) {
                float f = d * 0.5f;
                this.f5599n.inset(f, f);
            }
            RectF b = mo6671b();
            RectF rectF = this.f5596k;
            rectF.top += b.top;
            rectF.bottom -= b.bottom;
            rectF.left += b.left;
            rectF.right -= b.right;
            float c = mo6674c();
            float a = mo6663a(c, C1882a.TOP_LEFT);
            float a2 = mo6663a(c, C1882a.TOP_RIGHT);
            float a3 = mo6663a(c, C1882a.BOTTOM_LEFT);
            float a4 = mo6663a(c, C1882a.BOTTOM_RIGHT);
            if (VERSION.SDK_INT >= 17) {
                boolean z = mo6678e() == 1;
                float a5 = mo6664a(C1882a.TOP_START);
                float a6 = mo6664a(C1882a.TOP_END);
                float a7 = mo6664a(C1882a.BOTTOM_START);
                float a8 = mo6664a(C1882a.BOTTOM_END);
                if (C1489a.m5938a().mo5392a(this.f5610y)) {
                    if (!C1943a.m7432a(a5)) {
                        a = a5;
                    }
                    if (!C1943a.m7432a(a6)) {
                        a2 = a6;
                    }
                    if (!C1943a.m7432a(a7)) {
                        a3 = a7;
                    }
                    if (!C1943a.m7432a(a8)) {
                        a4 = a8;
                    }
                    float f2 = z ? a2 : a;
                    if (z) {
                        a2 = a;
                    }
                    float f3 = z ? a4 : a3;
                    if (z) {
                        a4 = a3;
                    }
                    a3 = f3;
                    a = f2;
                } else {
                    float f4 = z ? a6 : a5;
                    if (!z) {
                        a5 = a6;
                    }
                    float f5 = z ? a8 : a7;
                    if (!z) {
                        a7 = a8;
                    }
                    if (!C1943a.m7432a(f4)) {
                        a = f4;
                    }
                    if (!C1943a.m7432a(a5)) {
                        a2 = a5;
                    }
                    if (!C1943a.m7432a(f5)) {
                        a3 = f5;
                    }
                    if (!C1943a.m7432a(a7)) {
                        a4 = a7;
                    }
                }
            }
            float max = Math.max(a - b.left, 0.0f);
            float max2 = Math.max(a - b.top, 0.0f);
            float max3 = Math.max(a2 - b.right, 0.0f);
            float max4 = Math.max(a2 - b.top, 0.0f);
            float max5 = Math.max(a4 - b.right, 0.0f);
            float max6 = Math.max(a4 - b.bottom, 0.0f);
            float max7 = Math.max(a3 - b.left, 0.0f);
            float max8 = Math.max(a3 - b.bottom, 0.0f);
            float f6 = a3;
            float f7 = a4;
            this.f5591f.addRoundRect(this.f5596k, new float[]{max, max2, max3, max4, max5, max6, max7, max8}, Direction.CW);
            this.f5592g.addRoundRect(this.f5597l, new float[]{a, a, a2, a2, f7, f7, f6, f6}, Direction.CW);
            C1577M m = this.f5586a;
            float a9 = m != null ? m.mo5689a(8) / 2.0f : 0.0f;
            float f8 = a + a9;
            float f9 = a2 + a9;
            float f10 = f7 + a9;
            float f11 = f6 + a9;
            this.f5593h.addRoundRect(this.f5598m, new float[]{f8, f8, f9, f9, f10, f10, f11, f11}, Direction.CW);
            this.f5595j.addRoundRect(this.f5599n, new float[]{max + a9, max2 + a9, max3 + a9, max4 + a9, max5 + a9, max6 + a9, max7 + a9, max8 + a9}, Direction.CW);
            if (this.f5600o == null) {
                this.f5600o = new PointF();
            }
            PointF pointF = this.f5600o;
            PointF pointF2 = pointF;
            RectF rectF2 = this.f5596k;
            float f12 = rectF2.left;
            pointF.x = f12;
            float f13 = rectF2.top;
            pointF.y = f13;
            double d2 = (double) f12;
            double d3 = (double) f13;
            double d4 = (double) ((max * 2.0f) + f12);
            double d5 = (double) ((max2 * 2.0f) + f13);
            RectF rectF3 = this.f5597l;
            m7130a(d2, d3, d4, d5, (double) rectF3.left, (double) rectF3.top, (double) f12, (double) f13, pointF2);
            if (this.f5603r == null) {
                this.f5603r = new PointF();
            }
            PointF pointF3 = this.f5603r;
            PointF pointF4 = pointF3;
            RectF rectF4 = this.f5596k;
            float f14 = rectF4.left;
            pointF3.x = f14;
            float f15 = rectF4.bottom;
            pointF3.y = f15;
            double d6 = (double) f14;
            double d7 = (double) (f15 - (max8 * 2.0f));
            double d8 = (double) ((max7 * 2.0f) + f14);
            double d9 = (double) f15;
            RectF rectF5 = this.f5597l;
            m7130a(d6, d7, d8, d9, (double) rectF5.left, (double) rectF5.bottom, (double) f14, (double) f15, pointF4);
            if (this.f5601p == null) {
                this.f5601p = new PointF();
            }
            PointF pointF5 = this.f5601p;
            PointF pointF6 = pointF5;
            RectF rectF6 = this.f5596k;
            float f16 = rectF6.right;
            pointF5.x = f16;
            float f17 = rectF6.top;
            pointF5.y = f17;
            double d10 = (double) (f16 - (max3 * 2.0f));
            double d11 = (double) f17;
            double d12 = (double) f16;
            double d13 = (double) ((max4 * 2.0f) + f17);
            RectF rectF7 = this.f5597l;
            m7130a(d10, d11, d12, d13, (double) rectF7.right, (double) rectF7.top, (double) f16, (double) f17, pointF6);
            if (this.f5602q == null) {
                this.f5602q = new PointF();
            }
            PointF pointF7 = this.f5602q;
            PointF pointF8 = pointF7;
            RectF rectF8 = this.f5596k;
            float f18 = rectF8.right;
            pointF7.x = f18;
            float f19 = rectF8.bottom;
            pointF7.y = f19;
            double d14 = (double) (f18 - (max5 * 2.0f));
            double d15 = (double) (f19 - (max6 * 2.0f));
            double d16 = (double) f18;
            double d17 = (double) f19;
            RectF rectF9 = this.f5597l;
            m7130a(d14, d15, d16, d17, (double) rectF9.right, (double) rectF9.bottom, (double) f18, (double) f19, pointF8);
        }
    }

    /* renamed from: h */
    private void m7139h() {
        C1883b bVar = this.f5589d;
        this.f5590e = bVar != null ? C1883b.m7157a(bVar, mo6676d()) : null;
        this.f5606u.setPathEffect(this.f5590e);
    }

    /* renamed from: a */
    public float mo6662a(float f, int i) {
        C1577M m = this.f5586a;
        if (m == null) {
            return f;
        }
        float b = m.mo5691b(i);
        return C1943a.m7432a(b) ? f : b;
    }

    /* renamed from: a */
    public float mo6663a(float f, C1882a aVar) {
        float[] fArr = this.f5609x;
        if (fArr == null) {
            return f;
        }
        float f2 = fArr[aVar.ordinal()];
        return C1943a.m7432a(f2) ? f : f2;
    }

    /* renamed from: a */
    public float mo6664a(C1882a aVar) {
        return mo6663a(Float.NaN, aVar);
    }

    /* renamed from: a */
    public int mo6665a() {
        return this.f5607v;
    }

    /* renamed from: a */
    public void mo6666a(float f) {
        if (!C1681i.m6531a(this.f5605t, f)) {
            this.f5605t = f;
            this.f5604s = true;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo6667a(int i, float f) {
        if (this.f5586a == null) {
            this.f5586a = new C1577M();
        }
        if (!C1681i.m6531a(this.f5586a.mo5691b(i), f)) {
            this.f5586a.mo5690a(i, f);
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
                this.f5604s = true;
            }
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo6668a(int i, float f, float f2) {
        m7135c(i, f);
        m7133b(i, f2);
    }

    /* renamed from: a */
    public void mo6669a(String str) {
        C1883b valueOf = str == null ? null : C1883b.valueOf(str.toUpperCase(Locale.US));
        if (this.f5589d != valueOf) {
            this.f5589d = valueOf;
            this.f5604s = true;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public boolean mo6670a(int i) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r1 != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (com.facebook.yoga.C1943a.m7432a(r4) == false) goto L_0x0074;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.RectF mo6671b() {
        /*
            r9 = this;
            r0 = 0
            r1 = 8
            float r0 = r9.mo6662a(r0, r1)
            r1 = 1
            float r2 = r9.mo6662a(r0, r1)
            r3 = 3
            float r3 = r9.mo6662a(r0, r3)
            r4 = 0
            float r5 = r9.mo6662a(r0, r4)
            r6 = 2
            float r0 = r9.mo6662a(r0, r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 17
            if (r6 < r7) goto L_0x0075
            com.facebook.react.uimanager.M r6 = r9.f5586a
            if (r6 == 0) goto L_0x0075
            int r6 = r9.mo6678e()
            if (r6 != r1) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            com.facebook.react.uimanager.M r4 = r9.f5586a
            r6 = 4
            float r4 = r4.mo5691b(r6)
            com.facebook.react.uimanager.M r6 = r9.f5586a
            r7 = 5
            float r6 = r6.mo5691b(r7)
            com.facebook.react.modules.i18nmanager.a r7 = com.facebook.react.modules.i18nmanager.C1489a.m5938a()
            android.content.Context r8 = r9.f5610y
            boolean r7 = r7.mo5392a(r8)
            if (r7 == 0) goto L_0x005e
            boolean r7 = com.facebook.yoga.C1943a.m7432a(r4)
            if (r7 == 0) goto L_0x004e
            r4 = r5
        L_0x004e:
            boolean r5 = com.facebook.yoga.C1943a.m7432a(r6)
            if (r5 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r0 = r6
        L_0x0056:
            if (r1 == 0) goto L_0x005a
            r5 = r0
            goto L_0x005b
        L_0x005a:
            r5 = r4
        L_0x005b:
            if (r1 == 0) goto L_0x0075
            goto L_0x0074
        L_0x005e:
            if (r1 == 0) goto L_0x0062
            r7 = r6
            goto L_0x0063
        L_0x0062:
            r7 = r4
        L_0x0063:
            if (r1 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r4 = r6
        L_0x0067:
            boolean r1 = com.facebook.yoga.C1943a.m7432a(r7)
            if (r1 != 0) goto L_0x006e
            r5 = r7
        L_0x006e:
            boolean r1 = com.facebook.yoga.C1943a.m7432a(r4)
            if (r1 != 0) goto L_0x0075
        L_0x0074:
            r0 = r4
        L_0x0075:
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r5, r2, r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.C1881e.mo6671b():android.graphics.RectF");
    }

    /* renamed from: b */
    public void mo6672b(float f, int i) {
        if (this.f5609x == null) {
            this.f5609x = new float[8];
            Arrays.fill(this.f5609x, Float.NaN);
        }
        if (!C1681i.m6531a(this.f5609x[i], f)) {
            this.f5609x[i] = f;
            this.f5604s = true;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo6673b(int i) {
        this.f5607v = i;
        invalidateSelf();
    }

    /* renamed from: c */
    public float mo6674c() {
        if (C1943a.m7432a(this.f5605t)) {
            return 0.0f;
        }
        return this.f5605t;
    }

    /* renamed from: c */
    public boolean mo6675c(int i) {
        if (this.f5611z == i) {
            return false;
        }
        this.f5611z = i;
        return mo6670a(i);
    }

    /* renamed from: d */
    public float mo6676d() {
        C1577M m = this.f5586a;
        if (m == null || C1943a.m7432a(m.mo5691b(8))) {
            return 0.0f;
        }
        return this.f5586a.mo5691b(8);
    }

    public void draw(Canvas canvas) {
        m7139h();
        if (!mo6679f()) {
            m7131a(canvas);
        } else {
            m7134b(canvas);
        }
    }

    /* renamed from: e */
    public int mo6678e() {
        return this.f5611z;
    }

    /* renamed from: f */
    public boolean mo6679f() {
        if (!C1943a.m7432a(this.f5605t) && this.f5605t > 0.0f) {
            return true;
        }
        float[] fArr = this.f5609x;
        if (fArr != null) {
            for (float f : fArr) {
                if (!C1943a.m7432a(f) && f > 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getAlpha() {
        return this.f5608w;
    }

    public int getOpacity() {
        return C1877a.m7124a(C1877a.m7125a(this.f5607v, this.f5608w));
    }

    public void getOutline(Outline outline) {
        if (VERSION.SDK_INT < 21) {
            super.getOutline(outline);
            return;
        }
        if ((C1943a.m7432a(this.f5605t) || this.f5605t <= 0.0f) && this.f5609x == null) {
            outline.setRect(getBounds());
        } else {
            m7138g();
            outline.setConvexPath(this.f5593h);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5604s = true;
    }

    public void setAlpha(int i) {
        if (i != this.f5608w) {
            this.f5608w = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
