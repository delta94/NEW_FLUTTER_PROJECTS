package android.support.p029v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.B */
class C0341B extends Animation {

    /* renamed from: a */
    final /* synthetic */ C0342C f1008a;

    C0341B(C0342C c) {
        this.f1008a = c;
    }

    public void applyTransformation(float f, Transformation transformation) {
        C0342C c = this.f1008a;
        float f2 = c.f1050z;
        c.setAnimationProgress(f2 + ((-f2) * f));
        this.f1008a.mo1463a(f);
    }
}
