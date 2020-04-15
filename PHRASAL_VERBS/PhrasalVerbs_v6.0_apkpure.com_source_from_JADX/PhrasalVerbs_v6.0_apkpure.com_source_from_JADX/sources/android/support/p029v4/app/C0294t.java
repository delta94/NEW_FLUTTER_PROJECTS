package android.support.p029v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.app.t */
class C0294t extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f847a;

    /* renamed from: b */
    final /* synthetic */ View f848b;

    /* renamed from: c */
    final /* synthetic */ C0276j f849c;

    /* renamed from: d */
    final /* synthetic */ C0297w f850d;

    C0294t(C0297w wVar, ViewGroup viewGroup, View view, C0276j jVar) {
        this.f850d = wVar;
        this.f847a = viewGroup;
        this.f848b = view;
        this.f849c = jVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f847a.endViewTransition(this.f848b);
        Animator h = this.f849c.mo1039h();
        this.f849c.mo1001a((Animator) null);
        if (h != null && this.f847a.indexOfChild(this.f848b) < 0) {
            C0297w wVar = this.f850d;
            C0276j jVar = this.f849c;
            wVar.mo1181a(jVar, jVar.mo1067y(), 0, 0, false);
        }
    }
}
