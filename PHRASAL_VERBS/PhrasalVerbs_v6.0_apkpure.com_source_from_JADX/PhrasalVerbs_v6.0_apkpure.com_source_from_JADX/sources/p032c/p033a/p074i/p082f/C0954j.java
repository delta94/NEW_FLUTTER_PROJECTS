package p032c.p033a.p074i.p082f;

import android.net.Uri;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p038c.p042d.C0719k;
import p032c.p033a.p038c.p042d.C0721m;
import p032c.p033a.p038c.p045g.C0737g;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p038c.p049k.C0758f;
import p032c.p033a.p051d.C0768e;
import p032c.p033a.p051d.C0770g;
import p032c.p033a.p074i.p080d.C0902A;
import p032c.p033a.p074i.p080d.C0920l;
import p032c.p033a.p074i.p080d.C0921m;
import p032c.p033a.p074i.p081e.C0941d;
import p032c.p033a.p074i.p083g.C0971c;
import p032c.p033a.p074i.p083g.C0972d;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p087k.C0993b;
import p032c.p033a.p074i.p087k.C0994c;
import p032c.p033a.p074i.p090n.C1007Ca;
import p032c.p033a.p074i.p090n.C1082na;
import p032c.p033a.p074i.p090n.C1102va;
import p032c.p033a.p074i.p091o.C1114c;
import p032c.p033a.p074i.p091o.C1114c.C1115a;
import p032c.p033a.p074i.p091o.C1114c.C1116b;
import p032c.p033a.p074i.p091o.C1117d;

/* renamed from: c.a.i.f.j */
public class C0954j {

    /* renamed from: a */
    private static final CancellationException f3260a = new CancellationException("Prefetching is not enabled");

    /* renamed from: b */
    private final C0968s f3261b;

    /* renamed from: c */
    private final C0994c f3262c;

    /* renamed from: d */
    private final C0721m<Boolean> f3263d;

    /* renamed from: e */
    private final C0902A<C0657d, C0986b> f3264e;

    /* renamed from: f */
    private final C0902A<C0657d, C0737g> f3265f;

    /* renamed from: g */
    private final C0920l f3266g;

    /* renamed from: h */
    private final C0920l f3267h;

    /* renamed from: i */
    private final C0921m f3268i;

    /* renamed from: j */
    private final C1007Ca f3269j;

    /* renamed from: k */
    private final C0721m<Boolean> f3270k;

    /* renamed from: l */
    private AtomicLong f3271l = new AtomicLong();

    /* renamed from: m */
    private final C0721m<Boolean> f3272m;

    public C0954j(C0968s sVar, Set<C0994c> set, C0721m<Boolean> mVar, C0902A<C0657d, C0986b> a, C0902A<C0657d, C0737g> a2, C0920l lVar, C0920l lVar2, C0921m mVar2, C1007Ca ca, C0721m<Boolean> mVar3, C0721m<Boolean> mVar4) {
        this.f3261b = sVar;
        this.f3262c = new C0993b(set);
        this.f3263d = mVar;
        this.f3264e = a;
        this.f3265f = a2;
        this.f3266g = lVar;
        this.f3267h = lVar2;
        this.f3268i = mVar2;
        this.f3269j = ca;
        this.f3270k = mVar3;
        this.f3272m = mVar4;
    }

    /* renamed from: a */
    private C0768e<Void> m4167a(C1082na<Void> naVar, C1114c cVar, C1116b bVar, Object obj, C0941d dVar) {
        C0994c a = m4169a(cVar, (C0994c) null);
        try {
            C1114c cVar2 = cVar;
            C1102va vaVar = new C1102va(cVar2, m4171f(), a, obj, C1116b.m4984a(cVar.mo4360e(), bVar), true, false, dVar);
            return C0972d.m4364a(naVar, vaVar, a);
        } catch (Exception e) {
            return C0770g.m3427b(e);
        }
    }

