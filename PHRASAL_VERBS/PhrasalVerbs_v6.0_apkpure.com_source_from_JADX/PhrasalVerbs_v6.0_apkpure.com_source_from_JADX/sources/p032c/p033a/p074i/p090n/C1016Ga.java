package p032c.p033a.p074i.p090n;

import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p074i.p081e.C0942e;
import p032c.p033a.p074i.p086j.C0988d;

/* renamed from: c.a.i.n.Ga */
public class C1016Ga implements C1082na<C0988d> {

    /* renamed from: a */
    private final C1019Ha<C0988d>[] f3508a;

    /* renamed from: c.a.i.n.Ga$a */
    private class C1017a extends C1094s<C0988d, C0988d> {

        /* renamed from: c */
        private final C1084oa f3509c;

        /* renamed from: d */
        private final int f3510d;

        /* renamed from: e */
        private final C0942e f3511e = this.f3509c.mo4322c().mo4369l();

        public C1017a(C1081n<C0988d> nVar, C1084oa oaVar, int i) {
            super(nVar);
            this.f3509c = oaVar;
            this.f3510d = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4172b(C0988d dVar, int i) {
            if (dVar != null && (C1051c.m4689b(i) || C1024Ia.m4561a(dVar, this.f3511e))) {
                mo4347c().mo4310a(dVar, i);
            } else if (C1051c.m4687a(i)) {
                C0988d.m4406b(dVar);
                if (!C1016Ga.this.m4539a(this.f3510d + 1, mo4347c(), this.f3509c)) {
                    mo4347c().mo4310a(null, 1);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo4173b(Throwable th) {
            if (!C1016Ga.this.m4539a(this.f3510d + 1, mo4347c(), this.f3509c)) {
                mo4347c().mo4311a(th);
            }
        }
    }

    public C1016Ga(C1019Ha<C0988d>... haArr) {
        C0718j.m3240a(haArr);
        this.f3508a = (C1019Ha[]) haArr;
        C0718j.m3238a(0, this.f3508a.length);
    }

    /* renamed from: a */
    private int m4538a(int i, C0942e eVar) {
        while (true) {
            C1019Ha<C0988d>[] haArr = this.f3508a;
            if (i >= haArr.length) {
                return -1;
            }
            if (haArr[i].mo4270a(eVar)) {
                return i;
            }
            i++;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m4539a(int i, C1081n<C0988d> nVar, C1084oa oaVar) {
        int a = m4538a(i, oaVar.mo4322c().mo4369l());
        if (a == -1) {
            return false;
        }
        this.f3508a[a].mo4248a(new C1017a(nVar, oaVar, a), oaVar);
        return true;
    }

    /* renamed from: a */
    public void mo4248a(C1081n<C0988d> nVar, C1084oa oaVar) {
        if (oaVar.mo4322c().mo4369l() == null || !m4539a(0, nVar, oaVar)) {
            nVar.mo4310a(null, 1);
        }
    }
}
