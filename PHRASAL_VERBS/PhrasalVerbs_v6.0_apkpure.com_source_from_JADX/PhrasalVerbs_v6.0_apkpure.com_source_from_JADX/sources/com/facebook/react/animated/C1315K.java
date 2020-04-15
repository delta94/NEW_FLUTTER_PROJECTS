package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.K */
class C1315K extends C1330d {

    /* renamed from: e */
    private long f4261e;

    /* renamed from: f */
    private boolean f4262f;

    /* renamed from: g */
    private double f4263g;

    /* renamed from: h */
    private double f4264h;

    /* renamed from: i */
    private double f4265i;

    /* renamed from: j */
    private double f4266j;

    /* renamed from: k */
    private boolean f4267k;

    /* renamed from: l */
    private final C1316a f4268l = new C1316a();

    /* renamed from: m */
    private double f4269m;

    /* renamed from: n */
    private double f4270n;

    /* renamed from: o */
    private double f4271o;

    /* renamed from: p */
    private double f4272p;

    /* renamed from: q */
    private double f4273q;

    /* renamed from: r */
    private int f4274r;

    /* renamed from: s */
    private int f4275s;

    /* renamed from: t */
    private double f4276t;

    /* renamed from: com.facebook.react.animated.K$a */
    private static class C1316a {

        /* renamed from: a */
        double f4277a;

        /* renamed from: b */
        double f4278b;

        private C1316a() {
        }
    }

    C1315K(ReadableMap readableMap) {
        this.f4268l.f4278b = readableMap.getDouble("initialVelocity");
        mo4834a(readableMap);
    }

    /* renamed from: a */
    private double m5663a(C1316a aVar) {
        return Math.abs(this.f4270n - aVar.f4277a);
    }

    /* renamed from: a */
    private void m5664a(double d) {
        double d2;
        double d3;
        if (!m5665a()) {
            double d4 = 0.064d;
            if (d <= 0.064d) {
                d4 = d;
            }
            this.f4273q += d4;
            double d5 = this.f4264h;
            double d6 = this.f4265i;
            double d7 = this.f4263g;
            double d8 = -this.f4266j;
            double sqrt = d5 / (Math.sqrt(d7 * d6) * 2.0d);
            double sqrt2 = Math.sqrt(d7 / d6);
            double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
            double d9 = this.f4270n - this.f4269m;
            double d10 = this.f4273q;
            if (sqrt < 1.0d) {
                double exp = Math.exp((-sqrt) * sqrt2 * d10);
                double d11 = sqrt * sqrt2;
                double d12 = d8 + (d11 * d9);
                double d13 = d10 * sqrt3;
                d3 = ((d11 * exp) * (((Math.sin(d13) * d12) / sqrt3) + (Math.cos(d13) * d9))) - (((Math.cos(d13) * d12) - ((sqrt3 * d9) * Math.sin(d13))) * exp);
                d2 = this.f4270n - ((((d12 / sqrt3) * Math.sin(d13)) + (Math.cos(d13) * d9)) * exp);
            } else {
                double exp2 = Math.exp((-sqrt2) * d10);
                d2 = this.f4270n - (((((sqrt2 * d9) + d8) * d10) + d9) * exp2);
                d3 = exp2 * ((d8 * ((d10 * sqrt2) - 1.0d)) + (d10 * d9 * sqrt2 * sqrt2));
            }
            C1316a aVar = this.f4268l;
            aVar.f4277a = d2;
            aVar.f4278b = d3;
            if (m5665a() || (this.f4267k && m5666b())) {
                if (this.f4263g > 0.0d) {
                    double d14 = this.f4270n;
                    this.f4269m = d14;
                    this.f4268l.f4277a = d14;
                } else {
                    this.f4270n = this.f4268l.f4277a;
                    this.f4269m = this.f4270n;
                }
                this.f4268l.f4278b = 0.0d;
            }
        }
    }

    /* renamed from: a */
    private boolean m5665a() {
        return Math.abs(this.f4268l.f4278b) <= this.f4271o && (m5663a(this.f4268l) <= this.f4272p || this.f4263g == 0.0d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r5.f4268l.f4277a < r2) goto L_0x0028;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m5666b() {
        /*
            r5 = this;
            double r0 = r5.f4263g
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x002a
            double r0 = r5.f4269m
            double r2 = r5.f4270n
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0018
            com.facebook.react.animated.K$a r0 = r5.f4268l
            double r0 = r0.f4277a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0028
        L_0x0018:
            double r0 = r5.f4269m
            double r2 = r5.f4270n
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x002a
            com.facebook.react.animated.K$a r0 = r5.f4268l
            double r0 = r0.f4277a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x002a
        L_0x0028:
            r0 = 1
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.C1315K.m5666b():boolean");
    }

    /* renamed from: a */
    public void mo4833a(long j) {
        long j2 = j / 1000000;
        if (!this.f4262f) {
            if (this.f4275s == 0) {
                this.f4276t = this.f4306b.f4296e;
                this.f4275s = 1;
            }
            C1316a aVar = this.f4268l;
            double d = this.f4306b.f4296e;
            aVar.f4277a = d;
            this.f4269m = d;
            this.f4261e = j2;
            this.f4273q = 0.0d;
            this.f4262f = true;
        }
        double d2 = (double) (j2 - this.f4261e);
        Double.isNaN(d2);
        m5664a(d2 / 1000.0d);
        this.f4261e = j2;
        this.f4306b.f4296e = this.f4268l.f4277a;
        if (m5665a()) {
            int i = this.f4274r;
            if (i == -1 || this.f4275s < i) {
                this.f4262f = false;
                this.f4306b.f4296e = this.f4276t;
                this.f4275s++;
                return;
            }
            this.f4305a = true;
        }
    }

    /* renamed from: a */
    public void mo4834a(ReadableMap readableMap) {
        this.f4263g = readableMap.getDouble("stiffness");
        this.f4264h = readableMap.getDouble("damping");
        this.f4265i = readableMap.getDouble("mass");
        this.f4266j = this.f4268l.f4278b;
        this.f4270n = readableMap.getDouble("toValue");
        this.f4271o = readableMap.getDouble("restSpeedThreshold");
        this.f4272p = readableMap.getDouble("restDisplacementThreshold");
        this.f4267k = readableMap.getBoolean("overshootClamping");
        String str = "iterations";
        boolean z = true;
        this.f4274r = readableMap.hasKey(str) ? readableMap.getInt(str) : 1;
        if (this.f4274r != 0) {
            z = false;
        }
        this.f4305a = z;
        this.f4275s = 0;
        this.f4273q = 0.0d;
        this.f4262f = false;
    }
}
