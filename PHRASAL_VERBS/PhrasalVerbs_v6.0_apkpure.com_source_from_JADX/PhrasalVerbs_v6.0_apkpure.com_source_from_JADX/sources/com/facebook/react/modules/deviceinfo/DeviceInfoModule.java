package com.facebook.react.modules.deviceinfo;

import android.content.Context;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import com.facebook.react.uimanager.C1654h;
import java.util.HashMap;
import java.util.Map;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "DeviceInfo")
public class DeviceInfoModule extends BaseJavaModule implements LifecycleEventListener {
    public static final String NAME = "DeviceInfo";
    private float mFontScale;
    private ReactApplicationContext mReactApplicationContext;

    public DeviceInfoModule(Context context) {
        this.mReactApplicationContext = null;
        C1654h.m6474b(context);
        this.mFontScale = context.getResources().getConfiguration().fontScale;
    }

    public DeviceInfoModule(ReactApplicationContext reactApplicationContext) {
        this((Context) reactApplicationContext);
        this.mReactApplicationContext = reactApplicationContext;
        this.mReactApplicationContext.addLifecycleEventListener(this);
    }

    public void emitUpdateDimensionsEvent() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext != null) {
            ((RCTDeviceEventEmitter) reactApplicationContext.getJSModule(RCTDeviceEventEmitter.class)).emit("didUpdateDimensions", C1654h.m6472b((double) this.mFontScale));
        }
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("Dimensions", C1654h.m6467a((double) this.mFontScale));
        return hashMap;
    }

    public String getName() {
        return NAME;
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
    }

    public void onHostResume() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext != null) {
            float f = reactApplicationContext.getResources().getConfiguration().fontScale;
            if (this.mFontScale != f) {
                this.mFontScale = f;
                emitUpdateDimensionsEvent();
            }
        }
    }
}
