package android.support.p029v4.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: android.support.v4.widget.d */
class C0362d implements AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C0365a f1146a;

    /* renamed from: b */
    final /* synthetic */ C0364f f1147b;

    C0362d(C0364f fVar, C0365a aVar) {
        this.f1147b = fVar;
        this.f1146a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f1147b.mo1654a(floatValue, this.f1146a);
        this.f1147b.mo1655a(floatValue, this.f1146a, false);
        this.f1147b.invalidateSelf();
    }
}
