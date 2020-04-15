package android.support.p029v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.app.u */
class C0295u extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f851a;

    /* renamed from: b */
    final /* synthetic */ View f852b;

    /* renamed from: c */
    final /* synthetic */ C0276j f853c;

    /* renamed from: d */
    final /* synthetic */ C0297w f854d;

    C0295u(C0297w wVar, ViewGroup viewGroup, View view, C0276j jVar) {
        this.f854d = wVar;
        this.f851a = viewGroup;
        this.f852b = view;
        this.f853c = jVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f851a.endViewTransition(this.f852b);
        animator.removeListener(this);
        View view = this.f853c.f764K;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
