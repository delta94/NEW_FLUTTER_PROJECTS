package p032c.p033a.p074i.p082f;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p044f.C0730a;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p038c.p050l.C0762c;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p090n.C1007Ca;
import p032c.p033a.p074i.p090n.C1013Fa;
import p032c.p033a.p074i.p090n.C1019Ha;
import p032c.p033a.p074i.p090n.C1054da;
import p032c.p033a.p074i.p090n.C1082na;
import p032c.p033a.p074i.p091o.C1114c;
import p032c.p033a.p074i.p091o.C1114c.C1116b;

/* renamed from: c.a.i.f.s */
public class C0968s {

    /* renamed from: a */
    private final ContentResolver f3396a;

    /* renamed from: b */
    private final C0967r f3397b;

    /* renamed from: c */
    private final C1054da f3398c;

    /* renamed from: d */
    private final boolean f3399d;

    /* renamed from: e */
    private final boolean f3400e;

    /* renamed from: f */
    private final boolean f3401f;

    /* renamed from: g */
    private final C1007Ca f3402g;

    /* renamed from: h */
    private final boolean f3403h;

    /* renamed from: i */
    private final boolean f3404i;

    /* renamed from: j */
    private final boolean f3405j;

    /* renamed from: k */
    C1082na<C0744b<C0986b>> f3406k;

    /* renamed from: l */
    C1082na<C0988d> f3407l;

    /* renamed from: m */
    C1082na<C0988d> f3408m;

    /* renamed from: n */
    C1082na<Void> f3409n;

    /* renamed from: o */
    C1082na<Void> f3410o;

    /* renamed from: p */
    private C1082na<C0988d> f3411p;

    /* renamed from: q */
    C1082na<C0744b<C0986b>> f3412q;

    /* renamed from: r */
    C1082na<C0744b<C0986b>> f3413r;

    /* renamed from: s */
    C1082na<C0744b<C0986b>> f3414s;

    /* renamed from: t */
    C1082na<C0744b<C0986b>> f3415t;

    /* renamed from: u */
    C1082na<C0744b<C0986b>> f3416u;

    /* renamed from: v */
    C1082na<C0744b<C0986b>> f3417v;

    /* renamed from: w */
    C1082na<C0744b<C0986b>> f3418w;

    /* renamed from: x */
    Map<C1082na<C0744b<C0986b>>, C1082na<C0744b<C0986b>>> f3419x = new HashMap();

    /* renamed from: y */
    Map<C1082na<C0744b<C0986b>>, C1082na<Void>> f3420y = new HashMap();

    /* renamed from: z */
    Map<C1082na<C0744b<C0986b>>, C1082na<C0744b<C0986b>>> f3421z = new HashMap();

    public C0968s(ContentResolver contentResolver, C0967r rVar, C1054da daVar, boolean z, boolean z2, C1007Ca ca, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f3396a = contentResolver;
        this.f3397b = rVar;
        this.f3398c = daVar;
        this.f3399d = z;
        this.f3400e = z2;
        this.f3402g = ca;
        this.f3403h = z3;
        this.f3404i = z4;
        this.f3401f = z5;
        this.f3405j = z6;
    }

    /* renamed from: a */
    private synchronized C1082na<C0988d> m4320a() {
        if (this.f3407l == null) {
            this.f3407l = this.f3397b.mo4141a(m4339g(this.f3397b.mo4154f()), this.f3402g);
        }
        return this.f3407l;
    }

    /* renamed from: a */
    private synchronized C1082na<C0744b<C0986b>> m4321a(C1082na<C0744b<C0986b>> naVar) {
        C1082na<C0744b<C0986b>> naVar2;
        naVar2 = (C1082na) this.f3421z.get(naVar);
        if (naVar2 == null) {
            naVar2 = this.f3397b.mo4153e(naVar);
            this.f3421z.put(naVar, naVar2);
        }
        return naVar2;
    }

    /* renamed from: a */
    private C1082na<C0744b<C0986b>> m4322a(C1082na<C0988d> naVar, C1019Ha<C0988d>[] haArr) {
        return m4332d(m4327b(m4339g(naVar), haArr));
    }

