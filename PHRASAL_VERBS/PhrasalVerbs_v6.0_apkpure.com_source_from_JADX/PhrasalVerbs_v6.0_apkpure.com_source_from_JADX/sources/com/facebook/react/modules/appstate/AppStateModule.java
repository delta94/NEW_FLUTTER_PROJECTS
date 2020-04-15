package com.facebook.react.modules.appstate;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import java.util.HashMap;
import java.util.Map;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "AppState")
public class AppStateModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String APP_STATE_ACTIVE = "active";
    public static final String APP_STATE_BACKGROUND = "background";
    private static final String INITIAL_STATE = "initialAppState";
    protected static final String NAME = "AppState";
    private String mAppState;

    public AppStateModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addLifecycleEventListener(this);
        this.mAppState = reactApplicationContext.getLifecycleState() == LifecycleState.RESUMED ? APP_STATE_ACTIVE : APP_STATE_BACKGROUND;
    }

    private WritableMap createAppStateEventMap() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("app_state", this.mAppState);
        return createMap;
    }

    private void sendAppStateChangeEvent() {
        ((RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("appStateDidChange", createAppStateEventMap());
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(INITIAL_STATE, this.mAppState);
        return hashMap;
    }

    @ReactMethod
    public void getCurrentAppState(Callback callback, Callback callback2) {
        callback.invoke(createAppStateEventMap());
    }

    public String getName() {
        return NAME;
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mAppState = APP_STATE_BACKGROUND;
        sendAppStateChangeEvent();
    }

    public void onHostResume() {
        this.mAppState = APP_STATE_ACTIVE;
        sendAppStateChangeEvent();
    }
}
