package com.swmansion.gesturehandler.react;

import android.view.MotionEvent;
import p032c.p115b.p116a.C1242c;
import p032c.p115b.p116a.C1251l;

/* renamed from: com.swmansion.gesturehandler.react.e */
class C1984e implements C1251l {

    /* renamed from: a */
    final /* synthetic */ RNGestureHandlerModule f5895a;

    C1984e(RNGestureHandlerModule rNGestureHandlerModule) {
        this.f5895a = rNGestureHandlerModule;
    }

    /* renamed from: a */
    public void mo4664a(C1242c cVar, int i, int i2) {
        this.f5895a.onStateChange(cVar, i, i2);
    }

    /* renamed from: a */
    public void mo4665a(C1242c cVar, MotionEvent motionEvent) {
        this.f5895a.onTouchEvent(cVar, motionEvent);
    }
}
