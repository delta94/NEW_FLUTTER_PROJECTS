package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    static {
        ReactBridge.staticInit();
    }

    public WritableNativeMap() {
        super(initHybrid());
    }

    private static native HybridData initHybrid();

    private native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private native void putNativeArray(String str, WritableNativeArray writableNativeArray);

    private native void putNativeMap(String str, WritableNativeMap writableNativeMap);

    public void merge(ReadableMap readableMap) {
        C1136a.m5056a(readableMap instanceof ReadableNativeMap, "Illegal type provided");
        mergeNativeMap((ReadableNativeMap) readableMap);
    }

    public void putArray(String str, WritableArray writableArray) {
        C1136a.m5056a(writableArray == null || (writableArray instanceof WritableNativeArray), "Illegal type provided");
        putNativeArray(str, (WritableNativeArray) writableArray);
    }

    public native void putBoolean(String str, boolean z);

    public native void putDouble(String str, double d);

    public native void putInt(String str, int i);

    public void putMap(String str, WritableMap writableMap) {
        C1136a.m5056a(writableMap == null || (writableMap instanceof WritableNativeMap), "Illegal type provided");
        putNativeMap(str, (WritableNativeMap) writableMap);
    }

    public native void putNull(String str);

    public native void putString(String str, String str2);
}
