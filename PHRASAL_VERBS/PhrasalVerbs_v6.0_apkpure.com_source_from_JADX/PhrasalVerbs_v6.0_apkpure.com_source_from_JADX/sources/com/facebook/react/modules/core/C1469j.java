package com.facebook.react.modules.core;

import java.util.Comparator;

/* renamed from: com.facebook.react.modules.core.j */
class C1469j implements Comparator<C1455c> {

    /* renamed from: a */
    final /* synthetic */ Timing f4536a;

    C1469j(Timing timing) {
        this.f4536a = timing;
    }

    /* renamed from: a */
    public int compare(C1455c cVar, C1455c cVar2) {
        long a = cVar.f4510d - cVar2.f4510d;
        if (a == 0) {
            return 0;
        }
        return a < 0 ? -1 : 1;
    }
}
