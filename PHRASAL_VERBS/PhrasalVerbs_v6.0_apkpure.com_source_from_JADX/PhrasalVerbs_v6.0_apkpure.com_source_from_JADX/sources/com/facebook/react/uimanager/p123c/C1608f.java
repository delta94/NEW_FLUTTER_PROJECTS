package com.facebook.react.uimanager.p123c;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: com.facebook.react.uimanager.c.f */
class C1608f implements AnimationListener {

    /* renamed from: a */
    final /* synthetic */ int f4852a;

    /* renamed from: b */
    final /* synthetic */ C1610h f4853b;

    C1608f(C1610h hVar, int i) {
        this.f4853b = hVar;
        this.f4852a = i;
    }

    public void onAnimationEnd(Animation animation) {
        this.f4853b.f4859d.remove(this.f4852a);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        this.f4853b.f4859d.put(this.f4852a, (C1616n) animation);
    }
}
