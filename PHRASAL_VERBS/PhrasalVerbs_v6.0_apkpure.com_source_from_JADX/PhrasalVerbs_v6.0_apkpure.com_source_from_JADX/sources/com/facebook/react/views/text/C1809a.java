package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

@TargetApi(21)
/* renamed from: com.facebook.react.views.text.a */
public class C1809a extends MetricAffectingSpan implements C1825m {

    /* renamed from: a */
    private final float f5357a;

    public C1809a(float f) {
        this.f5357a = f;
    }

    /* renamed from: a */
    private void m6910a(TextPaint textPaint) {
        if (!Float.isNaN(this.f5357a)) {
            textPaint.setLetterSpacing(this.f5357a);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        m6910a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m6910a(textPaint);
    }
}
