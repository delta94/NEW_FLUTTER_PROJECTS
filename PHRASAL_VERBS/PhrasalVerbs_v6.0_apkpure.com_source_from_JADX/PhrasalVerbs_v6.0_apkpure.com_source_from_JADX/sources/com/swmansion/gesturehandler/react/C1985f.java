package com.swmansion.gesturehandler.react;

import android.view.View;
import com.facebook.react.uimanager.C1582S;
import com.facebook.react.uimanager.C1719s;

/* renamed from: com.swmansion.gesturehandler.react.f */
class C1985f implements C1582S {

    /* renamed from: a */
    final /* synthetic */ int f5896a;

    /* renamed from: b */
    final /* synthetic */ RNGestureHandlerModule f5897b;

    C1985f(RNGestureHandlerModule rNGestureHandlerModule, int i) {
        this.f5897b = rNGestureHandlerModule;
        this.f5896a = i;
    }

    /* renamed from: a */
    public void mo4871a(C1719s sVar) {
        View b = sVar.mo6003b(this.f5896a);
        if (b instanceof C1980a) {
            ((C1980a) b).mo7015d();
        }
        synchronized (this.f5897b.mEnqueuedRootViewInit) {
            this.f5897b.mEnqueuedRootViewInit.remove(new Integer(this.f5896a));
        }
    }
}
