package android.support.p029v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.x */
class C0392x extends Animation {

    /* renamed from: a */
    final /* synthetic */ int f1262a;

    /* renamed from: b */
    final /* synthetic */ int f1263b;

    /* renamed from: c */
    final /* synthetic */ C0342C f1264c;

    C0392x(C0342C c, int i, int i2) {
        this.f1264c = c;
        this.f1262a = i;
        this.f1263b = i2;
    }

    public void applyTransformation(float f, Transformation transformation) {
        C0364f fVar = this.f1264c.f1014D;
        int i = this.f1262a;
        fVar.setAlpha((int) (((float) i) + (((float) (this.f1263b - i)) * f)));
    }
}
