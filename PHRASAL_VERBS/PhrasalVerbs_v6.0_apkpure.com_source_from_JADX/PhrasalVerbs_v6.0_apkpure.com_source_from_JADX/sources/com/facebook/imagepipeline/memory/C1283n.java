package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.C1266a.C1268b;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p045g.C0733c;

/* renamed from: com.facebook.imagepipeline.memory.n */
public class C1283n extends C1266a<NativeMemoryChunk> {

    /* renamed from: j */
    private final int[] f4177j;

    public C1283n(C0733c cVar, C1294w wVar, C1295x xVar) {
        super(cVar, wVar, xVar);
        SparseIntArray sparseIntArray = wVar.f4212c;
        this.f4177j = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f4177j;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                mo4718a();
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public NativeMemoryChunk m5529a(int i) {
        return new NativeMemoryChunk(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4719b(NativeMemoryChunk nativeMemoryChunk) {
        C0718j.m3240a(nativeMemoryChunk);
        nativeMemoryChunk.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo4722c(NativeMemoryChunk nativeMemoryChunk) {
        C0718j.m3240a(nativeMemoryChunk);
        return nativeMemoryChunk.mo4716m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo4726d(NativeMemoryChunk nativeMemoryChunk) {
        C0718j.m3240a(nativeMemoryChunk);
        return !nativeMemoryChunk.isClosed();
    }

    /* renamed from: d */
    public int mo4759d() {
        return this.f4177j[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo4725d(int i) {
        int[] iArr;
        if (i > 0) {
            for (int i2 : this.f4177j) {
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
