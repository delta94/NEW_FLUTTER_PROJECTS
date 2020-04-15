package p032c.p033a.p074i.p082f;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p029v4.util.C0336m;
import com.facebook.imagepipeline.memory.C1293v;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p035b.p037b.C0689n;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p042d.C0725q;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p038c.p045g.C0737g;
import p032c.p033a.p074i.p075a.p076a.C0887a;
import p032c.p033a.p074i.p075a.p076a.C0888b;
import p032c.p033a.p074i.p079c.C0895a;
import p032c.p033a.p074i.p079c.C0896b;
import p032c.p033a.p074i.p079c.C0897c;
import p032c.p033a.p074i.p079c.C0899e;
import p032c.p033a.p074i.p079c.C0900f;
import p032c.p033a.p074i.p080d.C0910b;
import p032c.p033a.p074i.p080d.C0912d;
import p032c.p033a.p074i.p080d.C0920l;
import p032c.p033a.p074i.p080d.C0925q;
import p032c.p033a.p074i.p080d.C0933v;
import p032c.p033a.p074i.p080d.C0935x;
import p032c.p033a.p074i.p080d.C0937z;
import p032c.p033a.p074i.p084h.C0975c;
import p032c.p033a.p074i.p084h.C0976d;
import p032c.p033a.p074i.p085i.C0984a;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p088l.C0995a;
import p032c.p033a.p074i.p088l.C0997c;
import p032c.p033a.p074i.p088l.C0998d;
import p032c.p033a.p074i.p088l.C0999e;
import p032c.p033a.p074i.p090n.C1007Ca;

/* renamed from: c.a.i.f.o */
public class C0964o {

    /* renamed from: a */
    private static final Class<?> f3351a = C0964o.class;

    /* renamed from: b */
    private static C0964o f3352b;

    /* renamed from: c */
    private final C1007Ca f3353c;

    /* renamed from: d */
    private final C0956l f3354d;

    /* renamed from: e */
    private C0925q<C0657d, C0986b> f3355e;

    /* renamed from: f */
    private C0937z<C0657d, C0986b> f3356f;

    /* renamed from: g */
    private C0925q<C0657d, C0737g> f3357g;

    /* renamed from: h */
    private C0937z<C0657d, C0737g> f3358h;

    /* renamed from: i */
    private C0920l f3359i;

    /* renamed from: j */
    private C0689n f3360j;

    /* renamed from: k */
    private C0976d f3361k;

    /* renamed from: l */
    private C0954j f3362l;

    /* renamed from: m */
    private C0967r f3363m;

    /* renamed from: n */
    private C0968s f3364n;

    /* renamed from: o */
    private C0920l f3365o;

    /* renamed from: p */
    private C0689n f3366p;

    /* renamed from: q */
    private C0900f f3367q;

    /* renamed from: r */
    private C0999e f3368r;

    /* renamed from: s */
    private C0887a f3369s;

    public C0964o(C0956l lVar) {
        C0718j.m3240a(lVar);
        this.f3354d = lVar;
        this.f3353c = new C1007Ca(lVar.mo4092h().mo4064b());
    }

    /* renamed from: a */
    public static C0900f m4268a(C1293v vVar, C0999e eVar) {
        int i = VERSION.SDK_INT;
        return i >= 21 ? new C0895a(vVar.mo4782a()) : i >= 11 ? new C0899e(new C0896b(vVar.mo4786e()), eVar) : new C0897c();
    }

    /* renamed from: a */
    public static C0999e m4269a(C1293v vVar, boolean z) {
        int i = VERSION.SDK_INT;
        if (i < 21) {
            return (!z || i >= 19) ? new C0998d(vVar.mo4783b()) : new C0997c();
        }
        int c = vVar.mo4784c();
        return new C0995a(vVar.mo4782a(), c, new C0336m(c));
    }

