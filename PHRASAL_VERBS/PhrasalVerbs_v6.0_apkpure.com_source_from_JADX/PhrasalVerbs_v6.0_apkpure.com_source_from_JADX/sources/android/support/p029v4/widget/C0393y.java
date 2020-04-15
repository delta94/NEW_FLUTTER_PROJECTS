package android.support.p029v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: android.support.v4.widget.y */
class C0393y implements AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C0342C f1265a;

    C0393y(C0342C c) {
        this.f1265a = c;
    }

    public void onAnimationEnd(Animation animation) {
        C0342C c = this.f1265a;
        if (!c.f1044t) {
            c.mo1464a((AnimationListener) null);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
