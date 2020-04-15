package com.facebook.react.bridge.queue;

import com.facebook.jni.HybridData;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class NativeRunnable implements Runnable {
    private final HybridData mHybridData;

    @C1137a
    private NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void run();
}
