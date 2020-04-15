package com.facebook.react.modules.statusbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.facebook.react.modules.statusbar.a */
class C1537a implements AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C1538b f4687a;

    C1537a(C1538b bVar) {
        this.f4687a = bVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4687a.f4688a.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
