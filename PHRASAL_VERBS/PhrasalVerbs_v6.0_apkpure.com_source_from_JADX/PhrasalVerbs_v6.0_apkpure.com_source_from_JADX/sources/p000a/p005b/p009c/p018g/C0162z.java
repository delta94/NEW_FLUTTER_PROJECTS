package p000a.p005b.p009c.p018g;

import android.view.animation.Interpolator;

/* renamed from: a.b.c.g.z */
class C0162z implements Interpolator {
    C0162z() {
    }

    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
