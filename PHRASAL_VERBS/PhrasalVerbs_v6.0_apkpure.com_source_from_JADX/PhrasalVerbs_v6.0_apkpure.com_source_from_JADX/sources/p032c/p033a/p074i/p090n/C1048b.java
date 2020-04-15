package p032c.p033a.p074i.p090n;

import p032c.p033a.p074i.p086j.C0988d;

/* renamed from: c.a.i.n.b */
public class C1048b implements C1082na<C0988d> {

    /* renamed from: a */
    private final C1082na<C0988d> f3584a;

    /* renamed from: c.a.i.n.b$a */
    private static class C1049a extends C1094s<C0988d, C0988d> {
        private C1049a(C1081n<C0988d> nVar) {
            super(nVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4172b(C0988d dVar, int i) {
            if (dVar == null) {
                mo4347c().mo4310a(null, i);
                return;
            }
            if (!C0988d.m4407d(dVar)) {
                dVar.mo4226y();
            }
            mo4347c().mo4310a(dVar, i);
        }
    }

    public C1048b(C1082na<C0988d> naVar) {
        this.f3584a = naVar;
    }

    /* renamed from: a */
    public void mo4248a(C1081n<C0988d> nVar, C1084oa oaVar) {
        this.f3584a.mo4248a(new C1049a(nVar), oaVar);
    }
}
