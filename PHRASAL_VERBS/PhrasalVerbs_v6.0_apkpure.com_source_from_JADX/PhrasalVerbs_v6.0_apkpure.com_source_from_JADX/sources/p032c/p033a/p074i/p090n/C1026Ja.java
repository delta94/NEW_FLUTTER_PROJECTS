package p032c.p033a.p074i.p090n;

import p032c.p033a.p038c.p045g.C0741j;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p086j.C0988d;

/* renamed from: c.a.i.n.Ja */
class C1026Ja extends C1104wa<C0988d> {

    /* renamed from: f */
    final /* synthetic */ C0988d f3531f;

    /* renamed from: g */
    final /* synthetic */ C1028Ka f3532g;

    C1026Ja(C1028Ka ka, C1081n nVar, C1091qa qaVar, String str, String str2, C0988d dVar) {
        this.f3532g = ka;
        this.f3531f = dVar;
        super(nVar, qaVar, str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3461a(C0988d dVar) {
        C0988d.m4406b(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3460a(Exception exc) {
        C0988d.m4406b(this.f3531f);
        super.mo3460a(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0988d m4570b() {
        C0744b a;
        C0741j a2 = this.f3532g.f3536b.mo3501a();
        try {
            C1028Ka.m4584b(this.f3531f, a2);
            a = C0744b.m3334a(a2.mo3512m());
            C0988d dVar = new C0988d(a);
            dVar.mo4206c(this.f3531f);
            C0744b.m3336b(a);
            a2.close();
            return dVar;
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3463b(C0988d dVar) {
        C0988d.m4406b(this.f3531f);
        super.mo3463b(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo3464c() {
        C0988d.m4406b(this.f3531f);
        super.mo3464c();
    }
}
