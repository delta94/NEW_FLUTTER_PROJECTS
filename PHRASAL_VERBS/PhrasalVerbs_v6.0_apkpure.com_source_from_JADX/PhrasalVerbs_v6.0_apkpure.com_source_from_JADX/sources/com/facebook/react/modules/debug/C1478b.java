package com.facebook.react.modules.debug;

import com.facebook.react.modules.core.C1458b;
import com.facebook.react.modules.core.C1458b.C1459a;

/* renamed from: com.facebook.react.modules.debug.b */
class C1478b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1479c f4554a;

    /* renamed from: b */
    final /* synthetic */ C1479c f4555b;

    C1478b(C1479c cVar, C1479c cVar2) {
        this.f4555b = cVar;
        this.f4554a = cVar2;
    }

    public void run() {
        this.f4555b.f4556b = C1458b.m5865a();
        this.f4555b.f4556b.mo5334a((C1459a) this.f4554a);
    }
}
