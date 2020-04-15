package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class CxxModuleWrapperBase implements NativeModule {
    @C1137a
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    protected CxxModuleWrapperBase(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public boolean canOverrideExistingModule() {
        return false;
    }

    public native String getName();

    public void initialize() {
    }

    public void onCatalystInstanceDestroy() {
        this.mHybridData.mo4794a();
    }

    /* access modifiers changed from: protected */
    public void resetModule(HybridData hybridData) {
        HybridData hybridData2 = this.mHybridData;
        if (hybridData != hybridData2) {
            hybridData2.mo4794a();
            this.mHybridData = hybridData;
        }
    }
}
