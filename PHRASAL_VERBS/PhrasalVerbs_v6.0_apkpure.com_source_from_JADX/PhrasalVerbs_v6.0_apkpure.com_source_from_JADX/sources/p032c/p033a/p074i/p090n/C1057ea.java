package p032c.p033a.p074i.p090n;

import p031b.C0640f;
import p031b.C0645k;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p074i.p081e.C0938a;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;
import p032c.p033a.p074i.p091o.C1117d;

/* renamed from: c.a.i.n.ea */
class C1057ea implements C0640f<C0988d, Void> {

    /* renamed from: a */
    final /* synthetic */ C1091qa f3601a;

    /* renamed from: b */
    final /* synthetic */ String f3602b;

    /* renamed from: c */
    final /* synthetic */ C1081n f3603c;

    /* renamed from: d */
    final /* synthetic */ C1084oa f3604d;

    /* renamed from: e */
    final /* synthetic */ C0657d f3605e;

    /* renamed from: f */
    final /* synthetic */ C1061ga f3606f;

    C1057ea(C1061ga gaVar, C1091qa qaVar, String str, C1081n nVar, C1084oa oaVar, C0657d dVar) {
        this.f3606f = gaVar;
        this.f3601a = qaVar;
        this.f3602b = str;
        this.f3603c = nVar;
        this.f3604d = oaVar;
        this.f3605e = dVar;
    }

    /* renamed from: a */
    public Void m4742a(C0645k<C0988d> kVar) {
        String str = "PartialDiskCacheProducer";
        if (C1061ga.m4756b(kVar)) {
            this.f3601a.mo4235a(this.f3602b, str, null);
            this.f3603c.mo4307a();
        } else if (kVar.mo3326f()) {
            this.f3601a.mo4234a(this.f3602b, str, kVar.mo3320a(), null);
            this.f3606f.m4753a(this.f3603c, this.f3604d, this.f3605e, (C0988d) null);
        } else {
            C0988d dVar = (C0988d) kVar.mo3321b();
            if (dVar != null) {
                C1091qa qaVar = this.f3601a;
                String str2 = this.f3602b;
                qaVar.mo4237b(str2, str, C1061ga.m4751a(qaVar, str2, true, dVar.mo4223v()));
                C0938a b = C0938a.m4127b(dVar.mo4223v() - 1);
                dVar.mo4204a(b);
                int v = dVar.mo4223v();
                C1114c c = this.f3604d.mo4322c();
                if (b.mo4038a(c.mo4356a())) {
                    this.f3601a.mo3595a(this.f3602b, str, true);
                    this.f3603c.mo4310a(dVar, 9);
                } else {
                    this.f3603c.mo4310a(dVar, 8);
                    C1117d a = C1117d.m4987a(c);
                    a.mo4379a(C0938a.m4125a(v - 1));
                    this.f3606f.m4753a(this.f3603c, (C1084oa) new C1102va(a.mo4378a(), this.f3604d), this.f3605e, dVar);
                }
            } else {
                C1091qa qaVar2 = this.f3601a;
                String str3 = this.f3602b;
                qaVar2.mo4237b(str3, str, C1061ga.m4751a(qaVar2, str3, false, 0));
                this.f3606f.m4753a(this.f3603c, this.f3604d, this.f3605e, dVar);
            }
        }
        return null;
    }
}
