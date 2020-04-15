package p032c.p033a.p074i.p090n;

import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.n.m */
public class C1078m implements C1082na<C0988d> {

    /* renamed from: a */
    private final C1082na<C0988d> f3658a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1082na<C0988d> f3659b;

    /* renamed from: c.a.i.n.m$a */
    private class C1079a extends C1094s<C0988d, C0988d> {

        /* renamed from: c */
        private C1084oa f3660c;

        private C1079a(C1081n<C0988d> nVar, C1084oa oaVar) {
            super(nVar);
            this.f3660c = oaVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4172b(C0988d dVar, int i) {
            C1114c c = this.f3660c.mo4322c();
            boolean a = C1051c.m4687a(i);
            boolean a2 = C1024Ia.m4561a(dVar, c.mo4369l());
            if (dVar != null && (a2 || c.mo4359d())) {
                if (!a || !a2) {
                    i = C1051c.m4691c(i, 1);
                }
                mo4347c().mo4310a(dVar, i);
            }
            if (a && !a2) {
                C0988d.m4406b(dVar);
                C1078m.this.f3659b.mo4248a(mo4347c(), this.f3660c);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo4173b(Throwable th) {
            C1078m.this.f3659b.mo4248a(mo4347c(), this.f3660c);
        }
    }

    public C1078m(C1082na<C0988d> naVar, C1082na<C0988d> naVar2) {
        this.f3658a = naVar;
        this.f3659b = naVar2;
    }

    /* renamed from: a */
    public void mo4248a(C1081n<C0988d> nVar, C1084oa oaVar) {
        this.f3658a.mo4248a(new C1079a(nVar, oaVar), oaVar);
    }
}
