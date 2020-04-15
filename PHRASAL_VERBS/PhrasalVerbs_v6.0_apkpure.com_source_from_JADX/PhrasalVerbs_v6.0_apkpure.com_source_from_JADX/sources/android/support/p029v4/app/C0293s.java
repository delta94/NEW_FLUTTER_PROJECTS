package android.support.p029v4.app;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: android.support.v4.app.s */
class C0293s extends C0299b {

    /* renamed from: b */
    final /* synthetic */ ViewGroup f844b;

    /* renamed from: c */
    final /* synthetic */ C0276j f845c;

    /* renamed from: d */
    final /* synthetic */ C0297w f846d;

    C0293s(C0297w wVar, AnimationListener animationListener, ViewGroup viewGroup, C0276j jVar) {
        this.f846d = wVar;
        this.f844b = viewGroup;
        this.f845c = jVar;
        super(animationListener);
    }

    public void onAnimationEnd(Animation animation) {
        super.onAnimationEnd(animation);
        this.f844b.post(new C0292r(this));
    }
}
