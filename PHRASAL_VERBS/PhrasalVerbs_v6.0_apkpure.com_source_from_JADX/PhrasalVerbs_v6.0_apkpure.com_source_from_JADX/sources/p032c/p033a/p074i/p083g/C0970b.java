package p032c.p033a.p074i.p083g;

import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p051d.C0765c;
import p032c.p033a.p074i.p087k.C0994c;
import p032c.p033a.p074i.p090n.C1051c;
import p032c.p033a.p074i.p090n.C1081n;
import p032c.p033a.p074i.p090n.C1082na;
import p032c.p033a.p074i.p090n.C1102va;
import p032c.p033a.p074i.p091o.C1113b;

/* renamed from: c.a.i.g.b */
public abstract class C0970b<T> extends C0765c<T> implements C1113b {

    /* renamed from: g */
    private final C1102va f3423g;

    /* renamed from: h */
    private final C0994c f3424h;

    protected C0970b(C1082na<T> naVar, C1102va vaVar, C0994c cVar) {
        this.f3423g = vaVar;
        this.f3424h = cVar;
        this.f3424h.mo3591a(vaVar.mo4322c(), this.f3423g.mo4316a(), this.f3423g.getId(), this.f3423g.mo4323d());
        naVar.mo4248a(m4356j(), vaVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m4355c(Throwable th) {
        if (super.mo3554a(th)) {
            this.f3424h.mo3592a(this.f3423g.mo4322c(), this.f3423g.getId(), th, this.f3423g.mo4323d());
        }
    }

    /* renamed from: j */
    private C1081n<T> m4356j() {
        return new C0969a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public synchronized void m4357k() {
        C0718j.m3247b(mo3560f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4174a(T t, int i) {
        boolean a = C1051c.m4687a(i);
        if (super.mo3553a(t, a) && a) {
            this.f3424h.mo3593a(this.f3423g.mo4322c(), this.f3423g.getId(), this.f3423g.mo4323d());
        }
    }

    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (!super.mo3555b()) {
            this.f3424h.mo3594b(this.f3423g.getId());
            this.f3423g.mo4328h();
        }
        return true;
    }
}
