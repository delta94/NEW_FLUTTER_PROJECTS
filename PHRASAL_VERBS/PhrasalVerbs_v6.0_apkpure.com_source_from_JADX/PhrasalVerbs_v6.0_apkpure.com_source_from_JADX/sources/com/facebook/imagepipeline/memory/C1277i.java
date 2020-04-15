package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* renamed from: com.facebook.imagepipeline.memory.i */
public class C1277i {

    /* renamed from: a */
    public static final int f4172a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static SparseIntArray m5510a(int i, int i2, int i3) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i <= i2) {
            sparseIntArray.put(i, i3);
            i *= 2;
        }
        return sparseIntArray;
    }

    /* renamed from: a */
    public static C1294w m5511a() {
        int i = f4172a;
        C1294w wVar = new C1294w(4194304, i * 4194304, m5510a(131072, 4194304, i), 131072, 4194304, f4172a);
        return wVar;
    }
}
