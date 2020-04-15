package com.facebook.imagepipeline.memory;

import java.io.IOException;
import java.io.InputStream;
import p032c.p033a.p038c.p042d.C0726r;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p038c.p045g.C0742k;

/* renamed from: com.facebook.imagepipeline.memory.p */
public class C1285p implements C0739h {

    /* renamed from: a */
    private final C0742k f4180a;

    /* renamed from: b */
    private final C1283n f4181b;

    public C1285p(C1283n nVar, C0742k kVar) {
        this.f4181b = nVar;
        this.f4180a = kVar;
    }

    /* renamed from: a */
    public C1284o m5547a(InputStream inputStream) {
        C1286q qVar = new C1286q(this.f4181b);
        try {
            return mo4762a(inputStream, qVar);
        } finally {
            qVar.close();
        }
    }

    /* renamed from: a */
    public C1284o m5548a(InputStream inputStream, int i) {
        C1286q qVar = new C1286q(this.f4181b, i);
        try {
            return mo4762a(inputStream, qVar);
        } finally {
            qVar.close();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1284o mo4762a(InputStream inputStream, C1286q qVar) {
        this.f4180a.mo3514a(inputStream, qVar);
        return qVar.mo3512m();
    }

    /* renamed from: a */
    public C1284o m5550a(byte[] bArr) {
        C1286q qVar = new C1286q(this.f4181b, bArr.length);
        try {
            qVar.write(bArr, 0, bArr.length);
            C1284o m = qVar.mo3512m();
            qVar.close();
            return m;
        } catch (IOException e) {
            C0726r.m3253a(e);
            throw null;
        } catch (Throwable th) {
            qVar.close();
            throw th;
        }
    }

    /* renamed from: a */
    public C1286q m5551a() {
        return new C1286q(this.f4181b);
    }

    /* renamed from: a */
    public C1286q m5552a(int i) {
        return new C1286q(this.f4181b, i);
    }
}
