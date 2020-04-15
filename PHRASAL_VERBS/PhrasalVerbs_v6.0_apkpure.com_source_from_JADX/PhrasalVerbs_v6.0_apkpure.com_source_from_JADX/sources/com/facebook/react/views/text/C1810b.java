package com.facebook.react.views.text;

import android.graphics.Paint.FontMetricsInt;
import android.text.style.LineHeightSpan;

/* renamed from: com.facebook.react.views.text.b */
public class C1810b implements LineHeightSpan, C1825m {

    /* renamed from: a */
    private final int f5358a;

    C1810b(float f) {
        this.f5358a = (int) Math.ceil((double) f);
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = this.f5358a;
        if (i5 > i6) {
            int min = Math.min(i6, i5);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
            return;
        }
        int i7 = fontMetricsInt.ascent;
        if ((-i7) + i5 > i6) {
            fontMetricsInt.bottom = i5;
            int i8 = (-i6) + i5;
            fontMetricsInt.ascent = i8;
            fontMetricsInt.top = i8;
            return;
        }
        int i9 = -i7;
        int i10 = fontMetricsInt.bottom;
        if (i9 + i10 > i6) {
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i7 + i6;
            return;
        }
        int i11 = fontMetricsInt.top;
        if ((-i11) + i10 > i6) {
            fontMetricsInt.top = i10 - i6;
            return;
        }
        double d = (double) i11;
        double d2 = (double) (((float) (i6 - ((-i11) + i10))) / 2.0f);
        double ceil = Math.ceil(d2);
        Double.isNaN(d);
        fontMetricsInt.top = (int) (d - ceil);
        double d3 = (double) fontMetricsInt.bottom;
        double floor = Math.floor(d2);
        Double.isNaN(d3);
        fontMetricsInt.bottom = (int) (d3 + floor);
        fontMetricsInt.ascent = fontMetricsInt.top;
        fontMetricsInt.descent = fontMetricsInt.bottom;
    }
}
