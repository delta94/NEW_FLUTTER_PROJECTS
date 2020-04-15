package com.facebook.react.views.scroll;

import android.os.SystemClock;

/* renamed from: com.facebook.react.views.scroll.b */
public class C1778b {

    /* renamed from: a */
    private int f5230a = Integer.MIN_VALUE;

    /* renamed from: b */
    private int f5231b = Integer.MIN_VALUE;

    /* renamed from: c */
    private float f5232c = 0.0f;

    /* renamed from: d */
    private float f5233d = 0.0f;

    /* renamed from: e */
    private long f5234e = -11;

    /* renamed from: a */
    public float mo6231a() {
        return this.f5232c;
    }

    /* renamed from: a */
    public boolean mo6232a(int i, int i2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = (uptimeMillis - this.f5234e <= 10 && this.f5230a == i && this.f5231b == i2) ? false : true;
        long j = this.f5234e;
        if (uptimeMillis - j != 0) {
            this.f5232c = ((float) (i - this.f5230a)) / ((float) (uptimeMillis - j));
            this.f5233d = ((float) (i2 - this.f5231b)) / ((float) (uptimeMillis - j));
        }
        this.f5234e = uptimeMillis;
        this.f5230a = i;
        this.f5231b = i2;
        return z;
    }

    /* renamed from: b */
    public float mo6233b() {
        return this.f5233d;
    }
}
