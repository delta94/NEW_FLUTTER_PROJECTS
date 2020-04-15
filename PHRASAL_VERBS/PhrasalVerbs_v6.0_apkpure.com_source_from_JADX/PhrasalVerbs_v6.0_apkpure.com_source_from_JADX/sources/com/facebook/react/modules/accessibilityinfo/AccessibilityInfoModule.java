package com.facebook.react.modules.accessibilityinfo;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "AccessibilityInfo")
public class AccessibilityInfoModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private static final String EVENT_NAME = "touchExplorationDidChange";
    public static final String NAME = "AccessibilityInfo";
    private AccessibilityManager mAccessibilityManager;
    private boolean mEnabled = false;
    private C1437a mTouchExplorationStateChangeListener;

    @TargetApi(19)
    /* renamed from: com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule$a */
    private class C1437a implements TouchExplorationStateChangeListener {
        private C1437a() {
        }

        public void onTouchExplorationStateChanged(boolean z) {
            AccessibilityInfoModule.this.updateAndSendChangeEvent(z);
        }
    }

    public AccessibilityInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mAccessibilityManager = (AccessibilityManager) reactApplicationContext.getApplicationContext().getSystemService("accessibility");
        this.mEnabled = this.mAccessibilityManager.isTouchExplorationEnabled();
        if (VERSION.SDK_INT >= 19) {
            this.mTouchExplorationStateChangeListener = new C1437a();
        }
    }

    /* access modifiers changed from: private */
    public void updateAndSendChangeEvent(boolean z) {
        if (this.mEnabled != z) {
            this.mEnabled = z;
            ((RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit(EVENT_NAME, Boolean.valueOf(this.mEnabled));
        }
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        updateAndSendChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
    }

    @ReactMethod
    public void isTouchExplorationEnabled(Callback callback) {
        callback.invoke(Boolean.valueOf(this.mEnabled));
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        if (VERSION.SDK_INT >= 19) {
            this.mAccessibilityManager.removeTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
        }
    }

    public void onHostResume() {
        if (VERSION.SDK_INT >= 19) {
            this.mAccessibilityManager.addTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
        }
        updateAndSendChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
    }
}
