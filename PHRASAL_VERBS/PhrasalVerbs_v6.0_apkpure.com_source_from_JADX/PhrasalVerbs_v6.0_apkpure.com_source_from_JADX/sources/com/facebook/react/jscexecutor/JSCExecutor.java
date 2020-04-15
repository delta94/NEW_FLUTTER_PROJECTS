package com.facebook.react.jscexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.soloader.SoLoader;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
class JSCExecutor extends JavaScriptExecutor {
    static {
        SoLoader.m7253a("jscexecutor");
    }

    JSCExecutor(ReadableNativeMap readableNativeMap) {
        super(initHybrid(readableNativeMap));
    }

    private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    public String getName() {
        return "JSCExecutor";
    }
}
