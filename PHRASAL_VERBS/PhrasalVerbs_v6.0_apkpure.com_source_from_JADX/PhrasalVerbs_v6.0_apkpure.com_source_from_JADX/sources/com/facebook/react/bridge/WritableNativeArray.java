package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class WritableNativeArray extends ReadableNativeArray implements WritableArray {
    static {
        ReactBridge.staticInit();
    }

    public WritableNativeArray() {
        super(initHybrid());
    }

    private static native HybridData initHybrid();

    private native void pushNativeArray(WritableNativeArray writableNativeArray);

    private native void pushNativeMap(WritableNativeMap writableNativeMap);

    public void pushArray(WritableArray writableArray) {
        C1136a.m5056a(writableArray == null || (writableArray instanceof WritableNativeArray), "Illegal type provided");
        pushNativeArray((WritableNativeArray) writableArray);
    }

    public native void pushBoolean(boolean z);

    public native void pushDouble(double d);

    public native void pushInt(int i);

    public void pushMap(WritableMap writableMap) {
        C1136a.m5056a(writableMap == null || (writableMap instanceof WritableNativeMap), "Illegal type provided");
        pushNativeMap((WritableNativeMap) writableMap);
    }

    public native void pushNull();

    public native void pushString(String str);
}
