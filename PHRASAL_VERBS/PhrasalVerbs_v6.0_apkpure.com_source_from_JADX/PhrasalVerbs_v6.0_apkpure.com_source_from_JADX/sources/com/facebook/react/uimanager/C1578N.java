package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.facebook.react.uimanager.N */
public class C1578N extends ReactContext {

    /* renamed from: a */
    private final ReactApplicationContext f4785a;

    public C1578N(ReactApplicationContext reactApplicationContext, Context context) {
        super(context);
        initializeWithInstance(reactApplicationContext.getCatalystInstance());
        this.f4785a = reactApplicationContext;
    }

    public void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f4785a.addLifecycleEventListener(lifecycleEventListener);
    }

    public Activity getCurrentActivity() {
        return this.f4785a.getCurrentActivity();
    }

    public boolean hasCurrentActivity() {
        return this.f4785a.hasCurrentActivity();
    }

    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f4785a.removeLifecycleEventListener(lifecycleEventListener);
    }
}
