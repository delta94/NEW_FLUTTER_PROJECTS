package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout.C1623a;

/* renamed from: com.facebook.react.uimanager.Z */
class C1593Z implements C1623a {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f4809a;

    /* renamed from: b */
    final /* synthetic */ int f4810b;

    /* renamed from: c */
    final /* synthetic */ UIManagerModule f4811c;

    C1593Z(UIManagerModule uIManagerModule, ReactApplicationContext reactApplicationContext, int i) {
        this.f4811c = uIManagerModule;
        this.f4809a = reactApplicationContext;
        this.f4810b = i;
    }

    /* renamed from: a */
    public void mo5818a(int i, int i2, int i3, int i4) {
        ReactApplicationContext reactApplicationContext = this.f4809a;
        reactApplicationContext.runOnNativeModulesQueueThread(new C1592Y(this, reactApplicationContext, i, i2));
    }
}
