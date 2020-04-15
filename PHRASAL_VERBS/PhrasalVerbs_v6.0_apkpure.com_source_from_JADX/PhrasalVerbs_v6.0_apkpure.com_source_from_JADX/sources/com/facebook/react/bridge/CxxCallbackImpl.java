package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class CxxCallbackImpl implements Callback {
    @C1137a
    private final HybridData mHybridData;

    @C1137a
    private CxxCallbackImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void nativeInvoke(NativeArray nativeArray);

    public void invoke(Object... objArr) {
        nativeInvoke(Arguments.fromJavaArgs(objArr));
    }
}
