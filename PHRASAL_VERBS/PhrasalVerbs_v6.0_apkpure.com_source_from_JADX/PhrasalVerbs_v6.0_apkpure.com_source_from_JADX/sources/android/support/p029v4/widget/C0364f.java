package android.support.p029v4.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.p029v4.util.C0337n;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p000a.p005b.p009c.p018g.p020b.C0130b;

/* renamed from: android.support.v4.widget.f */
public class C0364f extends Drawable implements Animatable {

    /* renamed from: a */
    private static final Interpolator f1150a = new LinearInterpolator();

    /* renamed from: b */
    private static final Interpolator f1151b = new C0130b();

    /* renamed from: c */
    private static final int[] f1152c = {-16777216};

    /* renamed from: d */
    private final C0365a f1153d = new C0365a();

    /* renamed from: e */
    private float f1154e;

    /* renamed from: f */
    private Resources f1155f;

    /* renamed from: g */
    private Animator f1156g;

    /* renamed from: h */
    float f1157h;

    /* renamed from: i */
    boolean f1158i;

    /* renamed from: android.support.v4.widget.f$a */
    private static class C0365a {

        /* renamed from: a */
        final RectF f1159a = new RectF();

        /* renamed from: b */
        final Paint f1160b = new Paint();

        /* renamed from: c */
        final Paint f1161c = new Paint();

        /* renamed from: d */
        final Paint f1162d = new Paint();

        /* renamed from: e */
        float f1163e = 0.0f;

        /* renamed from: f */
        float f1164f = 0.0f;

        /* renamed from: g */
        float f1165g = 0.0f;

        /* renamed from: h */
        float f1166h = 5.0f;

        /* renamed from: i */
        int[] f1167i;

        /* renamed from: j */
        int f1168j;

        /* renamed from: k */
        float f1169k;

        /* renamed from: l */
        float f1170l;

        /* renamed from: m */
        float f1171m;

        /* renamed from: n */
        boolean f1172n;

        /* renamed from: o */
        Path f1173o;

        /* renamed from: p */
        float f1174p = 1.0f;

        /* renamed from: q */
        float f1175q;

        /* renamed from: r */
        int f1176r;

        /* renamed from: s */
        int f1177s;

        /* renamed from: t */
        int f1178t = 255;

        /* renamed from: u */
        int f1179u;

