package android.support.p029v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v4.widget.a */
public abstract class C0356a implements OnTouchListener {

    /* renamed from: a */
    private static final int f1110a = ViewConfiguration.getTapTimeout();

    /* renamed from: b */
    final C0357a f1111b = new C0357a();

    /* renamed from: c */
    private final Interpolator f1112c = new AccelerateInterpolator();

    /* renamed from: d */
    final View f1113d;

    /* renamed from: e */
    private Runnable f1114e;

    /* renamed from: f */
    private float[] f1115f = {0.0f, 0.0f};

    /* renamed from: g */
    private float[] f1116g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: h */
    private int f1117h;

    /* renamed from: i */
    private int f1118i;

    /* renamed from: j */
    private float[] f1119j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f1120k = {0.0f, 0.0f};

    /* renamed from: l */
    private float[] f1121l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: m */
    private boolean f1122m;

    /* renamed from: n */
    boolean f1123n;

    /* renamed from: o */
    boolean f1124o;

    /* renamed from: p */
    boolean f1125p;

    /* renamed from: q */
    private boolean f1126q;

    /* renamed from: r */
    private boolean f1127r;

    /* renamed from: android.support.v4.widget.a$a */
    private static class C0357a {

        /* renamed from: a */
        private int f1128a;

        /* renamed from: b */
        private int f1129b;

        /* renamed from: c */
        private float f1130c;

        /* renamed from: d */
        private float f1131d;

        /* renamed from: e */
        private long f1132e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f1133f = 0;

        /* renamed from: g */
        private int f1134g = 0;

        /* renamed from: h */
        private int f1135h = 0;

        /* renamed from: i */
        private long f1136i = -1;

        /* renamed from: j */
        private float f1137j;

        /* renamed from: k */
        private int f1138k;

        C0357a() {
        }

