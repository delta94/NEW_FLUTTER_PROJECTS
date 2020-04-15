package p000a.p005b.p009c.p018g;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* renamed from: a.b.c.g.G */
class C0115G implements AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C0120K f315a;

    /* renamed from: b */
    final /* synthetic */ View f316b;

    /* renamed from: c */
    final /* synthetic */ C0116H f317c;

    C0115G(C0116H h, C0120K k, View view) {
        this.f317c = h;
        this.f315a = k;
        this.f316b = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f315a.mo410a(this.f316b);
    }
}
