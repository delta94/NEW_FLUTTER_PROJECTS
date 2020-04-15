package com.facebook.react.modules.systeminfo;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.HashMap;
import java.util.Map;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "PlatformConstants")
@SuppressLint({"HardwareIds"})
public class AndroidInfoModule extends ReactContextBaseJavaModule {
    private static final String IS_TESTING = "IS_TESTING";
    public static final String NAME = "PlatformConstants";

    public AndroidInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private String uiMode() {
        int currentModeType = ((UiModeManager) getReactApplicationContext().getSystemService("uimode")).getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 2 ? currentModeType != 3 ? currentModeType != 4 ? currentModeType != 6 ? "unknown" : "watch" : "tv" : "car" : "desk" : "normal";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getAndroidID() {
        return Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
    }

    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("Version", Integer.valueOf(VERSION.SDK_INT));
        hashMap.put("Release", VERSION.RELEASE);
        hashMap.put("Serial", Build.SERIAL);
        hashMap.put("Fingerprint", Build.FINGERPRINT);
        hashMap.put("Model", Build.MODEL);
        String str = "isTesting";
        hashMap.put(str, Boolean.valueOf("true".equals(System.getProperty(IS_TESTING))));
        hashMap.put("reactNativeVersion", C1555b.f4728a);
        hashMap.put("uiMode", uiMode());
        return hashMap;
    }

    public String getName() {
        return NAME;
    }
}
