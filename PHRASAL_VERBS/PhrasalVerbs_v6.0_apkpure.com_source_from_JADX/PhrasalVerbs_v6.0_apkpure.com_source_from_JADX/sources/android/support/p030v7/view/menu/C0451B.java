package android.support.p030v7.view.menu;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.view.menu.B */
class C0451B implements OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C0452C f1564a;

    C0451B(C0452C c) {
        this.f1564a = c;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f1564a.f1580q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1564a.f1580q = view.getViewTreeObserver();
            }
            C0452C c = this.f1564a;
            c.f1580q.removeGlobalOnLayoutListener(c.f1574k);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
