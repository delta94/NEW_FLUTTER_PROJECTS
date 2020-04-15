package android.support.p029v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.v */
class C0390v extends Animation {

    /* renamed from: a */
    final /* synthetic */ C0342C f1260a;

    C0390v(C0342C c) {
        this.f1260a = c;
    }

    public void applyTransformation(float f, Transformation transformation) {
        this.f1260a.setAnimationProgress(f);
    }
}
