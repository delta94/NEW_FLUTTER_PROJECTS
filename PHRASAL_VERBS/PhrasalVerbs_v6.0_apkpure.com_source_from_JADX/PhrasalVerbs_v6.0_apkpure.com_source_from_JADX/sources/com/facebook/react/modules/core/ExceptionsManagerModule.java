package com.facebook.react.modules.core;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.C1394c;
import com.facebook.react.devsupport.p118a.C1408b;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p098m.p102d.p103a.C1176a;
import p032c.p033a.p098m.p111i.C1216a;

@C1176a(name = "ExceptionsManager")
public class ExceptionsManagerModule extends BaseJavaModule {
    public static final String NAME = "ExceptionsManager";
    private final C1408b mDevSupportManager;

    public ExceptionsManagerModule(C1408b bVar) {
        this.mDevSupportManager = bVar;
    }

    private void showOrThrowError(String str, ReadableArray readableArray, int i) {
        if (this.mDevSupportManager.mo5217b()) {
            this.mDevSupportManager.mo5213a(str, readableArray, i);
            return;
        }
        throw new C1394c(C1216a.m5211a(str, readableArray));
    }

    @ReactMethod
    public void dismissRedbox() {
        if (this.mDevSupportManager.mo5217b()) {
            this.mDevSupportManager.mo5218c();
        }
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void reportFatalException(String str, ReadableArray readableArray, int i) {
        showOrThrowError(str, readableArray, i);
    }

    @ReactMethod
    public void reportSoftException(String str, ReadableArray readableArray, int i) {
        if (this.mDevSupportManager.mo5217b()) {
            this.mDevSupportManager.mo5213a(str, readableArray, i);
            return;
        }
        C0727a.m3275b("ReactNative", C1216a.m5211a(str, readableArray));
    }

    @ReactMethod
    public void updateExceptionMessage(String str, ReadableArray readableArray, int i) {
        if (this.mDevSupportManager.mo5217b()) {
            this.mDevSupportManager.mo5216b(str, readableArray, i);
        }
    }
}