    /* renamed from: a */
    private C1082na<C0988d> m4323a(C1019Ha<C0988d>[] haArr) {
        return this.f3397b.mo4145a(this.f3397b.mo4142a(haArr), true, this.f3403h);
    }

    /* renamed from: a */
    private static String m4324a(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() <= 30) {
            return valueOf;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(valueOf.substring(0, 30));
        sb.append("...");
        return sb.toString();
    }

    /* renamed from: b */
    private synchronized C1082na<C0988d> m4325b() {
        if (this.f3408m == null) {
            this.f3408m = this.f3397b.mo4141a(m4328c(), this.f3402g);
        }
        return this.f3408m;
    }

    /* renamed from: b */
    private synchronized C1082na<C0744b<C0986b>> m4326b(C1082na<C0744b<C0986b>> naVar) {
        if (!this.f3419x.containsKey(naVar)) {
            this.f3419x.put(naVar, this.f3397b.mo4164l(this.f3397b.mo4165m(naVar)));
        }
        return (C1082na) this.f3419x.get(naVar);
    }

    /* renamed from: b */
    private C1082na<C0988d> m4327b(C1082na<C0988d> naVar, C1019Ha<C0988d>[] haArr) {
        C1013Fa o = this.f3397b.mo4166o(this.f3397b.mo4145a(C0967r.m4290a(naVar), true, this.f3403h));
        C0967r rVar = this.f3397b;
        return C0967r.m4291a(m4323a(haArr), (C1082na<C0988d>) o);
    }

    /* renamed from: c */
    private synchronized C1082na<C0988d> m4328c() {
        if (this.f3411p == null) {
            this.f3411p = C0967r.m4290a(m4339g(this.f3397b.mo4143a(this.f3398c)));
            this.f3411p = this.f3397b.mo4145a(this.f3411p, this.f3399d, this.f3403h);
        }
        return this.f3411p;
    }

    /* renamed from: c */
    private C1082na<C0744b<C0986b>> m4329c(C1082na<C0744b<C0986b>> naVar) {
        return this.f3397b.mo4147b(this.f3397b.mo4141a((C1082na<T>) this.f3397b.mo4149c(this.f3397b.mo4151d(naVar)), this.f3402g));
    }

