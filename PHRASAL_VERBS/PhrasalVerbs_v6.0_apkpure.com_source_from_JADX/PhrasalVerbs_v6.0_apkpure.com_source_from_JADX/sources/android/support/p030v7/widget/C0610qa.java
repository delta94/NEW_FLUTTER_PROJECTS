package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000a.p005b.p009c.p012b.C0061a;

/* renamed from: android.support.v7.widget.qa */
class C0610qa {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2364a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f2365b = {-16842910};

    /* renamed from: c */
    static final int[] f2366c = {16842908};

    /* renamed from: d */
    static final int[] f2367d = {16843518};

    /* renamed from: e */
    static final int[] f2368e = {16842919};

    /* renamed from: f */
    static final int[] f2369f = {16842912};

    /* renamed from: g */
    static final int[] f2370g = {16842913};

    /* renamed from: h */
    static final int[] f2371h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f2372i = new int[0];

    /* renamed from: j */
    private static final int[] f2373j = new int[1];

    /* renamed from: a */
    public static int m2898a(Context context, int i) {
        ColorStateList c = m2902c(context, i);
        if (c != null && c.isStateful()) {
            return c.getColorForState(f2365b, c.getDefaultColor());
        }
        TypedValue a = m2900a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m2899a(context, i, a.getFloat());
    }

    /* renamed from: a */
    static int m2899a(Context context, int i, float f) {
        int b = m2901b(context, i);
        return C0061a.m193b(b, Math.round(((float) Color.alpha(b)) * f));
    }

    /* renamed from: a */
    private static TypedValue m2900a() {
        TypedValue typedValue = (TypedValue) f2364a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f2364a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: b */
    public static int m2901b(Context context, int i) {
        int[] iArr = f2373j;
        iArr[0] = i;
        C0620va a = C0620va.m2919a(context, (AttributeSet) null, iArr);
        try {
            return a.mo3252a(0, 0);
        } finally {
            a.mo3255a();
        }
    }

    /* renamed from: c */
    public static ColorStateList m2902c(Context context, int i) {
        int[] iArr = f2373j;
        iArr[0] = i;
        C0620va a = C0620va.m2919a(context, (AttributeSet) null, iArr);
        try {
            return a.mo3253a(0);
        } finally {
            a.mo3255a();
        }
    }
}