    /* renamed from: a */
    public static synchronized void m4270a(C0956l lVar) {
        synchronized (C0964o.class) {
            if (f3352b != null) {
                C0727a.m3278c(f3351a, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            f3352b = new C0964o(lVar);
        }
    }

    /* renamed from: b */
    public static synchronized void m4271b(Context context) {
        synchronized (C0964o.class) {
            m4270a(C0956l.m4186a(context).mo4112a());
        }
    }

    /* renamed from: f */
    public static C0964o m4272f() {
        C0964o oVar = f3352b;
        C0718j.m3241a(oVar, (Object) "ImagePipelineFactory was not initialized!");
        return oVar;
    }

    /* renamed from: l */
    private C0887a m4273l() {
        if (this.f3369s == null) {
            this.f3369s = C0888b.m3966a(mo4136i(), this.f3354d.mo4092h(), mo4128a());
        }
        return this.f3369s;
    }

    /* renamed from: m */
    private C0976d m4274m() {
        C0976d dVar;
        C0976d dVar2;
        if (this.f3361k == null) {
            if (this.f3354d.mo4096l() != null) {
                this.f3361k = this.f3354d.mo4096l();
            } else {
                C0887a l = m4273l();
                if (l != null) {
                    dVar = l.mo3954a(this.f3354d.mo4086a());
                    dVar2 = l.mo3956b(this.f3354d.mo4086a());
                } else {
                    dVar2 = null;
                    dVar = null;
                }
                if (this.f3354d.mo4097m() == null) {
                    this.f3361k = new C0975c(dVar, dVar2, mo4137j());
                } else {
                    mo4137j();
                    this.f3354d.mo4097m().mo4183a();
                    throw null;
                }
            }
        }
        return this.f3361k;
    }

    /* renamed from: n */
    private C0967r m4275n() {
        if (this.f3363m == null) {
            this.f3363m = this.f3354d.mo4093i().mo4117d().mo4127a(this.f3354d.mo4090e(), this.f3354d.mo4102r().mo4788g(), m4274m(), this.f3354d.mo4103s(), this.f3354d.mo4107w(), this.f3354d.mo4108x(), this.f3354d.mo4093i().mo4122i(), this.f3354d.mo4092h(), this.f3354d.mo4102r().mo4786e(), mo4130b(), mo4132d(), mo4134g(), m4277p(), this.f3354d.mo4089d(), mo4136i(), this.f3354d.mo4093i().mo4116c(), this.f3354d.mo4093i().mo4115b(), this.f3354d.mo4093i().mo4114a());
        }
        return this.f3363m;
    }

    /* renamed from: o */
    private C0968s m4276o() {
        boolean z = VERSION.SDK_INT >= 24 && this.f3354d.mo4093i().mo4118e();
        if (this.f3364n == null) {
            C0968s sVar = new C0968s(this.f3354d.mo4090e().getApplicationContext().getContentResolver(), m4275n(), this.f3354d.mo4101q(), this.f3354d.mo4108x(), this.f3354d.mo4093i().mo4125l(), this.f3353c, this.f3354d.mo4093i().mo4119f(), z, this.f3354d.mo4093i().mo4124k(), this.f3354d.mo4106v());
            this.f3364n = sVar;
        }
        return this.f3364n;
    }

    /* renamed from: p */
    private C0920l m4277p() {
        if (this.f3365o == null) {
            C0920l lVar = new C0920l(mo4138k(), this.f3354d.mo4102r().mo4786e(), this.f3354d.mo4102r().mo4787f(), this.f3354d.mo4092h().mo4067e(), this.f3354d.mo4092h().mo4066d(), this.f3354d.mo4095k());
            this.f3365o = lVar;
        }
        return this.f3365o;
    }

    /* renamed from: a */
    public C0925q<C0657d, C0986b> mo4128a() {
        if (this.f3355e == null) {
            this.f3355e = C0910b.m4024a(this.f3354d.mo4087b(), this.f3354d.mo4100p(), this.f3354d.mo4088c());
        }
        return this.f3355e;
    }

    /* renamed from: a */
    public C0984a mo4129a(Context context) {
        C0887a l = m4273l();
        if (l == null) {
            return null;
        }
        return l.mo3955a(context);
    }

    /* renamed from: b */
    public C0937z<C0657d, C0986b> mo4130b() {
        if (this.f3356f == null) {
            this.f3356f = C0912d.m4029a(mo4128a(), this.f3354d.mo4095k());
        }
        return this.f3356f;
    }

    /* renamed from: c */
    public C0925q<C0657d, C0737g> mo4131c() {
        if (this.f3357g == null) {
            this.f3357g = C0933v.m4103a(this.f3354d.mo4091g(), this.f3354d.mo4100p());
        }
        return this.f3357g;
    }

    /* renamed from: d */
    public C0937z<C0657d, C0737g> mo4132d() {
        if (this.f3358h == null) {
            this.f3358h = C0935x.m4108a(mo4131c(), this.f3354d.mo4095k());
        }
        return this.f3358h;
    }

    /* renamed from: e */
    public C0954j mo4133e() {
        if (this.f3362l == null) {
            C0954j jVar = new C0954j(m4276o(), this.f3354d.mo4104t(), this.f3354d.mo4098n(), mo4130b(), mo4132d(), mo4134g(), m4277p(), this.f3354d.mo4089d(), this.f3353c, C0725q.m3252a(Boolean.valueOf(false)), this.f3354d.mo4093i().mo4123j());
            this.f3362l = jVar;
        }
        return this.f3362l;
    }

    /* renamed from: g */
    public C0920l mo4134g() {
        if (this.f3359i == null) {
            C0920l lVar = new C0920l(mo4135h(), this.f3354d.mo4102r().mo4786e(), this.f3354d.mo4102r().mo4787f(), this.f3354d.mo4092h().mo4067e(), this.f3354d.mo4092h().mo4066d(), this.f3354d.mo4095k());
            this.f3359i = lVar;
        }
        return this.f3359i;
    }

    /* renamed from: h */
    public C0689n mo4135h() {
        if (this.f3360j == null) {
            this.f3360j = this.f3354d.mo4094j().mo4068a(this.f3354d.mo4099o());
        }
        return this.f3360j;
    }

    /* renamed from: i */
    public C0900f mo4136i() {
        if (this.f3367q == null) {
            this.f3367q = m4268a(this.f3354d.mo4102r(), mo4137j());
        }
        return this.f3367q;
    }

    /* renamed from: j */
    public C0999e mo4137j() {
        if (this.f3368r == null) {
            this.f3368r = m4269a(this.f3354d.mo4102r(), this.f3354d.mo4093i().mo4125l());
        }
        return this.f3368r;
    }

    /* renamed from: k */
    public C0689n mo4138k() {
        if (this.f3366p == null) {
            this.f3366p = this.f3354d.mo4094j().mo4068a(this.f3354d.mo4105u());
        }
        return this.f3366p;
    }
}