    /* renamed from: c */
    private C1082na<C0744b<C0986b>> m4330c(C1114c cVar) {
        C0718j.m3240a(cVar);
        Uri o = cVar.mo4372o();
        C0718j.m3241a(o, (Object) "Uri is null.");
        int p = cVar.mo4373p();
        if (p == 0) {
            return m4343k();
        }
        switch (p) {
            case 2:
                return m4342j();
            case 3:
                return m4340h();
            case 4:
                return C0730a.m3314b(this.f3396a.getType(o)) ? m4342j() : m4336f();
            case 5:
                return m4334e();
            case 6:
                return m4341i();
            case 7:
                return m4331d();
            case 8:
                return m4345m();
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported uri scheme! Uri is: ");
                sb.append(m4324a(o));
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: d */
    private synchronized C1082na<C0744b<C0986b>> m4331d() {
        if (this.f3417v == null) {
            C1082na a = this.f3397b.mo4144a();
            if (C0762c.f2649a && (!this.f3400e || C0762c.f2652d == null)) {
                a = this.f3397b.mo4167p(a);
            }
            C0967r rVar = this.f3397b;
            this.f3417v = m4332d((C1082na<C0988d>) this.f3397b.mo4145a(C0967r.m4290a(a), true, this.f3403h));
        }
        return this.f3417v;
    }

    /* renamed from: d */
    private C1082na<C0744b<C0986b>> m4332d(C1082na<C0988d> naVar) {
        return m4329c((C1082na<C0744b<C0986b>>) this.f3397b.mo4155f(naVar));
    }

    /* renamed from: d */
    private static void m4333d(C1114c cVar) {
        C0718j.m3240a(cVar);
        C0718j.m3243a(cVar.mo4360e().mo4377a() <= C1116b.ENCODED_MEMORY_CACHE.mo4377a());
    }

    /* renamed from: e */
    private synchronized C1082na<C0744b<C0986b>> m4334e() {
        if (this.f3416u == null) {
            this.f3416u = m4335e(this.f3397b.mo4146b());
        }
        return this.f3416u;
    }

    /* renamed from: e */
    private C1082na<C0744b<C0986b>> m4335e(C1082na<C0988d> naVar) {
        return m4322a(naVar, new C1019Ha[]{this.f3397b.mo4152e()});
    }

    /* renamed from: f */
    private synchronized C1082na<C0744b<C0986b>> m4336f() {
        if (this.f3414s == null) {
            this.f3414s = m4322a(this.f3397b.mo4148c(), new C1019Ha[]{this.f3397b.mo4150d(), this.f3397b.mo4152e()});
        }
        return this.f3414s;
    }

    /* renamed from: f */
    private C1082na<C0988d> m4337f(C1082na<C0988d> naVar) {
        if (this.f3401f) {
            naVar = this.f3397b.mo4163k(naVar);
        }
        return this.f3397b.mo4157g(this.f3397b.mo4159h(naVar));
    }

    /* renamed from: g */
    private synchronized C1082na<Void> m4338g() {
        if (this.f3409n == null) {
            this.f3409n = C0967r.m4292n(m4320a());
        }
        return this.f3409n;
    }

    /* renamed from: g */
    private C1082na<C0988d> m4339g(C1082na<C0988d> naVar) {
        if (C0762c.f2649a && (!this.f3400e || C0762c.f2652d == null)) {
            naVar = this.f3397b.mo4167p(naVar);
        }
        if (this.f3405j) {
            naVar = m4337f(naVar);
        }
        return this.f3397b.mo4161i(this.f3397b.mo4162j(naVar));
    }

    /* renamed from: h */
    private synchronized C1082na<C0744b<C0986b>> m4340h() {
        if (this.f3412q == null) {
            this.f3412q = m4335e(this.f3397b.mo4154f());
        }
        return this.f3412q;
    }

    /* renamed from: i */
    private synchronized C1082na<C0744b<C0986b>> m4341i() {
        if (this.f3415t == null) {
            this.f3415t = m4335e(this.f3397b.mo4156g());
        }
        return this.f3415t;
    }

    /* renamed from: j */
    private synchronized C1082na<C0744b<C0986b>> m4342j() {
        if (this.f3413r == null) {
            this.f3413r = m4329c((C1082na<C0744b<C0986b>>) this.f3397b.mo4158h());
        }
        return this.f3413r;
    }

    /* renamed from: k */
    private synchronized C1082na<C0744b<C0986b>> m4343k() {
        if (this.f3406k == null) {
            this.f3406k = m4332d(m4328c());
        }
        return this.f3406k;
    }

    /* renamed from: l */
    private synchronized C1082na<Void> m4344l() {
        if (this.f3410o == null) {
            this.f3410o = C0967r.m4292n(m4325b());
        }
        return this.f3410o;
    }

    /* renamed from: m */
    private synchronized C1082na<C0744b<C0986b>> m4345m() {
        if (this.f3418w == null) {
            this.f3418w = m4335e(this.f3397b.mo4160i());
        }
        return this.f3418w;
    }

    /* renamed from: a */
    public C1082na<C0744b<C0986b>> mo4168a(C1114c cVar) {
        C1082na<C0744b<C0986b>> c = m4330c(cVar);
        if (cVar.mo4362f() != null) {
            c = m4326b(c);
        }
        return this.f3404i ? m4321a(c) : c;
    }

    /* renamed from: b */
    public C1082na<Void> mo4169b(C1114c cVar) {
        m4333d(cVar);
        int p = cVar.mo4373p();
        if (p == 0) {
            return m4344l();
        }
        if (p == 2 || p == 3) {
            return m4338g();
        }
        Uri o = cVar.mo4372o();
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported uri scheme for encoded image fetch! Uri is: ");
        sb.append(m4324a(o));
        throw new IllegalArgumentException(sb.toString());
    }
}
