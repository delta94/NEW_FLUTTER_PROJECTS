package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: com.facebook.react.views.text.c */
public class C1811c extends MetricAffectingSpan implements C1825m {

    /* renamed from: a */
    private final AssetManager f5359a;

    /* renamed from: b */
    private final int f5360b;

    /* renamed from: c */
    private final int f5361c;

    /* renamed from: d */
    private final String f5362d;

    public C1811c(int i, int i2, String str, AssetManager assetManager) {
        this.f5360b = i;
        this.f5361c = i2;
        this.f5362d = str;
        this.f5359a = assetManager;
    }

    /* renamed from: a */
    private static void m6911a(Paint paint, int i, int i2, String str, AssetManager assetManager) {
        Typeface typeface = paint.getTypeface();
        int i3 = 0;
        int style = typeface == null ? 0 : typeface.getStyle();
        if (i2 == 1 || ((style & 1) != 0 && i2 == -1)) {
            i3 = 1;
        }
        if (i == 2 || ((2 & style) != 0 && i == -1)) {
            i3 |= 2;
        }
        if (str != null) {
            typeface = C1821j.m6935a().mo6404a(str, i3, assetManager);
        } else if (typeface != null) {
            typeface = Typeface.create(typeface, i3);
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
        } else {
            paint.setTypeface(Typeface.defaultFromStyle(i3));
        }
        paint.setSubpixelText(true);
    }

    public void updateDrawState(TextPaint textPaint) {
        m6911a(textPaint, this.f5360b, this.f5361c, this.f5362d, this.f5359a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m6911a(textPaint, this.f5360b, this.f5361c, this.f5362d, this.f5359a);
    }
}
