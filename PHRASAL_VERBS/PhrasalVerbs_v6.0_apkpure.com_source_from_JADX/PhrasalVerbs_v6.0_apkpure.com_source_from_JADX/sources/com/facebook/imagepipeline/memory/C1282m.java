package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.C1266a.C1268b;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p045g.C0731a;
import p032c.p033a.p038c.p045g.C0733c;

/* renamed from: com.facebook.imagepipeline.memory.m */
public class C1282m extends C1266a<byte[]> implements C0731a {

    /* renamed from: j */
    private final int[] f4176j;

    public C1282m(C0733c cVar, C1294w wVar, C1295x xVar) {
        super(cVar, wVar, xVar);
        SparseIntArray sparseIntArray = wVar.f4212c;
        this.f4176j = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.f4176j[i] = sparseIntArray.keyAt(i);
        }
        mo4718a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4719b(byte[] bArr) {
        C0718j.m3240a(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] m5522a(int i) {
        return new byte[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo4722c(byte[] bArr) {
        C0718j.m3240a(bArr);
        return bArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo4725d(int i) {
        int[] iArr;
        if (i > 0) {
            for (int i2 : this.f4176j) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new C1268b(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo4727e(int i) {
        return i;
    }
}
