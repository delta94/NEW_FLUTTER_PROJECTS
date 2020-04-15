package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.jsi.EventEmitterWrapper;
import com.facebook.react.fabric.p119a.C1418b;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.h */
public class C1431h implements C1428e {

    /* renamed from: a */
    private final EventEmitterWrapper f4451a;

    /* renamed from: b */
    private final int f4452b;

    public C1431h(int i, EventEmitterWrapper eventEmitterWrapper) {
        this.f4452b = i;
        this.f4451a = eventEmitterWrapper;
    }

    /* renamed from: a */
    public void mo5251a(C1418b bVar) {
        bVar.mo5234a(this.f4452b, this.f4451a);
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateEventEmitterMountItem [");
        sb.append(this.f4452b);
        sb.append("]");
        return sb.toString();
    }
}
