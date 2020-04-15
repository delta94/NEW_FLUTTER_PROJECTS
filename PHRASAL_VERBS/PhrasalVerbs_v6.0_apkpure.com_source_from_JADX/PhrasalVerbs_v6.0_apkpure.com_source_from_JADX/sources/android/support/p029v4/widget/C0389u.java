package android.support.p029v4.widget;

import android.support.p029v4.widget.C0342C.C0344b;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: android.support.v4.widget.u */
class C0389u implements AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C0342C f1259a;

    C0389u(C0342C c) {
        this.f1259a = c;
    }

    public void onAnimationEnd(Animation animation) {
        C0342C c = this.f1259a;
        if (c.f1029e) {
            c.f1014D.setAlpha(255);
            this.f1259a.f1014D.start();
            C0342C c2 = this.f1259a;
            if (c2.f1020J) {
                C0344b bVar = c2.f1028d;
                if (bVar != null) {
                    bVar.mo1501a();
                }
            }
            C0342C c3 = this.f1259a;
            c3.f1039o = c3.f1047w.getTop();
            return;
        }
        c.mo1467b();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
