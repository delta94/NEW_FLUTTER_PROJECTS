package com.facebook.react.fabric.jsi;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import p032c.p033a.p096l.p097a.C1137a;

@SuppressLint({"MissingNativeLoadLibrary"})
public class EventEmitterWrapper {
    @C1137a
    private final HybridData mHybridData = initHybrid();

    static {
        C1423b.m5817a();
    }

    private EventEmitterWrapper() {
    }

    private static native HybridData initHybrid();

    private native void invokeEvent(String str, NativeMap nativeMap);
}
