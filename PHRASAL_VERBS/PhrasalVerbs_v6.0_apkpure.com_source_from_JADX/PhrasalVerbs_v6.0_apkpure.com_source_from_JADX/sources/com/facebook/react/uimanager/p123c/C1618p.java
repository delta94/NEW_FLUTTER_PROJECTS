package com.facebook.react.uimanager.p123c;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;

/* renamed from: com.facebook.react.uimanager.c.p */
class C1618p extends Animation {

    /* renamed from: a */
    private final View f4866a;

    /* renamed from: b */
    private final float f4867b;

    /* renamed from: c */
    private final float f4868c;

    /* renamed from: com.facebook.react.uimanager.c.p$a */
    static class C1619a implements AnimationListener {

        /* renamed from: a */
        private final View f4869a;

        /* renamed from: b */
        private boolean f4870b = false;

        public C1619a(View view) {
            this.f4869a = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f4870b) {
                this.f4869a.setLayerType(0, null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            if (this.f4869a.hasOverlappingRendering() && this.f4869a.getLayerType() == 0) {
                this.f4870b = true;
                this.f4869a.setLayerType(2, null);
            }
        }
    }

    public C1618p(View view, float f, float f2) {
        this.f4866a = view;
        this.f4867b = f;
        this.f4868c = f2 - f;
        setAnimationListener(new C1619a(view));
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        this.f4866a.setAlpha(this.f4867b + (this.f4868c * f));
    }

    public boolean willChangeBounds() {
        return false;
    }
}
