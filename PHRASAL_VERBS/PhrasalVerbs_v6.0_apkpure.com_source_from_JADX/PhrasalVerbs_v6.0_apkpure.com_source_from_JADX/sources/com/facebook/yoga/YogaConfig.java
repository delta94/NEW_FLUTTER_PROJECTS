package com.facebook.yoga;

import com.facebook.soloader.SoLoader;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class YogaConfig {

    /* renamed from: a */
    long f5748a = jni_YGConfigNew();

    /* renamed from: b */
    private YogaNodeCloneFunction f5749b;

    static {
        SoLoader.m7253a("yoga");
    }

    public YogaConfig() {
        if (this.f5748a == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    @C1137a
    private final YogaNode cloneNode(YogaNode yogaNode, YogaNode yogaNode2, int i) {
        return this.f5749b.cloneNode(yogaNode, yogaNode2, i);
    }

    private native void jni_YGConfigFree(long j);

    private native long jni_YGConfigNew();

    private native void jni_YGConfigSetExperimentalFeatureEnabled(long j, int i, boolean z);

    private native void jni_YGConfigSetHasCloneNodeFunc(long j, boolean z);

    private native void jni_YGConfigSetLogger(long j, Object obj);

    private native void jni_YGConfigSetPointScaleFactor(long j, float f);

    private native void jni_YGConfigSetPrintTreeFlag(long j, boolean z);

    private native void jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(long j, boolean z);

    private native void jni_YGConfigSetUseLegacyStretchBehaviour(long j, boolean z);

    private native void jni_YGConfigSetUseWebDefaults(long j, boolean z);

    /* renamed from: a */
    public void mo6826a(float f) {
        jni_YGConfigSetPointScaleFactor(this.f5748a, f);
    }

    /* renamed from: a */
    public void mo6827a(boolean z) {
        jni_YGConfigSetUseLegacyStretchBehaviour(this.f5748a, z);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            jni_YGConfigFree(this.f5748a);
        } finally {
            super.finalize();
        }
    }
}
