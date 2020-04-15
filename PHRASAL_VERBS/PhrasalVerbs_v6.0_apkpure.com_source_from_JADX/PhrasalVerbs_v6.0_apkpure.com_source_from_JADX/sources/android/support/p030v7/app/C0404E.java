package android.support.p030v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import p000a.p005b.p009c.p010a.C0060d;

/* renamed from: android.support.v7.app.E */
class C0404E {

    /* renamed from: a */
    private static C0404E f1381a;

    /* renamed from: b */
    private final Context f1382b;

    /* renamed from: c */
    private final LocationManager f1383c;

    /* renamed from: d */
    private final C0405a f1384d = new C0405a();

    /* renamed from: android.support.v7.app.E$a */
    private static class C0405a {

        /* renamed from: a */
        boolean f1385a;

        /* renamed from: b */
        long f1386b;

        /* renamed from: c */
        long f1387c;

        /* renamed from: d */
        long f1388d;

        /* renamed from: e */
        long f1389e;

        /* renamed from: f */
        long f1390f;

        C0405a() {
        }
    }

    C0404E(Context context, LocationManager locationManager) {
        this.f1382b = context;
        this.f1383c = locationManager;
    }

    /* renamed from: a */
    private Location m1849a(String str) {
        try {
            if (this.f1383c.isProviderEnabled(str)) {
                return this.f1383c.getLastKnownLocation(str);
            }
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    /* renamed from: a */
    static C0404E m1850a(Context context) {
        if (f1381a == null) {
            Context applicationContext = context.getApplicationContext();
            f1381a = new C0404E(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1381a;
    }

    /* renamed from: a */
    private void m1851a(Location location) {
        long j;
        C0405a aVar = this.f1384d;
        long currentTimeMillis = System.currentTimeMillis();
        C0403D a = C0403D.m1847a();
        C0403D d = a;
        d.mo1861a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f1378b;
        d.mo1861a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f1380d == 1;
        long j3 = a.f1379c;
        long j4 = j2;
        long j5 = a.f1378b;
        long j6 = j3;
        boolean z2 = z;
        a.mo1861a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = a.f1379c;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            long j8 = currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6;
            j = j8 + 60000;
        }
        aVar.f1385a = z2;
        aVar.f1386b = j4;
        aVar.f1387c = j6;
        aVar.f1388d = j5;
        aVar.f1389e = j7;
        aVar.f1390f = j;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m1852b() {
        Location location = null;
        Location a = C0060d.m189a(this.f1382b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m1849a("network") : null;
        if (C0060d.m189a(this.f1382b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m1849a("gps");
        }
        if (location == null || a == null) {
            if (location != null) {
                a = location;
            }
            return a;
        }
        if (location.getTime() > a.getTime()) {
            a = location;
        }
        return a;
    }

    /* renamed from: c */
    private boolean m1853c() {
        return this.f1384d.f1390f > System.currentTimeMillis();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1862a() {
        C0405a aVar = this.f1384d;
        if (m1853c()) {
            return aVar.f1385a;
        }
        Location b = m1852b();
        if (b != null) {
            m1851a(b);
            return aVar.f1385a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
