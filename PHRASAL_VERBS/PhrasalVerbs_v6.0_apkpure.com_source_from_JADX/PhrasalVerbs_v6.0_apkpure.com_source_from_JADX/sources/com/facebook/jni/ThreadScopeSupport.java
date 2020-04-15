package com.facebook.jni;

import com.facebook.soloader.SoLoader;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class ThreadScopeSupport {
    static {
        SoLoader.m7253a("fb");
    }

    @C1137a
    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }

    private static native void runStdFunctionImpl(long j);
}
