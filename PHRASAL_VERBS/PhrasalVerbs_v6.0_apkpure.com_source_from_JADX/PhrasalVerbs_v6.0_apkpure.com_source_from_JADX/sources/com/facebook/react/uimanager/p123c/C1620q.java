package com.facebook.react.uimanager.p123c;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.facebook.react.uimanager.c.q */
class C1620q extends Animation implements C1616n {

    /* renamed from: a */
    private final View f4871a;

    /* renamed from: b */
    private float f4872b;

    /* renamed from: c */
    private float f4873c;

    /* renamed from: d */
    private float f4874d;

    /* renamed from: e */
    private float f4875e;

    /* renamed from: f */
    private int f4876f;

    /* renamed from: g */
    private int f4877g;

    /* renamed from: h */
    private int f4878h;

    /* renamed from: i */
    private int f4879i;

    public C1620q(View view, int i, int i2, int i3, int i4) {
        this.f4871a = view;
        m6373b(i, i2, i3, i4);
    }

    /* renamed from: b */
    private void m6373b(int i, int i2, int i3, int i4) {
        this.f4872b = this.f4871a.getX() - this.f4871a.getTranslationX();
        this.f4873c = this.f4871a.getY() - this.f4871a.getTranslationY();
        this.f4876f = this.f4871a.getWidth();
        this.f4877g = this.f4871a.getHeight();
        this.f4874d = ((float) i) - this.f4872b;
        this.f4875e = ((float) i2) - this.f4873c;
        this.f4878h = i3 - this.f4876f;
        this.f4879i = i4 - this.f4877g;
    }

    /* renamed from: a */
    public void mo5848a(int i, int i2, int i3, int i4) {
        m6373b(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f4872b + (this.f4874d * f);
        float f3 = this.f4873c + (this.f4875e * f);
        this.f4871a.layout(Math.round(f2), Math.round(f3), Math.round(f2 + ((float) this.f4876f) + (((float) this.f4878h) * f)), Math.round(f3 + ((float) this.f4877g) + (((float) this.f4879i) * f)));
    }

    public boolean willChangeBounds() {
        return true;
    }
}
