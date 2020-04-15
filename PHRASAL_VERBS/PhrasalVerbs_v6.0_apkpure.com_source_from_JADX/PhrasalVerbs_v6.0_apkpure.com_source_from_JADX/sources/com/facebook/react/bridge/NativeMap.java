package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public abstract class NativeMap {
    @C1137a
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    public NativeMap(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native String toString();
}
