package p032c.p033a.p074i.p090n;

import p031b.C0640f;
import p031b.C0645k;
import p032c.p033a.p074i.p086j.C0988d;

/* renamed from: c.a.i.n.t */
class C1096t implements C0640f<C0988d, Void> {

    /* renamed from: a */
    final /* synthetic */ C1091qa f3694a;

    /* renamed from: b */
    final /* synthetic */ String f3695b;

    /* renamed from: c */
    final /* synthetic */ C1081n f3696c;

    /* renamed from: d */
    final /* synthetic */ C1084oa f3697d;

    /* renamed from: e */
    final /* synthetic */ C1101v f3698e;

    C1096t(C1101v vVar, C1091qa qaVar, String str, C1081n nVar, C1084oa oaVar) {
        this.f3698e = vVar;
        this.f3694a = qaVar;
        this.f3695b = str;
        this.f3696c = nVar;
        this.f3697d = oaVar;
    }

    /* renamed from: a */
    public Void m4894a(C0645k<C0988d> kVar) {
        String str = "DiskCacheProducer";
        if (C1101v.m4933b(kVar)) {
            this.f3694a.mo4235a(this.f3695b, str, null);
            this.f3696c.mo4307a();
        } else {
            if (kVar.mo3326f()) {
                this.f3694a.mo4234a(this.f3695b, str, kVar.mo3320a(), null);
            } else {
                C0988d dVar = (C0988d) kVar.mo3321b();
                if (dVar != null) {
                    C1091qa qaVar = this.f3694a;
                    String str2 = this.f3695b;
                    qaVar.mo4237b(str2, str, C1101v.m4929a(qaVar, str2, true, dVar.mo4223v()));
                    this.f3694a.mo3595a(this.f3695b, str, true);
                    this.f3696c.mo4308a(1.0f);
                    this.f3696c.mo4310a(dVar, 1);
                    dVar.close();
                } else {
                    C1091qa qaVar2 = this.f3694a;
                    String str3 = this.f3695b;
                    qaVar2.mo4237b(str3, str, C1101v.m4929a(qaVar2, str3, false, 0));
                }
            }
            this.f3698e.f3717d.mo4248a(this.f3696c, this.f3697d);
        }
        return null;
    }
}
