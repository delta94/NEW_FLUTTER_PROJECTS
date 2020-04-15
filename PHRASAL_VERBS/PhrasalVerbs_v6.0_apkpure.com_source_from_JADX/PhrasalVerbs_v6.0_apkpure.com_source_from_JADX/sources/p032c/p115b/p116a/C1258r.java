package p032c.p115b.p116a;

import p032c.p115b.p116a.C1256q.C1257a;

/* renamed from: c.b.a.r */
class C1258r implements C1257a {

    /* renamed from: a */
    final /* synthetic */ C1259s f4116a;

    C1258r(C1259s sVar) {
        this.f4116a = sVar;
    }

    /* renamed from: a */
    public void mo4693a(C1256q qVar) {
        this.f4116a.mo4631d();
    }

    /* renamed from: b */
    public boolean mo4694b(C1256q qVar) {
        double a = this.f4116a.f4117A;
        C1259s.m5423a(this.f4116a, qVar.mo4691c());
        long d = qVar.mo4692d();
        if (d > 0) {
            C1259s sVar = this.f4116a;
            double a2 = sVar.f4117A - a;
            double d2 = (double) d;
            Double.isNaN(d2);
            sVar.f4118B = a2 / d2;
        }
        if (Math.abs(this.f4116a.f4117A) >= 0.08726646259971647d && this.f4116a.mo4640k() == 2) {
            this.f4116a.mo4615a();
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo4695c(C1256q qVar) {
        return true;
    }
}
