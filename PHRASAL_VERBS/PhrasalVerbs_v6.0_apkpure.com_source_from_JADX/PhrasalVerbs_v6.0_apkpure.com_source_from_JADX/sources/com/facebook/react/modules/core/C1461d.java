package com.facebook.react.modules.core;

import com.facebook.react.bridge.UiThreadUtil;

/* renamed from: com.facebook.react.modules.core.d */
class C1461d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1460c f4517a;

    /* renamed from: b */
    final /* synthetic */ DeviceEventManagerModule f4518b;

    C1461d(DeviceEventManagerModule deviceEventManagerModule, C1460c cVar) {
        this.f4518b = deviceEventManagerModule;
        this.f4517a = cVar;
    }

    public void run() {
        UiThreadUtil.assertOnUiThread();
        this.f4517a.mo4574b();
    }
}
