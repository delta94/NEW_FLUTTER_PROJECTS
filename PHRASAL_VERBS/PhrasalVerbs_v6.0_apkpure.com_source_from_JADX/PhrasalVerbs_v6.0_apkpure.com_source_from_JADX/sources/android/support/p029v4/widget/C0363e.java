package android.support.p029v4.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* renamed from: android.support.v4.widget.e */
class C0363e implements AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ C0365a f1148a;

    /* renamed from: b */
    final /* synthetic */ C0364f f1149b;

    C0363e(C0364f fVar, C0365a aVar) {
        this.f1149b = fVar;
        this.f1148a = aVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
        this.f1149b.mo1655a(1.0f, this.f1148a, true);
        this.f1148a.mo1695l();
        this.f1148a.mo1693j();
        C0364f fVar = this.f1149b;
        if (fVar.f1158i) {
            fVar.f1158i = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            this.f1148a.mo1676a(false);
            return;
        }
        fVar.f1157h += 1.0f;
    }

    public void onAnimationStart(Animator animator) {
        this.f1149b.f1157h = 0.0f;
    }
}
