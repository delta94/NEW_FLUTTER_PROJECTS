package p032c.p033a.p074i.p090n;

import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.i.n.Ba */
public class C1005Ba<T> implements C1082na<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1082na<T> f3485a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1007Ca f3486b;

    public C1005Ba(C1082na<T> naVar, C1007Ca ca) {
        C0718j.m3240a(naVar);
        this.f3485a = naVar;
        this.f3486b = ca;
    }

    /* renamed from: a */
    public void mo4248a(C1081n<T> nVar, C1084oa oaVar) {
        C1091qa e = oaVar.mo4324e();
        String id = oaVar.getId();
        C1111za zaVar = new C1111za(this, nVar, e, "BackgroundThreadHandoffProducer", id, e, id, nVar, oaVar);
        oaVar.mo4319a(new C1003Aa(this, zaVar));
        this.f3486b.mo4262a(zaVar);
    }
}
