package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
class JSCJavaScriptExecutor extends JavaScriptExecutor {
    static {
        ReactBridge.staticInit();
    }

    JSCJavaScriptExecutor(ReadableNativeMap readableNativeMap) {
        super(initHybrid(readableNativeMap));
    }

    private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    public String getName() {
        return "JSCJavaScriptExecutor";
    }
}
