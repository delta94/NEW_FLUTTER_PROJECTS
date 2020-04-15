package com.facebook.react.uimanager.events;

import java.util.Comparator;

/* renamed from: com.facebook.react.uimanager.events.d */
class C1636d implements Comparator<C1635c> {
    C1636d() {
    }

    /* renamed from: a */
    public int compare(C1635c cVar, C1635c cVar2) {
        if (cVar == null && cVar2 == null) {
            return 0;
        }
        if (cVar == null) {
            return -1;
        }
        if (cVar2 == null) {
            return 1;
        }
        long e = cVar.mo5875e() - cVar2.mo5875e();
        if (e == 0) {
            return 0;
        }
        return e < 0 ? -1 : 1;
    }
}
