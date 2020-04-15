package com.facebook.react.modules.location;

import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.modules.location.b */
class C1497b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1495b f4620a;

    C1497b(C1495b bVar) {
        this.f4620a = bVar;
    }

    public void run() {
        synchronized (this.f4620a) {
            if (!this.f4620a.f4618j) {
                this.f4620a.f4610b.invoke(C1499d.m5974a(C1499d.f4624c, "Location request timed out"));
                this.f4620a.f4611c.removeUpdates(this.f4620a.f4617i);
                C0727a.m3281c("ReactNative", "LocationModule: Location request timed out");
                this.f4620a.f4618j = true;
            }
        }
    }
}
