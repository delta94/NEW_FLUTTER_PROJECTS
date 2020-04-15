package p032c.p033a.p059g.p069f;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p059g.p068e.C0829e;
import p032c.p033a.p059g.p068e.C0832h;
import p032c.p033a.p059g.p068e.C0833i;
import p032c.p033a.p059g.p068e.C0834j;
import p032c.p033a.p059g.p068e.C0844s;
import p032c.p033a.p059g.p068e.C0845t.C0847b;
import p032c.p033a.p059g.p071h.C0872c;

/* renamed from: c.a.g.f.a */
public class C0862a implements C0872c {

    /* renamed from: a */
    private final Drawable f3039a = new ColorDrawable(0);

    /* renamed from: b */
    private final Resources f3040b;

    /* renamed from: c */
    private C0865d f3041c;

    /* renamed from: d */
    private final C0864c f3042d;

    /* renamed from: e */
    private final C0832h f3043e;

    /* renamed from: f */
    private final C0833i f3044f;

    C0862a(C0863b bVar) {
        this.f3040b = bVar.mo3878o();
        this.f3041c = bVar.mo3881r();
        this.f3044f = new C0833i(this.f3039a);
        int i = 1;
        int size = (bVar.mo3872i() != null ? bVar.mo3872i().size() : 1) + (bVar.mo3875l() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[(size + 6)];
        drawableArr[0] = m3816b(bVar.mo3868e(), null);
        drawableArr[1] = m3816b(bVar.mo3873j(), bVar.mo3874k());
        drawableArr[2] = m3813a(this.f3044f, bVar.mo3867d(), bVar.mo3866c(), bVar.mo3865b());
        drawableArr[3] = m3816b(bVar.mo3876m(), bVar.mo3877n());
        drawableArr[4] = m3816b(bVar.mo3879p(), bVar.mo3880q());
        drawableArr[5] = m3816b(bVar.mo3870g(), bVar.mo3871h());
        if (size > 0) {
            if (bVar.mo3872i() != null) {
                i = 0;
                for (Drawable b : bVar.mo3872i()) {
                    int i2 = i + 1;
                    drawableArr[i + 6] = m3816b(b, null);
                    i = i2;
                }
            }
            if (bVar.mo3875l() != null) {
                drawableArr[i + 6] = m3816b(bVar.mo3875l(), null);
            }
        }
        this.f3043e = new C0832h(drawableArr);
        this.f3043e.mo3774e(bVar.mo3869f());
        this.f3042d = new C0864c(C0867e.m3879a((Drawable) this.f3043e, this.f3041c));
        this.f3042d.mutate();
        m3823e();
    }

    /* renamed from: a */
    private Drawable m3813a(Drawable drawable, C0847b bVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return C0867e.m3878a(drawable, bVar, pointF);
    }

    /* renamed from: a */
    private void m3814a(float f) {
        Drawable a = this.f3043e.mo3736a(3);
        if (a != null) {
            if (f >= 0.999f) {
                if (a instanceof Animatable) {
                    ((Animatable) a).stop();
                }
                m3819c(3);
            } else {
                if (a instanceof Animatable) {
                    ((Animatable) a).start();
                }
                m3817b(3);
            }
            a.setLevel(Math.round(f * 10000.0f));
        }
    }

    /* renamed from: a */
    private void m3815a(int i, Drawable drawable) {
        if (drawable == null) {
            this.f3043e.mo3737a(i, null);
            return;
        }
        m3820d(i).mo3734a(C0867e.m3880a(drawable, this.f3041c, this.f3040b));
    }

    /* renamed from: b */
    private Drawable m3816b(Drawable drawable, C0847b bVar) {
        return C0867e.m3877a(C0867e.m3880a(drawable, this.f3041c, this.f3040b), bVar);
    }

    /* renamed from: b */
    private void m3817b(int i) {
        if (i >= 0) {
            this.f3043e.mo3770c(i);
        }
    }

    /* renamed from: c */
    private void m3818c() {
        m3819c(1);
        m3819c(2);
        m3819c(3);
        m3819c(4);
        m3819c(5);
    }

    /* renamed from: c */
    private void m3819c(int i) {
        if (i >= 0) {
            this.f3043e.mo3772d(i);
        }
    }

    /* renamed from: d */
    private C0829e m3820d(int i) {
        C0829e b = this.f3043e.mo3741b(i);
        if (b.mo3733a() instanceof C0834j) {
            b = (C0834j) b.mo3733a();
        }
        return b.mo3733a() instanceof C0844s ? (C0844s) b.mo3733a() : b;
    }

    /* renamed from: d */
    private void m3821d() {
        this.f3044f.mo3734a(this.f3039a);
    }

    /* renamed from: e */
    private C0844s m3822e(int i) {
        C0829e d = m3820d(i);
        return d instanceof C0844s ? (C0844s) d : C0867e.m3882a(d, C0847b.f3021a);
    }

    /* renamed from: e */
    private void m3823e() {
        C0832h hVar = this.f3043e;
        if (hVar != null) {
            hVar.mo3768b();
            this.f3043e.mo3771d();
            m3818c();
            m3817b(1);
            this.f3043e.mo3773e();
            this.f3043e.mo3769c();
        }
    }

    /* renamed from: a */
    public Drawable mo3848a() {
        return this.f3042d;
    }

    /* renamed from: a */
    public void mo3849a(float f, boolean z) {
        if (this.f3043e.mo3736a(3) != null) {
            this.f3043e.mo3768b();
            m3814a(f);
            if (z) {
                this.f3043e.mo3773e();
            }
            this.f3043e.mo3769c();
        }
    }

    /* renamed from: a */
    public void mo3850a(int i) {
        this.f3043e.mo3774e(i);
    }

    /* renamed from: a */
    public void mo3851a(Drawable drawable) {
        this.f3042d.mo3882d(drawable);
    }

    /* renamed from: a */
    public void mo3852a(Drawable drawable, float f, boolean z) {
        Drawable a = C0867e.m3880a(drawable, this.f3041c, this.f3040b);
        a.mutate();
        this.f3044f.mo3734a(a);
        this.f3043e.mo3768b();
        m3818c();
        m3817b(2);
        m3814a(f);
        if (z) {
            this.f3043e.mo3773e();
        }
        this.f3043e.mo3769c();
    }

    /* renamed from: a */
    public void mo3853a(Drawable drawable, C0847b bVar) {
        m3815a(1, drawable);
        m3822e(1).mo3830a(bVar);
    }

    /* renamed from: a */
    public void mo3854a(C0847b bVar) {
        C0718j.m3240a(bVar);
        m3822e(2).mo3830a(bVar);
    }

    /* renamed from: a */
    public void mo3855a(C0865d dVar) {
        this.f3041c = dVar;
        C0867e.m3883a((C0829e) this.f3042d, this.f3041c);
        for (int i = 0; i < this.f3043e.mo3735a(); i++) {
            C0867e.m3884a(m3820d(i), this.f3041c, this.f3040b);
        }
    }

    /* renamed from: a */
    public void mo3856a(Throwable th) {
        this.f3043e.mo3768b();
        m3818c();
        if (this.f3043e.mo3736a(4) != null) {
            m3817b(4);
        } else {
            m3817b(1);
        }
        this.f3043e.mo3769c();
    }

    /* renamed from: b */
    public C0865d mo3857b() {
        return this.f3041c;
    }

    /* renamed from: b */
    public void mo3858b(Drawable drawable) {
        m3815a(0, drawable);
    }

    /* renamed from: b */
    public void mo3859b(Throwable th) {
        this.f3043e.mo3768b();
        m3818c();
        if (this.f3043e.mo3736a(5) != null) {
            m3817b(5);
        } else {
            m3817b(1);
        }
        this.f3043e.mo3769c();
    }

    public void reset() {
        m3821d();
        m3823e();
    }
}
