package com.facebook.react.modules.statusbar;

import android.app.Activity;
import android.os.Build.VERSION;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.C1726w;
import java.util.Map;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "StatusBarManager")
public class StatusBarModule extends ReactContextBaseJavaModule {
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public Map<String, Object> getConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Activity currentActivity = getCurrentActivity();
        int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return C1397f.m5736a(HEIGHT_KEY, Float.valueOf(identifier > 0 ? C1726w.m6666a((float) reactApplicationContext.getResources().getDimensionPixelSize(identifier)) : 0.0f), DEFAULT_BACKGROUND_COLOR_KEY, (currentActivity == null || VERSION.SDK_INT < 21) ? "black" : String.format("#%06X", new Object[]{Integer.valueOf(currentActivity.getWindow().getStatusBarColor() & 16777215)}));
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void setColor(int i, boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C0727a.m3284d("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
            return;
        }
        if (VERSION.SDK_INT >= 21) {
            C1538b bVar = new C1538b(this, getReactApplicationContext(), currentActivity, z, i);
            UiThreadUtil.runOnUiThread(bVar);
        }
    }

    @ReactMethod
    public void setHidden(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C0727a.m3284d("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new C1541e(this, z, currentActivity));
        }
    }

    @ReactMethod
    public void setStyle(String str) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C0727a.m3284d("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
            return;
        }
        if (VERSION.SDK_INT >= 23) {
            UiThreadUtil.runOnUiThread(new C1542f(this, currentActivity, str));
        }
    }

    @ReactMethod
    public void setTranslucent(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C0727a.m3284d("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
            return;
        }
        if (VERSION.SDK_INT >= 21) {
            UiThreadUtil.runOnUiThread(new C1540d(this, getReactApplicationContext(), currentActivity, z));
        }
    }
}
