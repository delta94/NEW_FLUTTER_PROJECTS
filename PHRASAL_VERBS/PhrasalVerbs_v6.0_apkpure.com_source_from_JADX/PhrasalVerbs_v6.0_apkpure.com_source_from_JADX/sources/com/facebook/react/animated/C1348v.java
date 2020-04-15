package com.facebook.react.animated;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.C1458b.C1459a;
import com.facebook.react.modules.core.C1466i;
import com.facebook.react.modules.core.C1466i.C1467a;
import com.facebook.react.uimanager.C1683j;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.animated.v */
class C1348v extends C1683j {

    /* renamed from: c */
    final /* synthetic */ NativeAnimatedModule f4368c;

    C1348v(NativeAnimatedModule nativeAnimatedModule, ReactContext reactContext) {
        this.f4368c = nativeAnimatedModule;
        super(reactContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4870b(long j) {
        C1312H access$000 = this.f4368c.getNodesManager();
        if (access$000.mo4818a()) {
            access$000.mo4816a(j);
        }
        C1466i access$200 = this.f4368c.mReactChoreographer;
        C1136a.m5053a(access$200);
        access$200.mo5342a(C1467a.NATIVE_ANIMATED_MODULE, (C1459a) this.f4368c.mAnimatedFrameCallback);
    }
}
