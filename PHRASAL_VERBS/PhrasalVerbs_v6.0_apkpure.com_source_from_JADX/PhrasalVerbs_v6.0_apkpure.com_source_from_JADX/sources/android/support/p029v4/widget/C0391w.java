package android.support.p029v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.w */
class C0391w extends Animation {

    /* renamed from: a */
    final /* synthetic */ C0342C f1261a;

    C0391w(C0342C c) {
        this.f1261a = c;
    }

    public void applyTransformation(float f, Transformation transformation) {
        this.f1261a.setAnimationProgress(1.0f - f);
    }
}
