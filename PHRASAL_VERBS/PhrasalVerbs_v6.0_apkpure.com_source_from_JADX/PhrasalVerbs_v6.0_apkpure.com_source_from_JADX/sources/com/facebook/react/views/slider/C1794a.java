package com.facebook.react.views.slider;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p030v7.widget.C0627z;
import android.util.AttributeSet;

/* renamed from: com.facebook.react.views.slider.a */
public class C1794a extends C0627z {

    /* renamed from: b */
    private static int f5319b = 128;

    /* renamed from: c */
    private double f5320c = 0.0d;

    /* renamed from: d */
    private double f5321d = 0.0d;

    /* renamed from: e */
    private double f5322e = 0.0d;

    /* renamed from: f */
    private double f5323f = 0.0d;

    /* renamed from: g */
    private double f5324g = 0.0d;

    public C1794a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6870a();
    }

    /* renamed from: a */
    private void m6870a() {
        int i = VERSION.SDK_INT;
        if (i >= 23 && i < 26) {
            super.setStateListAnimator(null);
        }
    }

    /* renamed from: b */
    private void m6871b() {
        if (this.f5323f == 0.0d) {
            double d = this.f5321d - this.f5320c;
            double d2 = (double) f5319b;
            Double.isNaN(d2);
            this.f5324g = d / d2;
        }
        setMax(getTotalSteps());
        m6872c();
    }

    /* renamed from: c */
    private void m6872c() {
        double d = this.f5322e;
        double d2 = this.f5320c;
        double d3 = (d - d2) / (this.f5321d - d2);
        double totalSteps = (double) getTotalSteps();
        Double.isNaN(totalSteps);
        setProgress((int) Math.round(d3 * totalSteps));
    }

    private double getStepValue() {
        double d = this.f5323f;
        return d > 0.0d ? d : this.f5324g;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f5321d - this.f5320c) / getStepValue());
    }

    /* renamed from: a */
    public double mo6311a(int i) {
        if (i == getMax()) {
            return this.f5321d;
        }
        double d = (double) i;
        double stepValue = getStepValue();
        Double.isNaN(d);
        return (d * stepValue) + this.f5320c;
    }

    /* access modifiers changed from: 0000 */
    public void setMaxValue(double d) {
        this.f5321d = d;
        m6871b();
    }

    /* access modifiers changed from: 0000 */
    public void setMinValue(double d) {
        this.f5320c = d;
        m6871b();
    }

    /* access modifiers changed from: 0000 */
    public void setStep(double d) {
        this.f5323f = d;
        m6871b();
    }

    /* access modifiers changed from: 0000 */
    public void setValue(double d) {
        this.f5322e = d;
        m6872c();
    }
}
