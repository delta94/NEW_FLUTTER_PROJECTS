package com.facebook.react.modules.core;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p098m.p101c.C1173b;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "HeadlessJsTaskSupport")
public class HeadlessJsTaskSupportModule extends ReactContextBaseJavaModule {
    public static final String NAME = "HeadlessJsTaskSupport";

    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void notifyTaskFinished(int i) {
        C1173b a = C1173b.m5190a((ReactContext) getReactApplicationContext());
        if (a.mo4536b(i)) {
            a.mo4532a(i);
            return;
        }
        C0727a.m3280c(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i));
    }
}
