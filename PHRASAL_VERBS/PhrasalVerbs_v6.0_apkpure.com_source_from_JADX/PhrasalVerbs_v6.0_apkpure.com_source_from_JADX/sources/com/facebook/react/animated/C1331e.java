package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.e */
public class C1331e extends C1330d {

    /* renamed from: e */
    private final double f4309e;

    /* renamed from: f */
    private double f4310f;

    /* renamed from: g */
    private long f4311g;

    /* renamed from: h */
    private double f4312h;

    /* renamed from: i */
    private double f4313i;

    /* renamed from: j */
    private int f4314j;

    /* renamed from: k */
    private int f4315k;

    public C1331e(ReadableMap readableMap) {
        this.f4309e = readableMap.getDouble("velocity");
        mo4834a(readableMap);
    }

    /* renamed from: a */
    public void mo4833a(long j) {
        long j2 = j / 1000000;
        if (this.f4311g == -1) {
            this.f4311g = j2 - 16;
            double d = this.f4312h;
            if (d == this.f4313i) {
                this.f4312h = this.f4306b.f4296e;
            } else {
                this.f4306b.f4296e = d;
            }
            this.f4313i = this.f4306b.f4296e;
        }
        double d2 = this.f4312h;
        double d3 = this.f4309e;
        double d4 = this.f4310f;
        double d5 = d3 / (1.0d - d4);
        double d6 = -(1.0d - d4);
        double d7 = (double) (j2 - this.f4311g);
        Double.isNaN(d7);
        double exp = d2 + (d5 * (1.0d - Math.exp(d6 * d7)));
        if (Math.abs(this.f4313i - exp) < 0.1d) {
            int i = this.f4314j;
            if (i == -1 || this.f4315k < i) {
                this.f4311g = -1;
                this.f4315k++;
            } else {
                this.f4305a = true;
                return;
            }
        }
        this.f4313i = exp;
        this.f4306b.f4296e = exp;
    }

    /* renamed from: a */
    public void mo4834a(ReadableMap readableMap) {
        this.f4310f = readableMap.getDouble("deceleration");
        String str = "iterations";
        boolean z = true;
        this.f4314j = readableMap.hasKey(str) ? readableMap.getInt(str) : 1;
        this.f4315k = 1;
        if (this.f4314j != 0) {
            z = false;
        }
        this.f4305a = z;
        this.f4311g = -1;
        this.f4312h = 0.0d;
        this.f4313i = 0.0d;
    }
}
