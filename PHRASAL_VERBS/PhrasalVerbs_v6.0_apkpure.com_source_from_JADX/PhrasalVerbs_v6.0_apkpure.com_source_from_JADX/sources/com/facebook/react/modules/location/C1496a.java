package com.facebook.react.modules.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;

/* renamed from: com.facebook.react.modules.location.a */
class C1496a implements LocationListener {

    /* renamed from: a */
    final /* synthetic */ LocationModule f4619a;

    C1496a(LocationModule locationModule) {
        this.f4619a = locationModule;
    }

    public void onLocationChanged(Location location) {
        ((RCTDeviceEventEmitter) this.f4619a.getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("geolocationDidChange", LocationModule.locationToMap(location));
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        LocationModule locationModule;
        int i2;
        StringBuilder sb;
        String str2;
        String str3 = "Provider ";
        if (i == 0) {
            locationModule = this.f4619a;
            i2 = C1499d.f4623b;
            sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            str2 = " is out of service.";
        } else if (i == 1) {
            locationModule = this.f4619a;
            i2 = C1499d.f4624c;
            sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            str2 = " is temporarily unavailable.";
        } else {
            return;
        }
        sb.append(str2);
        locationModule.emitError(i2, sb.toString());
    }
}
