package android.support.p030v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.v7.widget.d */
class C0571d extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f2224a;

    C0571d(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f2224a = actionBarOverlayLayout;
    }

    public void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2224a;
        actionBarOverlayLayout.f1838x = null;
        actionBarOverlayLayout.f1826l = false;
    }

    public void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2224a;
        actionBarOverlayLayout.f1838x = null;
        actionBarOverlayLayout.f1826l = false;
    }
}
