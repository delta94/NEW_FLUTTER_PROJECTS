package p000a.p005b.p009c.p018g.p020b;

import android.view.animation.Interpolator;

/* renamed from: a.b.c.g.b.d */
abstract class C0132d implements Interpolator {

    /* renamed from: a */
    private final float[] f366a;

    /* renamed from: b */
    private final float f367b = (1.0f / ((float) (this.f366a.length - 1)));

    protected C0132d(float[] fArr) {
        this.f366a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f366a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = (float) min;
        float f3 = this.f367b;
        float f4 = (f - (f2 * f3)) / f3;
        float[] fArr2 = this.f366a;
        return fArr2[min] + (f4 * (fArr2[min + 1] - fArr2[min]));
    }
}
