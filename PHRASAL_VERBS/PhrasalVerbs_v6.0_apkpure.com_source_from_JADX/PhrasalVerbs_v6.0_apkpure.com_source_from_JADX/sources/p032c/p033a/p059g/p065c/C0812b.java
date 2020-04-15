package p032c.p033a.p059g.p065c;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p042d.C0715i;
import p032c.p033a.p038c.p042d.C0715i.C0716a;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p051d.C0768e;
import p032c.p033a.p059g.p064b.C0806b;
import p032c.p033a.p059g.p064b.C0806b.C0807a;
import p032c.p033a.p059g.p064b.C0808c;
import p032c.p033a.p059g.p064b.C0808c.C0809a;
import p032c.p033a.p059g.p064b.C0810d;
import p032c.p033a.p059g.p070g.C0868a;
import p032c.p033a.p059g.p070g.C0868a.C0869a;
import p032c.p033a.p059g.p071h.C0870a;
import p032c.p033a.p059g.p071h.C0871b;
import p032c.p033a.p059g.p071h.C0872c;

/* renamed from: c.a.g.c.b */
public abstract class C0812b<T, INFO> implements C0870a, C0807a, C0869a {

    /* renamed from: a */
    private static final Class<?> f2832a = C0812b.class;

    /* renamed from: b */
    private final C0808c f2833b = C0808c.m3586a();

    /* renamed from: c */
    private final C0806b f2834c;

    /* renamed from: d */
    private final Executor f2835d;

    /* renamed from: e */
    private C0810d f2836e;

    /* renamed from: f */
    private C0868a f2837f;

    /* renamed from: g */
    private C0819g<INFO> f2838g;

    /* renamed from: h */
    private C0820h f2839h;

    /* renamed from: i */
    private C0872c f2840i;

    /* renamed from: j */
    private Drawable f2841j;

    /* renamed from: k */
    private String f2842k;

    /* renamed from: l */
    private Object f2843l;

    /* renamed from: m */
    private boolean f2844m;

    /* renamed from: n */
    private boolean f2845n;

    /* renamed from: o */
    private boolean f2846o;

    /* renamed from: p */
    private boolean f2847p;

    /* renamed from: q */
    private boolean f2848q;

    /* renamed from: r */
    private String f2849r;

    /* renamed from: s */
    private C0768e<T> f2850s;

    /* renamed from: t */
    private T f2851t;

    /* renamed from: u */
    private Drawable f2852u;

    /* renamed from: v */
    private boolean f2853v = true;

    /* renamed from: c.a.g.c.b$a */
    private static class C0813a<INFO> extends C0821i<INFO> {
        private C0813a() {
        }

        /* renamed from: a */
        public static <INFO> C0813a<INFO> m3640a(C0819g<? super INFO> gVar, C0819g<? super INFO> gVar2) {
            C0813a<INFO> aVar = new C0813a<>();
            aVar.mo3719a(gVar);
            aVar.mo3719a(gVar2);
            return aVar;
        }
    }

