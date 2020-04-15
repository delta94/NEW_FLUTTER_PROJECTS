package com.facebook.react.modules.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: com.facebook.react.modules.location.c */
class C1498c implements LocationListener {

    /* renamed from: a */
    final /* synthetic */ C1495b f4621a;

    C1498c(C1495b bVar) {
        this.f4621a = bVar;
    }

    public void onLocationChanged(Location location) {
        synchronized (this.f4621a) {
            if (!this.f4621a.f4618j && this.f4621a.m5962a(location, this.f4621a.f4614f)) {
                this.f4621a.f4609a.invoke(LocationModule.locationToMap(location));
                this.f4621a.f4615g.removeCallbacks(this.f4621a.f4616h);
                this.f4621a.f4618j = true;
                this.f4621a.f4611c.removeUpdates(this.f4621a.f4617i);
            }
            this.f4621a.f4614f = location;
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
