package com.facebook.jni;

import com.facebook.soloader.SoLoader;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class Countable {
    @C1137a
    private long mInstance = 0;

    static {
        SoLoader.m7253a("fb");
    }

    public native void dispose();

    /* access modifiers changed from: protected */
    public void finalize() {
        dispose();
        super.finalize();
    }
}
