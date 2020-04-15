package p032c.p033a.p074i.p090n;

import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.n.P */
class C1034P extends C1104wa<C0988d> {

    /* renamed from: f */
    final /* synthetic */ C1114c f3554f;

    /* renamed from: g */
    final /* synthetic */ C1091qa f3555g;

    /* renamed from: h */
    final /* synthetic */ String f3556h;

    /* renamed from: i */
    final /* synthetic */ C1036S f3557i;

    C1034P(C1036S s, C1081n nVar, C1091qa qaVar, String str, String str2, C1114c cVar, C1091qa qaVar2, String str3) {
        this.f3557i = s;
        this.f3554f = cVar;
        this.f3555g = qaVar2;
        this.f3556h = str3;
        super(nVar, qaVar, str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3461a(C0988d dVar) {
        C0988d.m4406b(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0988d m4614b() {
        C0988d a = this.f3557i.mo4276a(this.f3554f);
        if (a == null) {
            this.f3555g.mo3595a(this.f3556h, this.f3557i.mo4277a(), false);
            return null;
        }
        a.mo4226y();
        this.f3555g.mo3595a(this.f3556h, this.f3557i.mo4277a(), true);
        return a;
    }
}
