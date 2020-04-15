package com.facebook.react.modules.network;

/* renamed from: com.facebook.react.modules.network.l */
class C1520l implements C1527s {

    /* renamed from: a */
    long f4648a = System.nanoTime();

    /* renamed from: b */
    final /* synthetic */ C1521m f4649b;

    C1520l(C1521m mVar) {
        this.f4649b = mVar;
    }

    /* renamed from: a */
    public void mo5460a(long j, long j2, boolean z) {
        long nanoTime = System.nanoTime();
        if ((z || NetworkingModule.shouldDispatch(nanoTime, this.f4648a)) && !this.f4649b.f4650a.equals("text")) {
            C1521m mVar = this.f4649b;
            C1503B.m5986a(mVar.f4651b, mVar.f4652c, j, j2);
            this.f4648a = nanoTime;
        }
    }
}
