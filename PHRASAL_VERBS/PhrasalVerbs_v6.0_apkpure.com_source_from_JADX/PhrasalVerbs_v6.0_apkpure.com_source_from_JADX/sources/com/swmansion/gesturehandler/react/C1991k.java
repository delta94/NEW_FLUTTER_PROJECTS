package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.C1886h;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.swmansion.gesturehandler.react.k */
public class C1991k extends C1886h {

    /* renamed from: s */
    private C1989j f5909s;

    public C1991k(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C1989j jVar = this.f5909s;
        C1136a.m5053a(jVar);
        if (jVar.mo7031a(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public void mo7034e() {
        C1989j jVar = this.f5909s;
        if (jVar != null) {
            jVar.mo7032b();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5909s == null) {
            this.f5909s = new C1989j((ReactContext) getContext(), this);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        C1989j jVar = this.f5909s;
        C1136a.m5053a(jVar);
        jVar.mo7030a(z);
        super.requestDisallowInterceptTouchEvent(z);
    }
}
