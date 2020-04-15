package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: com.facebook.imagepipeline.memory.w */
public class C1294w {

    /* renamed from: a */
    public final int f4210a;

    /* renamed from: b */
    public final int f4211b;

    /* renamed from: c */
    public final SparseIntArray f4212c;

    /* renamed from: d */
    public final int f4213d;

    /* renamed from: e */
    public final int f4214e;

    /* renamed from: f */
    public boolean f4215f;

    /* renamed from: g */
    public final int f4216g;

    public C1294w(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public C1294w(int i, int i2, SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        C0718j.m3247b(i >= 0 && i2 >= i);
        this.f4211b = i;
        this.f4210a = i2;
        this.f4212c = sparseIntArray;
        this.f4213d = i3;
        this.f4214e = i4;
        this.f4216g = i5;
    }
}
