package com.facebook.imagepipeline.memory;

import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p045g.C0733c;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p038c.p046h.C0746d;

/* renamed from: com.facebook.imagepipeline.memory.l */
public class C1280l {

    /* renamed from: a */
    private final C0746d<byte[]> f4174a;

    /* renamed from: b */
    final C1281a f4175b;

    /* renamed from: com.facebook.imagepipeline.memory.l$a */
    static class C1281a extends C1282m {
        public C1281a(C0733c cVar, C1294w wVar, C1295x xVar) {
            super(cVar, wVar, xVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C1274f<byte[]> mo4728f(int i) {
            mo4727e(i);
            return new C1289s(i, this.f4147c.f4216g, 0);
        }
    }

    public C1280l(C0733c cVar, C1294w wVar) {
        C0718j.m3243a(wVar.f4216g > 0);
        this.f4175b = new C1281a(cVar, wVar, C1288r.m5557c());
        this.f4174a = new C1279k(this);
    }

    /* renamed from: a */
    public C0744b<byte[]> mo4752a(int i) {
        return C0744b.m3335a(this.f4175b.get(i), this.f4174a);
    }

    /* renamed from: a */
    public void mo4753a(byte[] bArr) {
        this.f4175b.mo3486a(bArr);
    }
}
