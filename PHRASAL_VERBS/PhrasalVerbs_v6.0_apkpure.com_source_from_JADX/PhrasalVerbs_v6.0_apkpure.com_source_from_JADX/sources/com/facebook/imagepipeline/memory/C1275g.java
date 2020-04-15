package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* renamed from: com.facebook.imagepipeline.memory.g */
public class C1275g {

    /* renamed from: a */
    private static final SparseIntArray f4171a = new SparseIntArray(0);

    /* renamed from: a */
    public static C1294w m5507a() {
        return new C1294w(0, m5508b(), f4171a);
    }

    /* renamed from: b */
    private static int m5508b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return min > 16777216 ? (min / 4) * 3 : min / 2;
    }
}