        /* renamed from: a */
        private float m1625a(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        private float m1626a(long j) {
            if (j < this.f1132e) {
                return 0.0f;
            }
            long j2 = this.f1136i;
            if (j2 < 0 || j < j2) {
                return C0356a.m1603a(((float) (j - this.f1132e)) / ((float) this.f1128a), 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f1137j;
            return (1.0f - f) + (f * C0356a.m1603a(((float) j3) / ((float) this.f1138k), 0.0f, 1.0f));
        }

        /* renamed from: a */
        public void mo1628a() {
            if (this.f1133f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m1625a(m1626a(currentAnimationTimeMillis));
                long j = currentAnimationTimeMillis - this.f1133f;
                this.f1133f = currentAnimationTimeMillis;
                float f = ((float) j) * a;
                this.f1134g = (int) (this.f1130c * f);
                this.f1135h = (int) (f * this.f1131d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: a */
        public void mo1629a(float f, float f2) {
            this.f1130c = f;
            this.f1131d = f2;
        }

        /* renamed from: a */
        public void mo1630a(int i) {
            this.f1129b = i;
        }

        /* renamed from: b */
        public int mo1631b() {
            return this.f1134g;
        }

        /* renamed from: b */
        public void mo1632b(int i) {
            this.f1128a = i;
        }

        /* renamed from: c */
        public int mo1633c() {
            return this.f1135h;
        }

        /* renamed from: d */
        public int mo1634d() {
            float f = this.f1130c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public int mo1635e() {
            float f = this.f1131d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public boolean mo1636f() {
            return this.f1136i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1136i + ((long) this.f1138k);
        }

        /* renamed from: g */
        public void mo1637g() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1138k = C0356a.m1606a((int) (currentAnimationTimeMillis - this.f1132e), 0, this.f1129b);
            this.f1137j = m1626a(currentAnimationTimeMillis);
            this.f1136i = currentAnimationTimeMillis;
        }

        /* renamed from: h */
        public void mo1638h() {
            this.f1132e = AnimationUtils.currentAnimationTimeMillis();
            this.f1136i = -1;
            this.f1133f = this.f1132e;
            this.f1137j = 0.5f;
            this.f1134g = 0;
            this.f1135h = 0;
        }
    }

    /* renamed from: android.support.v4.widget.a$b */
    private class C0358b implements Runnable {
        C0358b() {
        }

        public void run() {
            C0356a aVar = C0356a.this;
            if (aVar.f1125p) {
                if (aVar.f1123n) {
                    aVar.f1123n = false;
                    aVar.f1111b.mo1638h();
                }
                C0357a aVar2 = C0356a.this.f1111b;
                if (aVar2.mo1636f() || !C0356a.this.mo1618b()) {
                    C0356a.this.f1125p = false;
                    return;
                }
                C0356a aVar3 = C0356a.this;
                if (aVar3.f1124o) {
                    aVar3.f1124o = false;
                    aVar3.mo1614a();
                }
                aVar2.mo1628a();
                C0356a.this.mo1615a(aVar2.mo1631b(), aVar2.mo1633c());
                C0156v.m548a(C0356a.this.f1113d, (Runnable) this);
            }
        }
    }

    public C0356a(View view) {
        this.f1113d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        int i = (int) ((f * 315.0f) + 0.5f);
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo1617b(f2, f2);
        float f3 = (float) i;
        mo1620c(f3, f3);
        mo1623d(1);
        mo1612a(Float.MAX_VALUE, Float.MAX_VALUE);
        mo1622d(0.2f, 0.2f);
        mo1624e(1.0f, 1.0f);
        mo1621c(f1110a);
        mo1626f(500);
        mo1625e(500);
    }

    /* renamed from: a */
    static float m1603a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    private float m1604a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m1603a(f * f2, 0.0f, f3);
        float f6 = m1609f(f2 - f4, a) - m1609f(f4, a);
        if (f6 < 0.0f) {
            f5 = -this.f1112c.getInterpolation(-f6);
        } else if (f6 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f1112c.getInterpolation(f6);
        }
        return m1603a(f5, -1.0f, 1.0f);
    }

    /* renamed from: a */
    private float m1605a(int i, float f, float f2, float f3) {
        float a = m1604a(this.f1115f[i], f2, this.f1116g[i], f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f1119j[i];
        float f5 = this.f1120k[i];
        float f6 = this.f1121l[i];
        float f7 = f4 * f3;
        return a > 0.0f ? m1603a(a * f7, f5, f6) : -m1603a((-a) * f7, f5, f6);
    }

    /* renamed from: a */
    static int m1606a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: c */
    private void m1607c() {
        if (this.f1123n) {
            this.f1125p = false;
        } else {
            this.f1111b.mo1637g();
        }
    }

    /* renamed from: d */
    private void m1608d() {
        if (this.f1114e == null) {
            this.f1114e = new C0358b();
        }
        this.f1125p = true;
        this.f1123n = true;
        if (!this.f1122m) {
            int i = this.f1118i;
            if (i > 0) {
                C0156v.m549a(this.f1113d, this.f1114e, (long) i);
                this.f1122m = true;
            }
        }
        this.f1114e.run();
        this.f1122m = true;
    }

    /* renamed from: f */
    private float m1609f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f1117h;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.f1125p || this.f1117h != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: a */
    public C0356a mo1612a(float f, float f2) {
        float[] fArr = this.f1116g;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: a */
    public C0356a mo1613a(boolean z) {
        if (this.f1126q && !z) {
            m1607c();
        }
        this.f1126q = z;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1614a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1113d.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    public abstract void mo1615a(int i, int i2);

    /* renamed from: a */
    public abstract boolean mo1616a(int i);

    /* renamed from: b */
    public C0356a mo1617b(float f, float f2) {
        float[] fArr = this.f1121l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo1618b() {
        C0357a aVar = this.f1111b;
        int e = aVar.mo1635e();
        int d = aVar.mo1634d();
        return (e != 0 && mo1619b(e)) || (d != 0 && mo1616a(d));
    }

    /* renamed from: b */
    public abstract boolean mo1619b(int i);

    /* renamed from: c */
    public C0356a mo1620c(float f, float f2) {
        float[] fArr = this.f1120k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public C0356a mo1621c(int i) {
        this.f1118i = i;
        return this;
    }

    /* renamed from: d */
    public C0356a mo1622d(float f, float f2) {
        float[] fArr = this.f1115f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: d */
    public C0356a mo1623d(int i) {
        this.f1117h = i;
        return this;
    }

    /* renamed from: e */
    public C0356a mo1624e(float f, float f2) {
        float[] fArr = this.f1119j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: e */
    public C0356a mo1625e(int i) {
        this.f1111b.mo1630a(i);
        return this;
    }

    /* renamed from: f */
    public C0356a mo1626f(int i) {
        this.f1111b.mo1632b(i);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f1126q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m1607c()
            goto L_0x0058
        L_0x001a:
            r5.f1124o = r2
            r5.f1122m = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1113d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m1605a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1113d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m1605a(r2, r7, r6, r3)
            android.support.v4.widget.a$a r7 = r5.f1111b
            r7.mo1629a(r0, r6)
            boolean r6 = r5.f1125p
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo1618b()
            if (r6 == 0) goto L_0x0058
            r5.m1608d()
        L_0x0058:
            boolean r6 = r5.f1127r
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f1125p
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v4.widget.C0356a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
