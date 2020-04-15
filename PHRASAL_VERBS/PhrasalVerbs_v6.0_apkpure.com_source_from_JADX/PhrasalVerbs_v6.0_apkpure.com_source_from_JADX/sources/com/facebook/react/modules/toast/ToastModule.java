package com.facebook.react.modules.toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.C1397f;
import java.util.HashMap;
import java.util.Map;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "ToastAndroid")
public class ToastModule extends ReactContextBaseJavaModule {
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public Map<String, Object> getConstants() {
        HashMap b = C1397f.m5742b();
        b.put(DURATION_SHORT_KEY, Integer.valueOf(0));
        b.put(DURATION_LONG_KEY, Integer.valueOf(1));
        b.put(GRAVITY_TOP_KEY, Integer.valueOf(49));
        b.put(GRAVITY_BOTTOM_KEY, Integer.valueOf(81));
        b.put(GRAVITY_CENTER, Integer.valueOf(17));
        return b;
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void show(String str, int i) {
        UiThreadUtil.runOnUiThread(new C1560a(this, str, i));
    }

    @ReactMethod
    public void showWithGravity(String str, int i, int i2) {
        UiThreadUtil.runOnUiThread(new C1561b(this, str, i, i2));
    }

    @ReactMethod
    public void showWithGravityAndOffset(String str, int i, int i2, int i3, int i4) {
        C1562c cVar = new C1562c(this, str, i, i2, i3, i4);
        UiThreadUtil.runOnUiThread(cVar);
    }
}
