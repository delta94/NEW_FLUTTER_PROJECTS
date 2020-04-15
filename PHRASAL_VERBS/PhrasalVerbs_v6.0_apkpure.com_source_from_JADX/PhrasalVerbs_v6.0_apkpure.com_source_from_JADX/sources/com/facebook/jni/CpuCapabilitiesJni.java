package com.facebook.jni;

import com.facebook.soloader.SoLoader;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class CpuCapabilitiesJni {
    static {
        SoLoader.m7253a("fb");
    }

    @C1137a
    public static native boolean nativeDeviceSupportsNeon();

    @C1137a
    public static native boolean nativeDeviceSupportsVFPFP16();

    @C1137a
    public static native boolean nativeDeviceSupportsX86();
}
