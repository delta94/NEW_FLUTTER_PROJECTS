package com.facebook.react.uimanager;

import com.facebook.yoga.C1943a;

/* renamed from: com.facebook.react.uimanager.M */
public class C1577M {

    /* renamed from: a */
    private static final int[] f4780a = {1, 2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: b */
    private final float[] f4781b;

    /* renamed from: c */
    private int f4782c;

    /* renamed from: d */
    private final float f4783d;

    /* renamed from: e */
    private boolean f4784e;

    public C1577M() {
        this(0.0f);
    }

    public C1577M(float f) {
        this.f4782c = 0;
        this.f4783d = f;
        this.f4781b = m6259a();
    }

    /* renamed from: a */
    private static float[] m6259a() {
        return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    }

    /* renamed from: a */
    public float mo5689a(int i) {
        float f = (i == 4 || i == 5) ? Float.NaN : this.f4783d;
        int i2 = this.f4782c;
        if (i2 == 0) {
            return f;
        }
        if ((i2 & f4780a[i]) != 0) {
            return this.f4781b[i];
        }
        if (this.f4784e) {
            char c = (i == 1 || i == 3) ? (char) 7 : 6;
            int i3 = this.f4782c;
            int[] iArr = f4780a;
            if ((iArr[c] & i3) != 0) {
                return this.f4781b[c];
            }
            if ((i3 & iArr[8]) != 0) {
                return this.f4781b[8];
            }
        }
        return f;
    }

    /* renamed from: a */
    public boolean mo5690a(int i, float f) {
        int i2;
        boolean z = false;
        if (C1681i.m6531a(this.f4781b[i], f)) {
            return false;
        }
        this.f4781b[i] = f;
        if (C1943a.m7432a(f)) {
            i2 = (f4780a[i] ^ -1) & this.f4782c;
        } else {
            i2 = f4780a[i] | this.f4782c;
        }
        this.f4782c = i2;
        int i3 = this.f4782c;
        int[] iArr = f4780a;
        if (!((iArr[8] & i3) == 0 && (iArr[7] & i3) == 0 && (i3 & iArr[6]) == 0)) {
            z = true;
        }
        this.f4784e = z;
        return true;
    }

    /* renamed from: b */
    public float mo5691b(int i) {
        return this.f4781b[i];
    }
}
