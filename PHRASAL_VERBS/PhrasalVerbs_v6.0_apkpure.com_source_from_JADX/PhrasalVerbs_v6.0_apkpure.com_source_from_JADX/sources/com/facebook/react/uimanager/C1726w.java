package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: com.facebook.react.uimanager.w */
public class C1726w {
    /* renamed from: a */
    public static float m6665a(double d) {
        return m6668b((float) d);
    }

    /* renamed from: a */
    public static float m6666a(float f) {
        return f / C1654h.m6471b().density;
    }

    /* renamed from: a */
    public static float m6667a(float f, float f2) {
        DisplayMetrics b = C1654h.m6471b();
        float f3 = b.scaledDensity;
        float f4 = b.density;
        float f5 = f3 / f4;
        if (f2 >= 1.0f && f2 < f5) {
            f3 = f4 * f2;
        }
        return f * f3;
    }

    /* renamed from: b */
    public static float m6668b(float f) {
        return TypedValue.applyDimension(1, f, C1654h.m6471b());
    }

    /* renamed from: c */
    public static float m6669c(float f) {
        return m6667a(f, Float.NaN);
    }

    /* renamed from: d */
    public static float m6670d(float f) {
        return f / C1654h.m6466a().scaledDensity;
    }
}
