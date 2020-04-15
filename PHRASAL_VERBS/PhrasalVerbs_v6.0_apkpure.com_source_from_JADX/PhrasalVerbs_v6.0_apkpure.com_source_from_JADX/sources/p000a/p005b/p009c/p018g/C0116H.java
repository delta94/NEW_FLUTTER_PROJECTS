package p000a.p005b.p009c.p018g;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: a.b.c.g.H */
public final class C0116H {

    /* renamed from: a */
    private WeakReference<View> f318a;

    /* renamed from: b */
    Runnable f319b = null;

    /* renamed from: c */
    Runnable f320c = null;

    /* renamed from: d */
    int f321d = -1;

    /* renamed from: a.b.c.g.H$a */
    static class C0117a implements C0118I {

        /* renamed from: a */
        C0116H f322a;

        /* renamed from: b */
        boolean f323b;

        C0117a(C0116H h) {
            this.f322a = h;
        }

        /* renamed from: a */
        public void mo407a(View view) {
            Object tag = view.getTag(2113929216);
            C0118I i = tag instanceof C0118I ? (C0118I) tag : null;
            if (i != null) {
                i.mo407a(view);
            }
        }

        /* renamed from: b */
        public void mo408b(View view) {
            int i = this.f322a.f321d;
            C0118I i2 = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f322a.f321d = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f323b) {
                C0116H h = this.f322a;
                Runnable runnable = h.f320c;
                if (runnable != null) {
                    h.f320c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof C0118I) {
                    i2 = (C0118I) tag;
                }
                if (i2 != null) {
                    i2.mo408b(view);
                }
                this.f323b = true;
            }
        }

        /* renamed from: c */
        public void mo409c(View view) {
            this.f323b = false;
            C0118I i = null;
            if (this.f322a.f321d > -1) {
                view.setLayerType(2, null);
            }
            C0116H h = this.f322a;
            Runnable runnable = h.f319b;
            if (runnable != null) {
                h.f319b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof C0118I) {
                i = (C0118I) tag;
            }
            if (i != null) {
                i.mo409c(view);
            }
        }
    }

    C0116H(View view) {
        this.f318a = new WeakReference<>(view);
    }

    /* renamed from: a */
    private void m375a(View view, C0118I i) {
        if (i != null) {
            view.animate().setListener(new C0114F(this, i, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C0116H mo397a(float f) {
        View view = (View) this.f318a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public C0116H mo398a(long j) {
        View view = (View) this.f318a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C0116H mo399a(C0118I i) {
        View view = (View) this.f318a.get();
        if (view != null) {
            if (VERSION.SDK_INT < 16) {
                view.setTag(2113929216, i);
                i = new C0117a(this);
            }
            m375a(view, i);
        }
        return this;
    }

    /* renamed from: a */
    public C0116H mo400a(C0120K k) {
        View view = (View) this.f318a.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            C0115G g = null;
            if (k != null) {
                g = new C0115G(this, k, view);
            }
            view.animate().setUpdateListener(g);
        }
        return this;
    }

    /* renamed from: a */
    public C0116H mo401a(Interpolator interpolator) {
        View view = (View) this.f318a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: a */
    public void mo402a() {
        View view = (View) this.f318a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: b */
    public long mo403b() {
        View view = (View) this.f318a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: b */
    public C0116H mo404b(float f) {
        View view = (View) this.f318a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: b */
    public C0116H mo405b(long j) {
        View view = (View) this.f318a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: c */
    public void mo406c() {
        View view = (View) this.f318a.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