        C0365a() {
            this.f1160b.setStrokeCap(Cap.SQUARE);
            this.f1160b.setAntiAlias(true);
            this.f1160b.setStyle(Style.STROKE);
            this.f1161c.setStyle(Style.FILL);
            this.f1161c.setAntiAlias(true);
            this.f1162d.setColor(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo1669a() {
            return this.f1178t;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1670a(float f) {
            if (f != this.f1174p) {
                this.f1174p = f;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1671a(float f, float f2) {
            this.f1176r = (int) f;
            this.f1177s = (int) f2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1672a(int i) {
            this.f1178t = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1673a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f1172n) {
                Path path = this.f1173o;
                if (path == null) {
                    this.f1173o = new Path();
                    this.f1173o.setFillType(FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (((float) this.f1176r) * this.f1174p) / 2.0f;
                this.f1173o.moveTo(0.0f, 0.0f);
                this.f1173o.lineTo(((float) this.f1176r) * this.f1174p, 0.0f);
                Path path2 = this.f1173o;
                float f4 = (float) this.f1176r;
                float f5 = this.f1174p;
                path2.lineTo((f4 * f5) / 2.0f, ((float) this.f1177s) * f5);
                this.f1173o.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.f1166h / 2.0f));
                this.f1173o.close();
                this.f1161c.setColor(this.f1179u);
                this.f1161c.setAlpha(this.f1178t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f1173o, this.f1161c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1674a(Canvas canvas, Rect rect) {
            RectF rectF = this.f1159a;
            float f = this.f1175q;
            float f2 = (this.f1166h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f1176r) * this.f1174p) / 2.0f, this.f1166h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f1163e;
            float f4 = this.f1165g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f1164f + f4) * 360.0f) - f5;
            this.f1160b.setColor(this.f1179u);
            this.f1160b.setAlpha(this.f1178t);
            float f7 = this.f1166h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f1162d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f1160b);
            mo1673a(canvas, f5, f6, rectF);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1675a(ColorFilter colorFilter) {
            this.f1160b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1676a(boolean z) {
            if (this.f1172n != z) {
                this.f1172n = z;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1677a(int[] iArr) {
            this.f1167i = iArr;
            mo1683c(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public float mo1678b() {
            return this.f1164f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1679b(float f) {
            this.f1175q = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1680b(int i) {
            this.f1179u = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo1681c() {
            return this.f1167i[mo1684d()];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo1682c(float f) {
            this.f1164f = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo1683c(int i) {
            this.f1168j = i;
            this.f1179u = this.f1167i[this.f1168j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo1684d() {
            return (this.f1168j + 1) % this.f1167i.length;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo1685d(float f) {
            this.f1165g = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public float mo1686e() {
            return this.f1163e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo1687e(float f) {
            this.f1163e = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public int mo1688f() {
            return this.f1167i[this.f1168j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo1689f(float f) {
            this.f1166h = f;
            this.f1160b.setStrokeWidth(f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public float mo1690g() {
            return this.f1170l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public float mo1691h() {
            return this.f1171m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public float mo1692i() {
            return this.f1169k;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo1693j() {
            mo1683c(mo1684d());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo1694k() {
            this.f1169k = 0.0f;
            this.f1170l = 0.0f;
            this.f1171m = 0.0f;
            mo1687e(0.0f);
            mo1682c(0.0f);
            mo1685d(0.0f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo1695l() {
            this.f1169k = this.f1163e;
            this.f1170l = this.f1164f;
            this.f1171m = this.f1165g;
        }
    }

    public C0364f(Context context) {
        C0337n.m1442a(context);
        this.f1155f = context.getResources();
        this.f1153d.mo1677a(f1152c);
        mo1660c(2.5f);
        m1642a();
    }

    /* renamed from: a */
    private int m1641a(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: a */
    private void m1642a() {
        C0365a aVar = this.f1153d;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C0362d(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f1150a);
        ofFloat.addListener(new C0363e(this, aVar));
        this.f1156g = ofFloat;
    }

    /* renamed from: a */
    private void m1643a(float f, float f2, float f3, float f4) {
        C0365a aVar = this.f1153d;
        float f5 = this.f1155f.getDisplayMetrics().density;
        aVar.mo1689f(f2 * f5);
        aVar.mo1679b(f * f5);
        aVar.mo1683c(0);
        aVar.mo1671a(f3 * f5, f4 * f5);
    }

    /* renamed from: b */
    private void m1644b(float f, C0365a aVar) {
        mo1654a(f, aVar);
        float floor = (float) (Math.floor((double) (aVar.mo1691h() / 0.8f)) + 1.0d);
        aVar.mo1687e(aVar.mo1692i() + (((aVar.mo1690g() - 0.01f) - aVar.mo1692i()) * f));
        aVar.mo1682c(aVar.mo1690g());
        aVar.mo1685d(aVar.mo1691h() + ((floor - aVar.mo1691h()) * f));
    }

    /* renamed from: d */
    private void m1645d(float f) {
        this.f1154e = f;
    }

    /* renamed from: a */
    public void mo1652a(float f) {
        this.f1153d.mo1670a(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo1653a(float f, float f2) {
        this.f1153d.mo1687e(f);
        this.f1153d.mo1682c(f2);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1654a(float f, C0365a aVar) {
        aVar.mo1680b(f > 0.75f ? m1641a((f - 0.75f) / 0.25f, aVar.mo1688f(), aVar.mo1681c()) : aVar.mo1688f());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1655a(float f, C0365a aVar, boolean z) {
        float f2;
        float f3;
        if (this.f1158i) {
            m1644b(f, aVar);
        } else if (f != 1.0f || z) {
            float h = aVar.mo1691h();
            if (f < 0.5f) {
                float f4 = f / 0.5f;
                float i = aVar.mo1692i();
                float f5 = i;
                f2 = (f1151b.getInterpolation(f4) * 0.79f) + 0.01f + i;
                f3 = f5;
            } else {
                f2 = aVar.mo1692i() + 0.79f;
                f3 = f2 - (((1.0f - f1151b.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            float f6 = h + (0.20999998f * f);
            float f7 = (f + this.f1157h) * 216.0f;
            aVar.mo1687e(f3);
            aVar.mo1682c(f2);
            aVar.mo1685d(f6);
            m1645d(f7);
        }
    }

    /* renamed from: a */
    public void mo1656a(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i == 0) {
            f = 11.0f;
            f4 = 3.0f;
            f3 = 12.0f;
            f2 = 6.0f;
        } else {
            f = 7.5f;
            f4 = 2.5f;
            f3 = 10.0f;
            f2 = 5.0f;
        }
        m1643a(f, f4, f3, f2);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo1657a(boolean z) {
        this.f1153d.mo1676a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo1658a(int... iArr) {
        this.f1153d.mo1677a(iArr);
        this.f1153d.mo1683c(0);
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo1659b(float f) {
        this.f1153d.mo1685d(f);
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo1660c(float f) {
        this.f1153d.mo1689f(f);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f1154e, bounds.exactCenterX(), bounds.exactCenterY());
        this.f1153d.mo1674a(canvas, bounds);
        canvas.restore();
    }

    public int getAlpha() {
        return this.f1153d.mo1669a();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f1156g.isRunning();
    }

    public void setAlpha(int i) {
        this.f1153d.mo1672a(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1153d.mo1675a(colorFilter);
        invalidateSelf();
    }

    public void start() {
        long j;
        Animator animator;
        this.f1156g.cancel();
        this.f1153d.mo1695l();
        if (this.f1153d.mo1678b() != this.f1153d.mo1686e()) {
            this.f1158i = true;
            animator = this.f1156g;
            j = 666;
        } else {
            this.f1153d.mo1683c(0);
            this.f1153d.mo1694k();
            animator = this.f1156g;
            j = 1332;
        }
        animator.setDuration(j);
        this.f1156g.start();
    }

    public void stop() {
        this.f1156g.cancel();
        m1645d(0.0f);
        this.f1153d.mo1676a(false);
        this.f1153d.mo1683c(0);
        this.f1153d.mo1694k();
        invalidateSelf();
    }
}
