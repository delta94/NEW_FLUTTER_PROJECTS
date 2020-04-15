package p000a.p005b.p009c.p018g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: a.b.c.g.F */
class C0114F extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0118I f312a;

    /* renamed from: b */
    final /* synthetic */ View f313b;

    /* renamed from: c */
    final /* synthetic */ C0116H f314c;

    C0114F(C0116H h, C0118I i, View view) {
        this.f314c = h;
        this.f312a = i;
        this.f313b = view;
    }

    public void onAnimationCancel(Animator animator) {
        this.f312a.mo407a(this.f313b);
    }

    public void onAnimationEnd(Animator animator) {
        this.f312a.mo408b(this.f313b);
    }

    public void onAnimationStart(Animator animator) {
        this.f312a.mo409c(this.f313b);
    }
}
