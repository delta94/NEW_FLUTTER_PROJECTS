package com.facebook.react.modules.core;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "DeviceEventManager")
public class DeviceEventManagerModule extends ReactContextBaseJavaModule {
    public static final String NAME = "DeviceEventManager";
    private final Runnable mInvokeDefaultBackPressRunnable;

    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    public DeviceEventManagerModule(ReactApplicationContext reactApplicationContext, C1460c cVar) {
        super(reactApplicationContext);
        this.mInvokeDefaultBackPressRunnable = new C1461d(this, cVar);
    }

    public void emitHardwareBackPressed() {
        ((RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("hardwareBackPress", null);
    }

    public void emitNewIntentReceived(Uri uri) {
        WritableMap createMap = Arguments.createMap();
        String str = "url";
        createMap.putString(str, uri.toString());
        ((RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit(str, createMap);
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void invokeDefaultBackPressHandler() {
        getReactApplicationContext().runOnUiQueueThread(this.mInvokeDefaultBackPressRunnable);
    }
}
