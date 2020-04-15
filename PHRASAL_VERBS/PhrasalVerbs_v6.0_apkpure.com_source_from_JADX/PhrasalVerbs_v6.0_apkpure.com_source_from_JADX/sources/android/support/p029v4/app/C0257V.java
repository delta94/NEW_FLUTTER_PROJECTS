package android.support.p029v4.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: android.support.v4.app.V */
class C0257V implements OnPreDrawListener, OnAttachStateChangeListener {

    /* renamed from: a */
    private final View f693a;

    /* renamed from: b */
    private ViewTreeObserver f694b;

    /* renamed from: c */
    private final Runnable f695c;

    private C0257V(View view, Runnable runnable) {
        this.f693a = view;
        this.f694b = view.getViewTreeObserver();
        this.f695c = runnable;
    }

    /* renamed from: a */
    public static C0257V m954a(View view, Runnable runnable) {
        C0257V v = new C0257V(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(v);
        view.addOnAttachStateChangeListener(v);
        return v;
    }

    /* renamed from: a */
    public void mo907a() {
        (this.f694b.isAlive() ? this.f694b : this.f693a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f693a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo907a();
        this.f695c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f694b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo907a();
    }
}
