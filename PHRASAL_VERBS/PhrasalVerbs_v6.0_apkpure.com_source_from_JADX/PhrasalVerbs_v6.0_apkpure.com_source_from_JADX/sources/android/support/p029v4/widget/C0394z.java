package android.support.p029v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.z */
class C0394z extends Animation {

    /* renamed from: a */
    final /* synthetic */ C0342C f1266a;

    C0394z(C0342C c) {
        this.f1266a = c;
    }

    public void applyTransformation(float f, Transformation transformation) {
        C0342C c = this.f1266a;
        int abs = !c.f1022L ? c.f1012B - Math.abs(c.f1011A) : c.f1012B;
        C0342C c2 = this.f1266a;
        int i = c2.f1049y;
        this.f1266a.setTargetOffsetTopAndBottom((i + ((int) (((float) (abs - i)) * f))) - c2.f1047w.getTop());
        this.f1266a.f1014D.mo1652a(1.0f - f);
    }
}
