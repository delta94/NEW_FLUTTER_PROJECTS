package com.facebook.react.modules.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Handler;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C1401i;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import p000a.p005b.p009c.p010a.C0039a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "LocationObserver")
@SuppressLint({"MissingPermission"})
public class LocationModule extends ReactContextBaseJavaModule {
    public static final String NAME = "LocationObserver";
    private static final float RCT_DEFAULT_LOCATION_ACCURACY = 100.0f;
    private final LocationListener mLocationListener = new C1496a(this);
    private String mWatchedProvider;

    /* renamed from: com.facebook.react.modules.location.LocationModule$a */
    private static class C1494a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final long f4605a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final double f4606b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final boolean f4607c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final float f4608d;

        private C1494a(long j, double d, boolean z, float f) {
            this.f4605a = j;
            this.f4606b = d;
            this.f4607c = z;
            this.f4608d = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C1494a m5957b(ReadableMap readableMap) {
            String str = "timeout";
            long j = readableMap.hasKey(str) ? (long) readableMap.getDouble(str) : Long.MAX_VALUE;
            String str2 = "maximumAge";
            double d = readableMap.hasKey(str2) ? readableMap.getDouble(str2) : Double.POSITIVE_INFINITY;
            String str3 = "enableHighAccuracy";
            boolean z = readableMap.hasKey(str3) && readableMap.getBoolean(str3);
            String str4 = "distanceFilter";
            C1494a aVar = new C1494a(j, d, z, readableMap.hasKey(str4) ? (float) readableMap.getDouble(str4) : LocationModule.RCT_DEFAULT_LOCATION_ACCURACY);
            return aVar;
        }
    }

    /* renamed from: com.facebook.react.modules.location.LocationModule$b */
    private static class C1495b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Callback f4609a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Callback f4610b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final LocationManager f4611c;

        /* renamed from: d */
        private final String f4612d;

        /* renamed from: e */
        private final long f4613e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Location f4614f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final Handler f4615g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final Runnable f4616h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final LocationListener f4617i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f4618j;

        private C1495b(LocationManager locationManager, String str, long j, Callback callback, Callback callback2) {
            this.f4615g = new Handler();
            this.f4616h = new C1497b(this);
            this.f4617i = new C1498c(this);
            this.f4611c = locationManager;
            this.f4612d = str;
            this.f4613e = j;
            this.f4609a = callback;
            this.f4610b = callback2;
        }

        /* synthetic */ C1495b(LocationManager locationManager, String str, long j, Callback callback, Callback callback2, C1496a aVar) {
            this(locationManager, str, j, callback, callback2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean m5962a(Location location, Location location2) {
            if (location2 == null) {
                return true;
            }
            long time = location.getTime() - location2.getTime();
            boolean z = time > 120000;
            boolean z2 = time < -120000;
            boolean z3 = time > 0;
            if (z) {
                return true;
            }
            if (z2) {
                return false;
            }
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            boolean z4 = accuracy > 0;
            boolean z5 = accuracy < 0;
            boolean z6 = accuracy > 200;
            boolean a = m5965a(location.getProvider(), location2.getProvider());
            if (z5) {
                return true;
            }
            if (!z3 || z4) {
                return z3 && !z6 && a;
            }
            return true;
        }

        /* renamed from: a */
        private boolean m5965a(String str, String str2) {
            if (str != null) {
                return str.equals(str2);
            }
            return str2 == null;
        }

        /* renamed from: a */
        public void mo5408a(Location location) {
            this.f4614f = location;
            this.f4611c.requestLocationUpdates(this.f4612d, 100, 1.0f, this.f4617i);
            this.f4615g.postDelayed(this.f4616h, this.f4613e);
        }
    }

    public LocationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public void emitError(int i, String str) {
        ((RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("geolocationError", C1499d.m5974a(i, str));
    }

    private String getValidProvider(LocationManager locationManager, boolean z) {
        String str = "network";
        String str2 = "gps";
        String str3 = z ? str2 : str;
        if (!locationManager.isProviderEnabled(str3)) {
            str3 = str3.equals(str2) ? str : str2;
            if (!locationManager.isProviderEnabled(str3)) {
                return null;
            }
        }
        int a = C0039a.m106a((Context) getReactApplicationContext(), "android.permission.ACCESS_FINE_LOCATION");
        if (!str3.equals(str2) || a == 0) {
            return str3;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static WritableMap locationToMap(Location location) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("latitude", location.getLatitude());
        createMap2.putDouble("longitude", location.getLongitude());
        createMap2.putDouble("altitude", location.getAltitude());
        createMap2.putDouble("accuracy", (double) location.getAccuracy());
        createMap2.putDouble("heading", (double) location.getBearing());
        createMap2.putDouble("speed", (double) location.getSpeed());
        createMap.putMap("coords", createMap2);
        createMap.putDouble("timestamp", (double) location.getTime());
        if (VERSION.SDK_INT >= 18) {
            createMap.putBoolean("mocked", location.isFromMockProvider());
        }
        return createMap;
    }

    private static void throwLocationPermissionMissing(SecurityException securityException) {
        throw new SecurityException("Looks like the app doesn't have the permission to access location.\nAdd the following line to your app's AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_FINE_LOCATION\" />", securityException);
    }

    @ReactMethod
    public void getCurrentPosition(ReadableMap readableMap, Callback callback, Callback callback2) {
        C1494a a = C1494a.m5957b(readableMap);
        try {
            LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService("location");
            String validProvider = getValidProvider(locationManager, a.f4607c);
            if (validProvider == null) {
                callback2.invoke(C1499d.m5974a(C1499d.f4623b, "No location provider available."));
                return;
            }
            Location lastKnownLocation = locationManager.getLastKnownLocation(validProvider);
            if (lastKnownLocation == null || ((double) (C1401i.m5751a() - lastKnownLocation.getTime())) >= a.f4606b) {
                C1495b bVar = new C1495b(locationManager, validProvider, a.f4605a, callback, callback2, null);
                bVar.mo5408a(lastKnownLocation);
                return;
            }
            callback.invoke(locationToMap(lastKnownLocation));
        } catch (SecurityException e) {
            throwLocationPermissionMissing(e);
            throw null;
        }
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void startObserving(ReadableMap readableMap) {
        if (!"gps".equals(this.mWatchedProvider)) {
            C1494a a = C1494a.m5957b(readableMap);
            try {
                LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService("location");
                String validProvider = getValidProvider(locationManager, a.f4607c);
                if (validProvider == null) {
                    emitError(C1499d.f4623b, "No location provider available.");
                    return;
                }
                if (!validProvider.equals(this.mWatchedProvider)) {
                    locationManager.removeUpdates(this.mLocationListener);
                    locationManager.requestLocationUpdates(validProvider, 1000, a.f4608d, this.mLocationListener);
                }
                this.mWatchedProvider = validProvider;
            } catch (SecurityException e) {
                throwLocationPermissionMissing(e);
                throw null;
            }
        }
    }

    @ReactMethod
    public void stopObserving() {
        ((LocationManager) getReactApplicationContext().getSystemService("location")).removeUpdates(this.mLocationListener);
        this.mWatchedProvider = null;
    }
}
