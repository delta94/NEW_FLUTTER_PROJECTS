package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import p032c.p033a.p059g.p068e.C0845t.C0846a;
import p032c.p033a.p059g.p068e.C0845t.C0847b;

/* renamed from: com.facebook.react.views.image.h */
public class C1756h extends C0846a {

    /* renamed from: a */
    public static final C0847b f5184a = new C1756h();

    /* renamed from: a */
    public void mo3834a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float min = Math.min(Math.min(f3, f4), 1.0f);
        float f5 = (float) rect.left;
        float f6 = (float) rect.top;
        matrix.setScale(min, min);
        matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
    }

    public String toString() {
        return "start_inside";
    }
}
