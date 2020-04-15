package com.facebook.imagepipeline.memory;

import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p045g.C0741j;
import p032c.p033a.p038c.p046h.C0744b;

/* renamed from: com.facebook.imagepipeline.memory.q */
public class C1286q extends C0741j {

    /* renamed from: a */
    private final C1283n f4182a;

    /* renamed from: b */
    private C0744b<NativeMemoryChunk> f4183b;

    /* renamed from: c */
    private int f4184c;

    /* renamed from: com.facebook.imagepipeline.memory.q$a */
    public static class C1287a extends RuntimeException {
        public C1287a() {
            super("OutputStream no longer valid");
        }
    }

    public C1286q(C1283n nVar) {
        this(nVar, nVar.mo4759d());
    }

    public C1286q(C1283n nVar, int i) {
        C0718j.m3243a(i > 0);
        C0718j.m3240a(nVar);
        this.f4182a = nVar;
        this.f4184c = 0;
        this.f4183b = C0744b.m3335a(this.f4182a.get(i), this.f4182a);
    }

    /* renamed from: n */
    private void m5553n() {
        if (!C0744b.m3337c(this.f4183b)) {
            throw new C1287a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4763b(int i) {
        m5553n();
        if (i > ((NativeMemoryChunk) this.f4183b.mo3520n()).mo4716m()) {
            NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) this.f4182a.get(i);
            ((NativeMemoryChunk) this.f4183b.mo3520n()).mo4711a(0, nativeMemoryChunk, 0, this.f4184c);
            this.f4183b.close();
            this.f4183b = C0744b.m3335a(nativeMemoryChunk, this.f4182a);
        }
    }

    public void close() {
        C0744b.m3336b(this.f4183b);
        this.f4183b = null;
        this.f4184c = -1;
        super.close();
    }

    /* renamed from: m */
    public C1284o m5556m() {
        m5553n();
        return new C1284o(this.f4183b, this.f4184c);
    }

    public int size() {
        return this.f4184c;
    }

    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    public void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("length=");
            sb.append(bArr.length);
            sb.append("; regionStart=");
            sb.append(i);
            sb.append("; regionLength=");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        m5553n();
        mo4763b(this.f4184c + i2);
        ((NativeMemoryChunk) this.f4183b.mo3520n()).mo4712b(this.f4184c, bArr, i, i2);
        this.f4184c += i2;
    }
}
