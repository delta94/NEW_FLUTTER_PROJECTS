package p032c.p033a.p074i.p090n;

import java.util.Map;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p038c.p042d.C0712f;
import p032c.p033a.p038c.p045g.C0737g;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p080d.C0902A;
import p032c.p033a.p074i.p080d.C0921m;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c.C1116b;

/* renamed from: c.a.i.n.A */
public class C1001A implements C1082na<C0988d> {

    /* renamed from: a */
    private final C0902A<C0657d, C0737g> f3472a;

    /* renamed from: b */
    private final C0921m f3473b;

    /* renamed from: c */
    private final C1082na<C0988d> f3474c;

    /* renamed from: c.a.i.n.A$a */
    private static class C1002a extends C1094s<C0988d, C0988d> {

        /* renamed from: c */
        private final C0902A<C0657d, C0737g> f3475c;

        /* renamed from: d */
        private final C0657d f3476d;

        /* renamed from: e */
        private final boolean f3477e;

        public C1002a(C1081n<C0988d> nVar, C0902A<C0657d, C0737g> a, C0657d dVar, boolean z) {
            super(nVar);
            this.f3475c = a;
            this.f3476d = dVar;
            this.f3477e = z;
        }

        /* renamed from: a */
        public void mo4172b(C0988d dVar, int i) {
            if (!C1051c.m4689b(i) && dVar != null && !C1051c.m4688a(i, 10)) {
                C0744b n = dVar.mo4215n();
                if (n != null) {
                    C0744b bVar = null;
                    try {
                        if (this.f3477e) {
                            bVar = this.f3475c.mo3976a(this.f3476d, n);
                        }
                        if (bVar != null) {
                            try {
                                C0988d dVar2 = new C0988d(bVar);
                                dVar2.mo4206c(dVar);
                                try {
                                    mo4347c().mo4308a(1.0f);
                                    mo4347c().mo4310a(dVar2, i);
                                    return;
                                } finally {
                                    C0988d.m4406b(dVar2);
                                }
                            } finally {
                                C0744b.m3336b(bVar);
                            }
                        }
                    } finally {
                        C0744b.m3336b(n);
                    }
                }
            }
            mo4347c().mo4310a(dVar, i);
        }
    }

    public C1001A(C0902A<C0657d, C0737g> a, C0921m mVar, C1082na<C0988d> naVar) {
        this.f3472a = a;
        this.f3473b = mVar;
        this.f3474c = naVar;
    }

    /* renamed from: a */
    public void mo4248a(C1081n<C0988d> nVar, C1084oa oaVar) {
        C0988d dVar;
        String id = oaVar.getId();
        C1091qa e = oaVar.mo4324e();
        String str = "EncodedMemoryCacheProducer";
        e.mo4232a(id, str);
        C0657d c = this.f3473b.mo4020c(oaVar.mo4322c(), oaVar.mo4316a());
        C0744b bVar = this.f3472a.get(c);
        String str2 = "cached_value_found";
        Map map = null;
        if (bVar != null) {
            try {
                dVar = new C0988d(bVar);
                if (e.mo4236a(id)) {
                    map = C0712f.m3226a(str2, "true");
                }
                e.mo4237b(id, str, map);
                e.mo3595a(id, str, true);
                nVar.mo4308a(1.0f);
                nVar.mo4310a(dVar, 1);
                C0988d.m4406b(dVar);
                C0744b.m3336b(bVar);
            } catch (Throwable th) {
                C0744b.m3336b(bVar);
                throw th;
            }
        } else {
            String str3 = "false";
            if (oaVar.mo4326g().mo4377a() >= C1116b.ENCODED_MEMORY_CACHE.mo4377a()) {
                e.mo4237b(id, str, e.mo4236a(id) ? C0712f.m3226a(str2, str3) : null);
                e.mo3595a(id, str, false);
                nVar.mo4310a(null, 1);
                C0744b.m3336b(bVar);
                return;
            }
            C1002a aVar = new C1002a(nVar, this.f3472a, c, oaVar.mo4322c().mo4375r());
            if (e.mo4236a(id)) {
                map = C0712f.m3226a(str2, str3);
            }
            e.mo4237b(id, str, map);
            this.f3474c.mo4248a(aVar, oaVar);
            C0744b.m3336b(bVar);
        }
    }
}
