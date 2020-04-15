package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class CxxModuleWrapper extends CxxModuleWrapperBase {
    protected CxxModuleWrapper(HybridData hybridData) {
        super(hybridData);
    }

    public static CxxModuleWrapper makeDso(String str, String str2) {
        SoLoader.m7253a(str);
        return makeDsoNative(SoLoader.m7261c(str).getAbsolutePath(), str2);
    }

    private static native CxxModuleWrapper makeDsoNative(String str, String str2);
}
