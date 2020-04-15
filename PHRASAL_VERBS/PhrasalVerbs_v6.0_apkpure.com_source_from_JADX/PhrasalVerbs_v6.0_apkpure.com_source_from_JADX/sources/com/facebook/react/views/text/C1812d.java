package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;

/* renamed from: com.facebook.react.views.text.d */
public final class C1812d {
    /* renamed from: a */
    public static ColorStateList m6912a(Context context) {
        return m6913a(context, 16842904);
    }

    /* renamed from: a */
    private static ColorStateList m6913a(Context context, int i) {
        TypedArray typedArray = null;
        try {
            typedArray = context.getTheme().obtainStyledAttributes(new int[]{i});
            return typedArray.getColorStateList(0);
        } finally {
            if (typedArray != null) {
                typedArray.recycle();
            }
        }
    }

    /* renamed from: b */
    public static int m6914b(Context context) {
        return m6913a(context, 16842905).getDefaultColor();
    }

    /* renamed from: c */
    public static ColorStateList m6915c(Context context) {
        return m6913a(context, 16842906);
    }
}
