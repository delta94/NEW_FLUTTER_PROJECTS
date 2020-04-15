package com.facebook.react.uimanager.p123c;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: com.facebook.react.uimanager.c.g */
class C1609g implements AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C1611i f4854a;

    /* renamed from: b */
    final /* synthetic */ C1610h f4855b;

    C1609g(C1610h hVar, C1611i iVar) {
        this.f4855b = hVar;
        this.f4854a = iVar;
    }

    public void onAnimationEnd(Animation animation) {
        this.f4854a.mo5847a();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
