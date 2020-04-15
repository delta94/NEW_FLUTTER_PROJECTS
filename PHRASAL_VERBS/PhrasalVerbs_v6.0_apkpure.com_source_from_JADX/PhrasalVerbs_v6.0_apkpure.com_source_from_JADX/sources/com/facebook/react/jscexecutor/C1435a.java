package com.facebook.react.jscexecutor;

import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.WritableNativeMap;

/* renamed from: com.facebook.react.jscexecutor.a */
public class C1435a implements JavaScriptExecutorFactory {

    /* renamed from: a */
    private final String f4462a;

    /* renamed from: b */
    private final String f4463b;

    public C1435a(String str, String str2) {
        this.f4462a = str;
        this.f4463b = str2;
    }

    public JavaScriptExecutor create() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.f4462a);
        writableNativeMap.putString("DeviceIdentity", this.f4463b);
        return new JSCExecutor(writableNativeMap);
    }

    public String toString() {
        return "JSIExecutor+JSCRuntime";
    }
}
