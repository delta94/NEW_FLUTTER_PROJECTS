package com.facebook.react.fabric.jsi;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.queue.MessageQueueThread;
import p032c.p033a.p096l.p097a.C1137a;

@SuppressLint({"MissingNativeLoadLibrary"})
@C1137a
public class Binding {
    @C1137a
    private final HybridData mHybridData = initHybrid();

    static {
        C1423b.m5817a();
    }

    private static native HybridData initHybrid();

    private native void installFabricUIManager(long j, Object obj, EventBeatManager eventBeatManager, MessageQueueThread messageQueueThread, ComponentFactoryDelegate componentFactoryDelegate, Object obj2);

    private native void uninstallFabricUIManager();

    /* renamed from: a */
    public void mo5243a() {
        uninstallFabricUIManager();
    }

    public native void renderTemplateToSurface(int i, String str);

    public native void setConstraints(int i, float f, float f2, float f3, float f4);

    public native void setPixelDensity(float f);

    public native void startSurface(int i, NativeMap nativeMap);

    public native void stopSurface(int i);
}
