package com.facebook.yoga;

/* renamed from: com.facebook.yoga.b */
public class C1944b {
    /* renamed from: a */
    public static long m7433a(float f, float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        return ((long) Float.floatToRawIntBits(f2)) | (((long) floatToRawIntBits) << 32);
    }

    /* renamed from: a */
    public static long m7434a(int i, int i2) {
        return m7433a((float) i, (float) i2);
    }
}
