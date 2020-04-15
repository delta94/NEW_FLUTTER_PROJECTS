package com.facebook.react.modules.netinfo;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import p000a.p005b.p009c.p015d.C0078a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "NetInfo")
@SuppressLint({"MissingPermission"})
public class NetInfoModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private static final String CONNECTION_TYPE_BLUETOOTH = "bluetooth";
    private static final String CONNECTION_TYPE_CELLULAR = "cellular";
    private static final String CONNECTION_TYPE_ETHERNET = "ethernet";
    private static final String CONNECTION_TYPE_NONE = "none";
    private static final String CONNECTION_TYPE_NONE_DEPRECATED = "NONE";
    private static final String CONNECTION_TYPE_UNKNOWN = "unknown";
    private static final String CONNECTION_TYPE_UNKNOWN_DEPRECATED = "UNKNOWN";
    private static final String CONNECTION_TYPE_WIFI = "wifi";
    private static final String CONNECTION_TYPE_WIMAX = "wimax";
    private static final String EFFECTIVE_CONNECTION_TYPE_2G = "2g";
    private static final String EFFECTIVE_CONNECTION_TYPE_3G = "3g";
    private static final String EFFECTIVE_CONNECTION_TYPE_4G = "4g";
    private static final String EFFECTIVE_CONNECTION_TYPE_UNKNOWN = "unknown";
    private static final String ERROR_MISSING_PERMISSION = "E_MISSING_PERMISSION";
    private static final String MISSING_PERMISSION_MESSAGE = "To use NetInfo on Android, add the following to your AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />";
    public static final String NAME = "NetInfo";
    private String mConnectionType;
    private final C1500a mConnectivityBroadcastReceiver;
    private String mConnectivityDeprecated = CONNECTION_TYPE_UNKNOWN_DEPRECATED;
    private final ConnectivityManager mConnectivityManager;
    private String mEffectiveConnectionType;
    private boolean mNoNetworkPermission = false;

    /* renamed from: com.facebook.react.modules.netinfo.NetInfoModule$a */
    private class C1500a extends BroadcastReceiver {

        /* renamed from: a */
        private boolean f4625a;

        private C1500a() {
            this.f4625a = false;
        }

        /* renamed from: a */
        public void mo5420a(boolean z) {
            this.f4625a = z;
        }

        /* renamed from: a */
        public boolean mo5421a() {
            return this.f4625a;
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                NetInfoModule.this.updateAndSendConnectionType();
            }
        }
    }

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        String str = "unknown";
        this.mConnectionType = str;
        this.mEffectiveConnectionType = str;
        this.mConnectivityManager = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.mConnectivityBroadcastReceiver = new C1500a();
    }

    private WritableMap createConnectivityEventMap() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("network_info", this.mConnectivityDeprecated);
        writableNativeMap.putString("connectionType", this.mConnectionType);
        writableNativeMap.putString("effectiveConnectionType", this.mEffectiveConnectionType);
        return writableNativeMap;
    }

    private String getCurrentConnectionType() {
        String str = CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        try {
            NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    if (ConnectivityManager.isNetworkTypeValid(activeNetworkInfo.getType())) {
                        str = activeNetworkInfo.getTypeName().toUpperCase();
                    }
                    return str;
                }
            }
            return CONNECTION_TYPE_NONE_DEPRECATED;
        } catch (SecurityException unused) {
            this.mNoNetworkPermission = true;
            return str;
        }
    }

    private String getEffectiveConnectionType(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return EFFECTIVE_CONNECTION_TYPE_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
                return EFFECTIVE_CONNECTION_TYPE_3G;
            case 13:
            case 15:
                return EFFECTIVE_CONNECTION_TYPE_4G;
            default:
                return "unknown";
        }
    }

    private void registerReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        getReactApplicationContext().registerReceiver(this.mConnectivityBroadcastReceiver, intentFilter);
        this.mConnectivityBroadcastReceiver.mo5420a(true);
        updateAndSendConnectionType();
    }

    private void sendConnectivityChangedEvent() {
        ((RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("networkStatusDidChange", createConnectivityEventMap());
    }

    private void unregisterReceiver() {
        if (this.mConnectivityBroadcastReceiver.mo5421a()) {
            getReactApplicationContext().unregisterReceiver(this.mConnectivityBroadcastReceiver);
            this.mConnectivityBroadcastReceiver.mo5420a(false);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateAndSendConnectionType() {
        /*
            r6 = this;
            java.lang.String r0 = "unknown"
            r1 = 1
            android.net.ConnectivityManager r2 = r6.mConnectivityManager     // Catch:{ SecurityException -> 0x0043 }
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0043 }
            if (r2 == 0) goto L_0x003d
            boolean r3 = r2.isConnected()     // Catch:{ SecurityException -> 0x0043 }
            if (r3 != 0) goto L_0x0012
            goto L_0x003d
        L_0x0012:
            int r3 = r2.getType()     // Catch:{ SecurityException -> 0x0043 }
            if (r3 == 0) goto L_0x0034
            if (r3 == r1) goto L_0x0031
            r4 = 4
            if (r3 == r4) goto L_0x0034
            r2 = 9
            if (r3 == r2) goto L_0x002e
            r2 = 6
            if (r3 == r2) goto L_0x002b
            r2 = 7
            if (r3 == r2) goto L_0x0028
            goto L_0x0045
        L_0x0028:
            java.lang.String r1 = "bluetooth"
            goto L_0x003f
        L_0x002b:
            java.lang.String r1 = "wimax"
            goto L_0x003f
        L_0x002e:
            java.lang.String r1 = "ethernet"
            goto L_0x003f
        L_0x0031:
            java.lang.String r1 = "wifi"
            goto L_0x003f
        L_0x0034:
            java.lang.String r3 = "cellular"
            java.lang.String r0 = r6.getEffectiveConnectionType(r2)     // Catch:{ SecurityException -> 0x0043 }
            r1 = r0
            r0 = r3
            goto L_0x0046
        L_0x003d:
            java.lang.String r1 = "none"
        L_0x003f:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x0046
        L_0x0043:
            r6.mNoNetworkPermission = r1
        L_0x0045:
            r1 = r0
        L_0x0046:
            java.lang.String r2 = r6.getCurrentConnectionType()
            java.lang.String r3 = r6.mConnectionType
            boolean r3 = r0.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0062
            java.lang.String r3 = r6.mEffectiveConnectionType
            boolean r3 = r1.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0062
            java.lang.String r3 = r6.mConnectivityDeprecated
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 != 0) goto L_0x006b
        L_0x0062:
            r6.mConnectionType = r0
            r6.mEffectiveConnectionType = r1
            r6.mConnectivityDeprecated = r2
            r6.sendConnectivityChangedEvent()
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.netinfo.NetInfoModule.updateAndSendConnectionType():void");
    }

    @ReactMethod
    public void getCurrentConnectivity(Promise promise) {
        if (this.mNoNetworkPermission) {
            promise.reject(ERROR_MISSING_PERMISSION, MISSING_PERMISSION_MESSAGE);
        } else {
            promise.resolve(createConnectivityEventMap());
        }
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @ReactMethod
    public void isConnectionMetered(Promise promise) {
        if (this.mNoNetworkPermission) {
            promise.reject(ERROR_MISSING_PERMISSION, MISSING_PERMISSION_MESSAGE);
        } else {
            promise.resolve(Boolean.valueOf(C0078a.m268a(this.mConnectivityManager)));
        }
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        unregisterReceiver();
    }

    public void onHostResume() {
        registerReceiver();
    }
}