    /* renamed from: a */
    private <T> C0768e<C0744b<T>> m4168a(C1082na<C0744b<T>> naVar, C1114c cVar, C1116b bVar, Object obj, C0994c cVar2) {
        boolean z;
        C0994c a = m4169a(cVar, cVar2);
        try {
            C1116b a2 = C1116b.m4984a(cVar.mo4360e(), bVar);
            String f = m4171f();
            if (!cVar.mo4367j()) {
                if (C0758f.m3381i(cVar.mo4372o())) {
                    z = false;
                    C1102va vaVar = new C1102va(cVar, f, a, obj, a2, false, z, cVar.mo4366i());
                    return C0971c.m4359a(naVar, vaVar, a);
                }
            }
            z = true;
            C1102va vaVar2 = new C1102va(cVar, f, a, obj, a2, false, z, cVar.mo4366i());
            return C0971c.m4359a(naVar, vaVar2, a);
        } catch (Exception e) {
            return C0770g.m3427b(e);
        }
    }

    /* renamed from: a */
    private C0994c m4169a(C1114c cVar, C0994c cVar2) {
        if (cVar2 == null) {
            if (cVar.mo4368k() == null) {
                return this.f3262c;
            }
            return new C0993b(this.f3262c, cVar.mo4368k());
        } else if (cVar.mo4368k() == null) {
            return new C0993b(this.f3262c, cVar2);
        } else {
            return new C0993b(this.f3262c, cVar2, cVar.mo4368k());
        }
    }

    /* renamed from: c */
    private C0719k<C0657d> m4170c(Uri uri) {
        return new C0952h(this, uri);
    }

    /* renamed from: f */
    private String m4171f() {
        return String.valueOf(this.f3271l.getAndIncrement());
    }

    /* renamed from: a */
    public C0768e<C0744b<C0986b>> mo4072a(C1114c cVar, Object obj) {
        return mo4074a(cVar, obj, C1116b.FULL_FETCH);
    }

    /* renamed from: a */
    public C0768e<Void> mo4073a(C1114c cVar, Object obj, C0941d dVar) {
        if (!((Boolean) this.f3263d.get()).booleanValue()) {
            return C0770g.m3427b(f3260a);
        }
        try {
            return m4167a(this.f3261b.mo4169b(cVar), cVar, C1116b.FULL_FETCH, obj, dVar);
        } catch (Exception e) {
            return C0770g.m3427b(e);
        }
    }

    /* renamed from: a */
    public C0768e<C0744b<C0986b>> mo4074a(C1114c cVar, Object obj, C1116b bVar) {
        return mo4075a(cVar, obj, bVar, null);
    }

    /* renamed from: a */
    public C0768e<C0744b<C0986b>> mo4075a(C1114c cVar, Object obj, C1116b bVar, C0994c cVar2) {
        try {
            return m4168a(this.f3261b.mo4168a(cVar), cVar, bVar, obj, cVar2);
        } catch (Exception e) {
            return C0770g.m3427b(e);
        }
    }

    /* renamed from: a */
    public void mo4076a() {
        mo4083c();
        mo4081b();
    }

    /* renamed from: a */
    public boolean mo4077a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f3264e.mo3977b(m4170c(uri));
    }

    /* renamed from: a */
    public boolean mo4078a(Uri uri, C1115a aVar) {
        C1117d a = C1117d.m4986a(uri);
        a.mo4385a(aVar);
        return mo4079a(a.mo4378a());
    }

    /* renamed from: a */
    public boolean mo4079a(C1114c cVar) {
        C0920l lVar;
        C0657d c = this.f3268i.mo4020c(cVar, null);
        int i = C0953i.f3259a[cVar.mo4357b().ordinal()];
        if (i == 1) {
            lVar = this.f3266g;
        } else if (i != 2) {
            return false;
        } else {
            lVar = this.f3267h;
        }
        return lVar.mo4015b(c);
    }

    /* renamed from: b */
    public C0768e<Void> mo4080b(C1114c cVar, Object obj) {
        return mo4073a(cVar, obj, C0941d.MEDIUM);
    }

    /* renamed from: b */
    public void mo4081b() {
        this.f3266g.mo4014b();
        this.f3267h.mo4014b();
    }

    /* renamed from: b */
    public boolean mo4082b(Uri uri) {
        return mo4078a(uri, C1115a.SMALL) || mo4078a(uri, C1115a.DEFAULT);
    }

    /* renamed from: c */
    public void mo4083c() {
        C0951g gVar = new C0951g(this);
        this.f3264e.mo3975a(gVar);
        this.f3265f.mo3975a(gVar);
    }

    /* renamed from: d */
    public C0902A<C0657d, C0986b> mo4084d() {
        return this.f3264e;
    }

    /* renamed from: e */
    public C0921m mo4085e() {
        return this.f3268i;
    }
}
