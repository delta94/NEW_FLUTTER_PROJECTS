package com.facebook.react.modules.network;

import p133e.C2000D;
import p133e.C2011g;
import p133e.C2017l;

/* renamed from: com.facebook.react.modules.network.v */
class C1530v extends C2017l {

    /* renamed from: a */
    final /* synthetic */ C1531w f4670a;

    C1530v(C1531w wVar, C2000D d) {
        this.f4670a = wVar;
        super(d);
    }

    public long read(C2011g gVar, long j) {
        long read = super.read(gVar, j);
        C1531w wVar = this.f4670a;
        wVar.f4674d = wVar.f4674d + (read != -1 ? read : 0);
        this.f4670a.f4672b.mo5460a(this.f4670a.f4674d, this.f4670a.f4671a.contentLength(), read == -1);
        return read;
    }
}
