package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public abstract class JavaScriptExecutor {
    private final HybridData mHybridData;

    protected JavaScriptExecutor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void close() {
        this.mHybridData.mo4794a();
    }

    public abstract String getName();
}