    public C0812b(C0806b bVar, Executor executor, String str, Object obj) {
        this.f2834c = bVar;
        this.f2835d = executor;
        m3604c(str, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3599a(String str, C0768e<T> eVar, float f, boolean z) {
        if (!m3603a(str, eVar)) {
            m3602a("ignore_old_datasource @ onProgress", (Throwable) null);
            eVar.close();
            return;
        }
        if (!z) {
            this.f2840i.mo3849a(f, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3600a(String str, C0768e<T> eVar, T t, float f, boolean z, boolean z2) {
        if (!m3603a(str, eVar)) {
            m3605d("ignore_old_datasource @ onNewResult", t);
            mo3645e(t);
            eVar.close();
            return;
        }
        this.f2833b.mo3663a(z ? C0809a.ON_DATASOURCE_RESULT : C0809a.ON_DATASOURCE_RESULT_INT);
        try {
            Drawable a = mo3627a(t);
            T t2 = this.f2851t;
            Drawable drawable = this.f2852u;
            this.f2851t = t;
            this.f2852u = a;
            String str2 = "release_previous_result @ onNewResult";
            if (z) {
                try {
                    m3605d("set_final_result @ onNewResult", t);
                    this.f2850s = null;
                    this.f2840i.mo3852a(a, 1.0f, z2);
                    mo3685h().mo3588a(str, mo3643d(t), mo3684f());
                } catch (Throwable th) {
                    if (!(drawable == null || drawable == a)) {
                        mo3628a(drawable);
                    }
                    if (!(t2 == null || t2 == t)) {
                        m3605d(str2, t2);
                        mo3645e(t2);
                    }
                    throw th;
                }
            } else {
                m3605d("set_intermediate_result @ onNewResult", t);
                this.f2840i.mo3852a(a, f, z2);
                mo3685h().mo3587a(str, mo3643d(t));
            }
            if (!(drawable == null || drawable == a)) {
                mo3628a(drawable);
            }
            if (!(t2 == null || t2 == t)) {
                m3605d(str2, t2);
                mo3645e(t2);
            }
        } catch (Exception e) {
            m3605d("drawable_failed @ onNewResult", t);
            mo3645e(t);
            m3601a(str, eVar, (Throwable) e, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3601a(String str, C0768e<T> eVar, Throwable th, boolean z) {
        if (!m3603a(str, eVar)) {
            m3602a("ignore_old_datasource @ onFailure", th);
            eVar.close();
            return;
        }
        this.f2833b.mo3663a(z ? C0809a.ON_DATASOURCE_FAILURE : C0809a.ON_DATASOURCE_FAILURE_INT);
        if (z) {
            m3602a("final_failed @ onFailure", th);
            this.f2850s = null;
            this.f2847p = true;
            if (this.f2848q) {
                Drawable drawable = this.f2852u;
                if (drawable != null) {
                    this.f2840i.mo3852a(drawable, 1.0f, true);
                    mo3685h().mo3589a(this.f2842k, th);
                }
            }
            if (mo3649q()) {
                this.f2840i.mo3856a(th);
            } else {
                this.f2840i.mo3859b(th);
            }
            mo3685h().mo3589a(this.f2842k, th);
        } else {
            m3602a("intermediate_failed @ onFailure", th);
            mo3685h().mo3717b(this.f2842k, th);
        }
    }

    /* renamed from: a */
    private void m3602a(String str, Throwable th) {
        if (C0727a.m3269a(2)) {
            C0727a.m3262a(f2832a, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f2842k, str, th);
        }
    }

    /* renamed from: a */
    private boolean m3603a(String str, C0768e<T> eVar) {
        boolean z = true;
        if (eVar == null && this.f2850s == null) {
            return true;
        }
        if (!str.equals(this.f2842k) || eVar != this.f2850s || !this.f2845n) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private synchronized void m3604c(String str, Object obj) {
        this.f2833b.mo3663a(C0809a.ON_INIT_CONTROLLER);
        if (!this.f2853v && this.f2834c != null) {
            this.f2834c.mo3660a((C0807a) this);
        }
        this.f2844m = false;
        this.f2846o = false;
        mo3648p();
        this.f2848q = false;
        if (this.f2836e != null) {
            this.f2836e.mo3665a();
        }
        if (this.f2837f != null) {
            this.f2837f.mo3898a();
            this.f2837f.mo3899a((C0869a) this);
        }
        if (this.f2838g instanceof C0813a) {
            ((C0813a) this.f2838g).mo3718a();
        } else {
            this.f2838g = null;
        }
        this.f2839h = null;
        if (this.f2840i != null) {
            this.f2840i.reset();
            this.f2840i.mo3851a((Drawable) null);
            this.f2840i = null;
        }
        this.f2841j = null;
        if (C0727a.m3269a(2)) {
            C0727a.m3261a(f2832a, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f2842k, str);
        }
        this.f2842k = str;
        this.f2843l = obj;
    }

    /* renamed from: d */
    private void m3605d(String str, T t) {
        if (C0727a.m3269a(2)) {
            C0727a.m3273b(f2832a, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f2842k, str, mo3677b(t), Integer.valueOf(mo3641c(t)));
        }
    }

    /* renamed from: p */
    private void mo3648p() {
        boolean z = this.f2845n;
        this.f2845n = false;
        this.f2847p = false;
        C0768e<T> eVar = this.f2850s;
        if (eVar != null) {
            eVar.close();
            this.f2850s = null;
        }
        Drawable drawable = this.f2852u;
        if (drawable != null) {
            mo3628a(drawable);
        }
        if (this.f2849r != null) {
            this.f2849r = null;
        }
        this.f2852u = null;
        T t = this.f2851t;
        if (t != null) {
            m3605d("release", t);
            mo3645e(this.f2851t);
            this.f2851t = null;
        }
        if (z) {
            mo3685h().mo3584a(this.f2842k);
        }
    }

    /* renamed from: q */
    private boolean mo3649q() {
        if (this.f2847p) {
            C0810d dVar = this.f2836e;
            if (dVar != null && dVar.mo3669d()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Drawable mo3627a(T t);

    /* renamed from: a */
    public void mo3662a() {
        this.f2833b.mo3663a(C0809a.ON_RELEASE_CONTROLLER);
        C0810d dVar = this.f2836e;
        if (dVar != null) {
            dVar.mo3668c();
        }
        C0868a aVar = this.f2837f;
        if (aVar != null) {
            aVar.mo3902c();
        }
        C0872c cVar = this.f2840i;
        if (cVar != null) {
            cVar.reset();
        }
        mo3648p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3628a(Drawable drawable);

    /* renamed from: a */
    public void mo3670a(C0819g<? super INFO> gVar) {
        C0718j.m3240a(gVar);
        C0819g<INFO> gVar2 = this.f2838g;
        if (gVar2 instanceof C0813a) {
            ((C0813a) gVar2).mo3719a(gVar);
        } else if (gVar2 != null) {
            this.f2838g = C0813a.m3640a(gVar2, gVar);
        } else {
            this.f2838g = gVar;
        }
    }

    /* renamed from: a */
    public void mo3671a(C0820h hVar) {
        this.f2839h = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3672a(C0868a aVar) {
        this.f2837f = aVar;
        C0868a aVar2 = this.f2837f;
        if (aVar2 != null) {
            aVar2.mo3899a((C0869a) this);
        }
    }

    /* renamed from: a */
    public void mo3633a(C0871b bVar) {
        if (C0727a.m3269a(2)) {
            C0727a.m3261a(f2832a, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f2842k, bVar);
        }
        this.f2833b.mo3663a(bVar != null ? C0809a.ON_SET_HIERARCHY : C0809a.ON_CLEAR_HIERARCHY);
        if (this.f2845n) {
            this.f2834c.mo3660a((C0807a) this);
            mo3662a();
        }
        C0872c cVar = this.f2840i;
        if (cVar != null) {
            cVar.mo3851a((Drawable) null);
            this.f2840i = null;
        }
        if (bVar != null) {
            C0718j.m3243a(bVar instanceof C0872c);
            this.f2840i = (C0872c) bVar;
            this.f2840i.mo3851a(this.f2841j);
        }
    }

    /* renamed from: a */
    public void mo3673a(String str) {
        this.f2849r = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3674a(String str, Object obj) {
        m3604c(str, obj);
        this.f2853v = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3675a(boolean z) {
        this.f2848q = z;
    }

    /* renamed from: a */
    public boolean mo3676a(MotionEvent motionEvent) {
        if (C0727a.m3269a(2)) {
            C0727a.m3261a(f2832a, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f2842k, motionEvent);
        }
        C0868a aVar = this.f2837f;
        if (aVar == null) {
            return false;
        }
        if (!aVar.mo3901b() && !mo3690n()) {
            return false;
        }
        this.f2837f.mo3900a(motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo3677b(T t) {
        return t != null ? t.getClass().getSimpleName() : "<null>";
    }

    /* renamed from: b */
    public void mo3678b() {
        if (C0727a.m3269a(2)) {
            C0727a.m3260a(f2832a, "controller %x %s: onDetach", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.f2842k);
        }
        this.f2833b.mo3663a(C0809a.ON_DETACH_CONTROLLER);
        this.f2844m = false;
        this.f2834c.mo3661b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3679b(Drawable drawable) {
        this.f2841j = drawable;
        C0872c cVar = this.f2840i;
        if (cVar != null) {
            cVar.mo3851a(this.f2841j);
        }
    }

    /* renamed from: b */
    public void mo3680b(C0819g<? super INFO> gVar) {
        C0718j.m3240a(gVar);
        C0819g<INFO> gVar2 = this.f2838g;
        if (gVar2 instanceof C0813a) {
            ((C0813a) gVar2).mo3720b(gVar);
            return;
        }
        if (gVar2 == gVar) {
            this.f2838g = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3639b(String str, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo3641c(T t) {
        return System.identityHashCode(t);
    }

    /* renamed from: c */
    public C0871b mo3681c() {
        return this.f2840i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract INFO mo3643d(T t);

    /* renamed from: d */
    public boolean mo3682d() {
        if (C0727a.m3269a(2)) {
            C0727a.m3260a(f2832a, "controller %x %s: onClick", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.f2842k);
        }
        if (!mo3649q()) {
            return false;
        }
        this.f2836e.mo3667b();
        this.f2840i.reset();
        mo3691o();
        return true;
    }

    /* renamed from: e */
    public void mo3683e() {
        if (C0727a.m3269a(2)) {
            C0727a.m3261a(f2832a, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f2842k, this.f2845n ? "request already submitted" : "request needs submit");
        }
        this.f2833b.mo3663a(C0809a.ON_ATTACH_CONTROLLER);
        C0718j.m3240a(this.f2840i);
        this.f2834c.mo3660a((C0807a) this);
        this.f2844m = true;
        if (!this.f2845n) {
            mo3691o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo3645e(T t);

    /* renamed from: f */
    public Animatable mo3684f() {
        Drawable drawable = this.f2852u;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public T mo3646g() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0819g<INFO> mo3685h() {
        C0819g<INFO> gVar = this.f2838g;
        return gVar == null ? C0818f.m3670a() : gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Drawable mo3686i() {
        return this.f2841j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract C0768e<T> mo3647j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0868a mo3687k() {
        return this.f2837f;
    }

    /* renamed from: l */
    public String mo3688l() {
        return this.f2842k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0810d mo3689m() {
        if (this.f2836e == null) {
            this.f2836e = new C0810d();
        }
        return this.f2836e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo3690n() {
        return mo3649q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo3691o() {
        Object g = mo3646g();
        if (g != null) {
            this.f2850s = null;
            this.f2845n = true;
            this.f2847p = false;
            this.f2833b.mo3663a(C0809a.ON_SUBMIT_CACHE_HIT);
            mo3685h().mo3590b(this.f2842k, this.f2843l);
            mo3639b(this.f2842k, g);
            m3600a(this.f2842k, this.f2850s, g, 1.0f, true, true);
            return;
        }
        this.f2833b.mo3663a(C0809a.ON_DATASOURCE_SUBMIT);
        mo3685h().mo3590b(this.f2842k, this.f2843l);
        this.f2840i.mo3849a(0.0f, true);
        this.f2845n = true;
        this.f2847p = false;
        this.f2850s = mo3647j();
        if (C0727a.m3269a(2)) {
            C0727a.m3261a(f2832a, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f2842k, Integer.valueOf(System.identityHashCode(this.f2850s)));
        }
        this.f2850s.mo3549a(new C0811a(this, this.f2842k, this.f2850s.mo3551a()), this.f2835d);
    }

    public String toString() {
        C0716a a = C0715i.m3230a((Object) this);
        a.mo3472a("isAttached", this.f2844m);
        a.mo3472a("isRequestSubmitted", this.f2845n);
        a.mo3472a("hasFetchFailed", this.f2847p);
        a.mo3470a("fetchedImage", mo3641c(this.f2851t));
        a.mo3471a("events", (Object) this.f2833b.toString());
        return a.toString();
    }
}
