package com.facebook.imagepipeline.memory;

import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p045g.C0737g;
import p032c.p033a.p038c.p045g.C0737g.C0738a;
import p032c.p033a.p038c.p046h.C0744b;

/* renamed from: com.facebook.imagepipeline.memory.o */
public class C1284o implements C0737g {

    /* renamed from: a */
    private final int f4178a;

    /* renamed from: b */
    C0744b<NativeMemoryChunk> f4179b;

    public C1284o(C0744b<NativeMemoryChunk> bVar, int i) {
        C0718j.m3240a(bVar);
        C0718j.m3243a(i >= 0 && i <= ((NativeMemoryChunk) bVar.mo3520n()).mo4716m());
        this.f4179b = bVar.clone();
        this.f4178a = i;
    }

    /* renamed from: a */
    public synchronized byte mo3494a(int i) {
        mo4760a();
        boolean z = true;
        C0718j.m3243a(i >= 0);
        if (i >= this.f4178a) {
            z = false;
        }
        C0718j.m3243a(z);
        return ((NativeMemoryChunk) this.f4179b.mo3520n()).mo4709a(i);
    }

    /* renamed from: a */
    public synchronized int mo3495a(int i, byte[] bArr, int i2, int i3) {
        mo4760a();
        C0718j.m3243a(i + i3 <= this.f4178a);
        return ((NativeMemoryChunk) this.f4179b.mo3520n()).mo4710a(i, bArr, i2, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo4760a() {
        if (isClosed()) {
            throw new C0738a();
        }
    }

    public synchronized void close() {
        C0744b.m3336b(this.f4179b);
        this.f4179b = null;
    }

    public synchronized boolean isClosed() {
        return !C0744b.m3337c(this.f4179b);
    }

    public synchronized int size() {
        mo4760a();
        return this.f4178a;
    }
}
