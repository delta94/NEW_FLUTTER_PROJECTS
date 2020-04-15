package com.swmansion.gesturehandler.react;

import android.os.Bundle;
import android.view.MotionEvent;
import p032c.p033a.p098m.C1145G;
import p032c.p033a.p098m.C1156P;

/* renamed from: com.swmansion.gesturehandler.react.a */
public class C1980a extends C1156P {

    /* renamed from: q */
    private C1145G f5889q;

    /* renamed from: r */
    private C1989j f5890r;

    /* renamed from: a */
    public void mo4474a(C1145G g, String str, Bundle bundle) {
        super.mo4474a(g, str, bundle);
        this.f5889q = g;
    }

    /* renamed from: d */
    public void mo7015d() {
        if (this.f5890r == null) {
            this.f5890r = new C1989j(this.f5889q.mo4426c(), this);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GestureHandler already initialized for root view ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C1989j jVar = this.f5890r;
        if (jVar == null || !jVar.mo7031a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: e */
    public void mo7017e() {
        C1989j jVar = this.f5890r;
        if (jVar != null) {
            jVar.mo7032b();
            this.f5890r = null;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        C1989j jVar = this.f5890r;
        if (jVar != null) {
            jVar.mo7030a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
