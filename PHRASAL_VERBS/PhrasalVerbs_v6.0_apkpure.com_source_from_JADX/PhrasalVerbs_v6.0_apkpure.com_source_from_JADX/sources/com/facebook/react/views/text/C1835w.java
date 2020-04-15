package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: com.facebook.react.views.text.w */
public class C1835w extends CharacterStyle implements C1825m {

    /* renamed from: a */
    private final float f5436a;

    /* renamed from: b */
    private final float f5437b;

    /* renamed from: c */
    private final float f5438c;

    /* renamed from: d */
    private final int f5439d;

    public C1835w(float f, float f2, float f3, int i) {
        this.f5436a = f;
        this.f5437b = f2;
        this.f5438c = f3;
        this.f5439d = i;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f5438c, this.f5436a, this.f5437b, this.f5439d);
    }
}
